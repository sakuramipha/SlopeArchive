package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzx
  implements Map, Serializable
{
  @CheckForNull
  private transient zzy zza;
  @CheckForNull
  private transient zzy zzb;
  @CheckForNull
  private transient zzr zzc;
  
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
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
    }
    else
    {
      if ((paramObject instanceof Map)) {
        break label21;
      }
      bool = false;
    }
    return bool;
    label21:
    paramObject = (Map)paramObject;
    return entrySet().equals(((Map)paramObject).entrySet());
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
    return zzag.zza(zze());
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
    if (i >= 0)
    {
      StringBuilder localStringBuilder = new StringBuilder((int)Math.min(i * 8L, 1073741824L));
      localStringBuilder.append('{');
      Iterator localIterator = entrySet().iterator();
      for (i = 1; localIterator.hasNext(); i = 0)
      {
        localObject = (Map.Entry)localIterator.next();
        if (i == 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append(((Map.Entry)localObject).getKey());
        localStringBuilder.append('=');
        localStringBuilder.append(((Map.Entry)localObject).getValue());
      }
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("size cannot be negative but was: ");
    ((StringBuilder)localObject).append(i);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  abstract zzr zza();
  
  public final zzr zzb()
  {
    zzr localzzr2 = this.zzc;
    zzr localzzr1 = localzzr2;
    if (localzzr2 == null)
    {
      localzzr1 = zza();
      this.zzc = localzzr1;
    }
    return localzzr1;
  }
  
  abstract zzy zzc();
  
  abstract zzy zzd();
  
  public final zzy zze()
  {
    zzy localzzy2 = this.zza;
    zzy localzzy1 = localzzy2;
    if (localzzy2 == null)
    {
      localzzy1 = zzc();
      this.zza = localzzy1;
    }
    return localzzy1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */