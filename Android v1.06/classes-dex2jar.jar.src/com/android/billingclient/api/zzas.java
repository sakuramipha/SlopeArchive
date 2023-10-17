package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzf;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

final class zzas
  extends zzf
{
  final WeakReference zza;
  final ResultReceiver zzb;
  
  public final void zza(Bundle paramBundle)
    throws RemoteException
  {
    Object localObject = this.zzb;
    if (localObject == null)
    {
      zzb.zzo("BillingClient", "Unable to send result for in-app messaging");
      return;
    }
    if (paramBundle == null)
    {
      ((ResultReceiver)localObject).send(0, null);
      return;
    }
    localObject = (Activity)this.zza.get();
    PendingIntent localPendingIntent = (PendingIntent)paramBundle.getParcelable("KEY_LAUNCH_INTENT");
    if ((localObject != null) && (localPendingIntent != null)) {
      try
      {
        paramBundle = new android/content/Intent;
        paramBundle.<init>((Context)localObject, ProxyBillingActivity.class);
        paramBundle.putExtra("in_app_message_result_receiver", this.zzb);
        paramBundle.putExtra("IN_APP_MESSAGE_INTENT", localPendingIntent);
        ((Activity)localObject).startActivity(paramBundle);
        return;
      }
      catch (CancellationException paramBundle)
      {
        this.zzb.send(0, null);
        zzb.zzp("BillingClient", "Exception caught while launching intent for in-app messaging.", paramBundle);
        return;
      }
    }
    this.zzb.send(0, null);
    zzb.zzo("BillingClient", "Unable to launch intent for in-app messaging");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zzas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */