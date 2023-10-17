package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

abstract class zzfsi
  extends zzftm
{
  public final void clear()
  {
    zza().clear();
  }
  
  public boolean contains(@CheckForNull Object paramObject)
  {
    boolean bool3 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool3)
    {
      paramObject = (Map.Entry)paramObject;
      Object localObject1 = ((Map.Entry)paramObject).getKey();
      Object localObject2 = zzfsm.zza(zza(), localObject1);
      bool1 = bool2;
      if (zzfou.zza(localObject2, ((Map.Entry)paramObject).getValue())) {
        if (localObject2 == null)
        {
          if (!zza().containsKey(localObject1)) {
            bool1 = bool2;
          } else {
            return true;
          }
        }
        else {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final boolean isEmpty()
  {
    return zza().isEmpty();
  }
  
  public boolean remove(@CheckForNull Object paramObject)
  {
    if ((contains(paramObject)) && ((paramObject instanceof Map.Entry)))
    {
      paramObject = (Map.Entry)paramObject;
      return zza().keySet().remove(((Map.Entry)paramObject).getKey());
    }
    return false;
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    Objects.requireNonNull(paramCollection);
    try
    {
      boolean bool = zzftn.zzd(this, paramCollection);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException) {}
    return zzftn.zze(this, paramCollection.iterator());
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    Objects.requireNonNull(paramCollection);
    try
    {
      boolean bool = super.retainAll(paramCollection);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      int i = paramCollection.size();
      if (i < 3)
      {
        zzfqo.zza(i, "expectedSize");
        i++;
      }
      else if (i < 1073741824)
      {
        i = (int)Math.ceil(i / 0.75D);
      }
      else
      {
        i = Integer.MAX_VALUE;
      }
      HashSet localHashSet = new HashSet(i);
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        paramCollection = localIterator.next();
        if ((contains(paramCollection)) && ((paramCollection instanceof Map.Entry))) {
          localHashSet.add(((Map.Entry)paramCollection).getKey());
        }
      }
      return zza().keySet().retainAll(localHashSet);
    }
  }
  
  public final int size()
  {
    return zza().size();
  }
  
  abstract Map zza();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfsi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */