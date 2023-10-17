package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class zzgrt
  implements ListIterator
{
  final ListIterator zza;
  final zzgrv zzc;
  
  zzgrt(zzgrv paramzzgrv, int paramInt)
  {
    this.zza = zzgrv.zza(paramzzgrv).listIterator(paramInt);
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgrt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */