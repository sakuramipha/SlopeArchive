package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzb;

final class zzal
  extends ResultReceiver
{
  zzal(BillingClientImpl paramBillingClientImpl, Handler paramHandler, InAppMessageResponseListener paramInAppMessageResponseListener)
  {
    super(paramHandler);
  }
  
  public final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    this.zza.onInAppMessageResponse(zzb.zzj(paramBundle, "BillingClient"));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zzal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */