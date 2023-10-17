package com.google.android.gms.internal.drive;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzlk<K, V>
  extends LinkedHashMap<K, V>
{
  private static final zzlk zzty;
  private boolean zznh = true;
  
  static
  {
    zzlk localzzlk = new zzlk();
    zzty = localzzlk;
    localzzlk.zznh = false;
  }
  
  private zzlk() {}
  
  private zzlk(Map<K, V> paramMap)
  {
    super(paramMap);
  }
  
  public static <K, V> zzlk<K, V> zzdw()
  {
    return zzty;
  }
  
  private final void zzdy()
  {
    if (this.zznh) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  private static int zzg(Object paramObject)
  {
    if ((paramObject instanceof byte[])) {
      return zzkm.hashCode((byte[])paramObject);
    }
    if (!(paramObject instanceof zzkn)) {
      return paramObject.hashCode();
    }
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    zzdy();
    super.clear();
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    if (isEmpty()) {
      return Collections.emptySet();
    }
    return super.entrySet();
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Map))
    {
      Map localMap = (Map)paramObject;
      if (this != localMap)
      {
        if (size() != localMap.size()) {}
        for (;;)
        {
          i = 0;
          break label166;
          Iterator localIterator = entrySet().iterator();
          boolean bool;
          do
          {
            if (!localIterator.hasNext()) {
              break label164;
            }
            Object localObject = (Map.Entry)localIterator.next();
            if (!localMap.containsKey(((Map.Entry)localObject).getKey())) {
              break;
            }
            paramObject = ((Map.Entry)localObject).getValue();
            localObject = localMap.get(((Map.Entry)localObject).getKey());
            if (((paramObject instanceof byte[])) && ((localObject instanceof byte[]))) {
              bool = Arrays.equals((byte[])paramObject, (byte[])localObject);
            } else {
              bool = paramObject.equals(localObject);
            }
          } while (bool);
        }
      }
      label164:
      int i = 1;
      label166:
      if (i != 0) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = entrySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      int j = zzg(localEntry.getKey());
      i += (zzg(localEntry.getValue()) ^ j);
    }
    return i;
  }
  
  public final boolean isMutable()
  {
    return this.zznh;
  }
  
  public final V put(K paramK, V paramV)
  {
    zzdy();
    zzkm.checkNotNull(paramK);
    zzkm.checkNotNull(paramV);
    return (V)super.put(paramK, paramV);
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    zzdy();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      zzkm.checkNotNull(localObject);
      zzkm.checkNotNull(paramMap.get(localObject));
    }
    super.putAll(paramMap);
  }
  
  public final V remove(Object paramObject)
  {
    zzdy();
    return (V)super.remove(paramObject);
  }
  
  public final void zza(zzlk<K, V> paramzzlk)
  {
    zzdy();
    if (!paramzzlk.isEmpty()) {
      putAll(paramzzlk);
    }
  }
  
  public final void zzbp()
  {
    this.zznh = false;
  }
  
  public final zzlk<K, V> zzdx()
  {
    if (isEmpty()) {
      return new zzlk();
    }
    return new zzlk(this);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzlk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */