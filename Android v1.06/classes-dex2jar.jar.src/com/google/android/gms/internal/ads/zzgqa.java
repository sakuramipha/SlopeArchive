package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public final class zzgqa
  extends LinkedHashMap
{
  private static final zzgqa zza;
  private boolean zzb = true;
  
  static
  {
    zzgqa localzzgqa = new zzgqa();
    zza = localzzgqa;
    localzzgqa.zzb = false;
  }
  
  private zzgqa() {}
  
  private zzgqa(Map paramMap)
  {
    super(paramMap);
  }
  
  public static zzgqa zza()
  {
    return zza;
  }
  
  private static int zzf(Object paramObject)
  {
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      paramObject = zzgpg.zzd;
      int i = arrayOfByte.length;
      int j = zzgpg.zzb(i, arrayOfByte, 0, i);
      i = j;
      if (j == 0) {
        i = 1;
      }
      return i;
    }
    if (!(paramObject instanceof zzgoy)) {
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
      paramObject = (Map)paramObject;
      if (this != paramObject)
      {
        if (size() == ((Map)paramObject).size())
        {
          Iterator localIterator = entrySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject2 = (Map.Entry)localIterator.next();
            if (!((Map)paramObject).containsKey(((Map.Entry)localObject2).getKey())) {
              break label159;
            }
            Object localObject1 = ((Map.Entry)localObject2).getValue();
            localObject2 = ((Map)paramObject).get(((Map.Entry)localObject2).getKey());
            boolean bool;
            if (((localObject1 instanceof byte[])) && ((localObject2 instanceof byte[]))) {
              bool = Arrays.equals((byte[])localObject1, (byte[])localObject2);
            } else {
              bool = localObject1.equals(localObject2);
            }
            if (!bool) {
              break label159;
            }
          }
        }
      }
      else {
        return true;
      }
    }
    label159:
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
    byte[] arrayOfByte = zzgpg.zzd;
    Objects.requireNonNull(paramObject1);
    Objects.requireNonNull(paramObject2);
    return super.put(paramObject1, paramObject2);
  }
  
  public final void putAll(Map paramMap)
  {
    zzg();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      byte[] arrayOfByte = zzgpg.zzd;
      Objects.requireNonNull(localObject);
      Objects.requireNonNull(paramMap.get(localObject));
    }
    super.putAll(paramMap);
  }
  
  public final Object remove(Object paramObject)
  {
    zzg();
    return super.remove(paramObject);
  }
  
  public final zzgqa zzb()
  {
    zzgqa localzzgqa;
    if (isEmpty()) {
      localzzgqa = new zzgqa();
    } else {
      localzzgqa = new zzgqa(this);
    }
    return localzzgqa;
  }
  
  public final void zzc()
  {
    this.zzb = false;
  }
  
  public final void zzd(zzgqa paramzzgqa)
  {
    zzg();
    if (!paramzzgqa.isEmpty()) {
      putAll(paramzzgqa);
    }
  }
  
  public final boolean zze()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */