package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzmh
  extends AbstractMap
{
  private final int zza;
  private List zzb;
  private Map zzc;
  private boolean zzd;
  private volatile zzmf zze;
  private Map zzf;
  
  private final int zzk(Comparable paramComparable)
  {
    int m = this.zzb.size() - 1;
    int k = 0;
    int j = m;
    int i = k;
    if (m >= 0)
    {
      i = paramComparable.compareTo(((zzmb)this.zzb.get(m)).zza());
      if (i > 0) {
        return -(m + 2);
      }
      if (i != 0)
      {
        j = m;
        i = k;
      }
      else
      {
        return m;
      }
    }
    while (i <= j)
    {
      k = (i + j) / 2;
      m = paramComparable.compareTo(((zzmb)this.zzb.get(k)).zza());
      if (m < 0) {
        j = k - 1;
      } else if (m > 0) {
        i = k + 1;
      } else {
        return k;
      }
    }
    return -(i + 1);
  }
  
  private final Object zzl(int paramInt)
  {
    zzn();
    Object localObject = ((zzmb)this.zzb.remove(paramInt)).getValue();
    if (!this.zzc.isEmpty())
    {
      Iterator localIterator = zzm().entrySet().iterator();
      List localList = this.zzb;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localList.add(new zzmb(this, (Comparable)localEntry.getKey(), localEntry.getValue()));
      localIterator.remove();
    }
    return localObject;
  }
  
  private final SortedMap zzm()
  {
    zzn();
    if ((this.zzc.isEmpty()) && (!(this.zzc instanceof TreeMap)))
    {
      TreeMap localTreeMap2 = new TreeMap();
      this.zzc = localTreeMap2;
      TreeMap localTreeMap1 = (TreeMap)localTreeMap2;
      this.zzf = localTreeMap2.descendingMap();
    }
    return (SortedMap)this.zzc;
  }
  
  private final void zzn()
  {
    if (!this.zzd) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    zzn();
    if (!this.zzb.isEmpty()) {
      this.zzb.clear();
    }
    if (!this.zzc.isEmpty()) {
      this.zzc.clear();
    }
  }
  
  public final boolean containsKey(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    return (zzk((Comparable)paramObject) >= 0) || (this.zzc.containsKey(paramObject));
  }
  
  public final Set entrySet()
  {
    if (this.zze == null) {
      this.zze = new zzmf(this, null);
    }
    return this.zze;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzmh)) {
      return super.equals(paramObject);
    }
    paramObject = (zzmh)paramObject;
    int j = size();
    if (j != ((zzmh)paramObject).size()) {
      return false;
    }
    int k = zzb();
    if (k == ((zzmh)paramObject).zzb())
    {
      for (int i = 0; i < k; i++) {
        if (!zzg(i).equals(((zzmh)paramObject).zzg(i))) {
          return false;
        }
      }
      if (k != j) {
        return this.zzc.equals(((zzmh)paramObject).zzc);
      }
      return true;
    }
    return entrySet().equals(((zzmh)paramObject).entrySet());
  }
  
  public final Object get(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    int i = zzk((Comparable)paramObject);
    if (i >= 0) {
      return ((zzmb)this.zzb.get(i)).getValue();
    }
    return this.zzc.get(paramObject);
  }
  
  public final int hashCode()
  {
    int k = zzb();
    int j = 0;
    int i = 0;
    while (j < k)
    {
      i += ((zzmb)this.zzb.get(j)).hashCode();
      j++;
    }
    j = i;
    if (this.zzc.size() > 0) {
      j = i + this.zzc.hashCode();
    }
    return j;
  }
  
  public final Object remove(Object paramObject)
  {
    zzn();
    paramObject = (Comparable)paramObject;
    int i = zzk((Comparable)paramObject);
    if (i >= 0) {
      return zzl(i);
    }
    if (this.zzc.isEmpty()) {
      return null;
    }
    return this.zzc.remove(paramObject);
  }
  
  public final int size()
  {
    return this.zzb.size() + this.zzc.size();
  }
  
  public void zza()
  {
    if (!this.zzd)
    {
      Map localMap;
      if (this.zzc.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(this.zzc);
      }
      this.zzc = localMap;
      if (this.zzf.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(this.zzf);
      }
      this.zzf = localMap;
      this.zzd = true;
    }
  }
  
  public final int zzb()
  {
    return this.zzb.size();
  }
  
  public final Iterable zzc()
  {
    Object localObject;
    if (this.zzc.isEmpty()) {
      localObject = zzma.zza();
    } else {
      localObject = this.zzc.entrySet();
    }
    return (Iterable)localObject;
  }
  
  public final Object zze(Comparable paramComparable, Object paramObject)
  {
    zzn();
    int i = zzk(paramComparable);
    if (i >= 0) {
      return ((zzmb)this.zzb.get(i)).setValue(paramObject);
    }
    zzn();
    if ((this.zzb.isEmpty()) && (!(this.zzb instanceof ArrayList))) {
      this.zzb = new ArrayList(this.zza);
    }
    int j = -(i + 1);
    if (j >= this.zza) {
      return zzm().put(paramComparable, paramObject);
    }
    i = this.zzb.size();
    int k = this.zza;
    if (i == k)
    {
      zzmb localzzmb = (zzmb)this.zzb.remove(k - 1);
      zzm().put(localzzmb.zza(), localzzmb.getValue());
    }
    this.zzb.add(j, new zzmb(this, paramComparable, paramObject));
    return null;
  }
  
  public final Map.Entry zzg(int paramInt)
  {
    return (Map.Entry)this.zzb.get(paramInt);
  }
  
  public final boolean zzj()
  {
    return this.zzd;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */