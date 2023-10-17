package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public final class zzfyn
{
  @Nullable
  private zzfyy zza = null;
  @Nullable
  private zzgmv zzb = null;
  @Nullable
  private zzgmv zzc = null;
  @Nullable
  private Integer zzd = null;
  
  public final zzfyn zza(zzgmv paramzzgmv)
  {
    this.zzb = paramzzgmv;
    return this;
  }
  
  public final zzfyn zzb(zzgmv paramzzgmv)
  {
    this.zzc = paramzzgmv;
    return this;
  }
  
  public final zzfyn zzc(@Nullable Integer paramInteger)
  {
    this.zzd = paramInteger;
    return this;
  }
  
  public final zzfyn zzd(zzfyy paramzzfyy)
  {
    this.zza = paramzzfyy;
    return this;
  }
  
  public final zzfyp zze()
    throws GeneralSecurityException
  {
    Object localObject = this.zza;
    if (localObject != null)
    {
      zzgmv localzzgmv = this.zzb;
      if ((localzzgmv != null) && (this.zzc != null))
      {
        if (((zzfyy)localObject).zza() == localzzgmv.zza())
        {
          if (((zzfyy)localObject).zzc() == this.zzc.zza())
          {
            if ((this.zza.zze()) && (this.zzd == null)) {
              throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if ((!this.zza.zze()) && (this.zzd != null)) {
              throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzd() == zzfyw.zzc) {
              localObject = zzgmu.zzb(new byte[0]);
            }
            for (;;)
            {
              break;
              if (this.zza.zzd() == zzfyw.zzb)
              {
                localObject = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)0).putInt(this.zzd.intValue()).array());
              }
              else
              {
                if (this.zza.zzd() != zzfyw.zza) {
                  break label241;
                }
                localObject = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)1).putInt(this.zzd.intValue()).array());
              }
            }
            return new zzfyp(this.zza, this.zzb, this.zzc, (zzgmu)localObject, this.zzd, null);
            label241:
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
          }
          throw new GeneralSecurityException("HMAC key size mismatch");
        }
        throw new GeneralSecurityException("AES key size mismatch");
      }
      throw new GeneralSecurityException("Cannot build without key material");
    }
    throw new GeneralSecurityException("Cannot build without parameters");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfyn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */