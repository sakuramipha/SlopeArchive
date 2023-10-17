package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

final class zzgmm
  extends ThreadLocal
{
  final zzgmn zza;
  
  zzgmm(zzgmn paramzzgmn) {}
  
  protected final Mac zza()
  {
    try
    {
      Mac localMac = (Mac)zzgma.zzb.zza(zzgmn.zzb(this.zza));
      localMac.init(zzgmn.zzc(this.zza));
      return localMac;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new IllegalStateException(localGeneralSecurityException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgmm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */