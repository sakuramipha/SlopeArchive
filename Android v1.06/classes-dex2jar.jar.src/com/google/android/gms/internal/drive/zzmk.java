package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzmk
  implements Iterator<Map.Entry<K, V>>
{
  private int pos;
  private Iterator<Map.Entry<K, V>> zzvj;
  private final zzmi zzvk;
  
  private zzmk(zzmi paramzzmi)
  {
    this.pos = zzmi.zzb(paramzzmi).size();
  }
  
  private final Iterator<Map.Entry<K, V>> zzew()
  {
    if (this.zzvj == null) {
      this.zzvj = zzmi.zzd(this.zzvk).entrySet().iterator();
    }
    return this.zzvj;
  }
  
  public final boolean hasNext()
  {
    int i = this.pos;
    return ((i > 0) && (i <= zzmi.zzb(this.zzvk).size())) || (zzew().hasNext());
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */