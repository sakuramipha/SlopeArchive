package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

public final class zzgax
{
  @Nullable
  private Integer zza = null;
  private zzgay zzb;
  
  private zzgax()
  {
    throw null;
  }
  
  public final zzgax zza(int paramInt)
    throws GeneralSecurityException
  {
    if ((paramInt != 16) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    this.zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final zzgax zzb(zzgay paramzzgay)
  {
    this.zzb = paramzzgay;
    return this;
  }
  
  public final zzgba zzc()
    throws GeneralSecurityException
  {
    Integer localInteger = this.zza;
    if (localInteger != null)
    {
      if (this.zzb != null) {
        return new zzgba(localInteger.intValue(), this.zzb, null);
      }
      throw new GeneralSecurityException("Variant is not set");
    }
    throw new GeneralSecurityException("Key size is not set");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */