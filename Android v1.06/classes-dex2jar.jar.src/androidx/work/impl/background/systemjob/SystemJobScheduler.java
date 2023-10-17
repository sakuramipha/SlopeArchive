package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.IdGenerator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SystemJobScheduler
  implements Scheduler
{
  private static final String TAG = Logger.tagWithPrefix("SystemJobScheduler");
  private final Context mContext;
  private final JobScheduler mJobScheduler;
  private final SystemJobInfoConverter mSystemJobInfoConverter;
  private final WorkManagerImpl mWorkManager;
  
  public SystemJobScheduler(Context paramContext, WorkManagerImpl paramWorkManagerImpl)
  {
    this(paramContext, paramWorkManagerImpl, (JobScheduler)paramContext.getSystemService("jobscheduler"), new SystemJobInfoConverter(paramContext));
  }
  
  public SystemJobScheduler(Context paramContext, WorkManagerImpl paramWorkManagerImpl, JobScheduler paramJobScheduler, SystemJobInfoConverter paramSystemJobInfoConverter)
  {
    this.mContext = paramContext;
    this.mWorkManager = paramWorkManagerImpl;
    this.mJobScheduler = paramJobScheduler;
    this.mSystemJobInfoConverter = paramSystemJobInfoConverter;
  }
  
  public static void cancelAll(Context paramContext)
  {
    JobScheduler localJobScheduler = (JobScheduler)paramContext.getSystemService("jobscheduler");
    if (localJobScheduler != null)
    {
      paramContext = getPendingJobs(paramContext, localJobScheduler);
      if ((paramContext != null) && (!paramContext.isEmpty()))
      {
        paramContext = paramContext.iterator();
        while (paramContext.hasNext()) {
          cancelJobById(localJobScheduler, ((JobInfo)paramContext.next()).getId());
        }
      }
    }
  }
  
  /* Error */
  private static void cancelJobById(JobScheduler paramJobScheduler, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual 97	android/app/job/JobScheduler:cancel	(I)V
    //   5: goto +40 -> 45
    //   8: astore_0
    //   9: invokestatic 101	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   12: getstatic 28	androidx/work/impl/background/systemjob/SystemJobScheduler:TAG	Ljava/lang/String;
    //   15: invokestatic 107	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   18: ldc 109
    //   20: iconst_1
    //   21: anewarray 4	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: iload_1
    //   27: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: aastore
    //   31: invokestatic 121	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   34: iconst_1
    //   35: anewarray 123	java/lang/Throwable
    //   38: dup
    //   39: iconst_0
    //   40: aload_0
    //   41: aastore
    //   42: invokevirtual 127	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   45: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	paramJobScheduler	JobScheduler
    //   0	46	1	paramInt	int
    // Exception table:
    //   from	to	target	type
    //   0	5	8	finally
  }
  
  private static List<Integer> getPendingJobIds(Context paramContext, JobScheduler paramJobScheduler, String paramString)
  {
    paramJobScheduler = getPendingJobs(paramContext, paramJobScheduler);
    if (paramJobScheduler == null) {
      return null;
    }
    paramContext = new ArrayList(2);
    Iterator localIterator = paramJobScheduler.iterator();
    while (localIterator.hasNext())
    {
      paramJobScheduler = (JobInfo)localIterator.next();
      if (paramString.equals(getWorkSpecIdFromJobInfo(paramJobScheduler))) {
        paramContext.add(Integer.valueOf(paramJobScheduler.getId()));
      }
    }
    return paramContext;
  }
  
  /* Error */
  private static List<JobInfo> getPendingJobs(Context paramContext, JobScheduler paramJobScheduler)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 151	android/app/job/JobScheduler:getAllPendingJobs	()Ljava/util/List;
    //   4: astore_1
    //   5: goto +25 -> 30
    //   8: astore_1
    //   9: invokestatic 101	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   12: getstatic 28	androidx/work/impl/background/systemjob/SystemJobScheduler:TAG	Ljava/lang/String;
    //   15: ldc -103
    //   17: iconst_1
    //   18: anewarray 123	java/lang/Throwable
    //   21: dup
    //   22: iconst_0
    //   23: aload_1
    //   24: aastore
    //   25: invokevirtual 127	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   28: aconst_null
    //   29: astore_1
    //   30: aload_1
    //   31: ifnonnull +5 -> 36
    //   34: aconst_null
    //   35: areturn
    //   36: new 132	java/util/ArrayList
    //   39: dup
    //   40: aload_1
    //   41: invokeinterface 156 1 0
    //   46: invokespecial 134	java/util/ArrayList:<init>	(I)V
    //   49: astore_2
    //   50: new 158	android/content/ComponentName
    //   53: dup
    //   54: aload_0
    //   55: ldc -96
    //   57: invokespecial 163	android/content/ComponentName:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   60: astore_0
    //   61: aload_1
    //   62: invokeinterface 74 1 0
    //   67: astore_3
    //   68: aload_3
    //   69: invokeinterface 79 1 0
    //   74: ifeq +35 -> 109
    //   77: aload_3
    //   78: invokeinterface 83 1 0
    //   83: checkcast 85	android/app/job/JobInfo
    //   86: astore_1
    //   87: aload_0
    //   88: aload_1
    //   89: invokevirtual 167	android/app/job/JobInfo:getService	()Landroid/content/ComponentName;
    //   92: invokevirtual 168	android/content/ComponentName:equals	(Ljava/lang/Object;)Z
    //   95: ifeq -27 -> 68
    //   98: aload_2
    //   99: aload_1
    //   100: invokeinterface 145 2 0
    //   105: pop
    //   106: goto -38 -> 68
    //   109: aload_2
    //   110: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	paramContext	Context
    //   0	111	1	paramJobScheduler	JobScheduler
    //   49	61	2	localArrayList	ArrayList
    //   67	11	3	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   0	5	8	finally
  }
  
  private static String getWorkSpecIdFromJobInfo(JobInfo paramJobInfo)
  {
    paramJobInfo = paramJobInfo.getExtras();
    if (paramJobInfo != null) {}
    try
    {
      if (paramJobInfo.containsKey("EXTRA_WORK_SPEC_ID"))
      {
        paramJobInfo = paramJobInfo.getString("EXTRA_WORK_SPEC_ID");
        return paramJobInfo;
      }
    }
    catch (NullPointerException paramJobInfo)
    {
      for (;;) {}
    }
    return null;
  }
  
  public static boolean reconcileJobs(Context paramContext, WorkManagerImpl paramWorkManagerImpl)
  {
    Object localObject1 = (JobScheduler)paramContext.getSystemService("jobscheduler");
    Object localObject2 = getPendingJobs(paramContext, (JobScheduler)localObject1);
    paramContext = paramWorkManagerImpl.getWorkDatabase().systemIdInfoDao().getWorkSpecIds();
    boolean bool2 = false;
    int i;
    if (localObject2 != null) {
      i = ((List)localObject2).size();
    } else {
      i = 0;
    }
    HashSet localHashSet = new HashSet(i);
    if ((localObject2 != null) && (!((List)localObject2).isEmpty()))
    {
      Iterator localIterator = ((List)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (JobInfo)localIterator.next();
        String str = getWorkSpecIdFromJobInfo((JobInfo)localObject2);
        if (!TextUtils.isEmpty(str)) {
          localHashSet.add(str);
        } else {
          cancelJobById((JobScheduler)localObject1, ((JobInfo)localObject2).getId());
        }
      }
    }
    localObject1 = paramContext.iterator();
    do
    {
      bool1 = bool2;
      if (!((Iterator)localObject1).hasNext()) {
        break;
      }
    } while (localHashSet.contains((String)((Iterator)localObject1).next()));
    Logger.get().debug(TAG, "Reconciling jobs", new Throwable[0]);
    boolean bool1 = true;
    if (bool1)
    {
      paramWorkManagerImpl = paramWorkManagerImpl.getWorkDatabase();
      paramWorkManagerImpl.beginTransaction();
      try
      {
        localObject1 = paramWorkManagerImpl.workSpecDao();
        paramContext = paramContext.iterator();
        while (paramContext.hasNext()) {
          ((WorkSpecDao)localObject1).markWorkSpecScheduled((String)paramContext.next(), -1L);
        }
        paramWorkManagerImpl.setTransactionSuccessful();
      }
      finally
      {
        paramWorkManagerImpl.endTransaction();
      }
    }
    return bool1;
  }
  
  public void cancel(String paramString)
  {
    Object localObject = getPendingJobIds(this.mContext, this.mJobScheduler, paramString);
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        int i = ((Integer)((Iterator)localObject).next()).intValue();
        cancelJobById(this.mJobScheduler, i);
      }
      this.mWorkManager.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(paramString);
    }
  }
  
  public boolean hasLimitedSchedulingSlots()
  {
    return true;
  }
  
  public void schedule(WorkSpec... paramVarArgs)
  {
    WorkDatabase localWorkDatabase = this.mWorkManager.getWorkDatabase();
    IdGenerator localIdGenerator = new IdGenerator(localWorkDatabase);
    int k = paramVarArgs.length;
    int i = 0;
    while (i < k)
    {
      WorkSpec localWorkSpec = paramVarArgs[i];
      localWorkDatabase.beginTransaction();
      try
      {
        Object localObject = localWorkDatabase.workSpecDao().getWorkSpec(localWorkSpec.id);
        Logger localLogger;
        String str;
        if (localObject == null)
        {
          localLogger = Logger.get();
          str = TAG;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Skipping scheduling ");
          ((StringBuilder)localObject).append(localWorkSpec.id);
          ((StringBuilder)localObject).append(" because it's no longer in the DB");
          localLogger.warning(str, ((StringBuilder)localObject).toString(), new Throwable[0]);
          localWorkDatabase.setTransactionSuccessful();
        }
        else if (((WorkSpec)localObject).state != WorkInfo.State.ENQUEUED)
        {
          localLogger = Logger.get();
          str = TAG;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Skipping scheduling ");
          ((StringBuilder)localObject).append(localWorkSpec.id);
          ((StringBuilder)localObject).append(" because it is no longer enqueued");
          localLogger.warning(str, ((StringBuilder)localObject).toString(), new Throwable[0]);
          localWorkDatabase.setTransactionSuccessful();
        }
        else
        {
          localObject = localWorkDatabase.systemIdInfoDao().getSystemIdInfo(localWorkSpec.id);
          int j;
          if (localObject != null) {
            j = ((SystemIdInfo)localObject).systemId;
          } else {
            j = localIdGenerator.nextJobSchedulerIdWithRange(this.mWorkManager.getConfiguration().getMinJobSchedulerId(), this.mWorkManager.getConfiguration().getMaxJobSchedulerId());
          }
          if (localObject == null)
          {
            localObject = new androidx/work/impl/model/SystemIdInfo;
            ((SystemIdInfo)localObject).<init>(localWorkSpec.id, j);
            this.mWorkManager.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo((SystemIdInfo)localObject);
          }
          scheduleInternal(localWorkSpec, j);
          if (Build.VERSION.SDK_INT == 23)
          {
            localObject = getPendingJobIds(this.mContext, this.mJobScheduler, localWorkSpec.id);
            if (localObject != null)
            {
              j = ((List)localObject).indexOf(Integer.valueOf(j));
              if (j >= 0) {
                ((List)localObject).remove(j);
              }
              if (!((List)localObject).isEmpty()) {
                j = ((Integer)((List)localObject).get(0)).intValue();
              } else {
                j = localIdGenerator.nextJobSchedulerIdWithRange(this.mWorkManager.getConfiguration().getMinJobSchedulerId(), this.mWorkManager.getConfiguration().getMaxJobSchedulerId());
              }
              scheduleInternal(localWorkSpec, j);
            }
          }
          localWorkDatabase.setTransactionSuccessful();
        }
        localWorkDatabase.endTransaction();
        i++;
      }
      finally
      {
        localWorkDatabase.endTransaction();
      }
    }
  }
  
  /* Error */
  public void scheduleInternal(WorkSpec paramWorkSpec, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 59	androidx/work/impl/background/systemjob/SystemJobScheduler:mSystemJobInfoConverter	Landroidx/work/impl/background/systemjob/SystemJobInfoConverter;
    //   4: aload_1
    //   5: iload_2
    //   6: invokevirtual 357	androidx/work/impl/background/systemjob/SystemJobInfoConverter:convert	(Landroidx/work/impl/model/WorkSpec;I)Landroid/app/job/JobInfo;
    //   9: astore 5
    //   11: invokestatic 101	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   14: astore 4
    //   16: getstatic 28	androidx/work/impl/background/systemjob/SystemJobScheduler:TAG	Ljava/lang/String;
    //   19: astore_3
    //   20: aload 4
    //   22: aload_3
    //   23: ldc_w 359
    //   26: iconst_2
    //   27: anewarray 4	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: aload_1
    //   33: getfield 266	androidx/work/impl/model/WorkSpec:id	Ljava/lang/String;
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: iload_2
    //   40: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: aastore
    //   44: invokestatic 362	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   47: iconst_0
    //   48: anewarray 123	java/lang/Throwable
    //   51: invokevirtual 223	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   54: aload_0
    //   55: getfield 57	androidx/work/impl/background/systemjob/SystemJobScheduler:mJobScheduler	Landroid/app/job/JobScheduler;
    //   58: aload 5
    //   60: invokevirtual 365	android/app/job/JobScheduler:schedule	(Landroid/app/job/JobInfo;)I
    //   63: ifne +126 -> 189
    //   66: invokestatic 101	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   69: aload_3
    //   70: ldc_w 367
    //   73: iconst_1
    //   74: anewarray 4	java/lang/Object
    //   77: dup
    //   78: iconst_0
    //   79: aload_1
    //   80: getfield 266	androidx/work/impl/model/WorkSpec:id	Ljava/lang/String;
    //   83: aastore
    //   84: invokestatic 362	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   87: iconst_0
    //   88: anewarray 123	java/lang/Throwable
    //   91: invokevirtual 288	androidx/work/Logger:warning	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   94: aload_1
    //   95: getfield 371	androidx/work/impl/model/WorkSpec:expedited	Z
    //   98: ifeq +91 -> 189
    //   101: aload_1
    //   102: getfield 375	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   105: getstatic 380	androidx/work/OutOfQuotaPolicy:RUN_AS_NON_EXPEDITED_WORK_REQUEST	Landroidx/work/OutOfQuotaPolicy;
    //   108: if_acmpne +81 -> 189
    //   111: aload_1
    //   112: iconst_0
    //   113: putfield 371	androidx/work/impl/model/WorkSpec:expedited	Z
    //   116: ldc_w 382
    //   119: iconst_1
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: aload_1
    //   126: getfield 266	androidx/work/impl/model/WorkSpec:id	Ljava/lang/String;
    //   129: aastore
    //   130: invokestatic 362	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   133: astore 4
    //   135: invokestatic 101	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   138: aload_3
    //   139: aload 4
    //   141: iconst_0
    //   142: anewarray 123	java/lang/Throwable
    //   145: invokevirtual 223	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   148: aload_0
    //   149: aload_1
    //   150: iload_2
    //   151: invokevirtual 336	androidx/work/impl/background/systemjob/SystemJobScheduler:scheduleInternal	(Landroidx/work/impl/model/WorkSpec;I)V
    //   154: goto +35 -> 189
    //   157: astore_3
    //   158: invokestatic 101	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   161: getstatic 28	androidx/work/impl/background/systemjob/SystemJobScheduler:TAG	Ljava/lang/String;
    //   164: ldc_w 384
    //   167: iconst_1
    //   168: anewarray 4	java/lang/Object
    //   171: dup
    //   172: iconst_0
    //   173: aload_1
    //   174: aastore
    //   175: invokestatic 362	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   178: iconst_1
    //   179: anewarray 123	java/lang/Throwable
    //   182: dup
    //   183: iconst_0
    //   184: aload_3
    //   185: aastore
    //   186: invokevirtual 127	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   189: return
    //   190: astore_1
    //   191: aload_0
    //   192: getfield 53	androidx/work/impl/background/systemjob/SystemJobScheduler:mContext	Landroid/content/Context;
    //   195: aload_0
    //   196: getfield 57	androidx/work/impl/background/systemjob/SystemJobScheduler:mJobScheduler	Landroid/app/job/JobScheduler;
    //   199: invokestatic 64	androidx/work/impl/background/systemjob/SystemJobScheduler:getPendingJobs	(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;
    //   202: astore_3
    //   203: aload_3
    //   204: ifnull +13 -> 217
    //   207: aload_3
    //   208: invokeinterface 156 1 0
    //   213: istore_2
    //   214: goto +5 -> 219
    //   217: iconst_0
    //   218: istore_2
    //   219: invokestatic 107	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   222: ldc_w 386
    //   225: iconst_3
    //   226: anewarray 4	java/lang/Object
    //   229: dup
    //   230: iconst_0
    //   231: iload_2
    //   232: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   235: aastore
    //   236: dup
    //   237: iconst_1
    //   238: aload_0
    //   239: getfield 55	androidx/work/impl/background/systemjob/SystemJobScheduler:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   242: invokevirtual 193	androidx/work/impl/WorkManagerImpl:getWorkDatabase	()Landroidx/work/impl/WorkDatabase;
    //   245: invokevirtual 230	androidx/work/impl/WorkDatabase:workSpecDao	()Landroidx/work/impl/model/WorkSpecDao;
    //   248: invokeinterface 389 1 0
    //   253: invokeinterface 156 1 0
    //   258: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   261: aastore
    //   262: dup
    //   263: iconst_2
    //   264: aload_0
    //   265: getfield 55	androidx/work/impl/background/systemjob/SystemJobScheduler:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   268: invokevirtual 313	androidx/work/impl/WorkManagerImpl:getConfiguration	()Landroidx/work/Configuration;
    //   271: invokevirtual 392	androidx/work/Configuration:getMaxSchedulerLimit	()I
    //   274: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   277: aastore
    //   278: invokestatic 121	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   281: astore_3
    //   282: invokestatic 101	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   285: getstatic 28	androidx/work/impl/background/systemjob/SystemJobScheduler:TAG	Ljava/lang/String;
    //   288: aload_3
    //   289: iconst_0
    //   290: anewarray 123	java/lang/Throwable
    //   293: invokevirtual 127	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   296: new 353	java/lang/IllegalStateException
    //   299: dup
    //   300: aload_3
    //   301: aload_1
    //   302: invokespecial 395	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   305: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	306	0	this	SystemJobScheduler
    //   0	306	1	paramWorkSpec	WorkSpec
    //   0	306	2	paramInt	int
    //   19	120	3	str	String
    //   157	28	3	localObject1	Object
    //   202	99	3	localObject2	Object
    //   14	126	4	localObject3	Object
    //   9	50	5	localJobInfo	JobInfo
    // Exception table:
    //   from	to	target	type
    //   54	154	157	finally
    //   54	154	190	java/lang/IllegalStateException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\systemjob\SystemJobScheduler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */