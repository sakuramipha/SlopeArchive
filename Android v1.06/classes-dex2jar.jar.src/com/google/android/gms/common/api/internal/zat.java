package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;

public final class zat
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  public final Api<?> zaa;
  private final boolean zab;
  private zau zac;
  
  public zat(Api<?> paramApi, boolean paramBoolean)
  {
    this.zaa = paramApi;
    this.zab = paramBoolean;
  }
  
  private final zau zab()
  {
    Preconditions.checkNotNull(this.zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    return this.zac;
  }
  
  public final void onConnected(Bundle paramBundle)
  {
    zab().onConnected(paramBundle);
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zab().zaa(paramConnectionResult, this.zaa, this.zab);
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    zab().onConnectionSuspended(paramInt);
  }
  
  public final void zaa(zau paramzau)
  {
    this.zac = paramzau;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */