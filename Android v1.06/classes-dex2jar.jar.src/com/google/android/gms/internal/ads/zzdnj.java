package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzb;
import java.util.concurrent.Executor;

public final class zzdnj
{
  private final zzcvg zza;
  private final zzdcu zzb;
  private final zzcwp zzc;
  private final zzcxc zzd;
  private final zzcxo zze;
  private final zzdac zzf;
  private final Executor zzg;
  private final zzdcq zzh;
  private final zzcnz zzi;
  private final zzb zzj;
  private final zzbwu zzk;
  private final zzaqq zzl;
  private final zzczt zzm;
  private final zzebc zzn;
  private final zzfgj zzo;
  private final zzdqc zzp;
  private final zzfen zzq;
  
  public zzdnj(zzcvg paramzzcvg, zzcwp paramzzcwp, zzcxc paramzzcxc, zzcxo paramzzcxo, zzdac paramzzdac, Executor paramExecutor, zzdcq paramzzdcq, zzcnz paramzzcnz, zzb paramzzb, zzbwu paramzzbwu, zzaqq paramzzaqq, zzczt paramzzczt, zzebc paramzzebc, zzfgj paramzzfgj, zzdqc paramzzdqc, zzfen paramzzfen, zzdcu paramzzdcu)
  {
    this.zza = paramzzcvg;
    this.zzc = paramzzcwp;
    this.zzd = paramzzcxc;
    this.zze = paramzzcxo;
    this.zzf = paramzzdac;
    this.zzg = paramExecutor;
    this.zzh = paramzzdcq;
    this.zzi = paramzzcnz;
    this.zzj = paramzzb;
    this.zzk = paramzzbwu;
    this.zzl = paramzzaqq;
    this.zzm = paramzzczt;
    this.zzn = paramzzebc;
    this.zzo = paramzzfgj;
    this.zzp = paramzzdqc;
    this.zzq = paramzzfen;
    this.zzb = paramzzdcu;
  }
  
  public static final zzfwb zzj(zzcfb paramzzcfb, String paramString1, String paramString2)
  {
    zzcal localzzcal = new zzcal();
    paramzzcfb.zzN().zzA(new zzdnh(localzzcal));
    paramzzcfb.zzab(paramString1, paramString2, null);
    return localzzcal;
  }
  
  public final void zzi(zzcfb paramzzcfb, boolean paramBoolean, zzbik paramzzbik)
  {
    paramzzcfb.zzN().zzM(new zzdna(this), this.zzd, this.zze, new zzdnb(this), new zzdnc(this), paramBoolean, paramzzbik, this.zzj, new zzdni(this), this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, null, this.zzb, null, null);
    paramzzcfb.setOnTouchListener(new zzdnd(this));
    paramzzcfb.setOnClickListener(new zzdne(this));
    paramzzbik = zzbbk.zzcn;
    if (((Boolean)zzba.zzc().zzb(paramzzbik)).booleanValue())
    {
      paramzzbik = this.zzl.zzc();
      if (paramzzbik != null) {
        paramzzbik.zzo((View)paramzzcfb);
      }
    }
    this.zzh.zzm(paramzzcfb, this.zzg);
    this.zzh.zzm(new zzdnf(paramzzcfb), this.zzg);
    this.zzh.zza((View)paramzzcfb);
    paramzzcfb.zzad("/trackActiveViewUnit", new zzdng(this, paramzzcfb));
    this.zzi.zzi(paramzzcfb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdnj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */