package androidx.legacy.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;
import java.lang.reflect.Method;

@Deprecated
public class ActionBarDrawerToggle
  implements DrawerLayout.DrawerListener
{
  private static final int ID_HOME = 16908332;
  private static final String TAG = "ActionBarDrawerToggle";
  private static final int[] THEME_ATTRS = { 16843531 };
  private static final float TOGGLE_DRAWABLE_OFFSET = 0.33333334F;
  final Activity mActivity;
  private final Delegate mActivityImpl;
  private final int mCloseDrawerContentDescRes;
  private Drawable mDrawerImage;
  private final int mDrawerImageResource;
  private boolean mDrawerIndicatorEnabled = true;
  private final DrawerLayout mDrawerLayout;
  private boolean mHasCustomUpIndicator;
  private Drawable mHomeAsUpIndicator;
  private final int mOpenDrawerContentDescRes;
  private SetIndicatorInfo mSetIndicatorInfo;
  private SlideDrawable mSlider;
  
  public ActionBarDrawerToggle(Activity paramActivity, DrawerLayout paramDrawerLayout, int paramInt1, int paramInt2, int paramInt3)
  {
    this(paramActivity, paramDrawerLayout, assumeMaterial(paramActivity) ^ true, paramInt1, paramInt2, paramInt3);
  }
  
  public ActionBarDrawerToggle(Activity paramActivity, DrawerLayout paramDrawerLayout, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    this.mActivity = paramActivity;
    if ((paramActivity instanceof DelegateProvider)) {
      this.mActivityImpl = ((DelegateProvider)paramActivity).getDrawerToggleDelegate();
    } else {
      this.mActivityImpl = null;
    }
    this.mDrawerLayout = paramDrawerLayout;
    this.mDrawerImageResource = paramInt1;
    this.mOpenDrawerContentDescRes = paramInt2;
    this.mCloseDrawerContentDescRes = paramInt3;
    this.mHomeAsUpIndicator = getThemeUpIndicator();
    this.mDrawerImage = ContextCompat.getDrawable(paramActivity, paramInt1);
    paramActivity = new SlideDrawable(this.mDrawerImage);
    this.mSlider = paramActivity;
    float f;
    if (paramBoolean) {
      f = 0.33333334F;
    } else {
      f = 0.0F;
    }
    paramActivity.setOffset(f);
  }
  
  private static boolean assumeMaterial(Context paramContext)
  {
    boolean bool;
    if ((paramContext.getApplicationInfo().targetSdkVersion >= 21) && (Build.VERSION.SDK_INT >= 21)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private Drawable getThemeUpIndicator()
  {
    Object localObject = this.mActivityImpl;
    if (localObject != null) {
      return ((Delegate)localObject).getThemeUpIndicator();
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      localObject = this.mActivity.getActionBar();
      if (localObject != null) {
        localObject = ((ActionBar)localObject).getThemedContext();
      } else {
        localObject = this.mActivity;
      }
      localObject = ((Context)localObject).obtainStyledAttributes(null, THEME_ATTRS, 16843470, 0);
      localDrawable = ((TypedArray)localObject).getDrawable(0);
      ((TypedArray)localObject).recycle();
      return localDrawable;
    }
    localObject = this.mActivity.obtainStyledAttributes(THEME_ATTRS);
    Drawable localDrawable = ((TypedArray)localObject).getDrawable(0);
    ((TypedArray)localObject).recycle();
    return localDrawable;
  }
  
  private void setActionBarDescription(int paramInt)
  {
    Object localObject = this.mActivityImpl;
    if (localObject != null)
    {
      ((Delegate)localObject).setActionBarDescription(paramInt);
      return;
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      localObject = this.mActivity.getActionBar();
      if (localObject != null) {
        ((ActionBar)localObject).setHomeActionContentDescription(paramInt);
      }
    }
    else
    {
      if (this.mSetIndicatorInfo == null) {
        this.mSetIndicatorInfo = new SetIndicatorInfo(this.mActivity);
      }
      if (this.mSetIndicatorInfo.mSetHomeAsUpIndicator != null) {
        try
        {
          localObject = this.mActivity.getActionBar();
          this.mSetIndicatorInfo.mSetHomeActionContentDescription.invoke(localObject, new Object[] { Integer.valueOf(paramInt) });
          ((ActionBar)localObject).setSubtitle(((ActionBar)localObject).getSubtitle());
        }
        catch (Exception localException)
        {
          Log.w("ActionBarDrawerToggle", "Couldn't set content description via JB-MR2 API", localException);
        }
      }
    }
  }
  
  private void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    Object localObject = this.mActivityImpl;
    if (localObject != null)
    {
      ((Delegate)localObject).setActionBarUpIndicator(paramDrawable, paramInt);
      return;
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      localObject = this.mActivity.getActionBar();
      if (localObject != null)
      {
        ((ActionBar)localObject).setHomeAsUpIndicator(paramDrawable);
        ((ActionBar)localObject).setHomeActionContentDescription(paramInt);
      }
    }
    else
    {
      if (this.mSetIndicatorInfo == null) {
        this.mSetIndicatorInfo = new SetIndicatorInfo(this.mActivity);
      }
      if (this.mSetIndicatorInfo.mSetHomeAsUpIndicator != null) {
        try
        {
          localObject = this.mActivity.getActionBar();
          this.mSetIndicatorInfo.mSetHomeAsUpIndicator.invoke(localObject, new Object[] { paramDrawable });
          this.mSetIndicatorInfo.mSetHomeActionContentDescription.invoke(localObject, new Object[] { Integer.valueOf(paramInt) });
        }
        catch (Exception paramDrawable)
        {
          Log.w("ActionBarDrawerToggle", "Couldn't set home-as-up indicator via JB-MR2 API", paramDrawable);
        }
      } else if (this.mSetIndicatorInfo.mUpIndicatorView != null) {
        this.mSetIndicatorInfo.mUpIndicatorView.setImageDrawable(paramDrawable);
      } else {
        Log.w("ActionBarDrawerToggle", "Couldn't set home-as-up indicator");
      }
    }
  }
  
  public boolean isDrawerIndicatorEnabled()
  {
    return this.mDrawerIndicatorEnabled;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (!this.mHasCustomUpIndicator) {
      this.mHomeAsUpIndicator = getThemeUpIndicator();
    }
    this.mDrawerImage = ContextCompat.getDrawable(this.mActivity, this.mDrawerImageResource);
    syncState();
  }
  
  public void onDrawerClosed(View paramView)
  {
    this.mSlider.setPosition(0.0F);
    if (this.mDrawerIndicatorEnabled) {
      setActionBarDescription(this.mOpenDrawerContentDescRes);
    }
  }
  
  public void onDrawerOpened(View paramView)
  {
    this.mSlider.setPosition(1.0F);
    if (this.mDrawerIndicatorEnabled) {
      setActionBarDescription(this.mCloseDrawerContentDescRes);
    }
  }
  
  public void onDrawerSlide(View paramView, float paramFloat)
  {
    float f = this.mSlider.getPosition();
    if (paramFloat > 0.5F) {
      paramFloat = Math.max(f, Math.max(0.0F, paramFloat - 0.5F) * 2.0F);
    } else {
      paramFloat = Math.min(f, paramFloat * 2.0F);
    }
    this.mSlider.setPosition(paramFloat);
  }
  
  public void onDrawerStateChanged(int paramInt) {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if ((paramMenuItem != null) && (paramMenuItem.getItemId() == 16908332) && (this.mDrawerIndicatorEnabled))
    {
      if (this.mDrawerLayout.isDrawerVisible(8388611)) {
        this.mDrawerLayout.closeDrawer(8388611);
      } else {
        this.mDrawerLayout.openDrawer(8388611);
      }
      return true;
    }
    return false;
  }
  
  public void setDrawerIndicatorEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.mDrawerIndicatorEnabled)
    {
      if (paramBoolean)
      {
        SlideDrawable localSlideDrawable = this.mSlider;
        int i;
        if (this.mDrawerLayout.isDrawerOpen(8388611)) {
          i = this.mCloseDrawerContentDescRes;
        } else {
          i = this.mOpenDrawerContentDescRes;
        }
        setActionBarUpIndicator(localSlideDrawable, i);
      }
      else
      {
        setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
      }
      this.mDrawerIndicatorEnabled = paramBoolean;
    }
  }
  
  public void setHomeAsUpIndicator(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = ContextCompat.getDrawable(this.mActivity, paramInt);
    } else {
      localDrawable = null;
    }
    setHomeAsUpIndicator(localDrawable);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    if (paramDrawable == null)
    {
      this.mHomeAsUpIndicator = getThemeUpIndicator();
      this.mHasCustomUpIndicator = false;
    }
    else
    {
      this.mHomeAsUpIndicator = paramDrawable;
      this.mHasCustomUpIndicator = true;
    }
    if (!this.mDrawerIndicatorEnabled) {
      setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
    }
  }
  
  public void syncState()
  {
    if (this.mDrawerLayout.isDrawerOpen(8388611)) {
      this.mSlider.setPosition(1.0F);
    } else {
      this.mSlider.setPosition(0.0F);
    }
    if (this.mDrawerIndicatorEnabled)
    {
      SlideDrawable localSlideDrawable = this.mSlider;
      int i;
      if (this.mDrawerLayout.isDrawerOpen(8388611)) {
        i = this.mCloseDrawerContentDescRes;
      } else {
        i = this.mOpenDrawerContentDescRes;
      }
      setActionBarUpIndicator(localSlideDrawable, i);
    }
  }
  
  @Deprecated
  public static abstract interface Delegate
  {
    public abstract Drawable getThemeUpIndicator();
    
    public abstract void setActionBarDescription(int paramInt);
    
    public abstract void setActionBarUpIndicator(Drawable paramDrawable, int paramInt);
  }
  
  @Deprecated
  public static abstract interface DelegateProvider
  {
    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();
  }
  
  private static class SetIndicatorInfo
  {
    Method mSetHomeActionContentDescription;
    Method mSetHomeAsUpIndicator;
    ImageView mUpIndicatorView;
    
    SetIndicatorInfo(Activity paramActivity)
    {
      try
      {
        this.mSetHomeAsUpIndicator = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[] { Drawable.class });
        this.mSetHomeActionContentDescription = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[] { Integer.TYPE });
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        paramActivity = paramActivity.findViewById(16908332);
        if (paramActivity == null) {
          return;
        }
        paramActivity = (ViewGroup)paramActivity.getParent();
        if (paramActivity.getChildCount() != 2) {
          return;
        }
        View localView1 = paramActivity.getChildAt(0);
        View localView2 = paramActivity.getChildAt(1);
        paramActivity = localView1;
        if (localView1.getId() == 16908332) {
          paramActivity = localView2;
        }
        if ((paramActivity instanceof ImageView)) {
          this.mUpIndicatorView = ((ImageView)paramActivity);
        }
      }
    }
  }
  
  private class SlideDrawable
    extends InsetDrawable
    implements Drawable.Callback
  {
    private final boolean mHasMirroring;
    private float mOffset;
    private float mPosition;
    private final Rect mTmpRect;
    
    SlideDrawable(Drawable paramDrawable)
    {
      super(0);
      if (Build.VERSION.SDK_INT > 18) {
        bool = true;
      }
      this.mHasMirroring = bool;
      this.mTmpRect = new Rect();
    }
    
    public void draw(Canvas paramCanvas)
    {
      copyBounds(this.mTmpRect);
      paramCanvas.save();
      int i = ViewCompat.getLayoutDirection(ActionBarDrawerToggle.this.mActivity.getWindow().getDecorView());
      int j = 1;
      if (i == 1) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        j = -1;
      }
      int k = this.mTmpRect.width();
      float f2 = -this.mOffset;
      float f1 = k;
      paramCanvas.translate(f2 * f1 * this.mPosition * j, 0.0F);
      if ((i != 0) && (!this.mHasMirroring))
      {
        paramCanvas.translate(f1, 0.0F);
        paramCanvas.scale(-1.0F, 1.0F);
      }
      super.draw(paramCanvas);
      paramCanvas.restore();
    }
    
    public float getPosition()
    {
      return this.mPosition;
    }
    
    public void setOffset(float paramFloat)
    {
      this.mOffset = paramFloat;
      invalidateSelf();
    }
    
    public void setPosition(float paramFloat)
    {
      this.mPosition = paramFloat;
      invalidateSelf();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\legacy\app\ActionBarDrawerToggle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */