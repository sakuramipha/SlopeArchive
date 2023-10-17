package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public final class zzgey
{
  @Nullable
  private zzgfj zza = null;
  @Nullable
  private zzgmv zzb = null;
  @Nullable
  private Integer zzc = null;
  
  public final zzgey zza(zzgmv paramzzgmv)
    throws GeneralSecurityException
  {
    this.zzb = paramzzgmv;
    return this;
  }
  
  public final zzgey zzb(@Nullable Integer paramInteger)
  {
    this.zzc = paramInteger;
    return this;
  }
  
  public final zzgey zzc(zzgfj paramzzgfj)
  {
    this.zza = paramzzgfj;
    return this;
  }
  
  public final zzgfa zzd()
    throws GeneralSecurityException
  {
    zzgfj localzzgfj = this.zza;
    if (localzzgfj != null)
    {
      Object localObject = this.zzb;
      if (localObject != null)
      {
        if (localzzgfj.zza() == ((zzgmv)localObject).zza())
        {
          if ((localzzgfj.zzd()) && (this.zzc == null)) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
          }
          if ((!this.zza.zzd()) && (this.zzc != null)) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
          }
          if (this.zza.zzc() == zzgfh.zzd) {
            localObject = zzgmu.zzb(new byte[0]);
          }
          for (;;)
          {
            break;
            if ((this.zza.zzc() != zzgfh.zzc) && (this.zza.zzc() != zzgfh.zzb))
            {
              if (this.zza.zzc() == zzgfh.zza) {
                localObject = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)1).putInt(this.zzc.intValue()).array());
              } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzc()))));
              }
            }
            else {
              localObject = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)0).putInt(this.zzc.intValue()).array());
            }
          }
          return new zzgfa(this.zza, this.zzb, (zzgmu)localObject, this.zzc, null);
        }
        throw new GeneralSecurityException("Key size mismatch");
      }
    }
    throw new GeneralSecurityException("Cannot build without parameters and/or key material");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */