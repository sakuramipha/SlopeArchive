package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzewi
  implements zzeww
{
  private final zzfbm zza;
  private final Executor zzb;
  private final zzfvn zzc = new zzewg(this);
  
  public zzewi(zzfbm paramzzfbm, Executor paramExecutor)
  {
    this.zza = paramzzfbm;
    this.zzb = paramExecutor;
  }
  
  public final zzfwb zzb(zzewx paramzzewx, zzewv paramzzewv, zzcup paramzzcup)
  {
    return zzfvr.zze(zzfvr.zzm(zzfvi.zzv(new zzews(this.zza, paramzzcup, this.zzb).zzc()), new zzewe(this, paramzzcup), this.zzb), Exception.class, new zzewf(this), this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzewi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */