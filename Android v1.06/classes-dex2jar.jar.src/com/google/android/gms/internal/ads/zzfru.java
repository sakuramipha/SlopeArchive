package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzfru
  implements Map, Serializable
{
  @CheckForNull
  private transient zzfrw zza;
  @CheckForNull
  private transient zzfrw zzb;
  @CheckForNull
  private transient zzfrm zzc;
  
  public static zzfru zzc(Map paramMap)
  {
    paramMap = paramMap.entrySet();
    int i;
    if ((paramMap instanceof Collection)) {
      i = paramMap.size();
    } else {
      i = 4;
    }
    zzfrt localzzfrt = new zzfrt(i);
    localzzfrt.zzb(paramMap);
    return localzzfrt.zzc();
  }
  
  public static zzfru zzd()
  {
    return zzftg.zza;
  }
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean containsKey(@CheckForNull Object paramObject)
  {
    return get(paramObject) != null;
  }
  
  public final boolean containsValue(@CheckForNull Object paramObject)
  {
    return zzb().contains(paramObject);
  }
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    return zzfsm.zzb(this, paramObject);
  }
  
  @CheckForNull
  public abstract Object get(@CheckForNull Object paramObject);
  
  @CheckForNull
  public final Object getOrDefault(@CheckForNull Object paramObject1, @CheckForNull Object paramObject2)
  {
    paramObject1 = get(paramObject1);
    if (paramObject1 != null) {
      return paramObject1;
    }
    return paramObject2;
  }
  
  public final int hashCode()
  {
    return zzftn.zza(zzg());
  }
  
  public final boolean isEmpty()
  {
    return size() == 0;
  }
  
  @Deprecated
  @CheckForNull
  public final Object put(Object paramObject1, Object paramObject2)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void putAll(Map paramMap)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  @CheckForNull
  public final Object remove(@CheckForNull Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final String toString()
  {
    int i = size();
    zzfqo.zza(i, "size");
    StringBuilder localStringBuilder = new StringBuilder((int)Math.min(i * 8L, 1073741824L));
    localStringBuilder.append('{');
    Iterator localIterator = entrySet().iterator();
    for (i = 1; localIterator.hasNext(); i = 0)
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (i == 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(localEntry.getKey());
      localStringBuilder.append('=');
      localStringBuilder.append(localEntry.getValue());
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  abstract zzfrm zza();
  
  public final zzfrm zzb()
  {
    zzfrm localzzfrm2 = this.zzc;
    zzfrm localzzfrm1 = localzzfrm2;
    if (localzzfrm2 == null)
    {
      localzzfrm1 = zza();
      this.zzc = localzzfrm1;
    }
    return localzzfrm1;
  }
  
  abstract zzfrw zze();
  
  abstract zzfrw zzf();
  
  public final zzfrw zzg()
  {
    zzfrw localzzfrw2 = this.zza;
    zzfrw localzzfrw1 = localzzfrw2;
    if (localzzfrw2 == null)
    {
      localzzfrw1 = zze();
      this.zza = localzzfrw1;
    }
    return localzzfrw1;
  }
  
  public final zzfrw zzh()
  {
    zzfrw localzzfrw2 = this.zzb;
    zzfrw localzzfrw1 = localzzfrw2;
    if (localzzfrw2 == null)
    {
      localzzfrw1 = zzf();
      this.zzb = localzzfrw1;
    }
    return localzzfrw1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */