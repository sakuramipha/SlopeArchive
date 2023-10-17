package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import java.util.Map;

final class zabt
  implements Runnable
{
  final zabu zab;
  
  zabt(zabu paramzabu, ConnectionResult paramConnectionResult) {}
  
  public final void run()
  {
    Object localObject = this.zab;
    localObject = (zabq)GoogleApiManager.zat(((zabu)localObject).zaa).get(zabu.zab((zabu)localObject));
    if (localObject == null) {
      return;
    }
    if (this.zaa.isSuccess())
    {
      zabu.zac(this.zab, true);
      if (zabu.zaa(this.zab).requiresSignIn())
      {
        zabu.zad(this.zab);
        return;
      }
      try
      {
        zabu localzabu = this.zab;
        zabu.zaa(localzabu).getRemoteService(null, zabu.zaa(localzabu).getScopesForConnectionlessNonSignIn());
        return;
      }
      catch (SecurityException localSecurityException)
      {
        Log.e("GoogleApiManager", "Failed to get service from broker. ", localSecurityException);
        zabu.zaa(this.zab).disconnect("Failed to get service from broker.");
        ((zabq)localObject).zar(new ConnectionResult(10), null);
        return;
      }
    }
    ((zabq)localObject).zar(this.zaa, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */