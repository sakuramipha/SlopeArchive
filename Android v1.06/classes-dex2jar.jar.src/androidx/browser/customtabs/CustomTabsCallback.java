package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;

public class CustomTabsCallback
{
  public static final int NAVIGATION_ABORTED = 4;
  public static final int NAVIGATION_FAILED = 3;
  public static final int NAVIGATION_FINISHED = 2;
  public static final int NAVIGATION_STARTED = 1;
  public static final String ONLINE_EXTRAS_KEY = "online";
  public static final int TAB_HIDDEN = 6;
  public static final int TAB_SHOWN = 5;
  
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\CustomTabsCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */