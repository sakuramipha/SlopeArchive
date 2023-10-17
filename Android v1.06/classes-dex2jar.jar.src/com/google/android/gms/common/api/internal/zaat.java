package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;
import java.util.concurrent.locks.Lock;

final class zaat
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  final zaaw zaa;
  
  public final void onConnected(Bundle paramBundle)
  {
    paramBundle = (ClientSettings)Preconditions.checkNotNull(zaaw.zal(this.zaa));
    ((zae)Preconditions.checkNotNull(zaaw.zan(this.zaa))).zad(new zaar(this.zaa));
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zaaw.zap(this.zaa).lock();
    try
    {
      if (zaaw.zay(this.zaa, paramConnectionResult))
      {
        zaaw.zaq(this.zaa);
        zaaw.zau(this.zaa);
      }
      else
      {
        zaaw.zas(this.zaa, paramConnectionResult);
      }
      return;
    }
    finally
    {
      zaaw.zap(this.zaa).unlock();
    }
  }
  
  public final void onConnectionSuspended(int paramInt) {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zaat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */