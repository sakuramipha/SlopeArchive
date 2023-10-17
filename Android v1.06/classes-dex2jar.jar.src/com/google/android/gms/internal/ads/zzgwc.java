package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzgwc
{
  private static String zza;
  
  public static String zza(Context paramContext)
  {
    Object localObject1 = zza;
    if (localObject1 != null) {
      return (String)localObject1;
    }
    Object localObject3 = paramContext.getPackageManager();
    Object localObject2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
    localObject1 = ((PackageManager)localObject3).resolveActivity((Intent)localObject2, 0);
    if (localObject1 != null) {
      localObject1 = ((ResolveInfo)localObject1).activityInfo.packageName;
    } else {
      localObject1 = null;
    }
    Object localObject4 = ((PackageManager)localObject3).queryIntentActivities((Intent)localObject2, 0);
    ArrayList localArrayList = new ArrayList();
    localObject4 = ((List)localObject4).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      ResolveInfo localResolveInfo = (ResolveInfo)((Iterator)localObject4).next();
      Intent localIntent = new Intent();
      localIntent.setAction("android.support.customtabs.action.CustomTabsService");
      localIntent.setPackage(localResolveInfo.activityInfo.packageName);
      if (((PackageManager)localObject3).resolveService(localIntent, 0) != null) {
        localArrayList.add(localResolveInfo.activityInfo.packageName);
      }
    }
    if (localArrayList.isEmpty())
    {
      zza = null;
    }
    else if (localArrayList.size() == 1)
    {
      zza = (String)localArrayList.get(0);
    }
    else
    {
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        try
        {
          paramContext = paramContext.getPackageManager().queryIntentActivities((Intent)localObject2, 64);
          if ((paramContext != null) && (paramContext.size() != 0))
          {
            paramContext = paramContext.iterator();
            do
            {
              do
              {
                if (!paramContext.hasNext()) {
                  break;
                }
                localObject2 = (ResolveInfo)paramContext.next();
                localObject3 = ((ResolveInfo)localObject2).filter;
              } while ((localObject3 == null) || (((IntentFilter)localObject3).countDataAuthorities() == 0) || (((IntentFilter)localObject3).countDataPaths() == 0));
              localObject2 = ((ResolveInfo)localObject2).activityInfo;
            } while (localObject2 == null);
          }
        }
        catch (RuntimeException paramContext)
        {
          Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
          if (localArrayList.contains(localObject1))
          {
            zza = (String)localObject1;
            break label404;
          }
        }
      }
      if (localArrayList.contains("com.android.chrome")) {
        zza = "com.android.chrome";
      } else if (localArrayList.contains("com.chrome.beta")) {
        zza = "com.chrome.beta";
      } else if (localArrayList.contains("com.chrome.dev")) {
        zza = "com.chrome.dev";
      } else if (localArrayList.contains("com.google.android.apps.chrome")) {
        zza = "com.google.android.apps.chrome";
      }
    }
    label404:
    return zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgwc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */