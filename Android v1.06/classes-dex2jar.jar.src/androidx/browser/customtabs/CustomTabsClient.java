package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback.Stub;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomTabsClient
{
  private static final String TAG = "CustomTabsClient";
  private final Context mApplicationContext;
  private final ICustomTabsService mService;
  private final ComponentName mServiceComponentName;
  
  CustomTabsClient(ICustomTabsService paramICustomTabsService, ComponentName paramComponentName, Context paramContext)
  {
    this.mService = paramICustomTabsService;
    this.mServiceComponentName = paramComponentName;
    this.mApplicationContext = paramContext;
  }
  
  public static boolean bindCustomTabsService(Context paramContext, String paramString, CustomTabsServiceConnection paramCustomTabsServiceConnection)
  {
    paramCustomTabsServiceConnection.setApplicationContext(paramContext.getApplicationContext());
    Intent localIntent = new Intent("android.support.customtabs.action.CustomTabsService");
    if (!TextUtils.isEmpty(paramString)) {
      localIntent.setPackage(paramString);
    }
    return paramContext.bindService(localIntent, paramCustomTabsServiceConnection, 33);
  }
  
  public static boolean bindCustomTabsServicePreservePriority(Context paramContext, String paramString, CustomTabsServiceConnection paramCustomTabsServiceConnection)
  {
    paramCustomTabsServiceConnection.setApplicationContext(paramContext.getApplicationContext());
    Intent localIntent = new Intent("android.support.customtabs.action.CustomTabsService");
    if (!TextUtils.isEmpty(paramString)) {
      localIntent.setPackage(paramString);
    }
    return paramContext.bindService(localIntent, paramCustomTabsServiceConnection, 1);
  }
  
  public static boolean connectAndInitialize(Context paramContext, String paramString)
  {
    if (paramString == null) {
      return false;
    }
    paramContext = paramContext.getApplicationContext();
    CustomTabsServiceConnection local1 = new CustomTabsServiceConnection()
    {
      public final void onCustomTabsServiceConnected(ComponentName paramAnonymousComponentName, CustomTabsClient paramAnonymousCustomTabsClient)
      {
        paramAnonymousCustomTabsClient.warmup(0L);
        CustomTabsClient.this.unbindService(this);
      }
      
      public void onServiceDisconnected(ComponentName paramAnonymousComponentName) {}
    };
    try
    {
      boolean bool = bindCustomTabsService(paramContext, paramString, local1);
      return bool;
    }
    catch (SecurityException paramContext) {}
    return false;
  }
  
  private ICustomTabsCallback.Stub createCallbackWrapper(final CustomTabsCallback paramCustomTabsCallback)
  {
    new ICustomTabsCallback.Stub()
    {
      private Handler mHandler = new Handler(Looper.getMainLooper());
      
      public void extraCallback(final String paramAnonymousString, final Bundle paramAnonymousBundle)
        throws RemoteException
      {
        if (paramCustomTabsCallback == null) {
          return;
        }
        this.mHandler.post(new Runnable()
        {
          public void run()
          {
            CustomTabsClient.2.this.val$callback.extraCallback(paramAnonymousString, paramAnonymousBundle);
          }
        });
      }
      
      public Bundle extraCallbackWithResult(String paramAnonymousString, Bundle paramAnonymousBundle)
        throws RemoteException
      {
        CustomTabsCallback localCustomTabsCallback = paramCustomTabsCallback;
        if (localCustomTabsCallback == null) {
          return null;
        }
        return localCustomTabsCallback.extraCallbackWithResult(paramAnonymousString, paramAnonymousBundle);
      }
      
      public void onMessageChannelReady(final Bundle paramAnonymousBundle)
        throws RemoteException
      {
        if (paramCustomTabsCallback == null) {
          return;
        }
        this.mHandler.post(new Runnable()
        {
          public void run()
          {
            CustomTabsClient.2.this.val$callback.onMessageChannelReady(paramAnonymousBundle);
          }
        });
      }
      
      public void onNavigationEvent(final int paramAnonymousInt, final Bundle paramAnonymousBundle)
      {
        if (paramCustomTabsCallback == null) {
          return;
        }
        this.mHandler.post(new Runnable()
        {
          public void run()
          {
            CustomTabsClient.2.this.val$callback.onNavigationEvent(paramAnonymousInt, paramAnonymousBundle);
          }
        });
      }
      
      public void onPostMessage(final String paramAnonymousString, final Bundle paramAnonymousBundle)
        throws RemoteException
      {
        if (paramCustomTabsCallback == null) {
          return;
        }
        this.mHandler.post(new Runnable()
        {
          public void run()
          {
            CustomTabsClient.2.this.val$callback.onPostMessage(paramAnonymousString, paramAnonymousBundle);
          }
        });
      }
      
      public void onRelationshipValidationResult(final int paramAnonymousInt, final Uri paramAnonymousUri, final boolean paramAnonymousBoolean, final Bundle paramAnonymousBundle)
        throws RemoteException
      {
        if (paramCustomTabsCallback == null) {
          return;
        }
        this.mHandler.post(new Runnable()
        {
          public void run()
          {
            CustomTabsClient.2.this.val$callback.onRelationshipValidationResult(paramAnonymousInt, paramAnonymousUri, paramAnonymousBoolean, paramAnonymousBundle);
          }
        });
      }
    };
  }
  
  private static PendingIntent createSessionId(Context paramContext, int paramInt)
  {
    return PendingIntent.getActivity(paramContext, paramInt, new Intent(), 67108864);
  }
  
  public static String getPackageName(Context paramContext, List<String> paramList)
  {
    return getPackageName(paramContext, paramList, false);
  }
  
  public static String getPackageName(Context paramContext, List<String> paramList, boolean paramBoolean)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (paramList == null) {
      paramContext = new ArrayList();
    } else {
      paramContext = paramList;
    }
    Object localObject2 = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
    Object localObject1 = paramContext;
    if (!paramBoolean)
    {
      localObject2 = localPackageManager.resolveActivity((Intent)localObject2, 0);
      localObject1 = paramContext;
      if (localObject2 != null)
      {
        localObject2 = ((ResolveInfo)localObject2).activityInfo.packageName;
        localObject1 = new ArrayList(paramContext.size() + 1);
        ((List)localObject1).add(localObject2);
        if (paramList != null) {
          ((List)localObject1).addAll(paramList);
        }
      }
    }
    paramContext = new Intent("android.support.customtabs.action.CustomTabsService");
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramList = (String)((Iterator)localObject1).next();
      paramContext.setPackage(paramList);
      if (localPackageManager.resolveService(paramContext, 0) != null) {
        return paramList;
      }
    }
    if (Build.VERSION.SDK_INT >= 30) {
      Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
    }
    return null;
  }
  
  public static CustomTabsSession.PendingSession newPendingSession(Context paramContext, CustomTabsCallback paramCustomTabsCallback, int paramInt)
  {
    return new CustomTabsSession.PendingSession(paramCustomTabsCallback, createSessionId(paramContext, paramInt));
  }
  
  private CustomTabsSession newSessionInternal(CustomTabsCallback paramCustomTabsCallback, PendingIntent paramPendingIntent)
  {
    ICustomTabsCallback.Stub localStub = createCallbackWrapper(paramCustomTabsCallback);
    paramCustomTabsCallback = null;
    if (paramPendingIntent != null) {}
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putParcelable("android.support.customtabs.extra.SESSION_ID", paramPendingIntent);
      boolean bool = this.mService.newSessionWithExtras(localStub, localBundle);
      break label60;
      bool = this.mService.newSession(localStub);
      label60:
      if (!bool) {
        return null;
      }
      paramCustomTabsCallback = new CustomTabsSession(this.mService, localStub, this.mServiceComponentName, paramPendingIntent);
    }
    catch (RemoteException paramPendingIntent)
    {
      for (;;) {}
    }
    return paramCustomTabsCallback;
  }
  
  public CustomTabsSession attachSession(CustomTabsSession.PendingSession paramPendingSession)
  {
    return newSessionInternal(paramPendingSession.getCallback(), paramPendingSession.getId());
  }
  
  public Bundle extraCommand(String paramString, Bundle paramBundle)
  {
    try
    {
      paramString = this.mService.extraCommand(paramString, paramBundle);
      return paramString;
    }
    catch (RemoteException paramString) {}
    return null;
  }
  
  public CustomTabsSession newSession(CustomTabsCallback paramCustomTabsCallback)
  {
    return newSessionInternal(paramCustomTabsCallback, null);
  }
  
  public CustomTabsSession newSession(CustomTabsCallback paramCustomTabsCallback, int paramInt)
  {
    return newSessionInternal(paramCustomTabsCallback, createSessionId(this.mApplicationContext, paramInt));
  }
  
  public boolean warmup(long paramLong)
  {
    try
    {
      boolean bool = this.mService.warmup(paramLong);
      return bool;
    }
    catch (RemoteException localRemoteException) {}
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\CustomTabsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */