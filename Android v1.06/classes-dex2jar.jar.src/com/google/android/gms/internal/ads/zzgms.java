package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

public final class zzgms
{
  private static final Pattern zza = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[] { "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+" }), 2);
  private static final Pattern zzb = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[] { "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+" }), 2);
  
  public static void zza(int paramInt)
    throws InvalidAlgorithmParameterException
  {
    if ((paramInt != 16) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[] { Integer.valueOf(paramInt * 8) }));
    }
  }
  
  public static void zzb(int paramInt1, int paramInt2)
    throws GeneralSecurityException
  {
    if ((paramInt1 >= 0) && (paramInt1 <= 0)) {
      return;
    }
    throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(0) }));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */