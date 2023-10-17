package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;

public class NotificationApiHelperForM
{
  static Parcelable[] getActiveNotifications(NotificationManager paramNotificationManager)
  {
    return paramNotificationManager.getActiveNotifications();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\NotificationApiHelperForM.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */