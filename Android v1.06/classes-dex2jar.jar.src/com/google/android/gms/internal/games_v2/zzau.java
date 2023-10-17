package com.google.android.gms.internal.games_v2;

import android.app.Application;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

public final class zzau
{
  private static final AtomicReference zza = new AtomicReference();
  private final zzat zzb;
  private final zzav zzc;
  
  zzau(Application paramApplication, zzav paramzzav)
  {
    this.zzb = new zzat(this, paramApplication, null);
    this.zzc = paramzzav;
  }
  
  static zzau zza(Application paramApplication)
  {
    AtomicReference localAtomicReference = zza;
    zzau localzzau = (zzau)localAtomicReference.get();
    if (localzzau != null) {
      return localzzau;
    }
    paramApplication = new zzau(paramApplication, zzax.zza(paramApplication));
    while ((!localAtomicReference.compareAndSet(null, paramApplication)) && (localAtomicReference.get() == null)) {}
    return (zzau)Preconditions.checkNotNull((zzau)zza.get());
  }
  
  public final void zzc()
  {
    zzez.zza("AutomaticGamesAuthenticator", "startWatching()");
    zzat.zza(this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */