package com.unity.purchasing.common;

import java.util.List;

public abstract interface IStoreCallback
{
  public abstract void OnProductsRetrieved(List<ProductDescription> paramList);
  
  public abstract void OnPurchaseFailed(PurchaseFailureDescription paramPurchaseFailureDescription);
  
  public abstract void OnPurchaseSucceeded(String paramString1, String paramString2, String paramString3);
  
  public abstract void OnSetupFailed(InitializationFailureReason paramInitializationFailureReason);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\IStoreCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */