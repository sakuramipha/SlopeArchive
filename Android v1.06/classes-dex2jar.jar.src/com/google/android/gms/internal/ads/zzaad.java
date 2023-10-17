package com.google.android.gms.internal.ads;

public class zzaad
  implements zzabn
{
  private final long zza;
  private final long zzb;
  private final int zzc;
  private final long zzd;
  private final int zze;
  private final long zzf;
  
  public zzaad(long paramLong1, long paramLong2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.zza = paramLong1;
    this.zzb = paramLong2;
    int i = paramInt2;
    if (paramInt2 == -1) {
      i = 1;
    }
    this.zzc = i;
    this.zze = paramInt1;
    if (paramLong1 == -1L) {
      this.zzd = -1L;
    }
    for (paramLong1 = -9223372036854775807L;; paramLong1 = zzb(paramLong1, paramLong2, paramInt1))
    {
      this.zzf = paramLong1;
      return;
      this.zzd = (paramLong1 - paramLong2);
    }
  }
  
  private static long zzb(long paramLong1, long paramLong2, int paramInt)
  {
    return Math.max(0L, paramLong1 - paramLong2) * 8000000L / paramInt;
  }
  
  public final long zza(long paramLong)
  {
    return zzb(paramLong, this.zzb, this.zze);
  }
  
  public final long zze()
  {
    return this.zzf;
  }
  
  public final zzabl zzg(long paramLong)
  {
    long l4 = this.zzd;
    boolean bool = l4 < -1L;
    if (bool)
    {
      long l1 = this.zze;
      long l3 = this.zzc;
      long l2 = l1 * paramLong / 8000000L / l3 * l3;
      l1 = l2;
      if (bool) {
        l1 = Math.min(l2, l4 - l3);
      }
      l1 = Math.max(l1, 0L);
      l1 = this.zzb + l1;
      l2 = zza(l1);
      localzzabo = new zzabo(l2, l1);
      if ((this.zzd != -1L) && (l2 < paramLong))
      {
        paramLong = l1 + this.zzc;
        if (paramLong < this.zza) {
          return new zzabl(localzzabo, new zzabo(zza(paramLong), paramLong));
        }
      }
      return new zzabl(localzzabo, localzzabo);
    }
    zzabo localzzabo = new zzabo(0L, this.zzb);
    return new zzabl(localzzabo, localzzabo);
  }
  
  public final boolean zzh()
  {
    return this.zzd != -1L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */