package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

public final class zac
{
  private static final SimpleArrayMap<String, String> zaa = new SimpleArrayMap();
  private static Locale zab;
  
  public static String zaa(Context paramContext)
  {
    String str1 = paramContext.getPackageName();
    try
    {
      String str2 = Wrappers.packageManager(paramContext).getApplicationLabel(str1).toString();
      return str2;
    }
    catch (PackageManager.NameNotFoundException|NullPointerException localNameNotFoundException)
    {
      paramContext = paramContext.getApplicationInfo().name;
      if (TextUtils.isEmpty(paramContext)) {
        return str1;
      }
    }
    return paramContext;
  }
  
  public static String zab(Context paramContext)
  {
    return paramContext.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
  }
  
  public static String zac(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getResources();
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return paramContext.getString(17039370);
        }
        return paramContext.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button);
      }
      return paramContext.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button);
    }
    return paramContext.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
  }
  
  public static String zad(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    String str = zaa(paramContext);
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 5)
          {
            if (paramInt != 7)
            {
              if (paramInt != 9)
              {
                if (paramInt != 20)
                {
                  switch (paramInt)
                  {
                  default: 
                    return localResources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, new Object[] { str });
                  case 18: 
                    return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, new Object[] { str });
                  case 17: 
                    return zah(paramContext, "common_google_play_services_sign_in_failed_text", str);
                  }
                  return zah(paramContext, "common_google_play_services_api_unavailable_text", str);
                }
                return zah(paramContext, "common_google_play_services_restricted_profile_text", str);
              }
              return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, new Object[] { str });
            }
            return zah(paramContext, "common_google_play_services_network_error_text", str);
          }
          return zah(paramContext, "common_google_play_services_invalid_account_text", str);
        }
        return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, new Object[] { str });
      }
      if (DeviceProperties.isWearableWithoutPlayStore(paramContext)) {
        return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text);
      }
      return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, new Object[] { str });
    }
    return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, new Object[] { str });
  }
  
  public static String zae(Context paramContext, int paramInt)
  {
    if ((paramInt != 6) && (paramInt != 19)) {
      return zad(paramContext, paramInt);
    }
    return zah(paramContext, "common_google_play_services_resolution_required_text", zaa(paramContext));
  }
  
  public static String zaf(Context paramContext, int paramInt)
  {
    String str;
    if (paramInt == 6) {
      str = zai(paramContext, "common_google_play_services_resolution_required_title");
    } else {
      str = zag(paramContext, paramInt);
    }
    if (str == null) {
      return paramContext.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker);
    }
    return str;
  }
  
  public static String zag(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 19: 
    default: 
      paramContext = new StringBuilder(33);
      paramContext.append("Unexpected error code ");
      paramContext.append(paramInt);
      Log.e("GoogleApiAvailability", paramContext.toString());
      return null;
    case 20: 
      Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
      return zai(paramContext, "common_google_play_services_restricted_profile_title");
    case 17: 
      Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
      return zai(paramContext, "common_google_play_services_sign_in_failed_title");
    case 16: 
      Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
      return null;
    case 11: 
      Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
      return null;
    case 10: 
      Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
      return null;
    case 9: 
      Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
      return null;
    case 8: 
      Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
      return null;
    case 7: 
      Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
      return zai(paramContext, "common_google_play_services_network_error_title");
    case 5: 
      Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
      return zai(paramContext, "common_google_play_services_invalid_account_title");
    case 4: 
    case 6: 
    case 18: 
      return null;
    case 3: 
      return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
    case 2: 
      return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
    }
    return localResources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
  }
  
  private static String zah(Context paramContext, String paramString1, String paramString2)
  {
    Resources localResources = paramContext.getResources();
    paramString1 = zai(paramContext, paramString1);
    paramContext = paramString1;
    if (paramString1 == null) {
      paramContext = localResources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
    }
    return String.format(localResources.getConfiguration().locale, paramContext, new Object[] { paramString2 });
  }
  
  private static String zai(Context paramContext, String paramString)
  {
    synchronized (zaa)
    {
      Object localObject = ConfigurationCompat.getLocales(paramContext.getResources().getConfiguration()).get(0);
      if (!((Locale)localObject).equals(zab))
      {
        ???.clear();
        zab = (Locale)localObject;
      }
      localObject = (String)???.get(paramString);
      if (localObject != null) {
        return (String)localObject;
      }
      paramContext = GooglePlayServicesUtil.getRemoteResource(paramContext);
      if (paramContext == null) {
        return null;
      }
      int i = paramContext.getIdentifier(paramString, "string", "com.google.android.gms");
      if (i == 0)
      {
        if (paramString.length() != 0) {
          paramContext = "Missing resource: ".concat(paramString);
        } else {
          paramContext = new String("Missing resource: ");
        }
        Log.w("GoogleApiAvailability", paramContext);
        return null;
      }
      paramContext = paramContext.getString(i);
      if (TextUtils.isEmpty(paramContext))
      {
        if (paramString.length() != 0) {
          paramContext = "Got empty resource: ".concat(paramString);
        } else {
          paramContext = new String("Got empty resource: ");
        }
        Log.w("GoogleApiAvailability", paramContext);
        return null;
      }
      ???.put(paramString, paramContext);
      return paramContext;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */