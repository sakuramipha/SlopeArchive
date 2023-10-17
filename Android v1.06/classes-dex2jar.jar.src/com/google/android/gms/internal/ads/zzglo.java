package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzglo
  implements zzfww
{
  private static final ThreadLocal zza = new zzglm();
  private static final ThreadLocal zzb = new zzgln();
  private final byte[] zzc;
  private final byte[] zzd;
  private final SecretKeySpec zze;
  private final int zzf;
  
  public zzglo(byte[] paramArrayOfByte, int paramInt)
    throws GeneralSecurityException
  {
    if (zzgcv.zza(1))
    {
      if ((paramInt != 12) && (paramInt != 16)) {
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
      }
      this.zzf = paramInt;
      zzgms.zza(paramArrayOfByte.length);
      paramArrayOfByte = new SecretKeySpec(paramArrayOfByte, "AES");
      this.zze = paramArrayOfByte;
      Cipher localCipher = (Cipher)zza.get();
      localCipher.init(1, paramArrayOfByte);
      paramArrayOfByte = zzb(localCipher.doFinal(new byte[16]));
      this.zzc = paramArrayOfByte;
      this.zzd = zzb(paramArrayOfByte);
      return;
    }
    throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
  }
  
  private static byte[] zzb(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[16];
    int j;
    for (int i = 0; i < 15; i = j)
    {
      int k = paramArrayOfByte[i];
      j = i + 1;
      arrayOfByte[i] = ((byte)((k + k ^ (paramArrayOfByte[j] & 0xFF) >>> 7) & 0xFF));
    }
    i = paramArrayOfByte[15];
    arrayOfByte[15] = ((byte)(paramArrayOfByte[0] >> 7 & 0x87 ^ i + i));
    return arrayOfByte;
  }
  
  private final byte[] zzc(Cipher paramCipher, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
    throws IllegalBlockSizeException, BadPaddingException
  {
    byte[] arrayOfByte1 = new byte[16];
    arrayOfByte1[15] = ((byte)paramInt1);
    if (paramInt3 == 0) {
      return paramCipher.doFinal(zzd(arrayOfByte1, this.zzc));
    }
    arrayOfByte1 = paramCipher.doFinal(arrayOfByte1);
    int j = 0;
    for (paramInt1 = 0; paramInt3 - paramInt1 > 16; paramInt1 += 16)
    {
      for (int i = 0; i < 16; i++) {
        arrayOfByte1[i] = ((byte)(arrayOfByte1[i] ^ paramArrayOfByte[(paramInt2 + paramInt1 + i)]));
      }
      arrayOfByte1 = paramCipher.doFinal(arrayOfByte1);
    }
    byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfByte, paramInt1 + paramInt2, paramInt2 + paramInt3);
    if (arrayOfByte2.length == 16)
    {
      paramArrayOfByte = zzd(arrayOfByte2, this.zzc);
    }
    else
    {
      paramArrayOfByte = Arrays.copyOf(this.zzd, 16);
      for (paramInt1 = j;; paramInt1++)
      {
        paramInt2 = arrayOfByte2.length;
        if (paramInt1 >= paramInt2) {
          break;
        }
        paramArrayOfByte[paramInt1] = ((byte)(paramArrayOfByte[paramInt1] ^ arrayOfByte2[paramInt1]));
      }
      paramArrayOfByte[paramInt2] = ((byte)(paramArrayOfByte[paramInt2] ^ 0x80));
    }
    return paramCipher.doFinal(zzd(arrayOfByte1, paramArrayOfByte));
  }
  
  private static byte[] zzd(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int j = paramArrayOfByte1.length;
    byte[] arrayOfByte = new byte[j];
    for (int i = 0; i < j; i++) {
      arrayOfByte[i] = ((byte)(paramArrayOfByte1[i] ^ paramArrayOfByte2[i]));
    }
    return arrayOfByte;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws GeneralSecurityException
  {
    int m = paramArrayOfByte1.length;
    int k = m - this.zzf - 16;
    if (k >= 0)
    {
      Cipher localCipher = (Cipher)zza.get();
      localCipher.init(1, this.zze);
      byte[] arrayOfByte2 = zzc(localCipher, 0, paramArrayOfByte1, 0, this.zzf);
      int i = 0;
      byte[] arrayOfByte1 = paramArrayOfByte2;
      if (paramArrayOfByte2 == null) {
        arrayOfByte1 = new byte[0];
      }
      paramArrayOfByte2 = zzc(localCipher, 1, arrayOfByte1, 0, arrayOfByte1.length);
      arrayOfByte1 = zzc(localCipher, 2, paramArrayOfByte1, this.zzf, k);
      int j = 0;
      while (i < 16)
      {
        j = (byte)(j | paramArrayOfByte1[(m - 16 + i)] ^ paramArrayOfByte2[i] ^ arrayOfByte2[i] ^ arrayOfByte1[i]);
        i++;
      }
      if (j == 0)
      {
        paramArrayOfByte2 = (Cipher)zzb.get();
        paramArrayOfByte2.init(1, this.zze, new IvParameterSpec(arrayOfByte2));
        return paramArrayOfByte2.doFinal(paramArrayOfByte1, this.zzf, k);
      }
      throw new AEADBadTagException("tag mismatch");
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzglo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */