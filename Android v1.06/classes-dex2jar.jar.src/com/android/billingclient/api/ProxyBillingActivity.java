package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzb;

public class ProxyBillingActivity
  extends Activity
{
  static final String KEY_IN_APP_MESSAGE_RESULT_RECEIVER = "in_app_message_result_receiver";
  static final String KEY_PRICE_CHANGE_RESULT_RECEIVER = "result_receiver";
  private static final String KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED = "send_cancelled_broadcast_if_finished";
  private static final int REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW = 110;
  private static final int REQUEST_CODE_IN_APP_MESSAGE_FLOW = 101;
  private static final int REQUEST_CODE_LAUNCH_ACTIVITY = 100;
  private static final String TAG = "ProxyBillingActivity";
  private ResultReceiver inAppMessageResultReceiver;
  private boolean isFlowFromFirstPartyClient;
  private ResultReceiver priceChangeResultReceiver;
  private boolean sendCancelledBroadcastIfFinished;
  
  private Intent makeAlternativeBillingIntent(String paramString)
  {
    Intent localIntent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
    localIntent.setPackage(getApplicationContext().getPackageName());
    localIntent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", paramString);
    return localIntent;
  }
  
  private Intent makePurchasesUpdatedIntent()
  {
    Intent localIntent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
    localIntent.setPackage(getApplicationContext().getPackageName());
    return localIntent;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject1 = null;
    Object localObject2 = null;
    if ((paramInt1 != 100) && (paramInt1 != 110))
    {
      if (paramInt1 == 101)
      {
        paramInt1 = zzb.zza(paramIntent, "ProxyBillingActivity");
        localObject1 = this.inAppMessageResultReceiver;
        if (localObject1 != null)
        {
          if (paramIntent == null) {
            paramIntent = (Intent)localObject2;
          } else {
            paramIntent = paramIntent.getExtras();
          }
          ((ResultReceiver)localObject1).send(paramInt1, paramIntent);
        }
      }
      else
      {
        paramIntent = new StringBuilder();
        paramIntent.append("Got onActivityResult with wrong requestCode: ");
        paramIntent.append(paramInt1);
        paramIntent.append("; skipping...");
        zzb.zzo("ProxyBillingActivity", paramIntent.toString());
      }
    }
    else
    {
      int j = zzb.zzi(paramIntent, "ProxyBillingActivity").getResponseCode();
      int i = paramInt2;
      if (paramInt2 == -1) {
        if (j != 0)
        {
          i = -1;
        }
        else
        {
          paramInt2 = 0;
          break label206;
        }
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Activity finished with resultCode ");
      ((StringBuilder)localObject2).append(i);
      ((StringBuilder)localObject2).append(" and billing's responseCode: ");
      ((StringBuilder)localObject2).append(j);
      zzb.zzo("ProxyBillingActivity", ((StringBuilder)localObject2).toString());
      paramInt2 = j;
      label206:
      localObject2 = this.priceChangeResultReceiver;
      if (localObject2 != null)
      {
        if (paramIntent == null) {
          paramIntent = (Intent)localObject1;
        } else {
          paramIntent = paramIntent.getExtras();
        }
        ((ResultReceiver)localObject2).send(paramInt2, paramIntent);
      }
      else
      {
        if (paramIntent != null)
        {
          if (paramIntent.getExtras() != null)
          {
            localObject1 = paramIntent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (localObject1 != null)
            {
              paramIntent = makeAlternativeBillingIntent((String)localObject1);
            }
            else
            {
              localObject1 = makePurchasesUpdatedIntent();
              ((Intent)localObject1).putExtras(paramIntent.getExtras());
              paramIntent = (Intent)localObject1;
            }
          }
          else
          {
            paramIntent = makePurchasesUpdatedIntent();
            zzb.zzo("ProxyBillingActivity", "Got null bundle!");
            paramIntent.putExtra("RESPONSE_CODE", 6);
            paramIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
          }
        }
        else {
          paramIntent = makePurchasesUpdatedIntent();
        }
        if (paramInt1 == 110) {
          paramIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
        }
        sendBroadcast(paramIntent);
      }
    }
    this.sendCancelledBroadcastIfFinished = false;
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      zzb.zzn("ProxyBillingActivity", "Launching Play Store billing flow");
      Object localObject;
      int i;
      if (getIntent().hasExtra("BUY_INTENT"))
      {
        localObject = (PendingIntent)getIntent().getParcelableExtra("BUY_INTENT");
        paramBundle = (Bundle)localObject;
        if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT"))
        {
          paramBundle = (Bundle)localObject;
          if (getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false))
          {
            this.isFlowFromFirstPartyClient = true;
            i = 110;
            paramBundle = (Bundle)localObject;
            break label182;
          }
        }
      }
      else
      {
        if (!getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
          break label130;
        }
        paramBundle = (PendingIntent)getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
        this.priceChangeResultReceiver = ((ResultReceiver)getIntent().getParcelableExtra("result_receiver"));
      }
      for (;;)
      {
        i = 100;
        break;
        label130:
        if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT"))
        {
          paramBundle = (PendingIntent)getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
          this.inAppMessageResultReceiver = ((ResultReceiver)getIntent().getParcelableExtra("in_app_message_result_receiver"));
          i = 101;
          break;
        }
        paramBundle = null;
      }
      try
      {
        label182:
        this.sendCancelledBroadcastIfFinished = true;
        paramBundle = paramBundle.getIntentSender();
        localObject = new android/content/Intent;
        ((Intent)localObject).<init>();
        startIntentSenderForResult(paramBundle, i, (Intent)localObject, 0, 0, 0);
        return;
      }
      catch (IntentSender.SendIntentException paramBundle)
      {
        zzb.zzp("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", paramBundle);
        paramBundle = this.priceChangeResultReceiver;
        if (paramBundle != null)
        {
          paramBundle.send(6, null);
        }
        else
        {
          paramBundle = this.inAppMessageResultReceiver;
          if (paramBundle != null)
          {
            paramBundle.send(0, null);
          }
          else
          {
            paramBundle = makePurchasesUpdatedIntent();
            if (this.isFlowFromFirstPartyClient) {
              paramBundle.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            paramBundle.putExtra("RESPONSE_CODE", 6);
            paramBundle.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            sendBroadcast(paramBundle);
          }
        }
        this.sendCancelledBroadcastIfFinished = false;
        finish();
        return;
      }
    }
    zzb.zzn("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
    this.sendCancelledBroadcastIfFinished = paramBundle.getBoolean("send_cancelled_broadcast_if_finished", false);
    if (paramBundle.containsKey("result_receiver")) {
      this.priceChangeResultReceiver = ((ResultReceiver)paramBundle.getParcelable("result_receiver"));
    } else if (paramBundle.containsKey("in_app_message_result_receiver")) {
      this.inAppMessageResultReceiver = ((ResultReceiver)paramBundle.getParcelable("in_app_message_result_receiver"));
    }
    this.isFlowFromFirstPartyClient = paramBundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (!isFinishing()) {
      return;
    }
    if (!this.sendCancelledBroadcastIfFinished) {
      return;
    }
    Intent localIntent = makePurchasesUpdatedIntent();
    localIntent.putExtra("RESPONSE_CODE", 1);
    localIntent.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
    sendBroadcast(localIntent);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    ResultReceiver localResultReceiver = this.priceChangeResultReceiver;
    if (localResultReceiver != null) {
      paramBundle.putParcelable("result_receiver", localResultReceiver);
    }
    localResultReceiver = this.inAppMessageResultReceiver;
    if (localResultReceiver != null) {
      paramBundle.putParcelable("in_app_message_result_receiver", localResultReceiver);
    }
    paramBundle.putBoolean("send_cancelled_broadcast_if_finished", this.sendCancelledBroadcastIfFinished);
    paramBundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.isFlowFromFirstPartyClient);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\ProxyBillingActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */