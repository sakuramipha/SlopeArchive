package com.google.android.gms.common.internal;

import android.util.Log;

public final class GmsLogger
{
  private final String zza;
  private final String zzb;
  
  public GmsLogger(String paramString)
  {
    this(paramString, null);
  }
  
  public GmsLogger(String paramString1, String paramString2)
  {
    Preconditions.checkNotNull(paramString1, "log tag cannot be null");
    boolean bool;
    if (paramString1.length() <= 23) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "tag \"%s\" is longer than the %d character maximum", new Object[] { paramString1, Integer.valueOf(23) });
    this.zza = paramString1;
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      this.zzb = paramString2;
      return;
    }
    this.zzb = null;
  }
  
  private final String zza(String paramString)
  {
    String str = this.zzb;
    if (str == null) {
      return paramString;
    }
    return str.concat(paramString);
  }
  
  private final String zzb(String paramString, Object... paramVarArgs)
  {
    paramVarArgs = String.format(paramString, paramVarArgs);
    paramString = this.zzb;
    if (paramString == null) {
      return paramVarArgs;
    }
    return paramString.concat(paramVarArgs);
  }
  
  public boolean canLog(int paramInt)
  {
    return Log.isLoggable(this.zza, paramInt);
  }
  
  public boolean canLogPii()
  {
    return false;
  }
  
  public void d(String paramString1, String paramString2)
  {
    if (canLog(3)) {
      Log.d(paramString1, zza(paramString2));
    }
  }
  
  public void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(3)) {
      Log.d(paramString1, zza(paramString2), paramThrowable);
    }
  }
  
  public void e(String paramString1, String paramString2)
  {
    if (canLog(6)) {
      Log.e(paramString1, zza(paramString2));
    }
  }
  
  public void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(6)) {
      Log.e(paramString1, zza(paramString2), paramThrowable);
    }
  }
  
  public void efmt(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (canLog(6)) {
      Log.e(paramString1, zzb(paramString2, paramVarArgs));
    }
  }
  
  public void i(String paramString1, String paramString2)
  {
    if (canLog(4)) {
      Log.i(paramString1, zza(paramString2));
    }
  }
  
  public void i(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(4)) {
      Log.i(paramString1, zza(paramString2), paramThrowable);
    }
  }
  
  public void pii(String paramString1, String paramString2) {}
  
  public void pii(String paramString1, String paramString2, Throwable paramThrowable) {}
  
  public void v(String paramString1, String paramString2)
  {
    if (canLog(2)) {
      Log.v(paramString1, zza(paramString2));
    }
  }
  
  public void v(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(2)) {
      Log.v(paramString1, zza(paramString2), paramThrowable);
    }
  }
  
  public void w(String paramString1, String paramString2)
  {
    if (canLog(5)) {
      Log.w(paramString1, zza(paramString2));
    }
  }
  
  public void w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(5)) {
      Log.w(paramString1, zza(paramString2), paramThrowable);
    }
  }
  
  public void wfmt(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (canLog(5)) {
      Log.w(this.zza, zzb(paramString2, paramVarArgs));
    }
  }
  
  public void wtf(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (canLog(7))
    {
      Log.e(paramString1, zza(paramString2), paramThrowable);
      Log.wtf(paramString1, zza(paramString2), paramThrowable);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\GmsLogger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */