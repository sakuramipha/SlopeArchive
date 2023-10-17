package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

abstract class zzftp
  implements Iterator
{
  final Iterator zzb;
  
  zzftp(Iterator paramIterator)
  {
    Objects.requireNonNull(paramIterator);
    this.zzb = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return this.zzb.hasNext();
  }
  
  public final Object next()
  {
    return zza(this.zzb.next());
  }
  
  public final void remove()
  {
    this.zzb.remove();
  }
  
  abstract Object zza(Object paramObject);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */