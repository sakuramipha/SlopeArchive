package com.google.android.gms.internal.ads;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class zzfno
{
  private final String zza;
  
  public zzfno(String paramString)
  {
    int i = Process.myUid();
    int j = Process.myPid();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UID: [");
    localStringBuilder.append(i);
    localStringBuilder.append("]  PID: [");
    localStringBuilder.append(j);
    localStringBuilder.append("] ");
    this.zza = localStringBuilder.toString().concat(paramString);
  }
  
  private static String zze(String paramString1, String paramString2, Object... paramVarArgs)
  {
    String str1 = paramString2;
    String str2;
    if (paramVarArgs.length > 0) {
      try
      {
        str1 = String.format(Locale.US, paramString2, paramVarArgs);
      }
      catch (IllegalFormatException localIllegalFormatException)
      {
        Log.e("PlayCore", "Unable to format ".concat(paramString2), localIllegalFormatException);
        str2 = TextUtils.join(", ", paramVarArgs);
        paramVarArgs = new StringBuilder();
        paramVarArgs.append(paramString2);
        paramVarArgs.append(" [");
        paramVarArgs.append(str2);
        paramVarArgs.append("]");
        str2 = paramVarArgs.toString();
      }
    }
    paramString2 = new StringBuilder();
    paramString2.append(paramString1);
    paramString2.append(" : ");
    paramString2.append(str2);
    return paramString2.toString();
  }
  
  public final int zza(String paramString, Object... paramVarArgs)
  {
    if (Log.isLoggable("PlayCore", 6)) {
      return Log.e("PlayCore", zze(this.zza, paramString, paramVarArgs));
    }
    return 0;
  }
  
  public final int zzb(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    if (Log.isLoggable("PlayCore", 6)) {
      return Log.e("PlayCore", zze(this.zza, paramString, paramVarArgs), paramThrowable);
    }
    return 0;
  }
  
  public final int zzc(String paramString, Object... paramVarArgs)
  {
    if (Log.isLoggable("PlayCore", 4)) {
      return Log.i("PlayCore", zze(this.zza, paramString, paramVarArgs));
    }
    return 0;
  }
  
  public final int zzd(String paramString, Object... paramVarArgs)
  {
    if (Log.isLoggable("PlayCore", 5)) {
      return Log.w("PlayCore", zze(this.zza, "Phonesky package is not signed -- possibly self-built package. Could not verify.", paramVarArgs));
    }
    return 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfno.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */