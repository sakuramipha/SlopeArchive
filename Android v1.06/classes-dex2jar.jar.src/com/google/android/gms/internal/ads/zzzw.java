package com.google.android.gms.internal.ads;

public final class zzzw
{
  private final long zza;
  private final long zzb;
  private final long zzc;
  private long zzd;
  private long zze;
  private long zzf;
  private long zzg;
  private long zzh;
  
  protected zzzw(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
  {
    this.zza = paramLong1;
    this.zzb = paramLong2;
    this.zzd = 0L;
    this.zze = paramLong4;
    this.zzf = paramLong5;
    this.zzg = paramLong6;
    this.zzc = paramLong7;
    this.zzh = zzf(paramLong2, 0L, paramLong4, paramLong5, paramLong6, paramLong7);
  }
  
  protected static long zzf(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    long l = paramLong4;
    if (paramLong4 + 1L < paramLong5) {
      if (1L + paramLong2 >= paramLong3)
      {
        l = paramLong4;
      }
      else
      {
        paramLong1 = ((float)(paramLong1 - paramLong2) * ((float)(paramLong5 - paramLong4) / (float)(paramLong3 - paramLong2)));
        l = Math.max(paramLong4, Math.min(paramLong4 + paramLong1 - paramLong6 - paramLong1 / 20L, paramLong5 - 1L));
      }
    }
    return l;
  }
  
  private final void zzi()
  {
    this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */