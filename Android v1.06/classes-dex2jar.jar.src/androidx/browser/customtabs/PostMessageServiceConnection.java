package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsCallback.Stub;
import android.support.customtabs.IPostMessageService;
import android.support.customtabs.IPostMessageService.Stub;
import android.util.Log;

public abstract class PostMessageServiceConnection
  implements PostMessageBackend, ServiceConnection
{
  private static final String TAG = "PostMessageServConn";
  private final Object mLock = new Object();
  private boolean mMessageChannelCreated;
  private String mPackageName;
  private IPostMessageService mService;
  private final ICustomTabsCallback mSessionBinder;
  
  public PostMessageServiceConnection(CustomTabsSessionToken paramCustomTabsSessionToken)
  {
    paramCustomTabsSessionToken = paramCustomTabsSessionToken.getCallbackBinder();
    if (paramCustomTabsSessionToken != null)
    {
      this.mSessionBinder = ICustomTabsCallback.Stub.asInterface(paramCustomTabsSessionToken);
      return;
    }
    throw new IllegalArgumentException("Provided session must have binder.");
  }
  
  private boolean isBoundToService()
  {
    boolean bool;
    if (this.mService != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean notifyMessageChannelReadyInternal(Bundle paramBundle)
  {
    if (this.mService == null) {
      return false;
    }
    try
    {
      synchronized (this.mLock)
      {
        this.mService.onMessageChannelReady(this.mSessionBinder, paramBundle);
        return true;
      }
    }
    catch (RemoteException paramBundle)
    {
      return false;
    }
  }
  
  public boolean bindSessionToPostMessageService(Context paramContext)
  {
    String str = this.mPackageName;
    if (str != null) {
      return bindSessionToPostMessageService(paramContext, str);
    }
    throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
  }
  
  public boolean bindSessionToPostMessageService(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramString, PostMessageService.class.getName());
    boolean bool = paramContext.bindService(localIntent, this, 1);
    if (!bool) {
      Log.w("PostMessageServConn", "Could not bind to PostMessageService in client.");
    }
    return bool;
  }
  
  public void cleanup(Context paramContext)
  {
    if (isBoundToService()) {
      unbindFromContext(paramContext);
    }
  }
  
  public final boolean notifyMessageChannelReady(Bundle paramBundle)
  {
    this.mMessageChannelCreated = true;
    return notifyMessageChannelReadyInternal(paramBundle);
  }
  
  public void onDisconnectChannel(Context paramContext)
  {
    unbindFromContext(paramContext);
  }
  
  public final boolean onNotifyMessageChannelReady(Bundle paramBundle)
  {
    return notifyMessageChannelReady(paramBundle);
  }
  
  public final boolean onPostMessage(String paramString, Bundle paramBundle)
  {
    return postMessage(paramString, paramBundle);
  }
  
  public void onPostMessageServiceConnected()
  {
    if (this.mMessageChannelCreated) {
      notifyMessageChannelReadyInternal(null);
    }
  }
  
  public void onPostMessageServiceDisconnected() {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.mService = IPostMessageService.Stub.asInterface(paramIBinder);
    onPostMessageServiceConnected();
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.mService = null;
    onPostMessageServiceDisconnected();
  }
  
  public final boolean postMessage(String paramString, Bundle paramBundle)
  {
    if (this.mService == null) {
      return false;
    }
    try
    {
      synchronized (this.mLock)
      {
        this.mService.onPostMessage(this.mSessionBinder, paramString, paramBundle);
        return true;
      }
    }
    catch (RemoteException paramString)
    {
      return false;
    }
  }
  
  public void setPackageName(String paramString)
  {
    this.mPackageName = paramString;
  }
  
  public void unbindFromContext(Context paramContext)
  {
    if (isBoundToService())
    {
      paramContext.unbindService(this);
      this.mService = null;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\PostMessageServiceConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */