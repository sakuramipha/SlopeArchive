package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzcun
  implements zzgvo
{
  private final zzgwb zza;
  private final zzgwb zzb;
  private final zzgwb zzc;
  private final zzgwb zzd;
  private final zzgwb zze;
  private final zzgwb zzf;
  private final zzgwb zzg;
  private final zzgwb zzh;
  private final zzgwb zzi;
  private final zzgwb zzj;
  private final zzgwb zzk;
  
  public zzcun(zzgwb paramzzgwb1, zzgwb paramzzgwb2, zzgwb paramzzgwb3, zzgwb paramzzgwb4, zzgwb paramzzgwb5, zzgwb paramzzgwb6, zzgwb paramzzgwb7, zzgwb paramzzgwb8, zzgwb paramzzgwb9, zzgwb paramzzgwb10, zzgwb paramzzgwb11)
  {
    this.zza = paramzzgwb1;
    this.zzb = paramzzgwb2;
    this.zzc = paramzzgwb3;
    this.zzd = paramzzgwb4;
    this.zze = paramzzgwb5;
    this.zzf = paramzzgwb6;
    this.zzg = paramzzgwb7;
    this.zzh = paramzzgwb8;
    this.zzi = paramzzgwb9;
    this.zzj = paramzzgwb10;
    this.zzk = paramzzgwb11;
  }
  
  public final zzcum zza()
  {
    zzfed localzzfed = (zzfed)this.zza.zzb();
    zzbzz localzzbzz = ((zzchn)this.zzb).zza();
    ApplicationInfo localApplicationInfo = ((zzdul)this.zzc).zza();
    String str = ((zzdur)this.zzd).zza();
    zzbbc localzzbbc = zzbbk.zza;
    return new zzcum(localzzfed, localzzbzz, localApplicationInfo, str, zzba.zza().zza(), (PackageInfo)this.zzf.zzb(), zzgvn.zza(this.zzg), ((zzcha)this.zzh).zza(), (String)this.zzi.zzb(), ((zzequ)this.zzj).zza(), ((zzcuz)this.zzk).zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */