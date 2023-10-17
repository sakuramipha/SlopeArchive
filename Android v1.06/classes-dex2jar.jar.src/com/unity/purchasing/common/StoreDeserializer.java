package com.unity.purchasing.common;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class StoreDeserializer
  implements INativeStore, IStore
{
  public static List<ProductDefinition> DeserializeProducts(String paramString)
  {
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramString);
      paramString = new java/util/ArrayList;
      paramString.<init>();
      for (int i = 0; i < localJSONArray.length(); i++) {
        paramString.add(GetProductDefinition(localJSONArray.getJSONObject(i)));
      }
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  public static ProductDefinition GetProductDefinition(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = GetProductDefinition(localJSONObject);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  private static ProductDefinition GetProductDefinition(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = new ProductDefinition(paramJSONObject.getString("id"), paramJSONObject.getString("storeSpecificId"), ProductType.valueOf(paramJSONObject.getString("type")));
      return paramJSONObject;
    }
    catch (JSONException paramJSONObject)
    {
      throw new RuntimeException(paramJSONObject);
    }
  }
  
  public void FinishTransaction(String paramString1, String paramString2)
  {
    FinishTransaction(GetProductDefinition(paramString1), paramString2);
  }
  
  public void Purchase(String paramString1, String paramString2)
  {
    Purchase(GetProductDefinition(paramString1), paramString2);
  }
  
  public void RetrieveProducts(String paramString)
  {
    RetrieveProducts(DeserializeProducts(paramString));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\StoreDeserializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */