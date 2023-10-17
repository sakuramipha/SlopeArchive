package com.android.billingclient.api;

import java.util.List;

public abstract interface PurchaseHistoryResponseListener
{
  public abstract void onPurchaseHistoryResponse(BillingResult paramBillingResult, List<PurchaseHistoryRecord> paramList);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\PurchaseHistoryResponseListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */