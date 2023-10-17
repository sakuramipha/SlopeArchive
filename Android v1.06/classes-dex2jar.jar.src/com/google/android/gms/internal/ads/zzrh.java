package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

final class zzrh
{
  private long zza;
  private long zzb;
  private boolean zzc;
  
  private final long zzd(long paramLong)
  {
    return this.zza + Math.max(0L, (this.zzb - 529L) * 1000000L / paramLong);
  }
  
  public final long zza(zzam paramzzam)
  {
    return zzd(paramzzam.zzA);
  }
  
  public final long zzb(zzam paramzzam, zzhi paramzzhi)
  {
    if (this.zzb == 0L) {
      this.zza = paramzzhi.zzd;
    }
    if (this.zzc) {
      return paramzzhi.zzd;
    }
    ByteBuffer localByteBuffer = paramzzhi.zzb;
    Objects.requireNonNull(localByteBuffer);
    int j = 0;
    int i = 0;
    while (j < 4)
    {
      i = i << 8 | localByteBuffer.get(j) & 0xFF;
      j++;
    }
    i = zzabi.zzc(i);
    if (i == -1)
    {
      this.zzc = true;
      this.zzb = 0L;
      this.zza = paramzzhi.zzd;
      zzer.zze("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
      return paramzzhi.zzd;
    }
    long l = zzd(paramzzam.zzA);
    this.zzb += i;
    return l;
  }
  
  public final void zzc()
  {
    this.zza = 0L;
    this.zzb = 0L;
    this.zzc = false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */