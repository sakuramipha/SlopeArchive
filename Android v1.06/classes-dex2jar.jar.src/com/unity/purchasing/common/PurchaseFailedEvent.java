package com.unity.purchasing.common;

import org.json.JSONObject;

public class PurchaseFailedEvent
{
  public static String jsonEncodePurchaseFailure(String paramString1, PurchaseFailureReason paramPurchaseFailureReason, String paramString2)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("productId", paramString1);
      localJSONObject.put("reason", paramPurchaseFailureReason);
      localJSONObject.put("message", paramString2);
      paramString1 = localJSONObject.toString();
      return paramString1;
    }
    catch (Exception paramString1)
    {
      throw new RuntimeException(paramString1);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\PurchaseFailedEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */