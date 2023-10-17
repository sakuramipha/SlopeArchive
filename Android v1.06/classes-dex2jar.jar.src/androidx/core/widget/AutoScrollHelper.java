package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;

public abstract class AutoScrollHelper
  implements View.OnTouchListener
{
  private static final int DEFAULT_ACTIVATION_DELAY = ;
  private static final int DEFAULT_EDGE_TYPE = 1;
  private static final float DEFAULT_MAXIMUM_EDGE = Float.MAX_VALUE;
  private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
  private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
  private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
  private static final int DEFAULT_RAMP_UP_DURATION = 500;
  private static final float DEFAULT_RELATIVE_EDGE = 0.2F;
  private static final float DEFAULT_RELATIVE_VELOCITY = 1.0F;
  public static final int EDGE_TYPE_INSIDE = 0;
  public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
  public static final int EDGE_TYPE_OUTSIDE = 2;
  private static final int HORIZONTAL = 0;
  public static final float NO_MAX = Float.MAX_VALUE;
  public static final float NO_MIN = 0.0F;
  public static final float RELATIVE_UNSPECIFIED = 0.0F;
  private static final int VERTICAL = 1;
  private int mActivationDelay;
  private boolean mAlreadyDelayed;
  boolean mAnimating;
  private final Interpolator mEdgeInterpolator = new AccelerateInterpolator();
  private int mEdgeType;
  private boolean mEnabled;
  private boolean mExclusive;
  private float[] mMaximumEdges = { Float.MAX_VALUE, Float.MAX_VALUE };
  private float[] mMaximumVelocity = { Float.MAX_VALUE, Float.MAX_VALUE };
  private float[] mMinimumVelocity = { 0.0F, 0.0F };
  boolean mNeedsCancel;
  boolean mNeedsReset;
  private float[] mRelativeEdges = { 0.0F, 0.0F };
  private float[] mRelativeVelocity = { 0.0F, 0.0F };
  private Runnable mRunnable;
  final ClampedScroller mScroller = new ClampedScroller();
  final View mTarget;
  
  public AutoScrollHelper(View paramView)
  {
    this.mTarget = paramView;
    paramView = Resources.getSystem().getDisplayMetrics();
    int i = (int)(paramView.density * 1575.0F + 0.5F);
    int j = (int)(paramView.density * 315.0F + 0.5F);
    float f = i;
    setMaximumVelocity(f, f);
    f = j;
    setMinimumVelocity(f, f);
    setEdgeType(1);
    setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
    setRelativeEdges(0.2F, 0.2F);
    setRelativeVelocity(1.0F, 1.0F);
    setActivationDelay(DEFAULT_ACTIVATION_DELAY);
    setRampUpDuration(500);
    setRampDownDuration(500);
  }
  
  private float computeTargetVelocity(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat1 = getEdgeValue(this.mRelativeEdges[paramInt], paramFloat2, this.mMaximumEdges[paramInt], paramFloat1);
    boolean bool = paramFloat1 < 0.0F;
    if (!bool) {
      return 0.0F;
    }
    float f2 = this.mRelativeVelocity[paramInt];
    float f1 = this.mMinimumVelocity[paramInt];
    paramFloat2 = this.mMaximumVelocity[paramInt];
    paramFloat3 = f2 * paramFloat3;
    if (bool) {
      return constrain(paramFloat1 * paramFloat3, f1, paramFloat2);
    }
    return -constrain(-paramFloat1 * paramFloat3, f1, paramFloat2);
  }
  
  static float constrain(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    return paramFloat1;
  }
  
  static int constrain(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    return paramInt1;
  }
  
  private float constrainEdgeValue(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {
      return 0.0F;
    }
    int i = this.mEdgeType;
    if ((i != 0) && (i != 1))
    {
      if ((i == 2) && (paramFloat1 < 0.0F)) {
        return paramFloat1 / -paramFloat2;
      }
    }
    else if (paramFloat1 < paramFloat2)
    {
      if (paramFloat1 >= 0.0F) {
        return 1.0F - paramFloat1 / paramFloat2;
      }
      if ((this.mAnimating) && (i == 1)) {
        return 1.0F;
      }
    }
    return 0.0F;
  }
  
  private float getEdgeValue(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat1 = constrain(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    paramFloat3 = constrainEdgeValue(paramFloat4, paramFloat1);
    paramFloat1 = constrainEdgeValue(paramFloat2 - paramFloat4, paramFloat1) - paramFloat3;
    if (paramFloat1 < 0.0F)
    {
      paramFloat1 = -this.mEdgeInterpolator.getInterpolation(-paramFloat1);
    }
    else
    {
      if (paramFloat1 <= 0.0F) {
        break label76;
      }
      paramFloat1 = this.mEdgeInterpolator.getInterpolation(paramFloat1);
    }
    return constrain(paramFloat1, -1.0F, 1.0F);
    label76:
    return 0.0F;
  }
  
  private void requestStop()
  {
    if (this.mNeedsReset) {
      this.mAnimating = false;
    } else {
      this.mScroller.requestStop();
    }
  }
  
  private void startAnimating()
  {
    if (this.mRunnable == null) {
      this.mRunnable = new ScrollAnimationRunnable();
    }
    this.mAnimating = true;
    this.mNeedsReset = true;
    if (!this.mAlreadyDelayed)
    {
      int i = this.mActivationDelay;
      if (i > 0)
      {
        ViewCompat.postOnAnimationDelayed(this.mTarget, this.mRunnable, i);
        break label70;
      }
    }
    this.mRunnable.run();
    label70:
    this.mAlreadyDelayed = true;
  }
  
  public abstract boolean canTargetScrollHorizontally(int paramInt);
  
  public abstract boolean canTargetScrollVertically(int paramInt);
  
  void cancelTargetTouch()
  {
    long l = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
    this.mTarget.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
  }
  
  public boolean isEnabled()
  {
    return this.mEnabled;
  }
  
  public boolean isExclusive()
  {
    return this.mExclusive;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.mEnabled;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    int i = paramMotionEvent.getActionMasked();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          if (i != 3) {
            break label140;
          }
        }
      }
      else
      {
        requestStop();
        break label140;
      }
    }
    else
    {
      this.mNeedsCancel = true;
      this.mAlreadyDelayed = false;
    }
    float f2 = computeTargetVelocity(0, paramMotionEvent.getX(), paramView.getWidth(), this.mTarget.getWidth());
    float f1 = computeTargetVelocity(1, paramMotionEvent.getY(), paramView.getHeight(), this.mTarget.getHeight());
    this.mScroller.setTargetVelocity(f2, f1);
    if ((!this.mAnimating) && (shouldAnimate())) {
      startAnimating();
    }
    label140:
    bool1 = bool2;
    if (this.mExclusive)
    {
      bool1 = bool2;
      if (this.mAnimating) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public abstract void scrollTargetBy(int paramInt1, int paramInt2);
  
  public AutoScrollHelper setActivationDelay(int paramInt)
  {
    this.mActivationDelay = paramInt;
    return this;
  }
  
  public AutoScrollHelper setEdgeType(int paramInt)
  {
    this.mEdgeType = paramInt;
    return this;
  }
  
  public AutoScrollHelper setEnabled(boolean paramBoolean)
  {
    if ((this.mEnabled) && (!paramBoolean)) {
      requestStop();
    }
    this.mEnabled = paramBoolean;
    return this;
  }
  
  public AutoScrollHelper setExclusive(boolean paramBoolean)
  {
    this.mExclusive = paramBoolean;
    return this;
  }
  
  public AutoScrollHelper setMaximumEdges(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.mMaximumEdges;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public AutoScrollHelper setMaximumVelocity(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.mMaximumVelocity;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public AutoScrollHelper setMinimumVelocity(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.mMinimumVelocity;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public AutoScrollHelper setRampDownDuration(int paramInt)
  {
    this.mScroller.setRampDownDuration(paramInt);
    return this;
  }
  
  public AutoScrollHelper setRampUpDuration(int paramInt)
  {
    this.mScroller.setRampUpDuration(paramInt);
    return this;
  }
  
  public AutoScrollHelper setRelativeEdges(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.mRelativeEdges;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public AutoScrollHelper setRelativeVelocity(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.mRelativeVelocity;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  boolean shouldAnimate()
  {
    ClampedScroller localClampedScroller = this.mScroller;
    int j = localClampedScroller.getVerticalDirection();
    int i = localClampedScroller.getHorizontalDirection();
    boolean bool;
    if (((j != 0) && (canTargetScrollVertically(j))) || ((i != 0) && (canTargetScrollHorizontally(i)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static class ClampedScroller
  {
    private long mDeltaTime = 0L;
    private int mDeltaX = 0;
    private int mDeltaY = 0;
    private int mEffectiveRampDown;
    private int mRampDownDuration;
    private int mRampUpDuration;
    private long mStartTime = Long.MIN_VALUE;
    private long mStopTime = -1L;
    private float mStopValue;
    private float mTargetVelocityX;
    private float mTargetVelocityY;
    
    private float getValueAt(long paramLong)
    {
      long l1 = this.mStartTime;
      if (paramLong < l1) {
        return 0.0F;
      }
      long l2 = this.mStopTime;
      if ((l2 >= 0L) && (paramLong >= l2))
      {
        float f = this.mStopValue;
        return 1.0F - f + f * AutoScrollHelper.constrain((float)(paramLong - l2) / this.mEffectiveRampDown, 0.0F, 1.0F);
      }
      return AutoScrollHelper.constrain((float)(paramLong - l1) / this.mRampUpDuration, 0.0F, 1.0F) * 0.5F;
    }
    
    private float interpolateValue(float paramFloat)
    {
      return -4.0F * paramFloat * paramFloat + paramFloat * 4.0F;
    }
    
    public void computeScrollDelta()
    {
      if (this.mDeltaTime != 0L)
      {
        long l2 = AnimationUtils.currentAnimationTimeMillis();
        float f = interpolateValue(getValueAt(l2));
        long l1 = this.mDeltaTime;
        this.mDeltaTime = l2;
        f = (float)(l2 - l1) * f;
        this.mDeltaX = ((int)(this.mTargetVelocityX * f));
        this.mDeltaY = ((int)(f * this.mTargetVelocityY));
        return;
      }
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }
    
    public int getDeltaX()
    {
      return this.mDeltaX;
    }
    
    public int getDeltaY()
    {
      return this.mDeltaY;
    }
    
    public int getHorizontalDirection()
    {
      float f = this.mTargetVelocityX;
      return (int)(f / Math.abs(f));
    }
    
    public int getVerticalDirection()
    {
      float f = this.mTargetVelocityY;
      return (int)(f / Math.abs(f));
    }
    
    public boolean isFinished()
    {
      boolean bool;
      if ((this.mStopTime > 0L) && (AnimationUtils.currentAnimationTimeMillis() > this.mStopTime + this.mEffectiveRampDown)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void requestStop()
    {
      long l = AnimationUtils.currentAnimationTimeMillis();
      this.mEffectiveRampDown = AutoScrollHelper.constrain((int)(l - this.mStartTime), 0, this.mRampDownDuration);
      this.mStopValue = getValueAt(l);
      this.mStopTime = l;
    }
    
    public void setRampDownDuration(int paramInt)
    {
      this.mRampDownDuration = paramInt;
    }
    
    public void setRampUpDuration(int paramInt)
    {
      this.mRampUpDuration = paramInt;
    }
    
    public void setTargetVelocity(float paramFloat1, float paramFloat2)
    {
      this.mTargetVelocityX = paramFloat1;
      this.mTargetVelocityY = paramFloat2;
    }
    
    public void start()
    {
      long l = AnimationUtils.currentAnimationTimeMillis();
      this.mStartTime = l;
      this.mStopTime = -1L;
      this.mDeltaTime = l;
      this.mStopValue = 0.5F;
      this.mDeltaX = 0;
      this.mDeltaY = 0;
    }
  }
  
  private class ScrollAnimationRunnable
    implements Runnable
  {
    ScrollAnimationRunnable() {}
    
    public void run()
    {
      if (!AutoScrollHelper.this.mAnimating) {
        return;
      }
      if (AutoScrollHelper.this.mNeedsReset)
      {
        AutoScrollHelper.this.mNeedsReset = false;
        AutoScrollHelper.this.mScroller.start();
      }
      AutoScrollHelper.ClampedScroller localClampedScroller = AutoScrollHelper.this.mScroller;
      if ((!localClampedScroller.isFinished()) && (AutoScrollHelper.this.shouldAnimate()))
      {
        if (AutoScrollHelper.this.mNeedsCancel)
        {
          AutoScrollHelper.this.mNeedsCancel = false;
          AutoScrollHelper.this.cancelTargetTouch();
        }
        localClampedScroller.computeScrollDelta();
        int j = localClampedScroller.getDeltaX();
        int i = localClampedScroller.getDeltaY();
        AutoScrollHelper.this.scrollTargetBy(j, i);
        ViewCompat.postOnAnimation(AutoScrollHelper.this.mTarget, this);
        return;
      }
      AutoScrollHelper.this.mAnimating = false;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\widget\AutoScrollHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */