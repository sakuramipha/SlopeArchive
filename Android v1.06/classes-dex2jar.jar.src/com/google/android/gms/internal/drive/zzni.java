package com.google.android.gms.internal.drive;

final class zzni
  extends zznh
{
  final int zzb(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    while ((paramInt2 < paramInt3) && (paramArrayOfByte[paramInt2] >= 0)) {
      paramInt2++;
    }
    paramInt1 = paramInt2;
    if (paramInt2 >= paramInt3) {
      return 0;
    }
    label241:
    for (;;)
    {
      if (paramInt1 >= paramInt3) {
        return 0;
      }
      paramInt2 = paramInt1 + 1;
      int i = paramArrayOfByte[paramInt1];
      paramInt1 = paramInt2;
      if (i < 0) {
        if (i < -32)
        {
          if (paramInt2 >= paramInt3) {
            return i;
          }
          if (i >= -62)
          {
            paramInt1 = paramInt2 + 1;
            if (paramArrayOfByte[paramInt2] <= -65) {}
          }
          else
          {
            return -1;
          }
        }
        else if (i < -16)
        {
          if (paramInt2 >= paramInt3 - 1) {
            return zznf.zzh(paramArrayOfByte, paramInt2, paramInt3);
          }
          int j = paramInt2 + 1;
          paramInt1 = paramArrayOfByte[paramInt2];
          if ((paramInt1 <= -65) && ((i != -32) || (paramInt1 >= -96)) && ((i != -19) || (paramInt1 < -96)))
          {
            paramInt1 = j + 1;
            if (paramArrayOfByte[j] <= -65) {}
          }
          else
          {
            return -1;
          }
        }
        else
        {
          if (paramInt2 >= paramInt3 - 2) {
            return zznf.zzh(paramArrayOfByte, paramInt2, paramInt3);
          }
          paramInt1 = paramInt2 + 1;
          paramInt2 = paramArrayOfByte[paramInt2];
          if ((paramInt2 <= -65) && ((i << 28) + (paramInt2 + 112) >> 30 == 0))
          {
            paramInt2 = paramInt1 + 1;
            if (paramArrayOfByte[paramInt1] <= -65)
            {
              paramInt1 = paramInt2 + 1;
              if (paramArrayOfByte[paramInt2] <= -65) {
                break label241;
              }
            }
          }
          return -1;
        }
      }
    }
  }
  
  final int zzb(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int k = paramCharSequence.length();
    int m = paramInt2 + paramInt1;
    int n;
    for (paramInt2 = 0; paramInt2 < k; paramInt2++)
    {
      n = paramInt2 + paramInt1;
      if (n >= m) {
        break;
      }
      j = paramCharSequence.charAt(paramInt2);
      if (j >= 128) {
        break;
      }
      paramArrayOfByte[n] = ((byte)j);
    }
    if (paramInt2 == k) {
      return paramInt1 + k;
    }
    int j = paramInt1 + paramInt2;
    paramInt1 = paramInt2;
    while (paramInt1 < k)
    {
      int i = paramCharSequence.charAt(paramInt1);
      if ((i < 128) && (j < m))
      {
        paramInt2 = j + 1;
        paramArrayOfByte[j] = ((byte)i);
      }
      for (;;)
      {
        break;
        if ((i < 2048) && (j <= m - 2))
        {
          n = j + 1;
          paramArrayOfByte[j] = ((byte)(i >>> 6 | 0x3C0));
          paramInt2 = n + 1;
          paramArrayOfByte[n] = ((byte)(i & 0x3F | 0x80));
        }
        else if (((i < 55296) || (57343 < i)) && (j <= m - 3))
        {
          paramInt2 = j + 1;
          paramArrayOfByte[j] = ((byte)(i >>> 12 | 0x1E0));
          j = paramInt2 + 1;
          paramArrayOfByte[paramInt2] = ((byte)(i >>> 6 & 0x3F | 0x80));
          paramInt2 = j + 1;
          paramArrayOfByte[j] = ((byte)(i & 0x3F | 0x80));
        }
        else
        {
          if (j > m - 4) {
            break label452;
          }
          paramInt2 = paramInt1 + 1;
          if (paramInt2 == paramCharSequence.length()) {
            break label439;
          }
          char c = paramCharSequence.charAt(paramInt2);
          if (!Character.isSurrogatePair(i, c)) {
            break label436;
          }
          paramInt1 = Character.toCodePoint(i, c);
          n = j + 1;
          paramArrayOfByte[j] = ((byte)(paramInt1 >>> 18 | 0xF0));
          j = n + 1;
          paramArrayOfByte[n] = ((byte)(paramInt1 >>> 12 & 0x3F | 0x80));
          n = j + 1;
          paramArrayOfByte[j] = ((byte)(paramInt1 >>> 6 & 0x3F | 0x80));
          j = n + 1;
          paramArrayOfByte[n] = ((byte)(paramInt1 & 0x3F | 0x80));
          paramInt1 = paramInt2;
          paramInt2 = j;
        }
      }
      paramInt1++;
      j = paramInt2;
      continue;
      label436:
      paramInt1 = paramInt2;
      label439:
      throw new zznj(paramInt1 - 1, k);
      label452:
      if ((55296 <= i) && (i <= 57343))
      {
        paramInt2 = paramInt1 + 1;
        if ((paramInt2 == paramCharSequence.length()) || (!Character.isSurrogatePair(i, paramCharSequence.charAt(paramInt2)))) {
          throw new zznj(paramInt1, k);
        }
      }
      paramCharSequence = new StringBuilder(37);
      paramCharSequence.append("Failed writing ");
      paramCharSequence.append(i);
      paramCharSequence.append(" at index ");
      paramCharSequence.append(j);
      throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
    }
    return j;
  }
  
  final String zzg(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzkq
  {
    if ((paramInt1 | paramInt2 | paramArrayOfByte.length - paramInt1 - paramInt2) >= 0)
    {
      int j = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      byte b1;
      for (paramInt2 = 0; paramInt1 < j; paramInt2++)
      {
        b1 = paramArrayOfByte[paramInt1];
        if (!zzng.zzh(b1)) {
          break;
        }
        paramInt1++;
        zzng.zzb(b1, arrayOfChar, paramInt2);
      }
      int i = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = i;
      while (paramInt2 < j)
      {
        i = paramInt2 + 1;
        byte b2 = paramArrayOfByte[paramInt2];
        if (zzng.zzh(b2))
        {
          paramInt2 = paramInt1 + 1;
          zzng.zzb(b2, arrayOfChar, paramInt1);
          paramInt1 = paramInt2;
          paramInt2 = i;
          while (paramInt2 < j)
          {
            b1 = paramArrayOfByte[paramInt2];
            if (!zzng.zzh(b1)) {
              break;
            }
            paramInt2++;
            zzng.zzb(b1, arrayOfChar, paramInt1);
            paramInt1++;
          }
        }
        else if (zzng.zzi(b2))
        {
          if (i < j)
          {
            zzng.zzb(b2, paramArrayOfByte[i], arrayOfChar, paramInt1);
            paramInt2 = i + 1;
            paramInt1++;
          }
          else
          {
            throw zzkq.zzdn();
          }
        }
        else if (zzng.zzj(b2))
        {
          if (i < j - 1)
          {
            paramInt2 = i + 1;
            zzng.zzb(b2, paramArrayOfByte[i], paramArrayOfByte[paramInt2], arrayOfChar, paramInt1);
            paramInt2++;
            paramInt1++;
          }
          else
          {
            throw zzkq.zzdn();
          }
        }
        else if (i < j - 2)
        {
          paramInt2 = i + 1;
          b1 = paramArrayOfByte[i];
          i = paramInt2 + 1;
          zzng.zzb(b2, b1, paramArrayOfByte[paramInt2], paramArrayOfByte[i], arrayOfChar, paramInt1);
          paramInt2 = i + 1;
          paramInt1 = paramInt1 + 1 + 1;
        }
        else
        {
          throw zzkq.zzdn();
        }
      }
      return new String(arrayOfChar, 0, paramInt1);
    }
    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */