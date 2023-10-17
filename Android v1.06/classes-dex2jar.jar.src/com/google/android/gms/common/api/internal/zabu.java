package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Map;
import java.util.Set;

final class zabu
  implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs
{
  final GoogleApiManager zaa;
  private final Api.Client zab;
  private final ApiKey<?> zac;
  private IAccountAccessor zad = null;
  private Set<Scope> zae = null;
  private boolean zaf = false;
  
  public zabu(Api.Client paramClient, ApiKey<?> paramApiKey)
  {
    this.zab = paramApiKey;
    ApiKey localApiKey;
    this.zac = localApiKey;
  }
  
  private final void zag()
  {
    if (this.zaf)
    {
      IAccountAccessor localIAccountAccessor = this.zad;
      if (localIAccountAccessor != null) {
        this.zab.getRemoteService(localIAccountAccessor, this.zae);
      }
    }
  }
  
  public final void onReportServiceBinding(ConnectionResult paramConnectionResult)
  {
    GoogleApiManager.zaf(this.zaa).post(new zabt(this, paramConnectionResult));
  }
  
  public final void zae(ConnectionResult paramConnectionResult)
  {
    zabq localzabq = (zabq)GoogleApiManager.zat(this.zaa).get(this.zac);
    if (localzabq != null) {
      localzabq.zas(paramConnectionResult);
    }
  }
  
  public final void zaf(IAccountAccessor paramIAccountAccessor, Set<Scope> paramSet)
  {
    if ((paramIAccountAccessor != null) && (paramSet != null))
    {
      this.zad = paramIAccountAccessor;
      this.zae = paramSet;
      zag();
      return;
    }
    Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
    zae(new ConnectionResult(4));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */