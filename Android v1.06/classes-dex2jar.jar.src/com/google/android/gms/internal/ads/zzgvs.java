package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzgvs
  extends zzgvk
{
  private static final zzgwb zza = zzgvp.zza(Collections.emptyMap());
  
  public static zzgvr zzc(int paramInt)
  {
    return new zzgvr(paramInt, null);
  }
  
  public final Map zzd()
  {
    LinkedHashMap localLinkedHashMap = zzgvl.zzb(zza().size());
    Iterator localIterator = zza().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localLinkedHashMap.put(localEntry.getKey(), ((zzgwb)localEntry.getValue()).zzb());
    }
    return Collections.unmodifiableMap(localLinkedHashMap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */