package androidx.browser.trusted;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

class NotificationApiHelperForO
{
  static Notification copyNotificationOntoChannel(Context paramContext, NotificationManager paramNotificationManager, Notification paramNotification, String paramString1, String paramString2)
  {
    paramNotificationManager.createNotificationChannel(new NotificationChannel(paramString1, paramString2, 3));
    if (paramNotificationManager.getNotificationChannel(paramString1).getImportance() == 0) {
      return null;
    }
    paramContext = Notification.Builder.recoverBuilder(paramContext, paramNotification);
    paramContext.setChannelId(paramString1);
    return paramContext.build();
  }
  
  static boolean isChannelEnabled(NotificationManager paramNotificationManager, String paramString)
  {
    paramNotificationManager = paramNotificationManager.getNotificationChannel(paramString);
    boolean bool;
    if ((paramNotificationManager != null) && (paramNotificationManager.getImportance() == 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\NotificationApiHelperForO.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */