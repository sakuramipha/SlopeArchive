package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

final class zzmo
  implements ListIterator
{
  final ListIterator zza;
  final zzmq zzc;
  
  zzmo(zzmq paramzzmq, int paramInt)
  {
    this.zza = zzmq.zza(paramzzmq).listIterator(paramInt);
  }
  
  public final boolean hasNext()
  {
    return this.zza.hasNext();
  }
  
  public final boolean hasPrevious()
  {
    return this.zza.hasPrevious();
  }
  
  public final int nextIndex()
  {
    return this.zza.nextIndex();
  }
  
  public final int previousIndex()
  {
    return this.zza.previousIndex();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */