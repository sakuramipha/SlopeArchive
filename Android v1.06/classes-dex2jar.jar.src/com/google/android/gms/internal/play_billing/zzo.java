package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

abstract class zzo
  extends zzai
{
  private final int zza;
  private int zzb;
  
  protected zzo(int paramInt1, int paramInt2)
  {
    zzm.zzb(paramInt2, paramInt1, "index");
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
  
  public final Object next()
  {
    if (hasNext())
    {
      int i = this.zzb;
      this.zzb = (i + 1);
      return zza(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return this.zzb;
  }
  
  public final Object previous()
  {
    if (hasPrevious())
    {
      int i = this.zzb - 1;
      this.zzb = i;
      return zza(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return this.zzb - 1;
  }
  
  protected abstract Object zza(int paramInt);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */