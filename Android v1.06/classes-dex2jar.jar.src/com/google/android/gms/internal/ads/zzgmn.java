package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

public final class zzgmn
  implements zzghf
{
  private final ThreadLocal zza;
  private final String zzb;
  private final Key zzc;
  private final int zzd;
  
  public zzgmn(String paramString, Key paramKey)
    throws GeneralSecurityException
  {
    zzgmm localzzgmm = new zzgmm(this);
    this.zza = localzzgmm;
    if (zzgcv.zza(2))
    {
      this.zzb = paramString;
      this.zzc = paramKey;
      if (paramKey.getEncoded().length >= 16)
      {
        switch (paramString.hashCode())
        {
        default: 
          break;
        case 392317873: 
          if (paramString.equals("HMACSHA512")) {
            i = 4;
          }
          break;
        case 392316170: 
          if (paramString.equals("HMACSHA384")) {
            i = 3;
          }
          break;
        case 392315118: 
          if (paramString.equals("HMACSHA256")) {
            i = 2;
          }
          break;
        case 392315023: 
          if (paramString.equals("HMACSHA224")) {
            i = 1;
          }
          break;
        case -1823053428: 
          if (paramString.equals("HMACSHA1")) {
            i = 0;
          }
          break;
        }
        int i = -1;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3)
              {
                if (i == 4) {
                  i = 64;
                } else {
                  throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(paramString));
                }
              }
              else {
                i = 48;
              }
            }
            else {
              i = 32;
            }
          }
          else {
            i = 28;
          }
          this.zzd = i;
        }
        else
        {
          this.zzd = 20;
        }
        localzzgmm.get();
        return;
      }
      throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }
    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte, int paramInt)
    throws GeneralSecurityException
  {
    if (paramInt <= this.zzd)
    {
      ((Mac)this.zza.get()).update(paramArrayOfByte);
      return Arrays.copyOf(((Mac)this.zza.get()).doFinal(), paramInt);
    }
    throw new InvalidAlgorithmParameterException("tag size too big");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */