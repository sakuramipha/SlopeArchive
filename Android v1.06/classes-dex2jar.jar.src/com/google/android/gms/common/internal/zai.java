package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;

final class zai
  implements BaseGmsClient.BaseOnConnectionFailedListener
{
  final OnConnectionFailedListener zaa;
  
  zai(OnConnectionFailedListener paramOnConnectionFailedListener) {}
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.zaa.onConnectionFailed(paramConnectionResult);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */