package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzdxr
  implements zzgvo
{
  private final zzgwb zza;
  private final zzgwb zzb;
  
  public zzdxr(zzgwb paramzzgwb1, zzgwb paramzzgwb2)
  {
    this.zza = paramzzgwb1;
    this.zzb = paramzzgwb2;
  }
  
  public final zzdxq zza()
  {
    return new zzdxq(((zzchc)this.zza).zza(), (ScheduledExecutorService)this.zzb.zzb());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdxr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */