package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class zzfqq
{
  static boolean zza(Collection paramCollection, @CheckForNull Object paramObject)
  {
    Objects.requireNonNull(paramCollection);
    try
    {
      boolean bool = paramCollection.contains(paramObject);
      return bool;
    }
    catch (ClassCastException|NullPointerException paramCollection) {}
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */