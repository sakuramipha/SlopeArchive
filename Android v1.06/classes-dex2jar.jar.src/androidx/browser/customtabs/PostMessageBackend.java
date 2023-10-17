package androidx.browser.customtabs;

import android.content.Context;
import android.os.Bundle;

public abstract interface PostMessageBackend
{
  public abstract void onDisconnectChannel(Context paramContext);
  
  public abstract boolean onNotifyMessageChannelReady(Bundle paramBundle);
  
  public abstract boolean onPostMessage(String paramString, Bundle paramBundle);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\PostMessageBackend.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */