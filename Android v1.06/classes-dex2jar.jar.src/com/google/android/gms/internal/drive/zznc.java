package com.google.android.gms.internal.drive;

import java.util.Iterator;

final class zznc
  implements Iterator<String>
{
  private final zzna zzvw;
  private Iterator<String> zzvx;
  
  zznc(zzna paramzzna)
  {
    this.zzvx = zzna.zza(paramzzna).iterator();
  }
  
  public final boolean hasNext()
  {
    return this.zzvx.hasNext();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zznc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */