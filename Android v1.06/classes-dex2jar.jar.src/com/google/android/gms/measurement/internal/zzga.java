package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import com.google.android.gms.common.R.string;

public final class zzga
{
  public static String zza(Context paramContext)
  {
    try
    {
      String str = paramContext.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
      paramContext = str;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      paramContext = paramContext.getPackageName();
    }
    return paramContext;
  }
  
  public static final String zzb(String paramString1, Resources paramResources, String paramString2)
  {
    int i = paramResources.getIdentifier(paramString1, "string", paramString2);
    paramString1 = null;
    if (i != 0) {}
    try
    {
      paramResources = paramResources.getString(i);
      paramString1 = paramResources;
    }
    catch (Resources.NotFoundException paramResources)
    {
      for (;;) {}
    }
    return paramString1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\measurement\internal\zzga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */