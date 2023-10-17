package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzdku
{
  private final Executor zza;
  private final zzcoj zzb;
  private final zzdcq zzc;
  
  zzdku(Executor paramExecutor, zzcoj paramzzcoj, zzdcq paramzzdcq)
  {
    this.zza = paramExecutor;
    this.zzc = paramzzdcq;
    this.zzb = paramzzcoj;
  }
  
  public final void zza(zzcfb paramzzcfb)
  {
    if (paramzzcfb == null) {
      return;
    }
    this.zzc.zza(paramzzcfb.zzF());
    this.zzc.zzm(new zzdkq(paramzzcfb), this.zza);
    this.zzc.zzm(new zzdkr(paramzzcfb), this.zza);
    this.zzc.zzm(this.zzb, this.zza);
    this.zzb.zzf(paramzzcfb);
    paramzzcfb.zzad("/trackActiveViewUnit", new zzdks(this));
    paramzzcfb.zzad("/untrackActiveViewUnit", new zzdkt(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */