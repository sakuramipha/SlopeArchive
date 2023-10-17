package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzcds
{
  private final ArrayList zza = new ArrayList();
  private long zzb;
  
  final long zza()
  {
    Iterator localIterator2 = this.zza.iterator();
    while (localIterator2.hasNext())
    {
      Iterator localIterator1 = ((zzgk)localIterator2.next()).zze().entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        try
        {
          if ("content-length".equalsIgnoreCase((String)localEntry.getKey()))
          {
            long l = Long.parseLong((String)((List)localEntry.getValue()).get(0));
            this.zzb = Math.max(this.zzb, l);
          }
        }
        catch (RuntimeException localRuntimeException) {}
      }
      localIterator2.remove();
    }
    return this.zzb;
  }
  
  final void zzb(zzgk paramzzgk)
  {
    this.zza.add(paramzzgk);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */