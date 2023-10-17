package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;

abstract class zzz<E>
  extends zzak<E>
{
  private final int zza;
  private int zzb;
  
  protected zzz(int paramInt1, int paramInt2)
  {
    zzs.zzb(paramInt2, paramInt1, "index");
    this.zza = paramInt1;
    this.zzb = paramInt2;
  }
  
  public final boolean hasNext()
  {
    return this.zzb < this.zza;
  }
  
  public final boolean hasPrevious()
  {
    return this.zzb > 0;
  }
  
  public final E next()
  {
    if (hasNext())
    {
      int i = this.zzb;
      this.zzb = (i + 1);
      return (E)zza(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return this.zzb;
  }
  
  public final E previous()
  {
    if (hasPrevious())
    {
      int i = this.zzb - 1;
      this.zzb = i;
      return (E)zza(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return this.zzb - 1;
  }
  
  protected abstract E zza(int paramInt);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */