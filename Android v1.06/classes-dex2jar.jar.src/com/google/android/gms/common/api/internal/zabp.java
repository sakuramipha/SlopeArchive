package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;

final class zabp
  implements BaseGmsClient.SignOutCallbacks
{
  final zabq zaa;
  
  zabp(zabq paramzabq) {}
  
  public final void onSignOutComplete()
  {
    GoogleApiManager.zaf(this.zaa.zaa).post(new zabo(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */