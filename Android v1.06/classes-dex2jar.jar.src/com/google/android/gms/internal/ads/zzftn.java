package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

public final class zzftn
{
  static int zza(Set paramSet)
  {
    paramSet = paramSet.iterator();
    int i = 0;
    while (paramSet.hasNext())
    {
      Object localObject = paramSet.next();
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      i += j;
    }
    return i;
  }
  
  public static Set zzb(Set paramSet, zzfpa paramzzfpa)
  {
    if ((paramSet instanceof SortedSet))
    {
      paramSet = (SortedSet)paramSet;
      if ((paramSet instanceof zzftk))
      {
        paramSet = (zzftk)paramSet;
        paramzzfpa = zzfpd.zza(paramSet.zzb, paramzzfpa);
        paramSet = new zzftl((SortedSet)paramSet.zza, paramzzfpa);
      }
      else
      {
        Objects.requireNonNull(paramSet);
        Objects.requireNonNull(paramzzfpa);
        paramSet = new zzftl(paramSet, paramzzfpa);
      }
      return paramSet;
    }
    if ((paramSet instanceof zzftk))
    {
      paramSet = (zzftk)paramSet;
      paramzzfpa = zzfpd.zza(paramSet.zzb, paramzzfpa);
      return new zzftk(paramSet.zza, paramzzfpa);
    }
    Objects.requireNonNull(paramSet);
    Objects.requireNonNull(paramzzfpa);
    return new zzftk(paramSet, paramzzfpa);
  }
  
  static boolean zzc(Set paramSet, @CheckForNull Object paramObject)
  {
    if (paramSet == paramObject) {
      return true;
    }
    if ((paramObject instanceof Set)) {
      paramObject = (Set)paramObject;
    }
    try
    {
      if (paramSet.size() == ((Set)paramObject).size())
      {
        boolean bool = paramSet.containsAll((Collection)paramObject);
        if (bool) {
          return true;
        }
      }
    }
    catch (NullPointerException|ClassCastException paramSet)
    {
      for (;;) {}
    }
    return false;
  }
  
  static boolean zzd(Set paramSet, Collection paramCollection)
  {
    Objects.requireNonNull(paramCollection);
    Object localObject = paramCollection;
    if ((paramCollection instanceof zzfsx)) {
      localObject = ((zzfsx)paramCollection).zza();
    }
    if (((localObject instanceof Set)) && (((Collection)localObject).size() > paramSet.size()))
    {
      paramSet = paramSet.iterator();
      Objects.requireNonNull(localObject);
      boolean bool = false;
      while (paramSet.hasNext()) {
        if (((Collection)localObject).contains(paramSet.next()))
        {
          paramSet.remove();
          bool = true;
        }
      }
      return bool;
    }
    return zze(paramSet, ((Collection)localObject).iterator());
  }
  
  static boolean zze(Set paramSet, Iterator paramIterator)
  {
    boolean bool = false;
    while (paramIterator.hasNext()) {
      bool |= paramSet.remove(paramIterator.next());
    }
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */