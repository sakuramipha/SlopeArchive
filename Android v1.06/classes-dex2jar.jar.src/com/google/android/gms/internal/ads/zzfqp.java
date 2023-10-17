package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

class zzfqp
  extends AbstractCollection
{
  final Collection zza;
  final zzfpa zzb;
  
  zzfqp(Collection paramCollection, zzfpa paramzzfpa)
  {
    this.zza = paramCollection;
    this.zzb = paramzzfpa;
  }
  
  public final boolean add(Object paramObject)
  {
    zzfoz.zze(this.zzb.zza(paramObject));
    return this.zza.add(paramObject);
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      zzfoz.zze(this.zzb.zza(localObject));
    }
    return this.zza.addAll(paramCollection);
  }
  
  public final void clear()
  {
    zzfrx.zza(this.zza, this.zzb);
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    if (zzfqq.zza(this.zza, paramObject)) {
      return this.zzb.zza(paramObject);
    }
    return false;
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public final boolean isEmpty()
  {
    Object localObject = this.zza;
    zzfpa localzzfpa = this.zzb;
    localObject = ((Iterable)localObject).iterator();
    zzfoz.zzc(localzzfpa, "predicate");
    for (int i = 0; ((Iterator)localObject).hasNext(); i++) {
      if (localzzfpa.zza(((Iterator)localObject).next()))
      {
        if (i == -1) {
          break;
        }
        return false;
      }
    }
    return true;
  }
  
  public final Iterator iterator()
  {
    Iterator localIterator = this.zza.iterator();
    zzfpa localzzfpa = this.zzb;
    Objects.requireNonNull(localIterator);
    Objects.requireNonNull(localzzfpa);
    return new zzfry(localIterator, localzzfpa);
  }
  
  public final boolean remove(@CheckForNull Object paramObject)
  {
    return (contains(paramObject)) && (this.zza.remove(paramObject));
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    Iterator localIterator = this.zza.iterator();
    for (boolean bool = false; localIterator.hasNext(); bool = true)
    {
      label13:
      Object localObject = localIterator.next();
      if ((!this.zzb.zza(localObject)) || (!paramCollection.contains(localObject))) {
        break label13;
      }
      localIterator.remove();
    }
    return bool;
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    Iterator localIterator = this.zza.iterator();
    for (boolean bool = false; localIterator.hasNext(); bool = true)
    {
      label13:
      Object localObject = localIterator.next();
      if ((!this.zzb.zza(localObject)) || (paramCollection.contains(localObject))) {
        break label13;
      }
      localIterator.remove();
    }
    return bool;
  }
  
  public final int size()
  {
    Iterator localIterator = this.zza.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (this.zzb.zza(localObject)) {
        i++;
      }
    }
    return i;
  }
  
  public final Object[] toArray()
  {
    Iterator localIterator = iterator();
    ArrayList localArrayList = new ArrayList();
    zzfsb.zzc(localArrayList, localIterator);
    return localArrayList.toArray();
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    Iterator localIterator = iterator();
    ArrayList localArrayList = new ArrayList();
    zzfsb.zzc(localArrayList, localIterator);
    return localArrayList.toArray(paramArrayOfObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */