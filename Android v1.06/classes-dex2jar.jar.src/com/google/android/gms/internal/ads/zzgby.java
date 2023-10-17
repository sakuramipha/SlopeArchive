package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public final class zzgby
  extends zzfyh
{
  private final zzgcd zza;
  private final zzgmv zzb;
  private final zzgmu zzc;
  @Nullable
  private final Integer zzd;
  
  private zzgby(zzgcd paramzzgcd, zzgmv paramzzgmv, zzgmu paramzzgmu, @Nullable Integer paramInteger)
  {
    this.zza = paramzzgcd;
    this.zzb = paramzzgmv;
    this.zzc = paramzzgmu;
    this.zzd = paramInteger;
  }
  
  public static zzgby zza(zzgcc paramzzgcc, zzgmv paramzzgmv, @Nullable Integer paramInteger)
    throws GeneralSecurityException
  {
    zzgcc localzzgcc = zzgcc.zzc;
    if ((paramzzgcc != localzzgcc) && (paramInteger == null))
    {
      paramzzgcc = paramzzgcc.toString();
      paramzzgmv = new StringBuilder();
      paramzzgmv.append("For given Variant ");
      paramzzgmv.append(paramzzgcc);
      paramzzgmv.append(" the value of idRequirement must be non-null");
      throw new GeneralSecurityException(paramzzgmv.toString());
    }
    if ((paramzzgcc == localzzgcc) && (paramInteger != null)) {
      throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
    }
    if (paramzzgmv.zza() == 32)
    {
      zzgcd localzzgcd = zzgcd.zzb(paramzzgcc);
      if (localzzgcd.zza() == localzzgcc)
      {
        paramzzgcc = zzgmu.zzb(new byte[0]);
      }
      else if (localzzgcd.zza() == zzgcc.zzb)
      {
        paramzzgcc = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)0).putInt(paramInteger.intValue()).array());
      }
      else
      {
        if (localzzgcd.zza() != zzgcc.zza) {
          break label203;
        }
        paramzzgcc = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)1).putInt(paramInteger.intValue()).array());
      }
      return new zzgby(localzzgcd, paramzzgmv, paramzzgcc, paramInteger);
      label203:
      throw new IllegalStateException("Unknown Variant: ".concat(localzzgcd.zza().toString()));
    }
    int i = paramzzgmv.zza();
    paramzzgcc = new StringBuilder();
    paramzzgcc.append("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
    paramzzgcc.append(i);
    throw new GeneralSecurityException(paramzzgcc.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */