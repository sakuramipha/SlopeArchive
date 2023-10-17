package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzajy
  implements zzajz
{
  private static final int[] zza = { -1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8 };
  private static final int[] zzb = { 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767 };
  private final zzaar zzc;
  private final zzabr zzd;
  private final zzakc zze;
  private final int zzf;
  private final byte[] zzg;
  private final zzfd zzh;
  private final int zzi;
  private final zzam zzj;
  private int zzk;
  private long zzl;
  private int zzm;
  private long zzn;
  
  public zzajy(zzaar paramzzaar, zzabr paramzzabr, zzakc paramzzakc)
    throws zzce
  {
    this.zzc = paramzzaar;
    this.zzd = paramzzabr;
    this.zze = paramzzakc;
    int i = Math.max(1, paramzzakc.zzc / 10);
    this.zzi = i;
    paramzzaar = new zzfd(paramzzakc.zzf);
    paramzzaar.zzi();
    int k = paramzzaar.zzi();
    this.zzf = k;
    int j = paramzzakc.zzb;
    int m = (paramzzakc.zzd - j * 4) * 8 / (paramzzakc.zze * j) + 1;
    if (k == m)
    {
      m = zzfn.zza;
      m = (i + k - 1) / k;
      this.zzg = new byte[paramzzakc.zzd * m];
      this.zzh = new zzfd(m * ((k + k) * j));
      k = paramzzakc.zzc * paramzzakc.zzd * 8 / k;
      paramzzaar = new zzak();
      paramzzaar.zzS("audio/raw");
      paramzzaar.zzv(k);
      paramzzaar.zzO(k);
      paramzzaar.zzL((i + i) * j);
      paramzzaar.zzw(paramzzakc.zzb);
      paramzzaar.zzT(paramzzakc.zzc);
      paramzzaar.zzN(2);
      this.zzj = paramzzaar.zzY();
      return;
    }
    paramzzaar = new StringBuilder();
    paramzzaar.append("Expected frames per block: ");
    paramzzaar.append(m);
    paramzzaar.append("; got: ");
    paramzzaar.append(k);
    throw zzce.zza(paramzzaar.toString(), null);
  }
  
  private final int zzd(int paramInt)
  {
    int i = this.zze.zzb;
    return paramInt / (i + i);
  }
  
  private final int zze(int paramInt)
  {
    return (paramInt + paramInt) * this.zze.zzb;
  }
  
  private final void zzf(int paramInt)
  {
    long l2 = this.zzl;
    long l1 = zzfn.zzp(this.zzn, 1000000L, this.zze.zzc);
    int i = zze(paramInt);
    int j = this.zzm;
    this.zzd.zzs(l2 + l1, 1, i, j - i, null);
    this.zzn += paramInt;
    this.zzm -= i;
  }
  
  public final void zza(int paramInt, long paramLong)
  {
    this.zzc.zzN(new zzakf(this.zze, this.zzf, paramInt, paramLong));
    this.zzd.zzk(this.zzj);
  }
  
  public final void zzb(long paramLong)
  {
    this.zzk = 0;
    this.zzl = paramLong;
    this.zzm = 0;
    this.zzn = 0L;
  }
  
  public final boolean zzc(zzaap paramzzaap, long paramLong)
    throws IOException
  {
    int i = this.zzi;
    int m = zzd(this.zzm);
    int k = this.zzf;
    int j = zzfn.zza;
    i = (i - m + k - 1) / k * this.zze.zzd;
    boolean bool;
    if (paramLong == 0L) {
      bool = true;
    } else {
      bool = false;
    }
    for (;;)
    {
      if (bool) {
        break label137;
      }
      j = this.zzk;
      if (j >= i) {
        break label137;
      }
      j = (int)Math.min(i - j, paramLong);
      j = paramzzaap.zza(this.zzg, this.zzk, j);
      if (j == -1) {
        break;
      }
      this.zzk += j;
    }
    label137:
    int i6 = this.zzk / this.zze.zzd;
    if (i6 > 0)
    {
      paramzzaap = this.zzg;
      zzfd localzzfd = this.zzh;
      for (i = 0; i < i6; i++) {
        for (j = 0;; j++)
        {
          zzakc localzzakc = this.zze;
          int i7 = localzzakc.zzb;
          if (j >= i7) {
            break;
          }
          byte[] arrayOfByte = localzzfd.zzH();
          k = localzzakc.zzd;
          int n = k / i7 - 4;
          int i8 = i * k + j * 4;
          int i2 = paramzzaap[(i8 + 1)];
          int i1 = paramzzaap[i8];
          m = Math.min(paramzzaap[(i8 + 2)] & 0xFF, 88);
          int i3 = zzb[m];
          k = this.zzf * i * i7 + j;
          i2 = (short)((i2 & 0xFF) << 8 | i1 & 0xFF);
          i1 = k + k;
          arrayOfByte[i1] = ((byte)(i2 & 0xFF));
          arrayOfByte[(i1 + 1)] = ((byte)(i2 >> 8));
          for (k = 0; k < n + n; k++)
          {
            int i4 = paramzzaap[(i7 * 4 + i8 + k / 8 * i7 * 4 + k / 2 % 4)] & 0xFF;
            if (k % 2 == 0) {
              i4 &= 0xF;
            } else {
              i4 >>= 4;
            }
            int i5 = i4 & 0x7;
            i5 = (i5 + i5 + 1) * i3 >> 3;
            i3 = i5;
            if ((i4 & 0x8) != 0) {
              i3 = -i5;
            }
            i2 = Math.max(32768, Math.min(i2 + i3, 32767));
            i1 += i7 + i7;
            arrayOfByte[i1] = ((byte)(i2 & 0xFF));
            arrayOfByte[(i1 + 1)] = ((byte)(i2 >> 8));
            m = Math.max(0, Math.min(m + zza[i4], 88));
            i3 = zzb[m];
          }
        }
      }
      i = zze(this.zzf * i6);
      localzzfd.zzF(0);
      localzzfd.zzE(i);
      this.zzk -= i6 * this.zze.zzd;
      paramzzaap = this.zzh;
      i = paramzzaap.zzd();
      zzabp.zzb(this.zzd, paramzzaap, i);
      i = this.zzm + i;
      this.zzm = i;
      j = zzd(i);
      i = this.zzi;
      if (j >= i) {
        zzf(i);
      }
    }
    if (bool)
    {
      i = zzd(this.zzm);
      if (i > 0) {
        zzf(i);
      }
    }
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */