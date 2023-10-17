package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzmq
  implements Iterator<Map.Entry<K, V>>
{
  private int pos = -1;
  private Iterator<Map.Entry<K, V>> zzvj;
  private final zzmi zzvk;
  private boolean zzvo;
  
  private zzmq(zzmi paramzzmi) {}
  
  private final Iterator<Map.Entry<K, V>> zzew()
  {
    if (this.zzvj == null) {
      this.zzvj = zzmi.zzc(this.zzvk).entrySet().iterator();
    }
    return this.zzvj;
  }
  
  public final boolean hasNext()
  {
    return (this.pos + 1 < zzmi.zzb(this.zzvk).size()) || ((!zzmi.zzc(this.zzvk).isEmpty()) && (zzew().hasNext()));
  }
  
  public final void remove()
  {
    if (this.zzvo)
    {
      this.zzvo = false;
      zzmi.zza(this.zzvk);
      if (this.pos < zzmi.zzb(this.zzvk).size())
      {
        zzmi localzzmi = this.zzvk;
        int i = this.pos;
        this.pos = (i - 1);
        zzmi.zza(localzzmi, i);
        return;
      }
      zzew().remove();
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */