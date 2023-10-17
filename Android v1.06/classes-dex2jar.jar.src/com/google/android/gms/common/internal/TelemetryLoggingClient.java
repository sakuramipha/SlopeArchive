package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

public abstract interface TelemetryLoggingClient
  extends HasApiKey<TelemetryLoggingOptions>
{
  public abstract Task<Void> log(TelemetryData paramTelemetryData);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\TelemetryLoggingClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */