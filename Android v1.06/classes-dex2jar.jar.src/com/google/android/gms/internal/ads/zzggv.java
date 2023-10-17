package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

public final class zzggv
{
  private HashMap zza = new HashMap();
  
  public final zzggx zza()
  {
    if (this.zza != null)
    {
      zzggx localzzggx = new zzggx(Collections.unmodifiableMap(this.zza), null);
      this.zza = null;
      return localzzggx;
    }
    throw new IllegalStateException("cannot call build() twice");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzggv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */