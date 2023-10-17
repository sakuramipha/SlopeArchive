package com.google.android.gms.internal.drive;

final class zznk
  extends zznh
{
  private static int zza(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2) {
          return zznf.zzd(paramInt1, zznd.zza(paramArrayOfByte, paramLong), zznd.zza(paramArrayOfByte, paramLong + 1L));
        }
        throw new AssertionError();
      }
      return zznf.zzs(paramInt1, zznd.zza(paramArrayOfByte, paramLong));
    }
    return zznf.zzaz(paramInt1);
  }
  
  final int zzb(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if ((paramInt2 | paramInt3 | paramArrayOfByte.length - paramInt3) >= 0)
    {
      long l2 = paramInt2;
      paramInt2 = (int)(paramInt3 - l2);
      if (paramInt2 < 16)
      {
        paramInt1 = 0;
      }
      else
      {
        l1 = l2;
        paramInt1 = 0;
        while (paramInt1 < paramInt2)
        {
          if (zznd.zza(paramArrayOfByte, l1) < 0) {
            break label73;
          }
          paramInt1++;
          l1 += 1L;
        }
        paramInt1 = paramInt2;
      }
      label73:
      paramInt2 -= paramInt1;
      long l1 = l2 + paramInt1;
      paramInt1 = paramInt2;
      paramInt3 = 0;
      paramInt2 = paramInt1;
      paramInt1 = paramInt3;
      for (;;)
      {
        l2 = l1;
        if (paramInt2 <= 0) {
          break;
        }
        l2 = l1 + 1L;
        paramInt1 = zznd.zza(paramArrayOfByte, l1);
        if (paramInt1 < 0) {
          break;
        }
        paramInt2--;
        l1 = l2;
      }
      if (paramInt2 == 0) {
        return 0;
      }
      paramInt2--;
      if (paramInt1 < -32)
      {
        if (paramInt2 == 0) {
          return paramInt1;
        }
        paramInt2--;
        if (paramInt1 >= -62)
        {
          l1 = l2 + 1L;
          paramInt1 = paramInt2;
          if (zznd.zza(paramArrayOfByte, l2) > -65) {}
        }
      }
      do
      {
        break;
        return -1;
        if (paramInt1 < -16)
        {
          if (paramInt2 < 2) {
            return zza(paramArrayOfByte, paramInt1, l2, paramInt2);
          }
          paramInt2 -= 2;
          long l3 = l2 + 1L;
          paramInt3 = zznd.zza(paramArrayOfByte, l2);
          if ((paramInt3 <= -65) && ((paramInt1 != -32) || (paramInt3 >= -96)) && ((paramInt1 != -19) || (paramInt3 < -96)))
          {
            l1 = l3 + 1L;
            paramInt1 = paramInt2;
            if (zznd.zza(paramArrayOfByte, l3) <= -65) {
              break;
            }
          }
          return -1;
        }
        if (paramInt2 < 3) {
          return zza(paramArrayOfByte, paramInt1, l2, paramInt2);
        }
        paramInt2 -= 3;
        l1 = l2 + 1L;
        paramInt3 = zznd.zza(paramArrayOfByte, l2);
        if ((paramInt3 > -65) || ((paramInt1 << 28) + (paramInt3 + 112) >> 30 != 0)) {
          break label367;
        }
        l2 = l1 + 1L;
        if (zznd.zza(paramArrayOfByte, l1) > -65) {
          break label367;
        }
        l1 = l2 + 1L;
        paramInt1 = paramInt2;
      } while (zznd.zza(paramArrayOfByte, l2) <= -65);
      label367:
      return -1;
    }
    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
  }
  
  final int zzb(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l2 = paramInt1;
    long l5 = paramInt2 + l2;
    int j = paramCharSequence.length();
    if ((j <= paramInt2) && (paramArrayOfByte.length - paramInt2 >= paramInt1))
    {
      paramInt2 = 0;
      long l1;
      for (;;)
      {
        l1 = 1L;
        if (paramInt2 >= j) {
          break;
        }
        paramInt1 = paramCharSequence.charAt(paramInt2);
        if (paramInt1 >= 128) {
          break;
        }
        zznd.zza(paramArrayOfByte, l2, (byte)paramInt1);
        paramInt2++;
        l2 = 1L + l2;
      }
      paramInt1 = paramInt2;
      long l3 = l2;
      if (paramInt2 == j) {
        return (int)l2;
      }
      while (paramInt1 < j)
      {
        int i = paramCharSequence.charAt(paramInt1);
        if ((i < 128) && (l3 < l5))
        {
          zznd.zza(paramArrayOfByte, l3, (byte)i);
          long l4 = l1;
          l2 = l3 + l1;
          l1 = l4;
        }
        for (;;)
        {
          break;
          if ((i < 2048) && (l3 <= l5 - 2L))
          {
            l2 = l3 + l1;
            zznd.zza(paramArrayOfByte, l3, (byte)(i >>> 6 | 0x3C0));
            zznd.zza(paramArrayOfByte, l2, (byte)(i & 0x3F | 0x80));
            l2 += l1;
          }
          else if (((i < 55296) || (57343 < i)) && (l3 <= l5 - 3L))
          {
            l2 = l3 + l1;
            zznd.zza(paramArrayOfByte, l3, (byte)(i >>> 12 | 0x1E0));
            l1 = l2 + l1;
            zznd.zza(paramArrayOfByte, l2, (byte)(i >>> 6 & 0x3F | 0x80));
            zznd.zza(paramArrayOfByte, l1, (byte)(i & 0x3F | 0x80));
            l2 = l1 + 1L;
            l1 = 1L;
          }
          else
          {
            if (l3 > l5 - 4L) {
              break label507;
            }
            paramInt2 = paramInt1 + 1;
            if (paramInt2 == j) {
              break label494;
            }
            c = paramCharSequence.charAt(paramInt2);
            if (!Character.isSurrogatePair(i, c)) {
              break label491;
            }
            paramInt1 = Character.toCodePoint(i, c);
            l2 = l3 + 1L;
            zznd.zza(paramArrayOfByte, l3, (byte)(paramInt1 >>> 18 | 0xF0));
            l1 = l2 + 1L;
            zznd.zza(paramArrayOfByte, l2, (byte)(paramInt1 >>> 12 & 0x3F | 0x80));
            l3 = l1 + 1L;
            zznd.zza(paramArrayOfByte, l1, (byte)(paramInt1 >>> 6 & 0x3F | 0x80));
            l1 = 1L;
            l2 = l3 + 1L;
            zznd.zza(paramArrayOfByte, l3, (byte)(paramInt1 & 0x3F | 0x80));
            paramInt1 = paramInt2;
          }
        }
        paramInt1++;
        l3 = l2;
        continue;
        label491:
        paramInt1 = paramInt2;
        label494:
        throw new zznj(paramInt1 - 1, j);
        label507:
        if ((55296 <= i) && (i <= 57343))
        {
          paramInt2 = paramInt1 + 1;
          if ((paramInt2 == j) || (!Character.isSurrogatePair(i, paramCharSequence.charAt(paramInt2)))) {
            throw new zznj(paramInt1, j);
          }
        }
        paramCharSequence = new StringBuilder(46);
        paramCharSequence.append("Failed writing ");
        paramCharSequence.append(i);
        paramCharSequence.append(" at index ");
        paramCharSequence.append(l3);
        throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
      }
      return (int)l3;
    }
    char c = paramCharSequence.charAt(j - 1);
    paramCharSequence = new StringBuilder(37);
    paramCharSequence.append("Failed writing ");
    paramCharSequence.append(c);
    paramCharSequence.append(" at index ");
    paramCharSequence.append(paramInt1 + paramInt2);
    throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
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
        b1 = zznd.zza(paramArrayOfByte, paramInt1);
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
        b1 = zznd.zza(paramArrayOfByte, paramInt2);
        if (zzng.zzh(b1))
        {
          paramInt2 = paramInt1 + 1;
          zzng.zzb(b1, arrayOfChar, paramInt1);
          paramInt1 = paramInt2;
          paramInt2 = i;
          while (paramInt2 < j)
          {
            b1 = zznd.zza(paramArrayOfByte, paramInt2);
            if (!zzng.zzh(b1)) {
              break;
            }
            paramInt2++;
            zzng.zzb(b1, arrayOfChar, paramInt1);
            paramInt1++;
          }
        }
        else if (zzng.zzi(b1))
        {
          if (i < j)
          {
            zzng.zzb(b1, zznd.zza(paramArrayOfByte, i), arrayOfChar, paramInt1);
            paramInt2 = i + 1;
            paramInt1++;
          }
          else
          {
            throw zzkq.zzdn();
          }
        }
        else if (zzng.zzj(b1))
        {
          if (i < j - 1)
          {
            paramInt2 = i + 1;
            zzng.zzb(b1, zznd.zza(paramArrayOfByte, i), zznd.zza(paramArrayOfByte, paramInt2), arrayOfChar, paramInt1);
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
          byte b2 = zznd.zza(paramArrayOfByte, i);
          i = paramInt2 + 1;
          zzng.zzb(b1, b2, zznd.zza(paramArrayOfByte, paramInt2), zznd.zza(paramArrayOfByte, i), arrayOfChar, paramInt1);
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zznk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */