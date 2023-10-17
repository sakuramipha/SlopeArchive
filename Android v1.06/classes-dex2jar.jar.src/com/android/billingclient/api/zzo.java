package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzo
  extends BroadcastReceiver
{
  final zzp zza;
  private final PurchasesUpdatedListener zzb;
  private final zzbf zzc;
  private final zzc zzd;
  private boolean zze;
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject = paramIntent.getExtras();
    if (localObject == null)
    {
      zzb.zzo("BillingBroadcastManager", "Bundle is null.");
      paramContext = this.zzb;
      if (paramContext != null) {
        paramContext.onPurchasesUpdated(zzbc.zzj, null);
      }
      return;
    }
    paramContext = zzb.zzi(paramIntent, "BillingBroadcastManager");
    paramIntent = paramIntent.getAction();
    if (paramIntent.equals("com.android.vending.billing.PURCHASES_UPDATED"))
    {
      if ((!((Bundle)localObject).getBoolean("IS_FIRST_PARTY_PURCHASE", false)) && (this.zzb != null))
      {
        paramIntent = zzb.zzm((Bundle)localObject);
        this.zzb.onPurchasesUpdated(paramContext, paramIntent);
        return;
      }
      zzb.zzo("BillingBroadcastManager", "Received purchase and no valid listener registered.");
      return;
    }
    if (paramIntent.equals("com.android.vending.billing.ALTERNATIVE_BILLING"))
    {
      if (paramContext.getResponseCode() != 0)
      {
        this.zzb.onPurchasesUpdated(paramContext, zzu.zzl());
        return;
      }
      if (this.zzd == null)
      {
        zzb.zzo("BillingBroadcastManager", "AlternativeBillingListener is null.");
        this.zzb.onPurchasesUpdated(zzbc.zzj, zzu.zzl());
        return;
      }
      paramContext = ((Bundle)localObject).getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
      if (paramContext != null) {
        try
        {
          paramIntent = new org/json/JSONObject;
          paramIntent.<init>(paramContext);
          paramIntent = paramIntent.optJSONArray("products");
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          if (paramIntent != null) {
            for (int i = 0; i < paramIntent.length(); i++)
            {
              JSONObject localJSONObject = paramIntent.optJSONObject(i);
              if (localJSONObject != null)
              {
                zze localzze = new com/android/billingclient/api/zze;
                localzze.<init>(localJSONObject, null);
                ((List)localObject).add(localzze);
              }
            }
          }
          this.zzd.zza();
          return;
        }
        catch (JSONException paramIntent)
        {
          zzb.zzo("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", new Object[] { paramContext }));
          this.zzb.onPurchasesUpdated(zzbc.zzj, zzu.zzl());
          return;
        }
      }
      zzb.zzo("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
      this.zzb.onPurchasesUpdated(zzbc.zzj, zzu.zzl());
    }
  }
  
  public final void zzc(Context paramContext, IntentFilter paramIntentFilter)
  {
    if (!this.zze)
    {
      paramContext.registerReceiver(zzp.zza(this.zza), paramIntentFilter);
      this.zze = true;
    }
  }
  
  public final void zzd(Context paramContext)
  {
    if (this.zze)
    {
      paramContext.unregisterReceiver(zzp.zza(this.zza));
      this.zze = false;
      return;
    }
    zzb.zzo("BillingBroadcastManager", "Receiver is not registered.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */