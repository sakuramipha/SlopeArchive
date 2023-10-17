package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class zzgdq
{
  private static final zzgdq zza = new zzgdq();
  private static final zzgdp zzb = new zzgdp(null);
  private final AtomicReference zzc = new AtomicReference();
  
  public static zzgdq zza()
  {
    return zza;
  }
  
  public final zzggz zzb()
  {
    zzggz localzzggz = (zzggz)this.zzc.get();
    Object localObject = localzzggz;
    if (localzzggz == null) {
      localObject = zzb;
    }
    return (zzggz)localObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgdq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */