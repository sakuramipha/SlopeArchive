package com.google.android.gms.common;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;

final class zac
  extends zaq
{
  final GoogleApiAvailability zaa;
  private final Context zab;
  
  public zac(GoogleApiAvailability paramGoogleApiAvailability, Context paramContext)
  {
    super(paramGoogleApiAvailability);
    this.zab = paramContext.getApplicationContext();
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what != 1)
    {
      i = paramMessage.what;
      paramMessage = new StringBuilder(50);
      paramMessage.append("Don't know how to handle this message: ");
      paramMessage.append(i);
      Log.w("GoogleApiAvailability", paramMessage.toString());
      return;
    }
    int i = this.zaa.isGooglePlayServicesAvailable(this.zab);
    if (this.zaa.isUserResolvableError(i)) {
      this.zaa.showErrorNotification(this.zab, i);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\zac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */