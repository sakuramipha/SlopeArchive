package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbmp
{
  private final Object zza = new Object();
  private final Object zzb = new Object();
  private zzbmy zzc;
  private zzbmy zzd;
  
  private static final Context zzc(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext == null) {
      return paramContext;
    }
    return localContext;
  }
  
  public final zzbmy zza(Context paramContext, zzbzz paramzzbzz, zzfft paramzzfft)
  {
    synchronized (this.zza)
    {
      if (this.zzc == null)
      {
        zzbmy localzzbmy = new com/google/android/gms/internal/ads/zzbmy;
        paramContext = zzc(paramContext);
        zzbbc localzzbbc = zzbbk.zza;
        localzzbmy.<init>(paramContext, paramzzbzz, (String)zzba.zzc().zzb(localzzbbc), paramzzfft);
        this.zzc = localzzbmy;
      }
      paramContext = this.zzc;
      return paramContext;
    }
  }
  
  public final zzbmy zzb(Context paramContext, zzbzz paramzzbzz, zzfft paramzzfft)
  {
    synchronized (this.zzb)
    {
      if (this.zzd == null)
      {
        zzbmy localzzbmy = new com/google/android/gms/internal/ads/zzbmy;
        localzzbmy.<init>(zzc(paramContext), paramzzbzz, (String)zzbdn.zzb.zze(), paramzzfft);
        this.zzd = localzzbmy;
      }
      paramContext = this.zzd;
      return paramContext;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbmp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */