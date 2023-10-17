package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzfxr
{
  private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();
  
  public static zzfxq zza(String paramString)
    throws GeneralSecurityException
  {
    Iterator localIterator = zza.iterator();
    while (localIterator.hasNext())
    {
      zzfxq localzzfxq = (zzfxq)localIterator.next();
      if (localzzfxq.zza()) {
        return localzzfxq;
      }
    }
    throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(paramString)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfxr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */