package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

public final class zzag
{
  static int zza(Set paramSet)
  {
    Iterator localIterator = paramSet.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      paramSet = localIterator.next();
      int j;
      if (paramSet != null) {
        j = paramSet.hashCode();
      } else {
        j = 0;
      }
      i += j;
    }
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */