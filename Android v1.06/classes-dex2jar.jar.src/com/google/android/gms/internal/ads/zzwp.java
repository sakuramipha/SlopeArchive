package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class zzwp
  extends zzwr
  implements Comparable
{
  private final int zze;
  private final boolean zzf;
  private final boolean zzg;
  private final boolean zzh;
  private final int zzi;
  private final int zzj;
  private final int zzk;
  private final int zzl;
  private final boolean zzm;
  
  public zzwp(int paramInt1, zzcz paramzzcz, int paramInt2, zzwj paramzzwj, int paramInt3, String paramString)
  {
    super(paramInt1, paramzzcz, paramInt2);
    int i = 0;
    this.zzf = zzwv.zzm(paramInt3, false);
    paramInt1 = this.zzd.zze;
    paramInt2 = paramzzwj.zzx;
    boolean bool;
    if (1 != (paramInt1 & 0x1)) {
      bool = false;
    } else {
      bool = true;
    }
    this.zzg = bool;
    if ((paramInt1 & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    this.zzh = bool;
    if (paramzzwj.zzv.isEmpty()) {
      paramzzcz = zzfrr.zzm("");
    } else {
      paramzzcz = paramzzwj.zzv;
    }
    for (paramInt1 = 0; paramInt1 < paramzzcz.size(); paramInt1++)
    {
      zzam localzzam = this.zzd;
      String str = (String)paramzzcz.get(paramInt1);
      bool = paramzzwj.zzy;
      paramInt2 = zzwv.zza(localzzam, str, false);
      if (paramInt2 > 0) {
        break label163;
      }
    }
    paramInt1 = Integer.MAX_VALUE;
    paramInt2 = 0;
    label163:
    this.zzi = paramInt1;
    this.zzj = paramInt2;
    paramInt1 = this.zzd.zzf;
    paramInt1 = paramzzwj.zzw;
    paramInt1 = Integer.bitCount(0);
    this.zzk = paramInt1;
    int j = this.zzd.zzf;
    this.zzm = false;
    if (zzwv.zzf(paramString) == null) {
      bool = true;
    } else {
      bool = false;
    }
    j = zzwv.zza(this.zzd, paramString, bool);
    this.zzl = j;
    if ((paramInt2 <= 0) && ((!paramzzwj.zzv.isEmpty()) || (paramInt1 <= 0)) && (!this.zzg) && ((!this.zzh) || (j <= 0))) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    paramInt2 = i;
    if (zzwv.zzm(paramInt3, paramzzwj.zzQ))
    {
      paramInt2 = i;
      if (paramInt1 != 0) {
        paramInt2 = 1;
      }
    }
    this.zze = paramInt2;
  }
  
  public final int zza(zzwp paramzzwp)
  {
    zzfrg localzzfrg = zzfrg.zzj().zzd(this.zzf, paramzzwp.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(paramzzwp.zzi), zzfta.zzc().zza()).zzb(this.zzj, paramzzwp.zzj).zzb(this.zzk, paramzzwp.zzk).zzd(this.zzg, paramzzwp.zzg);
    boolean bool2 = this.zzh;
    boolean bool1 = paramzzwp.zzh;
    if (this.zzj == 0) {
      localObject = zzfta.zzc();
    } else {
      localObject = zzfta.zzc().zza();
    }
    localzzfrg = localzzfrg.zzc(Boolean.valueOf(bool2), Boolean.valueOf(bool1), (Comparator)localObject).zzb(this.zzl, paramzzwp.zzl);
    Object localObject = localzzfrg;
    if (this.zzk == 0)
    {
      bool1 = paramzzwp.zzm;
      localObject = localzzfrg.zze(false, false);
    }
    return ((zzfrg)localObject).zza();
  }
  
  public final int zzb()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzwp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */