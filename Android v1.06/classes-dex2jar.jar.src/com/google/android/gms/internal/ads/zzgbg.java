package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

public final class zzgbg
  extends zzfyh
{
  private final zzgbl zza;
  private final zzgmv zzb;
  private final zzgmu zzc;
  @Nullable
  private final Integer zzd;
  
  private zzgbg(zzgbl paramzzgbl, zzgmv paramzzgmv, zzgmu paramzzgmu, @Nullable Integer paramInteger)
  {
    this.zza = paramzzgbl;
    this.zzb = paramzzgmv;
    this.zzc = paramzzgmu;
    this.zzd = paramInteger;
  }
  
  public static zzgbg zza(zzgbk paramzzgbk, zzgmv paramzzgmv, @Nullable Integer paramInteger)
    throws GeneralSecurityException
  {
    zzgbk localzzgbk = zzgbk.zzc;
    if ((paramzzgbk != localzzgbk) && (paramInteger == null))
    {
      paramzzgbk = paramzzgbk.toString();
      paramzzgmv = new StringBuilder();
      paramzzgmv.append("For given Variant ");
      paramzzgmv.append(paramzzgbk);
      paramzzgmv.append(" the value of idRequirement must be non-null");
      throw new GeneralSecurityException(paramzzgmv.toString());
    }
    if ((paramzzgbk == localzzgbk) && (paramInteger != null)) {
      throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
    }
    if (paramzzgmv.zza() == 32)
    {
      zzgbl localzzgbl = zzgbl.zzb(paramzzgbk);
      if (localzzgbl.zza() == localzzgbk)
      {
        paramzzgbk = zzgmu.zzb(new byte[0]);
      }
      else if (localzzgbl.zza() == zzgbk.zzb)
      {
        paramzzgbk = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)0).putInt(paramInteger.intValue()).array());
      }
      else
      {
        if (localzzgbl.zza() != zzgbk.zza) {
          break label203;
        }
        paramzzgbk = zzgmu.zzb(ByteBuffer.allocate(5).put((byte)1).putInt(paramInteger.intValue()).array());
      }
      return new zzgbg(localzzgbl, paramzzgmv, paramzzgbk, paramInteger);
      label203:
      throw new IllegalStateException("Unknown Variant: ".concat(localzzgbl.zza().toString()));
    }
    int i = paramzzgmv.zza();
    paramzzgbk = new StringBuilder();
    paramzzgbk.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
    paramzzgbk.append(i);
    throw new GeneralSecurityException(paramzzgbk.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */