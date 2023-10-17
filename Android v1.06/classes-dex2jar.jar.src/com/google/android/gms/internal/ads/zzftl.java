package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

final class zzftl
  extends zzftk
  implements SortedSet
{
  zzftl(SortedSet paramSortedSet, zzfpa paramzzfpa)
  {
    super(paramSortedSet, paramzzfpa);
  }
  
  @CheckForNull
  public final Comparator comparator()
  {
    return ((SortedSet)this.zza).comparator();
  }
  
  public final Object first()
  {
    Iterator localIterator = this.zza.iterator();
    zzfpa localzzfpa = this.zzb;
    Objects.requireNonNull(localIterator);
    Objects.requireNonNull(localzzfpa);
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (localzzfpa.zza(localObject)) {
        return localObject;
      }
    }
    throw new NoSuchElementException();
  }
  
  public final SortedSet headSet(Object paramObject)
  {
    return new zzftl(((SortedSet)this.zza).headSet(paramObject), this.zzb);
  }
  
  public final Object last()
  {
    Object localObject;
    for (SortedSet localSortedSet = (SortedSet)this.zza;; localSortedSet = localSortedSet.headSet(localObject))
    {
      localObject = localSortedSet.last();
      if (this.zzb.zza(localObject)) {
        return localObject;
      }
    }
  }
  
  public final SortedSet subSet(Object paramObject1, Object paramObject2)
  {
    return new zzftl(((SortedSet)this.zza).subSet(paramObject1, paramObject2), this.zzb);
  }
  
  public final SortedSet tailSet(Object paramObject)
  {
    return new zzftl(((SortedSet)this.zza).tailSet(paramObject), this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */