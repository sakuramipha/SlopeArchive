package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Collection;
import java.util.Iterator;

public final class zzfhj
{
  private static zzfhj zza;
  private float zzb = 0.0F;
  private final zzfhc zzc;
  private final zzfha zzd;
  private zzfhb zze;
  private zzfhd zzf;
  
  public zzfhj(zzfhc paramzzfhc, zzfha paramzzfha)
  {
    this.zzc = paramzzfhc;
    this.zzd = paramzzfha;
  }
  
  public static zzfhj zzb()
  {
    if (zza == null)
    {
      zzfha localzzfha = new zzfha();
      zza = new zzfhj(new zzfhc(), localzzfha);
    }
    return zza;
  }
  
  public final float zza()
  {
    return this.zzb;
  }
  
  public final void zzc(Context paramContext)
  {
    zzfgz localzzfgz = new zzfgz();
    this.zze = new zzfhb(new Handler(), paramContext, localzzfgz, this);
  }
  
  public final void zzd(float paramFloat)
  {
    this.zzb = paramFloat;
    if (this.zzf == null) {
      this.zzf = zzfhd.zza();
    }
    Iterator localIterator = this.zzf.zzb().iterator();
    while (localIterator.hasNext()) {
      ((zzfgs)localIterator.next()).zzg().zzh(paramFloat);
    }
  }
  
  public final void zze()
  {
    zzfhe.zza().zzd(this);
    zzfhe.zza().zzb();
    zzfif.zzd().zzi();
    this.zze.zza();
  }
  
  public final void zzf()
  {
    zzfif.zzd().zzj();
    zzfhe.zza().zzc();
    this.zze.zzb();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */