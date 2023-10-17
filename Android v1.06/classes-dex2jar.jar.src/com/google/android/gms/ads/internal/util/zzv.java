package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzt;

public class zzv
  extends zzu
{
  public final Intent zzg(Activity paramActivity)
  {
    if (paramActivity == null) {
      return null;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
    localIntent.putExtra("android.provider.extra.APP_PACKAGE", paramActivity.getPackageName());
    return localIntent;
  }
  
  public final void zzh(Context paramContext, String paramString1, String paramString2)
  {
    paramString1 = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
    paramString1.setShowBadge(false);
    ((NotificationManager)paramContext.getSystemService(NotificationManager.class)).createNotificationChannel(paramString1);
  }
  
  public final boolean zzi(Context paramContext, String paramString)
  {
    paramContext = ((NotificationManager)paramContext.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
    if (paramContext == null) {
      return false;
    }
    return paramContext.getImportance() == 0;
  }
  
  public final int zzj(Context paramContext, TelephonyManager paramTelephonyManager)
  {
    zzt.zzp();
    if ((zzs.zzw(paramContext, "android.permission.ACCESS_NETWORK_STATE")) && (paramTelephonyManager.isDataEnabled())) {
      return 2;
    }
    return 1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */