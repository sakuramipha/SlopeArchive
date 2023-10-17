package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zziw<E>
  extends AbstractList<E>
  implements zzkp<E>
{
  private boolean zznh = true;
  
  public void add(int paramInt, E paramE)
  {
    zzbq();
    super.add(paramInt, paramE);
  }
  
  public boolean add(E paramE)
  {
    zzbq();
    return super.add(paramE);
  }
  
  public boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    zzbq();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection<? extends E> paramCollection)
  {
    zzbq();
    return super.addAll(paramCollection);
  }
  
  public void clear()
  {
    zzbq();
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
    if (j != ((List)paramObject).size()) {
      return false;
    }
    for (int i = 0; i < j; i++) {
      if (!get(i).equals(((List)paramObject).get(i))) {
        return false;
      }
    }
    return true;
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
  
  public E remove(int paramInt)
  {
    zzbq();
    return (E)super.remove(paramInt);
  }
  
  public boolean remove(Object paramObject)
  {
    zzbq();
    return super.remove(paramObject);
  }
  
  public boolean removeAll(Collection<?> paramCollection)
  {
    zzbq();
    return super.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection<?> paramCollection)
  {
    zzbq();
    return super.retainAll(paramCollection);
  }
  
  public E set(int paramInt, E paramE)
  {
    zzbq();
    return (E)super.set(paramInt, paramE);
  }
  
  public boolean zzbo()
  {
    return this.zznh;
  }
  
  public final void zzbp()
  {
    this.zznh = false;
  }
  
  protected final void zzbq()
  {
    if (this.zznh) {
      return;
    }
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zziw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */