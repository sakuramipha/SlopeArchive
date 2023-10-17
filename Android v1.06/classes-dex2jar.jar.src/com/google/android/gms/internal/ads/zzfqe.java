package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

class zzfqe
  extends zzfpx
  implements SortedMap
{
  @CheckForNull
  SortedSet zzd;
  final zzfqk zze;
  
  zzfqe(zzfqk paramzzfqk, SortedMap paramSortedMap)
  {
    super(paramzzfqk, paramSortedMap);
  }
  
  @CheckForNull
  public final Comparator comparator()
  {
    return zzf().comparator();
  }
  
  public final Object firstKey()
  {
    return zzf().firstKey();
  }
  
  public SortedMap headMap(Object paramObject)
  {
    return new zzfqe(this.zze, zzf().headMap(paramObject));
  }
  
  public final Object lastKey()
  {
    return zzf().lastKey();
  }
  
  public SortedMap subMap(Object paramObject1, Object paramObject2)
  {
    return new zzfqe(this.zze, zzf().subMap(paramObject1, paramObject2));
  }
  
  public SortedMap tailMap(Object paramObject)
  {
    return new zzfqe(this.zze, zzf().tailMap(paramObject));
  }
  
  SortedMap zzf()
  {
    return (SortedMap)this.zza;
  }
  
  SortedSet zzg()
  {
    return new zzfqf(this.zze, zzf());
  }
  
  public SortedSet zzh()
  {
    SortedSet localSortedSet2 = this.zzd;
    SortedSet localSortedSet1 = localSortedSet2;
    if (localSortedSet2 == null)
    {
      localSortedSet1 = zzg();
      this.zzd = localSortedSet1;
    }
    return localSortedSet1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */