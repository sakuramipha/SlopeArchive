package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfht
{
  static float zza = Resources.getSystem().getDisplayMetrics().density;
  private static WindowManager zzb;
  private static final String[] zzc = { "x", "y", "width", "height" };
  
  public static JSONObject zza(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("x", paramInt1 / zza);
      localJSONObject.put("y", paramInt2 / zza);
      localJSONObject.put("width", paramInt3 / zza);
      localJSONObject.put("height", paramInt4 / zza);
    }
    catch (JSONException localJSONException)
    {
      zzfhu.zza("Error with creating viewStateObject", localJSONException);
    }
    return localJSONObject;
  }
  
  public static void zzb(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      paramJSONObject.put("adSessionId", paramString);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      zzfhu.zza("Error with setting ad session id", paramJSONObject);
    }
  }
  
  public static void zzc(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    try
    {
      JSONArray localJSONArray2 = paramJSONObject1.optJSONArray("childViews");
      JSONArray localJSONArray1 = localJSONArray2;
      if (localJSONArray2 == null)
      {
        localJSONArray1 = new org/json/JSONArray;
        localJSONArray1.<init>();
        paramJSONObject1.put("childViews", localJSONArray1);
      }
      localJSONArray1.put(paramJSONObject2);
      return;
    }
    catch (JSONException paramJSONObject1)
    {
      paramJSONObject1.printStackTrace();
    }
  }
  
  public static void zzd(Context paramContext)
  {
    if (paramContext != null)
    {
      zza = paramContext.getResources().getDisplayMetrics().density;
      zzb = (WindowManager)paramContext.getSystemService("window");
    }
  }
  
  public static void zze(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    try
    {
      paramJSONObject.put(paramString, paramObject);
      return;
    }
    catch (JSONException paramJSONObject) {}catch (NullPointerException paramJSONObject) {}
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("JSONException during JSONObject.put for name [");
    ((StringBuilder)paramObject).append(paramString);
    ((StringBuilder)paramObject).append("]");
    zzfhu.zza(((StringBuilder)paramObject).toString(), paramJSONObject);
  }
  
  public static void zzf(JSONObject paramJSONObject)
  {
    Object localObject = zzb;
    float f2 = 0.0F;
    float f1;
    if (localObject != null)
    {
      localObject = new Point(0, 0);
      zzb.getDefaultDisplay().getRealSize((Point)localObject);
      f2 = ((Point)localObject).x / zza;
      f1 = ((Point)localObject).y / zza;
    }
    else
    {
      f1 = 0.0F;
    }
    try
    {
      paramJSONObject.put("width", f2);
      paramJSONObject.put("height", f1);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      paramJSONObject.printStackTrace();
    }
  }
  
  public static boolean zzg(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    if ((paramJSONObject1 == null) && (paramJSONObject2 == null)) {
      return true;
    }
    if ((paramJSONObject1 != null) && (paramJSONObject2 != null))
    {
      Object localObject1 = zzc;
      Object localObject2;
      for (int i = 0; i < 4; i++)
      {
        localObject2 = localObject1[i];
        if (paramJSONObject1.optDouble((String)localObject2) != paramJSONObject2.optDouble((String)localObject2)) {
          break label249;
        }
      }
      if ((paramJSONObject1.optString("adSessionId", "").equals(paramJSONObject2.optString("adSessionId", ""))) && (Boolean.valueOf(paramJSONObject1.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(paramJSONObject2.optBoolean("hasWindowFocus")))))
      {
        localObject2 = paramJSONObject1.optJSONArray("isFriendlyObstructionFor");
        localObject1 = paramJSONObject2.optJSONArray("isFriendlyObstructionFor");
        if ((localObject2 != null) || (localObject1 != null))
        {
          if (zzh((JSONArray)localObject2, (JSONArray)localObject1)) {
            for (i = 0; i < ((JSONArray)localObject2).length(); i++) {
              if (!((JSONArray)localObject2).optString(i, "").equals(((JSONArray)localObject1).optString(i, ""))) {
                break label249;
              }
            }
          }
        }
        else
        {
          paramJSONObject1 = paramJSONObject1.optJSONArray("childViews");
          paramJSONObject2 = paramJSONObject2.optJSONArray("childViews");
          if ((paramJSONObject1 != null) || (paramJSONObject2 != null))
          {
            if (zzh(paramJSONObject1, paramJSONObject2)) {
              for (i = 0; i < paramJSONObject1.length(); i++) {
                if (!zzg(paramJSONObject1.optJSONObject(i), paramJSONObject2.optJSONObject(i))) {
                  break label249;
                }
              }
            }
          }
          else {
            return true;
          }
        }
      }
    }
    label249:
    return false;
  }
  
  private static boolean zzh(JSONArray paramJSONArray1, JSONArray paramJSONArray2)
  {
    if ((paramJSONArray1 == null) && (paramJSONArray2 == null)) {
      return true;
    }
    return (paramJSONArray1 != null) && (paramJSONArray2 != null) && (paramJSONArray1.length() == paramJSONArray2.length());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */