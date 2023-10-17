package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import javax.annotation.Nullable;

public final class zzefh
  extends zzefa
{
  private final zzcgw zza;
  private final zzcuq zzb;
  private final zzdav zzc;
  private final zzefk zzd;
  @Nullable
  private final zzezs zze;
  private final zzeca zzf;
  
  public zzefh(zzcgw paramzzcgw, zzcuq paramzzcuq, zzdav paramzzdav, @Nullable zzezs paramzzezs, zzefk paramzzefk, zzeca paramzzeca)
  {
    this.zza = paramzzcgw;
    this.zzb = paramzzcuq;
    this.zzc = paramzzdav;
    this.zze = paramzzezs;
    this.zzd = paramzzefk;
    this.zzf = paramzzeca;
  }
  
  protected final zzfwb zzc(zzfaa paramzzfaa, Bundle paramBundle, zzezf paramzzezf, zzezr paramzzezr)
  {
    zzcuq localzzcuq = this.zzb;
    localzzcuq.zzi(paramzzfaa);
    localzzcuq.zzf(paramBundle);
    localzzcuq.zzg(new zzcuk(paramzzezr, paramzzezf, this.zzd));
    paramzzfaa = zzbbk.zzdi;
    if (((Boolean)zzba.zzc().zzb(paramzzfaa)).booleanValue())
    {
      paramzzfaa = this.zze;
      if (paramzzfaa != null) {
        this.zzb.zzh(paramzzfaa);
      }
    }
    paramzzfaa = zzbbk.zzdj;
    if (((Boolean)zzba.zzc().zzb(paramzzfaa)).booleanValue()) {
      this.zzb.zzd(this.zzf);
    }
    paramzzfaa = this.zza.zzh();
    paramzzfaa.zzd(this.zzb.zzj());
    paramzzfaa.zzc(this.zzc);
    paramzzfaa = paramzzfaa.zze().zzb();
    return paramzzfaa.zzi(paramzzfaa.zzj());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzefh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */