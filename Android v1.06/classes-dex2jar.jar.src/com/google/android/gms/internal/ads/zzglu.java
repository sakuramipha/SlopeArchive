package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;
import java.util.List;

final class zzglu
  implements zzglz
{
  private final zzgmi zza;
  
  public final Object zza(String paramString)
    throws GeneralSecurityException
  {
    Iterator localIterator = zzgma.zzb(new String[] { "GmsCore_OpenSSL", "AndroidOpenSSL" }).iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Provider)localIterator.next();
      try
      {
        localObject = this.zza.zza(paramString, (Provider)localObject);
        return localObject;
      }
      catch (Exception localException) {}
    }
    return this.zza.zza(paramString, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzglu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */