package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

 enum zzfsa
  implements Iterator
{
  private static final zzfsa[] zzb;
  
  static
  {
    zzfsa localzzfsa = new zzfsa("INSTANCE", 0);
    zza = localzzfsa;
    zzb = new zzfsa[] { localzzfsa };
  }
  
  public final boolean hasNext()
  {
    return false;
  }
  
  public final Object next()
  {
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    zzfoz.zzi(false, "no calls to next() since the last call to remove()");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */