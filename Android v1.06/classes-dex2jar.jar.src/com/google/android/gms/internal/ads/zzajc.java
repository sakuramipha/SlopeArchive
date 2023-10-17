package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzajc
{
  private final zzfl zza = new zzfl(0L);
  private final zzfd zzb = new zzfd();
  private boolean zzc;
  private boolean zzd;
  private boolean zze;
  private long zzf = -9223372036854775807L;
  private long zzg = -9223372036854775807L;
  private long zzh = -9223372036854775807L;
  
  public static long zzc(zzfd paramzzfd)
  {
    int i = paramzzfd.zzc();
    if (paramzzfd.zza() < 9) {
      return -9223372036854775807L;
    }
    byte[] arrayOfByte = new byte[9];
    paramzzfd.zzB(arrayOfByte, 0, 9);
    paramzzfd.zzF(i);
    if (((arrayOfByte[0] & 0xC4) == 68) && ((arrayOfByte[2] & 0x4) == 4) && ((arrayOfByte[4] & 0x4) == 4) && ((arrayOfByte[5] & 0x1) == 1) && ((arrayOfByte[8] & 0x3) == 3))
    {
      long l2 = arrayOfByte[0];
      long l3 = arrayOfByte[1];
      long l1 = arrayOfByte[2];
      return (0xFF & arrayOfByte[3]) << 5 | (l2 & 0x3) << 28 | (l2 & 0x38) >> 3 << 30 | (l3 & 0xFF) << 20 | (l1 & 0xF8) >> 3 << 15 | (l1 & 0x3) << 13 | (arrayOfByte[4] & 0xF8) >> 3;
    }
    return -9223372036854775807L;
  }
  
  private final int zzf(zzaap paramzzaap)
  {
    zzfd localzzfd = this.zzb;
    byte[] arrayOfByte = zzfn.zzf;
    int i = arrayOfByte.length;
    localzzfd.zzD(arrayOfByte, 0);
    this.zzc = true;
    paramzzaap.zzj();
    return 0;
  }
  
  private static final int zzg(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    return paramArrayOfByte[(paramInt + 3)] & 0xFF | (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8;
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    boolean bool = this.zze;
    int j = 1;
    int i = 1;
    long l1 = -9223372036854775807L;
    long l2;
    if (!bool)
    {
      l2 = paramzzaap.zzd();
      j = (int)Math.min(20000L, l2);
      l2 -= j;
      if (paramzzaap.zzf() != l2)
      {
        paramzzabk.zza = l2;
      }
      else
      {
        this.zzb.zzC(j);
        paramzzaap.zzj();
        paramzzabk = this.zzb.zzH();
        ((zzaae)paramzzaap).zzm(paramzzabk, 0, j, false);
        paramzzaap = this.zzb;
        j = paramzzaap.zzc();
        for (i = paramzzaap.zzd() - 4;; i--)
        {
          l2 = l1;
          if (i < j) {
            break;
          }
          if (zzg(paramzzaap.zzH(), i) == 442)
          {
            paramzzaap.zzF(i + 4);
            l2 = zzc(paramzzaap);
            if (l2 != -9223372036854775807L) {
              break;
            }
          }
        }
        this.zzg = l2;
        this.zze = true;
        i = 0;
      }
      return i;
    }
    if (this.zzg == -9223372036854775807L)
    {
      zzf(paramzzaap);
      return 0;
    }
    if (!this.zzd)
    {
      i = (int)Math.min(20000L, paramzzaap.zzd());
      if (paramzzaap.zzf() != 0L)
      {
        paramzzabk.zza = 0L;
        i = j;
      }
      else
      {
        this.zzb.zzC(i);
        paramzzaap.zzj();
        paramzzabk = this.zzb.zzH();
        ((zzaae)paramzzaap).zzm(paramzzabk, 0, i, false);
        paramzzaap = this.zzb;
        i = paramzzaap.zzc();
        j = paramzzaap.zzd();
        for (;;)
        {
          l2 = l1;
          if (i >= j - 3) {
            break;
          }
          if (zzg(paramzzaap.zzH(), i) == 442)
          {
            paramzzaap.zzF(i + 4);
            l2 = zzc(paramzzaap);
            if (l2 != -9223372036854775807L) {
              break;
            }
          }
          i++;
        }
        this.zzf = l2;
        this.zzd = true;
        i = 0;
      }
      return i;
    }
    l1 = this.zzf;
    if (l1 == -9223372036854775807L)
    {
      zzf(paramzzaap);
      return 0;
    }
    l1 = this.zza.zzb(l1);
    l1 = this.zza.zzb(this.zzg) - l1;
    this.zzh = l1;
    if (l1 < 0L)
    {
      paramzzabk = new StringBuilder();
      paramzzabk.append("Invalid duration: ");
      paramzzabk.append(l1);
      paramzzabk.append(". Using TIME_UNSET instead.");
      zzer.zze("PsDurationReader", paramzzabk.toString());
      this.zzh = -9223372036854775807L;
    }
    zzf(paramzzaap);
    return 0;
  }
  
  public final long zzb()
  {
    return this.zzh;
  }
  
  public final zzfl zzd()
  {
    return this.zza;
  }
  
  public final boolean zze()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */