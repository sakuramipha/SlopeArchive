package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

class zzfqj
  extends zzfqh
  implements List
{
  final zzfqk zzf;
  
  zzfqj(zzfqk paramzzfqk, Object paramObject, @CheckForNull List paramList, zzfqh paramzzfqh)
  {
    super(paramzzfqk, paramObject, paramList, paramzzfqh);
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    zzb();
    boolean bool = this.zzb.isEmpty();
    ((List)this.zzb).add(paramInt, paramObject);
    paramObject = this.zzf;
    zzfqk.zzn((zzfqk)paramObject, zzfqk.zzd((zzfqk)paramObject) + 1);
    if (bool) {
      zza();
    }
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return false;
    }
    int i = size();
    boolean bool2 = ((List)this.zzb).addAll(paramInt, paramCollection);
    boolean bool1 = bool2;
    if (bool2)
    {
      paramInt = this.zzb.size();
      paramCollection = this.zzf;
      zzfqk.zzn(paramCollection, zzfqk.zzd(paramCollection) + (paramInt - i));
      bool1 = bool2;
      if (i == 0)
      {
        zza();
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final Object get(int paramInt)
  {
    zzb();
    return ((List)this.zzb).get(paramInt);
  }
  
  public final int indexOf(@CheckForNull Object paramObject)
  {
    zzb();
    return ((List)this.zzb).indexOf(paramObject);
  }
  
  public final int lastIndexOf(@CheckForNull Object paramObject)
  {
    zzb();
    return ((List)this.zzb).lastIndexOf(paramObject);
  }
  
  public final ListIterator listIterator()
  {
    zzb();
    return new zzfqi(this);
  }
  
  public final ListIterator listIterator(int paramInt)
  {
    zzb();
    return new zzfqi(this, paramInt);
  }
  
  public final Object remove(int paramInt)
  {
    zzb();
    Object localObject = ((List)this.zzb).remove(paramInt);
    zzfqk localzzfqk = this.zzf;
    zzfqk.zzn(localzzfqk, zzfqk.zzd(localzzfqk) - 1);
    zzc();
    return localObject;
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    zzb();
    return ((List)this.zzb).set(paramInt, paramObject);
  }
  
  public final List subList(int paramInt1, int paramInt2)
  {
    zzb();
    zzfqk localzzfqk = this.zzf;
    Object localObject2 = this.zza;
    List localList = ((List)this.zzb).subList(paramInt1, paramInt2);
    Object localObject1 = this.zzc;
    if (localObject1 == null) {
      localObject1 = this;
    }
    return localzzfqk.zzh(localObject2, localList, (zzfqh)localObject1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */