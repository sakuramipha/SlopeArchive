package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public final class zzgaq
{
  @Nullable
  private zzgba zza = null;
  @Nullable
  private zzgmv zzb = null;
  @Nullable
  private Integer zzc = null;
  
  public final zzgaq zza(@Nullable Integer paramInteger)
  {
    this.zzc = paramInteger;
    return this;
  }
  
  public final zzgaq zzb(zzgmv paramzzgmv)
  {
    this.zzb = paramzzgmv;
    return this;
  }
  
  public final zzgaq zzc(zzgba paramzzgba)
  {
    this.zza = paramzzgba;
    return this;
  }
  
  public final zzgas zzd()
    throws GeneralSecurityException
  {
    Object localObject = this.zza;
    if (localObject != null)
    {
      zzgmv localzzgmv = this.zzb;
      if (localzzgmv != null)
      {
        if (((zzgba)localObject).zza() == localzzgmv.zza())
        {
          if ((((zzgba)localObject).zzc()) && (this.zzc == null)) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
          }
          if ((!this.zza.zzc()) && (this.zzc != null)) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
          }
          if (this.zza.zzb() == zzgay.zzc) {
            localObject = zzgmu.zzb(new byte[0]);
          }
          for (;;)
          {
            break;
            if (this.zza.zzb() == zzgay.zzb)
            {
              localObject = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)0).putInt(this.zzc.intValue()).array());
            }
            else
            {
              if (this.zza.zzb() != zzgay.zza) {
                break label213;
              }
              localObject = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)1).putInt(this.zzc.intValue()).array());
            }
          }
          return new zzgas(this.zza, this.zzb, (zzgmu)localObject, this.zzc, null);
          label213:
          throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzb()))));
        }
        throw new GeneralSecurityException("Key size mismatch");
      }
    }
    throw new GeneralSecurityException("Cannot build without parameters and/or key material");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */