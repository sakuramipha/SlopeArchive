package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

public final class zzfyu
{
  @Nullable
  private Integer zza = null;
  @Nullable
  private Integer zzb = null;
  @Nullable
  private Integer zzc = null;
  private zzfyv zzd = null;
  private zzfyw zze;
  
  private zzfyu()
  {
    throw null;
  }
  
  public final zzfyu zza(int paramInt)
    throws GeneralSecurityException
  {
    if ((paramInt != 16) && (paramInt != 24) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    this.zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final zzfyu zzb(zzfyv paramzzfyv)
  {
    this.zzd = paramzzfyv;
    return this;
  }
  
  public final zzfyu zzc(int paramInt)
    throws GeneralSecurityException
  {
    if (paramInt >= 16)
    {
      this.zzb = Integer.valueOf(paramInt);
      return this;
    }
    throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public final zzfyu zzd(int paramInt)
    throws GeneralSecurityException
  {
    if (paramInt >= 10)
    {
      this.zzc = Integer.valueOf(paramInt);
      return this;
    }
    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public final zzfyu zze(zzfyw paramzzfyw)
  {
    this.zze = paramzzfyw;
    return this;
  }
  
  public final zzfyy zzf()
    throws GeneralSecurityException
  {
    if (this.zza != null)
    {
      if (this.zzb != null)
      {
        Object localObject = this.zzc;
        if (localObject != null)
        {
          if (this.zzd != null)
          {
            if (this.zze != null)
            {
              int i = ((Integer)localObject).intValue();
              localObject = this.zzd;
              if (localObject == zzfyv.zza)
              {
                if (i > 20) {
                  throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[] { Integer.valueOf(i) }));
                }
              }
              else if (localObject == zzfyv.zzb)
              {
                if (i > 28) {
                  throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[] { Integer.valueOf(i) }));
                }
              }
              else if (localObject == zzfyv.zzc)
              {
                if (i > 32) {
                  throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[] { Integer.valueOf(i) }));
                }
              }
              else if (localObject == zzfyv.zzd)
              {
                if (i > 48) {
                  throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[] { Integer.valueOf(i) }));
                }
              }
              else
              {
                if (localObject != zzfyv.zze) {
                  break label282;
                }
                if (i > 64) {
                  break label258;
                }
              }
              return new zzfyy(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zze, this.zzd, null);
              label258:
              throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[] { Integer.valueOf(i) }));
              label282:
              throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            throw new GeneralSecurityException("variant is not set");
          }
          throw new GeneralSecurityException("hash type is not set");
        }
        throw new GeneralSecurityException("tag size is not set");
      }
      throw new GeneralSecurityException("HMAC key size is not set");
    }
    throw new GeneralSecurityException("AES key size is not set");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfyu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */