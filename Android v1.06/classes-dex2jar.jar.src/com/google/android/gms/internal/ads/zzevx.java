package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzevx
  implements zzeww
{
  private zzcup zza;
  private final Executor zzb = zzfwi.zzb();
  
  public final zzcup zza()
  {
    return this.zza;
  }
  
  public final zzfwb zzb(zzewx paramzzewx, zzewv paramzzewv, zzcup paramzzcup)
  {
    paramzzewx = paramzzewv.zza(paramzzewx.zzb);
    paramzzewx.zzb(new zzexa(true));
    paramzzewx = (zzcup)paramzzewx.zzh();
    this.zza = paramzzewx;
    paramzzewv = paramzzewx.zzb();
    paramzzewx = new zzfbv();
    return zzfvr.zzl(zzfvr.zzm(zzfvi.zzv(paramzzewv.zzj()), new zzevv(this, paramzzewx, paramzzewv), this.zzb), new zzevw(paramzzewx), this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzevx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */