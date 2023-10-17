package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;

@Deprecated
public class BrowserActionItem
{
  private final PendingIntent mAction;
  private int mIconId;
  private Uri mIconUri;
  private Runnable mRunnableAction;
  private final String mTitle;
  
  public BrowserActionItem(String paramString, PendingIntent paramPendingIntent)
  {
    this(paramString, paramPendingIntent, 0);
  }
  
  public BrowserActionItem(String paramString, PendingIntent paramPendingIntent, int paramInt)
  {
    this.mTitle = paramString;
    this.mAction = paramPendingIntent;
    this.mIconId = paramInt;
  }
  
  public BrowserActionItem(String paramString, PendingIntent paramPendingIntent, Uri paramUri)
  {
    this.mTitle = paramString;
    this.mAction = paramPendingIntent;
    this.mIconUri = paramUri;
  }
  
  BrowserActionItem(String paramString, Runnable paramRunnable)
  {
    this.mTitle = paramString;
    this.mAction = null;
    this.mRunnableAction = paramRunnable;
  }
  
  public PendingIntent getAction()
  {
    PendingIntent localPendingIntent = this.mAction;
    if (localPendingIntent != null) {
      return localPendingIntent;
    }
    throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
  }
  
  public int getIconId()
  {
    return this.mIconId;
  }
  
  public Uri getIconUri()
  {
    return this.mIconUri;
  }
  
  Runnable getRunnableAction()
  {
    return this.mRunnableAction;
  }
  
  public String getTitle()
  {
    return this.mTitle;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\browseractions\BrowserActionItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */