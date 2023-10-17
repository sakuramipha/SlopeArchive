package com.google.android.gms.internal.ads;

import java.util.Objects;

final class zzhy
  implements zzkh
{
  private final zzlk zza;
  private final zzhx zzb;
  private zzle zzc;
  private zzkh zzd;
  private boolean zze;
  private boolean zzf;
  
  public zzhy(zzhx paramzzhx, zzdz paramzzdz)
  {
    this.zzb = paramzzhx;
    this.zza = new zzlk(paramzzdz);
    this.zze = true;
  }
  
  public final long zza()
  {
    throw null;
  }
  
  public final long zzb(boolean paramBoolean)
  {
    Object localObject = this.zzc;
    long l;
    if ((localObject != null) && (!((zzle)localObject).zzO()) && ((this.zzc.zzP()) || ((!paramBoolean) && (!this.zzc.zzI()))))
    {
      localObject = this.zzd;
      Objects.requireNonNull(localObject);
      l = ((zzkh)localObject).zza();
      if (this.zze)
      {
        if (l < this.zza.zza())
        {
          this.zza.zze();
          break label194;
        }
        this.zze = false;
        if (this.zzf) {
          this.zza.zzd();
        }
      }
      this.zza.zzb(l);
      localObject = ((zzkh)localObject).zzc();
      if (!((zzci)localObject).equals(this.zza.zzc()))
      {
        this.zza.zzg((zzci)localObject);
        this.zzb.zza((zzci)localObject);
      }
    }
    else
    {
      this.zze = true;
      if (this.zzf) {
        this.zza.zzd();
      }
    }
    label194:
    if (this.zze)
    {
      l = this.zza.zza();
    }
    else
    {
      localObject = this.zzd;
      Objects.requireNonNull(localObject);
      l = ((zzkh)localObject).zza();
    }
    return l;
  }
  
  public final zzci zzc()
  {
    Object localObject = this.zzd;
    if (localObject != null) {
      localObject = ((zzkh)localObject).zzc();
    } else {
      localObject = this.zza.zzc();
    }
    return (zzci)localObject;
  }
  
  public final void zzd(zzle paramzzle)
  {
    if (paramzzle == this.zzc)
    {
      this.zzd = null;
      this.zzc = null;
      this.zze = true;
    }
  }
  
  public final void zze(zzle paramzzle)
    throws zzia
  {
    zzkh localzzkh1 = paramzzle.zzi();
    if (localzzkh1 != null)
    {
      zzkh localzzkh2 = this.zzd;
      if (localzzkh1 != localzzkh2)
      {
        if (localzzkh2 == null)
        {
          this.zzd = localzzkh1;
          this.zzc = paramzzle;
          localzzkh1.zzg(this.zza.zzc());
          return;
        }
        throw zzia.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
      }
    }
  }
  
  public final void zzf(long paramLong)
  {
    this.zza.zzb(paramLong);
  }
  
  public final void zzg(zzci paramzzci)
  {
    zzkh localzzkh = this.zzd;
    zzci localzzci = paramzzci;
    if (localzzkh != null)
    {
      localzzkh.zzg(paramzzci);
      localzzci = this.zzd.zzc();
    }
    this.zza.zzg(localzzci);
  }
  
  public final void zzh()
  {
    this.zzf = true;
    this.zza.zzd();
  }
  
  public final void zzi()
  {
    this.zzf = false;
    this.zza.zze();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */