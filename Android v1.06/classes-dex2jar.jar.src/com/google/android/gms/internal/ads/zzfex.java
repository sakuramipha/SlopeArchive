package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzfex
{
  private final String zza = (String)zzbcx.zzb.zze();
  
  public final String zza(Map paramMap)
  {
    Uri.Builder localBuilder = Uri.parse(this.zza).buildUpon();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localBuilder.appendQueryParameter((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    return localBuilder.build().toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */