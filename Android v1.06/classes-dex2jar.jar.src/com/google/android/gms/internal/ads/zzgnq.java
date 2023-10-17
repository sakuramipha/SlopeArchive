package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

final class zzgnq
  extends zzgnw
{
  private final byte[] zze;
  private int zzf;
  private int zzg;
  private int zzh;
  private final int zzi;
  private int zzj;
  private int zzk;
  
  private final void zzJ()
  {
    int i = this.zzf + this.zzg;
    this.zzf = i;
    int k = i - this.zzi;
    int j = this.zzk;
    if (k > j)
    {
      j = k - j;
      this.zzg = j;
      this.zzf = (i - j);
      return;
    }
    this.zzg = 0;
  }
  
  public final void zzA(int paramInt)
  {
    this.zzk = paramInt;
    zzJ();
  }
  
  public final void zzB(int paramInt)
    throws IOException
  {
    if (paramInt >= 0)
    {
      int j = this.zzf;
      int i = this.zzh;
      if (paramInt <= j - i)
      {
        this.zzh = (i + paramInt);
        return;
      }
    }
    if (paramInt < 0) {
      throw zzgpi.zzf();
    }
    throw zzgpi.zzj();
  }
  
  public final boolean zzC()
    throws IOException
  {
    return this.zzh == this.zzf;
  }
  
  public final boolean zzD()
    throws IOException
  {
    return zzr() != 0L;
  }
  
  public final boolean zzE(int paramInt)
    throws IOException
  {
    int k = paramInt & 0x7;
    int j = 0;
    int i = 0;
    if (k != 0)
    {
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 3)
          {
            if (k != 4)
            {
              if (k == 5)
              {
                zzB(4);
                return true;
              }
              throw zzgpi.zza();
            }
            return false;
          }
          do
          {
            i = zzm();
          } while ((i != 0) && (zzE(i)));
          zzz(paramInt >>> 3 << 3 | 0x4);
          return true;
        }
        zzB(zzj());
        return true;
      }
      zzB(8);
      return true;
    }
    paramInt = j;
    if (this.zzf - this.zzh >= 10)
    {
      for (paramInt = i; paramInt < 10; paramInt++)
      {
        byte[] arrayOfByte = this.zze;
        i = this.zzh;
        this.zzh = (i + 1);
        if (arrayOfByte[i] >= 0) {
          break label187;
        }
      }
      throw zzgpi.zze();
    }
    for (;;)
    {
      if (paramInt >= 10) {
        break label189;
      }
      if (zza() >= 0) {
        break;
      }
      paramInt++;
    }
    label187:
    return true;
    label189:
    throw zzgpi.zze();
  }
  
  public final byte zza()
    throws IOException
  {
    int i = this.zzh;
    if (i != this.zzf)
    {
      byte[] arrayOfByte = this.zze;
      this.zzh = (i + 1);
      return arrayOfByte[i];
    }
    throw zzgpi.zzj();
  }
  
  public final double zzb()
    throws IOException
  {
    return Double.longBitsToDouble(zzq());
  }
  
  public final float zzc()
    throws IOException
  {
    return Float.intBitsToFloat(zzi());
  }
  
  public final int zzd()
  {
    return this.zzh - this.zzi;
  }
  
  public final int zze(int paramInt)
    throws zzgpi
  {
    if (paramInt >= 0)
    {
      paramInt += this.zzh - this.zzi;
      if (paramInt >= 0)
      {
        int i = this.zzk;
        if (paramInt <= i)
        {
          this.zzk = paramInt;
          zzJ();
          return i;
        }
        throw zzgpi.zzj();
      }
      throw zzgpi.zzg();
    }
    throw zzgpi.zzf();
  }
  
  public final int zzf()
    throws IOException
  {
    return zzj();
  }
  
  public final int zzg()
    throws IOException
  {
    return zzi();
  }
  
  public final int zzh()
    throws IOException
  {
    return zzj();
  }
  
  public final int zzi()
    throws IOException
  {
    int m = this.zzh;
    if (this.zzf - m >= 4)
    {
      byte[] arrayOfByte = this.zze;
      this.zzh = (m + 4);
      int i = arrayOfByte[m];
      int k = arrayOfByte[(m + 1)];
      int j = arrayOfByte[(m + 2)];
      return (arrayOfByte[(m + 3)] & 0xFF) << 24 | (k & 0xFF) << 8 | i & 0xFF | (j & 0xFF) << 16;
    }
    throw zzgpi.zzj();
  }
  
  public final int zzj()
    throws IOException
  {
    int k = this.zzh;
    int i = this.zzf;
    if (i != k)
    {
      byte[] arrayOfByte = this.zze;
      int j = k + 1;
      k = arrayOfByte[k];
      if (k >= 0)
      {
        this.zzh = j;
        return k;
      }
      if (i - j >= 9)
      {
        i = j + 1;
        k ^= arrayOfByte[j] << 7;
        if (k < 0)
        {
          j = k ^ 0xFFFFFF80;
        }
        else
        {
          j = i + 1;
          k ^= arrayOfByte[i] << 14;
          if (k >= 0)
          {
            k ^= 0x3F80;
            i = j;
            j = k;
          }
          for (;;)
          {
            break;
            i = j + 1;
            j = k ^ arrayOfByte[j] << 21;
            if (j < 0)
            {
              j ^= 0xFFE03F80;
            }
            else
            {
              int m = i + 1;
              int n = arrayOfByte[i];
              k = j ^ n << 28 ^ 0xFE03F80;
              j = k;
              i = m;
              if (n < 0)
              {
                n = m + 1;
                j = k;
                i = n;
                if (arrayOfByte[m] < 0)
                {
                  m = n + 1;
                  j = k;
                  i = m;
                  if (arrayOfByte[n] < 0)
                  {
                    n = m + 1;
                    j = k;
                    i = n;
                    if (arrayOfByte[m] < 0)
                    {
                      m = n + 1;
                      j = k;
                      i = m;
                      if (arrayOfByte[n] < 0)
                      {
                        i = m + 1;
                        j = k;
                        if (arrayOfByte[m] < 0) {
                          break label268;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        this.zzh = i;
        return j;
      }
    }
    label268:
    return (int)zzs();
  }
  
  public final int zzk()
    throws IOException
  {
    return zzi();
  }
  
  public final int zzl()
    throws IOException
  {
    return zzF(zzj());
  }
  
  public final int zzm()
    throws IOException
  {
    if (zzC())
    {
      this.zzj = 0;
      return 0;
    }
    int i = zzj();
    this.zzj = i;
    if (i >>> 3 != 0) {
      return i;
    }
    throw zzgpi.zzc();
  }
  
  public final int zzn()
    throws IOException
  {
    return zzj();
  }
  
  public final long zzo()
    throws IOException
  {
    return zzq();
  }
  
  public final long zzp()
    throws IOException
  {
    return zzr();
  }
  
  public final long zzq()
    throws IOException
  {
    int i = this.zzh;
    if (this.zzf - i >= 8)
    {
      byte[] arrayOfByte = this.zze;
      this.zzh = (i + 8);
      long l1 = arrayOfByte[i];
      long l6 = arrayOfByte[(i + 1)];
      long l4 = arrayOfByte[(i + 2)];
      long l2 = arrayOfByte[(i + 3)];
      long l3 = arrayOfByte[(i + 4)];
      long l7 = arrayOfByte[(i + 5)];
      long l5 = arrayOfByte[(i + 6)];
      return (arrayOfByte[(i + 7)] & 0xFF) << 56 | l1 & 0xFF | (l6 & 0xFF) << 8 | (l4 & 0xFF) << 16 | (l2 & 0xFF) << 24 | (l3 & 0xFF) << 32 | (l7 & 0xFF) << 40 | (l5 & 0xFF) << 48;
    }
    throw zzgpi.zzj();
  }
  
  public final long zzr()
    throws IOException
  {
    int k = this.zzh;
    int i = this.zzf;
    if (i != k)
    {
      byte[] arrayOfByte = this.zze;
      int j = k + 1;
      k = arrayOfByte[k];
      if (k >= 0)
      {
        this.zzh = j;
        return k;
      }
      if (i - j >= 9)
      {
        i = j + 1;
        k ^= arrayOfByte[j] << 7;
        long l1;
        if (k < 0)
        {
          j = k ^ 0xFFFFFF80;
          l1 = j;
        }
        else
        {
          j = i + 1;
          k ^= arrayOfByte[i] << 14;
          if (k >= 0)
          {
            l1 = k ^ 0x3F80;
            i = j;
          }
          for (;;)
          {
            break label345;
            i = j + 1;
            k ^= arrayOfByte[j] << 21;
            if (k < 0)
            {
              j = k ^ 0xFFE03F80;
              break;
            }
            j = i + 1;
            l1 = arrayOfByte[i];
            l1 = k ^ l1 << 28;
            long l2;
            if (l1 >= 0L)
            {
              l2 = 266354560L;
              i = j;
              label175:
              l1 ^= l2;
            }
            else
            {
              i = j + 1;
              l1 ^= arrayOfByte[j] << 35;
              if (l1 < 0L) {
                l2 = -34093383808L;
              }
              label214:
              for (l1 = l2 ^ l1;; l1 = l2)
              {
                break;
                j = i + 1;
                l1 ^= arrayOfByte[i] << 42;
                if (l1 >= 0L)
                {
                  l2 = 4363953127296L;
                  i = j;
                  break label175;
                }
                i = j + 1;
                l1 ^= arrayOfByte[j] << 49;
                if (l1 < 0L)
                {
                  l2 = -558586000294016L;
                  break label214;
                }
                j = i + 1;
                l2 = l1 ^ arrayOfByte[i] << 56 ^ 0xFE03F80FE03F80;
                l1 = l2;
                i = j;
                if (l2 >= 0L) {
                  break;
                }
                i = j + 1;
                if (arrayOfByte[j] < 0L) {
                  break label353;
                }
              }
            }
          }
        }
        label345:
        this.zzh = i;
        return l1;
      }
    }
    label353:
    return zzs();
  }
  
  final long zzs()
    throws IOException
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = zza();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
    throw zzgpi.zze();
  }
  
  public final long zzt()
    throws IOException
  {
    return zzq();
  }
  
  public final long zzu()
    throws IOException
  {
    return zzG(zzr());
  }
  
  public final long zzv()
    throws IOException
  {
    return zzr();
  }
  
  public final zzgno zzw()
    throws IOException
  {
    int i = zzj();
    int k;
    int j;
    if (i > 0)
    {
      k = this.zzf;
      j = this.zzh;
      if (i <= k - j)
      {
        zzgno localzzgno = zzgno.zzv(this.zze, j, i);
        this.zzh += i;
        return localzzgno;
      }
    }
    if (i != 0)
    {
      if (i > 0)
      {
        k = this.zzf;
        j = this.zzh;
        if (i <= k - j)
        {
          i += j;
          this.zzh = i;
          return new zzgnk(Arrays.copyOfRange(this.zze, j, i));
        }
      }
      if (i <= 0) {
        throw zzgpi.zzf();
      }
      throw zzgpi.zzj();
    }
    return zzgno.zzb;
  }
  
  public final String zzx()
    throws IOException
  {
    int k = zzj();
    if (k > 0)
    {
      int j = this.zzf;
      int i = this.zzh;
      if (k <= j - i)
      {
        String str = new String(this.zze, i, k, zzgpg.zzb);
        this.zzh += k;
        return str;
      }
    }
    if (k == 0) {
      return "";
    }
    if (k < 0) {
      throw zzgpi.zzf();
    }
    throw zzgpi.zzj();
  }
  
  public final String zzy()
    throws IOException
  {
    int k = zzj();
    if (k > 0)
    {
      int i = this.zzf;
      int j = this.zzh;
      if (k <= i - j)
      {
        String str = zzgsf.zzh(this.zze, j, k);
        this.zzh += k;
        return str;
      }
    }
    if (k == 0) {
      return "";
    }
    if (k <= 0) {
      throw zzgpi.zzf();
    }
    throw zzgpi.zzj();
  }
  
  public final void zzz(int paramInt)
    throws zzgpi
  {
    if (this.zzj == paramInt) {
      return;
    }
    throw zzgpi.zzb();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgnq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */