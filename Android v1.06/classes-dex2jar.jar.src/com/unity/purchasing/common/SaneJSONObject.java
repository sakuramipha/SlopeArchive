package com.unity.purchasing.common;

import org.json.JSONException;
import org.json.JSONObject;

public class SaneJSONObject
  extends JSONObject
{
  public JSONObject put(String paramString, double paramDouble)
  {
    try
    {
      paramString = super.put(paramString, paramDouble);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  public JSONObject put(String paramString, Object paramObject)
  {
    try
    {
      paramString = super.put(paramString, paramObject);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  public JSONObject put(String paramString, boolean paramBoolean)
  {
    try
    {
      paramString = super.put(paramString, paramBoolean);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\SaneJSONObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */