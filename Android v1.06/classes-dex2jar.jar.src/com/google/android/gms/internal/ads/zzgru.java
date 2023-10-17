package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzgru
  implements Iterator
{
  final Iterator zza;
  final zzgrv zzb;
  
  zzgru(zzgrv paramzzgrv)
  {
    this.zza = zzgrv.zza(paramzzgrv).iterator();
  }
  
  public final boolean hasNext()
  {
    return this.zza.hasNext();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */