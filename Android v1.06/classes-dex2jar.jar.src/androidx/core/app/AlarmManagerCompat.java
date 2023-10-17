package androidx.core.app;

import android.app.AlarmManager;
import android.app.AlarmManager.AlarmClockInfo;
import android.app.PendingIntent;
import android.os.Build.VERSION;

public final class AlarmManagerCompat
{
  public static void setAlarmClock(AlarmManager paramAlarmManager, long paramLong, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramAlarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(paramLong, paramPendingIntent1), paramPendingIntent2);
    } else {
      setExact(paramAlarmManager, 0, paramLong, paramPendingIntent2);
    }
  }
  
  public static void setAndAllowWhileIdle(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      paramAlarmManager.setAndAllowWhileIdle(paramInt, paramLong, paramPendingIntent);
    } else {
      paramAlarmManager.set(paramInt, paramLong, paramPendingIntent);
    }
  }
  
  public static void setExact(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramAlarmManager.setExact(paramInt, paramLong, paramPendingIntent);
    } else {
      paramAlarmManager.set(paramInt, paramLong, paramPendingIntent);
    }
  }
  
  public static void setExactAndAllowWhileIdle(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      paramAlarmManager.setExactAndAllowWhileIdle(paramInt, paramLong, paramPendingIntent);
    } else {
      setExact(paramAlarmManager, paramInt, paramLong, paramPendingIntent);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\app\AlarmManagerCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */