package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall.Builder;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.Task;

public final class zao
  extends GoogleApi<TelemetryLoggingOptions>
  implements TelemetryLoggingClient
{
  public static final int zab = 0;
  private static final Api.ClientKey<zap> zac;
  private static final Api.AbstractClientBuilder<zap, TelemetryLoggingOptions> zad;
  private static final Api<TelemetryLoggingOptions> zae;
  
  static
  {
    Api.ClientKey localClientKey = new Api.ClientKey();
    zac = localClientKey;
    zan localzan = new zan();
    zad = localzan;
    zae = new Api("ClientTelemetry.API", localzan, localClientKey);
  }
  
  public zao(Context paramContext, TelemetryLoggingOptions paramTelemetryLoggingOptions)
  {
    super(paramContext, zae, paramTelemetryLoggingOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
  }
  
  public final Task<Void> log(TelemetryData paramTelemetryData)
  {
    TaskApiCall.Builder localBuilder = TaskApiCall.builder();
    localBuilder.setFeatures(new Feature[] { zad.zaa });
    localBuilder.setAutoResolveMissingFeatures(false);
    localBuilder.run(new zam(paramTelemetryData));
    return doBestEffortWrite(localBuilder.build());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\service\zao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */