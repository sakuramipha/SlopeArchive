package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzb;

final class zzai
  extends ResultReceiver
{
  zzai(BillingClientImpl paramBillingClientImpl, Handler paramHandler, PriceChangeConfirmationListener paramPriceChangeConfirmationListener)
  {
    super(paramHandler);
  }
  
  public final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    BillingResult.Builder localBuilder = BillingResult.newBuilder();
    localBuilder.setResponseCode(paramInt);
    localBuilder.setDebugMessage(zzb.zzk(paramBundle, "BillingClient"));
    paramBundle = localBuilder.build();
    this.zza.onPriceChangeConfirmationResult(paramBundle);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zzai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */