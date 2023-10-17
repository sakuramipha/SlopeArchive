package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityCallback.Stub;
import android.support.customtabs.trusted.ITrustedWebActivityService;

public final class TrustedWebActivityServiceConnection
{
  private static final String KEY_ACTIVE_NOTIFICATIONS = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";
  private static final String KEY_CHANNEL_NAME = "android.support.customtabs.trusted.CHANNEL_NAME";
  private static final String KEY_NOTIFICATION = "android.support.customtabs.trusted.NOTIFICATION";
  private static final String KEY_NOTIFICATION_SUCCESS = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";
  private static final String KEY_PLATFORM_ID = "android.support.customtabs.trusted.PLATFORM_ID";
  private static final String KEY_PLATFORM_TAG = "android.support.customtabs.trusted.PLATFORM_TAG";
  private final ComponentName mComponentName;
  private final ITrustedWebActivityService mService;
  
  TrustedWebActivityServiceConnection(ITrustedWebActivityService paramITrustedWebActivityService, ComponentName paramComponentName)
  {
    this.mService = paramITrustedWebActivityService;
    this.mComponentName = paramComponentName;
  }
  
  static void ensureBundleContains(Bundle paramBundle, String paramString)
  {
    if (paramBundle.containsKey(paramString)) {
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Bundle must contain ");
    paramBundle.append(paramString);
    throw new IllegalArgumentException(paramBundle.toString());
  }
  
  private static ITrustedWebActivityCallback wrapCallback(TrustedWebActivityCallback paramTrustedWebActivityCallback)
  {
    if (paramTrustedWebActivityCallback == null) {
      return null;
    }
    new ITrustedWebActivityCallback.Stub()
    {
      public void onExtraCallback(String paramAnonymousString, Bundle paramAnonymousBundle)
        throws RemoteException
      {
        TrustedWebActivityServiceConnection.this.onExtraCallback(paramAnonymousString, paramAnonymousBundle);
      }
    };
  }
  
  public boolean areNotificationsEnabled(String paramString)
    throws RemoteException
  {
    paramString = new NotificationsEnabledArgs(paramString).toBundle();
    return ResultArgs.fromBundle(this.mService.areNotificationsEnabled(paramString)).success;
  }
  
  public void cancel(String paramString, int paramInt)
    throws RemoteException
  {
    paramString = new CancelNotificationArgs(paramString, paramInt).toBundle();
    this.mService.cancelNotification(paramString);
  }
  
  public Parcelable[] getActiveNotifications()
    throws RemoteException
  {
    return ActiveNotificationsArgs.fromBundle(this.mService.getActiveNotifications()).notifications;
  }
  
  public ComponentName getComponentName()
  {
    return this.mComponentName;
  }
  
  public Bitmap getSmallIconBitmap()
    throws RemoteException
  {
    return (Bitmap)this.mService.getSmallIconBitmap().getParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP");
  }
  
  public int getSmallIconId()
    throws RemoteException
  {
    return this.mService.getSmallIconId();
  }
  
  public boolean notify(String paramString1, int paramInt, Notification paramNotification, String paramString2)
    throws RemoteException
  {
    paramString1 = new NotifyNotificationArgs(paramString1, paramInt, paramNotification, paramString2).toBundle();
    return ResultArgs.fromBundle(this.mService.notifyNotificationWithChannel(paramString1)).success;
  }
  
  public Bundle sendExtraCommand(String paramString, Bundle paramBundle, TrustedWebActivityCallback paramTrustedWebActivityCallback)
    throws RemoteException
  {
    paramTrustedWebActivityCallback = wrapCallback(paramTrustedWebActivityCallback);
    if (paramTrustedWebActivityCallback == null) {
      paramTrustedWebActivityCallback = null;
    } else {
      paramTrustedWebActivityCallback = paramTrustedWebActivityCallback.asBinder();
    }
    return this.mService.extraCommand(paramString, paramBundle, paramTrustedWebActivityCallback);
  }
  
  static class ActiveNotificationsArgs
  {
    public final Parcelable[] notifications;
    
    ActiveNotificationsArgs(Parcelable[] paramArrayOfParcelable)
    {
      this.notifications = paramArrayOfParcelable;
    }
    
    public static ActiveNotificationsArgs fromBundle(Bundle paramBundle)
    {
      TrustedWebActivityServiceConnection.ensureBundleContains(paramBundle, "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS");
      return new ActiveNotificationsArgs(paramBundle.getParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"));
    }
    
    public Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.notifications);
      return localBundle;
    }
  }
  
  static class CancelNotificationArgs
  {
    public final int platformId;
    public final String platformTag;
    
    CancelNotificationArgs(String paramString, int paramInt)
    {
      this.platformTag = paramString;
      this.platformId = paramInt;
    }
    
    public static CancelNotificationArgs fromBundle(Bundle paramBundle)
    {
      TrustedWebActivityServiceConnection.ensureBundleContains(paramBundle, "android.support.customtabs.trusted.PLATFORM_TAG");
      TrustedWebActivityServiceConnection.ensureBundleContains(paramBundle, "android.support.customtabs.trusted.PLATFORM_ID");
      return new CancelNotificationArgs(paramBundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), paramBundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
    }
    
    public Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", this.platformTag);
      localBundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.platformId);
      return localBundle;
    }
  }
  
  static class NotificationsEnabledArgs
  {
    public final String channelName;
    
    NotificationsEnabledArgs(String paramString)
    {
      this.channelName = paramString;
    }
    
    public static NotificationsEnabledArgs fromBundle(Bundle paramBundle)
    {
      TrustedWebActivityServiceConnection.ensureBundleContains(paramBundle, "android.support.customtabs.trusted.CHANNEL_NAME");
      return new NotificationsEnabledArgs(paramBundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
    }
    
    public Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", this.channelName);
      return localBundle;
    }
  }
  
  static class NotifyNotificationArgs
  {
    public final String channelName;
    public final Notification notification;
    public final int platformId;
    public final String platformTag;
    
    NotifyNotificationArgs(String paramString1, int paramInt, Notification paramNotification, String paramString2)
    {
      this.platformTag = paramString1;
      this.platformId = paramInt;
      this.notification = paramNotification;
      this.channelName = paramString2;
    }
    
    public static NotifyNotificationArgs fromBundle(Bundle paramBundle)
    {
      TrustedWebActivityServiceConnection.ensureBundleContains(paramBundle, "android.support.customtabs.trusted.PLATFORM_TAG");
      TrustedWebActivityServiceConnection.ensureBundleContains(paramBundle, "android.support.customtabs.trusted.PLATFORM_ID");
      TrustedWebActivityServiceConnection.ensureBundleContains(paramBundle, "android.support.customtabs.trusted.NOTIFICATION");
      TrustedWebActivityServiceConnection.ensureBundleContains(paramBundle, "android.support.customtabs.trusted.CHANNEL_NAME");
      return new NotifyNotificationArgs(paramBundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), paramBundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification)paramBundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), paramBundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
    }
    
    public Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", this.platformTag);
      localBundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.platformId);
      localBundle.putParcelable("android.support.customtabs.trusted.NOTIFICATION", this.notification);
      localBundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", this.channelName);
      return localBundle;
    }
  }
  
  static class ResultArgs
  {
    public final boolean success;
    
    ResultArgs(boolean paramBoolean)
    {
      this.success = paramBoolean;
    }
    
    public static ResultArgs fromBundle(Bundle paramBundle)
    {
      TrustedWebActivityServiceConnection.ensureBundleContains(paramBundle, "android.support.customtabs.trusted.NOTIFICATION_SUCCESS");
      return new ResultArgs(paramBundle.getBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS"));
    }
    
    public Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.success);
      return localBundle;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\TrustedWebActivityServiceConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */