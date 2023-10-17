package com.google.android.gms.internal.common;

import java.util.Iterator;

public final class zzad<E>
  extends zzaa<E>
{
  public zzad()
  {
    super(4);
  }
  
  zzad(int paramInt)
  {
    super(4);
  }
  
  public final zzad<E> zzb(E paramE)
  {
    super.zza(paramE);
    return this;
  }
  
  public final zzad<E> zzc(Iterator<? extends E> paramIterator)
  {
    while (paramIterator.hasNext()) {
      super.zza(paramIterator.next());
    }
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */