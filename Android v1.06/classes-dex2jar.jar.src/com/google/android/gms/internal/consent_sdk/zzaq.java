package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzaq
  implements zzf
{
  private final Application zza;
  private final zzas zzb;
  private final Executor zzc;
  
  public zzaq(Application paramApplication, zzas paramzzas, Executor paramExecutor)
  {
    this.zza = paramApplication;
    this.zzb = paramzzas;
    this.zzc = paramExecutor;
  }
  
  public final Executor zza()
  {
    return this.zzc;
  }
  
  public final boolean zzb(String paramString, JSONObject paramJSONObject)
  {
    int i = paramString.hashCode();
    int j = 0;
    if (i != 94746189)
    {
      if ((i == 113399775) && (paramString.equals("write")))
      {
        i = 0;
        break label53;
      }
    }
    else if (paramString.equals("clear"))
    {
      i = 1;
      break label53;
    }
    i = -1;
    label53:
    Object localObject;
    if (i != 0)
    {
      if (i != 1) {
        return false;
      }
      paramString = paramJSONObject.optJSONArray("keys");
      if ((paramString != null) && (paramString.length() != 0))
      {
        paramJSONObject = new HashSet();
        int k = paramString.length();
        for (i = j; i < k; i++)
        {
          localObject = paramString.optString(i);
          if (TextUtils.isEmpty((CharSequence)localObject))
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Action[clear]: empty key at index: ");
            ((StringBuilder)localObject).append(i);
            Log.d("UserMessagingPlatform", ((StringBuilder)localObject).toString());
          }
          else
          {
            paramJSONObject.add(localObject);
          }
        }
        zzcq.zzb(this.zza, paramJSONObject);
      }
      else
      {
        Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(paramJSONObject.toString())));
      }
      return true;
    }
    zzcp localzzcp = new zzcp(this.zza);
    paramString = paramJSONObject.keys();
    while (paramString.hasNext())
    {
      String str1 = (String)paramString.next();
      localObject = paramJSONObject.opt(str1);
      String str2 = String.valueOf(localObject);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Writing to storage: [");
      localStringBuilder.append(str1);
      localStringBuilder.append("] ");
      localStringBuilder.append(str2);
      Log.d("UserMessagingPlatform", localStringBuilder.toString());
      if (localzzcp.zzc(str1, localObject)) {
        this.zzb.zzd().add(str1);
      } else {
        Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(str1)));
      }
    }
    this.zzb.zzf();
    localzzcp.zzb();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */