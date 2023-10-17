package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

final class zzdt
{
  private final int zza;
  private final int zzb;
  private final float zzc;
  private final float zzd;
  private final float zze;
  private final int zzf;
  private final int zzg;
  private final int zzh;
  private final short[] zzi;
  private short[] zzj;
  private int zzk;
  private short[] zzl;
  private int zzm;
  private short[] zzn;
  private int zzo;
  private int zzp;
  private int zzq;
  private int zzr;
  private int zzs;
  private int zzt;
  private int zzu;
  private int zzv;
  
  public zzdt(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramFloat1;
    this.zzd = paramFloat2;
    this.zze = (paramInt1 / paramInt3);
    this.zzf = (paramInt1 / 400);
    paramInt1 /= 65;
    this.zzg = paramInt1;
    paramInt1 += paramInt1;
    this.zzh = paramInt1;
    this.zzi = new short[paramInt1];
    paramInt1 *= paramInt2;
    this.zzj = new short[paramInt1];
    this.zzl = new short[paramInt1];
    this.zzn = new short[paramInt1];
  }
  
  private final int zzg(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramInt1 * this.zzb;
    int m = 1;
    int i = 255;
    int k = 0;
    int j = 0;
    while (paramInt2 <= paramInt3)
    {
      int n = 0;
      paramInt1 = 0;
      while (n < paramInt2)
      {
        paramInt1 += Math.abs(paramArrayOfShort[(i1 + n)] - paramArrayOfShort[(i1 + paramInt2 + n)]);
        n++;
      }
      int i2 = paramInt1 * k;
      n = m * paramInt2;
      if (i2 < n) {
        m = paramInt1;
      }
      if (i2 < n) {
        k = paramInt2;
      }
      n = paramInt1 * i;
      i2 = j * paramInt2;
      if (n > i2) {
        j = paramInt1;
      }
      if (n > i2) {
        i = paramInt2;
      }
      paramInt2++;
    }
    this.zzu = (m / k);
    this.zzv = (j / i);
    return k;
  }
  
  private final void zzh(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    short[] arrayOfShort = zzl(this.zzl, this.zzm, paramInt2);
    this.zzl = arrayOfShort;
    int i = this.zzb;
    System.arraycopy(paramArrayOfShort, paramInt1 * i, arrayOfShort, this.zzm * i, i * paramInt2);
    this.zzm += paramInt2;
  }
  
  private final void zzi(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    int m = this.zzh / paramInt2;
    int k = this.zzb;
    int n = paramInt2 * k;
    for (paramInt2 = 0; paramInt2 < m; paramInt2++)
    {
      int j = 0;
      int i = 0;
      while (j < n)
      {
        i += paramArrayOfShort[(paramInt2 * n + paramInt1 * k + j)];
        j++;
      }
      i /= n;
      this.zzi[paramInt2] = ((short)i);
    }
  }
  
  private static void zzj(int paramInt1, int paramInt2, short[] paramArrayOfShort1, int paramInt3, short[] paramArrayOfShort2, int paramInt4, short[] paramArrayOfShort3, int paramInt5)
  {
    for (int i = 0; i < paramInt2; i++)
    {
      int m = paramInt4 * paramInt2 + i;
      int k = paramInt5 * paramInt2 + i;
      int n = paramInt3 * paramInt2 + i;
      for (int j = 0; j < paramInt1; j++)
      {
        paramArrayOfShort1[n] = ((short)((paramArrayOfShort2[m] * (paramInt1 - j) + paramArrayOfShort3[k] * j) / paramInt1));
        n += paramInt2;
        m += paramInt2;
        k += paramInt2;
      }
    }
  }
  
  private final void zzk()
  {
    int i1 = this.zzm;
    float f1 = this.zzc;
    float f2 = this.zzd;
    f1 /= f2;
    f2 = this.zze * f2;
    double d = f1;
    int i2;
    if ((d <= 1.00001D) && (d >= 0.99999D))
    {
      zzh(this.zzj, 0, this.zzk);
      this.zzk = 0;
    }
    else
    {
      i2 = this.zzk;
      if (i2 < this.zzh) {}
    }
    int i;
    for (int k = 0;; k = i)
    {
      i = this.zzr;
      short[] arrayOfShort1;
      int j;
      int n;
      int i3;
      int m;
      label452:
      short[] arrayOfShort2;
      if (i > 0)
      {
        i = Math.min(this.zzh, i);
        zzh(this.zzj, k, i);
        this.zzr -= i;
        i = k + i;
      }
      else
      {
        arrayOfShort1 = this.zzj;
        i = this.zza;
        if (i > 4000) {
          i /= 4000;
        } else {
          i = 1;
        }
        if ((this.zzb == 1) && (i == 1))
        {
          i = zzg(arrayOfShort1, k, this.zzf, this.zzg);
        }
        else
        {
          zzi(arrayOfShort1, k, i);
          j = zzg(this.zzi, 0, this.zzf / i, this.zzg / i);
          if (i != 1)
          {
            n = j * i;
            i3 = i * 4;
            j = this.zzf;
            m = n - i3;
            i = j;
            if (m >= j) {
              i = m;
            }
            n += i3;
            m = this.zzg;
            j = n;
            if (n > m) {
              j = m;
            }
            if (this.zzb == 1)
            {
              i = zzg(arrayOfShort1, k, i, j);
            }
            else
            {
              zzi(arrayOfShort1, k, 1);
              i = zzg(this.zzi, 0, i, j);
            }
          }
          else
          {
            i = j;
          }
        }
        m = this.zzu;
        n = this.zzv;
        if (m != 0)
        {
          j = this.zzs;
          if ((j != 0) && (n <= m * 3) && (m + m > this.zzt * 3)) {
            break label452;
          }
        }
        j = i;
        this.zzt = m;
        this.zzs = i;
        if (d > 1.0D)
        {
          arrayOfShort2 = this.zzj;
          if (f1 >= 2.0F)
          {
            i = (int)(j / (-1.0F + f1));
          }
          else
          {
            this.zzr = ((int)(j * (2.0F - f1) / (-1.0F + f1)));
            i = j;
          }
          arrayOfShort1 = zzl(this.zzl, this.zzm, i);
          this.zzl = arrayOfShort1;
          zzj(i, this.zzb, arrayOfShort1, this.zzm, arrayOfShort2, k, arrayOfShort2, k + j);
          this.zzm += i;
          i = k + (j + i);
        }
        else
        {
          arrayOfShort1 = this.zzj;
          if (f1 < 0.5F)
          {
            i = (int)(j * f1 / (1.0F - f1));
          }
          else
          {
            this.zzr = ((int)(j * (f1 + f1 - 1.0F) / (1.0F - f1)));
            i = j;
          }
          arrayOfShort2 = this.zzl;
          n = this.zzm;
          m = j + i;
          arrayOfShort2 = zzl(arrayOfShort2, n, m);
          this.zzl = arrayOfShort2;
          n = this.zzb;
          System.arraycopy(arrayOfShort1, k * n, arrayOfShort2, this.zzm * n, n * j);
          zzj(i, this.zzb, this.zzl, this.zzm + j, arrayOfShort1, k + j, arrayOfShort1, k);
          this.zzm += m;
          i = k + i;
        }
      }
      if (this.zzh + i > i2)
      {
        j = this.zzk - i;
        arrayOfShort1 = this.zzj;
        k = this.zzb;
        System.arraycopy(arrayOfShort1, i * k, arrayOfShort1, 0, k * j);
        this.zzk = j;
        if ((f2 != 1.0F) && (this.zzm != i1))
        {
          i = this.zza;
          j = (int)(i / f2);
          for (;;)
          {
            if ((j <= 16384) && (i <= 16384))
            {
              m = this.zzm - i1;
              arrayOfShort1 = zzl(this.zzn, this.zzo, m);
              this.zzn = arrayOfShort1;
              arrayOfShort2 = this.zzl;
              k = this.zzb;
              System.arraycopy(arrayOfShort2, i1 * k, arrayOfShort1, this.zzo * k, k * m);
              this.zzm = i1;
              this.zzo += m;
              for (k = 0;; k++)
              {
                n = this.zzo;
                m = n - 1;
                if (k >= m) {
                  break;
                }
                for (;;)
                {
                  n = this.zzp + 1;
                  m = this.zzq;
                  if (n * j <= m * i) {
                    break;
                  }
                  this.zzl = zzl(this.zzl, this.zzm, 1);
                  for (m = 0;; m++)
                  {
                    i1 = this.zzb;
                    if (m >= i1) {
                      break;
                    }
                    arrayOfShort2 = this.zzl;
                    n = this.zzm;
                    arrayOfShort1 = this.zzn;
                    i3 = k * i1 + m;
                    i2 = arrayOfShort1[i3];
                    i3 = arrayOfShort1[(i3 + i1)];
                    int i4 = this.zzq;
                    int i5 = this.zzp;
                    int i6 = (i5 + 1) * j;
                    i4 = i6 - i4 * i;
                    i5 = i6 - i5 * j;
                    arrayOfShort2[(n * i1 + m)] = ((short)((i2 * i4 + (i5 - i4) * i3) / i5));
                  }
                  this.zzq += 1;
                  this.zzm += 1;
                }
                this.zzp = n;
                if (n == i)
                {
                  this.zzp = 0;
                  boolean bool;
                  if (m == j) {
                    bool = true;
                  } else {
                    bool = false;
                  }
                  zzdy.zzf(bool);
                  this.zzq = 0;
                }
              }
              if (m == 0) {
                break;
              }
              arrayOfShort1 = this.zzn;
              i = this.zzb;
              System.arraycopy(arrayOfShort1, m * i, arrayOfShort1, 0, (n - m) * i);
              this.zzo -= m;
              return;
            }
            j /= 2;
            i /= 2;
          }
        }
        return;
      }
    }
  }
  
  private final short[] zzl(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    int j = paramArrayOfShort.length;
    int i = this.zzb;
    j /= i;
    if (paramInt1 + paramInt2 <= j) {
      return paramArrayOfShort;
    }
    return Arrays.copyOf(paramArrayOfShort, (j * 3 / 2 + paramInt2) * i);
  }
  
  public final int zza()
  {
    int i = this.zzm * this.zzb;
    return i + i;
  }
  
  public final int zzb()
  {
    int i = this.zzk * this.zzb;
    return i + i;
  }
  
  public final void zzc()
  {
    this.zzk = 0;
    this.zzm = 0;
    this.zzo = 0;
    this.zzp = 0;
    this.zzq = 0;
    this.zzr = 0;
    this.zzs = 0;
    this.zzt = 0;
    this.zzu = 0;
    this.zzv = 0;
  }
  
  public final void zzd(ShortBuffer paramShortBuffer)
  {
    int k = Math.min(paramShortBuffer.remaining() / this.zzb, this.zzm);
    paramShortBuffer.put(this.zzl, 0, this.zzb * k);
    int i = this.zzm - k;
    this.zzm = i;
    paramShortBuffer = this.zzl;
    int j = this.zzb;
    System.arraycopy(paramShortBuffer, k * j, paramShortBuffer, 0, i * j);
  }
  
  public final void zze()
  {
    int j = this.zzk;
    float f2 = this.zzc;
    float f1 = this.zzd;
    f2 /= f1;
    float f4 = this.zze;
    float f3 = j;
    int i = this.zzm;
    float f5 = this.zzo;
    int k = i + (int)((f3 / f2 + f5) / (f4 * f1) + 0.5F);
    short[] arrayOfShort = this.zzj;
    i = this.zzh;
    this.zzj = zzl(arrayOfShort, j, i + i + j);
    int n;
    for (i = 0;; i++)
    {
      int m = this.zzh;
      n = m + m;
      m = this.zzb;
      if (i >= n * m) {
        break;
      }
      this.zzj[(m * j + i)] = 0;
    }
    this.zzk += n;
    zzk();
    if (this.zzm > k) {
      this.zzm = k;
    }
    this.zzk = 0;
    this.zzr = 0;
    this.zzo = 0;
  }
  
  public final void zzf(ShortBuffer paramShortBuffer)
  {
    int i = paramShortBuffer.remaining();
    int j = this.zzb;
    i /= j;
    j *= i;
    short[] arrayOfShort = zzl(this.zzj, this.zzk, i);
    this.zzj = arrayOfShort;
    paramShortBuffer.get(arrayOfShort, this.zzk * this.zzb, (j + j) / 2);
    this.zzk += i;
    zzk();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */