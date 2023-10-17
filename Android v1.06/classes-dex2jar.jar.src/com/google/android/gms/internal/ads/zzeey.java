package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzeey
  extends zzefa
{
  private final zzcgw zza;
  private final zzdfh zzb;
  private final zzcuq zzc;
  private final zzdav zzd;
  private final zzefk zze;
  private final zzeca zzf;
  
  public zzeey(zzcgw paramzzcgw, zzdfh paramzzdfh, zzcuq paramzzcuq, zzdav paramzzdav, zzefk paramzzefk, zzeca paramzzeca)
  {
    this.zza = paramzzcgw;
    this.zzb = paramzzdfh;
    this.zzc = paramzzcuq;
    this.zzd = paramzzdav;
    this.zze = paramzzefk;
    this.zzf = paramzzeca;
  }
  
  protected final zzfwb zzc(zzfaa paramzzfaa, Bundle paramBundle, zzezf paramzzezf, zzezr paramzzezr)
  {
    zzcuq localzzcuq = this.zzc;
    localzzcuq.zzi(paramzzfaa);
    localzzcuq.zzf(paramBundle);
    localzzcuq.zzg(new zzcuk(paramzzezr, paramzzezf, this.zze));
    paramzzfaa = zzbbk.zzdj;
    if (((Boolean)zzba.zzc().zzb(paramzzfaa)).booleanValue()) {
      this.zzc.zzd(this.zzf);
    }
    paramzzfaa = this.zza.zzg();
    paramzzfaa.zzf(this.zzc.zzj());
    paramzzfaa.zze(this.zzd);
    paramzzfaa.zzd(this.zzb);
    paramzzfaa.zzc(new zzcpa(null));
    paramzzfaa = paramzzfaa.zzg().zza();
    return paramzzfaa.zzi(paramzzfaa.zzj());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */