package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

final class zzfsk
  extends AbstractCollection
{
  final Map zza;
  
  zzfsk(Map paramMap)
  {
    this.zza = paramMap;
  }
  
  public final void clear()
  {
    this.zza.clear();
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    return this.zza.containsValue(paramObject);
  }
  
  public final boolean isEmpty()
  {
    return this.zza.isEmpty();
  }
  
  public final Iterator iterator()
  {
    return new zzfsh(this.zza.entrySet().iterator());
  }
  
  public final boolean remove(@CheckForNull Object paramObject)
  {
    try
    {
      boolean bool = super.remove(paramObject);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      Iterator localIterator = this.zza.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (zzfou.zza(paramObject, localEntry.getValue()))
        {
          this.zza.remove(localEntry.getKey());
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    Objects.requireNonNull(paramCollection);
    try
    {
      boolean bool = super.removeAll(paramCollection);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = this.zza.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (paramCollection.contains(localEntry.getValue())) {
          localHashSet.add(localEntry.getKey());
        }
      }
      return this.zza.keySet().removeAll(localHashSet);
    }
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    Objects.requireNonNull(paramCollection);
    try
    {
      boolean bool = super.retainAll(paramCollection);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = this.zza.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (paramCollection.contains(localEntry.getValue())) {
          localHashSet.add(localEntry.getKey());
        }
      }
      return this.zza.keySet().retainAll(localHashSet);
    }
  }
  
  public final int size()
  {
    return this.zza.size();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfsk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */