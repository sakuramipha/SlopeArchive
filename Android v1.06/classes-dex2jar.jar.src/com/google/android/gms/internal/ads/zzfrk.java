package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

class zzfrk
  extends zzfrl
{
  Object[] zza;
  int zzb;
  boolean zzc;
  
  zzfrk(int paramInt)
  {
    this.zza = new Object[paramInt];
    this.zzb = 0;
  }
  
  private final void zzf(int paramInt)
  {
    Object[] arrayOfObject = this.zza;
    int i = arrayOfObject.length;
    if (i < paramInt)
    {
      this.zza = Arrays.copyOf(arrayOfObject, zze(i, paramInt));
      this.zzc = false;
      return;
    }
    if (this.zzc)
    {
      this.zza = ((Object[])arrayOfObject.clone());
      this.zzc = false;
    }
  }
  
  public final zzfrk zza(Object paramObject)
  {
    Objects.requireNonNull(paramObject);
    zzf(this.zzb + 1);
    Object[] arrayOfObject = this.zza;
    int i = this.zzb;
    this.zzb = (i + 1);
    arrayOfObject[i] = paramObject;
    return this;
  }
  
  public final zzfrl zzc(Iterable paramIterable)
  {
    if ((paramIterable instanceof Collection))
    {
      Collection localCollection = (Collection)paramIterable;
      zzf(this.zzb + localCollection.size());
      if ((localCollection instanceof zzfrm))
      {
        this.zzb = ((zzfrm)localCollection).zza(this.zza, this.zzb);
        return this;
      }
    }
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      zzb(paramIterable.next());
    }
    return this;
  }
  
  final void zzd(Object[] paramArrayOfObject, int paramInt)
  {
    zzfsz.zzb(paramArrayOfObject, 2);
    zzf(this.zzb + 2);
    System.arraycopy(paramArrayOfObject, 0, this.zza, this.zzb, 2);
    this.zzb += 2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */