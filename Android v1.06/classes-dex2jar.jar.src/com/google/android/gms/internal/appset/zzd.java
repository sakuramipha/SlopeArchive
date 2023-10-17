package com.google.android.gms.internal.appset;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzd
  extends GmsClient<zzg>
{
  protected zzd(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, ConnectionCallbacks paramConnectionCallbacks, OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 300, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  public final Feature[] getApiFeatures()
  {
    return zze.zzb;
  }
  
  public final int getMinApkVersion()
  {
    return 212800000;
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.appset.internal.IAppSetService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.appset.service.START";
  }
  
  protected final boolean getUseDynamicLookup()
  {
    return true;
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\appset\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */