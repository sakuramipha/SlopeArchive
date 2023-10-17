package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzmn
  implements Iterator<Object>
{
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
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */