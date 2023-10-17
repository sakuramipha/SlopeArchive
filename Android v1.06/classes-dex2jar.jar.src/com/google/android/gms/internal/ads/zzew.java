package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzew
{
  public static final byte[] zza = { 0, 0, 0, 1 };
  public static final float[] zzb = { 1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 2.1818182F, 1.8181819F, 2.909091F, 2.4242425F, 1.6363636F, 1.3636364F, 1.939394F, 1.6161616F, 1.3333334F, 1.5F, 2.0F };
  private static final Object zzc = new Object();
  private static int[] zzd = new int[10];
  
  public static int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
  {
    int j = paramInt2 - paramInt1;
    boolean bool2 = false;
    if (j >= 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzdy.zzf(bool1);
    if (j == 0) {
      return paramInt2;
    }
    if (paramArrayOfBoolean[0] != 0)
    {
      zze(paramArrayOfBoolean);
      return paramInt1 - 3;
    }
    if ((j > 1) && (paramArrayOfBoolean[1] != 0) && (paramArrayOfByte[paramInt1] == 1))
    {
      zze(paramArrayOfBoolean);
      return paramInt1 - 2;
    }
    if ((j > 2) && (paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[paramInt1] == 0) && (paramArrayOfByte[(paramInt1 + 1)] == 1))
    {
      zze(paramArrayOfBoolean);
      return paramInt1 - 1;
    }
    int k = paramInt2 - 1;
    paramInt1 += 2;
    while (paramInt1 < k)
    {
      int m = paramArrayOfByte[paramInt1];
      int i = paramInt1;
      if ((m & 0xFE) == 0)
      {
        i = paramInt1 - 2;
        if ((paramArrayOfByte[i] == 0) && (paramArrayOfByte[(paramInt1 - 1)] == 0) && (m == 1))
        {
          zze(paramArrayOfBoolean);
          return i;
        }
      }
      paramInt1 = i + 3;
    }
    if (j > 2)
    {
      if ((paramArrayOfByte[(paramInt2 - 3)] == 0) && (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[k] == 1)) {}
    }
    else {
      while (j == 2 ? (paramArrayOfBoolean[2] == 0) || (paramArrayOfByte[(paramInt2 - 2)] != 0) || (paramArrayOfByte[k] != 1) : (paramArrayOfBoolean[1] == 0) || (paramArrayOfByte[k] != 1))
      {
        bool1 = false;
        break;
      }
    }
    boolean bool1 = true;
    paramArrayOfBoolean[0] = bool1;
    if (j > 1 ? (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[k] == 0) : (paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[k] == 0)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    paramArrayOfBoolean[1] = bool1;
    bool1 = bool2;
    if (paramArrayOfByte[k] == 0) {
      bool1 = true;
    }
    paramArrayOfBoolean[2] = bool1;
    return paramInt2;
  }
  
  public static int zzb(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject = zzc;
    int i = 0;
    int k = 0;
    int j = i;
    int m;
    if (i >= paramInt)
    {
      m = paramInt - k;
      paramInt = 0;
      i = 0;
      j = 0;
    }
    for (;;)
    {
      if (paramInt < k) {}
      label155:
      label205:
      try
      {
        int n = zzd[paramInt] - i;
        System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, j, n);
        j += n;
        int i1 = j + 1;
        paramArrayOfByte[j] = 0;
        j = i1 + 1;
        paramArrayOfByte[i1] = 0;
        i += n + 3;
        paramInt++;
        continue;
        System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, j, m - j);
        return m;
        while (j < paramInt - 2)
        {
          if ((paramArrayOfByte[j] == 0) && (paramArrayOfByte[(j + 1)] == 0) && (paramArrayOfByte[(j + 2)] == 3)) {
            break label155;
          }
          j++;
        }
      }
      finally
      {
        break label205;
        j = paramInt;
        i = j;
        if (j >= paramInt) {
          break;
        }
        int[] arrayOfInt = zzd;
        i = arrayOfInt.length;
        if (i <= k) {
          zzd = Arrays.copyOf(arrayOfInt, i + i);
        }
        zzd[k] = j;
        i = j + 3;
        k++;
        break;
      }
    }
  }
  
  public static zzeu zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new zzfe(paramArrayOfByte, 4, paramInt2);
    paramInt2 = paramArrayOfByte.zzc();
    paramInt1 = paramArrayOfByte.zzc();
    paramArrayOfByte.zzd();
    return new zzeu(paramInt2, paramInt1, paramArrayOfByte.zzf());
  }
  
  public static zzev zzd(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new zzfe(paramArrayOfByte, paramInt1, paramInt2);
    paramInt2 = paramArrayOfByte.zza(8);
    int i7 = paramArrayOfByte.zza(8);
    int i5 = paramArrayOfByte.zza(8);
    int i6 = paramArrayOfByte.zzc();
    int i3 = 1;
    paramInt1 = paramInt2;
    boolean bool2;
    if (paramInt2 != 100)
    {
      paramInt1 = paramInt2;
      if (paramInt2 != 110)
      {
        paramInt1 = paramInt2;
        if (paramInt2 != 122)
        {
          paramInt1 = paramInt2;
          if (paramInt2 != 244)
          {
            paramInt1 = paramInt2;
            if (paramInt2 != 44)
            {
              paramInt1 = paramInt2;
              if (paramInt2 != 83)
              {
                paramInt1 = paramInt2;
                if (paramInt2 != 86)
                {
                  paramInt1 = paramInt2;
                  if (paramInt2 != 118)
                  {
                    paramInt1 = paramInt2;
                    if (paramInt2 != 128) {
                      if (paramInt2 == 138)
                      {
                        paramInt1 = 138;
                      }
                      else
                      {
                        k = 1;
                        bool2 = false;
                        break label307;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    int k = paramArrayOfByte.zzc();
    if (k == 3)
    {
      bool2 = paramArrayOfByte.zzf();
      paramInt2 = 3;
    }
    else
    {
      paramInt2 = k;
      bool2 = false;
    }
    paramArrayOfByte.zzc();
    paramArrayOfByte.zzc();
    paramArrayOfByte.zzd();
    int j;
    if (paramArrayOfByte.zzf())
    {
      if (paramInt2 != 3) {
        i = 8;
      } else {
        i = 12;
      }
      for (j = 0; j < i; j++) {
        if (paramArrayOfByte.zzf())
        {
          if (j < 6) {
            m = 16;
          } else {
            m = 64;
          }
          i1 = 0;
          i2 = 8;
          n = 8;
          while (i1 < m)
          {
            paramInt2 = i2;
            if (i2 != 0) {
              paramInt2 = (n + paramArrayOfByte.zzb() + 256) % 256;
            }
            if (paramInt2 != 0) {
              n = paramInt2;
            }
            i1++;
            i2 = paramInt2;
          }
        }
      }
    }
    paramInt2 = paramInt1;
    label307:
    int i8 = paramArrayOfByte.zzc();
    int i = paramArrayOfByte.zzc();
    if (i == 0) {}
    boolean bool3;
    for (paramInt1 = paramArrayOfByte.zzc() + 4;; paramInt1 = 0)
    {
      bool3 = false;
      j = paramInt1;
      break;
      if (i == 1)
      {
        bool3 = paramArrayOfByte.zzf();
        paramArrayOfByte.zzb();
        paramArrayOfByte.zzb();
        long l = paramArrayOfByte.zzc();
        for (paramInt1 = 0; paramInt1 < l; paramInt1++) {
          paramArrayOfByte.zzc();
        }
        i = 1;
        j = 0;
        break;
      }
    }
    int i9 = paramArrayOfByte.zzc();
    paramArrayOfByte.zzd();
    int m = paramArrayOfByte.zzc();
    paramInt1 = paramArrayOfByte.zzc();
    boolean bool1 = paramArrayOfByte.zzf();
    int i4 = true - bool1;
    if (!bool1) {
      paramArrayOfByte.zzd();
    }
    paramArrayOfByte.zzd();
    int i2 = (m + 1) * 16;
    int i1 = (paramInt1 + 1) * i4 * 16;
    int n = i2;
    m = i1;
    if (paramArrayOfByte.zzf())
    {
      n = paramArrayOfByte.zzc();
      int i12 = paramArrayOfByte.zzc();
      int i11 = paramArrayOfByte.zzc();
      int i10 = paramArrayOfByte.zzc();
      if (k == 0)
      {
        k = 1;
        paramInt1 = i4;
      }
      else
      {
        if (k == 3) {
          paramInt1 = 1;
        } else {
          paramInt1 = 2;
        }
        if (k == 1) {
          k = 2;
        } else {
          k = 1;
        }
        m = i4 * k;
        k = paramInt1;
        paramInt1 = m;
      }
      n = i2 - (n + i12) * k;
      m = i1 - (i11 + i10) * paramInt1;
    }
    float f;
    if (paramArrayOfByte.zzf())
    {
      if (paramArrayOfByte.zzf())
      {
        paramInt1 = paramArrayOfByte.zza(8);
        if (paramInt1 == 255)
        {
          paramInt1 = paramArrayOfByte.zza(16);
          k = paramArrayOfByte.zza(16);
          if ((paramInt1 != 0) && (k != 0))
          {
            f = paramInt1 / k;
            break label702;
          }
        }
        else
        {
          if (paramInt1 < 17)
          {
            f = zzb[paramInt1];
            break label702;
          }
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unexpected aspect_ratio_idc value: ");
          localStringBuilder.append(paramInt1);
          zzer.zze("NalUnitUtil", localStringBuilder.toString());
        }
      }
      f = 1.0F;
      label702:
      if (paramArrayOfByte.zzf()) {
        paramArrayOfByte.zzd();
      }
      if (paramArrayOfByte.zzf())
      {
        paramArrayOfByte.zze(3);
        paramInt1 = i3;
        if (true != paramArrayOfByte.zzf()) {
          paramInt1 = 2;
        }
        if (paramArrayOfByte.zzf())
        {
          i1 = paramArrayOfByte.zza(8);
          k = paramArrayOfByte.zza(8);
          paramArrayOfByte.zze(8);
          i1 = zzs.zza(i1);
          k = zzs.zzb(k);
          break label800;
        }
        break label794;
      }
    }
    else
    {
      f = 1.0F;
    }
    paramInt1 = -1;
    label794:
    i1 = -1;
    k = -1;
    label800:
    return new zzev(paramInt2, i7, i5, i6, i9, n, m, f, bool2, bool1, i8 + 4, i, j, bool3, i1, paramInt1, k);
  }
  
  public static void zze(boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    paramArrayOfBoolean[1] = false;
    paramArrayOfBoolean[2] = false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */