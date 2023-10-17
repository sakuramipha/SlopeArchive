package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

public final class zzgcq
  extends zzgcn
{
  public zzgcq(byte[] paramArrayOfByte, int paramInt)
    throws InvalidKeyException
  {
    super(paramArrayOfByte, paramInt);
  }
  
  final int zza()
  {
    return 24;
  }
  
  final int[] zzb(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    if (i == 6)
    {
      int[] arrayOfInt1 = new int[16];
      int[] arrayOfInt2 = this.zza;
      int[] arrayOfInt3 = new int[16];
      zzgcj.zzb(arrayOfInt3, arrayOfInt2);
      arrayOfInt3[12] = paramArrayOfInt[0];
      arrayOfInt3[13] = paramArrayOfInt[1];
      arrayOfInt3[14] = paramArrayOfInt[2];
      arrayOfInt3[15] = paramArrayOfInt[3];
      zzgcj.zzc(arrayOfInt3);
      arrayOfInt3[4] = arrayOfInt3[12];
      arrayOfInt3[5] = arrayOfInt3[13];
      arrayOfInt3[6] = arrayOfInt3[14];
      arrayOfInt3[7] = arrayOfInt3[15];
      zzgcj.zzb(arrayOfInt1, Arrays.copyOf(arrayOfInt3, 8));
      arrayOfInt1[12] = paramInt;
      arrayOfInt1[13] = 0;
      arrayOfInt1[14] = paramArrayOfInt[4];
      arrayOfInt1[15] = paramArrayOfInt[5];
      return arrayOfInt1;
    }
    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[] { Integer.valueOf(i * 32) }));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */