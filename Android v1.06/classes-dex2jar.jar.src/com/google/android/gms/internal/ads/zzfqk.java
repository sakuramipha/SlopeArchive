package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

abstract class zzfqk
  extends zzfqn
  implements Serializable
{
  private final transient Map zza;
  private transient int zzb;
  
  protected zzfqk(Map paramMap)
  {
    zzfoz.zze(paramMap.isEmpty());
    this.zza = paramMap;
  }
  
  abstract Collection zza();
  
  Collection zzb(Collection paramCollection)
  {
    throw null;
  }
  
  Collection zzc(Object paramObject, Collection paramCollection)
  {
    throw null;
  }
  
  public final int zze()
  {
    return this.zzb;
  }
  
  final Collection zzf()
  {
    return new zzfqm(this);
  }
  
  final Iterator zzg()
  {
    return new zzfpu(this);
  }
  
  final List zzh(Object paramObject, List paramList, @CheckForNull zzfqh paramzzfqh)
  {
    if ((paramList instanceof RandomAccess)) {
      paramObject = new zzfqd(this, paramObject, paramList, paramzzfqh);
    } else {
      paramObject = new zzfqj(this, paramObject, paramList, paramzzfqh);
    }
    return (List)paramObject;
  }
  
  Map zzj()
  {
    throw null;
  }
  
  final Map zzk()
  {
    Map localMap = this.zza;
    if ((localMap instanceof NavigableMap)) {
      return new zzfqb(this, (NavigableMap)localMap);
    }
    if ((localMap instanceof SortedMap)) {
      return new zzfqe(this, (SortedMap)localMap);
    }
    return new zzfpx(this, localMap);
  }
  
  Set zzl()
  {
    throw null;
  }
  
  final Set zzm()
  {
    Map localMap = this.zza;
    if ((localMap instanceof NavigableMap)) {
      return new zzfqc(this, (NavigableMap)localMap);
    }
    if ((localMap instanceof SortedMap)) {
      return new zzfqf(this, (SortedMap)localMap);
    }
    return new zzfqa(this, localMap);
  }
  
  public final void zzp()
  {
    Iterator localIterator = this.zza.values().iterator();
    while (localIterator.hasNext()) {
      ((Collection)localIterator.next()).clear();
    }
    this.zza.clear();
    this.zzb = 0;
  }
  
  public final boolean zzq(Object paramObject1, Object paramObject2)
  {
    Collection localCollection = (Collection)this.zza.get(paramObject1);
    if (localCollection == null)
    {
      localCollection = zza();
      if (localCollection.add(paramObject2))
      {
        this.zzb += 1;
        this.zza.put(paramObject1, localCollection);
        return true;
      }
      throw new AssertionError("New Collection violated the Collection spec");
    }
    if (localCollection.add(paramObject2))
    {
      this.zzb += 1;
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */