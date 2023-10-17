package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

public final class zzgmo
  implements zzfxs
{
  private final zzghf zza;
  private final int zzb;
  
  public zzgmo(zzghf paramzzghf, int paramInt)
    throws GeneralSecurityException
  {
    this.zza = paramzzghf;
    this.zzb = paramInt;
    if (paramInt >= 10)
    {
      paramzzghf.zza(new byte[0], paramInt);
      return;
    }
    throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
  }
  
  public final void zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws GeneralSecurityException
  {
    if (MessageDigest.isEqual(this.zza.zza(paramArrayOfByte2, this.zzb), paramArrayOfByte1)) {
      return;
    }
    throw new GeneralSecurityException("invalid MAC");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgmo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */