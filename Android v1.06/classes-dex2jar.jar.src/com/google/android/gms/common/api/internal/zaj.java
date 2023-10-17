package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

final class zaj
  implements GoogleApiClient.OnConnectionFailedListener
{
  public final int zaa;
  public final GoogleApiClient zab;
  public final GoogleApiClient.OnConnectionFailedListener zac;
  final zak zad;
  
  public zaj(zak paramzak, int paramInt, GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.zaa = paramInt;
    this.zab = paramGoogleApiClient;
    this.zac = paramOnConnectionFailedListener;
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    String str = String.valueOf(paramConnectionResult);
    String.valueOf(str).length();
    Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(str)));
    this.zad.zah(paramConnectionResult, this.zaa);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */