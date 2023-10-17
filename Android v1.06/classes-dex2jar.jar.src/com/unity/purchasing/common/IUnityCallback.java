package com.unity.purchasing.common;

public abstract interface IUnityCallback
{
  public abstract void OnProductsRetrieved(String paramString);
  
  public abstract void OnPurchaseFailed(String paramString);
  
  public abstract void OnPurchaseSucceeded(String paramString1, String paramString2, String paramString3);
  
  public abstract void OnSetupFailed(String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\IUnityCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */