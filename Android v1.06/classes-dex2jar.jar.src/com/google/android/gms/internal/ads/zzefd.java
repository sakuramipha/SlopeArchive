package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzefd
  extends zzefa
{
  private final zzcgw zza;
  private final zzcuq zzb;
  private final zzeho zzc;
  private final zzdav zzd;
  private final zzdfh zze;
  private final zzcxx zzf;
  private final ViewGroup zzg;
  private final zzdae zzh;
  private final zzefk zzi;
  private final zzeca zzj;
  
  public zzefd(zzcgw paramzzcgw, zzcuq paramzzcuq, zzeho paramzzeho, zzdav paramzzdav, zzdfh paramzzdfh, zzcxx paramzzcxx, ViewGroup paramViewGroup, zzdae paramzzdae, zzefk paramzzefk, zzeca paramzzeca)
  {
    this.zza = paramzzcgw;
    this.zzb = paramzzcuq;
    this.zzc = paramzzeho;
    this.zzd = paramzzdav;
    this.zze = paramzzdfh;
    this.zzf = paramzzcxx;
    this.zzg = paramViewGroup;
    this.zzh = paramzzdae;
    this.zzi = paramzzefk;
    this.zzj = paramzzeca;
  }
  
  protected final zzfwb zzc(zzfaa paramzzfaa, Bundle paramBundle, zzezf paramzzezf, zzezr paramzzezr)
  {
    zzcuq localzzcuq = this.zzb;
    localzzcuq.zzi(paramzzfaa);
    localzzcuq.zzf(paramBundle);
    localzzcuq.zzg(new zzcuk(paramzzezr, paramzzezf, this.zzi));
    paramzzfaa = zzbbk.zzdj;
    if (((Boolean)zzba.zzc().zzb(paramzzfaa)).booleanValue()) {
      this.zzb.zzd(this.zzj);
    }
    paramzzfaa = this.zza.zzd();
    paramzzfaa.zzi(this.zzb.zzj());
    paramzzfaa.zzf(this.zzd);
    paramzzfaa.zze(this.zzc);
    paramzzfaa.zzd(this.zze);
    paramzzfaa.zzg(new zzcqx(this.zzf, this.zzh));
    paramzzfaa.zzc(new zzcpa(this.zzg));
    paramzzfaa = paramzzfaa.zzk().zzd();
    return paramzzfaa.zzi(paramzzfaa.zzj());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzefd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */