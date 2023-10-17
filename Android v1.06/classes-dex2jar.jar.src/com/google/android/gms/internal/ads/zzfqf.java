package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

class zzfqf
  extends zzfqa
  implements SortedSet
{
  final zzfqk zzc;
  
  zzfqf(zzfqk paramzzfqk, SortedMap paramSortedMap)
  {
    super(paramzzfqk, paramSortedMap);
  }
  
  @CheckForNull
  public final Comparator comparator()
  {
    return zza().comparator();
  }
  
  public final Object first()
  {
    return zza().firstKey();
  }
  
  public SortedSet headSet(Object paramObject)
  {
    return new zzfqf(this.zzc, zza().headMap(paramObject));
  }
  
  public final Object last()
  {
    return zza().lastKey();
  }
  
  public SortedSet subSet(Object paramObject1, Object paramObject2)
  {
    return new zzfqf(this.zzc, zza().subMap(paramObject1, paramObject2));
  }
  
  public SortedSet tailSet(Object paramObject)
  {
    return new zzfqf(this.zzc, zza().tailMap(paramObject));
  }
  
  SortedMap zza()
  {
    return (SortedMap)this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */