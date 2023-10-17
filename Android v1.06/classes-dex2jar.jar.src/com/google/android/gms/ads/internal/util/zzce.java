package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

public final class zzce
{
  private static zzce zzb;
  String zza;
  
  public static zzce zza()
  {
    if (zzb == null) {
      zzb = new zzce();
    }
    return zzb;
  }
  
  public final void zzb(Context paramContext)
  {
    zze.zza("Updating user agent.");
    String str = WebSettings.getDefaultUserAgent(paramContext);
    if (!str.equals(this.zza))
    {
      Object localObject2 = GooglePlayServicesUtilLight.getRemoteContext(paramContext);
      Object localObject1 = localObject2;
      if (!ClientLibraryUtils.isPackageSide())
      {
        if (localObject2 == null) {
          localObject1 = null;
        }
      }
      else
      {
        localObject2 = WebSettings.getDefaultUserAgent(paramContext);
        localObject2 = paramContext.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", (String)localObject2);
        if (localObject1 == null) {
          ((SharedPreferences.Editor)localObject2).apply();
        } else {
          SharedPreferencesUtils.publishWorldReadableSharedPreferences(paramContext, (SharedPreferences.Editor)localObject2, "admob_user_agent");
        }
      }
      this.zza = str;
    }
    zze.zza("User agent is updated.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */