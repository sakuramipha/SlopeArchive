package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;

public final class zzcsw
  implements zzcww, zza, zzcyd, zzcwc, zzcvi, zzdap
{
  private final Clock zza;
  private final zzbyv zzb;
  
  public zzcsw(Clock paramClock, zzbyv paramzzbyv)
  {
    this.zza = paramClock;
    this.zzb = paramzzbyv;
  }
  
  public final void onAdClicked()
  {
    this.zzb.zzd();
  }
  
  public final void zzb(zzezr paramzzezr)
  {
    this.zzb.zzk(this.zza.elapsedRealtime());
  }
  
  public final void zzbA(zzbug paramzzbug) {}
  
  public final void zzbr() {}
  
  public final String zzc()
  {
    return this.zzb.zzc();
  }
  
  public final void zzd() {}
  
  public final void zze(zzaxs paramzzaxs)
  {
    this.zzb.zzi();
  }
  
  public final void zzf(zzaxs paramzzaxs) {}
  
  public final void zzg(zzl paramzzl)
  {
    this.zzb.zzj(paramzzl);
  }
  
  public final void zzh(boolean paramBoolean) {}
  
  public final void zzi(zzaxs paramzzaxs)
  {
    this.zzb.zzg();
  }
  
  public final void zzj()
  {
    this.zzb.zze();
  }
  
  public final void zzk(boolean paramBoolean) {}
  
  public final void zzl()
  {
    this.zzb.zzf();
  }
  
  public final void zzm() {}
  
  public final void zzn()
  {
    this.zzb.zzh(true);
  }
  
  public final void zzo() {}
  
  public final void zzp(zzbuw paramzzbuw, String paramString1, String paramString2) {}
  
  public final void zzq() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcsw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */