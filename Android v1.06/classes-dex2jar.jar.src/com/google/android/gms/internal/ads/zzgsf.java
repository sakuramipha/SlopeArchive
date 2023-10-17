package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzgsf
{
  private static final zzgsc zza = new zzgsd();
  
  static
  {
    if ((zzgsa.zzA()) && (zzgsa.zzB())) {
      int i = zzgmz.zza;
    }
  }
  
  static int zzd(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int k = paramCharSequence.length();
    int m;
    int n;
    for (int j = 0;; j++)
    {
      m = paramInt1 + paramInt2;
      if (j >= k) {
        break;
      }
      int i1 = j + paramInt1;
      if (i1 >= m) {
        break;
      }
      n = paramCharSequence.charAt(j);
      if (n >= 128) {
        break;
      }
      paramArrayOfByte[i1] = ((byte)n);
    }
    if (j == k)
    {
      j = paramInt1 + k;
    }
    else
    {
      paramInt2 = paramInt1 + j;
      int i;
      for (paramInt1 = j;; paramInt1++)
      {
        j = paramInt2;
        if (paramInt1 >= k) {
          break label538;
        }
        i = paramCharSequence.charAt(paramInt1);
        if ((i < 128) && (paramInt2 < m))
        {
          j = paramInt2 + 1;
          paramArrayOfByte[paramInt2] = ((byte)i);
          paramInt2 = j;
        }
        for (;;)
        {
          break;
          if ((i < 2048) && (paramInt2 <= m - 2))
          {
            j = paramInt2 + 1;
            paramArrayOfByte[paramInt2] = ((byte)(i >>> 6 | 0x3C0));
            paramInt2 = j + 1;
            paramArrayOfByte[j] = ((byte)(i & 0x3F | 0x80));
          }
          else if (((i < 55296) || (i > 57343)) && (paramInt2 <= m - 3))
          {
            j = paramInt2 + 1;
            paramArrayOfByte[paramInt2] = ((byte)(i >>> 12 | 0x1E0));
            n = j + 1;
            paramArrayOfByte[j] = ((byte)(i >>> 6 & 0x3F | 0x80));
            paramInt2 = n + 1;
            paramArrayOfByte[n] = ((byte)(i & 0x3F | 0x80));
          }
          else
          {
            if (paramInt2 > m - 4) {
              break label434;
            }
            j = paramInt1 + 1;
            if (j == paramCharSequence.length()) {
              break label421;
            }
            char c = paramCharSequence.charAt(j);
            if (!Character.isSurrogatePair(i, c)) {
              break label418;
            }
            paramInt1 = Character.toCodePoint(i, c);
            n = paramInt2 + 1;
            paramArrayOfByte[paramInt2] = ((byte)(paramInt1 >>> 18 | 0xF0));
            paramInt2 = n + 1;
            paramArrayOfByte[n] = ((byte)(paramInt1 >>> 12 & 0x3F | 0x80));
            n = paramInt2 + 1;
            paramArrayOfByte[paramInt2] = ((byte)(paramInt1 >>> 6 & 0x3F | 0x80));
            paramInt2 = n + 1;
            paramArrayOfByte[n] = ((byte)(paramInt1 & 0x3F | 0x80));
            paramInt1 = j;
          }
        }
      }
      label418:
      paramInt1 = j;
      label421:
      throw new zzgse(paramInt1 - 1, k);
      label434:
      if ((i >= 55296) && (i <= 57343))
      {
        j = paramInt1 + 1;
        if ((j == paramCharSequence.length()) || (!Character.isSurrogatePair(i, paramCharSequence.charAt(j)))) {
          throw new zzgse(paramInt1, k);
        }
      }
      paramCharSequence = new StringBuilder();
      paramCharSequence.append("Failed writing ");
      paramCharSequence.append(i);
      paramCharSequence.append(" at index ");
      paramCharSequence.append(paramInt2);
      throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
    }
    label538:
    return j;
  }
  
  static int zze(CharSequence paramCharSequence)
  {
    int n = paramCharSequence.length();
    int m = 0;
    for (int j = 0; (j < n) && (paramCharSequence.charAt(j) < ''); j++) {}
    int i = n;
    for (;;)
    {
      k = i;
      if (j >= n) {
        break label206;
      }
      k = paramCharSequence.charAt(j);
      if (k >= 2048) {
        break;
      }
      i += (127 - k >>> 31);
      j++;
    }
    int i2 = paramCharSequence.length();
    int k = m;
    while (j < i2)
    {
      int i3 = paramCharSequence.charAt(j);
      if (i3 < 2048)
      {
        k += (127 - i3 >>> 31);
        m = j;
      }
      else
      {
        int i1 = k + 2;
        k = i1;
        m = j;
        if (i3 >= 55296)
        {
          k = i1;
          m = j;
          if (i3 <= 57343) {
            if (Character.codePointAt(paramCharSequence, j) >= 65536)
            {
              m = j + 1;
              k = i1;
            }
            else
            {
              throw new zzgse(j, i2);
            }
          }
        }
      }
      j = m + 1;
    }
    k = i + k;
    label206:
    if (k >= n) {
      return k;
    }
    long l = k;
    paramCharSequence = new StringBuilder();
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(l + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  static int zzf(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    return zza.zza(paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  static String zzg(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
    throws zzgpi
  {
    zzgsc localzzgsc = zza;
    if (paramByteBuffer.hasArray())
    {
      int i = paramByteBuffer.arrayOffset();
      paramByteBuffer = localzzgsc.zzb(paramByteBuffer.array(), i + paramInt1, paramInt2);
    }
    else if (paramByteBuffer.isDirect())
    {
      paramByteBuffer = zzgsd.zzd(paramByteBuffer, paramInt1, paramInt2);
    }
    else
    {
      paramByteBuffer = zzgsc.zzd(paramByteBuffer, paramInt1, paramInt2);
    }
    return paramByteBuffer;
  }
  
  static String zzh(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzgpi
  {
    return zza.zzb(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  static boolean zzi(byte[] paramArrayOfByte)
  {
    return zza.zzc(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  static boolean zzj(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zza.zzc(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static int zzk(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65)) {
      return paramInt1 ^ paramInt2 << 8;
    }
    return -1;
  }
  
  private static int zzl(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 <= -12) && (paramInt2 <= -65) && (paramInt3 <= -65)) {
      return paramInt1 ^ paramInt2 << 8 ^ paramInt3 << 16;
    }
    return -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgsf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */