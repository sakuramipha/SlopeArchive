package com.google.android.gms.internal.drive;

import java.util.ListIterator;

final class zznb
  implements ListIterator<String>
{
  private ListIterator<String> zzvu;
  private final zzna zzvw;
  
  zznb(zzna paramzzna, int paramInt)
  {
    this.zzvu = zzna.zza(paramzzna).listIterator(paramInt);
  }
  
  public final boolean hasNext()
  {
    return this.zzvu.hasNext();
  }
  
  public final boolean hasPrevious()
  {
    return this.zzvu.hasPrevious();
  }
  
  public final int nextIndex()
  {
    return this.zzvu.nextIndex();
  }
  
  public final int previousIndex()
  {
    return this.zzvu.previousIndex();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zznb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */