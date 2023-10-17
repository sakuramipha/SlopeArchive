package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzgqs
  extends zzgng
{
  final zzgqw zza;
  zzgni zzb;
  final zzgqy zzc;
  
  zzgqs(zzgqy paramzzgqy)
  {
    this.zza = new zzgqw(paramzzgqy, null);
    this.zzb = zzb();
  }
  
  private final zzgni zzb()
  {
    zzgqw localzzgqw = this.zza;
    if (localzzgqw.hasNext()) {
      return localzzgqw.zza().zzs();
    }
    return null;
  }
  
  public final boolean hasNext()
  {
    return this.zzb != null;
  }
  
  public final byte zza()
  {
    zzgni localzzgni = this.zzb;
    if (localzzgni != null)
    {
      byte b = localzzgni.zza();
      if (!this.zzb.hasNext()) {
        this.zzb = zzb();
      }
      return b;
    }
    throw new NoSuchElementException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */