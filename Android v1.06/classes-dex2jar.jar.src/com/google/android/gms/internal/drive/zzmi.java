package com.google.android.gms.internal.drive;

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

class zzmi<K extends Comparable<K>, V>
  extends AbstractMap<K, V>
{
  private boolean zzot;
  private final int zzvd;
  private List<zzmp> zzve;
  private Map<K, V> zzvf;
  private volatile zzmr zzvg;
  private Map<K, V> zzvh;
  private volatile zzml zzvi;
  
  private zzmi(int paramInt)
  {
    this.zzvd = paramInt;
    this.zzve = Collections.emptyList();
    this.zzvf = Collections.emptyMap();
    this.zzvh = Collections.emptyMap();
  }
  
  private final int zza(K paramK)
  {
    int j = this.zzve.size() - 1;
    if (j >= 0)
    {
      i = paramK.compareTo((Comparable)((zzmp)this.zzve.get(j)).getKey());
      if (i > 0) {
        return -(j + 2);
      }
      if (i == 0) {
        return j;
      }
    }
    int i = 0;
    while (i <= j)
    {
      int k = (i + j) / 2;
      int m = paramK.compareTo((Comparable)((zzmp)this.zzve.get(k)).getKey());
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
  
  static <FieldDescriptorType extends zzkd<FieldDescriptorType>> zzmi<FieldDescriptorType, Object> zzav(int paramInt)
  {
    return new zzmj(paramInt);
  }
  
  private final V zzax(int paramInt)
  {
    zzeu();
    Object localObject = ((zzmp)this.zzve.remove(paramInt)).getValue();
    if (!this.zzvf.isEmpty())
    {
      Iterator localIterator = zzev().entrySet().iterator();
      this.zzve.add(new zzmp(this, (Map.Entry)localIterator.next()));
      localIterator.remove();
    }
    return (V)localObject;
  }
  
  private final void zzeu()
  {
    if (!this.zzot) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  private final SortedMap<K, V> zzev()
  {
    zzeu();
    if ((this.zzvf.isEmpty()) && (!(this.zzvf instanceof TreeMap)))
    {
      TreeMap localTreeMap2 = new TreeMap();
      this.zzvf = localTreeMap2;
      TreeMap localTreeMap1 = (TreeMap)localTreeMap2;
      this.zzvh = localTreeMap2.descendingMap();
    }
    return (SortedMap)this.zzvf;
  }
  
  public void clear()
  {
    zzeu();
    if (!this.zzve.isEmpty()) {
      this.zzve.clear();
    }
    if (!this.zzvf.isEmpty()) {
      this.zzvf.clear();
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    return (zza((Comparable)paramObject) >= 0) || (this.zzvf.containsKey(paramObject));
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    if (this.zzvg == null) {
      this.zzvg = new zzmr(this, null);
    }
    return this.zzvg;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzmi)) {
      return super.equals(paramObject);
    }
    paramObject = (zzmi)paramObject;
    int k = size();
    if (k != ((zzmi)paramObject).size()) {
      return false;
    }
    int j = zzer();
    if (j != ((zzmi)paramObject).zzer()) {
      return entrySet().equals(((zzmi)paramObject).entrySet());
    }
    for (int i = 0; i < j; i++) {
      if (!zzaw(i).equals(((zzmi)paramObject).zzaw(i))) {
        return false;
      }
    }
    if (j != k) {
      return this.zzvf.equals(((zzmi)paramObject).zzvf);
    }
    return true;
  }
  
  public V get(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    int i = zza((Comparable)paramObject);
    if (i >= 0) {
      return (V)((zzmp)this.zzve.get(i)).getValue();
    }
    return (V)this.zzvf.get(paramObject);
  }
  
  public int hashCode()
  {
    int k = zzer();
    int j = 0;
    int i = 0;
    while (j < k)
    {
      i += ((zzmp)this.zzve.get(j)).hashCode();
      j++;
    }
    j = i;
    if (this.zzvf.size() > 0) {
      j = i + this.zzvf.hashCode();
    }
    return j;
  }
  
  public final boolean isImmutable()
  {
    return this.zzot;
  }
  
  public V remove(Object paramObject)
  {
    zzeu();
    paramObject = (Comparable)paramObject;
    int i = zza((Comparable)paramObject);
    if (i >= 0) {
      return (V)zzax(i);
    }
    if (this.zzvf.isEmpty()) {
      return null;
    }
    return (V)this.zzvf.remove(paramObject);
  }
  
  public int size()
  {
    return this.zzve.size() + this.zzvf.size();
  }
  
  public final V zza(K paramK, V paramV)
  {
    zzeu();
    int i = zza(paramK);
    if (i >= 0) {
      return (V)((zzmp)this.zzve.get(i)).setValue(paramV);
    }
    zzeu();
    if ((this.zzve.isEmpty()) && (!(this.zzve instanceof ArrayList))) {
      this.zzve = new ArrayList(this.zzvd);
    }
    int j = -(i + 1);
    if (j >= this.zzvd) {
      return (V)zzev().put(paramK, paramV);
    }
    i = this.zzve.size();
    int k = this.zzvd;
    if (i == k)
    {
      zzmp localzzmp = (zzmp)this.zzve.remove(k - 1);
      zzev().put((Comparable)localzzmp.getKey(), localzzmp.getValue());
    }
    this.zzve.add(j, new zzmp(this, paramK, paramV));
    return null;
  }
  
  public final Map.Entry<K, V> zzaw(int paramInt)
  {
    return (Map.Entry)this.zzve.get(paramInt);
  }
  
  public void zzbp()
  {
    if (!this.zzot)
    {
      Map localMap;
      if (this.zzvf.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(this.zzvf);
      }
      this.zzvf = localMap;
      if (this.zzvh.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(this.zzvh);
      }
      this.zzvh = localMap;
      this.zzot = true;
    }
  }
  
  public final int zzer()
  {
    return this.zzve.size();
  }
  
  public final Iterable<Map.Entry<K, V>> zzes()
  {
    if (this.zzvf.isEmpty()) {
      return zzmm.zzex();
    }
    return this.zzvf.entrySet();
  }
  
  final Set<Map.Entry<K, V>> zzet()
  {
    if (this.zzvi == null) {
      this.zzvi = new zzml(this, null);
    }
    return this.zzvi;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */