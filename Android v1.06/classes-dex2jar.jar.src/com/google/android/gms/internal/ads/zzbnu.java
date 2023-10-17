package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbnu
{
  public static final List zza(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    paramString = paramJSONObject.optJSONArray(paramString);
    if (paramString != null)
    {
      paramJSONObject = new ArrayList(paramString.length());
      for (int i = 0; i < paramString.length(); i++) {
        paramJSONObject.add(paramString.getString(i));
      }
      return Collections.unmodifiableList(paramJSONObject);
    }
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */