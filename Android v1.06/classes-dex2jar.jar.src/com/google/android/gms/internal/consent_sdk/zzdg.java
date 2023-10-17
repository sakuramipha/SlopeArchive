package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

final class zzdg
  extends zzdk
{
  boolean zza;
  final Object zzb;
  
  zzdg(Object paramObject) {}
  
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzdg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */