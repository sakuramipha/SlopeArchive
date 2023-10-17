package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall.Builder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public final class zzp
  extends GoogleApi<Api.ApiOptions.NoOptions>
  implements AppSetIdClient
{
  private static final Api.ClientKey<zzd> zza;
  private static final Api.AbstractClientBuilder<zzd, Api.ApiOptions.NoOptions> zzb;
  private static final Api<Api.ApiOptions.NoOptions> zzc;
  private final Context zzd;
  private final GoogleApiAvailabilityLight zze;
  
  static
  {
    Api.ClientKey localClientKey = new Api.ClientKey();
    zza = localClientKey;
    zzn localzzn = new zzn();
    zzb = localzzn;
    zzc = new Api("AppSet.API", localzzn, localClientKey);
  }
  
  zzp(Context paramContext, GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight)
  {
    super(paramContext, zzc, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    this.zzd = paramContext;
    this.zze = paramGoogleApiAvailabilityLight;
  }
  
  public final Task<AppSetIdInfo> getAppSetIdInfo()
  {
    if (this.zze.isGooglePlayServicesAvailable(this.zzd, 212800000) == 0) {
      return doRead(TaskApiCall.builder().setFeatures(new Feature[] { zze.zza }).run(new zzm(this)).setAutoResolveMissingFeatures(false).setMethodKey(27601).build());
    }
    return Tasks.forException(new ApiException(new Status(17)));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\appset\zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */