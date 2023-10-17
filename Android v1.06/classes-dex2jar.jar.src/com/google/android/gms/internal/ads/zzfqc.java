package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import javax.annotation.CheckForNull;

final class zzfqc
  extends zzfqf
  implements NavigableSet
{
  final zzfqk zzb;
  
  zzfqc(zzfqk paramzzfqk, NavigableMap paramNavigableMap)
  {
    super(paramzzfqk, paramNavigableMap);
  }
  
  @CheckForNull
  public final Object ceiling(Object paramObject)
  {
    return ((NavigableMap)this.zzd).ceilingKey(paramObject);
  }
  
  public final Iterator descendingIterator()
  {
    return descendingSet().iterator();
  }
  
  public final NavigableSet descendingSet()
  {
    return new zzfqc(this.zzb, ((NavigableMap)this.zzd).descendingMap());
  }
  
  @CheckForNull
  public final Object floor(Object paramObject)
  {
    return ((NavigableMap)this.zzd).floorKey(paramObject);
  }
  
  public final NavigableSet headSet(Object paramObject, boolean paramBoolean)
  {
    return new zzfqc(this.zzb, ((NavigableMap)this.zzd).headMap(paramObject, paramBoolean));
  }
  
  @CheckForNull
  public final Object higher(Object paramObject)
  {
    return ((NavigableMap)this.zzd).higherKey(paramObject);
  }
  
  @CheckForNull
  public final Object lower(Object paramObject)
  {
    return ((NavigableMap)this.zzd).lowerKey(paramObject);
  }
  
  @CheckForNull
  public final Object pollFirst()
  {
    return zzfsb.zza(iterator());
  }
  
  @CheckForNull
  public final Object pollLast()
  {
    return zzfsb.zza(descendingIterator());
  }
  
  public final NavigableSet subSet(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
  {
    return new zzfqc(this.zzb, ((NavigableMap)this.zzd).subMap(paramObject1, paramBoolean1, paramObject2, paramBoolean2));
  }
  
  public final NavigableSet tailSet(Object paramObject, boolean paramBoolean)
  {
    return new zzfqc(this.zzb, ((NavigableMap)this.zzd).tailMap(paramObject, paramBoolean));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */