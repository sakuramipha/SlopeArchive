package com.unity.purchasing.common;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class UnityPurchasing
  implements IStoreCallback
{
  private IUnityCallback bridge;
  
  public UnityPurchasing(IUnityCallback paramIUnityCallback)
  {
    this.bridge = paramIUnityCallback;
  }
  
  private static JSONObject SerialiseMetadata(ProductMetadata paramProductMetadata)
  {
    SaneJSONObject localSaneJSONObject = new SaneJSONObject();
    localSaneJSONObject.put("isoCurrencyCode", paramProductMetadata.isoCurrencyCode);
    localSaneJSONObject.put("localizedDescription", paramProductMetadata.localizedDescription);
    localSaneJSONObject.put("localizedPriceString", paramProductMetadata.localizedPriceString);
    double d;
    if (paramProductMetadata.localizedPrice == null) {
      d = 0.0D;
    } else {
      d = paramProductMetadata.localizedPrice.doubleValue();
    }
    localSaneJSONObject.put("localizedPrice", d);
    localSaneJSONObject.put("localizedTitle", paramProductMetadata.localizedTitle);
    return localSaneJSONObject;
  }
  
  private static JSONObject SerialiseProduct(ProductDescription paramProductDescription)
  {
    SaneJSONObject localSaneJSONObject = new SaneJSONObject();
    localSaneJSONObject.put("metadata", SerialiseMetadata(paramProductDescription.metadata));
    localSaneJSONObject.put("receipt", paramProductDescription.receipt);
    localSaneJSONObject.put("storeSpecificId", paramProductDescription.storeSpecificId);
    localSaneJSONObject.put("transactionId", paramProductDescription.transactionId);
    return localSaneJSONObject;
  }
  
  public static String SerialiseProducts(List<ProductDescription> paramList)
  {
    JSONArray localJSONArray = new JSONArray();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localJSONArray.put(SerialiseProduct((ProductDescription)paramList.next()));
    }
    return localJSONArray.toString();
  }
  
  public static String SerialisePurchaseFailure(PurchaseFailureDescription paramPurchaseFailureDescription)
  {
    SaneJSONObject localSaneJSONObject = new SaneJSONObject();
    localSaneJSONObject.put("message", paramPurchaseFailureDescription.message);
    localSaneJSONObject.put("productId", paramPurchaseFailureDescription.productId);
    localSaneJSONObject.put("reason", paramPurchaseFailureDescription.reason.toString());
    localSaneJSONObject.put("storeSpecificErrorCode", paramPurchaseFailureDescription.storeSpecificErrorCode);
    return localSaneJSONObject.toString();
  }
  
  public void OnProductsRetrieved(List<ProductDescription> paramList)
  {
    this.bridge.OnProductsRetrieved(SerialiseProducts(paramList));
  }
  
  public void OnPurchaseFailed(PurchaseFailureDescription paramPurchaseFailureDescription)
  {
    this.bridge.OnPurchaseFailed(SerialisePurchaseFailure(paramPurchaseFailureDescription));
  }
  
  public void OnPurchaseSucceeded(String paramString1, String paramString2, String paramString3)
  {
    this.bridge.OnPurchaseSucceeded(paramString1, paramString2, paramString3);
  }
  
  public void OnSetupFailed(InitializationFailureReason paramInitializationFailureReason)
  {
    this.bridge.OnSetupFailed(paramInitializationFailureReason.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\UnityPurchasing.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */