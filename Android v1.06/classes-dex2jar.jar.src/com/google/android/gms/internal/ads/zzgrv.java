package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class zzgrv
  extends AbstractList
  implements RandomAccess, zzgpo
{
  private final zzgpo zza;
  
  public zzgrv(zzgpo paramzzgpo)
  {
    this.zza = paramzzgpo;
  }
  
  public final Iterator iterator()
  {
    return new zzgru(this);
  }
  
  public final ListIterator listIterator(int paramInt)
  {
    return new zzgrt(this, paramInt);
  }
  
  public final int size()
  {
    return this.zza.size();
  }
  
  public final zzgpo zze()
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
  
  public final void zzi(zzgno paramzzgno)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgrv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */