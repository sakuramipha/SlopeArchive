package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener;

public final class zzbri
{
  private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
  private final NativeCustomFormatAd.OnCustomClickListener zzb;
  private NativeCustomFormatAd zzc;
  
  public zzbri(NativeCustomFormatAd.OnCustomFormatAdLoadedListener paramOnCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener paramOnCustomClickListener)
  {
    this.zza = paramOnCustomFormatAdLoadedListener;
    this.zzb = paramOnCustomClickListener;
  }
  
  private final NativeCustomFormatAd zzf(zzbfk paramzzbfk)
  {
    try
    {
      Object localObject = this.zzc;
      if (localObject != null) {
        return (NativeCustomFormatAd)localObject;
      }
      localObject = new com/google/android/gms/internal/ads/zzbrj;
      ((zzbrj)localObject).<init>(paramzzbfk);
      this.zzc = ((NativeCustomFormatAd)localObject);
      return (NativeCustomFormatAd)localObject;
    }
    finally {}
  }
  
  public final zzbfu zza()
  {
    if (this.zzb == null) {
      return null;
    }
    return new zzbrf(this, null);
  }
  
  public final zzbfx zzb()
  {
    return new zzbrh(this, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */