package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService.Stub;
import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;

public abstract class TrustedWebActivityService
  extends Service
{
  public static final String ACTION_TRUSTED_WEB_ACTIVITY_SERVICE = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
  public static final String KEY_SMALL_ICON_BITMAP = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
  public static final String KEY_SUCCESS = "androidx.browser.trusted.SUCCESS";
  public static final String META_DATA_NAME_SMALL_ICON = "android.support.customtabs.trusted.SMALL_ICON";
  public static final int SMALL_ICON_NOT_SET = -1;
  private final ITrustedWebActivityService.Stub mBinder = new ITrustedWebActivityService.Stub()
  {
    private void checkCaller()
    {
      if (TrustedWebActivityService.this.mVerifiedUid == -1)
      {
        Object localObject2 = TrustedWebActivityService.this.getPackageManager().getPackagesForUid(getCallingUid());
        int i = 0;
        Object localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new String[0];
        }
        Token localToken = TrustedWebActivityService.this.getTokenStore().load();
        localObject2 = TrustedWebActivityService.this.getPackageManager();
        if (localToken != null)
        {
          int j = localObject1.length;
          while (i < j)
          {
            if (localToken.matches(localObject1[i], (PackageManager)localObject2))
            {
              TrustedWebActivityService.this.mVerifiedUid = getCallingUid();
              break;
            }
            i++;
          }
        }
      }
      if (TrustedWebActivityService.this.mVerifiedUid == getCallingUid()) {
        return;
      }
      throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
    }
    
    public Bundle areNotificationsEnabled(Bundle paramAnonymousBundle)
    {
      checkCaller();
      paramAnonymousBundle = TrustedWebActivityServiceConnection.NotificationsEnabledArgs.fromBundle(paramAnonymousBundle);
      return new TrustedWebActivityServiceConnection.ResultArgs(TrustedWebActivityService.this.onAreNotificationsEnabled(paramAnonymousBundle.channelName)).toBundle();
    }
    
    public void cancelNotification(Bundle paramAnonymousBundle)
    {
      checkCaller();
      paramAnonymousBundle = TrustedWebActivityServiceConnection.CancelNotificationArgs.fromBundle(paramAnonymousBundle);
      TrustedWebActivityService.this.onCancelNotification(paramAnonymousBundle.platformTag, paramAnonymousBundle.platformId);
    }
    
    public Bundle extraCommand(String paramAnonymousString, Bundle paramAnonymousBundle, IBinder paramAnonymousIBinder)
    {
      checkCaller();
      return TrustedWebActivityService.this.onExtraCommand(paramAnonymousString, paramAnonymousBundle, TrustedWebActivityCallbackRemote.fromBinder(paramAnonymousIBinder));
    }
    
    public Bundle getActiveNotifications()
    {
      checkCaller();
      return new TrustedWebActivityServiceConnection.ActiveNotificationsArgs(TrustedWebActivityService.this.onGetActiveNotifications()).toBundle();
    }
    
    public Bundle getSmallIconBitmap()
    {
      checkCaller();
      return TrustedWebActivityService.this.onGetSmallIconBitmap();
    }
    
    public int getSmallIconId()
    {
      checkCaller();
      return TrustedWebActivityService.this.onGetSmallIconId();
    }
    
    public Bundle notifyNotificationWithChannel(Bundle paramAnonymousBundle)
    {
      checkCaller();
      paramAnonymousBundle = TrustedWebActivityServiceConnection.NotifyNotificationArgs.fromBundle(paramAnonymousBundle);
      return new TrustedWebActivityServiceConnection.ResultArgs(TrustedWebActivityService.this.onNotifyNotificationWithChannel(paramAnonymousBundle.platformTag, paramAnonymousBundle.platformId, paramAnonymousBundle.notification, paramAnonymousBundle.channelName)).toBundle();
    }
  };
  private NotificationManager mNotificationManager;
  int mVerifiedUid = -1;
  
  private static String channelNameToId(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString.toLowerCase(Locale.ROOT).replace(' ', '_'));
    localStringBuilder.append("_channel_id");
    return localStringBuilder.toString();
  }
  
  private void ensureOnCreateCalled()
  {
    if (this.mNotificationManager != null) {
      return;
    }
    throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
  }
  
  public abstract TokenStore getTokenStore();
  
  public boolean onAreNotificationsEnabled(String paramString)
  {
    ensureOnCreateCalled();
    if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
      return false;
    }
    if (Build.VERSION.SDK_INT < 26) {
      return true;
    }
    return NotificationApiHelperForO.isChannelEnabled(this.mNotificationManager, channelNameToId(paramString));
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return this.mBinder;
  }
  
  public void onCancelNotification(String paramString, int paramInt)
  {
    ensureOnCreateCalled();
    this.mNotificationManager.cancel(paramString, paramInt);
  }
  
  public void onCreate()
  {
    super.onCreate();
    this.mNotificationManager = ((NotificationManager)getSystemService("notification"));
  }
  
  public Bundle onExtraCommand(String paramString, Bundle paramBundle, TrustedWebActivityCallbackRemote paramTrustedWebActivityCallbackRemote)
  {
    return null;
  }
  
  public Parcelable[] onGetActiveNotifications()
  {
    ensureOnCreateCalled();
    if (Build.VERSION.SDK_INT >= 23) {
      return NotificationApiHelperForM.getActiveNotifications(this.mNotificationManager);
    }
    throw new IllegalStateException("onGetActiveNotifications cannot be called pre-M.");
  }
  
  public Bundle onGetSmallIconBitmap()
  {
    int i = onGetSmallIconId();
    Bundle localBundle = new Bundle();
    if (i == -1) {
      return localBundle;
    }
    localBundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), i));
    return localBundle;
  }
  
  public int onGetSmallIconId()
  {
    j = -1;
    try
    {
      Object localObject = getPackageManager();
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(this, getClass());
      localObject = ((PackageManager)localObject).getServiceInfo(localComponentName, 128);
      if (((ServiceInfo)localObject).metaData == null) {
        return -1;
      }
      i = ((ServiceInfo)localObject).metaData.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        int i = j;
      }
    }
    return i;
  }
  
  public boolean onNotifyNotificationWithChannel(String paramString1, int paramInt, Notification paramNotification, String paramString2)
  {
    ensureOnCreateCalled();
    if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
      return false;
    }
    Notification localNotification = paramNotification;
    if (Build.VERSION.SDK_INT >= 26)
    {
      String str = channelNameToId(paramString2);
      localNotification = NotificationApiHelperForO.copyNotificationOntoChannel(this, this.mNotificationManager, paramNotification, str, paramString2);
      if (!NotificationApiHelperForO.isChannelEnabled(this.mNotificationManager, str)) {
        return false;
      }
    }
    this.mNotificationManager.notify(paramString1, paramInt, localNotification);
    return true;
  }
  
  public final boolean onUnbind(Intent paramIntent)
  {
    this.mVerifiedUid = -1;
    return super.onUnbind(paramIntent);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\TrustedWebActivityService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */