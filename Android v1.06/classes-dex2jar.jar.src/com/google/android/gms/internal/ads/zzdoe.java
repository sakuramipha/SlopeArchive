package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdoe
{
  public static String zza(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    if (paramJSONObject == null) {
      return "";
    }
    paramString2 = paramJSONObject.optJSONArray(paramString2);
    if (paramString2 != null) {
      for (int i = 0; i < paramString2.length(); i++)
      {
        JSONObject localJSONObject = paramString2.optJSONObject(i);
        if (localJSONObject != null)
        {
          paramJSONObject = localJSONObject.optJSONArray("including");
          JSONArray localJSONArray = localJSONObject.optJSONArray("excluding");
          if ((zzb(paramJSONObject, paramString1)) && (!zzb(localJSONArray, paramString1))) {
            return localJSONObject.optString("effective_ad_unit_id", "");
          }
        }
      }
    }
    return "";
  }
  
  private static boolean zzb(JSONArray paramJSONArray, String paramString)
  {
    if ((paramJSONArray != null) && (paramString != null))
    {
      int i = 0;
      while (i < paramJSONArray.length())
      {
        Object localObject = paramJSONArray.optString(i);
        try
        {
          zzbbc localzzbbc = zzbbk.zzjt;
          if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
            localObject = Pattern.compile((String)localObject, 2);
          } else {
            localObject = Pattern.compile((String)localObject);
          }
          boolean bool = ((Pattern)localObject).matcher(paramString).lookingAt();
          if (bool) {
            return true;
          }
        }
        catch (PatternSyntaxException localPatternSyntaxException)
        {
          zzt.zzo().zzu(localPatternSyntaxException, "RtbAdapterMap.hasAtleastOneRegexMatch");
          i++;
        }
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */