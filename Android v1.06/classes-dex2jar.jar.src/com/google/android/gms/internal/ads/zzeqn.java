package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzeqn
  implements zzeqq
{
  private final zzfwc zza;
  private final Context zzb;
  
  zzeqn(zzfwc paramzzfwc, Context paramContext)
  {
    this.zza = paramzzfwc;
    this.zzb = paramContext;
  }
  
  public static Bundle zzc(Context paramContext, JSONArray paramJSONArray)
  {
    Bundle localBundle = new Bundle();
    for (int j = 0; j < paramJSONArray.length(); j++)
    {
      Object localObject1 = paramJSONArray.optJSONObject(j);
      String str = ((JSONObject)localObject1).optString("bk");
      Object localObject2 = ((JSONObject)localObject1).optString("sk");
      int i = ((JSONObject)localObject1).optInt("type", -1);
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2) {
            i = 0;
          } else {
            i = 3;
          }
        }
        else {
          i = 2;
        }
      }
      else {
        i = 1;
      }
      if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty((CharSequence)localObject2)) && (i != 0))
      {
        String[] arrayOfString = ((String)localObject2).split("/");
        int k = arrayOfString.length;
        localObject2 = null;
        localObject1 = localObject2;
        if (k <= 2) {
          if (k == 0)
          {
            localObject1 = localObject2;
          }
          else
          {
            if (k == 1)
            {
              localObject2 = PreferenceManager.getDefaultSharedPreferences(paramContext);
              localObject1 = arrayOfString[0];
            }
            else
            {
              localObject2 = paramContext.getSharedPreferences(arrayOfString[0], 0);
              localObject1 = arrayOfString[1];
            }
            localObject1 = ((SharedPreferences)localObject2).getAll().get(localObject1);
          }
        }
        if (localObject1 != null)
        {
          i--;
          if (i != 0)
          {
            if (i != 1)
            {
              if ((localObject1 instanceof Boolean)) {
                localBundle.putBoolean(str, ((Boolean)localObject1).booleanValue());
              }
            }
            else if ((localObject1 instanceof Integer)) {
              localBundle.putInt(str, ((Integer)localObject1).intValue());
            } else if ((localObject1 instanceof Long)) {
              localBundle.putLong(str, ((Long)localObject1).longValue());
            } else if ((localObject1 instanceof Float)) {
              localBundle.putFloat(str, ((Float)localObject1).floatValue());
            }
          }
          else if ((localObject1 instanceof String)) {
            localBundle.putString(str, (String)localObject1);
          }
        }
      }
    }
    return localBundle;
  }
  
  public final int zza()
  {
    return 37;
  }
  
  public final zzfwb zzb()
  {
    return this.zza.zzb(new zzeql(this));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */