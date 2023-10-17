package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.internal.base.zad;

public final class zap
  extends GmsClient<zai>
{
  private final TelemetryLoggingOptions zaa;
  
  public zap(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, TelemetryLoggingOptions paramTelemetryLoggingOptions, ConnectionCallbacks paramConnectionCallbacks, OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 270, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zaa = paramTelemetryLoggingOptions;
  }
  
  public final Feature[] getApiFeatures()
  {
    return zad.zab;
  }
  
  protected final Bundle getGetServiceRequestExtraArgs()
  {
    return this.zaa.zaa();
  }
  
  public final int getMinApkVersion()
  {
    return 203400000;
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.common.internal.service.IClientTelemetryService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.common.telemetry.service.START";
  }
  
  protected final boolean getUseDynamicLookup()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\service\zap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */