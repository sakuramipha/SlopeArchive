package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzduz
  implements zzgvo
{
  private final zzgwb zza;
  private final zzgwb zzb;
  private final zzgwb zzc;
  private final zzgwb zzd;
  private final zzgwb zze;
  
  public zzduz(zzgwb paramzzgwb1, zzgwb paramzzgwb2, zzgwb paramzzgwb3, zzgwb paramzzgwb4, zzgwb paramzzgwb5)
  {
    this.zza = paramzzgwb1;
    this.zzb = paramzzgwb2;
    this.zzc = paramzzgwb3;
    this.zzd = paramzzgwb4;
    this.zze = paramzzgwb5;
  }
  
  public final zzduy zza()
  {
    ScheduledExecutorService localScheduledExecutorService = (ScheduledExecutorService)this.zza.zzb();
    zzfwc localzzfwc1 = zzcag.zza;
    zzgvw.zzb(localzzfwc1);
    zzfwc localzzfwc2 = zzcag.zzb;
    zzgvw.zzb(localzzfwc2);
    return new zzduy(localScheduledExecutorService, localzzfwc1, localzzfwc2, ((zzdvq)this.zzd).zza(), zzgvn.zza(this.zze));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzduz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */