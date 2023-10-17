package com.google.android.gms.internal.ads;

public final class zzggs
{
  public static byte[] zza(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 16)
    {
      byte[] arrayOfByte = new byte[16];
      for (int j = 0; j < 16; j++)
      {
        int k = paramArrayOfByte[j];
        int i = (byte)(k + k & 0xFE);
        arrayOfByte[j] = i;
        if (j < 15) {
          arrayOfByte[j] = ((byte)(paramArrayOfByte[(j + 1)] >> 7 & 0x1 | i));
        }
      }
      j = arrayOfByte[15];
      arrayOfByte[15] = ((byte)((byte)(paramArrayOfByte[0] >> 7 & 0x87) ^ j));
      return arrayOfByte;
    }
    throw new IllegalArgumentException("value must be a block.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzggs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */