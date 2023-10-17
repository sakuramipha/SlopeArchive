package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;

final class zzwd
  extends zzwr
  implements Comparable
{
  private final int zze;
  private final boolean zzf;
  private final String zzg;
  private final zzwj zzh;
  private final boolean zzi;
  private final int zzj;
  private final int zzk;
  private final int zzl;
  private final boolean zzm;
  private final int zzn;
  private final int zzo;
  private final boolean zzp;
  private final int zzq;
  private final int zzr;
  private final int zzs;
  private final int zzt;
  private final boolean zzu;
  private final boolean zzv;
  
  public zzwd(int paramInt1, zzcz paramzzcz, int paramInt2, zzwj paramzzwj, int paramInt3, boolean paramBoolean, zzfpa paramzzfpa)
  {
    super(paramInt1, paramzzcz, paramInt2);
    this.zzh = paramzzwj;
    this.zzg = zzwv.zzf(this.zzd.zzd);
    int i = 0;
    this.zzi = zzwv.zzm(paramInt3, false);
    int j;
    for (paramInt1 = 0;; paramInt1++)
    {
      paramInt2 = paramzzwj.zzq.size();
      j = Integer.MAX_VALUE;
      if (paramInt1 >= paramInt2) {
        break;
      }
      int k = zzwv.zza(this.zzd, (String)paramzzwj.zzq.get(paramInt1), false);
      if (k > 0)
      {
        paramInt2 = paramInt1;
        paramInt1 = k;
        break label106;
      }
    }
    paramInt2 = Integer.MAX_VALUE;
    paramInt1 = 0;
    label106:
    this.zzk = paramInt2;
    this.zzj = paramInt1;
    paramInt1 = this.zzd.zzf;
    paramInt1 = paramzzwj.zzr;
    this.zzl = Integer.bitCount(0);
    paramzzcz = this.zzd;
    paramInt1 = paramzzcz.zzf;
    this.zzm = true;
    boolean bool;
    if (1 != (paramzzcz.zze & 0x1)) {
      bool = false;
    } else {
      bool = true;
    }
    this.zzp = bool;
    this.zzq = paramzzcz.zzz;
    this.zzr = paramzzcz.zzA;
    this.zzs = paramzzcz.zzi;
    if (paramzzcz.zzi != -1) {
      paramInt1 = paramzzwj.zzt;
    }
    if (paramzzcz.zzz != -1) {
      paramInt1 = paramzzwj.zzs;
    }
    this.zzf = paramzzfpa.zza(paramzzcz);
    paramzzcz = Resources.getSystem().getConfiguration();
    if (zzfn.zza >= 24) {
      paramzzcz = paramzzcz.getLocales().toLanguageTags().split(",", -1);
    } else {
      paramzzcz = new String[] { zzfn.zzw(paramzzcz.locale) };
    }
    for (paramInt1 = 0; paramInt1 < paramzzcz.length; paramInt1++) {
      paramzzcz[paramInt1] = zzfn.zzy(paramzzcz[paramInt1]);
    }
    for (paramInt1 = 0; paramInt1 < paramzzcz.length; paramInt1++)
    {
      paramInt2 = zzwv.zza(this.zzd, paramzzcz[paramInt1], false);
      if (paramInt2 > 0) {
        break label350;
      }
    }
    paramInt1 = Integer.MAX_VALUE;
    paramInt2 = 0;
    label350:
    this.zzn = paramInt1;
    this.zzo = paramInt2;
    for (paramInt1 = 0;; paramInt1++)
    {
      paramInt2 = j;
      if (paramInt1 >= paramzzwj.zzu.size()) {
        break;
      }
      paramzzcz = this.zzd.zzm;
      if ((paramzzcz != null) && (paramzzcz.equals(paramzzwj.zzu.get(paramInt1))))
      {
        paramInt2 = paramInt1;
        break;
      }
    }
    this.zzt = paramInt2;
    if ((paramInt3 & 0x180) == 128) {
      bool = true;
    } else {
      bool = false;
    }
    this.zzu = bool;
    if ((paramInt3 & 0x40) == 64) {
      bool = true;
    } else {
      bool = false;
    }
    this.zzv = bool;
    paramzzcz = this.zzh;
    if (!zzwv.zzm(paramInt3, paramzzcz.zzQ))
    {
      paramInt1 = i;
    }
    else
    {
      bool = this.zzf;
      if ((!bool) && (!paramzzcz.zzK))
      {
        paramInt1 = i;
      }
      else
      {
        if ((zzwv.zzm(paramInt3, false)) && (bool) && (this.zzd.zzi != -1))
        {
          bool = paramzzcz.zzA;
          bool = paramzzcz.zzz;
          if ((paramzzcz.zzS) || (!paramBoolean))
          {
            paramInt1 = 2;
            break label576;
          }
        }
        paramInt1 = 1;
      }
    }
    label576:
    this.zze = paramInt1;
  }
  
  public final int zza(zzwd paramzzwd)
  {
    zzfta localzzfta;
    if ((this.zzf) && (this.zzi)) {
      localzzfta = zzwv.zzd();
    } else {
      localzzfta = zzwv.zzd().zza();
    }
    zzfrg localzzfrg = zzfrg.zzj().zzd(this.zzi, paramzzwd.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(paramzzwd.zzk), zzfta.zzc().zza()).zzb(this.zzj, paramzzwd.zzj).zzb(this.zzl, paramzzwd.zzl).zzd(this.zzp, paramzzwd.zzp);
    boolean bool = paramzzwd.zzm;
    localzzfrg = localzzfrg.zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(paramzzwd.zzn), zzfta.zzc().zza()).zzb(this.zzo, paramzzwd.zzo).zzd(this.zzf, paramzzwd.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(paramzzwd.zzt), zzfta.zzc().zza());
    int i = this.zzs;
    int j = paramzzwd.zzs;
    bool = this.zzh.zzz;
    localzzfrg = localzzfrg.zzc(Integer.valueOf(i), Integer.valueOf(j), zzwv.zze()).zzd(this.zzu, paramzzwd.zzu).zzd(this.zzv, paramzzwd.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(paramzzwd.zzq), localzzfta).zzc(Integer.valueOf(this.zzr), Integer.valueOf(paramzzwd.zzr), localzzfta);
    j = this.zzs;
    i = paramzzwd.zzs;
    if (!zzfn.zzB(this.zzg, paramzzwd.zzg)) {
      localzzfta = zzwv.zze();
    }
    return localzzfrg.zzc(Integer.valueOf(j), Integer.valueOf(i), localzzfta).zza();
  }
  
  public final int zzb()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzwd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */