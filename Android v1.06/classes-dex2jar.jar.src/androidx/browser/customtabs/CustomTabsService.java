package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService.Stub;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class CustomTabsService
  extends Service
{
  public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
  public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
  public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
  public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
  public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
  public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
  public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
  public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
  public static final int RELATION_HANDLE_ALL_URLS = 2;
  public static final int RELATION_USE_AS_ORIGIN = 1;
  public static final int RESULT_FAILURE_DISALLOWED = -1;
  public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
  public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
  public static final int RESULT_SUCCESS = 0;
  public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
  private ICustomTabsService.Stub mBinder = new ICustomTabsService.Stub()
  {
    private PendingIntent getSessionIdFromBundle(Bundle paramAnonymousBundle)
    {
      if (paramAnonymousBundle == null) {
        return null;
      }
      PendingIntent localPendingIntent = (PendingIntent)paramAnonymousBundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
      paramAnonymousBundle.remove("android.support.customtabs.extra.SESSION_ID");
      return localPendingIntent;
    }
    
    private boolean newSessionInternal(ICustomTabsCallback paramAnonymousICustomTabsCallback, PendingIntent arg2)
    {
      CustomTabsSessionToken localCustomTabsSessionToken = new CustomTabsSessionToken(paramAnonymousICustomTabsCallback, ???);
      try
      {
        CustomTabsService.1..ExternalSyntheticLambda0 localExternalSyntheticLambda0 = new androidx/browser/customtabs/CustomTabsService$1$$ExternalSyntheticLambda0;
        localExternalSyntheticLambda0.<init>(this, localCustomTabsSessionToken);
        synchronized (CustomTabsService.this.mDeathRecipientMap)
        {
          paramAnonymousICustomTabsCallback.asBinder().linkToDeath(localExternalSyntheticLambda0, 0);
          CustomTabsService.this.mDeathRecipientMap.put(paramAnonymousICustomTabsCallback.asBinder(), localExternalSyntheticLambda0);
          boolean bool = CustomTabsService.this.newSession(localCustomTabsSessionToken);
          return bool;
        }
        return false;
      }
      catch (RemoteException paramAnonymousICustomTabsCallback) {}
    }
    
    public Bundle extraCommand(String paramAnonymousString, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.extraCommand(paramAnonymousString, paramAnonymousBundle);
    }
    
    public boolean mayLaunchUrl(ICustomTabsCallback paramAnonymousICustomTabsCallback, Uri paramAnonymousUri, Bundle paramAnonymousBundle, List<Bundle> paramAnonymousList)
    {
      return CustomTabsService.this.mayLaunchUrl(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback, getSessionIdFromBundle(paramAnonymousBundle)), paramAnonymousUri, paramAnonymousBundle, paramAnonymousList);
    }
    
    public boolean newSession(ICustomTabsCallback paramAnonymousICustomTabsCallback)
    {
      return newSessionInternal(paramAnonymousICustomTabsCallback, null);
    }
    
    public boolean newSessionWithExtras(ICustomTabsCallback paramAnonymousICustomTabsCallback, Bundle paramAnonymousBundle)
    {
      return newSessionInternal(paramAnonymousICustomTabsCallback, getSessionIdFromBundle(paramAnonymousBundle));
    }
    
    public int postMessage(ICustomTabsCallback paramAnonymousICustomTabsCallback, String paramAnonymousString, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.postMessage(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback, getSessionIdFromBundle(paramAnonymousBundle)), paramAnonymousString, paramAnonymousBundle);
    }
    
    public boolean receiveFile(ICustomTabsCallback paramAnonymousICustomTabsCallback, Uri paramAnonymousUri, int paramAnonymousInt, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.receiveFile(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback, getSessionIdFromBundle(paramAnonymousBundle)), paramAnonymousUri, paramAnonymousInt, paramAnonymousBundle);
    }
    
    public boolean requestPostMessageChannel(ICustomTabsCallback paramAnonymousICustomTabsCallback, Uri paramAnonymousUri)
    {
      return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback, null), paramAnonymousUri);
    }
    
    public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback paramAnonymousICustomTabsCallback, Uri paramAnonymousUri, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback, getSessionIdFromBundle(paramAnonymousBundle)), paramAnonymousUri);
    }
    
    public boolean updateVisuals(ICustomTabsCallback paramAnonymousICustomTabsCallback, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.updateVisuals(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback, getSessionIdFromBundle(paramAnonymousBundle)), paramAnonymousBundle);
    }
    
    public boolean validateRelationship(ICustomTabsCallback paramAnonymousICustomTabsCallback, int paramAnonymousInt, Uri paramAnonymousUri, Bundle paramAnonymousBundle)
    {
      return CustomTabsService.this.validateRelationship(new CustomTabsSessionToken(paramAnonymousICustomTabsCallback, getSessionIdFromBundle(paramAnonymousBundle)), paramAnonymousInt, paramAnonymousUri, paramAnonymousBundle);
    }
    
    public boolean warmup(long paramAnonymousLong)
    {
      return CustomTabsService.this.warmup(paramAnonymousLong);
    }
  };
  final SimpleArrayMap<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new SimpleArrayMap();
  
  protected boolean cleanUpSession(CustomTabsSessionToken paramCustomTabsSessionToken)
  {
    try
    {
      synchronized (this.mDeathRecipientMap)
      {
        paramCustomTabsSessionToken = paramCustomTabsSessionToken.getCallbackBinder();
        if (paramCustomTabsSessionToken == null) {
          return false;
        }
        paramCustomTabsSessionToken.unlinkToDeath((IBinder.DeathRecipient)this.mDeathRecipientMap.get(paramCustomTabsSessionToken), 0);
        this.mDeathRecipientMap.remove(paramCustomTabsSessionToken);
        return true;
      }
      return false;
    }
    catch (NoSuchElementException paramCustomTabsSessionToken) {}
  }
  
  protected abstract Bundle extraCommand(String paramString, Bundle paramBundle);
  
  protected abstract boolean mayLaunchUrl(CustomTabsSessionToken paramCustomTabsSessionToken, Uri paramUri, Bundle paramBundle, List<Bundle> paramList);
  
  protected abstract boolean newSession(CustomTabsSessionToken paramCustomTabsSessionToken);
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.mBinder;
  }
  
  protected abstract int postMessage(CustomTabsSessionToken paramCustomTabsSessionToken, String paramString, Bundle paramBundle);
  
  protected abstract boolean receiveFile(CustomTabsSessionToken paramCustomTabsSessionToken, Uri paramUri, int paramInt, Bundle paramBundle);
  
  protected abstract boolean requestPostMessageChannel(CustomTabsSessionToken paramCustomTabsSessionToken, Uri paramUri);
  
  protected abstract boolean updateVisuals(CustomTabsSessionToken paramCustomTabsSessionToken, Bundle paramBundle);
  
  protected abstract boolean validateRelationship(CustomTabsSessionToken paramCustomTabsSessionToken, int paramInt, Uri paramUri, Bundle paramBundle);
  
  protected abstract boolean warmup(long paramLong);
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface FilePurpose {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Relation {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Result {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\CustomTabsService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */