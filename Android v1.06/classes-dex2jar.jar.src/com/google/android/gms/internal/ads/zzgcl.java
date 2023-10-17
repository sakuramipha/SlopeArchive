package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgcl
{
  private static final ThreadLocal zza = new zzgck();
  private final SecretKey zzb;
  
  public zzgcl(byte[] paramArrayOfByte, boolean paramBoolean)
    throws GeneralSecurityException
  {
    if (zzgcv.zza(2))
    {
      zzgms.zza(paramArrayOfByte.length);
      this.zzb = new SecretKeySpec(paramArrayOfByte, "AES");
      return;
    }
    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
    throws GeneralSecurityException
  {
    if (paramArrayOfByte1.length == 12)
    {
      int i = paramArrayOfByte2.length;
      if (i >= 28)
      {
        if (ByteBuffer.wrap(paramArrayOfByte1).equals(ByteBuffer.wrap(paramArrayOfByte2, 0, 12)))
        {
          String str = System.getProperty("java.vendor");
          Object localObject2 = null;
          if (str != "The Android Project")
          {
            localObject1 = localObject2;
            if (str != null)
            {
              localObject1 = localObject2;
              if (!str.equals("The Android Project")) {}
            }
          }
          else
          {
            localObject1 = Integer.valueOf(Build.VERSION.SDK_INT);
          }
          if ((localObject1 != null) && (((Integer)localObject1).intValue() <= 19)) {
            paramArrayOfByte1 = new IvParameterSpec(paramArrayOfByte1, 0, 12);
          } else {
            paramArrayOfByte1 = new GCMParameterSpec(128, paramArrayOfByte1, 0, 12);
          }
          Object localObject1 = zza;
          ((Cipher)((ThreadLocal)localObject1).get()).init(2, this.zzb, paramArrayOfByte1);
          if ((paramArrayOfByte3 != null) && (paramArrayOfByte3.length != 0)) {
            ((Cipher)((ThreadLocal)localObject1).get()).updateAAD(paramArrayOfByte3);
          }
          return ((Cipher)((ThreadLocal)localObject1).get()).doFinal(paramArrayOfByte2, 12, i - 12);
        }
        throw new GeneralSecurityException("iv does not match prepended iv");
      }
      throw new GeneralSecurityException("ciphertext too short");
    }
    throw new GeneralSecurityException("iv is wrong size");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */