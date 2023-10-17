package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

public final class zzchw
  implements zzgvo
{
  private final zzgwb zza;
  private final zzgwb zzb;
  
  public zzchw(zzgwb paramzzgwb1, zzgwb paramzzgwb2)
  {
    this.zza = paramzzgwb1;
    this.zzb = paramzzgwb2;
  }
  
  public final zzbur zza()
  {
    Context localContext = ((zzchc)this.zza).zza();
    Object localObject = (zzfft)this.zzb.zzb();
    zzt.zzf().zzb(localContext, zzbzz.zza(), (zzfft)localObject).zza("google.afma.request.getAdDictionary", zzbmv.zza, zzbmv.zza);
    localObject = zzt.zzf().zzb(localContext, zzbzz.zza(), (zzfft)localObject);
    zzbms localzzbms = zzbmv.zza;
    return new zzbuq(localContext, ((zzbmy)localObject).zza("google.afma.sdkConstants.getSdkConstants", localzzbms, localzzbms));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzchw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */