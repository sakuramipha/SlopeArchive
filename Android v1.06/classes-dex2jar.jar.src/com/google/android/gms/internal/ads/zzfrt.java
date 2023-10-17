package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

public final class zzfrt
{
  Object[] zza;
  int zzb;
  zzfrs zzc;
  
  public zzfrt()
  {
    this(4);
  }
  
  zzfrt(int paramInt)
  {
    this.zza = new Object[paramInt + paramInt];
    this.zzb = 0;
  }
  
  private final void zzd(int paramInt)
  {
    Object[] arrayOfObject = this.zza;
    int i = arrayOfObject.length;
    paramInt += paramInt;
    if (paramInt > i) {
      this.zza = Arrays.copyOf(arrayOfObject, zzfrl.zze(i, paramInt));
    }
  }
  
  public final zzfrt zza(Object paramObject1, Object paramObject2)
  {
    zzd(this.zzb + 1);
    zzfqo.zzb(paramObject1, paramObject2);
    Object[] arrayOfObject = this.zza;
    int i = this.zzb;
    int j = i + i;
    arrayOfObject[j] = paramObject1;
    arrayOfObject[(j + 1)] = paramObject2;
    this.zzb = (i + 1);
    return this;
  }
  
  public final zzfrt zzb(Iterable paramIterable)
  {
    if ((paramIterable instanceof Collection)) {
      zzd(this.zzb + paramIterable.size());
    }
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramIterable.next();
      zza(localEntry.getKey(), localEntry.getValue());
    }
    return this;
  }
  
  public final zzfru zzc()
  {
    zzfrs localzzfrs = this.zzc;
    if (localzzfrs == null)
    {
      zzftg localzzftg = zzftg.zzi(this.zzb, this.zza, this);
      localzzfrs = this.zzc;
      if (localzzfrs == null) {
        return localzzftg;
      }
      throw localzzfrs.zza();
    }
    throw localzzfrs.zza();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */