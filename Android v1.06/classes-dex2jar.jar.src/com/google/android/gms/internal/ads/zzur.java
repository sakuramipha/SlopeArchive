package com.google.android.gms.internal.ads;

import java.util.Objects;

public final class zzur
  implements zztx
{
  private final zzfw zzc;
  private int zzd;
  private final zzuq zze;
  private final zzxq zzf;
  private final zzqi zzg;
  
  public zzur(zzfw paramzzfw, zzuq paramzzuq)
  {
    this.zzc = paramzzfw;
    this.zze = paramzzuq;
    this.zzg = localzzqi;
    this.zzf = localzzxq;
    this.zzd = 1048576;
  }
  
  public final zzur zza(int paramInt)
  {
    this.zzd = paramInt;
    return this;
  }
  
  public final zzut zzb(zzbq paramzzbq)
  {
    Objects.requireNonNull(paramzzbq.zzd);
    return new zzut(paramzzbq, this.zzc, this.zze, zzqr.zza, this.zzf, this.zzd, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */