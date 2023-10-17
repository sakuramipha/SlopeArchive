package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;

final class zzo
  implements BaseImplementation.ResultHolder
{
  final BaseGmsClient.SignOutCallbacks zza;
  
  zzo(BaseGmsClient.SignOutCallbacks paramSignOutCallbacks) {}
  
  public final void setFailedResult(Status paramStatus)
  {
    this.zza.onSignOutComplete();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */