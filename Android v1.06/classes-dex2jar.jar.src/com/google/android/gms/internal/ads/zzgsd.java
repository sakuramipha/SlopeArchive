package com.google.android.gms.internal.ads;

final class zzgsd
  extends zzgsc
{
  final int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int m = 0;
    int i = paramInt2;
    if (paramInt1 != 0)
    {
      if (paramInt2 >= paramInt3) {
        return paramInt1;
      }
      int n = (byte)paramInt1;
      if (n < -32) {
        if (n >= -62)
        {
          paramInt1 = paramInt2 + 1;
          if (paramArrayOfByte[paramInt2] > -65) {}
        }
      }
      int j;
      label160:
      do
      {
        do
        {
          i = paramInt1;
          break label299;
          return -1;
          if (n >= -16) {
            break label160;
          }
          j = (byte)(paramInt1 >> 8 ^ 0xFFFFFFFF);
          paramInt1 = j;
          i = paramInt2;
          if (j == 0)
          {
            i = paramInt2 + 1;
            paramInt1 = paramArrayOfByte[paramInt2];
            if (i >= paramInt3) {
              return zzgsf.zza(n, paramInt1);
            }
          }
          if ((paramInt1 > -65) || ((n == -32) && (paramInt1 < -96)) || ((n == -19) && (paramInt1 >= -96))) {
            break;
          }
          paramInt1 = i + 1;
        } while (paramArrayOfByte[i] <= -65);
        return -1;
        i = (byte)(paramInt1 >> 8 ^ 0xFFFFFFFF);
        if (i == 0)
        {
          paramInt1 = paramInt2 + 1;
          i = paramArrayOfByte[paramInt2];
          if (paramInt1 < paramInt3)
          {
            paramInt2 = paramInt1;
            paramInt1 = 0;
          }
          else
          {
            return zzgsf.zza(n, i);
          }
        }
        else
        {
          paramInt1 >>= 16;
        }
        int k = paramInt1;
        j = paramInt2;
        if (paramInt1 == 0)
        {
          j = paramInt2 + 1;
          k = paramArrayOfByte[paramInt2];
          if (j >= paramInt3) {
            return zzgsf.zzb(n, i, k);
          }
        }
        if ((i > -65) || ((n << 28) + (i + 112) >> 30 != 0) || (k > -65)) {
          break;
        }
        paramInt1 = j + 1;
      } while (paramArrayOfByte[j] <= -65);
      return -1;
    }
    label299:
    while ((i < paramInt3) && (paramArrayOfByte[i] >= 0)) {
      i++;
    }
    paramInt1 = i;
    if (i >= paramInt3) {
      paramInt1 = m;
    }
    for (;;)
    {
      if (paramInt1 >= paramInt3)
      {
        paramInt1 = m;
      }
      else
      {
        paramInt2 = paramInt1 + 1;
        paramInt1 = paramArrayOfByte[paramInt1];
        if (paramInt1 >= 0) {
          break label558;
        }
        if (paramInt1 < -32)
        {
          if (paramInt2 >= paramInt3) {
            break label556;
          }
          if (paramInt1 >= -62)
          {
            paramInt1 = paramInt2 + 1;
            if (paramArrayOfByte[paramInt2] <= -65) {
              continue;
            }
          }
        }
        for (;;)
        {
          paramInt1 = -1;
          break label556;
          if (paramInt1 < -16)
          {
            if (paramInt2 >= paramInt3 - 1)
            {
              paramInt1 = zzgsf.zzc(paramArrayOfByte, paramInt2, paramInt3);
              break label556;
            }
            i = paramInt2 + 1;
            paramInt2 = paramArrayOfByte[paramInt2];
            if ((paramInt2 > -65) || ((paramInt1 == -32) && (paramInt2 < -96)) || ((paramInt1 == -19) && (paramInt2 >= -96))) {
              continue;
            }
            paramInt1 = i + 1;
            if (paramArrayOfByte[i] <= -65) {
              break;
            }
            continue;
          }
          if (paramInt2 >= paramInt3 - 2)
          {
            paramInt1 = zzgsf.zzc(paramArrayOfByte, paramInt2, paramInt3);
            break label556;
          }
          i = paramInt2 + 1;
          paramInt2 = paramArrayOfByte[paramInt2];
          if ((paramInt2 <= -65) && ((paramInt1 << 28) + (paramInt2 + 112) >> 30 == 0))
          {
            paramInt2 = i + 1;
            if (paramArrayOfByte[i] <= -65)
            {
              paramInt1 = paramInt2 + 1;
              if (paramArrayOfByte[paramInt2] <= -65) {
                break;
              }
            }
          }
        }
      }
      label556:
      return paramInt1;
      label558:
      paramInt1 = paramInt2;
    }
  }
  
  final String zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzgpi
  {
    int i = paramArrayOfByte.length;
    if ((i - paramInt1 - paramInt2 | paramInt1 | paramInt2) >= 0)
    {
      int k = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      i = 0;
      int j = paramInt1;
      byte b1;
      for (;;)
      {
        paramInt1 = i;
        paramInt2 = j;
        if (j >= k) {
          break;
        }
        b1 = paramArrayOfByte[j];
        paramInt1 = i;
        paramInt2 = j;
        if (!zzgsb.zzd(b1)) {
          break;
        }
        j++;
        arrayOfChar[i] = ((char)b1);
        i++;
      }
      while (paramInt2 < k)
      {
        i = paramInt2 + 1;
        b1 = paramArrayOfByte[paramInt2];
        if (zzgsb.zzd(b1))
        {
          paramInt2 = paramInt1 + 1;
          arrayOfChar[paramInt1] = ((char)b1);
          paramInt1 = paramInt2;
          for (;;)
          {
            j = paramInt1;
            paramInt1 = j;
            paramInt2 = i;
            if (i >= k) {
              break;
            }
            b1 = paramArrayOfByte[i];
            paramInt1 = j;
            paramInt2 = i;
            if (!zzgsb.zzd(b1)) {
              break;
            }
            i++;
            paramInt1 = j + 1;
            arrayOfChar[j] = ((char)b1);
          }
        }
        if (zzgsb.zzf(b1))
        {
          if (i < k)
          {
            zzgsb.zzc(b1, paramArrayOfByte[i], arrayOfChar, paramInt1);
            paramInt2 = i + 1;
            paramInt1++;
          }
          else
          {
            throw zzgpi.zzd();
          }
        }
        else if (zzgsb.zze(b1))
        {
          if (i < k - 1)
          {
            paramInt2 = i + 1;
            zzgsb.zzb(b1, paramArrayOfByte[i], paramArrayOfByte[paramInt2], arrayOfChar, paramInt1);
            paramInt2++;
            paramInt1++;
          }
          else
          {
            throw zzgpi.zzd();
          }
        }
        else if (i < k - 2)
        {
          j = i + 1;
          byte b2 = paramArrayOfByte[i];
          paramInt2 = j + 1;
          zzgsb.zza(b1, b2, paramArrayOfByte[j], paramArrayOfByte[paramInt2], arrayOfChar, paramInt1);
          paramInt1 += 2;
          paramInt2++;
        }
        else
        {
          throw zzgpi.zzd();
        }
      }
      return new String(arrayOfChar, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgsd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */