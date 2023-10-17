package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

public final class zzfca
{
  private final HashMap zza = new HashMap();
  
  public final zzfbz zza(zzfbq paramzzfbq, Context paramContext, zzfbi paramzzfbi, zzfcg paramzzfcg)
  {
    zzfbz localzzfbz = (zzfbz)this.zza.get(paramzzfbq);
    if (localzzfbz == null)
    {
      paramContext = new zzfbn(zzfbt.zza(paramzzfbq, paramContext));
      paramContext = new zzfbz(paramContext, new zzfci(paramContext, paramzzfbi, paramzzfcg));
      this.zza.put(paramzzfbq, paramContext);
      return paramContext;
    }
    return localzzfbz;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */