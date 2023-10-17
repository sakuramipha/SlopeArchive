package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzkw<K>
  implements Iterator<Map.Entry<K, Object>>
{
  private Iterator<Map.Entry<K, Object>> zztg;
  
  public zzkw(Iterator<Map.Entry<K, Object>> paramIterator)
  {
    this.zztg = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return this.zztg.hasNext();
  }
  
  public final void remove()
  {
    this.zztg.remove();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */