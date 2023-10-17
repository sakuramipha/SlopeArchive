package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzedp
  implements zzebv
{
  private final zzcqa zza;
  private final zzecw zzb;
  private final zzfwc zzc;
  private final zzcvk zzd;
  private final ScheduledExecutorService zze;
  
  public zzedp(zzcqa paramzzcqa, zzecw paramzzecw, zzcvk paramzzcvk, ScheduledExecutorService paramScheduledExecutorService, zzfwc paramzzfwc)
  {
    this.zza = paramzzcqa;
    this.zzb = paramzzecw;
    this.zzd = paramzzcvk;
    this.zze = paramScheduledExecutorService;
    this.zzc = paramzzfwc;
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf)
  {
    return this.zzc.zzb(new zzedm(this, paramzzezr, paramzzezf));
  }
  
  public final boolean zzb(zzezr paramzzezr, zzezf paramzzezf)
  {
    return (paramzzezr.zza.zza.zza() != null) && (this.zzb.zzb(paramzzezr, paramzzezf));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzedp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */