package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzeff
  extends zzefa
{
  private final zzcgw zza;
  private final zzcuq zzb;
  private final zzeho zzc;
  private final zzdav zzd;
  private final zzefk zze;
  private final zzeca zzf;
  
  public zzeff(zzcgw paramzzcgw, zzcuq paramzzcuq, zzeho paramzzeho, zzdav paramzzdav, zzefk paramzzefk, zzeca paramzzeca)
  {
    this.zza = paramzzcgw;
    this.zzb = paramzzcuq;
    this.zzc = paramzzeho;
    this.zzd = paramzzdav;
    this.zze = paramzzefk;
    this.zzf = paramzzeca;
  }
  
  protected final zzfwb zzc(zzfaa paramzzfaa, Bundle paramBundle, zzezf paramzzezf, zzezr paramzzezr)
  {
    zzcuq localzzcuq = this.zzb;
    localzzcuq.zzi(paramzzfaa);
    localzzcuq.zzf(paramBundle);
    localzzcuq.zzg(new zzcuk(paramzzezr, paramzzezf, this.zze));
    paramzzfaa = zzbbk.zzdj;
    if (((Boolean)zzba.zzc().zzb(paramzzfaa)).booleanValue()) {
      this.zzb.zzd(this.zzf);
    }
    paramzzfaa = this.zza.zzf();
    paramzzfaa.zze(this.zzb.zzj());
    paramzzfaa.zzd(this.zzd);
    paramzzfaa.zzc(this.zzc);
    paramzzfaa = paramzzfaa.zzf().zza();
    return paramzzfaa.zzi(paramzzfaa.zzj());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */