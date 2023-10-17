package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

class zzfqh
  extends AbstractCollection
{
  final Object zza;
  Collection zzb;
  @CheckForNull
  final zzfqh zzc;
  @CheckForNull
  final Collection zzd;
  final zzfqk zze;
  
  zzfqh(zzfqk paramzzfqk, Object paramObject, @CheckForNull Collection paramCollection, zzfqh paramzzfqh)
  {
    this.zza = paramObject;
    this.zzb = paramCollection;
    this.zzc = paramzzfqh;
    if (paramzzfqh == null) {
      paramzzfqk = null;
    } else {
      paramzzfqk = paramzzfqh.zzb;
    }
    this.zzd = paramzzfqk;
  }
  
  public final boolean add(Object paramObject)
  {
    zzb();
    boolean bool2 = this.zzb.isEmpty();
    boolean bool1 = this.zzb.add(paramObject);
    if (bool1)
    {
      paramObject = this.zze;
      zzfqk.zzn((zzfqk)paramObject, zzfqk.zzd((zzfqk)paramObject) + 1);
      if (bool2)
      {
        zza();
        return true;
      }
    }
    return bool1;
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return false;
    }
    int j = size();
    boolean bool2 = this.zzb.addAll(paramCollection);
    boolean bool1 = bool2;
    if (bool2)
    {
      int i = this.zzb.size();
      paramCollection = this.zze;
      zzfqk.zzn(paramCollection, zzfqk.zzd(paramCollection) + (i - j));
      bool1 = bool2;
      if (j == 0)
      {
        zza();
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final void clear()
  {
    int i = size();
    if (i == 0) {
      return;
    }
    this.zzb.clear();
    zzfqk localzzfqk = this.zze;
    zzfqk.zzn(localzzfqk, zzfqk.zzd(localzzfqk) - i);
    zzc();
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    zzb();
    return this.zzb.contains(paramObject);
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    zzb();
    return this.zzb.containsAll(paramCollection);
  }
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    zzb();
    return this.zzb.equals(paramObject);
  }
  
  public final int hashCode()
  {
    zzb();
    return this.zzb.hashCode();
  }
  
  public final Iterator iterator()
  {
    zzb();
    return new zzfqg(this);
  }
  
  public final boolean remove(@CheckForNull Object paramObject)
  {
    zzb();
    boolean bool = this.zzb.remove(paramObject);
    if (bool)
    {
      paramObject = this.zze;
      zzfqk.zzn((zzfqk)paramObject, zzfqk.zzd((zzfqk)paramObject) - 1);
      zzc();
    }
    return bool;
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return false;
    }
    int j = size();
    boolean bool = this.zzb.removeAll(paramCollection);
    if (bool)
    {
      int i = this.zzb.size();
      paramCollection = this.zze;
      zzfqk.zzn(paramCollection, zzfqk.zzd(paramCollection) + (i - j));
      zzc();
    }
    return bool;
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    Objects.requireNonNull(paramCollection);
    int i = size();
    boolean bool = this.zzb.retainAll(paramCollection);
    if (bool)
    {
      int j = this.zzb.size();
      paramCollection = this.zze;
      zzfqk.zzn(paramCollection, zzfqk.zzd(paramCollection) + (j - i));
      zzc();
    }
    return bool;
  }
  
  public final int size()
  {
    zzb();
    return this.zzb.size();
  }
  
  public final String toString()
  {
    zzb();
    return this.zzb.toString();
  }
  
  final void zza()
  {
    zzfqh localzzfqh = this.zzc;
    if (localzzfqh != null)
    {
      localzzfqh.zza();
      return;
    }
    zzfqk.zzi(this.zze).put(this.zza, this.zzb);
  }
  
  final void zzb()
  {
    Object localObject = this.zzc;
    if (localObject != null)
    {
      ((zzfqh)localObject).zzb();
      if (this.zzc.zzb != this.zzd) {
        throw new ConcurrentModificationException();
      }
    }
    else if (this.zzb.isEmpty())
    {
      localObject = (Collection)zzfqk.zzi(this.zze).get(this.zza);
      if (localObject != null) {
        this.zzb = ((Collection)localObject);
      }
    }
  }
  
  final void zzc()
  {
    zzfqh localzzfqh = this.zzc;
    if (localzzfqh != null)
    {
      localzzfqh.zzc();
      return;
    }
    if (this.zzb.isEmpty()) {
      zzfqk.zzi(this.zze).remove(this.zza);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */