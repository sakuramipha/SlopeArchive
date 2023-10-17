package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class zzgml
  implements zzghf
{
  private final SecretKey zza;
  private final byte[] zzb;
  private final byte[] zzc;
  
  public zzgml(byte[] paramArrayOfByte)
    throws GeneralSecurityException
  {
    zzgms.zza(paramArrayOfByte.length);
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte, "AES");
    this.zza = localSecretKeySpec;
    paramArrayOfByte = zzb();
    paramArrayOfByte.init(1, localSecretKeySpec);
    paramArrayOfByte = zzggs.zza(paramArrayOfByte.doFinal(new byte[16]));
    this.zzb = paramArrayOfByte;
    this.zzc = zzggs.zza(paramArrayOfByte);
  }
  
  private static Cipher zzb()
    throws GeneralSecurityException
  {
    if (zzgcv.zza(1)) {
      return (Cipher)zzgma.zza.zza("AES/ECB/NoPadding");
    }
    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte, int paramInt)
    throws GeneralSecurityException
  {
    if (paramInt <= 16)
    {
      Cipher localCipher = zzb();
      localCipher.init(1, this.zza);
      int i = paramArrayOfByte.length;
      int j = Math.max(1, (int)Math.ceil(i / 16.0D));
      byte[] arrayOfByte1;
      if (j * 16 == i)
      {
        arrayOfByte1 = zzglq.zzd(paramArrayOfByte, (j - 1) * 16, this.zzb, 0, 16);
      }
      else
      {
        arrayOfByte1 = Arrays.copyOfRange(paramArrayOfByte, (j - 1) * 16, i);
        i = arrayOfByte1.length;
        if (i >= 16) {
          break label181;
        }
        arrayOfByte1 = Arrays.copyOf(arrayOfByte1, 16);
        arrayOfByte1[i] = Byte.MIN_VALUE;
        arrayOfByte1 = zzglq.zzc(arrayOfByte1, this.zzc);
      }
      byte[] arrayOfByte2 = new byte[16];
      for (i = 0; i < j - 1; i++) {
        arrayOfByte2 = localCipher.doFinal(zzglq.zzd(arrayOfByte2, 0, paramArrayOfByte, i * 16, 16));
      }
      return Arrays.copyOf(localCipher.doFinal(zzglq.zzc(arrayOfByte1, arrayOfByte2)), paramInt);
      label181:
      throw new IllegalArgumentException("x must be smaller than a block.");
    }
    throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */