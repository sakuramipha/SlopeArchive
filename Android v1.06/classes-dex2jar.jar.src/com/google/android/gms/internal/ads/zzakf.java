package com.google.android.gms.internal.ads;

final class zzakf
  implements zzabn
{
  private final zzakc zza;
  private final int zzb;
  private final long zzc;
  private final long zzd;
  private final long zze;
  
  public zzakf(zzakc paramzzakc, int paramInt, long paramLong1, long paramLong2)
  {
    this.zza = paramzzakc;
    this.zzb = paramInt;
    this.zzc = paramLong1;
    paramLong1 = (paramLong2 - paramLong1) / paramzzakc.zzd;
    this.zzd = paramLong1;
    this.zze = zza(paramLong1);
  }
  
  private final long zza(long paramLong)
  {
    return zzfn.zzp(paramLong * this.zzb, 1000000L, this.zza.zzc);
  }
  
  public final long zze()
  {
    return this.zze;
  }
  
  public final zzabl zzg(long paramLong)
  {
    long l1 = Math.max(0L, Math.min(this.zza.zzc * paramLong / (this.zzb * 1000000L), this.zzd - 1L));
    long l2 = this.zzc;
    long l4 = this.zza.zzd;
    long l3 = zza(l1);
    zzabo localzzabo = new zzabo(l3, l2 + l4 * l1);
    if ((l3 < paramLong) && (l1 != this.zzd - 1L))
    {
      paramLong = l1 + 1L;
      l1 = this.zzc;
      l2 = this.zza.zzd;
      return new zzabl(localzzabo, new zzabo(zza(paramLong), l1 + l2 * paramLong));
    }
    return new zzabl(localzzabo, localzzabo);
  }
  
  public final boolean zzh()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzakf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */