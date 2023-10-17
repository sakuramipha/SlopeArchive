package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzggt
  implements zzgfp
{
  private final zzgfa zza;
  
  public zzggt(zzgfa paramzzgfa)
    throws GeneralSecurityException
  {
    if (zzgcv.zza(1))
    {
      this.zza = paramzzgfa;
      return;
    }
    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzggt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */