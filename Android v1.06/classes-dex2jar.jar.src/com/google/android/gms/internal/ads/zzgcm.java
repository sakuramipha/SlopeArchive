package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

public final class zzgcm
  extends zzgcn
{
  public zzgcm(byte[] paramArrayOfByte, int paramInt)
    throws InvalidKeyException
  {
    super(paramArrayOfByte, paramInt);
  }
  
  public final int zza()
  {
    return 12;
  }
  
  public final int[] zzb(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    if (i == 3)
    {
      int[] arrayOfInt = new int[16];
      zzgcj.zzb(arrayOfInt, this.zza);
      arrayOfInt[12] = paramInt;
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 13, 3);
      return arrayOfInt;
    }
    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[] { Integer.valueOf(i * 32) }));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgcm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */