package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgcu
  implements zzfww
{
  private static final ThreadLocal zza = new zzgct();
  private static final boolean zzb;
  private final SecretKey zzc;
  
  static
  {
    boolean bool;
    try
    {
      Class.forName("javax.crypto.spec.GCMParameterSpec");
      bool = true;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      bool = false;
    }
    zzb = bool;
  }
  
  public zzgcu(byte[] paramArrayOfByte)
    throws GeneralSecurityException
  {
    zzgms.zza(paramArrayOfByte.length);
    this.zzc = new SecretKeySpec(paramArrayOfByte, "AES");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws GeneralSecurityException
  {
    int i = paramArrayOfByte1.length;
    if (i >= 28)
    {
      Object localObject;
      if (zzb)
      {
        localObject = new GCMParameterSpec(128, paramArrayOfByte1, 0, 12);
      }
      else
      {
        if (!zzgmr.zza()) {
          break label116;
        }
        localObject = new IvParameterSpec(paramArrayOfByte1, 0, 12);
      }
      ThreadLocal localThreadLocal = zza;
      ((Cipher)localThreadLocal.get()).init(2, this.zzc, (AlgorithmParameterSpec)localObject);
      if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
        ((Cipher)localThreadLocal.get()).updateAAD(paramArrayOfByte2);
      }
      return ((Cipher)localThreadLocal.get()).doFinal(paramArrayOfByte1, 12, i - 12);
      label116:
      throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgcu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */