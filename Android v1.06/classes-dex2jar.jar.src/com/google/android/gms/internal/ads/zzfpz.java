package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import javax.annotation.CheckForNull;

final class zzfpz
  implements Iterator
{
  @CheckForNull
  Map.Entry zza;
  final zzfqa zzc;
  
  zzfpz(zzfqa paramzzfqa, Iterator paramIterator) {}
  
  public final boolean hasNext()
  {
    return this.zzb.hasNext();
  }
  
  public final Object next()
  {
    Map.Entry localEntry = (Map.Entry)this.zzb.next();
    this.zza = localEntry;
    return localEntry.getKey();
  }
  
  public final void remove()
  {
    boolean bool;
    if (this.zza != null) {
      bool = true;
    } else {
      bool = false;
    }
    zzfoz.zzi(bool, "no calls to next() since the last call to remove()");
    Collection localCollection = (Collection)this.zza.getValue();
    this.zzb.remove();
    zzfqk localzzfqk = this.zzc.zza;
    zzfqk.zzn(localzzfqk, zzfqk.zzd(localzzfqk) - localCollection.size());
    localCollection.clear();
    this.zza = null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */