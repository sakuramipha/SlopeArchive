package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class zzatg
{
  private final Map zza = new HashMap();
  
  public final AtomicReference zza(String paramString)
  {
    try
    {
      if (!this.zza.containsKey(paramString))
      {
        AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
        localAtomicReference.<init>();
        this.zza.put(paramString, localAtomicReference);
      }
      return (AtomicReference)this.zza.get(paramString);
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzatg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */