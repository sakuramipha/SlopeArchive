package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzfqw
  implements Iterator
{
  int zzb;
  int zzc;
  int zzd;
  final zzfra zze;
  
  private final void zzb()
  {
    if (zzfra.zza(this.zze) == this.zzb) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final boolean hasNext()
  {
    return this.zzc >= 0;
  }
  
  public final Object next()
  {
    zzb();
    if (hasNext())
    {
      int i = this.zzc;
      this.zzd = i;
      Object localObject = zza(i);
      this.zzc = this.zze.zzf(this.zzc);
      return localObject;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    zzb();
    boolean bool;
    if (this.zzd >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzfoz.zzi(bool, "no calls to next() since the last call to remove()");
    this.zzb += 32;
    zzfra localzzfra = this.zze;
    int i = this.zzd;
    Object[] arrayOfObject = localzzfra.zzb;
    arrayOfObject.getClass();
    localzzfra.remove(arrayOfObject[i]);
    this.zzc -= 1;
    this.zzd = -1;
  }
  
  abstract Object zza(int paramInt);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfqw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */