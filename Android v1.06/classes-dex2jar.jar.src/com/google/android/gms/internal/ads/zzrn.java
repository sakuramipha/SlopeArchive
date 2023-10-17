package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CodecException;

public class zzrn
  extends zzhg
{
  public final zzrp zza;
  public final String zzb;
  
  public zzrn(Throwable paramThrowable, zzrp paramzzrp)
  {
    super("Decoder failed: ".concat(String.valueOf(str)), paramThrowable);
    this.zza = paramzzrp;
    paramzzrp = (zzrp)localObject;
    if (zzfn.zza >= 21)
    {
      paramzzrp = (zzrp)localObject;
      if ((paramThrowable instanceof MediaCodec.CodecException)) {
        paramzzrp = ((MediaCodec.CodecException)paramThrowable).getDiagnosticInfo();
      }
    }
    this.zzb = paramzzrp;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzrn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */