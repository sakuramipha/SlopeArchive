package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

public final class zzgfg
{
  @Nullable
  private Integer zza = null;
  @Nullable
  private Integer zzb = null;
  private zzgfh zzc;
  
  private zzgfg()
  {
    throw null;
  }
  
  public final zzgfg zza(int paramInt)
    throws GeneralSecurityException
  {
    if ((paramInt != 16) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[] { Integer.valueOf(paramInt * 8) }));
    }
    this.zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final zzgfg zzb(int paramInt)
    throws GeneralSecurityException
  {
    if ((paramInt >= 10) && (paramInt <= 16))
    {
      this.zzb = Integer.valueOf(paramInt);
      return this;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid tag size for AesCmacParameters: ");
    localStringBuilder.append(paramInt);
    throw new GeneralSecurityException(localStringBuilder.toString());
  }
  
  public final zzgfg zzc(zzgfh paramzzgfh)
  {
    this.zzc = paramzzgfh;
    return this;
  }
  
  public final zzgfj zzd()
    throws GeneralSecurityException
  {
    Integer localInteger = this.zza;
    if (localInteger != null)
    {
      if (this.zzb != null)
      {
        if (this.zzc != null) {
          return new zzgfj(localInteger.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
      }
      throw new GeneralSecurityException("tag size not set");
    }
    throw new GeneralSecurityException("key size not set");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgfg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */