package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzdxo
  implements zzgvo
{
  private final zzgwb zza;
  private final zzgwb zzb;
  
  public zzdxo(zzgwb paramzzgwb1, zzgwb paramzzgwb2)
  {
    this.zza = paramzzgwb1;
    this.zzb = paramzzgwb2;
  }
  
  public final zzdxn zza()
  {
    return new zzdxn(((zzchc)this.zza).zza(), (ScheduledExecutorService)this.zzb.zzb());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdxo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */