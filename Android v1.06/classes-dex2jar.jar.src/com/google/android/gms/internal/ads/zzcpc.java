package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcpc
  implements zzgvo
{
  private final zzgwb zza;
  private final zzgwb zzb;
  
  public zzcpc(zzgwb paramzzgwb1, zzgwb paramzzgwb2)
  {
    this.zza = paramzzgwb1;
    this.zzb = paramzzgwb2;
  }
  
  public final zzcxx zza()
  {
    return new zzcxx((ScheduledExecutorService)this.zza.zzb(), (Clock)this.zzb.zzb());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcpc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */