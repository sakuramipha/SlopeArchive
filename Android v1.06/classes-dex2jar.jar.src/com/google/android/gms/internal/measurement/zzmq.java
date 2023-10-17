package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzmq
  extends AbstractList
  implements RandomAccess, zzkr
{
  private final zzkr zza;
  
  public zzmq(zzkr paramzzkr)
  {
    this.zza = paramzzkr;
  }
  
  public final Iterator iterator()
  {
    return new zzmp(this);
  }
  
  public final ListIterator listIterator(int paramInt)
  {
    return new zzmo(this, paramInt);
  }
  
  public final int size()
  {
    return this.zza.size();
  }
  
  public final zzkr zze()
  {
    return this;
  }
  
  public final Object zzf(int paramInt)
  {
    return this.zza.zzf(paramInt);
  }
  
  public final List zzh()
  {
    return this.zza.zzh();
  }
  
  public final void zzi(zzjb paramzzjb)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */