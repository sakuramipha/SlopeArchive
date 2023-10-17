package com.google.android.gms.common.internal;

import android.content.Context;
import com.google.android.gms.common.internal.service.zao;

public class TelemetryLogging
{
  public static TelemetryLoggingClient getClient(Context paramContext)
  {
    return getClient(paramContext, TelemetryLoggingOptions.zaa);
  }
  
  public static TelemetryLoggingClient getClient(Context paramContext, TelemetryLoggingOptions paramTelemetryLoggingOptions)
  {
    return new zao(paramContext, paramTelemetryLoggingOptions);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\TelemetryLogging.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */