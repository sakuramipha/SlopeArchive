package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzgmy
  extends AbstractList
  implements zzgpf
{
  private boolean zza;
  
  zzgmy(boolean paramBoolean)
  {
    this.zza = paramBoolean;
  }
  
  public void add(int paramInt, Object paramObject)
  {
    zzbH();
    super.add(paramInt, paramObject);
  }
  
  public boolean add(Object paramObject)
  {
    zzbH();
    return super.add(paramObject);
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    zzbH();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection paramCollection)
  {
    zzbH();
    return super.addAll(paramCollection);
  }
  
  public void clear()
  {
    zzbH();
    super.clear();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    if (!(paramObject instanceof RandomAccess)) {
      return super.equals(paramObject);
    }
    paramObject = (List)paramObject;
    int j = size();
    if (j == ((List)paramObject).size())
    {
      for (int i = 0; i < j; i++) {
        if (!get(i).equals(((List)paramObject).get(i))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public int hashCode()
  {
    int k = size();
    int j = 1;
    for (int i = 0; i < k; i++) {
      j = j * 31 + get(i).hashCode();
    }
    return j;
  }
  
  public Object remove(int paramInt)
  {
    zzbH();
    return super.remove(paramInt);
  }
  
  public final boolean remove(Object paramObject)
  {
    zzbH();
    int i = indexOf(paramObject);
    if (i == -1) {
      return false;
    }
    remove(i);
    return true;
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    zzbH();
    return super.removeAll(paramCollection);
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    zzbH();
    return super.retainAll(paramCollection);
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    zzbH();
    return super.set(paramInt, paramObject);
  }
  
  public final void zzb()
  {
    if (this.zza) {
      this.zza = false;
    }
  }
  
  protected final void zzbH()
  {
    if (this.zza) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final boolean zzc()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgmy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */