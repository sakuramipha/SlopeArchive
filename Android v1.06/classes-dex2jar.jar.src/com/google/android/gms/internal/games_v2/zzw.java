package com.google.android.gms.internal.games_v2;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall.Builder;
import com.google.android.gms.tasks.Task;

final class zzw
  extends GoogleApi
  implements zzs
{
  private static final Api.ClientKey zza;
  private static final Api.AbstractClientBuilder zzb;
  private static final Api zzc;
  
  static
  {
    Api.ClientKey localClientKey = new Api.ClientKey();
    zza = localClientKey;
    zzu localzzu = new zzu();
    zzb = localzzu;
    zzc = new Api("GamesConnect.API", localzzu, localClientKey);
  }
  
  zzw(Context paramContext, zzq paramzzq)
  {
    super(paramContext, zzc, paramzzq, GoogleApi.Settings.DEFAULT_SETTINGS);
  }
  
  public final Task zza(zzy paramzzy, boolean paramBoolean)
  {
    paramzzy = TaskApiCall.builder().run(new zzt(this, paramzzy)).setMethodKey(6737).setAutoResolveMissingFeatures(paramBoolean).build();
    if (paramBoolean) {
      return doWrite(paramzzy);
    }
    return doBestEffortWrite(paramzzy);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */