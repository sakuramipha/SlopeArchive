package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

public final class zzggc
{
  @Nullable
  private Integer zza = null;
  @Nullable
  private Integer zzb = null;
  private zzggd zzc = null;
  private zzgge zzd;
  
  private zzggc()
  {
    throw null;
  }
  
  public final zzggc zza(zzggd paramzzggd)
  {
    this.zzc = paramzzggd;
    return this;
  }
  
  public final zzggc zzb(int paramInt)
    throws GeneralSecurityException
  {
    this.zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final zzggc zzc(int paramInt)
    throws GeneralSecurityException
  {
    this.zzb = Integer.valueOf(paramInt);
    return this;
  }
  
  public final zzggc zzd(zzgge paramzzgge)
  {
    this.zzd = paramzzgge;
    return this;
  }
  
  public final zzggg zze()
    throws GeneralSecurityException
  {
    Object localObject = this.zza;
    if (localObject != null)
    {
      if (this.zzb != null)
      {
        if (this.zzc != null)
        {
          if (this.zzd != null)
          {
            if (((Integer)localObject).intValue() >= 16)
            {
              int i = this.zzb.intValue();
              localObject = this.zzc;
              if (i >= 10)
              {
                if (localObject == zzggd.zza)
                {
                  if (i > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else if (localObject == zzggd.zzb)
                {
                  if (i > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else if (localObject == zzggd.zzc)
                {
                  if (i > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else if (localObject == zzggd.zzd)
                {
                  if (i > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else
                {
                  if (localObject != zzggd.zze) {
                    break label286;
                  }
                  if (i > 64) {
                    break label262;
                  }
                }
                return new zzggg(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
                label262:
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[] { Integer.valueOf(i) }));
                label286:
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
              }
              throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[] { Integer.valueOf(i) }));
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[] { this.zza }));
          }
          throw new GeneralSecurityException("variant is not set");
        }
        throw new GeneralSecurityException("hash type is not set");
      }
      throw new GeneralSecurityException("tag size is not set");
    }
    throw new GeneralSecurityException("key size is not set");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzggc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */