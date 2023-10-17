package androidx.browser.trusted;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.trusted.sharing.ShareData;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TrustedWebActivityIntentBuilder
{
  public static final String EXTRA_ADDITIONAL_TRUSTED_ORIGINS = "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS";
  public static final String EXTRA_DISPLAY_MODE = "androidx.browser.trusted.extra.DISPLAY_MODE";
  public static final String EXTRA_SCREEN_ORIENTATION = "androidx.browser.trusted.extra.SCREEN_ORIENTATION";
  public static final String EXTRA_SHARE_DATA = "androidx.browser.trusted.extra.SHARE_DATA";
  public static final String EXTRA_SHARE_TARGET = "androidx.browser.trusted.extra.SHARE_TARGET";
  public static final String EXTRA_SPLASH_SCREEN_PARAMS = "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS";
  private List<String> mAdditionalTrustedOrigins;
  private TrustedWebActivityDisplayMode mDisplayMode = new TrustedWebActivityDisplayMode.DefaultMode();
  private final CustomTabsIntent.Builder mIntentBuilder = new CustomTabsIntent.Builder();
  private int mScreenOrientation = 0;
  private ShareData mShareData;
  private ShareTarget mShareTarget;
  private Bundle mSplashScreenParams;
  private final Uri mUri;
  
  public TrustedWebActivityIntentBuilder(Uri paramUri)
  {
    this.mUri = paramUri;
  }
  
  public TrustedWebActivityIntent build(CustomTabsSession paramCustomTabsSession)
  {
    Objects.requireNonNull(paramCustomTabsSession, "CustomTabsSession is required for launching a TWA");
    this.mIntentBuilder.setSession(paramCustomTabsSession);
    Intent localIntent = this.mIntentBuilder.build().intent;
    localIntent.setData(this.mUri);
    localIntent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
    if (this.mAdditionalTrustedOrigins != null) {
      localIntent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.mAdditionalTrustedOrigins));
    }
    paramCustomTabsSession = this.mSplashScreenParams;
    if (paramCustomTabsSession != null) {
      localIntent.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", paramCustomTabsSession);
    }
    List localList = Collections.emptyList();
    ShareTarget localShareTarget = this.mShareTarget;
    paramCustomTabsSession = localList;
    if (localShareTarget != null)
    {
      paramCustomTabsSession = localList;
      if (this.mShareData != null)
      {
        localIntent.putExtra("androidx.browser.trusted.extra.SHARE_TARGET", localShareTarget.toBundle());
        localIntent.putExtra("androidx.browser.trusted.extra.SHARE_DATA", this.mShareData.toBundle());
        paramCustomTabsSession = localList;
        if (this.mShareData.uris != null) {
          paramCustomTabsSession = this.mShareData.uris;
        }
      }
    }
    localIntent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.mDisplayMode.toBundle());
    localIntent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.mScreenOrientation);
    return new TrustedWebActivityIntent(localIntent, paramCustomTabsSession);
  }
  
  public CustomTabsIntent buildCustomTabsIntent()
  {
    return this.mIntentBuilder.build();
  }
  
  public TrustedWebActivityDisplayMode getDisplayMode()
  {
    return this.mDisplayMode;
  }
  
  public Uri getUri()
  {
    return this.mUri;
  }
  
  public TrustedWebActivityIntentBuilder setAdditionalTrustedOrigins(List<String> paramList)
  {
    this.mAdditionalTrustedOrigins = paramList;
    return this;
  }
  
  public TrustedWebActivityIntentBuilder setColorScheme(int paramInt)
  {
    this.mIntentBuilder.setColorScheme(paramInt);
    return this;
  }
  
  public TrustedWebActivityIntentBuilder setColorSchemeParams(int paramInt, CustomTabColorSchemeParams paramCustomTabColorSchemeParams)
  {
    this.mIntentBuilder.setColorSchemeParams(paramInt, paramCustomTabColorSchemeParams);
    return this;
  }
  
  public TrustedWebActivityIntentBuilder setDefaultColorSchemeParams(CustomTabColorSchemeParams paramCustomTabColorSchemeParams)
  {
    this.mIntentBuilder.setDefaultColorSchemeParams(paramCustomTabColorSchemeParams);
    return this;
  }
  
  public TrustedWebActivityIntentBuilder setDisplayMode(TrustedWebActivityDisplayMode paramTrustedWebActivityDisplayMode)
  {
    this.mDisplayMode = paramTrustedWebActivityDisplayMode;
    return this;
  }
  
  public TrustedWebActivityIntentBuilder setNavigationBarColor(int paramInt)
  {
    this.mIntentBuilder.setNavigationBarColor(paramInt);
    return this;
  }
  
  public TrustedWebActivityIntentBuilder setNavigationBarDividerColor(int paramInt)
  {
    this.mIntentBuilder.setNavigationBarDividerColor(paramInt);
    return this;
  }
  
  public TrustedWebActivityIntentBuilder setScreenOrientation(int paramInt)
  {
    this.mScreenOrientation = paramInt;
    return this;
  }
  
  public TrustedWebActivityIntentBuilder setShareParams(ShareTarget paramShareTarget, ShareData paramShareData)
  {
    this.mShareTarget = paramShareTarget;
    this.mShareData = paramShareData;
    return this;
  }
  
  public TrustedWebActivityIntentBuilder setSplashScreenParams(Bundle paramBundle)
  {
    this.mSplashScreenParams = paramBundle;
    return this;
  }
  
  public TrustedWebActivityIntentBuilder setToolbarColor(int paramInt)
  {
    this.mIntentBuilder.setToolbarColor(paramInt);
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\TrustedWebActivityIntentBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */