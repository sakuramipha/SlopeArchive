package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build.VERSION;

public final class zzaqu
{
  private NetworkCapabilities zza;
  
  zzaqu(ConnectivityManager paramConnectivityManager)
  {
    if ((paramConnectivityManager != null) && (Build.VERSION.SDK_INT >= 24)) {
      try
      {
        zzaqt localzzaqt = new com/google/android/gms/internal/ads/zzaqt;
        localzzaqt.<init>(this);
        paramConnectivityManager.registerDefaultNetworkCallback(localzzaqt);
        return;
      }
      catch (RuntimeException paramConnectivityManager)
      {
        try
        {
          this.zza = null;
          return;
        }
        finally {}
      }
    }
  }
  
  public static zzaqu zzc(Context paramContext)
  {
    if (paramContext != null) {
      return new zzaqu((ConnectivityManager)paramContext.getSystemService("connectivity"));
    }
    return null;
  }
  
  public final long zza()
  {
    try
    {
      NetworkCapabilities localNetworkCapabilities = this.zza;
      if (localNetworkCapabilities != null)
      {
        if (localNetworkCapabilities.hasTransport(4)) {
          return 2L;
        }
        if (this.zza.hasTransport(1)) {
          return 1L;
        }
        if (this.zza.hasTransport(0)) {
          return 0L;
        }
      }
      return -1L;
    }
    finally {}
  }
  
  public final NetworkCapabilities zzb()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */