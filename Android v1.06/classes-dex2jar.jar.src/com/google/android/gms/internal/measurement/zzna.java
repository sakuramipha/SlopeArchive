package com.google.android.gms.internal.measurement;

final class zzna
{
  private static final zzmx zza = new zzmy();
  
  static
  {
    if ((zzmv.zzx()) && (zzmv.zzy())) {
      int i = zzin.zza;
    }
  }
  
  static int zzb(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int k = paramCharSequence.length();
    int m = paramInt2 + paramInt1;
    int n;
    for (int j = 0; j < k; j++)
    {
      paramInt2 = j + paramInt1;
      if (paramInt2 >= m) {
        break;
      }
      n = paramCharSequence.charAt(j);
      if (n >= 128) {
        break;
      }
      paramArrayOfByte[paramInt2] = ((byte)n);
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
          break label535;
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
              break label431;
            }
            j = paramInt1 + 1;
            if (j == paramCharSequence.length()) {
              break label418;
            }
            char c = paramCharSequence.charAt(j);
            if (!Character.isSurrogatePair(i, c)) {
              break label415;
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
      label415:
      paramInt1 = j;
      label418:
      throw new zzmz(paramInt1 - 1, k);
      label431:
      if ((i >= 55296) && (i <= 57343))
      {
        j = paramInt1 + 1;
        if ((j == paramCharSequence.length()) || (!Character.isSurrogatePair(i, paramCharSequence.charAt(j)))) {
          throw new zzmz(paramInt1, k);
        }
      }
      paramCharSequence = new StringBuilder();
      paramCharSequence.append("Failed writing ");
      paramCharSequence.append(i);
      paramCharSequence.append(" at index ");
      paramCharSequence.append(paramInt2);
      throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
    }
    label535:
    return j;
  }
  
  static int zzc(CharSequence paramCharSequence)
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
              throw new zzmz(j, i2);
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
    paramCharSequence = new StringBuilder();
    paramCharSequence.append("UTF-8 length does not fit in int: ");
    paramCharSequence.append(k + 4294967296L);
    throw new IllegalArgumentException(paramCharSequence.toString());
  }
  
  static String zzd(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzkm
  {
    int i = paramArrayOfByte.length;
    if ((paramInt1 | paramInt2 | i - paramInt1 - paramInt2) >= 0)
    {
      int k = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      i = 0;
      int j = paramInt1;
      byte b;
      for (;;)
      {
        paramInt1 = i;
        paramInt2 = j;
        if (j >= k) {
          break;
        }
        b = paramArrayOfByte[j];
        if (!zzmw.zzd(b))
        {
          paramInt1 = i;
          paramInt2 = j;
          break;
        }
        j++;
        arrayOfChar[i] = ((char)b);
        i++;
      }
      while (paramInt2 < k)
      {
        i = paramInt2 + 1;
        b = paramArrayOfByte[paramInt2];
        if (zzmw.zzd(b))
        {
          paramInt2 = paramInt1 + 1;
          arrayOfChar[paramInt1] = ((char)b);
          paramInt1 = paramInt2;
          for (;;)
          {
            j = paramInt1;
            paramInt1 = j;
            paramInt2 = i;
            if (i >= k) {
              break;
            }
            b = paramArrayOfByte[i];
            if (!zzmw.zzd(b))
            {
              paramInt1 = j;
              paramInt2 = i;
              break;
            }
            i++;
            paramInt1 = j + 1;
            arrayOfChar[j] = ((char)b);
          }
        }
        if (b < -32)
        {
          if (i < k)
          {
            zzmw.zzc(b, paramArrayOfByte[i], arrayOfChar, paramInt1);
            paramInt2 = i + 1;
            paramInt1++;
          }
          else
          {
            throw zzkm.zzc();
          }
        }
        else if (b < -16)
        {
          if (i < k - 1)
          {
            paramInt2 = i + 1;
            zzmw.zzb(b, paramArrayOfByte[i], paramArrayOfByte[paramInt2], arrayOfChar, paramInt1);
            paramInt2++;
            paramInt1++;
          }
          else
          {
            throw zzkm.zzc();
          }
        }
        else if (i < k - 2)
        {
          j = i + 1;
          paramInt2 = j + 1;
          zzmw.zza(b, paramArrayOfByte[i], paramArrayOfByte[j], paramArrayOfByte[paramInt2], arrayOfChar, paramInt1);
          paramInt1 += 2;
          paramInt2++;
        }
        else
        {
          throw zzkm.zzc();
        }
      }
      return new String(arrayOfChar, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  static boolean zze(byte[] paramArrayOfByte)
  {
    return zza.zzb(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  static boolean zzf(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zza.zzb(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */