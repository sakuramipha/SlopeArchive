package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.ICustomTabsService.Stub;
import android.widget.RemoteViews;
import java.util.List;

public final class CustomTabsSession
{
  private static final String TAG = "CustomTabsSession";
  private final ICustomTabsCallback mCallback;
  private final ComponentName mComponentName;
  private final PendingIntent mId;
  private final Object mLock = new Object();
  private final ICustomTabsService mService;
  
  CustomTabsSession(ICustomTabsService paramICustomTabsService, ICustomTabsCallback paramICustomTabsCallback, ComponentName paramComponentName, PendingIntent paramPendingIntent)
  {
    this.mService = paramICustomTabsService;
    this.mCallback = paramICustomTabsCallback;
    this.mComponentName = paramComponentName;
    this.mId = paramPendingIntent;
  }
  
  private void addIdToBundle(Bundle paramBundle)
  {
    PendingIntent localPendingIntent = this.mId;
    if (localPendingIntent != null) {
      paramBundle.putParcelable("android.support.customtabs.extra.SESSION_ID", localPendingIntent);
    }
  }
  
  private Bundle createBundleWithId(Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    if (paramBundle != null) {
      localBundle.putAll(paramBundle);
    }
    addIdToBundle(localBundle);
    return localBundle;
  }
  
  public static CustomTabsSession createMockSessionForTesting(ComponentName paramComponentName)
  {
    return new CustomTabsSession(new MockSession(), new CustomTabsSessionToken.MockCallback(), paramComponentName, null);
  }
  
  IBinder getBinder()
  {
    return this.mCallback.asBinder();
  }
  
  ComponentName getComponentName()
  {
    return this.mComponentName;
  }
  
  PendingIntent getId()
  {
    return this.mId;
  }
  
  public boolean mayLaunchUrl(Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
  {
    paramBundle = createBundleWithId(paramBundle);
    try
    {
      boolean bool = this.mService.mayLaunchUrl(this.mCallback, paramUri, paramBundle, paramList);
      return bool;
    }
    catch (RemoteException paramUri) {}
    return false;
  }
  
  public int postMessage(String paramString, Bundle arg2)
  {
    Bundle localBundle = createBundleWithId(???);
    try
    {
      synchronized (this.mLock)
      {
        int i = this.mService.postMessage(this.mCallback, paramString, localBundle);
        return i;
      }
    }
    catch (RemoteException paramString)
    {
      return -2;
    }
  }
  
  public boolean receiveFile(Uri paramUri, int paramInt, Bundle paramBundle)
  {
    paramBundle = createBundleWithId(paramBundle);
    try
    {
      boolean bool = this.mService.receiveFile(this.mCallback, paramUri, paramInt, paramBundle);
      return bool;
    }
    catch (RemoteException paramUri) {}
    return false;
  }
  
  public boolean requestPostMessageChannel(Uri paramUri)
  {
    try
    {
      if (this.mId != null) {
        return this.mService.requestPostMessageChannelWithExtras(this.mCallback, paramUri, createBundleWithId(null));
      }
      boolean bool = this.mService.requestPostMessageChannel(this.mCallback, paramUri);
      return bool;
    }
    catch (RemoteException paramUri) {}
    return false;
  }
  
  public boolean setActionButton(Bitmap paramBitmap, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("android.support.customtabs.customaction.ICON", paramBitmap);
    localBundle.putString("android.support.customtabs.customaction.DESCRIPTION", paramString);
    paramBitmap = new Bundle();
    paramBitmap.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", localBundle);
    addIdToBundle(localBundle);
    try
    {
      boolean bool = this.mService.updateVisuals(this.mCallback, paramBitmap);
      return bool;
    }
    catch (RemoteException paramBitmap) {}
    return false;
  }
  
  public boolean setSecondaryToolbarViews(RemoteViews paramRemoteViews, int[] paramArrayOfInt, PendingIntent paramPendingIntent)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", paramRemoteViews);
    localBundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", paramArrayOfInt);
    localBundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", paramPendingIntent);
    addIdToBundle(localBundle);
    try
    {
      boolean bool = this.mService.updateVisuals(this.mCallback, localBundle);
      return bool;
    }
    catch (RemoteException paramRemoteViews) {}
    return false;
  }
  
  @Deprecated
  public boolean setToolbarItem(int paramInt, Bitmap paramBitmap, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("android.support.customtabs.customaction.ID", paramInt);
    localBundle.putParcelable("android.support.customtabs.customaction.ICON", paramBitmap);
    localBundle.putString("android.support.customtabs.customaction.DESCRIPTION", paramString);
    paramBitmap = new Bundle();
    paramBitmap.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", localBundle);
    addIdToBundle(paramBitmap);
    try
    {
      boolean bool = this.mService.updateVisuals(this.mCallback, paramBitmap);
      return bool;
    }
    catch (RemoteException paramBitmap) {}
    return false;
  }
  
  public boolean validateRelationship(int paramInt, Uri paramUri, Bundle paramBundle)
  {
    if ((paramInt >= 1) && (paramInt <= 2)) {
      paramBundle = createBundleWithId(paramBundle);
    }
    try
    {
      boolean bool = this.mService.validateRelationship(this.mCallback, paramInt, paramUri, paramBundle);
      return bool;
    }
    catch (RemoteException paramUri)
    {
      for (;;) {}
    }
    return false;
  }
  
  static class MockSession
    extends ICustomTabsService.Stub
  {
    public Bundle extraCommand(String paramString, Bundle paramBundle)
      throws RemoteException
    {
      return null;
    }
    
    public boolean mayLaunchUrl(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
      throws RemoteException
    {
      return false;
    }
    
    public boolean newSession(ICustomTabsCallback paramICustomTabsCallback)
      throws RemoteException
    {
      return false;
    }
    
    public boolean newSessionWithExtras(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
      throws RemoteException
    {
      return false;
    }
    
    public int postMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
      throws RemoteException
    {
      return 0;
    }
    
    public boolean receiveFile(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, int paramInt, Bundle paramBundle)
      throws RemoteException
    {
      return false;
    }
    
    public boolean requestPostMessageChannel(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri)
      throws RemoteException
    {
      return false;
    }
    
    public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle)
      throws RemoteException
    {
      return false;
    }
    
    public boolean updateVisuals(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
      throws RemoteException
    {
      return false;
    }
    
    public boolean validateRelationship(ICustomTabsCallback paramICustomTabsCallback, int paramInt, Uri paramUri, Bundle paramBundle)
      throws RemoteException
    {
      return false;
    }
    
    public boolean warmup(long paramLong)
      throws RemoteException
    {
      return false;
    }
  }
  
  public static class PendingSession
  {
    private final CustomTabsCallback mCallback;
    private final PendingIntent mId;
    
    PendingSession(CustomTabsCallback paramCustomTabsCallback, PendingIntent paramPendingIntent)
    {
      this.mCallback = paramCustomTabsCallback;
      this.mId = paramPendingIntent;
    }
    
    CustomTabsCallback getCallback()
    {
      return this.mCallback;
    }
    
    PendingIntent getId()
    {
      return this.mId;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\CustomTabsSession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */