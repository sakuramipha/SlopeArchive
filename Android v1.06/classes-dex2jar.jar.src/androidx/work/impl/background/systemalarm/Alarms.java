package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.utils.IdGenerator;

class Alarms
{
  private static final String TAG = Logger.tagWithPrefix("Alarms");
  
  public static void cancelAlarm(Context paramContext, WorkManagerImpl paramWorkManagerImpl, String paramString)
  {
    SystemIdInfoDao localSystemIdInfoDao = paramWorkManagerImpl.getWorkDatabase().systemIdInfoDao();
    paramWorkManagerImpl = localSystemIdInfoDao.getSystemIdInfo(paramString);
    if (paramWorkManagerImpl != null)
    {
      cancelExactAlarm(paramContext, paramString, paramWorkManagerImpl.systemId);
      Logger.get().debug(TAG, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[] { paramString }), new Throwable[0]);
      localSystemIdInfoDao.removeSystemIdInfo(paramString);
    }
  }
  
  private static void cancelExactAlarm(Context paramContext, String paramString, int paramInt)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    Intent localIntent = CommandHandler.createDelayMetIntent(paramContext, paramString);
    int i;
    if (Build.VERSION.SDK_INT >= 23) {
      i = 603979776;
    } else {
      i = 536870912;
    }
    paramContext = PendingIntent.getService(paramContext, paramInt, localIntent, i);
    if ((paramContext != null) && (localAlarmManager != null))
    {
      Logger.get().debug(TAG, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[] { paramString, Integer.valueOf(paramInt) }), new Throwable[0]);
      localAlarmManager.cancel(paramContext);
    }
  }
  
  public static void setAlarm(Context paramContext, WorkManagerImpl paramWorkManagerImpl, String paramString, long paramLong)
  {
    WorkDatabase localWorkDatabase = paramWorkManagerImpl.getWorkDatabase();
    paramWorkManagerImpl = localWorkDatabase.systemIdInfoDao();
    SystemIdInfo localSystemIdInfo = paramWorkManagerImpl.getSystemIdInfo(paramString);
    if (localSystemIdInfo != null)
    {
      cancelExactAlarm(paramContext, paramString, localSystemIdInfo.systemId);
      setExactAlarm(paramContext, paramString, localSystemIdInfo.systemId, paramLong);
    }
    else
    {
      int i = new IdGenerator(localWorkDatabase).nextAlarmManagerId();
      paramWorkManagerImpl.insertSystemIdInfo(new SystemIdInfo(paramString, i));
      setExactAlarm(paramContext, paramString, i, paramLong);
    }
  }
  
  private static void setExactAlarm(Context paramContext, String paramString, int paramInt, long paramLong)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    int i;
    if (Build.VERSION.SDK_INT >= 23) {
      i = 201326592;
    } else {
      i = 134217728;
    }
    paramContext = PendingIntent.getService(paramContext, paramInt, CommandHandler.createDelayMetIntent(paramContext, paramString), i);
    if (localAlarmManager != null) {
      if (Build.VERSION.SDK_INT >= 19) {
        localAlarmManager.setExact(0, paramLong, paramContext);
      } else {
        localAlarmManager.set(0, paramLong, paramContext);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\impl\background\systemalarm\Alarms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */