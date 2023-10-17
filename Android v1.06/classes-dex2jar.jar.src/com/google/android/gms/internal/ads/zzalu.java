package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

public final class zzalu
{
  public static final String zza = "Volley";
  public static final boolean zzb = Log.isLoggable("Volley", 2);
  private static final String zzc = zzalu.class.getName();
  
  public static void zza(String paramString, Object... paramVarArgs)
  {
    Log.d(zza, zze(paramString, paramVarArgs));
  }
  
  public static void zzb(String paramString, Object... paramVarArgs)
  {
    Log.e(zza, zze(paramString, paramVarArgs));
  }
  
  public static void zzc(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    Log.e(zza, zze(paramString, paramVarArgs), paramThrowable);
  }
  
  public static void zzd(String paramString, Object... paramVarArgs)
  {
    if (zzb) {
      Log.v(zza, zze(paramString, paramVarArgs));
    }
  }
  
  private static String zze(String paramString, Object... paramVarArgs)
  {
    paramVarArgs = String.format(Locale.US, paramString, paramVarArgs);
    paramString = new Throwable().fillInStackTrace().getStackTrace();
    for (int i = 2; i < paramString.length; i++) {
      if (!paramString[i].getClassName().equals(zzc))
      {
        String str1 = paramString[i].getClassName();
        str1 = str1.substring(str1.lastIndexOf('.') + 1);
        str1 = str1.substring(str1.lastIndexOf('$') + 1);
        String str2 = paramString[i].getMethodName();
        paramString = new StringBuilder();
        paramString.append(str1);
        paramString.append(".");
        paramString.append(str2);
        paramString = paramString.toString();
        break label132;
      }
    }
    paramString = "<unknown>";
    label132:
    return String.format(Locale.US, "[%d] %s: %s", new Object[] { Long.valueOf(Thread.currentThread().getId()), paramString, paramVarArgs });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzalu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */