package com.google.android.gms.internal.common;

import java.util.Arrays;
import java.util.Objects;

class zzaa<E>
  extends zzab<E>
{
  Object[] zza = new Object[4];
  int zzb = 0;
  boolean zzc;
  
  zzaa(int paramInt) {}
  
  private final void zzb(int paramInt)
  {
    Object[] arrayOfObject = this.zza;
    int i = arrayOfObject.length;
    if (i < paramInt)
    {
      int j = i + (i >> 1) + 1;
      i = j;
      if (j < paramInt)
      {
        paramInt = Integer.highestOneBit(paramInt - 1);
        i = paramInt + paramInt;
      }
      paramInt = i;
      if (i < 0) {
        paramInt = Integer.MAX_VALUE;
      }
      this.zza = Arrays.copyOf(arrayOfObject, paramInt);
      this.zzc = false;
      return;
    }
    if (this.zzc)
    {
      this.zza = ((Object[])arrayOfObject.clone());
      this.zzc = false;
    }
  }
  
  public final zzaa<E> zza(E paramE)
  {
    Objects.requireNonNull(paramE);
    zzb(this.zzb + 1);
    Object[] arrayOfObject = this.zza;
    int i = this.zzb;
    this.zzb = (i + 1);
    arrayOfObject[i] = paramE;
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */