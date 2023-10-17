package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import javax.annotation.CheckForNull;

final class zzfqb
  extends zzfqe
  implements NavigableMap
{
  final zzfqk zzc;
  
  zzfqb(zzfqk paramzzfqk, NavigableMap paramNavigableMap)
  {
    super(paramzzfqk, paramNavigableMap);
  }
  
  @CheckForNull
  public final Map.Entry ceilingEntry(Object paramObject)
  {
    paramObject = ((NavigableMap)this.zza).ceilingEntry(paramObject);
    if (paramObject == null) {
      return null;
    }
    return zza((Map.Entry)paramObject);
  }
  
  @CheckForNull
  public final Object ceilingKey(Object paramObject)
  {
    return ((NavigableMap)this.zza).ceilingKey(paramObject);
  }
  
  public final NavigableSet descendingKeySet()
  {
    return (NavigableSet)((zzfqe)descendingMap()).zzh();
  }
  
  public final NavigableMap descendingMap()
  {
    return new zzfqb(this.zzc, ((NavigableMap)this.zza).descendingMap());
  }
  
  @CheckForNull
  public final Map.Entry firstEntry()
  {
    Map.Entry localEntry = ((NavigableMap)this.zza).firstEntry();
    if (localEntry == null) {
      return null;
    }
    return zza(localEntry);
  }
  
  @CheckForNull
  public final Map.Entry floorEntry(Object paramObject)
  {
    paramObject = ((NavigableMap)this.zza).floorEntry(paramObject);
    if (paramObject == null) {
      return null;
    }
    return zza((Map.Entry)paramObject);
  }
  
  @CheckForNull
  public final Object floorKey(Object paramObject)
  {
    return ((NavigableMap)this.zza).floorKey(paramObject);
  }
  
  public final NavigableMap headMap(Object paramObject, boolean paramBoolean)
  {
    return new zzfqb(this.zzc, ((NavigableMap)this.zza).headMap(paramObject, paramBoolean));
  }
  
  @CheckForNull
  public final Map.Entry higherEntry(Object paramObject)
  {
    paramObject = ((NavigableMap)this.zza).higherEntry(paramObject);
    if (paramObject == null) {
      return null;
    }
    return zza((Map.Entry)paramObject);
  }
  
  @CheckForNull
  public final Object higherKey(Object paramObject)
  {
    return ((NavigableMap)this.zza).higherKey(paramObject);
  }
  
  @CheckForNull
  public final Map.Entry lastEntry()
  {
    Map.Entry localEntry = ((NavigableMap)this.zza).lastEntry();
    if (localEntry == null) {
      return null;
    }
    return zza(localEntry);
  }
  
  @CheckForNull
  public final Map.Entry lowerEntry(Object paramObject)
  {
    paramObject = ((NavigableMap)this.zza).lowerEntry(paramObject);
    if (paramObject == null) {
      return null;
    }
    return zza((Map.Entry)paramObject);
  }
  
  @CheckForNull
  public final Object lowerKey(Object paramObject)
  {
    return ((NavigableMap)this.zza).lowerKey(paramObject);
  }
  
  public final NavigableSet navigableKeySet()
  {
    return (NavigableSet)super.zzh();
  }
  
  @CheckForNull
  public final Map.Entry pollFirstEntry()
  {
    return zzc(entrySet().iterator());
  }
  
  @CheckForNull
  public final Map.Entry pollLastEntry()
  {
    return zzc(descendingMap().entrySet().iterator());
  }
  
  public final NavigableMap subMap(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
  {
    return new zzfqb(this.zzc, ((NavigableMap)this.zza).subMap(paramObject1, paramBoolean1, paramObject2, paramBoolean2));
  }
  
  public final NavigableMap tailMap(Object paramObject, boolean paramBoolean)
  {
    return new zzfqb(this.zzc, ((NavigableMap)this.zza).tailMap(paramObject, paramBoolean));
  }
  
  @CheckForNull
  final Map.Entry zzc(Iterator paramIterator)
  {
    if (!paramIterator.hasNext()) {
      return null;
    }
    Map.Entry localEntry = (Map.Entry)paramIterator.next();
    Collection localCollection = this.zzc.zza();
    localCollection.addAll((Collection)localEntry.getValue());
    paramIterator.remove();
    return new zzfrn(localEntry.getKey(), this.zzc.zzb(localCollection));
  }
  
  final NavigableSet zzd()
  {
    return new zzfqc(this.zzc, (NavigableMap)this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */