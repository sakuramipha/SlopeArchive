package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class zzfsb
{
  @CheckForNull
  static Object zza(Iterator paramIterator)
  {
    if (paramIterator.hasNext())
    {
      Object localObject = paramIterator.next();
      paramIterator.remove();
      return localObject;
    }
    return null;
  }
  
  static void zzb(Iterator paramIterator)
  {
    Objects.requireNonNull(paramIterator);
    while (paramIterator.hasNext())
    {
      paramIterator.next();
      paramIterator.remove();
    }
  }
  
  public static boolean zzc(Collection paramCollection, Iterator paramIterator)
  {
    boolean bool = false;
    while (paramIterator.hasNext()) {
      bool |= paramCollection.add(paramIterator.next());
    }
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */