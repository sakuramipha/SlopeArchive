package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

final class zzfqm
  extends AbstractCollection
{
  final zzfqn zza;
  
  zzfqm(zzfqn paramzzfqn) {}
  
  public final void clear()
  {
    this.zza.zzp();
  }
  
  public final boolean contains(@CheckForNull Object paramObject)
  {
    Iterator localIterator = this.zza.zzs().values().iterator();
    while (localIterator.hasNext()) {
      if (((Collection)localIterator.next()).contains(paramObject)) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final Iterator iterator()
  {
    return this.zza.zzg();
  }
  
  public final int size()
  {
    return this.zza.zze();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */