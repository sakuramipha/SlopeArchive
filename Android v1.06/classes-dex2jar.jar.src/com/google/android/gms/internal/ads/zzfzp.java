package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

public final class zzfzp
{
  @Nullable
  private Integer zza = null;
  @Nullable
  private Integer zzb = null;
  @Nullable
  private Integer zzc = null;
  private zzfzq zzd;
  
  private zzfzp()
  {
    throw null;
  }
  
  public final zzfzp zza(int paramInt)
    throws GeneralSecurityException
  {
    if ((paramInt != 12) && (paramInt != 16)) {
      throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
    }
    this.zzb = Integer.valueOf(paramInt);
    return this;
  }
  
  public final zzfzp zzb(int paramInt)
    throws GeneralSecurityException
  {
    if ((paramInt != 16) && (paramInt != 24) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    this.zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final zzfzp zzc(int paramInt)
    throws GeneralSecurityException
  {
    this.zzc = Integer.valueOf(16);
    return this;
  }
  
  public final zzfzp zzd(zzfzq paramzzfzq)
  {
    this.zzd = paramzzfzq;
    return this;
  }
  
  public final zzfzs zze()
    throws GeneralSecurityException
  {
    Integer localInteger = this.zza;
    if (localInteger != null)
    {
      if (this.zzb != null)
      {
        if (this.zzd != null)
        {
          if (this.zzc != null)
          {
            int j = localInteger.intValue();
            int i = this.zzb.intValue();
            this.zzc.intValue();
            return new zzfzs(j, i, 16, this.zzd, null);
          }
          throw new GeneralSecurityException("Tag size is not set");
        }
        throw new GeneralSecurityException("Variant is not set");
      }
      throw new GeneralSecurityException("IV size is not set");
    }
    throw new GeneralSecurityException("Key size is not set");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */