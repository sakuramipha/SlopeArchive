package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgct
  extends ThreadLocal
{
  protected static final Cipher zza()
  {
    try
    {
      Cipher localCipher = (Cipher)zzgma.zza.zza("AES/GCM-SIV/NoPadding");
      return localCipher;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new IllegalStateException(localGeneralSecurityException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */