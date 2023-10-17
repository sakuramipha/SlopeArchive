package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzdw
  extends zzdt
{
  final zzed zzc;
  
  zzdw(zzed paramzzed, Bundle paramBundle, Activity paramActivity)
  {
    super(paramzzed.zza, true);
  }
  
  final void zza()
    throws RemoteException
  {
    Bundle localBundle1;
    if (this.zza != null)
    {
      Bundle localBundle2 = new Bundle();
      localBundle1 = localBundle2;
      if (this.zza.containsKey("com.google.app_measurement.screen_service"))
      {
        Object localObject = this.zza.get("com.google.app_measurement.screen_service");
        localBundle1 = localBundle2;
        if ((localObject instanceof Bundle))
        {
          localBundle2.putBundle("com.google.app_measurement.screen_service", (Bundle)localObject);
          localBundle1 = localBundle2;
        }
      }
    }
    else
    {
      localBundle1 = null;
    }
    ((zzcc)Preconditions.checkNotNull(zzee.zze(this.zzc.zza))).onActivityCreated(ObjectWrapper.wrap(this.zzb), localBundle1, this.zzi);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */