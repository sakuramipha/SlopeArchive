package androidx.browser.trusted;

import android.os.Bundle;

public abstract interface TrustedWebActivityDisplayMode
{
  public static final String KEY_ID = "androidx.browser.trusted.displaymode.KEY_ID";
  
  public abstract Bundle toBundle();
  
  public static class DefaultMode
    implements TrustedWebActivityDisplayMode
  {
    private static final int ID = 0;
    
    public Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
      return localBundle;
    }
  }
  
  public static class ImmersiveMode
    implements TrustedWebActivityDisplayMode
  {
    private static final int ID = 1;
    public static final String KEY_CUTOUT_MODE = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";
    public static final String KEY_STICKY = "androidx.browser.trusted.displaymode.KEY_STICKY";
    private final boolean mIsSticky;
    private final int mLayoutInDisplayCutoutMode;
    
    public ImmersiveMode(boolean paramBoolean, int paramInt)
    {
      this.mIsSticky = paramBoolean;
      this.mLayoutInDisplayCutoutMode = paramInt;
    }
    
    static TrustedWebActivityDisplayMode fromBundle(Bundle paramBundle)
    {
      return new ImmersiveMode(paramBundle.getBoolean("androidx.browser.trusted.displaymode.KEY_STICKY"), paramBundle.getInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE"));
    }
    
    public boolean isSticky()
    {
      return this.mIsSticky;
    }
    
    public int layoutInDisplayCutoutMode()
    {
      return this.mLayoutInDisplayCutoutMode;
    }
    
    public Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
      localBundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.mIsSticky);
      localBundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.mLayoutInDisplayCutoutMode);
      return localBundle;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\trusted\TrustedWebActivityDisplayMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */