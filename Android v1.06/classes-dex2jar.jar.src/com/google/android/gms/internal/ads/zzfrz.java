package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzfrz
  extends zzftr
{
  boolean zza;
  final Object zzb;
  
  zzfrz(Object paramObject) {}
  
  public final boolean hasNext()
  {
    return !this.zza;
  }
  
  public final Object next()
  {
    if (!this.zza)
    {
      this.zza = true;
      return this.zzb;
    }
    throw new NoSuchElementException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */