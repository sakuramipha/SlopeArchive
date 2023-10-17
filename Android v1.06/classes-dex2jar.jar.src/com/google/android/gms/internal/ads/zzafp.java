package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzafp
{
  private static final long[] zza = { 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
  private final byte[] zzb = new byte[8];
  private int zzc;
  private int zzd;
  
  public static int zzb(int paramInt)
  {
    int j = 0;
    while (j < 8)
    {
      long l1 = zza[j];
      long l2 = paramInt;
      i = j + 1;
      j = i;
      if ((l1 & l2) != 0L) {
        return i;
      }
    }
    int i = -1;
    return i;
  }
  
  public static long zzc(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    long l2 = paramArrayOfByte[0] & 0xFF;
    long l1 = l2;
    if (paramBoolean) {
      l1 = l2 & (zza[(paramInt - 1)] ^ 0xFFFFFFFFFFFFFFFF);
    }
    for (int i = 1; i < paramInt; i++) {
      l1 = l1 << 8 | paramArrayOfByte[i] & 0xFF;
    }
    return l1;
  }
  
  public final int zza()
  {
    return this.zzd;
  }
  
  public final long zzd(zzaap paramzzaap, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
    throws IOException
  {
    if (this.zzc == 0)
    {
      if (!paramzzaap.zzn(this.zzb, 0, 1, paramBoolean1)) {
        return -1L;
      }
      i = zzb(this.zzb[0] & 0xFF);
      this.zzd = i;
      if (i != -1) {
        this.zzc = 1;
      } else {
        throw new IllegalStateException("No valid varint length mask found");
      }
    }
    int i = this.zzd;
    if (i > paramInt)
    {
      this.zzc = 0;
      return -2L;
    }
    if (i != 1)
    {
      byte[] arrayOfByte = this.zzb;
      ((zzaae)paramzzaap).zzn(arrayOfByte, 1, i - 1, false);
    }
    this.zzc = 0;
    return zzc(this.zzb, this.zzd, paramBoolean2);
  }
  
  public final void zze()
  {
    this.zzc = 0;
    this.zzd = 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzafp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */