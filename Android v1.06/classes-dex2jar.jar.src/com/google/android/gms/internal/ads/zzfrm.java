package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

public abstract class zzfrm
  extends AbstractCollection
  implements Serializable
{
  private static final Object[] zza = new Object[0];
  
  @Deprecated
  public final boolean add(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean contains(@CheckForNull Object paramObject);
  
  @Deprecated
  public final boolean remove(@CheckForNull Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean removeAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray()
  {
    return toArray(zza);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    Objects.requireNonNull(paramArrayOfObject);
    int j = size();
    int i = paramArrayOfObject.length;
    Object[] arrayOfObject;
    if (i < j)
    {
      arrayOfObject = zzg();
      if (arrayOfObject == null)
      {
        arrayOfObject = paramArrayOfObject;
        if (i != 0) {
          arrayOfObject = Arrays.copyOf(paramArrayOfObject, 0);
        }
        arrayOfObject = Arrays.copyOf(arrayOfObject, j);
      }
      else
      {
        return Arrays.copyOfRange(arrayOfObject, zzc(), zzb(), paramArrayOfObject.getClass());
      }
    }
    else
    {
      arrayOfObject = paramArrayOfObject;
      if (i > j)
      {
        paramArrayOfObject[j] = null;
        arrayOfObject = paramArrayOfObject;
      }
    }
    zza(arrayOfObject, 0);
    return arrayOfObject;
  }
  
  int zza(Object[] paramArrayOfObject, int paramInt)
  {
    throw null;
  }
  
  int zzb()
  {
    throw new UnsupportedOperationException();
  }
  
  int zzc()
  {
    throw new UnsupportedOperationException();
  }
  
  public zzfrr zzd()
  {
    throw null;
  }
  
  public abstract zzftr zze();
  
  abstract boolean zzf();
  
  @CheckForNull
  Object[] zzg()
  {
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */