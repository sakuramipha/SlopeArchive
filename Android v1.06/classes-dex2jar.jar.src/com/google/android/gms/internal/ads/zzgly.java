package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;
import java.util.List;

final class zzgly
  implements zzglz
{
  private final zzgmi zza;
  
  public final Object zza(String paramString)
    throws GeneralSecurityException
  {
    Iterator localIterator = zzgma.zzb(new String[] { "GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt" }).iterator();
    Object localObject1 = null;
    while (localIterator.hasNext())
    {
      Object localObject2 = (Provider)localIterator.next();
      try
      {
        localObject2 = this.zza.zza(paramString, (Provider)localObject2);
        return localObject2;
      }
      catch (Exception localException) {}
      if (localObject1 == null) {
        localObject1 = localException;
      }
    }
    throw new GeneralSecurityException("No good Provider found.", (Throwable)localObject1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */