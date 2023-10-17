package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

public final class zzcq
{
  public static zzco zza(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    paramString = paramString.split("/", -1);
    int i = paramString.length;
    if (i == 1)
    {
      paramContext = String.valueOf(paramContext.getPackageName());
      paramString = paramString[0];
      paramContext = paramContext.concat("_preferences");
    }
    else
    {
      if (i != 2) {
        break label87;
      }
      paramContext = paramString[0];
      paramString = paramString[1];
    }
    if ((!TextUtils.isEmpty(paramContext)) && (!TextUtils.isEmpty(paramString))) {
      return new zzco(paramContext, paramString);
    }
    label87:
    return null;
  }
  
  public static void zzb(Context paramContext, Set paramSet)
  {
    zzcp localzzcp = new zzcp(paramContext);
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      String str = (String)paramSet.next();
      zzco localzzco = zza(paramContext, str);
      if (localzzco == null) {
        Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
      } else {
        zzcp.zza(localzzcp, localzzco.zza).remove(localzzco.zzb);
      }
    }
    localzzcp.zzb();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */