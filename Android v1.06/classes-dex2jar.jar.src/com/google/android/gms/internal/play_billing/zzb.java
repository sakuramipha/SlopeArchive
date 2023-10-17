package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.BillingResult.Builder;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams.Product;
import com.android.billingclient.api.zzbx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

public final class zzb
{
  public static final int zza = Runtime.getRuntime().availableProcessors();
  
  public static int zza(Intent paramIntent, String paramString)
  {
    if (paramIntent == null)
    {
      zzo("ProxyBillingActivity", "Got null intent!");
      return 0;
    }
    return zzq(paramIntent.getExtras(), "ProxyBillingActivity");
  }
  
  public static int zzb(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null)
    {
      zzo(paramString, "Unexpected null bundle received!");
      return 6;
    }
    paramBundle = paramBundle.get("RESPONSE_CODE");
    if (paramBundle == null)
    {
      zzn(paramString, "getResponseCodeFromBundle() got null response code, assuming OK");
      return 0;
    }
    if ((paramBundle instanceof Integer)) {
      return ((Integer)paramBundle).intValue();
    }
    zzo(paramString, "Unexpected type for bundle response code: ".concat(String.valueOf(paramBundle.getClass().getName())));
    return 6;
  }
  
  public static Bundle zzc(AcknowledgePurchaseParams paramAcknowledgePurchaseParams, String paramString)
  {
    paramAcknowledgePurchaseParams = new Bundle();
    paramAcknowledgePurchaseParams.putString("playBillingLibraryVersion", paramString);
    return paramAcknowledgePurchaseParams;
  }
  
  public static Bundle zzd(ConsumeParams paramConsumeParams, boolean paramBoolean, String paramString)
  {
    paramConsumeParams = new Bundle();
    if (paramBoolean) {
      paramConsumeParams.putString("playBillingLibraryVersion", paramString);
    }
    return paramConsumeParams;
  }
  
  public static Bundle zze(int paramInt, boolean paramBoolean, String paramString1, String paramString2, ArrayList paramArrayList)
  {
    paramString2 = new Bundle();
    if (paramInt >= 9) {
      paramString2.putString("playBillingLibraryVersion", paramString1);
    }
    if ((paramInt >= 9) && (paramBoolean)) {
      paramString2.putBoolean("enablePendingPurchases", true);
    }
    if (paramInt >= 14)
    {
      paramString1 = new ArrayList();
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      int j = paramArrayList.size();
      int i = 0;
      boolean bool = false;
      paramInt = 0;
      while (i < j)
      {
        zzbx localzzbx = (zzbx)paramArrayList.get(i);
        paramString1.add(null);
        bool |= TextUtils.isEmpty(null) ^ true;
        localArrayList1.add(null);
        paramInt |= TextUtils.isEmpty(null) ^ true;
        localArrayList2.add(Integer.valueOf(0));
        i++;
      }
      if (bool) {
        paramString2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", paramString1);
      }
      if (paramInt != 0) {
        paramString2.putStringArrayList("SKU_OFFER_ID_LIST", localArrayList1);
      }
    }
    return paramString2;
  }
  
  public static Bundle zzf(BillingFlowParams paramBillingFlowParams, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("playBillingLibraryVersion", paramString);
    if (paramBillingFlowParams.zza() != 0) {
      localBundle.putInt("prorationMode", paramBillingFlowParams.zza());
    }
    if (!TextUtils.isEmpty(paramBillingFlowParams.zzb())) {
      localBundle.putString("accountId", paramBillingFlowParams.zzb());
    }
    if (!TextUtils.isEmpty(paramBillingFlowParams.zzc())) {
      localBundle.putString("obfuscatedProfileId", paramBillingFlowParams.zzc());
    }
    if (paramBillingFlowParams.zzn()) {
      localBundle.putBoolean("isOfferPersonalizedByDeveloper", true);
    }
    if (!TextUtils.isEmpty(null)) {
      localBundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[] { null })));
    }
    if (!TextUtils.isEmpty(paramBillingFlowParams.zzd())) {
      localBundle.putString("oldSkuPurchaseToken", paramBillingFlowParams.zzd());
    }
    if (!TextUtils.isEmpty(null)) {
      localBundle.putString("oldSkuPurchaseId", null);
    }
    if (!TextUtils.isEmpty(null)) {
      localBundle.putString("originalExternalTransactionId", null);
    }
    if (!TextUtils.isEmpty(null)) {
      localBundle.putString("paymentsPurchaseParams", null);
    }
    if ((paramBoolean1) && (paramBoolean2)) {
      localBundle.putBoolean("enablePendingPurchases", true);
    }
    if (paramBoolean3) {
      localBundle.putBoolean("enableAlternativeBilling", true);
    }
    return localBundle;
  }
  
  public static Bundle zzg(String paramString1, ArrayList paramArrayList, String paramString2)
  {
    paramString2 = new Bundle();
    paramString2.putString("playBillingLibraryVersion", paramString1);
    paramString2.putBoolean("enablePendingPurchases", true);
    paramString2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int j = paramArrayList.size();
    int i = 0;
    boolean bool = false;
    while (i < j)
    {
      paramString1 = (QueryProductDetailsParams.Product)paramArrayList.get(i);
      localArrayList1.add(null);
      bool |= TextUtils.isEmpty(null) ^ true;
      if (paramString1.zzb().equals("first_party"))
      {
        zzm.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
        localArrayList2.add(null);
      }
      i++;
    }
    if (bool) {
      paramString2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", localArrayList1);
    }
    if (!localArrayList2.isEmpty()) {
      paramString2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", localArrayList2);
    }
    return paramString2;
  }
  
  public static Bundle zzh(boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("playBillingLibraryVersion", paramString);
    if ((paramBoolean1) && (paramBoolean2)) {
      localBundle.putBoolean("enablePendingPurchases", true);
    }
    return localBundle;
  }
  
  public static BillingResult zzi(Intent paramIntent, String paramString)
  {
    if (paramIntent == null)
    {
      zzo("BillingHelper", "Got null intent!");
      paramIntent = BillingResult.newBuilder();
      paramIntent.setResponseCode(6);
      paramIntent.setDebugMessage("An internal error occurred.");
      return paramIntent.build();
    }
    BillingResult.Builder localBuilder = BillingResult.newBuilder();
    localBuilder.setResponseCode(zzb(paramIntent.getExtras(), paramString));
    localBuilder.setDebugMessage(zzk(paramIntent.getExtras(), paramString));
    return localBuilder.build();
  }
  
  public static InAppMessageResult zzj(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null) {
      return new InAppMessageResult(0, null);
    }
    return new InAppMessageResult(zzq(paramBundle, "BillingClient"), paramBundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
  }
  
  public static String zzk(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null)
    {
      zzo(paramString, "Unexpected null bundle received!");
      return "";
    }
    paramBundle = paramBundle.get("DEBUG_MESSAGE");
    if (paramBundle == null)
    {
      zzn(paramString, "getDebugMessageFromBundle() got null response code, assuming OK");
      return "";
    }
    if ((paramBundle instanceof String)) {
      return (String)paramBundle;
    }
    zzo(paramString, "Unexpected type for debug message: ".concat(String.valueOf(paramBundle.getClass().getName())));
    return "";
  }
  
  public static String zzl(int paramInt)
  {
    return zza.zza(paramInt).toString();
  }
  
  public static List zzm(Bundle paramBundle)
  {
    ArrayList localArrayList2 = paramBundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
    ArrayList localArrayList3 = paramBundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
    ArrayList localArrayList1 = new ArrayList();
    int i;
    if ((localArrayList2 != null) && (localArrayList3 != null))
    {
      i = localArrayList2.size();
      paramBundle = new StringBuilder();
      paramBundle.append("Found purchase list of ");
      paramBundle.append(i);
      paramBundle.append(" items");
      zzn("BillingHelper", paramBundle.toString());
      i = 0;
    }
    while ((i < localArrayList2.size()) && (i < localArrayList3.size()))
    {
      paramBundle = zzr((String)localArrayList2.get(i), (String)localArrayList3.get(i));
      if (paramBundle != null) {
        localArrayList1.add(paramBundle);
      }
      i++;
      continue;
      paramBundle = zzr(paramBundle.getString("INAPP_PURCHASE_DATA"), paramBundle.getString("INAPP_DATA_SIGNATURE"));
      if (paramBundle == null)
      {
        zzn("BillingHelper", "Couldn't find single purchase data as well.");
        return null;
      }
      localArrayList1.add(paramBundle);
    }
    return localArrayList1;
  }
  
  public static void zzn(String paramString1, String paramString2)
  {
    if (Log.isLoggable(paramString1, 2))
    {
      if (!paramString2.isEmpty())
      {
        int i = 40000;
        while ((!paramString2.isEmpty()) && (i > 0))
        {
          int j = Math.min(paramString2.length(), Math.min(4000, i));
          Log.v(paramString1, paramString2.substring(0, j));
          paramString2 = paramString2.substring(j);
          i -= j;
        }
      }
      Log.v(paramString1, paramString2);
    }
  }
  
  public static void zzo(String paramString1, String paramString2)
  {
    if (Log.isLoggable(paramString1, 5)) {
      Log.w(paramString1, paramString2);
    }
  }
  
  public static void zzp(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (Log.isLoggable(paramString1, 5)) {
      Log.w(paramString1, paramString2, paramThrowable);
    }
  }
  
  private static int zzq(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null)
    {
      zzo(paramString, "Unexpected null bundle received!");
      return 0;
    }
    return paramBundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
  }
  
  private static Purchase zzr(String paramString1, String paramString2)
  {
    Object localObject = null;
    if ((paramString1 != null) && (paramString2 != null))
    {
      try
      {
        Purchase localPurchase = new com/android/billingclient/api/Purchase;
        localPurchase.<init>(paramString1, paramString2);
        paramString1 = localPurchase;
      }
      catch (JSONException paramString1)
      {
        zzo("BillingHelper", "Got JSONException while parsing purchase data: ".concat(paramString1.toString()));
        paramString1 = (String)localObject;
      }
      return paramString1;
    }
    zzn("BillingHelper", "Received a null purchase data.");
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */