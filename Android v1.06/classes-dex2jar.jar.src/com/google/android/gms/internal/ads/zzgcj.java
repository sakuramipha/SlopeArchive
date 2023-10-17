package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

final class zzgcj
{
  private static final int[] zza = zzd(new byte[] { 101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107 });
  
  static void zza(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramArrayOfInt[paramInt1] + paramArrayOfInt[paramInt2];
    paramArrayOfInt[paramInt1] = i;
    i ^= paramArrayOfInt[paramInt4];
    i = i >>> -16 | i << 16;
    paramArrayOfInt[paramInt4] = i;
    i = paramArrayOfInt[paramInt3] + i;
    paramArrayOfInt[paramInt3] = i;
    i = paramArrayOfInt[paramInt2] ^ i;
    i = i >>> -12 | i << 12;
    paramArrayOfInt[paramInt2] = i;
    i = paramArrayOfInt[paramInt1] + i;
    paramArrayOfInt[paramInt1] = i;
    paramInt1 = paramArrayOfInt[paramInt4] ^ i;
    paramInt1 = paramInt1 >>> -8 | paramInt1 << 8;
    paramArrayOfInt[paramInt4] = paramInt1;
    paramInt1 = paramArrayOfInt[paramInt3] + paramInt1;
    paramArrayOfInt[paramInt3] = paramInt1;
    paramInt1 = paramArrayOfInt[paramInt2] ^ paramInt1;
    paramArrayOfInt[paramInt2] = (paramInt1 >>> -7 | paramInt1 << 7);
  }
  
  static void zzb(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int[] arrayOfInt = zza;
    System.arraycopy(arrayOfInt, 0, paramArrayOfInt1, 0, arrayOfInt.length);
    System.arraycopy(paramArrayOfInt2, 0, paramArrayOfInt1, arrayOfInt.length, 8);
  }
  
  static void zzc(int[] paramArrayOfInt)
  {
    for (int i = 0; i < 10; i++)
    {
      zza(paramArrayOfInt, 0, 4, 8, 12);
      zza(paramArrayOfInt, 1, 5, 9, 13);
      zza(paramArrayOfInt, 2, 6, 10, 14);
      zza(paramArrayOfInt, 3, 7, 11, 15);
      zza(paramArrayOfInt, 0, 5, 10, 15);
      zza(paramArrayOfInt, 1, 6, 11, 12);
      zza(paramArrayOfInt, 2, 7, 8, 13);
      zza(paramArrayOfInt, 3, 4, 9, 14);
    }
  }
  
  static int[] zzd(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
    int[] arrayOfInt = new int[paramArrayOfByte.remaining()];
    paramArrayOfByte.get(arrayOfInt);
    return arrayOfInt;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */