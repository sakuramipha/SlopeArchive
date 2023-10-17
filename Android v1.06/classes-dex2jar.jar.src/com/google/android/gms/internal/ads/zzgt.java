package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzgt
{
  private final Map zza = new HashMap();
  private Map zzb;
  
  public final Map zza()
  {
    try
    {
      if (this.zzb == null)
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>(this.zza);
        this.zzb = Collections.unmodifiableMap((Map)localObject1);
      }
      Object localObject1 = this.zzb;
      return (Map)localObject1;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */