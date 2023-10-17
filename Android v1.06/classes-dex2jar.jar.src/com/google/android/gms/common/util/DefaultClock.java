package com.google.android.gms.common.util;

import android.os.SystemClock;

public class DefaultClock
  implements Clock
{
  private static final DefaultClock zza = new DefaultClock();
  
  public static Clock getInstance()
  {
    return zza;
  }
  
  public final long currentThreadTimeMillis()
  {
    return SystemClock.currentThreadTimeMillis();
  }
  
  public final long currentTimeMillis()
  {
    return System.currentTimeMillis();
  }
  
  public final long elapsedRealtime()
  {
    return SystemClock.elapsedRealtime();
  }
  
  public final long nanoTime()
  {
    return System.nanoTime();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\DefaultClock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */