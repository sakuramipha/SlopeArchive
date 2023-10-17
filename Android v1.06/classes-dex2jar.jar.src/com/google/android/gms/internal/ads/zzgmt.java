package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgmt
  implements zzfww
{
  private final zzgcr zza;
  
  public zzgmt(byte[] paramArrayOfByte)
    throws GeneralSecurityException
  {
    this.zza = new zzgcr(paramArrayOfByte);
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws GeneralSecurityException
  {
    int i = paramArrayOfByte1.length;
    if (i >= 40)
    {
      byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte1, 24);
      paramArrayOfByte1 = ByteBuffer.wrap(paramArrayOfByte1, 24, i - 24);
      return this.zza.zzb(paramArrayOfByte1, arrayOfByte, paramArrayOfByte2);
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgmt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */