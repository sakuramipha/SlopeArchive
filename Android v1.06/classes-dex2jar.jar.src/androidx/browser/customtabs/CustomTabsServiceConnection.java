package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.ICustomTabsService.Stub;

public abstract class CustomTabsServiceConnection
  implements ServiceConnection
{
  private Context mApplicationContext;
  
  Context getApplicationContext()
  {
    return this.mApplicationContext;
  }
  
  public abstract void onCustomTabsServiceConnected(ComponentName paramComponentName, CustomTabsClient paramCustomTabsClient);
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (this.mApplicationContext != null)
    {
      onCustomTabsServiceConnected(paramComponentName, new CustomTabsClient(ICustomTabsService.Stub.asInterface(paramIBinder), paramComponentName, this.mApplicationContext) {});
      return;
    }
    throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
  }
  
  void setApplicationContext(Context paramContext)
  {
    this.mApplicationContext = paramContext;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\CustomTabsServiceConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */