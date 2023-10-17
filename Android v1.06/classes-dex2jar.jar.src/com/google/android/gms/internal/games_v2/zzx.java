package com.google.android.gms.internal.games_v2;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzx
  extends GmsClient
{
  private final zzq zze;
  
  public zzx(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, zzq paramzzq, ConnectionCallbacks paramConnectionCallbacks, OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 1, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zze = paramzzq;
  }
  
  protected final Bundle getGetServiceRequestExtraArgs()
  {
    zzq localzzq = this.zze;
    Bundle localBundle = new Bundle();
    localBundle.putInt("com.google.android.gms.games.key.API_VERSION", localzzq.zza);
    localBundle.putString("com.google.android.gms.games.key.gamePackageName", localzzq.zzb);
    return localBundle;
  }
  
  public final int getMinApkVersion()
  {
    return 213000000;
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.games.internal.connect.IGamesConnectService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.games.internal.connect.service.START";
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */