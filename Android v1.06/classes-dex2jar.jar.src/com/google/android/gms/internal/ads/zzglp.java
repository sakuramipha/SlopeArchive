package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzglp
  implements zzfww
{
  private final zzgcl zza;
  
  public zzglp(byte[] paramArrayOfByte)
    throws GeneralSecurityException
  {
    if (zzgcv.zza(2))
    {
      this.zza = new zzgcl(paramArrayOfByte, true);
      return;
    }
    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws GeneralSecurityException
  {
    byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte1, 12);
    return this.zza.zza(arrayOfByte, paramArrayOfByte1, paramArrayOfByte2);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzglp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */