package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.BundleCompat;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public final class CustomTabsIntent
{
  public static final int COLOR_SCHEME_DARK = 2;
  public static final int COLOR_SCHEME_LIGHT = 1;
  private static final int COLOR_SCHEME_MAX = 2;
  public static final int COLOR_SCHEME_SYSTEM = 0;
  public static final String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
  public static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
  public static final String EXTRA_COLOR_SCHEME = "androidx.browser.customtabs.extra.COLOR_SCHEME";
  public static final String EXTRA_COLOR_SCHEME_PARAMS = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";
  @Deprecated
  public static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
  public static final String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
  public static final String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
  public static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
  public static final String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
  public static final String EXTRA_NAVIGATION_BAR_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
  public static final String EXTRA_NAVIGATION_BAR_DIVIDER_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
  public static final String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
  public static final String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
  public static final String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
  public static final String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
  public static final String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
  public static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";
  public static final String EXTRA_SESSION_ID = "android.support.customtabs.extra.SESSION_ID";
  public static final String EXTRA_SHARE_STATE = "androidx.browser.customtabs.extra.SHARE_STATE";
  public static final String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
  public static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
  public static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
  public static final String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
  private static final String EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS = "android.support.customtabs.extra.user_opt_out";
  public static final String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
  public static final String KEY_ICON = "android.support.customtabs.customaction.ICON";
  public static final String KEY_ID = "android.support.customtabs.customaction.ID";
  public static final String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
  public static final String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
  private static final int MAX_TOOLBAR_ITEMS = 5;
  public static final int NO_TITLE = 0;
  public static final int SHARE_STATE_DEFAULT = 0;
  private static final int SHARE_STATE_MAX = 2;
  public static final int SHARE_STATE_OFF = 2;
  public static final int SHARE_STATE_ON = 1;
  public static final int SHOW_PAGE_TITLE = 1;
  public static final int TOOLBAR_ACTION_BUTTON_ID = 0;
  public final Intent intent;
  public final Bundle startAnimationBundle;
  
  CustomTabsIntent(Intent paramIntent, Bundle paramBundle)
  {
    this.intent = paramIntent;
    this.startAnimationBundle = paramBundle;
  }
  
  public static CustomTabColorSchemeParams getColorSchemeParams(Intent paramIntent, int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 2) && (paramInt != 0))
    {
      Object localObject = paramIntent.getExtras();
      if (localObject == null) {
        return CustomTabColorSchemeParams.fromBundle(null);
      }
      paramIntent = CustomTabColorSchemeParams.fromBundle((Bundle)localObject);
      localObject = ((Bundle)localObject).getSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS");
      if (localObject != null)
      {
        localObject = (Bundle)((SparseArray)localObject).get(paramInt);
        if (localObject != null) {
          return CustomTabColorSchemeParams.fromBundle((Bundle)localObject).withDefaults(paramIntent);
        }
      }
      return paramIntent;
    }
    paramIntent = new StringBuilder();
    paramIntent.append("Invalid colorScheme: ");
    paramIntent.append(paramInt);
    throw new IllegalArgumentException(paramIntent.toString());
  }
  
  public static int getMaxToolbarItems()
  {
    return 5;
  }
  
  public static Intent setAlwaysUseBrowserUI(Intent paramIntent)
  {
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent("android.intent.action.VIEW");
    }
    localIntent.addFlags(268435456);
    localIntent.putExtra("android.support.customtabs.extra.user_opt_out", true);
    return localIntent;
  }
  
  public static boolean shouldAlwaysUseBrowserUI(Intent paramIntent)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramIntent.getBooleanExtra("android.support.customtabs.extra.user_opt_out", false))
    {
      bool1 = bool2;
      if ((paramIntent.getFlags() & 0x10000000) != 0) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public void launchUrl(Context paramContext, Uri paramUri)
  {
    this.intent.setData(paramUri);
    ContextCompat.startActivity(paramContext, this.intent, this.startAnimationBundle);
  }
  
  public static final class Builder
  {
    private ArrayList<Bundle> mActionButtons;
    private SparseArray<Bundle> mColorSchemeParamBundles;
    private final CustomTabColorSchemeParams.Builder mDefaultColorSchemeBuilder = new CustomTabColorSchemeParams.Builder();
    private Bundle mDefaultColorSchemeBundle;
    private boolean mInstantAppsEnabled = true;
    private final Intent mIntent = new Intent("android.intent.action.VIEW");
    private ArrayList<Bundle> mMenuItems;
    private int mShareState = 0;
    private Bundle mStartAnimationBundle;
    
    public Builder() {}
    
    public Builder(CustomTabsSession paramCustomTabsSession)
    {
      if (paramCustomTabsSession != null) {
        setSession(paramCustomTabsSession);
      }
    }
    
    private void setSessionParameters(IBinder paramIBinder, PendingIntent paramPendingIntent)
    {
      Bundle localBundle = new Bundle();
      BundleCompat.putBinder(localBundle, "android.support.customtabs.extra.SESSION", paramIBinder);
      if (paramPendingIntent != null) {
        localBundle.putParcelable("android.support.customtabs.extra.SESSION_ID", paramPendingIntent);
      }
      this.mIntent.putExtras(localBundle);
    }
    
    @Deprecated
    public Builder addDefaultShareMenuItem()
    {
      setShareState(1);
      return this;
    }
    
    public Builder addMenuItem(String paramString, PendingIntent paramPendingIntent)
    {
      if (this.mMenuItems == null) {
        this.mMenuItems = new ArrayList();
      }
      Bundle localBundle = new Bundle();
      localBundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", paramString);
      localBundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", paramPendingIntent);
      this.mMenuItems.add(localBundle);
      return this;
    }
    
    @Deprecated
    public Builder addToolbarItem(int paramInt, Bitmap paramBitmap, String paramString, PendingIntent paramPendingIntent)
      throws IllegalStateException
    {
      if (this.mActionButtons == null) {
        this.mActionButtons = new ArrayList();
      }
      if (this.mActionButtons.size() < 5)
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("android.support.customtabs.customaction.ID", paramInt);
        localBundle.putParcelable("android.support.customtabs.customaction.ICON", paramBitmap);
        localBundle.putString("android.support.customtabs.customaction.DESCRIPTION", paramString);
        localBundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", paramPendingIntent);
        this.mActionButtons.add(localBundle);
        return this;
      }
      throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
    }
    
    public CustomTabsIntent build()
    {
      if (!this.mIntent.hasExtra("android.support.customtabs.extra.SESSION")) {
        setSessionParameters(null, null);
      }
      Object localObject = this.mMenuItems;
      if (localObject != null) {
        this.mIntent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", (ArrayList)localObject);
      }
      localObject = this.mActionButtons;
      if (localObject != null) {
        this.mIntent.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", (ArrayList)localObject);
      }
      this.mIntent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.mInstantAppsEnabled);
      this.mIntent.putExtras(this.mDefaultColorSchemeBuilder.build().toBundle());
      localObject = this.mDefaultColorSchemeBundle;
      if (localObject != null) {
        this.mIntent.putExtras((Bundle)localObject);
      }
      if (this.mColorSchemeParamBundles != null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.mColorSchemeParamBundles);
        this.mIntent.putExtras((Bundle)localObject);
      }
      this.mIntent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.mShareState);
      return new CustomTabsIntent(this.mIntent, this.mStartAnimationBundle);
    }
    
    @Deprecated
    public Builder enableUrlBarHiding()
    {
      this.mIntent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
      return this;
    }
    
    public Builder setActionButton(Bitmap paramBitmap, String paramString, PendingIntent paramPendingIntent)
    {
      return setActionButton(paramBitmap, paramString, paramPendingIntent, false);
    }
    
    public Builder setActionButton(Bitmap paramBitmap, String paramString, PendingIntent paramPendingIntent, boolean paramBoolean)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("android.support.customtabs.customaction.ID", 0);
      localBundle.putParcelable("android.support.customtabs.customaction.ICON", paramBitmap);
      localBundle.putString("android.support.customtabs.customaction.DESCRIPTION", paramString);
      localBundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", paramPendingIntent);
      this.mIntent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", localBundle);
      this.mIntent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", paramBoolean);
      return this;
    }
    
    public Builder setCloseButtonIcon(Bitmap paramBitmap)
    {
      this.mIntent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", paramBitmap);
      return this;
    }
    
    public Builder setColorScheme(int paramInt)
    {
      if ((paramInt >= 0) && (paramInt <= 2))
      {
        this.mIntent.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", paramInt);
        return this;
      }
      throw new IllegalArgumentException("Invalid value for the colorScheme argument");
    }
    
    public Builder setColorSchemeParams(int paramInt, CustomTabColorSchemeParams paramCustomTabColorSchemeParams)
    {
      if ((paramInt >= 0) && (paramInt <= 2) && (paramInt != 0))
      {
        if (this.mColorSchemeParamBundles == null) {
          this.mColorSchemeParamBundles = new SparseArray();
        }
        this.mColorSchemeParamBundles.put(paramInt, paramCustomTabColorSchemeParams.toBundle());
        return this;
      }
      paramCustomTabColorSchemeParams = new StringBuilder();
      paramCustomTabColorSchemeParams.append("Invalid colorScheme: ");
      paramCustomTabColorSchemeParams.append(paramInt);
      throw new IllegalArgumentException(paramCustomTabColorSchemeParams.toString());
    }
    
    public Builder setDefaultColorSchemeParams(CustomTabColorSchemeParams paramCustomTabColorSchemeParams)
    {
      this.mDefaultColorSchemeBundle = paramCustomTabColorSchemeParams.toBundle();
      return this;
    }
    
    @Deprecated
    public Builder setDefaultShareMenuItemEnabled(boolean paramBoolean)
    {
      if (paramBoolean) {
        setShareState(1);
      } else {
        setShareState(2);
      }
      return this;
    }
    
    public Builder setExitAnimations(Context paramContext, int paramInt1, int paramInt2)
    {
      paramContext = ActivityOptionsCompat.makeCustomAnimation(paramContext, paramInt1, paramInt2).toBundle();
      this.mIntent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", paramContext);
      return this;
    }
    
    public Builder setInstantAppsEnabled(boolean paramBoolean)
    {
      this.mInstantAppsEnabled = paramBoolean;
      return this;
    }
    
    @Deprecated
    public Builder setNavigationBarColor(int paramInt)
    {
      this.mDefaultColorSchemeBuilder.setNavigationBarColor(paramInt);
      return this;
    }
    
    @Deprecated
    public Builder setNavigationBarDividerColor(int paramInt)
    {
      this.mDefaultColorSchemeBuilder.setNavigationBarDividerColor(paramInt);
      return this;
    }
    
    public Builder setPendingSession(CustomTabsSession.PendingSession paramPendingSession)
    {
      setSessionParameters(null, paramPendingSession.getId());
      return this;
    }
    
    @Deprecated
    public Builder setSecondaryToolbarColor(int paramInt)
    {
      this.mDefaultColorSchemeBuilder.setSecondaryToolbarColor(paramInt);
      return this;
    }
    
    public Builder setSecondaryToolbarViews(RemoteViews paramRemoteViews, int[] paramArrayOfInt, PendingIntent paramPendingIntent)
    {
      this.mIntent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", paramRemoteViews);
      this.mIntent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", paramArrayOfInt);
      this.mIntent.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", paramPendingIntent);
      return this;
    }
    
    public Builder setSession(CustomTabsSession paramCustomTabsSession)
    {
      this.mIntent.setPackage(paramCustomTabsSession.getComponentName().getPackageName());
      setSessionParameters(paramCustomTabsSession.getBinder(), paramCustomTabsSession.getId());
      return this;
    }
    
    public Builder setShareState(int paramInt)
    {
      if ((paramInt >= 0) && (paramInt <= 2))
      {
        this.mShareState = paramInt;
        if (paramInt == 1) {
          this.mIntent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (paramInt == 2) {
          this.mIntent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
          this.mIntent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
        return this;
      }
      throw new IllegalArgumentException("Invalid value for the shareState argument");
    }
    
    public Builder setShowTitle(boolean paramBoolean)
    {
      this.mIntent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", paramBoolean);
      return this;
    }
    
    public Builder setStartAnimations(Context paramContext, int paramInt1, int paramInt2)
    {
      this.mStartAnimationBundle = ActivityOptionsCompat.makeCustomAnimation(paramContext, paramInt1, paramInt2).toBundle();
      return this;
    }
    
    @Deprecated
    public Builder setToolbarColor(int paramInt)
    {
      this.mDefaultColorSchemeBuilder.setToolbarColor(paramInt);
      return this;
    }
    
    public Builder setUrlBarHidingEnabled(boolean paramBoolean)
    {
      this.mIntent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", paramBoolean);
      return this;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ColorScheme {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ShareState {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\CustomTabsIntent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */