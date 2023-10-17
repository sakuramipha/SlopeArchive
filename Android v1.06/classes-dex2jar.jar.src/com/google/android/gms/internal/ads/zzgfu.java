package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public final class zzgfu
{
  @Nullable
  private zzggg zza = null;
  @Nullable
  private zzgmv zzb = null;
  @Nullable
  private Integer zzc = null;
  
  public final zzgfu zza(@Nullable Integer paramInteger)
  {
    this.zzc = paramInteger;
    return this;
  }
  
  public final zzgfu zzb(zzgmv paramzzgmv)
  {
    this.zzb = paramzzgmv;
    return this;
  }
  
  public final zzgfu zzc(zzggg paramzzggg)
  {
    this.zza = paramzzggg;
    return this;
  }
  
  public final zzgfw zzd()
    throws GeneralSecurityException
  {
    zzggg localzzggg = this.zza;
    if (localzzggg != null)
    {
      Object localObject = this.zzb;
      if (localObject != null)
      {
        if (localzzggg.zza() == ((zzgmv)localObject).zza())
        {
          if ((localzzggg.zzd()) && (this.zzc == null)) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
          }
          if ((!this.zza.zzd()) && (this.zzc != null)) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
          }
          if (this.zza.zzc() == zzgge.zzd) {
            localObject = zzgmu.zzb(new byte[0]);
          }
          for (;;)
          {
            break;
            if ((this.zza.zzc() != zzgge.zzc) && (this.zza.zzc() != zzgge.zzb))
            {
              if (this.zza.zzc() == zzgge.zza) {
                localObject = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)1).putInt(this.zzc.intValue()).array());
              } else {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzc()))));
              }
            }
            else {
              localObject = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)0).putInt(this.zzc.intValue()).array());
            }
          }
          return new zzgfw(this.zza, this.zzb, (zzgmu)localObject, this.zzc, null);
        }
        throw new GeneralSecurityException("Key size mismatch");
      }
    }
    throw new GeneralSecurityException("Cannot build without parameters and/or key material");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */