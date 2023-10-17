package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;

public final class zzbir
{
  public static final Intent zza(Uri paramUri, Context paramContext, zzaqq paramzzaqq, View paramView)
  {
    if (paramUri == null) {
      return null;
    }
    paramContext = new Intent("android.intent.action.VIEW");
    paramContext.addFlags(268435456);
    paramContext.setData(paramUri);
    paramContext.setAction("android.intent.action.VIEW");
    return paramContext;
  }
  
  public static final Intent zzb(Intent paramIntent, ResolveInfo paramResolveInfo, Context paramContext, zzaqq paramzzaqq, View paramView)
  {
    paramIntent = new Intent(paramIntent);
    paramIntent.setClassName(paramResolveInfo.activityInfo.packageName, paramResolveInfo.activityInfo.name);
    return paramIntent;
  }
  
  public static final ResolveInfo zzc(Intent paramIntent, Context paramContext, zzaqq paramzzaqq, View paramView)
  {
    return zzd(paramIntent, new ArrayList(), paramContext, paramzzaqq, paramView);
  }
  
  public static final ResolveInfo zzd(Intent paramIntent, ArrayList paramArrayList, Context paramContext, zzaqq paramzzaqq, View paramView)
  {
    paramView = null;
    Object localObject = null;
    paramzzaqq = paramView;
    try
    {
      paramContext = paramContext.getPackageManager();
      if (paramContext == null) {
        return null;
      }
      paramzzaqq = paramView;
      List localList = paramContext.queryIntentActivities(paramIntent, 65536);
      paramzzaqq = paramView;
      paramContext = paramContext.resolveActivity(paramIntent, 65536);
      paramIntent = (Intent)localObject;
      if (localList != null)
      {
        paramIntent = (Intent)localObject;
        if (paramContext != null) {
          for (int i = 0;; i++)
          {
            paramIntent = (Intent)localObject;
            paramzzaqq = paramView;
            if (i >= localList.size()) {
              break;
            }
            paramzzaqq = paramView;
            paramIntent = (ResolveInfo)localList.get(i);
            paramzzaqq = paramView;
            if (paramContext.activityInfo.name.equals(paramIntent.activityInfo.name))
            {
              paramIntent = paramContext;
              break;
            }
          }
        }
      }
      paramzzaqq = paramIntent;
      paramArrayList.addAll(localList);
    }
    finally
    {
      zzt.zzo().zzu(paramIntent, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
      paramIntent = paramzzaqq;
    }
    return paramIntent;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */