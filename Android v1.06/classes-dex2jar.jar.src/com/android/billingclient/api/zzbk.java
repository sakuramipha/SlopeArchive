package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzb;

final class zzbk
{
  static BillingResult zza(Bundle paramBundle, String paramString1, String paramString2)
  {
    paramString1 = zzbc.zzj;
    if (paramBundle == null)
    {
      zzb.zzo("BillingClient", String.format("%s got null owned items list", new Object[] { paramString2 }));
      return paramString1;
    }
    int i = zzb.zzb(paramBundle, "BillingClient");
    Object localObject2 = zzb.zzk(paramBundle, "BillingClient");
    Object localObject1 = BillingResult.newBuilder();
    ((BillingResult.Builder)localObject1).setResponseCode(i);
    ((BillingResult.Builder)localObject1).setDebugMessage((String)localObject2);
    localObject1 = ((BillingResult.Builder)localObject1).build();
    if (i != 0)
    {
      zzb.zzo("BillingClient", String.format("%s failed. Response code: %s", new Object[] { paramString2, Integer.valueOf(i) }));
      return (BillingResult)localObject1;
    }
    if ((paramBundle.containsKey("INAPP_PURCHASE_ITEM_LIST")) && (paramBundle.containsKey("INAPP_PURCHASE_DATA_LIST")) && (paramBundle.containsKey("INAPP_DATA_SIGNATURE_LIST")))
    {
      localObject2 = paramBundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
      localObject1 = paramBundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
      paramBundle = paramBundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
      if (localObject2 == null)
      {
        zzb.zzo("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", new Object[] { paramString2 }));
        return paramString1;
      }
      if (localObject1 == null)
      {
        zzb.zzo("BillingClient", String.format("Bundle returned from %s contains null purchases list.", new Object[] { paramString2 }));
        return paramString1;
      }
      if (paramBundle == null)
      {
        zzb.zzo("BillingClient", String.format("Bundle returned from %s contains null signatures list.", new Object[] { paramString2 }));
        return paramString1;
      }
      return zzbc.zzl;
    }
    zzb.zzo("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", new Object[] { paramString2 }));
    return paramString1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zzbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */