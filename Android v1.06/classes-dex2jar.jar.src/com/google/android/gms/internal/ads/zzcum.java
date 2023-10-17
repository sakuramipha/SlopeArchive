package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

public final class zzcum
{
  private final zzfed zza;
  private final zzbzz zzb;
  private final ApplicationInfo zzc;
  private final String zzd;
  private final List zze;
  private final PackageInfo zzf;
  private final zzgvi zzg;
  private final String zzh;
  private final zzeqt zzi;
  private final zzg zzj;
  private final zzfaa zzk;
  
  public zzcum(zzfed paramzzfed, zzbzz paramzzbzz, ApplicationInfo paramApplicationInfo, String paramString1, List paramList, PackageInfo paramPackageInfo, zzgvi paramzzgvi, zzg paramzzg, String paramString2, zzeqt paramzzeqt, zzfaa paramzzfaa)
  {
    this.zza = paramzzfed;
    this.zzb = paramzzbzz;
    this.zzc = paramApplicationInfo;
    this.zzd = paramString1;
    this.zze = paramList;
    this.zzf = paramPackageInfo;
    this.zzg = paramzzgvi;
    this.zzh = paramString2;
    this.zzi = paramzzeqt;
    this.zzj = paramzzg;
    this.zzk = paramzzfaa;
  }
  
  public final zzfwb zzb()
  {
    zzfed localzzfed = this.zza;
    zzfdx localzzfdx = zzfdx.zza;
    return zzfdn.zzc(this.zzi.zza(new Bundle()), localzzfdx, localzzfed).zza();
  }
  
  public final zzfwb zzc()
  {
    zzfwb localzzfwb = zzb();
    return this.zza.zza(zzfdx.zzb, new zzfwb[] { localzzfwb, (zzfwb)this.zzg.zzb() }).zza(new zzcul(this, localzzfwb)).zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */