package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

public final class zzgag
{
  @Nullable
  private Integer zza = null;
  @Nullable
  private Integer zzb = null;
  @Nullable
  private Integer zzc = null;
  private zzgah zzd;
  
  private zzgag()
  {
    throw null;
  }
  
  public final zzgag zza(int paramInt)
    throws GeneralSecurityException
  {
    this.zzb = Integer.valueOf(12);
    return this;
  }
  
  public final zzgag zzb(int paramInt)
    throws GeneralSecurityException
  {
    if ((paramInt != 16) && (paramInt != 24) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    this.zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final zzgag zzc(int paramInt)
    throws GeneralSecurityException
  {
    this.zzc = Integer.valueOf(16);
    return this;
  }
  
  public final zzgag zzd(zzgah paramzzgah)
  {
    this.zzd = paramzzgah;
    return this;
  }
  
  public final zzgaj zze()
    throws GeneralSecurityException
  {
    Integer localInteger = this.zza;
    if (localInteger != null)
    {
      if (this.zzd != null)
      {
        if (this.zzb != null)
        {
          if (this.zzc != null)
          {
            int i = localInteger.intValue();
            this.zzb.intValue();
            this.zzc.intValue();
            return new zzgaj(i, 12, 16, this.zzd, null);
          }
          throw new GeneralSecurityException("Tag size is not set");
        }
        throw new GeneralSecurityException("IV size is not set");
      }
      throw new GeneralSecurityException("Variant is not set");
    }
    throw new GeneralSecurityException("Key size is not set");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */