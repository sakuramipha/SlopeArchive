package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

abstract class zzgsc
{
  static final String zzd(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
    throws zzgpi
  {
    if ((paramByteBuffer.limit() - paramInt1 - paramInt2 | paramInt1 | paramInt2) >= 0)
    {
      int k = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      byte b1;
      for (paramInt2 = 0; paramInt1 < k; paramInt2++)
      {
        b1 = paramByteBuffer.get(paramInt1);
        if (!zzgsb.zzd(b1)) {
          break;
        }
        paramInt1++;
        arrayOfChar[paramInt2] = ((char)b1);
      }
      int i = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = i;
      while (paramInt2 < k)
      {
        i = paramInt2 + 1;
        b1 = paramByteBuffer.get(paramInt2);
        int j;
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
            b1 = paramByteBuffer.get(i);
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
            zzgsb.zzc(b1, paramByteBuffer.get(i), arrayOfChar, paramInt1);
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
            zzgsb.zzb(b1, paramByteBuffer.get(i), paramByteBuffer.get(paramInt2), arrayOfChar, paramInt1);
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
          byte b2 = paramByteBuffer.get(i);
          paramInt2 = j + 1;
          zzgsb.zza(b1, b2, paramByteBuffer.get(j), paramByteBuffer.get(paramInt2), arrayOfChar, paramInt1);
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
    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[] { Integer.valueOf(paramByteBuffer.limit()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  abstract int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
  
  abstract String zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzgpi;
  
  final boolean zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return zza(0, paramArrayOfByte, paramInt1, paramInt2) == 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgsc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */