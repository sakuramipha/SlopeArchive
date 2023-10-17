package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ListViewCompat;

public class SwipeRefreshLayout
  extends ViewGroup
  implements NestedScrollingParent, NestedScrollingChild
{
  private static final int ALPHA_ANIMATION_DURATION = 300;
  private static final int ANIMATE_TO_START_DURATION = 200;
  private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
  private static final int CIRCLE_BG_LIGHT = -328966;
  static final int CIRCLE_DIAMETER = 40;
  static final int CIRCLE_DIAMETER_LARGE = 56;
  private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0F;
  public static final int DEFAULT = 1;
  private static final int DEFAULT_CIRCLE_TARGET = 64;
  public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
  private static final float DRAG_RATE = 0.5F;
  private static final int INVALID_POINTER = -1;
  public static final int LARGE = 0;
  private static final int[] LAYOUT_ATTRS = { 16842766 };
  private static final String LOG_TAG = "SwipeRefreshLayout";
  private static final int MAX_ALPHA = 255;
  private static final float MAX_PROGRESS_ANGLE = 0.8F;
  private static final int SCALE_DOWN_DURATION = 150;
  private static final int STARTING_PROGRESS_ALPHA = 76;
  private int mActivePointerId = -1;
  private Animation mAlphaMaxAnimation;
  private Animation mAlphaStartAnimation;
  private final Animation mAnimateToCorrectPosition = new Animation()
  {
    public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
    {
      if (!SwipeRefreshLayout.this.mUsingCustomStart) {
        i = SwipeRefreshLayout.this.mSpinnerOffsetEnd - Math.abs(SwipeRefreshLayout.this.mOriginalOffsetTop);
      } else {
        i = SwipeRefreshLayout.this.mSpinnerOffsetEnd;
      }
      int j = SwipeRefreshLayout.this.mFrom;
      int i = (int)((i - SwipeRefreshLayout.this.mFrom) * paramAnonymousFloat);
      int k = SwipeRefreshLayout.this.mCircleView.getTop();
      SwipeRefreshLayout.this.setTargetOffsetTopAndBottom(j + i - k);
      SwipeRefreshLayout.this.mProgress.setArrowScale(1.0F - paramAnonymousFloat);
    }
  };
  private final Animation mAnimateToStartPosition = new Animation()
  {
    public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
    {
      SwipeRefreshLayout.this.moveToStart(paramAnonymousFloat);
    }
  };
  private OnChildScrollUpCallback mChildScrollUpCallback;
  private int mCircleDiameter;
  CircleImageView mCircleView;
  private int mCircleViewIndex = -1;
  int mCurrentTargetOffsetTop;
  int mCustomSlingshotDistance;
  private final DecelerateInterpolator mDecelerateInterpolator;
  protected int mFrom;
  private float mInitialDownY;
  private float mInitialMotionY;
  private boolean mIsBeingDragged;
  OnRefreshListener mListener;
  private int mMediumAnimationDuration;
  private boolean mNestedScrollInProgress;
  private final NestedScrollingChildHelper mNestedScrollingChildHelper;
  private final NestedScrollingParentHelper mNestedScrollingParentHelper;
  boolean mNotify;
  protected int mOriginalOffsetTop;
  private final int[] mParentOffsetInWindow = new int[2];
  private final int[] mParentScrollConsumed = new int[2];
  CircularProgressDrawable mProgress;
  private Animation.AnimationListener mRefreshListener = new Animation.AnimationListener()
  {
    public void onAnimationEnd(Animation paramAnonymousAnimation)
    {
      if (SwipeRefreshLayout.this.mRefreshing)
      {
        SwipeRefreshLayout.this.mProgress.setAlpha(255);
        SwipeRefreshLayout.this.mProgress.start();
        if ((SwipeRefreshLayout.this.mNotify) && (SwipeRefreshLayout.this.mListener != null)) {
          SwipeRefreshLayout.this.mListener.onRefresh();
        }
        paramAnonymousAnimation = SwipeRefreshLayout.this;
        paramAnonymousAnimation.mCurrentTargetOffsetTop = paramAnonymousAnimation.mCircleView.getTop();
      }
      else
      {
        SwipeRefreshLayout.this.reset();
      }
    }
    
    public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
    
    public void onAnimationStart(Animation paramAnonymousAnimation) {}
  };
  boolean mRefreshing = false;
  private boolean mReturningToStart;
  boolean mScale;
  private Animation mScaleAnimation;
  private Animation mScaleDownAnimation;
  private Animation mScaleDownToStartAnimation;
  int mSpinnerOffsetEnd;
  float mStartingScale;
  private View mTarget;
  private float mTotalDragDistance = -1.0F;
  private float mTotalUnconsumed;
  private int mTouchSlop;
  boolean mUsingCustomStart;
  
  public SwipeRefreshLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mTouchSlop = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.mMediumAnimationDuration = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.mDecelerateInterpolator = new DecelerateInterpolator(2.0F);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.mCircleDiameter = ((int)(localDisplayMetrics.density * 40.0F));
    createProgressView();
    setChildrenDrawingOrderEnabled(true);
    int i = (int)(localDisplayMetrics.density * 64.0F);
    this.mSpinnerOffsetEnd = i;
    this.mTotalDragDistance = i;
    this.mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
    this.mNestedScrollingChildHelper = new NestedScrollingChildHelper(this);
    setNestedScrollingEnabled(true);
    i = -this.mCircleDiameter;
    this.mCurrentTargetOffsetTop = i;
    this.mOriginalOffsetTop = i;
    moveToStart(1.0F);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, LAYOUT_ATTRS);
    setEnabled(paramContext.getBoolean(0, true));
    paramContext.recycle();
  }
  
  private void animateOffsetToCorrectPosition(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    this.mFrom = paramInt;
    this.mAnimateToCorrectPosition.reset();
    this.mAnimateToCorrectPosition.setDuration(200L);
    this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
    if (paramAnimationListener != null) {
      this.mCircleView.setAnimationListener(paramAnimationListener);
    }
    this.mCircleView.clearAnimation();
    this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
  }
  
  private void animateOffsetToStartPosition(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    if (this.mScale)
    {
      startScaleDownReturnToStartAnimation(paramInt, paramAnimationListener);
    }
    else
    {
      this.mFrom = paramInt;
      this.mAnimateToStartPosition.reset();
      this.mAnimateToStartPosition.setDuration(200L);
      this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
      if (paramAnimationListener != null) {
        this.mCircleView.setAnimationListener(paramAnimationListener);
      }
      this.mCircleView.clearAnimation();
      this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }
  }
  
  private void createProgressView()
  {
    this.mCircleView = new CircleImageView(getContext(), -328966);
    CircularProgressDrawable localCircularProgressDrawable = new CircularProgressDrawable(getContext());
    this.mProgress = localCircularProgressDrawable;
    localCircularProgressDrawable.setStyle(1);
    this.mCircleView.setImageDrawable(this.mProgress);
    this.mCircleView.setVisibility(8);
    addView(this.mCircleView);
  }
  
  private void ensureTarget()
  {
    if (this.mTarget == null) {
      for (int i = 0; i < getChildCount(); i++)
      {
        View localView = getChildAt(i);
        if (!localView.equals(this.mCircleView))
        {
          this.mTarget = localView;
          break;
        }
      }
    }
  }
  
  private void finishSpinner(float paramFloat)
  {
    if (paramFloat > this.mTotalDragDistance)
    {
      setRefreshing(true, true);
    }
    else
    {
      this.mRefreshing = false;
      this.mProgress.setStartEndTrim(0.0F, 0.0F);
      Animation.AnimationListener local5 = null;
      if (!this.mScale) {
        local5 = new Animation.AnimationListener()
        {
          public void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            if (!SwipeRefreshLayout.this.mScale) {
              SwipeRefreshLayout.this.startScaleDownAnimation(null);
            }
          }
          
          public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
          
          public void onAnimationStart(Animation paramAnonymousAnimation) {}
        };
      }
      animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, local5);
      this.mProgress.setArrowEnabled(false);
    }
  }
  
  private boolean isAnimationRunning(Animation paramAnimation)
  {
    boolean bool;
    if ((paramAnimation != null) && (paramAnimation.hasStarted()) && (!paramAnimation.hasEnded())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void moveSpinner(float paramFloat)
  {
    this.mProgress.setArrowEnabled(true);
    float f1 = Math.min(1.0F, Math.abs(paramFloat / this.mTotalDragDistance));
    float f2 = (float)Math.max(f1 - 0.4D, 0.0D) * 5.0F / 3.0F;
    float f4 = Math.abs(paramFloat);
    float f5 = this.mTotalDragDistance;
    int i = this.mCustomSlingshotDistance;
    if (i > 0) {}
    float f3;
    for (;;)
    {
      f3 = i;
      break;
      if (this.mUsingCustomStart) {
        i = this.mSpinnerOffsetEnd - this.mOriginalOffsetTop;
      } else {
        i = this.mSpinnerOffsetEnd;
      }
    }
    double d = Math.max(0.0F, Math.min(f4 - f5, f3 * 2.0F) / f3) / 4.0F;
    f4 = (float)(d - Math.pow(d, 2.0D)) * 2.0F;
    int j = this.mOriginalOffsetTop;
    i = (int)(f3 * f1 + f3 * f4 * 2.0F);
    if (this.mCircleView.getVisibility() != 0) {
      this.mCircleView.setVisibility(0);
    }
    if (!this.mScale)
    {
      this.mCircleView.setScaleX(1.0F);
      this.mCircleView.setScaleY(1.0F);
    }
    if (this.mScale) {
      setAnimationProgress(Math.min(1.0F, paramFloat / this.mTotalDragDistance));
    }
    if (paramFloat < this.mTotalDragDistance)
    {
      if ((this.mProgress.getAlpha() > 76) && (!isAnimationRunning(this.mAlphaStartAnimation))) {
        startProgressAlphaStartAnimation();
      }
    }
    else if ((this.mProgress.getAlpha() < 255) && (!isAnimationRunning(this.mAlphaMaxAnimation))) {
      startProgressAlphaMaxAnimation();
    }
    this.mProgress.setStartEndTrim(0.0F, Math.min(0.8F, f2 * 0.8F));
    this.mProgress.setArrowScale(Math.min(1.0F, f2));
    this.mProgress.setProgressRotation((f2 * 0.4F - 0.25F + f4 * 2.0F) * 0.5F);
    setTargetOffsetTopAndBottom(j + i - this.mCurrentTargetOffsetTop);
  }
  
  private void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.mActivePointerId)
    {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      this.mActivePointerId = paramMotionEvent.getPointerId(i);
    }
  }
  
  private void setColorViewAlpha(int paramInt)
  {
    this.mCircleView.getBackground().setAlpha(paramInt);
    this.mProgress.setAlpha(paramInt);
  }
  
  private void setRefreshing(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mRefreshing != paramBoolean1)
    {
      this.mNotify = paramBoolean2;
      ensureTarget();
      this.mRefreshing = paramBoolean1;
      if (paramBoolean1) {
        animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
      } else {
        startScaleDownAnimation(this.mRefreshListener);
      }
    }
  }
  
  private Animation startAlphaAnimation(final int paramInt1, final int paramInt2)
  {
    Animation local4 = new Animation()
    {
      public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        paramAnonymousTransformation = SwipeRefreshLayout.this.mProgress;
        int i = paramInt1;
        paramAnonymousTransformation.setAlpha((int)(i + (paramInt2 - i) * paramAnonymousFloat));
      }
    };
    local4.setDuration(300L);
    this.mCircleView.setAnimationListener(null);
    this.mCircleView.clearAnimation();
    this.mCircleView.startAnimation(local4);
    return local4;
  }
  
  private void startDragging(float paramFloat)
  {
    float f = this.mInitialDownY;
    int i = this.mTouchSlop;
    if ((paramFloat - f > i) && (!this.mIsBeingDragged))
    {
      this.mInitialMotionY = (f + i);
      this.mIsBeingDragged = true;
      this.mProgress.setAlpha(76);
    }
  }
  
  private void startProgressAlphaMaxAnimation()
  {
    this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 255);
  }
  
  private void startProgressAlphaStartAnimation()
  {
    this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 76);
  }
  
  private void startScaleDownReturnToStartAnimation(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    this.mFrom = paramInt;
    this.mStartingScale = this.mCircleView.getScaleX();
    Animation local8 = new Animation()
    {
      public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        float f1 = SwipeRefreshLayout.this.mStartingScale;
        float f2 = -SwipeRefreshLayout.this.mStartingScale;
        SwipeRefreshLayout.this.setAnimationProgress(f1 + f2 * paramAnonymousFloat);
        SwipeRefreshLayout.this.moveToStart(paramAnonymousFloat);
      }
    };
    this.mScaleDownToStartAnimation = local8;
    local8.setDuration(150L);
    if (paramAnimationListener != null) {
      this.mCircleView.setAnimationListener(paramAnimationListener);
    }
    this.mCircleView.clearAnimation();
    this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
  }
  
  private void startScaleUpAnimation(Animation.AnimationListener paramAnimationListener)
  {
    this.mCircleView.setVisibility(0);
    this.mProgress.setAlpha(255);
    Animation local2 = new Animation()
    {
      public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        SwipeRefreshLayout.this.setAnimationProgress(paramAnonymousFloat);
      }
    };
    this.mScaleAnimation = local2;
    local2.setDuration(this.mMediumAnimationDuration);
    if (paramAnimationListener != null) {
      this.mCircleView.setAnimationListener(paramAnimationListener);
    }
    this.mCircleView.clearAnimation();
    this.mCircleView.startAnimation(this.mScaleAnimation);
  }
  
  public boolean canChildScrollUp()
  {
    Object localObject = this.mChildScrollUpCallback;
    if (localObject != null) {
      return ((OnChildScrollUpCallback)localObject).canChildScrollUp(this, this.mTarget);
    }
    localObject = this.mTarget;
    if ((localObject instanceof ListView)) {
      return ListViewCompat.canScrollList((ListView)localObject, -1);
    }
    return ((View)localObject).canScrollVertically(-1);
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.mNestedScrollingChildHelper.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.mNestedScrollingChildHelper.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.mNestedScrollingChildHelper.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.mNestedScrollingChildHelper.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i = this.mCircleViewIndex;
    if (i < 0) {
      return paramInt2;
    }
    if (paramInt2 == paramInt1 - 1) {
      return i;
    }
    paramInt1 = paramInt2;
    if (paramInt2 >= i) {
      paramInt1 = paramInt2 + 1;
    }
    return paramInt1;
  }
  
  public int getNestedScrollAxes()
  {
    return this.mNestedScrollingParentHelper.getNestedScrollAxes();
  }
  
  public int getProgressCircleDiameter()
  {
    return this.mCircleDiameter;
  }
  
  public int getProgressViewEndOffset()
  {
    return this.mSpinnerOffsetEnd;
  }
  
  public int getProgressViewStartOffset()
  {
    return this.mOriginalOffsetTop;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.mNestedScrollingChildHelper.hasNestedScrollingParent();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.mNestedScrollingChildHelper.isNestedScrollingEnabled();
  }
  
  public boolean isRefreshing()
  {
    return this.mRefreshing;
  }
  
  void moveToStart(float paramFloat)
  {
    int i = this.mFrom;
    setTargetOffsetTopAndBottom(i + (int)((this.mOriginalOffsetTop - i) * paramFloat) - this.mCircleView.getTop());
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    reset();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    ensureTarget();
    int i = paramMotionEvent.getActionMasked();
    if ((this.mReturningToStart) && (i == 0)) {
      this.mReturningToStart = false;
    }
    if ((isEnabled()) && (!this.mReturningToStart) && (!canChildScrollUp()) && (!this.mRefreshing) && (!this.mNestedScrollInProgress))
    {
      if (i != 0)
      {
        if (i != 1) {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 6) {
                break label211;
              }
              onSecondaryPointerUp(paramMotionEvent);
              break label211;
            }
          }
          else
          {
            i = this.mActivePointerId;
            if (i == -1)
            {
              Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
              return false;
            }
            i = paramMotionEvent.findPointerIndex(i);
            if (i < 0) {
              return false;
            }
            startDragging(paramMotionEvent.getY(i));
            break label211;
          }
        }
        this.mIsBeingDragged = false;
        this.mActivePointerId = -1;
      }
      else
      {
        setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
        i = paramMotionEvent.getPointerId(0);
        this.mActivePointerId = i;
        this.mIsBeingDragged = false;
        i = paramMotionEvent.findPointerIndex(i);
        if (i < 0) {
          return false;
        }
        this.mInitialDownY = paramMotionEvent.getY(i);
      }
      label211:
      return this.mIsBeingDragged;
    }
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getMeasuredWidth();
    paramInt3 = getMeasuredHeight();
    if (getChildCount() == 0) {
      return;
    }
    if (this.mTarget == null) {
      ensureTarget();
    }
    Object localObject = this.mTarget;
    if (localObject == null) {
      return;
    }
    paramInt1 = getPaddingLeft();
    paramInt4 = getPaddingTop();
    ((View)localObject).layout(paramInt1, paramInt4, paramInt2 - getPaddingLeft() - getPaddingRight() + paramInt1, paramInt3 - getPaddingTop() - getPaddingBottom() + paramInt4);
    paramInt3 = this.mCircleView.getMeasuredWidth();
    paramInt1 = this.mCircleView.getMeasuredHeight();
    localObject = this.mCircleView;
    paramInt2 /= 2;
    paramInt3 /= 2;
    paramInt4 = this.mCurrentTargetOffsetTop;
    ((CircleImageView)localObject).layout(paramInt2 - paramInt3, paramInt4, paramInt2 + paramInt3, paramInt1 + paramInt4);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.mTarget == null) {
      ensureTarget();
    }
    View localView = this.mTarget;
    if (localView == null) {
      return;
    }
    localView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
    this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
    this.mCircleViewIndex = -1;
    for (paramInt1 = 0; paramInt1 < getChildCount(); paramInt1++) {
      if (getChildAt(paramInt1) == this.mCircleView)
      {
        this.mCircleViewIndex = paramInt1;
        break;
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if (paramInt2 > 0)
    {
      float f2 = this.mTotalUnconsumed;
      if (f2 > 0.0F)
      {
        float f1 = paramInt2;
        if (f1 > f2)
        {
          paramArrayOfInt[1] = (paramInt2 - (int)f2);
          this.mTotalUnconsumed = 0.0F;
        }
        else
        {
          this.mTotalUnconsumed = (f2 - f1);
          paramArrayOfInt[1] = paramInt2;
        }
        moveSpinner(this.mTotalUnconsumed);
      }
    }
    if ((this.mUsingCustomStart) && (paramInt2 > 0) && (this.mTotalUnconsumed == 0.0F) && (Math.abs(paramInt2 - paramArrayOfInt[1]) > 0)) {
      this.mCircleView.setVisibility(8);
    }
    paramView = this.mParentScrollConsumed;
    if (dispatchNestedPreScroll(paramInt1 - paramArrayOfInt[0], paramInt2 - paramArrayOfInt[1], paramView, null))
    {
      paramArrayOfInt[0] += paramView[0];
      paramArrayOfInt[1] += paramView[1];
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.mParentOffsetInWindow);
    paramInt1 = paramInt4 + this.mParentOffsetInWindow[1];
    if ((paramInt1 < 0) && (!canChildScrollUp()))
    {
      float f = this.mTotalUnconsumed + Math.abs(paramInt1);
      this.mTotalUnconsumed = f;
      moveSpinner(f);
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.mNestedScrollingParentHelper.onNestedScrollAccepted(paramView1, paramView2, paramInt);
    startNestedScroll(paramInt & 0x2);
    this.mTotalUnconsumed = 0.0F;
    this.mNestedScrollInProgress = true;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    boolean bool;
    if ((isEnabled()) && (!this.mReturningToStart) && (!this.mRefreshing) && ((paramInt & 0x2) != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.mNestedScrollingParentHelper.onStopNestedScroll(paramView);
    this.mNestedScrollInProgress = false;
    float f = this.mTotalUnconsumed;
    if (f > 0.0F)
    {
      finishSpinner(f);
      this.mTotalUnconsumed = 0.0F;
    }
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if ((this.mReturningToStart) && (i == 0)) {
      this.mReturningToStart = false;
    }
    if ((isEnabled()) && (!this.mReturningToStart) && (!canChildScrollUp()) && (!this.mRefreshing) && (!this.mNestedScrollInProgress))
    {
      if (i != 0)
      {
        float f1;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 5)
              {
                if (i == 6) {
                  onSecondaryPointerUp(paramMotionEvent);
                }
              }
              else
              {
                i = paramMotionEvent.getActionIndex();
                if (i < 0)
                {
                  Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                  return false;
                }
                this.mActivePointerId = paramMotionEvent.getPointerId(i);
              }
            }
            else {
              return false;
            }
          }
          else
          {
            i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
            if (i < 0)
            {
              Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
              return false;
            }
            f1 = paramMotionEvent.getY(i);
            startDragging(f1);
            if (this.mIsBeingDragged)
            {
              f1 = (f1 - this.mInitialMotionY) * 0.5F;
              if (f1 > 0.0F) {
                moveSpinner(f1);
              } else {
                return false;
              }
            }
          }
        }
        else
        {
          i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
          if (i < 0)
          {
            Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
            return false;
          }
          if (this.mIsBeingDragged)
          {
            float f2 = paramMotionEvent.getY(i);
            f1 = this.mInitialMotionY;
            this.mIsBeingDragged = false;
            finishSpinner((f2 - f1) * 0.5F);
          }
          this.mActivePointerId = -1;
          return false;
        }
      }
      else
      {
        this.mActivePointerId = paramMotionEvent.getPointerId(0);
        this.mIsBeingDragged = false;
      }
      return true;
    }
    return false;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if ((Build.VERSION.SDK_INT >= 21) || (!(this.mTarget instanceof AbsListView)))
    {
      View localView = this.mTarget;
      if ((localView == null) || (ViewCompat.isNestedScrollingEnabled(localView))) {
        super.requestDisallowInterceptTouchEvent(paramBoolean);
      }
    }
  }
  
  void reset()
  {
    this.mCircleView.clearAnimation();
    this.mProgress.stop();
    this.mCircleView.setVisibility(8);
    setColorViewAlpha(255);
    if (this.mScale) {
      setAnimationProgress(0.0F);
    } else {
      setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
    }
    this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
  }
  
  void setAnimationProgress(float paramFloat)
  {
    this.mCircleView.setScaleX(paramFloat);
    this.mCircleView.setScaleY(paramFloat);
  }
  
  @Deprecated
  public void setColorScheme(int... paramVarArgs)
  {
    setColorSchemeResources(paramVarArgs);
  }
  
  public void setColorSchemeColors(int... paramVarArgs)
  {
    ensureTarget();
    this.mProgress.setColorSchemeColors(paramVarArgs);
  }
  
  public void setColorSchemeResources(int... paramVarArgs)
  {
    Context localContext = getContext();
    int[] arrayOfInt = new int[paramVarArgs.length];
    for (int i = 0; i < paramVarArgs.length; i++) {
      arrayOfInt[i] = ContextCompat.getColor(localContext, paramVarArgs[i]);
    }
    setColorSchemeColors(arrayOfInt);
  }
  
  public void setDistanceToTriggerSync(int paramInt)
  {
    this.mTotalDragDistance = paramInt;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (!paramBoolean) {
      reset();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.mNestedScrollingChildHelper.setNestedScrollingEnabled(paramBoolean);
  }
  
  public void setOnChildScrollUpCallback(OnChildScrollUpCallback paramOnChildScrollUpCallback)
  {
    this.mChildScrollUpCallback = paramOnChildScrollUpCallback;
  }
  
  public void setOnRefreshListener(OnRefreshListener paramOnRefreshListener)
  {
    this.mListener = paramOnRefreshListener;
  }
  
  @Deprecated
  public void setProgressBackgroundColor(int paramInt)
  {
    setProgressBackgroundColorSchemeResource(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeColor(int paramInt)
  {
    this.mCircleView.setBackgroundColor(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeResource(int paramInt)
  {
    setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), paramInt));
  }
  
  public void setProgressViewEndTarget(boolean paramBoolean, int paramInt)
  {
    this.mSpinnerOffsetEnd = paramInt;
    this.mScale = paramBoolean;
    this.mCircleView.invalidate();
  }
  
  public void setProgressViewOffset(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.mScale = paramBoolean;
    this.mOriginalOffsetTop = paramInt1;
    this.mSpinnerOffsetEnd = paramInt2;
    this.mUsingCustomStart = true;
    reset();
    this.mRefreshing = false;
  }
  
  public void setRefreshing(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.mRefreshing != paramBoolean))
    {
      this.mRefreshing = paramBoolean;
      int i;
      if (!this.mUsingCustomStart) {
        i = this.mSpinnerOffsetEnd + this.mOriginalOffsetTop;
      } else {
        i = this.mSpinnerOffsetEnd;
      }
      setTargetOffsetTopAndBottom(i - this.mCurrentTargetOffsetTop);
      this.mNotify = false;
      startScaleUpAnimation(this.mRefreshListener);
    }
    else
    {
      setRefreshing(paramBoolean, false);
    }
  }
  
  public void setSize(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      return;
    }
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    if (paramInt == 0) {
      this.mCircleDiameter = ((int)(localDisplayMetrics.density * 56.0F));
    } else {
      this.mCircleDiameter = ((int)(localDisplayMetrics.density * 40.0F));
    }
    this.mCircleView.setImageDrawable(null);
    this.mProgress.setStyle(paramInt);
    this.mCircleView.setImageDrawable(this.mProgress);
  }
  
  public void setSlingshotDistance(int paramInt)
  {
    this.mCustomSlingshotDistance = paramInt;
  }
  
  void setTargetOffsetTopAndBottom(int paramInt)
  {
    this.mCircleView.bringToFront();
    ViewCompat.offsetTopAndBottom(this.mCircleView, paramInt);
    this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.mNestedScrollingChildHelper.startNestedScroll(paramInt);
  }
  
  void startScaleDownAnimation(Animation.AnimationListener paramAnimationListener)
  {
    Animation local3 = new Animation()
    {
      public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        SwipeRefreshLayout.this.setAnimationProgress(1.0F - paramAnonymousFloat);
      }
    };
    this.mScaleDownAnimation = local3;
    local3.setDuration(150L);
    this.mCircleView.setAnimationListener(paramAnimationListener);
    this.mCircleView.clearAnimation();
    this.mCircleView.startAnimation(this.mScaleDownAnimation);
  }
  
  public void stopNestedScroll()
  {
    this.mNestedScrollingChildHelper.stopNestedScroll();
  }
  
  public static abstract interface OnChildScrollUpCallback
  {
    public abstract boolean canChildScrollUp(SwipeRefreshLayout paramSwipeRefreshLayout, View paramView);
  }
  
  public static abstract interface OnRefreshListener
  {
    public abstract void onRefresh();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\swiperefreshlayout\widget\SwipeRefreshLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */