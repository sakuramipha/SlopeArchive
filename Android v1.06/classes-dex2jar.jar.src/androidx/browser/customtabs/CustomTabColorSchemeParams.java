package androidx.browser.customtabs;

import android.os.Bundle;

public final class CustomTabColorSchemeParams
{
  public final Integer navigationBarColor;
  public final Integer navigationBarDividerColor;
  public final Integer secondaryToolbarColor;
  public final Integer toolbarColor;
  
  CustomTabColorSchemeParams(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4)
  {
    this.toolbarColor = paramInteger1;
    this.secondaryToolbarColor = paramInteger2;
    this.navigationBarColor = paramInteger3;
    this.navigationBarDividerColor = paramInteger4;
  }
  
  static CustomTabColorSchemeParams fromBundle(Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle(0);
    }
    return new CustomTabColorSchemeParams((Integer)localBundle.get("android.support.customtabs.extra.TOOLBAR_COLOR"), (Integer)localBundle.get("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"), (Integer)localBundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"), (Integer)localBundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"));
  }
  
  Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    Integer localInteger = this.toolbarColor;
    if (localInteger != null) {
      localBundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", localInteger.intValue());
    }
    localInteger = this.secondaryToolbarColor;
    if (localInteger != null) {
      localBundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", localInteger.intValue());
    }
    localInteger = this.navigationBarColor;
    if (localInteger != null) {
      localBundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", localInteger.intValue());
    }
    localInteger = this.navigationBarDividerColor;
    if (localInteger != null) {
      localBundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", localInteger.intValue());
    }
    return localBundle;
  }
  
  CustomTabColorSchemeParams withDefaults(CustomTabColorSchemeParams paramCustomTabColorSchemeParams)
  {
    Object localObject2 = this.toolbarColor;
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = paramCustomTabColorSchemeParams.toolbarColor;
    }
    Object localObject3 = this.secondaryToolbarColor;
    localObject2 = localObject3;
    if (localObject3 == null) {
      localObject2 = paramCustomTabColorSchemeParams.secondaryToolbarColor;
    }
    Object localObject4 = this.navigationBarColor;
    localObject3 = localObject4;
    if (localObject4 == null) {
      localObject3 = paramCustomTabColorSchemeParams.navigationBarColor;
    }
    Integer localInteger = this.navigationBarDividerColor;
    localObject4 = localInteger;
    if (localInteger == null) {
      localObject4 = paramCustomTabColorSchemeParams.navigationBarDividerColor;
    }
    return new CustomTabColorSchemeParams((Integer)localObject1, (Integer)localObject2, (Integer)localObject3, (Integer)localObject4);
  }
  
  public static final class Builder
  {
    private Integer mNavigationBarColor;
    private Integer mNavigationBarDividerColor;
    private Integer mSecondaryToolbarColor;
    private Integer mToolbarColor;
    
    public CustomTabColorSchemeParams build()
    {
      return new CustomTabColorSchemeParams(this.mToolbarColor, this.mSecondaryToolbarColor, this.mNavigationBarColor, this.mNavigationBarDividerColor);
    }
    
    public Builder setNavigationBarColor(int paramInt)
    {
      this.mNavigationBarColor = Integer.valueOf(paramInt | 0xFF000000);
      return this;
    }
    
    public Builder setNavigationBarDividerColor(int paramInt)
    {
      this.mNavigationBarDividerColor = Integer.valueOf(paramInt);
      return this;
    }
    
    public Builder setSecondaryToolbarColor(int paramInt)
    {
      this.mSecondaryToolbarColor = Integer.valueOf(paramInt);
      return this;
    }
    
    public Builder setToolbarColor(int paramInt)
    {
      this.mToolbarColor = Integer.valueOf(paramInt | 0xFF000000);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\customtabs\CustomTabColorSchemeParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */