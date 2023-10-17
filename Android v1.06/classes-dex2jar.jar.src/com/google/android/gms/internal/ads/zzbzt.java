package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Iterator;

public class zzbzt
{
  protected static final zzfpm zza = zzfpm.zzb(4000);
  
  static String zzd(String paramString)
  {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    Object localObject = paramString;
    if (arrayOfStackTraceElement.length >= 4)
    {
      int i = arrayOfStackTraceElement[3].getLineNumber();
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(" @");
      ((StringBuilder)localObject).append(i);
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public static void zze(String paramString)
  {
    if (zzm(3))
    {
      int i;
      if ((paramString != null) && (paramString.length() > 4000))
      {
        paramString = zza.zzd(paramString).iterator();
        i = 1;
      }
      while (paramString.hasNext())
      {
        String str = (String)paramString.next();
        if (i != 0) {
          Log.d("Ads", str);
        } else {
          Log.d("Ads-cont", str);
        }
        i = 0;
        continue;
        Log.d("Ads", paramString);
      }
    }
  }
  
  public static void zzf(String paramString, Throwable paramThrowable)
  {
    if (zzm(3)) {
      Log.d("Ads", paramString, paramThrowable);
    }
  }
  
  public static void zzg(String paramString)
  {
    if (zzm(6))
    {
      int i;
      if ((paramString != null) && (paramString.length() > 4000))
      {
        paramString = zza.zzd(paramString).iterator();
        i = 1;
      }
      while (paramString.hasNext())
      {
        String str = (String)paramString.next();
        if (i != 0) {
          Log.e("Ads", str);
        } else {
          Log.e("Ads-cont", str);
        }
        i = 0;
        continue;
        Log.e("Ads", paramString);
      }
    }
  }
  
  public static void zzh(String paramString, Throwable paramThrowable)
  {
    if (zzm(6)) {
      Log.e("Ads", paramString, paramThrowable);
    }
  }
  
  public static void zzi(String paramString)
  {
    if (zzm(4))
    {
      int i;
      if ((paramString != null) && (paramString.length() > 4000))
      {
        paramString = zza.zzd(paramString).iterator();
        i = 1;
      }
      while (paramString.hasNext())
      {
        String str = (String)paramString.next();
        if (i != 0) {
          Log.i("Ads", str);
        } else {
          Log.i("Ads-cont", str);
        }
        i = 0;
        continue;
        Log.i("Ads", paramString);
      }
    }
  }
  
  public static void zzj(String paramString)
  {
    if (zzm(5))
    {
      Iterator localIterator;
      int i;
      if ((paramString != null) && (paramString.length() > 4000))
      {
        localIterator = zza.zzd(paramString).iterator();
        i = 1;
      }
      while (localIterator.hasNext())
      {
        paramString = (String)localIterator.next();
        if (i != 0) {
          Log.w("Ads", paramString);
        } else {
          Log.w("Ads-cont", paramString);
        }
        i = 0;
        continue;
        Log.w("Ads", paramString);
      }
    }
  }
  
  public static void zzk(String paramString, Throwable paramThrowable)
  {
    if (zzm(5)) {
      Log.w("Ads", paramString, paramThrowable);
    }
  }
  
  public static void zzl(String paramString, Throwable paramThrowable)
  {
    if (zzm(5))
    {
      if (paramThrowable != null)
      {
        zzk(zzd(paramString), paramThrowable);
        return;
      }
      zzj(zzd(paramString));
    }
  }
  
  public static boolean zzm(int paramInt)
  {
    return (paramInt >= 5) || (Log.isLoggable("Ads", paramInt));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */