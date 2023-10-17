package com.google.android.gms.common.stats;

import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.text.TextUtils;

@Deprecated
public class StatsUtils
{
  public static String getEventKey(PowerManager.WakeLock paramWakeLock, String paramString)
  {
    paramWakeLock = String.valueOf(String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramWakeLock)));
    if (true == TextUtils.isEmpty(paramString)) {
      paramString = "";
    }
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramWakeLock = paramWakeLock.concat(paramString);
    } else {
      paramWakeLock = new String(paramWakeLock);
    }
    return paramWakeLock;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\stats\StatsUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */