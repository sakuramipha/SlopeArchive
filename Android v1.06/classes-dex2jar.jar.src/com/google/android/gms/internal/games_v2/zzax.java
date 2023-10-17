package com.google.android.gms.internal.games_v2;

import android.app.Application;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.v2.resolution.zzb;
import com.google.android.gms.games.internal.zzg;
import java.util.concurrent.atomic.AtomicReference;

public final class zzax
{
  private static final AtomicReference zza = new AtomicReference();
  
  public static zzav zza(Application paramApplication)
  {
    AtomicReference localAtomicReference = zza;
    Object localObject = (zzav)localAtomicReference.get();
    if (localObject != null) {
      return (zzav)localObject;
    }
    localObject = zzq.zza();
    ((zzo)localObject).zza(9);
    ((zzo)localObject).zzb(paramApplication.getPackageName());
    localObject = ((zzo)localObject).zzc();
    zzg localzzg = zzg.zzb(paramApplication);
    paramApplication = new zzbl(paramApplication, localzzg, zzb.zza(), new zzbp(paramApplication, localzzg, new zzaw(paramApplication, (zzq)localObject), null), null);
    while ((!localAtomicReference.compareAndSet(null, paramApplication)) && (localAtomicReference.get() == null)) {}
    return (zzav)Preconditions.checkNotNull((zzav)zza.get());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */