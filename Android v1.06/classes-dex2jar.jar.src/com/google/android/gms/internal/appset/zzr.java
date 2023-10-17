package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.tasks.Task;

public final class zzr
  implements AppSetIdClient
{
  private final AppSetIdClient zza;
  private final AppSetIdClient zzb;
  
  public zzr(Context paramContext)
  {
    this.zza = new zzp(paramContext, localGoogleApiAvailabilityLight);
    this.zzb = zzl.zzc(paramContext);
  }
  
  public final Task<AppSetIdInfo> getAppSetIdInfo()
  {
    return this.zza.getAppSetIdInfo().continueWithTask(new zzq(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\appset\zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */