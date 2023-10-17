package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzld
  extends LinkedHashMap
{
  private static final zzld zza;
  private boolean zzb = true;
  
  static
  {
    zzld localzzld = new zzld();
    zza = localzzld;
    localzzld.zzb = false;
  }
  
  private zzld() {}
  
  private zzld(Map paramMap)
  {
    super(paramMap);
  }
  
  public static zzld zza()
  {
    return zza;
  }
  
  private static int zzf(Object paramObject)
  {
    if ((paramObject instanceof byte[])) {
      return zzkk.zzb((byte[])paramObject);
    }
    if (!(paramObject instanceof zzke)) {
      return paramObject.hashCode();
    }
    throw new UnsupportedOperationException();
  }
  
  private final void zzg()
  {
    if (this.zzb) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    zzg();
    super.clear();
  }
  
  public final Set entrySet()
  {
    Set localSet;
    if (isEmpty()) {
      localSet = Collections.emptySet();
    } else {
      localSet = super.entrySet();
    }
    return localSet;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Map))
    {
      Map localMap = (Map)paramObject;
      if (this != localMap)
      {
        if (size() == localMap.size())
        {
          paramObject = entrySet().iterator();
          while (((Iterator)paramObject).hasNext())
          {
            Object localObject2 = (Map.Entry)((Iterator)paramObject).next();
            if (!localMap.containsKey(((Map.Entry)localObject2).getKey())) {
              break label161;
            }
            Object localObject1 = ((Map.Entry)localObject2).getValue();
            localObject2 = localMap.get(((Map.Entry)localObject2).getKey());
            boolean bool;
            if (((localObject1 instanceof byte[])) && ((localObject2 instanceof byte[]))) {
              bool = Arrays.equals((byte[])localObject1, (byte[])localObject2);
            } else {
              bool = localObject1.equals(localObject2);
            }
            if (!bool) {
              break label161;
            }
          }
        }
      }
      else {
        return true;
      }
    }
    label161:
    return false;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int j = zzf(localEntry.getKey());
      i += (zzf(localEntry.getValue()) ^ j);
    }
    return i;
  }
  
  public final Object put(Object paramObject1, Object paramObject2)
  {
    zzg();
    zzkk.zze(paramObject1);
    zzkk.zze(paramObject2);
    return super.put(paramObject1, paramObject2);
  }
  
  public final void putAll(Map paramMap)
  {
    zzg();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      zzkk.zze(localObject);
      zzkk.zze(paramMap.get(localObject));
    }
    super.putAll(paramMap);
  }
  
  public final Object remove(Object paramObject)
  {
    zzg();
    return super.remove(paramObject);
  }
  
  public final zzld zzb()
  {
    zzld localzzld;
    if (isEmpty()) {
      localzzld = new zzld();
    } else {
      localzzld = new zzld(this);
    }
    return localzzld;
  }
  
  public final void zzc()
  {
    this.zzb = false;
  }
  
  public final void zzd(zzld paramzzld)
  {
    zzg();
    if (!paramzzld.isEmpty()) {
      putAll(paramzzld);
    }
  }
  
  public final boolean zze()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */