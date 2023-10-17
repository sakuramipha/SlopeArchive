package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;

final class zzau
  implements AcknowledgePurchaseResponseListener, BillingClientStateListener, ConsumeResponseListener, PriceChangeConfirmationListener, PurchaseHistoryResponseListener, PurchasesResponseListener, PurchasesUpdatedListener, SkuDetailsResponseListener
{
  private final long zza;
  
  zzau()
  {
    this.zza = 0L;
  }
  
  zzau(long paramLong)
  {
    this.zza = paramLong;
  }
  
  public static native void nativeOnAcknowledgePurchaseResponse(int paramInt, String paramString, long paramLong);
  
  public static native void nativeOnBillingServiceDisconnected();
  
  public static native void nativeOnBillingSetupFinished(int paramInt, String paramString, long paramLong);
  
  public static native void nativeOnConsumePurchaseResponse(int paramInt, String paramString1, String paramString2, long paramLong);
  
  public static native void nativeOnPriceChangeConfirmationResult(int paramInt, String paramString, long paramLong);
  
  public static native void nativeOnPurchaseHistoryResponse(int paramInt, String paramString, PurchaseHistoryRecord[] paramArrayOfPurchaseHistoryRecord, long paramLong);
  
  public static native void nativeOnPurchasesUpdated(int paramInt, String paramString, Purchase[] paramArrayOfPurchase);
  
  public static native void nativeOnQueryPurchasesResponse(int paramInt, String paramString, Purchase[] paramArrayOfPurchase, long paramLong);
  
  public static native void nativeOnSkuDetailsResponse(int paramInt, String paramString, SkuDetails[] paramArrayOfSkuDetails, long paramLong);
  
  public final void onAcknowledgePurchaseResponse(BillingResult paramBillingResult)
  {
    nativeOnAcknowledgePurchaseResponse(paramBillingResult.getResponseCode(), paramBillingResult.getDebugMessage(), this.zza);
  }
  
  public final void onBillingServiceDisconnected() {}
  
  public final void onBillingSetupFinished(BillingResult paramBillingResult)
  {
    nativeOnBillingSetupFinished(paramBillingResult.getResponseCode(), paramBillingResult.getDebugMessage(), this.zza);
  }
  
  public final void onConsumeResponse(BillingResult paramBillingResult, String paramString)
  {
    nativeOnConsumePurchaseResponse(paramBillingResult.getResponseCode(), paramBillingResult.getDebugMessage(), paramString, this.zza);
  }
  
  public final void onPriceChangeConfirmationResult(BillingResult paramBillingResult)
  {
    nativeOnPriceChangeConfirmationResult(paramBillingResult.getResponseCode(), paramBillingResult.getDebugMessage(), this.zza);
  }
  
  public final void onPurchaseHistoryResponse(BillingResult paramBillingResult, List<PurchaseHistoryRecord> paramList)
  {
    Object localObject = paramList;
    if (paramList == null) {
      localObject = Collections.emptyList();
    }
    paramList = (PurchaseHistoryRecord[])((List)localObject).toArray(new PurchaseHistoryRecord[((List)localObject).size()]);
    nativeOnPurchaseHistoryResponse(paramBillingResult.getResponseCode(), paramBillingResult.getDebugMessage(), paramList, this.zza);
  }
  
  public final void onPurchasesUpdated(BillingResult paramBillingResult, List<Purchase> paramList)
  {
    Object localObject = paramList;
    if (paramList == null) {
      localObject = Collections.emptyList();
    }
    paramList = (Purchase[])((List)localObject).toArray(new Purchase[((List)localObject).size()]);
    nativeOnPurchasesUpdated(paramBillingResult.getResponseCode(), paramBillingResult.getDebugMessage(), paramList);
  }
  
  public final void onQueryPurchasesResponse(BillingResult paramBillingResult, List<Purchase> paramList)
  {
    paramList = (Purchase[])paramList.toArray(new Purchase[paramList.size()]);
    nativeOnQueryPurchasesResponse(paramBillingResult.getResponseCode(), paramBillingResult.getDebugMessage(), paramList, this.zza);
  }
  
  public final void onSkuDetailsResponse(BillingResult paramBillingResult, List<SkuDetails> paramList)
  {
    Object localObject = paramList;
    if (paramList == null) {
      localObject = Collections.emptyList();
    }
    paramList = (SkuDetails[])((List)localObject).toArray(new SkuDetails[((List)localObject).size()]);
    nativeOnSkuDetailsResponse(paramBillingResult.getResponseCode(), paramBillingResult.getDebugMessage(), paramList, this.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\zzau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */