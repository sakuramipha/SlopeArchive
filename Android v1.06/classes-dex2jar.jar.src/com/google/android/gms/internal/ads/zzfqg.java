package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class zzfqg
  implements Iterator
{
  final Iterator zza;
  final Collection zzb;
  final zzfqh zzc;
  
  zzfqg(zzfqh paramzzfqh)
  {
    this.zzb = paramzzfqh.zzb;
    paramzzfqh = paramzzfqh.zzb;
    if ((paramzzfqh instanceof List)) {
      paramzzfqh = ((List)paramzzfqh).listIterator();
    } else {
      paramzzfqh = paramzzfqh.iterator();
    }
    this.zza = paramzzfqh;
  }
  
  zzfqg(zzfqh paramzzfqh, Iterator paramIterator)
  {
    this.zzb = paramzzfqh.zzb;
    this.zza = paramIterator;
  }
  
  public final boolean hasNext()
  {
    zza();
    return this.zza.hasNext();
  }
  
  public final Object next()
  {
    zza();
    return this.zza.next();
  }
  
  public final void remove()
  {
    this.zza.remove();
    zzfqk localzzfqk = this.zzc.zze;
    zzfqk.zzn(localzzfqk, zzfqk.zzd(localzzfqk) - 1);
    this.zzc.zzc();
  }
  
  final void zza()
  {
    this.zzc.zzb();
    if (this.zzc.zzb == this.zzb) {
      return;
    }
    throw new ConcurrentModificationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */