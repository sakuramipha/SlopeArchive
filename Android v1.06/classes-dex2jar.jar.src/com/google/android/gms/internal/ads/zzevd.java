package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

public final class zzevd
  implements zzcvl, zzcxh, zzewt, zzo, zzcxt, zzcvy, zzdcw
{
  private final zzfbi zza;
  private final AtomicReference zzb = new AtomicReference();
  private final AtomicReference zzc = new AtomicReference();
  private final AtomicReference zzd = new AtomicReference();
  private final AtomicReference zze = new AtomicReference();
  private final AtomicReference zzf = new AtomicReference();
  private final AtomicReference zzg = new AtomicReference();
  private zzevd zzh = null;
  
  public zzevd(zzfbi paramzzfbi)
  {
    this.zza = paramzzfbi;
  }
  
  public static zzevd zzi(zzevd paramzzevd)
  {
    zzevd localzzevd = new zzevd(paramzzevd.zza);
    localzzevd.zzh = paramzzevd;
    return localzzevd;
  }
  
  public final void zza(zze paramzze)
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zza(paramzze);
      return;
    }
    zzewk.zza(this.zzb, new zzeuo(paramzze));
    zzewk.zza(this.zzb, new zzeuu(paramzze));
  }
  
  public final void zzb()
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zzb();
      return;
    }
    zzewk.zza(this.zzf, zzeuw.zza);
    zzewk.zza(this.zzd, zzeux.zza);
    zzewk.zza(this.zzd, zzeuy.zza);
  }
  
  public final void zzbF() {}
  
  public final void zzbG(zzewt paramzzewt)
  {
    this.zzh = ((zzevd)paramzzewt);
  }
  
  public final void zzbo() {}
  
  public final void zzby()
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zzby();
      return;
    }
    zzewk.zza(this.zzf, zzeut.zza);
  }
  
  public final void zze()
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zze();
      return;
    }
    zzewk.zza(this.zzf, zzeva.zza);
  }
  
  public final void zzf(int paramInt)
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zzf(paramInt);
      return;
    }
    zzewk.zza(this.zzf, new zzeus(paramInt));
  }
  
  public final void zzg()
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zzg();
      return;
    }
    zzewk.zza(this.zze, zzevc.zza);
  }
  
  public final void zzh(zzs paramzzs)
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zzh(paramzzs);
      return;
    }
    zzewk.zza(this.zzg, new zzeur(paramzzs));
  }
  
  public final void zzj()
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zzj();
      return;
    }
    this.zza.zza();
    zzewk.zza(this.zzc, zzeup.zza);
    zzewk.zza(this.zzd, zzeuq.zza);
  }
  
  public final void zzk(zze paramzze)
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zzk(paramzze);
      return;
    }
    zzewk.zza(this.zzd, new zzeuz(paramzze));
  }
  
  public final void zzl(zzavr paramzzavr)
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zzl(paramzzavr);
      return;
    }
    zzewk.zza(this.zzb, new zzeuv(paramzzavr));
  }
  
  public final void zzn(zzo paramzzo)
  {
    this.zzf.set(paramzzo);
  }
  
  public final void zzo(zzdg paramzzdg)
  {
    this.zzg.set(paramzzdg);
  }
  
  public final void zzp(zzavu paramzzavu)
  {
    this.zzb.set(paramzzavu);
  }
  
  public final void zzq(zzavy paramzzavy)
  {
    this.zzd.set(paramzzavy);
  }
  
  public final void zzr()
  {
    zzevd localzzevd = this.zzh;
    if (localzzevd != null)
    {
      localzzevd.zzr();
      return;
    }
    zzewk.zza(this.zzd, zzevb.zza);
  }
  
  public final void zzs() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzevd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */