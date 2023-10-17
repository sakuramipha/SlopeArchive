package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgll
  implements zzgmk
{
  private static final ThreadLocal zza = new zzglk();
  private final SecretKeySpec zzb;
  private final int zzc;
  private final int zzd;
  
  public zzgll(byte[] paramArrayOfByte, int paramInt)
    throws GeneralSecurityException
  {
    if (zzgcv.zza(2))
    {
      zzgms.zza(paramArrayOfByte.length);
      this.zzb = new SecretKeySpec(paramArrayOfByte, "AES");
      int i = ((Cipher)zza.get()).getBlockSize();
      this.zzd = i;
      if ((paramInt >= 12) && (paramInt <= i))
      {
        this.zzc = paramInt;
        return;
      }
      throw new GeneralSecurityException("invalid IV size");
    }
    throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte)
    throws GeneralSecurityException
  {
    int j = paramArrayOfByte.length;
    int i = this.zzc;
    if (j >= i)
    {
      byte[] arrayOfByte2 = new byte[i];
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, 0, i);
      i = this.zzc;
      j -= i;
      byte[] arrayOfByte1 = new byte[j];
      Cipher localCipher = (Cipher)zza.get();
      Object localObject = new byte[this.zzd];
      System.arraycopy(arrayOfByte2, 0, localObject, 0, this.zzc);
      localObject = new IvParameterSpec((byte[])localObject);
      localCipher.init(2, this.zzb, (AlgorithmParameterSpec)localObject);
      if (localCipher.doFinal(paramArrayOfByte, i, j, arrayOfByte1, 0) == j) {
        return arrayOfByte1;
      }
      throw new GeneralSecurityException("stored output's length does not match input's length");
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */