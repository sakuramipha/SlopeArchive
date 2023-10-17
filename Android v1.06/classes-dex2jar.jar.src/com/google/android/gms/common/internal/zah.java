package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;

final class zah
  implements BaseGmsClient.BaseConnectionCallbacks
{
  final ConnectionCallbacks zaa;
  
  zah(ConnectionCallbacks paramConnectionCallbacks) {}
  
  public final void onConnected(Bundle paramBundle)
  {
    this.zaa.onConnected(paramBundle);
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    this.zaa.onConnectionSuspended(paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */