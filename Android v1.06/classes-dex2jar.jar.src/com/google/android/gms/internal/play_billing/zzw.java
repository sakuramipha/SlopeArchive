package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

public final class zzw
{
  Object[] zza = new Object[8];
  int zzb = 0;
  zzv zzc;
  
  public final zzw zza(Object paramObject1, Object paramObject2)
  {
    int j = this.zzb + 1;
    Object[] arrayOfObject = this.zza;
    int i = arrayOfObject.length;
    int k = j + j;
    if (k > i)
    {
      j = i + (i >> 1) + 1;
      i = j;
      if (j < k)
      {
        i = Integer.highestOneBit(k - 1);
        i += i;
      }
      j = i;
      if (i < 0) {
        j = Integer.MAX_VALUE;
      }
      this.zza = Arrays.copyOf(arrayOfObject, j);
    }
    zzp.zza(paramObject1, paramObject2);
    arrayOfObject = this.zza;
    j = this.zzb;
    i = j + j;
    arrayOfObject[i] = paramObject1;
    arrayOfObject[(i + 1)] = paramObject2;
    this.zzb = (j + 1);
    return this;
  }
  
  public final zzx zzb()
  {
    Object localObject = this.zzc;
    if (localObject == null)
    {
      localObject = zzaf.zzf(this.zzb, this.zza, this);
      zzv localzzv = this.zzc;
      if (localzzv == null) {
        return (zzx)localObject;
      }
      throw localzzv.zza();
    }
    throw ((zzv)localObject).zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */