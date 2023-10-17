package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzggu
  implements zzgfp
{
  private final zzgfw zza;
  
  public zzggu(zzgfw paramzzgfw)
    throws GeneralSecurityException
  {
    if (zzgcv.zza(2))
    {
      this.zza = paramzzgfw;
      return;
    }
    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzggu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */