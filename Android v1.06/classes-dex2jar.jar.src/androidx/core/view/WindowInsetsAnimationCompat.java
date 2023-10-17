package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.R.id;
import androidx.core.graphics.Insets;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class WindowInsetsAnimationCompat
{
  private static final boolean DEBUG = false;
  private static final String TAG = "WindowInsetsAnimCompat";
  private Impl mImpl;
  
  public WindowInsetsAnimationCompat(int paramInt, Interpolator paramInterpolator, long paramLong)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      this.mImpl = new Impl30(paramInt, paramInterpolator, paramLong);
    } else if (Build.VERSION.SDK_INT >= 21) {
      this.mImpl = new Impl21(paramInt, paramInterpolator, paramLong);
    } else {
      this.mImpl = new Impl(0, paramInterpolator, paramLong);
    }
  }
  
  private WindowInsetsAnimationCompat(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    this(0, null, 0L);
    if (Build.VERSION.SDK_INT >= 30) {
      this.mImpl = new Impl30(paramWindowInsetsAnimation);
    }
  }
  
  static void setCallback(View paramView, Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      Impl30.setCallback(paramView, paramCallback);
    } else if (Build.VERSION.SDK_INT >= 21) {
      Impl21.setCallback(paramView, paramCallback);
    }
  }
  
  static WindowInsetsAnimationCompat toWindowInsetsAnimationCompat(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    return new WindowInsetsAnimationCompat(paramWindowInsetsAnimation);
  }
  
  public float getAlpha()
  {
    return this.mImpl.getAlpha();
  }
  
  public long getDurationMillis()
  {
    return this.mImpl.getDurationMillis();
  }
  
  public float getFraction()
  {
    return this.mImpl.getFraction();
  }
  
  public float getInterpolatedFraction()
  {
    return this.mImpl.getInterpolatedFraction();
  }
  
  public Interpolator getInterpolator()
  {
    return this.mImpl.getInterpolator();
  }
  
  public int getTypeMask()
  {
    return this.mImpl.getTypeMask();
  }
  
  public void setAlpha(float paramFloat)
  {
    this.mImpl.setAlpha(paramFloat);
  }
  
  public void setFraction(float paramFloat)
  {
    this.mImpl.setFraction(paramFloat);
  }
  
  public static final class BoundsCompat
  {
    private final Insets mLowerBound;
    private final Insets mUpperBound;
    
    private BoundsCompat(WindowInsetsAnimation.Bounds paramBounds)
    {
      this.mLowerBound = WindowInsetsAnimationCompat.Impl30.getLowerBounds(paramBounds);
      this.mUpperBound = WindowInsetsAnimationCompat.Impl30.getHigherBounds(paramBounds);
    }
    
    public BoundsCompat(Insets paramInsets1, Insets paramInsets2)
    {
      this.mLowerBound = paramInsets1;
      this.mUpperBound = paramInsets2;
    }
    
    public static BoundsCompat toBoundsCompat(WindowInsetsAnimation.Bounds paramBounds)
    {
      return new BoundsCompat(paramBounds);
    }
    
    public Insets getLowerBound()
    {
      return this.mLowerBound;
    }
    
    public Insets getUpperBound()
    {
      return this.mUpperBound;
    }
    
    public BoundsCompat inset(Insets paramInsets)
    {
      return new BoundsCompat(WindowInsetsCompat.insetInsets(this.mLowerBound, paramInsets.left, paramInsets.top, paramInsets.right, paramInsets.bottom), WindowInsetsCompat.insetInsets(this.mUpperBound, paramInsets.left, paramInsets.top, paramInsets.right, paramInsets.bottom));
    }
    
    public WindowInsetsAnimation.Bounds toBounds()
    {
      return WindowInsetsAnimationCompat.Impl30.createPlatformBounds(this);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Bounds{lower=");
      localStringBuilder.append(this.mLowerBound);
      localStringBuilder.append(" upper=");
      localStringBuilder.append(this.mUpperBound);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class Callback
  {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    WindowInsets mDispachedInsets;
    private final int mDispatchMode;
    
    public Callback(int paramInt)
    {
      this.mDispatchMode = paramInt;
    }
    
    public final int getDispatchMode()
    {
      return this.mDispatchMode;
    }
    
    public void onEnd(WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat) {}
    
    public void onPrepare(WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat) {}
    
    public abstract WindowInsetsCompat onProgress(WindowInsetsCompat paramWindowInsetsCompat, List<WindowInsetsAnimationCompat> paramList);
    
    public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
    {
      return paramBoundsCompat;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public static @interface DispatchMode {}
  }
  
  private static class Impl
  {
    private float mAlpha;
    private final long mDurationMillis;
    private float mFraction;
    private final Interpolator mInterpolator;
    private final int mTypeMask;
    
    Impl(int paramInt, Interpolator paramInterpolator, long paramLong)
    {
      this.mTypeMask = paramInt;
      this.mInterpolator = paramInterpolator;
      this.mDurationMillis = paramLong;
    }
    
    public float getAlpha()
    {
      return this.mAlpha;
    }
    
    public long getDurationMillis()
    {
      return this.mDurationMillis;
    }
    
    public float getFraction()
    {
      return this.mFraction;
    }
    
    public float getInterpolatedFraction()
    {
      Interpolator localInterpolator = this.mInterpolator;
      if (localInterpolator != null) {
        return localInterpolator.getInterpolation(this.mFraction);
      }
      return this.mFraction;
    }
    
    public Interpolator getInterpolator()
    {
      return this.mInterpolator;
    }
    
    public int getTypeMask()
    {
      return this.mTypeMask;
    }
    
    public void setAlpha(float paramFloat)
    {
      this.mAlpha = paramFloat;
    }
    
    public void setFraction(float paramFloat)
    {
      this.mFraction = paramFloat;
    }
  }
  
  private static class Impl21
    extends WindowInsetsAnimationCompat.Impl
  {
    Impl21(int paramInt, Interpolator paramInterpolator, long paramLong)
    {
      super(paramInterpolator, paramLong);
    }
    
    static int buildAnimationMask(WindowInsetsCompat paramWindowInsetsCompat1, WindowInsetsCompat paramWindowInsetsCompat2)
    {
      int j = 1;
      int i;
      for (int k = 0; j <= 256; k = i)
      {
        i = k;
        if (!paramWindowInsetsCompat1.getInsets(j).equals(paramWindowInsetsCompat2.getInsets(j))) {
          i = k | j;
        }
        j <<= 1;
      }
      return k;
    }
    
    static WindowInsetsAnimationCompat.BoundsCompat computeAnimationBounds(WindowInsetsCompat paramWindowInsetsCompat1, WindowInsetsCompat paramWindowInsetsCompat2, int paramInt)
    {
      paramWindowInsetsCompat1 = paramWindowInsetsCompat1.getInsets(paramInt);
      paramWindowInsetsCompat2 = paramWindowInsetsCompat2.getInsets(paramInt);
      return new WindowInsetsAnimationCompat.BoundsCompat(Insets.of(Math.min(paramWindowInsetsCompat1.left, paramWindowInsetsCompat2.left), Math.min(paramWindowInsetsCompat1.top, paramWindowInsetsCompat2.top), Math.min(paramWindowInsetsCompat1.right, paramWindowInsetsCompat2.right), Math.min(paramWindowInsetsCompat1.bottom, paramWindowInsetsCompat2.bottom)), Insets.of(Math.max(paramWindowInsetsCompat1.left, paramWindowInsetsCompat2.left), Math.max(paramWindowInsetsCompat1.top, paramWindowInsetsCompat2.top), Math.max(paramWindowInsetsCompat1.right, paramWindowInsetsCompat2.right), Math.max(paramWindowInsetsCompat1.bottom, paramWindowInsetsCompat2.bottom)));
    }
    
    private static View.OnApplyWindowInsetsListener createProxyListener(View paramView, WindowInsetsAnimationCompat.Callback paramCallback)
    {
      return new Impl21OnApplyWindowInsetsListener(paramView, paramCallback);
    }
    
    static void dispatchOnEnd(View paramView, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat)
    {
      WindowInsetsAnimationCompat.Callback localCallback = getCallback(paramView);
      if (localCallback != null)
      {
        localCallback.onEnd(paramWindowInsetsAnimationCompat);
        if (localCallback.getDispatchMode() == 0) {
          return;
        }
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        for (int i = 0; i < paramView.getChildCount(); i++) {
          dispatchOnEnd(paramView.getChildAt(i), paramWindowInsetsAnimationCompat);
        }
      }
    }
    
    static void dispatchOnPrepare(View paramView, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsets paramWindowInsets, boolean paramBoolean)
    {
      WindowInsetsAnimationCompat.Callback localCallback = getCallback(paramView);
      int i = 0;
      boolean bool = paramBoolean;
      if (localCallback != null)
      {
        localCallback.mDispachedInsets = paramWindowInsets;
        bool = paramBoolean;
        if (!paramBoolean)
        {
          localCallback.onPrepare(paramWindowInsetsAnimationCompat);
          if (localCallback.getDispatchMode() == 0) {
            bool = true;
          } else {
            bool = false;
          }
        }
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        while (i < paramView.getChildCount())
        {
          dispatchOnPrepare(paramView.getChildAt(i), paramWindowInsetsAnimationCompat, paramWindowInsets, bool);
          i++;
        }
      }
    }
    
    static void dispatchOnProgress(View paramView, WindowInsetsCompat paramWindowInsetsCompat, List<WindowInsetsAnimationCompat> paramList)
    {
      WindowInsetsAnimationCompat.Callback localCallback = getCallback(paramView);
      WindowInsetsCompat localWindowInsetsCompat = paramWindowInsetsCompat;
      if (localCallback != null)
      {
        localWindowInsetsCompat = localCallback.onProgress(paramWindowInsetsCompat, paramList);
        if (localCallback.getDispatchMode() == 0) {
          return;
        }
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        for (int i = 0; i < paramView.getChildCount(); i++) {
          dispatchOnProgress(paramView.getChildAt(i), localWindowInsetsCompat, paramList);
        }
      }
    }
    
    static void dispatchOnStart(View paramView, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
    {
      WindowInsetsAnimationCompat.Callback localCallback = getCallback(paramView);
      if (localCallback != null)
      {
        localCallback.onStart(paramWindowInsetsAnimationCompat, paramBoundsCompat);
        if (localCallback.getDispatchMode() == 0) {
          return;
        }
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        for (int i = 0; i < paramView.getChildCount(); i++) {
          dispatchOnStart(paramView.getChildAt(i), paramWindowInsetsAnimationCompat, paramBoundsCompat);
        }
      }
    }
    
    static WindowInsets forwardToViewIfNeeded(View paramView, WindowInsets paramWindowInsets)
    {
      if (paramView.getTag(R.id.tag_on_apply_window_listener) != null) {
        return paramWindowInsets;
      }
      return paramView.onApplyWindowInsets(paramWindowInsets);
    }
    
    static WindowInsetsAnimationCompat.Callback getCallback(View paramView)
    {
      paramView = paramView.getTag(R.id.tag_window_insets_animation_callback);
      if ((paramView instanceof Impl21OnApplyWindowInsetsListener)) {
        paramView = ((Impl21OnApplyWindowInsetsListener)paramView).mCallback;
      } else {
        paramView = null;
      }
      return paramView;
    }
    
    static WindowInsetsCompat interpolateInsets(WindowInsetsCompat paramWindowInsetsCompat1, WindowInsetsCompat paramWindowInsetsCompat2, float paramFloat, int paramInt)
    {
      WindowInsetsCompat.Builder localBuilder = new WindowInsetsCompat.Builder(paramWindowInsetsCompat1);
      int i = 1;
      while (i <= 256)
      {
        if ((paramInt & i) == 0)
        {
          localBuilder.setInsets(i, paramWindowInsetsCompat1.getInsets(i));
        }
        else
        {
          Insets localInsets1 = paramWindowInsetsCompat1.getInsets(i);
          Insets localInsets2 = paramWindowInsetsCompat2.getInsets(i);
          float f1 = localInsets1.left - localInsets2.left;
          float f2 = 1.0F - paramFloat;
          localBuilder.setInsets(i, WindowInsetsCompat.insetInsets(localInsets1, (int)(f1 * f2 + 0.5D), (int)((localInsets1.top - localInsets2.top) * f2 + 0.5D), (int)((localInsets1.right - localInsets2.right) * f2 + 0.5D), (int)((localInsets1.bottom - localInsets2.bottom) * f2 + 0.5D)));
        }
        i <<= 1;
      }
      return localBuilder.build();
    }
    
    static void setCallback(View paramView, WindowInsetsAnimationCompat.Callback paramCallback)
    {
      Object localObject = paramView.getTag(R.id.tag_on_apply_window_listener);
      if (paramCallback == null)
      {
        paramView.setTag(R.id.tag_window_insets_animation_callback, null);
        if (localObject == null) {
          paramView.setOnApplyWindowInsetsListener(null);
        }
      }
      else
      {
        paramCallback = createProxyListener(paramView, paramCallback);
        paramView.setTag(R.id.tag_window_insets_animation_callback, paramCallback);
        if (localObject == null) {
          paramView.setOnApplyWindowInsetsListener(paramCallback);
        }
      }
    }
    
    private static class Impl21OnApplyWindowInsetsListener
      implements View.OnApplyWindowInsetsListener
    {
      private static final int COMPAT_ANIMATION_DURATION = 160;
      final WindowInsetsAnimationCompat.Callback mCallback;
      private WindowInsetsCompat mLastInsets;
      
      Impl21OnApplyWindowInsetsListener(View paramView, WindowInsetsAnimationCompat.Callback paramCallback)
      {
        this.mCallback = paramCallback;
        paramView = ViewCompat.getRootWindowInsets(paramView);
        if (paramView != null) {
          paramView = new WindowInsetsCompat.Builder(paramView).build();
        } else {
          paramView = null;
        }
        this.mLastInsets = paramView;
      }
      
      public WindowInsets onApplyWindowInsets(final View paramView, WindowInsets paramWindowInsets)
      {
        if (!paramView.isLaidOut())
        {
          this.mLastInsets = WindowInsetsCompat.toWindowInsetsCompat(paramWindowInsets, paramView);
          return WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(paramView, paramWindowInsets);
        }
        final WindowInsetsCompat localWindowInsetsCompat1 = WindowInsetsCompat.toWindowInsetsCompat(paramWindowInsets, paramView);
        if (this.mLastInsets == null) {
          this.mLastInsets = ViewCompat.getRootWindowInsets(paramView);
        }
        if (this.mLastInsets == null)
        {
          this.mLastInsets = localWindowInsetsCompat1;
          return WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(paramView, paramWindowInsets);
        }
        final Object localObject = WindowInsetsAnimationCompat.Impl21.getCallback(paramView);
        if ((localObject != null) && (Objects.equals(((WindowInsetsAnimationCompat.Callback)localObject).mDispachedInsets, paramWindowInsets))) {
          return WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(paramView, paramWindowInsets);
        }
        final int i = WindowInsetsAnimationCompat.Impl21.buildAnimationMask(localWindowInsetsCompat1, this.mLastInsets);
        if (i == 0) {
          return WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(paramView, paramWindowInsets);
        }
        final WindowInsetsCompat localWindowInsetsCompat2 = this.mLastInsets;
        localObject = new WindowInsetsAnimationCompat(i, new DecelerateInterpolator(), 160L);
        ((WindowInsetsAnimationCompat)localObject).setFraction(0.0F);
        final ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(((WindowInsetsAnimationCompat)localObject).getDurationMillis());
        final WindowInsetsAnimationCompat.BoundsCompat localBoundsCompat = WindowInsetsAnimationCompat.Impl21.computeAnimationBounds(localWindowInsetsCompat1, localWindowInsetsCompat2, i);
        WindowInsetsAnimationCompat.Impl21.dispatchOnPrepare(paramView, (WindowInsetsAnimationCompat)localObject, paramWindowInsets, false);
        localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            localObject.setFraction(paramAnonymousValueAnimator.getAnimatedFraction());
            paramAnonymousValueAnimator = WindowInsetsAnimationCompat.Impl21.interpolateInsets(localWindowInsetsCompat1, localWindowInsetsCompat2, localObject.getInterpolatedFraction(), i);
            List localList = Collections.singletonList(localObject);
            WindowInsetsAnimationCompat.Impl21.dispatchOnProgress(paramView, paramAnonymousValueAnimator, localList);
          }
        });
        localValueAnimator.addListener(new AnimatorListenerAdapter()
        {
          public void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            localObject.setFraction(1.0F);
            WindowInsetsAnimationCompat.Impl21.dispatchOnEnd(paramView, localObject);
          }
        });
        OneShotPreDrawListener.add(paramView, new Runnable()
        {
          public void run()
          {
            WindowInsetsAnimationCompat.Impl21.dispatchOnStart(paramView, localObject, localBoundsCompat);
            localValueAnimator.start();
          }
        });
        this.mLastInsets = localWindowInsetsCompat1;
        return WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(paramView, paramWindowInsets);
      }
    }
  }
  
  private static class Impl30
    extends WindowInsetsAnimationCompat.Impl
  {
    private final WindowInsetsAnimation mWrapped;
    
    Impl30(int paramInt, Interpolator paramInterpolator, long paramLong)
    {
      this(new WindowInsetsAnimation(paramInt, paramInterpolator, paramLong));
    }
    
    Impl30(WindowInsetsAnimation paramWindowInsetsAnimation)
    {
      super(null, 0L);
      this.mWrapped = paramWindowInsetsAnimation;
    }
    
    public static WindowInsetsAnimation.Bounds createPlatformBounds(WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
    {
      return new WindowInsetsAnimation.Bounds(paramBoundsCompat.getLowerBound().toPlatformInsets(), paramBoundsCompat.getUpperBound().toPlatformInsets());
    }
    
    public static Insets getHigherBounds(WindowInsetsAnimation.Bounds paramBounds)
    {
      return Insets.toCompatInsets(paramBounds.getUpperBound());
    }
    
    public static Insets getLowerBounds(WindowInsetsAnimation.Bounds paramBounds)
    {
      return Insets.toCompatInsets(paramBounds.getLowerBound());
    }
    
    public static void setCallback(View paramView, WindowInsetsAnimationCompat.Callback paramCallback)
    {
      if (paramCallback != null) {
        paramCallback = new ProxyCallback(paramCallback);
      } else {
        paramCallback = null;
      }
      paramView.setWindowInsetsAnimationCallback(paramCallback);
    }
    
    public long getDurationMillis()
    {
      return this.mWrapped.getDurationMillis();
    }
    
    public float getFraction()
    {
      return this.mWrapped.getFraction();
    }
    
    public float getInterpolatedFraction()
    {
      return this.mWrapped.getInterpolatedFraction();
    }
    
    public Interpolator getInterpolator()
    {
      return this.mWrapped.getInterpolator();
    }
    
    public int getTypeMask()
    {
      return this.mWrapped.getTypeMask();
    }
    
    public void setFraction(float paramFloat)
    {
      this.mWrapped.setFraction(paramFloat);
    }
    
    private static class ProxyCallback
      extends WindowInsetsAnimation.Callback
    {
      private final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> mAnimations = new HashMap();
      private final WindowInsetsAnimationCompat.Callback mCompat;
      private List<WindowInsetsAnimationCompat> mRORunningAnimations;
      private ArrayList<WindowInsetsAnimationCompat> mTmpRunningAnimations;
      
      ProxyCallback(WindowInsetsAnimationCompat.Callback paramCallback)
      {
        super();
        this.mCompat = paramCallback;
      }
      
      private WindowInsetsAnimationCompat getWindowInsetsAnimationCompat(WindowInsetsAnimation paramWindowInsetsAnimation)
      {
        WindowInsetsAnimationCompat localWindowInsetsAnimationCompat2 = (WindowInsetsAnimationCompat)this.mAnimations.get(paramWindowInsetsAnimation);
        WindowInsetsAnimationCompat localWindowInsetsAnimationCompat1 = localWindowInsetsAnimationCompat2;
        if (localWindowInsetsAnimationCompat2 == null)
        {
          localWindowInsetsAnimationCompat1 = WindowInsetsAnimationCompat.toWindowInsetsAnimationCompat(paramWindowInsetsAnimation);
          this.mAnimations.put(paramWindowInsetsAnimation, localWindowInsetsAnimationCompat1);
        }
        return localWindowInsetsAnimationCompat1;
      }
      
      public void onEnd(WindowInsetsAnimation paramWindowInsetsAnimation)
      {
        this.mCompat.onEnd(getWindowInsetsAnimationCompat(paramWindowInsetsAnimation));
        this.mAnimations.remove(paramWindowInsetsAnimation);
      }
      
      public void onPrepare(WindowInsetsAnimation paramWindowInsetsAnimation)
      {
        this.mCompat.onPrepare(getWindowInsetsAnimationCompat(paramWindowInsetsAnimation));
      }
      
      public WindowInsets onProgress(WindowInsets paramWindowInsets, List<WindowInsetsAnimation> paramList)
      {
        Object localObject = this.mTmpRunningAnimations;
        if (localObject == null)
        {
          localObject = new ArrayList(paramList.size());
          this.mTmpRunningAnimations = ((ArrayList)localObject);
          this.mRORunningAnimations = Collections.unmodifiableList((List)localObject);
        }
        else
        {
          ((ArrayList)localObject).clear();
        }
        for (int i = paramList.size() - 1; i >= 0; i--)
        {
          WindowInsetsAnimation localWindowInsetsAnimation = (WindowInsetsAnimation)paramList.get(i);
          localObject = getWindowInsetsAnimationCompat(localWindowInsetsAnimation);
          ((WindowInsetsAnimationCompat)localObject).setFraction(localWindowInsetsAnimation.getFraction());
          this.mTmpRunningAnimations.add(localObject);
        }
        return this.mCompat.onProgress(WindowInsetsCompat.toWindowInsetsCompat(paramWindowInsets), this.mRORunningAnimations).toWindowInsets();
      }
      
      public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation paramWindowInsetsAnimation, WindowInsetsAnimation.Bounds paramBounds)
      {
        return this.mCompat.onStart(getWindowInsetsAnimationCompat(paramWindowInsetsAnimation), WindowInsetsAnimationCompat.BoundsCompat.toBoundsCompat(paramBounds)).toBounds();
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\WindowInsetsAnimationCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */