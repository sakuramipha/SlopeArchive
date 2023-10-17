package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzna
  extends AbstractList<String>
  implements zzkz, RandomAccess
{
  private final zzkz zzvt;
  
  public zzna(zzkz paramzzkz)
  {
    this.zzvt = paramzzkz;
  }
  
  public final Iterator<String> iterator()
  {
    return new zznc(this);
  }
  
  public final ListIterator<String> listIterator(int paramInt)
  {
    return new zznb(this, paramInt);
  }
  
  public final int size()
  {
    return this.zzvt.size();
  }
  
  public final Object zzao(int paramInt)
  {
    return this.zzvt.zzao(paramInt);
  }
  
  public final List<?> zzdr()
  {
    return this.zzvt.zzdr();
  }
  
  public final zzkz zzds()
  {
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */