package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.core.os.BuildCompat;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable
  implements Runnable
{
  static final String ACTION_FORCE_STOP_RESCHEDULE = "ACTION_FORCE_STOP_RESCHEDULE";
  private static final int ALARM_ID = -1;
  private static final long BACKOFF_DURATION_MS = 300L;
  static final int MAX_ATTEMPTS = 3;
  private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable");
  private static final long TEN_YEARS = TimeUnit.DAYS.toMillis(3650L);
  private final Context mContext;
  private int mRetryCount;
  private final WorkManagerImpl mWorkManager;
  
  public ForceStopRunnable(Context paramContext, WorkManagerImpl paramWorkManagerImpl)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mWorkManager = paramWorkManagerImpl;
    this.mRetryCount = 0;
  }
  
  static Intent getIntent(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(paramContext, BroadcastReceiver.class));
    localIntent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
    return localIntent;
  }
  
  private static PendingIntent getPendingIntent(Context paramContext, int paramInt)
  {
    return PendingIntent.getBroadcast(paramContext, -1, getIntent(paramContext), paramInt);
  }
  
  static void setAlarm(Context paramContext)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    int i;
    if (BuildCompat.isAtLeastS()) {
      i = 167772160;
    } else {
      i = 134217728;
    }
    paramContext = getPendingIntent(paramContext, i);
    long l = System.currentTimeMillis() + TEN_YEARS;
    if (localAlarmManager != null) {
      if (Build.VERSION.SDK_INT >= 19) {
        localAlarmManager.setExact(0, l, paramContext);
      } else {
        localAlarmManager.set(0, l, paramContext);
      }
    }
  }
  
  public boolean cleanUp()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1;
    if (i >= 23) {
      bool1 = SystemJobScheduler.reconcileJobs(this.mContext, this.mWorkManager);
    } else {
      bool1 = false;
    }
    WorkDatabase localWorkDatabase = this.mWorkManager.getWorkDatabase();
    WorkSpecDao localWorkSpecDao = localWorkDatabase.workSpecDao();
    WorkProgressDao localWorkProgressDao = localWorkDatabase.workProgressDao();
    localWorkDatabase.beginTransaction();
    try
    {
      Object localObject2 = localWorkSpecDao.getRunningWork();
      if ((localObject2 != null) && (!((List)localObject2).isEmpty())) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        Iterator localIterator = ((List)localObject2).iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (WorkSpec)localIterator.next();
          localWorkSpecDao.setState(WorkInfo.State.ENQUEUED, new String[] { ((WorkSpec)localObject2).id });
          localWorkSpecDao.markWorkSpecScheduled(((WorkSpec)localObject2).id, -1L);
        }
      }
      localWorkProgressDao.deleteAll();
      localWorkDatabase.setTransactionSuccessful();
      localWorkDatabase.endTransaction();
      if ((i != 0) || (bool1)) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      localWorkDatabase.endTransaction();
    }
  }
  
  public void forceStopRunnable()
  {
    boolean bool = cleanUp();
    if (shouldRescheduleWorkers())
    {
      Logger.get().debug(TAG, "Rescheduling Workers.", new Throwable[0]);
      this.mWorkManager.rescheduleEligibleWork();
      this.mWorkManager.getPreferenceUtils().setNeedsReschedule(false);
    }
    else if (isForceStopped())
    {
      Logger.get().debug(TAG, "Application was force-stopped, rescheduling.", new Throwable[0]);
      this.mWorkManager.rescheduleEligibleWork();
    }
    else if (bool)
    {
      Logger.get().debug(TAG, "Found unfinished work, scheduling it.", new Throwable[0]);
      Schedulers.schedule(this.mWorkManager.getConfiguration(), this.mWorkManager.getWorkDatabase(), this.mWorkManager.getSchedulers());
    }
  }
  
  public boolean isForceStopped()
  {
    int i = 536870912;
    try
    {
      if (BuildCompat.isAtLeastS()) {
        i = 570425344;
      }
      Object localObject = getPendingIntent(this.mContext, i);
      if (Build.VERSION.SDK_INT >= 30)
      {
        if (localObject != null) {
          ((PendingIntent)localObject).cancel();
        }
        localObject = ((ActivityManager)this.mContext.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if ((localObject != null) && (!((List)localObject).isEmpty())) {
          for (i = 0; i < ((List)localObject).size(); i++) {
            if (((ApplicationExitInfo)((List)localObject).get(i)).getReason() == 10) {
              return true;
            }
          }
        }
      }
      else if (localObject == null)
      {
        setAlarm(this.mContext);
        return true;
      }
      return false;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}catch (SecurityException localSecurityException) {}
    Logger.get().warning(TAG, "Ignoring exception", new Throwable[] { localSecurityException });
    return true;
  }
  
  public boolean multiProcessChecks()
  {
    Configuration localConfiguration = this.mWorkManager.getConfiguration();
    if (TextUtils.isEmpty(localConfiguration.getDefaultProcessName()))
    {
      Logger.get().debug(TAG, "The default process name was not specified.", new Throwable[0]);
      return true;
    }
    boolean bool = ProcessUtils.isDefaultProcess(this.mContext, localConfiguration);
    Logger.get().debug(TAG, String.format("Is default app process = %s", new Object[] { Boolean.valueOf(bool) }), new Throwable[0]);
    return bool;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 355	androidx/work/impl/utils/ForceStopRunnable:multiProcessChecks	()Z
    //   4: istore_2
    //   5: iload_2
    //   6: ifne +11 -> 17
    //   9: aload_0
    //   10: getfield 69	androidx/work/impl/utils/ForceStopRunnable:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   13: invokevirtual 358	androidx/work/impl/WorkManagerImpl:onForceStopRunnableCompleted	()V
    //   16: return
    //   17: aload_0
    //   18: getfield 67	androidx/work/impl/utils/ForceStopRunnable:mContext	Landroid/content/Context;
    //   21: invokestatic 363	androidx/work/impl/WorkDatabasePathHelper:migrateDatabase	(Landroid/content/Context;)V
    //   24: invokestatic 231	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   27: getstatic 40	androidx/work/impl/utils/ForceStopRunnable:TAG	Ljava/lang/String;
    //   30: ldc_w 365
    //   33: iconst_0
    //   34: anewarray 235	java/lang/Throwable
    //   37: invokevirtual 239	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   40: aload_0
    //   41: invokevirtual 367	androidx/work/impl/utils/ForceStopRunnable:forceStopRunnable	()V
    //   44: goto +137 -> 181
    //   47: astore 5
    //   49: goto +25 -> 74
    //   52: astore 5
    //   54: goto +20 -> 74
    //   57: astore 5
    //   59: goto +15 -> 74
    //   62: astore 5
    //   64: goto +10 -> 74
    //   67: astore 5
    //   69: goto +5 -> 74
    //   72: astore 5
    //   74: aload_0
    //   75: getfield 71	androidx/work/impl/utils/ForceStopRunnable:mRetryCount	I
    //   78: iconst_1
    //   79: iadd
    //   80: istore_1
    //   81: aload_0
    //   82: iload_1
    //   83: putfield 71	androidx/work/impl/utils/ForceStopRunnable:mRetryCount	I
    //   86: iload_1
    //   87: iconst_3
    //   88: if_icmplt +104 -> 192
    //   91: invokestatic 231	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   94: astore 7
    //   96: getstatic 40	androidx/work/impl/utils/ForceStopRunnable:TAG	Ljava/lang/String;
    //   99: astore 6
    //   101: aload 7
    //   103: aload 6
    //   105: ldc_w 369
    //   108: iconst_1
    //   109: anewarray 235	java/lang/Throwable
    //   112: dup
    //   113: iconst_0
    //   114: aload 5
    //   116: aastore
    //   117: invokevirtual 372	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   120: new 374	java/lang/IllegalStateException
    //   123: astore 7
    //   125: aload 7
    //   127: ldc_w 369
    //   130: aload 5
    //   132: invokespecial 377	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   135: aload_0
    //   136: getfield 69	androidx/work/impl/utils/ForceStopRunnable:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   139: invokevirtual 263	androidx/work/impl/WorkManagerImpl:getConfiguration	()Landroidx/work/Configuration;
    //   142: invokevirtual 381	androidx/work/Configuration:getExceptionHandler	()Landroidx/work/InitializationExceptionHandler;
    //   145: astore 5
    //   147: aload 5
    //   149: ifnull +40 -> 189
    //   152: invokestatic 231	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   155: aload 6
    //   157: ldc_w 383
    //   160: iconst_1
    //   161: anewarray 235	java/lang/Throwable
    //   164: dup
    //   165: iconst_0
    //   166: aload 7
    //   168: aastore
    //   169: invokevirtual 239	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   172: aload 5
    //   174: aload 7
    //   176: invokeinterface 389 2 0
    //   181: aload_0
    //   182: getfield 69	androidx/work/impl/utils/ForceStopRunnable:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   185: invokevirtual 358	androidx/work/impl/WorkManagerImpl:onForceStopRunnableCompleted	()V
    //   188: return
    //   189: aload 7
    //   191: athrow
    //   192: iload_1
    //   193: i2l
    //   194: lstore_3
    //   195: invokestatic 231	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   198: getstatic 40	androidx/work/impl/utils/ForceStopRunnable:TAG	Ljava/lang/String;
    //   201: ldc_w 391
    //   204: iconst_1
    //   205: anewarray 4	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: lload_3
    //   211: ldc2_w 18
    //   214: lmul
    //   215: invokestatic 396	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   218: aastore
    //   219: invokestatic 340	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   222: iconst_1
    //   223: anewarray 235	java/lang/Throwable
    //   226: dup
    //   227: iconst_0
    //   228: aload 5
    //   230: aastore
    //   231: invokevirtual 239	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   234: aload_0
    //   235: aload_0
    //   236: getfield 71	androidx/work/impl/utils/ForceStopRunnable:mRetryCount	I
    //   239: i2l
    //   240: ldc2_w 18
    //   243: lmul
    //   244: invokevirtual 400	androidx/work/impl/utils/ForceStopRunnable:sleep	(J)V
    //   247: goto -230 -> 17
    //   250: astore 5
    //   252: aload_0
    //   253: getfield 69	androidx/work/impl/utils/ForceStopRunnable:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   256: invokevirtual 358	androidx/work/impl/WorkManagerImpl:onForceStopRunnableCompleted	()V
    //   259: aload 5
    //   261: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	this	ForceStopRunnable
    //   80	113	1	i	int
    //   4	2	2	bool	boolean
    //   194	17	3	l	long
    //   47	1	5	localSQLiteAccessPermException	android.database.sqlite.SQLiteAccessPermException
    //   52	1	5	localSQLiteConstraintException	android.database.sqlite.SQLiteConstraintException
    //   57	1	5	localSQLiteTableLockedException	android.database.sqlite.SQLiteTableLockedException
    //   62	1	5	localSQLiteDatabaseLockedException	android.database.sqlite.SQLiteDatabaseLockedException
    //   67	1	5	localSQLiteDatabaseCorruptException	android.database.sqlite.SQLiteDatabaseCorruptException
    //   72	59	5	localSQLiteCantOpenDatabaseException	android.database.sqlite.SQLiteCantOpenDatabaseException
    //   145	84	5	localInitializationExceptionHandler	androidx.work.InitializationExceptionHandler
    //   250	10	5	localObject1	Object
    //   99	57	6	str	String
    //   94	96	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   40	44	47	android/database/sqlite/SQLiteAccessPermException
    //   40	44	52	android/database/sqlite/SQLiteConstraintException
    //   40	44	57	android/database/sqlite/SQLiteTableLockedException
    //   40	44	62	android/database/sqlite/SQLiteDatabaseLockedException
    //   40	44	67	android/database/sqlite/SQLiteDatabaseCorruptException
    //   40	44	72	android/database/sqlite/SQLiteCantOpenDatabaseException
    //   0	5	250	finally
    //   17	40	250	finally
    //   40	44	250	finally
    //   74	86	250	finally
    //   91	147	250	finally
    //   152	181	250	finally
    //   189	192	250	finally
    //   195	247	250	finally
  }
  
  boolean shouldRescheduleWorkers()
  {
    return this.mWorkManager.getPreferenceUtils().getNeedsReschedule();
  }
  
  public void sleep(long paramLong)
  {
    try
    {
      Thread.sleep(paramLong);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public static class BroadcastReceiver
    extends BroadcastReceiver
  {
    private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable$Rcvr");
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if ((paramIntent != null) && ("ACTION_FORCE_STOP_RESCHEDULE".equals(paramIntent.getAction())))
      {
        Logger.get().verbose(TAG, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
        ForceStopRunnable.setAlarm(paramContext);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\imp\\utils\ForceStopRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */