package com.google.android.gms.internal.common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

public abstract class zzac<E>
  extends AbstractCollection<E>
  implements Serializable
{
  private static final Object[] zza = new Object[0];
  
  @Deprecated
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean remove(@CheckForNull Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray()
  {
    return toArray(zza);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    Objects.requireNonNull(paramArrayOfT);
    int j = size();
    int i = paramArrayOfT.length;
    Object localObject;
    if (i < j)
    {
      localObject = zzg();
      if (localObject == null) {
        localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), j);
      } else {
        return Arrays.copyOfRange((Object[])localObject, zzc(), zzb(), paramArrayOfT.getClass());
      }
    }
    else
    {
      localObject = paramArrayOfT;
      if (i > j)
      {
        paramArrayOfT[j] = null;
        localObject = paramArrayOfT;
      }
    }
    zza((Object[])localObject, 0);
    return (T[])localObject;
  }
  
  int zza(Object[] paramArrayOfObject, int paramInt)
  {
    throw null;
  }
  
  int zzb()
  {
    throw null;
  }
  
  int zzc()
  {
    throw null;
  }
  
  public zzag<E> zzd()
  {
    throw null;
  }
  
  public abstract zzaj<E> zze();
  
  abstract boolean zzf();
  
  @CheckForNull
  Object[] zzg()
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */