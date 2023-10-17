package androidx.browser.trusted.sharing;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class ShareData
{
  public static final String KEY_TEXT = "androidx.browser.trusted.sharing.KEY_TEXT";
  public static final String KEY_TITLE = "androidx.browser.trusted.sharing.KEY_TITLE";
  public static final String KEY_URIS = "androidx.browser.trusted.sharing.KEY_URIS";
  public final String text;
  public final String title;
  public final List<Uri> uris;
  
  public ShareData(String paramString1, String paramString2, List<Uri> paramList)
  {
    this.title = paramString1;
    this.text = paramString2;
    this.uris = paramList;
  }
  
  public static ShareData fromBundle(Bundle paramBundle)
  {
    return new ShareData(paramBundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), paramBundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), paramBundle.getParcelableArrayList("androidx.browser.trusted.sharing.KEY_URIS"));
  }
  
  public Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.title);
    localBundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.text);
    if (this.uris != null) {
      localBundle.putParcelableArrayList("androidx.browser.trusted.sharing.KEY_URIS", new ArrayList(this.uris));
    }
    return localBundle;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\sharing\ShareData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */