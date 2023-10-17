package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;

public final class zzbgv
{
  private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
  private final NativeCustomTemplateAd.OnCustomClickListener zzb;
  private NativeCustomTemplateAd zzc;
  
  public zzbgv(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener paramOnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener paramOnCustomClickListener)
  {
    this.zza = paramOnCustomTemplateAdLoadedListener;
    this.zzb = paramOnCustomClickListener;
  }
  
  private final NativeCustomTemplateAd zzf(zzbfk paramzzbfk)
  {
    try
    {
      Object localObject = this.zzc;
      if (localObject != null) {
        return (NativeCustomTemplateAd)localObject;
      }
      localObject = new com/google/android/gms/internal/ads/zzbfl;
      ((zzbfl)localObject).<init>(paramzzbfk);
      this.zzc = ((NativeCustomTemplateAd)localObject);
      return (NativeCustomTemplateAd)localObject;
    }
    finally {}
  }
  
  public final zzbfu zzd()
  {
    if (this.zzb == null) {
      return null;
    }
    return new zzbgs(this, null);
  }
  
  public final zzbfx zze()
  {
    return new zzbgu(this, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */