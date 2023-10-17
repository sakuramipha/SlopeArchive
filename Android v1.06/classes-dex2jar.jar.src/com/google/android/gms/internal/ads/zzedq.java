package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzedq
  implements zzgvo
{
  private final zzgwb zza;
  private final zzgwb zzb;
  private final zzgwb zzc;
  private final zzgwb zzd;
  private final zzgwb zze;
  
  public zzedq(zzgwb paramzzgwb1, zzgwb paramzzgwb2, zzgwb paramzzgwb3, zzgwb paramzzgwb4, zzgwb paramzzgwb5)
  {
    this.zza = paramzzgwb1;
    this.zzb = paramzzgwb2;
    this.zzc = paramzzgwb3;
    this.zzd = paramzzgwb4;
    this.zze = paramzzgwb5;
  }
  
  public final zzedp zza()
  {
    zzcqa localzzcqa = (zzcqa)this.zza.zzb();
    zzecw localzzecw = ((zzecx)this.zzb).zza();
    zzcvk localzzcvk = (zzcvk)this.zzc.zzb();
    ScheduledExecutorService localScheduledExecutorService = (ScheduledExecutorService)this.zzd.zzb();
    zzfwc localzzfwc = zzcag.zza;
    zzgvw.zzb(localzzfwc);
    return new zzedp(localzzcqa, localzzecw, localzzcvk, localScheduledExecutorService, localzzfwc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzedq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */