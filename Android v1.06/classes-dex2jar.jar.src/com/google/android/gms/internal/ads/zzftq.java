package com.google.android.gms.internal.ads;

import java.util.ListIterator;

abstract class zzftq
  extends zzftp
  implements ListIterator
{
  zzftq(ListIterator paramListIterator)
  {
    super(paramListIterator);
  }
  
  public final void add(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean hasPrevious()
  {
    return ((ListIterator)this.zzb).hasPrevious();
  }
  
  public final int nextIndex()
  {
    return ((ListIterator)this.zzb).nextIndex();
  }
  
  public final Object previous()
  {
    return zza(((ListIterator)this.zzb).previous());
  }
  
  public final int previousIndex()
  {
    return ((ListIterator)this.zzb).previousIndex();
  }
  
  public final void set(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzftq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */