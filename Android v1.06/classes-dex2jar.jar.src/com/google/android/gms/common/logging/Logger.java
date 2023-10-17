package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

public class Logger
{
  private final String zza;
  private final String zzb;
  private final GmsLogger zzc;
  private final int zzd;
  
  public Logger(String paramString, String... paramVarArgs)
  {
    this.zzb = paramVarArgs;
    this.zza = paramString;
    this.zzc = new GmsLogger(paramString);
    for (int i = 2; (i <= 7) && (!Log.isLoggable(this.zza, i)); i++) {}
    this.zzd = i;
  }
  
  public void d(String paramString, Object... paramVarArgs)
  {
    if (isLoggable(3)) {
      Log.d(this.zza, format(paramString, paramVarArgs));
    }
  }
  
  public void e(String paramString, Throwable paramThrowable, Object... paramVarArgs)
  {
    Log.e(this.zza, format(paramString, paramVarArgs), paramThrowable);
  }
  
  public void e(String paramString, Object... paramVarArgs)
  {
    Log.e(this.zza, format(paramString, paramVarArgs));
  }
  
  protected String format(String paramString, Object... paramVarArgs)
  {
    String str = paramString;
    if (paramVarArgs != null)
    {
      str = paramString;
      if (paramVarArgs.length > 0) {
        str = String.format(Locale.US, paramString, paramVarArgs);
      }
    }
    return this.zzb.concat(str);
  }
  
  public String getTag()
  {
    return this.zza;
  }
  
  public void i(String paramString, Object... paramVarArgs)
  {
    Log.i(this.zza, format(paramString, paramVarArgs));
  }
  
  public boolean isLoggable(int paramInt)
  {
    return this.zzd <= paramInt;
  }
  
  public void v(String paramString, Throwable paramThrowable, Object... paramVarArgs)
  {
    if (isLoggable(2)) {
      Log.v(this.zza, format(paramString, paramVarArgs), paramThrowable);
    }
  }
  
  public void v(String paramString, Object... paramVarArgs)
  {
    if (isLoggable(2)) {
      Log.v(this.zza, format(paramString, paramVarArgs));
    }
  }
  
  public void w(String paramString, Object... paramVarArgs)
  {
    Log.w(this.zza, format(paramString, paramVarArgs));
  }
  
  public void wtf(String paramString, Throwable paramThrowable, Object... paramVarArgs)
  {
    Log.wtf(this.zza, format(paramString, paramVarArgs), paramThrowable);
  }
  
  public void wtf(Throwable paramThrowable)
  {
    Log.wtf(this.zza, paramThrowable);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\logging\Logger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */