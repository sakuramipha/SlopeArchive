package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsCallback.Stub;
import android.util.Log;
import androidx.core.app.BundleCompat;

public class CustomTabsSessionToken
{
  private static final String TAG = "CustomTabsSessionToken";
  private final CustomTabsCallback mCallback;
  final ICustomTabsCallback mCallbackBinder;
  private final PendingIntent mSessionId;
  
  CustomTabsSessionToken(ICustomTabsCallback paramICustomTabsCallback, PendingIntent paramPendingIntent)
  {
    if ((paramICustomTabsCallback == null) && (paramPendingIntent == null)) {
      throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
    }
    this.mCallbackBinder = paramICustomTabsCallback;
    this.mSessionId = paramPendingIntent;
    if (paramICustomTabsCallback == null) {
      paramICustomTabsCallback = null;
    } else {
      paramICustomTabsCallback = new CustomTabsCallback()
      {
        public void extraCallback(String paramAnonymousString, Bundle paramAnonymousBundle)
        {
          try
          {
            CustomTabsSessionToken.this.mCallbackBinder.extraCallback(paramAnonymousString, paramAnonymousBundle);
          }
          catch (RemoteException paramAnonymousString)
          {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
          }
        }
        
        public Bundle extraCallbackWithResult(String paramAnonymousString, Bundle paramAnonymousBundle)
        {
          try
          {
            paramAnonymousString = CustomTabsSessionToken.this.mCallbackBinder.extraCallbackWithResult(paramAnonymousString, paramAnonymousBundle);
            return paramAnonymousString;
          }
          catch (RemoteException paramAnonymousString)
          {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
          }
          return null;
        }
        
        public void onMessageChannelReady(Bundle paramAnonymousBundle)
        {
          try
          {
            CustomTabsSessionToken.this.mCallbackBinder.onMessageChannelReady(paramAnonymousBundle);
          }
          catch (RemoteException paramAnonymousBundle)
          {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
          }
        }
        
        public void onNavigationEvent(int paramAnonymousInt, Bundle paramAnonymousBundle)
        {
          try
          {
            CustomTabsSessionToken.this.mCallbackBinder.onNavigationEvent(paramAnonymousInt, paramAnonymousBundle);
          }
          catch (RemoteException paramAnonymousBundle)
          {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
          }
        }
        
        public void onPostMessage(String paramAnonymousString, Bundle paramAnonymousBundle)
        {
          try
          {
            CustomTabsSessionToken.this.mCallbackBinder.onPostMessage(paramAnonymousString, paramAnonymousBundle);
          }
          catch (RemoteException paramAnonymousString)
          {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
          }
        }
        
        public void onRelationshipValidationResult(int paramAnonymousInt, Uri paramAnonymousUri, boolean paramAnonymousBoolean, Bundle paramAnonymousBundle)
        {
          try
          {
            CustomTabsSessionToken.this.mCallbackBinder.onRelationshipValidationResult(paramAnonymousInt, paramAnonymousUri, paramAnonymousBoolean, paramAnonymousBundle);
          }
          catch (RemoteException paramAnonymousUri)
          {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
          }
        }
      };
    }
    this.mCallback = paramICustomTabsCallback;
  }
  
  public static CustomTabsSessionToken createMockSessionTokenForTesting()
  {
    return new CustomTabsSessionToken(new MockCallback(), null);
  }
  
  private IBinder getCallbackBinderAssertNotNull()
  {
    ICustomTabsCallback localICustomTabsCallback = this.mCallbackBinder;
    if (localICustomTabsCallback != null) {
      return localICustomTabsCallback.asBinder();
    }
    throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
  }
  
  public static CustomTabsSessionToken getSessionTokenFromIntent(Intent paramIntent)
  {
    Object localObject2 = paramIntent.getExtras();
    Object localObject1 = null;
    if (localObject2 == null) {
      return null;
    }
    IBinder localIBinder = BundleCompat.getBinder((Bundle)localObject2, "android.support.customtabs.extra.SESSION");
    localObject2 = (PendingIntent)paramIntent.getParcelableExtra("android.support.customtabs.extra.SESSION_ID");
    if ((localIBinder == null) && (localObject2 == null)) {
      return null;
    }
    if (localIBinder == null) {
      paramIntent = (Intent)localObject1;
    } else {
      paramIntent = ICustomTabsCallback.Stub.asInterface(localIBinder);
    }
    return new CustomTabsSessionToken(paramIntent, (PendingIntent)localObject2);
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof CustomTabsSessionToken)) {
      return false;
    }
    paramObject = (CustomTabsSessionToken)paramObject;
    PendingIntent localPendingIntent1 = ((CustomTabsSessionToken)paramObject).getId();
    PendingIntent localPendingIntent2 = this.mSessionId;
    int j = 1;
    int i;
    if (localPendingIntent2 == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (localPendingIntent1 != null) {
      j = 0;
    }
    if (i != j) {
      return false;
    }
    if (localPendingIntent2 != null) {
      return localPendingIntent2.equals(localPendingIntent1);
    }
    return getCallbackBinderAssertNotNull().equals(((CustomTabsSessionToken)paramObject).getCallbackBinderAssertNotNull());
  }
  
  public CustomTabsCallback getCallback()
  {
    return this.mCallback;
  }
  
  IBinder getCallbackBinder()
  {
    ICustomTabsCallback localICustomTabsCallback = this.mCallbackBinder;
    if (localICustomTabsCallback == null) {
      return null;
    }
    return localICustomTabsCallback.asBinder();
  }
  
  PendingIntent getId()
  {
    return this.mSessionId;
  }
  
  public boolean hasCallback()
  {
    boolean bool;
    if (this.mCallbackBinder != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasId()
  {
    boolean bool;
    if (this.mSessionId != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    PendingIntent localPendingIntent = this.mSessionId;
    if (localPendingIntent != null) {
      return localPendingIntent.hashCode();
    }
    return getCallbackBinderAssertNotNull().hashCode();
  }
  
  public boolean isAssociatedWith(CustomTabsSession paramCustomTabsSession)
  {
    return paramCustomTabsSession.getBinder().equals(this.mCallbackBinder);
  }
  
  static class MockCallback
    extends ICustomTabsCallback.Stub
  {
    public IBinder asBinder()
    {
      return this;
    }
    
    public void extraCallback(String paramString, Bundle paramBundle) {}
    
    public Bundle extraCallbackWithResult(String paramString, Bundle paramBundle)
    {
      return null;
    }
    
    public void onMessageChannelReady(Bundle paramBundle) {}
    
    public void onNavigationEvent(int paramInt, Bundle paramBundle) {}
    
    public void onPostMessage(String paramString, Bundle paramBundle) {}
    
    public void onRelationshipValidationResult(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle) {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\CustomTabsSessionToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */