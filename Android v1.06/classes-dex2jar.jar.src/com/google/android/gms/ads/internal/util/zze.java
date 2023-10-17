package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzfpm;
import java.util.Iterator;

public final class zze
  extends zzbzt
{
  public static void zza(String paramString)
  {
    if (zzc())
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
          Log.v("Ads", paramString);
        } else {
          Log.v("Ads-cont", paramString);
        }
        i = 0;
        continue;
        Log.v("Ads", paramString);
      }
    }
  }
  
  public static void zzb(String paramString, Throwable paramThrowable)
  {
    if (zzc()) {
      Log.v("Ads", paramString, paramThrowable);
    }
  }
  
  public static boolean zzc()
  {
    return (zzm(2)) && (((Boolean)zzbdh.zza.zze()).booleanValue());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */