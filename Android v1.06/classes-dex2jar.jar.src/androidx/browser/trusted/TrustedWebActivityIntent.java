package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.List;

public final class TrustedWebActivityIntent
{
  private final Intent mIntent;
  private final List<Uri> mSharedFileUris;
  
  TrustedWebActivityIntent(Intent paramIntent, List<Uri> paramList)
  {
    this.mIntent = paramIntent;
    this.mSharedFileUris = paramList;
  }
  
  private void grantUriPermissionToProvider(Context paramContext)
  {
    Iterator localIterator = this.mSharedFileUris.iterator();
    while (localIterator.hasNext())
    {
      Uri localUri = (Uri)localIterator.next();
      paramContext.grantUriPermission(this.mIntent.getPackage(), localUri, 1);
    }
  }
  
  public Intent getIntent()
  {
    return this.mIntent;
  }
  
  public void launchTrustedWebActivity(Context paramContext)
  {
    grantUriPermissionToProvider(paramContext);
    ContextCompat.startActivity(paramContext, this.mIntent, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\TrustedWebActivityIntent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */