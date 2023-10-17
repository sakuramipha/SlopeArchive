package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout
  extends ViewGroup
{
  private static final int DEFAULT_FADE_COLOR = -858993460;
  private static final int DEFAULT_OVERHANG_SIZE = 32;
  private static final int MIN_FLING_VELOCITY = 400;
  private static final String TAG = "SlidingPaneLayout";
  private boolean mCanSlide;
  private int mCoveredFadeColor;
  private boolean mDisplayListReflectionLoaded;
  final ViewDragHelper mDragHelper;
  private boolean mFirstLayout = true;
  private Method mGetDisplayList;
  private float mInitialMotionX;
  private float mInitialMotionY;
  boolean mIsUnableToDrag;
  private final int mOverhangSize;
  private PanelSlideListener mPanelSlideListener;
  private int mParallaxBy;
  private float mParallaxOffset;
  final ArrayList<DisableLayerRunnable> mPostedRunnables = new ArrayList();
  boolean mPreservedOpenState;
  private Field mRecreateDisplayList;
  private Drawable mShadowDrawableLeft;
  private Drawable mShadowDrawableRight;
  float mSlideOffset;
  int mSlideRange;
  View mSlideableView;
  private int mSliderFadeColor = -858993460;
  private final Rect mTmpRect = new Rect();
  
  public SlidingPaneLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.mOverhangSize = ((int)(32.0F * f + 0.5F));
    setWillNotDraw(false);
    ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
    ViewCompat.setImportantForAccessibility(this, 1);
    paramContext = ViewDragHelper.create(this, 0.5F, new DragHelperCallback());
    this.mDragHelper = paramContext;
    paramContext.setMinVelocity(f * 400.0F);
  }
  
  private boolean closePane(View paramView, int paramInt)
  {
    if ((!this.mFirstLayout) && (!smoothSlideTo(0.0F, paramInt))) {
      return false;
    }
    this.mPreservedOpenState = false;
    return true;
  }
  
  private void dimChildView(View paramView, float paramFloat, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      int i = (int)(((0xFF000000 & paramInt) >>> 24) * paramFloat);
      if (localLayoutParams.dimPaint == null) {
        localLayoutParams.dimPaint = new Paint();
      }
      localLayoutParams.dimPaint.setColorFilter(new PorterDuffColorFilter(i << 24 | paramInt & 0xFFFFFF, PorterDuff.Mode.SRC_OVER));
      if (paramView.getLayerType() != 2) {
        paramView.setLayerType(2, localLayoutParams.dimPaint);
      }
      invalidateChildRegion(paramView);
    }
    else if (paramView.getLayerType() != 0)
    {
      if (localLayoutParams.dimPaint != null) {
        localLayoutParams.dimPaint.setColorFilter(null);
      }
      paramView = new DisableLayerRunnable(paramView);
      this.mPostedRunnables.add(paramView);
      ViewCompat.postOnAnimation(this, paramView);
    }
  }
  
  private boolean openPane(View paramView, int paramInt)
  {
    if ((!this.mFirstLayout) && (!smoothSlideTo(1.0F, paramInt))) {
      return false;
    }
    this.mPreservedOpenState = true;
    return true;
  }
  
  private void parallaxOtherViews(float paramFloat)
  {
    boolean bool2 = isLayoutRtlSupport();
    Object localObject = (LayoutParams)this.mSlideableView.getLayoutParams();
    boolean bool1 = ((LayoutParams)localObject).dimWhenOffset;
    int j = 0;
    if (bool1)
    {
      if (bool2) {
        i = ((LayoutParams)localObject).rightMargin;
      } else {
        i = ((LayoutParams)localObject).leftMargin;
      }
      if (i <= 0)
      {
        i = 1;
        break label64;
      }
    }
    int i = 0;
    label64:
    int n = getChildCount();
    while (j < n)
    {
      localObject = getChildAt(j);
      if (localObject != this.mSlideableView)
      {
        float f = this.mParallaxOffset;
        int m = this.mParallaxBy;
        int k = (int)((1.0F - f) * m);
        this.mParallaxOffset = paramFloat;
        m = k - (int)((1.0F - paramFloat) * m);
        k = m;
        if (bool2) {
          k = -m;
        }
        ((View)localObject).offsetLeftAndRight(k);
        if (i != 0)
        {
          f = this.mParallaxOffset;
          if (bool2) {
            f -= 1.0F;
          } else {
            f = 1.0F - f;
          }
          dimChildView((View)localObject, f, this.mCoveredFadeColor);
        }
      }
      j++;
    }
  }
  
  private static boolean viewIsOpaque(View paramView)
  {
    boolean bool2 = paramView.isOpaque();
    boolean bool1 = true;
    if (bool2) {
      return true;
    }
    if (Build.VERSION.SDK_INT >= 18) {
      return false;
    }
    paramView = paramView.getBackground();
    if (paramView != null)
    {
      if (paramView.getOpacity() != -1) {
        bool1 = false;
      }
      return bool1;
    }
    return false;
  }
  
  protected boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = paramView instanceof ViewGroup;
    boolean bool1 = true;
    if (bool2)
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int k = paramView.getScrollX();
      int j = paramView.getScrollY();
      for (int i = localViewGroup.getChildCount() - 1; i >= 0; i--)
      {
        View localView = localViewGroup.getChildAt(i);
        int n = paramInt2 + k;
        if ((n >= localView.getLeft()) && (n < localView.getRight()))
        {
          int m = paramInt3 + j;
          if ((m >= localView.getTop()) && (m < localView.getBottom()) && (canScroll(localView, true, paramInt1, n - localView.getLeft(), m - localView.getTop()))) {
            return true;
          }
        }
      }
    }
    if (paramBoolean)
    {
      if (!isLayoutRtlSupport()) {
        paramInt1 = -paramInt1;
      }
      if (paramView.canScrollHorizontally(paramInt1)) {
        return bool1;
      }
    }
    paramBoolean = false;
    return paramBoolean;
  }
  
  @Deprecated
  public boolean canSlide()
  {
    return this.mCanSlide;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean closePane()
  {
    return closePane(this.mSlideableView, 0);
  }
  
  public void computeScroll()
  {
    if (this.mDragHelper.continueSettling(true))
    {
      if (!this.mCanSlide)
      {
        this.mDragHelper.abort();
        return;
      }
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  void dispatchOnPanelClosed(View paramView)
  {
    PanelSlideListener localPanelSlideListener = this.mPanelSlideListener;
    if (localPanelSlideListener != null) {
      localPanelSlideListener.onPanelClosed(paramView);
    }
    sendAccessibilityEvent(32);
  }
  
  void dispatchOnPanelOpened(View paramView)
  {
    PanelSlideListener localPanelSlideListener = this.mPanelSlideListener;
    if (localPanelSlideListener != null) {
      localPanelSlideListener.onPanelOpened(paramView);
    }
    sendAccessibilityEvent(32);
  }
  
  void dispatchOnPanelSlide(View paramView)
  {
    PanelSlideListener localPanelSlideListener = this.mPanelSlideListener;
    if (localPanelSlideListener != null) {
      localPanelSlideListener.onPanelSlide(paramView, this.mSlideOffset);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Drawable localDrawable;
    if (isLayoutRtlSupport()) {
      localDrawable = this.mShadowDrawableRight;
    } else {
      localDrawable = this.mShadowDrawableLeft;
    }
    View localView;
    if (getChildCount() > 1) {
      localView = getChildAt(1);
    } else {
      localView = null;
    }
    if ((localView != null) && (localDrawable != null))
    {
      int n = localView.getTop();
      int m = localView.getBottom();
      int k = localDrawable.getIntrinsicWidth();
      int i;
      int j;
      if (isLayoutRtlSupport())
      {
        i = localView.getRight();
        j = k + i;
      }
      else
      {
        j = localView.getLeft();
        i = j;
        k = j - k;
        j = i;
        i = k;
      }
      localDrawable.setBounds(i, n, j, m);
      localDrawable.draw(paramCanvas);
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    Object localObject = (LayoutParams)paramView.getLayoutParams();
    int i = paramCanvas.save();
    if ((this.mCanSlide) && (!((LayoutParams)localObject).slideable) && (this.mSlideableView != null))
    {
      paramCanvas.getClipBounds(this.mTmpRect);
      if (isLayoutRtlSupport())
      {
        localObject = this.mTmpRect;
        ((Rect)localObject).left = Math.max(((Rect)localObject).left, this.mSlideableView.getRight());
      }
      else
      {
        localObject = this.mTmpRect;
        ((Rect)localObject).right = Math.min(((Rect)localObject).right, this.mSlideableView.getLeft());
      }
      paramCanvas.clipRect(this.mTmpRect);
    }
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    paramCanvas.restoreToCount(i);
    return bool;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      paramLayoutParams = new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    } else {
      paramLayoutParams = new LayoutParams(paramLayoutParams);
    }
    return paramLayoutParams;
  }
  
  public int getCoveredFadeColor()
  {
    return this.mCoveredFadeColor;
  }
  
  public int getParallaxDistance()
  {
    return this.mParallaxBy;
  }
  
  public int getSliderFadeColor()
  {
    return this.mSliderFadeColor;
  }
  
  void invalidateChildRegion(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      ViewCompat.setLayerPaint(paramView, ((LayoutParams)paramView.getLayoutParams()).dimPaint);
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      if (!this.mDisplayListReflectionLoaded)
      {
        try
        {
          Class[] arrayOfClass = (Class[])null;
          this.mGetDisplayList = View.class.getDeclaredMethod("getDisplayList", null);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", localNoSuchMethodException);
        }
        try
        {
          Field localField = View.class.getDeclaredField("mRecreateDisplayList");
          this.mRecreateDisplayList = localField;
          localField.setAccessible(true);
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", localNoSuchFieldException);
        }
        this.mDisplayListReflectionLoaded = true;
      }
      if (this.mGetDisplayList != null)
      {
        Object localObject = this.mRecreateDisplayList;
        if (localObject != null) {
          try
          {
            ((Field)localObject).setBoolean(paramView, true);
            Method localMethod = this.mGetDisplayList;
            localObject = (Object[])null;
            localMethod.invoke(paramView, null);
          }
          catch (Exception localException)
          {
            Log.e("SlidingPaneLayout", "Error refreshing display list state", localException);
          }
        }
      }
      paramView.invalidate();
      return;
    }
    ViewCompat.postInvalidateOnAnimation(this, paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
  }
  
  boolean isDimmed(View paramView)
  {
    boolean bool2 = false;
    if (paramView == null) {
      return false;
    }
    paramView = (LayoutParams)paramView.getLayoutParams();
    boolean bool1 = bool2;
    if (this.mCanSlide)
    {
      bool1 = bool2;
      if (paramView.dimWhenOffset)
      {
        bool1 = bool2;
        if (this.mSlideOffset > 0.0F) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  boolean isLayoutRtlSupport()
  {
    int i = ViewCompat.getLayoutDirection(this);
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isOpen()
  {
    boolean bool;
    if ((this.mCanSlide) && (this.mSlideOffset != 1.0F)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isSlideable()
  {
    return this.mCanSlide;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mFirstLayout = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.mFirstLayout = true;
    int j = this.mPostedRunnables.size();
    for (int i = 0; i < j; i++) {
      ((DisableLayerRunnable)this.mPostedRunnables.get(i)).run();
    }
    this.mPostedRunnables.clear();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    boolean bool1 = this.mCanSlide;
    boolean bool2 = true;
    if ((!bool1) && (i == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null) {
        this.mPreservedOpenState = (this.mDragHelper.isViewUnder(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()) ^ true);
      }
    }
    if ((this.mCanSlide) && ((!this.mIsUnableToDrag) || (i == 0)))
    {
      if ((i != 3) && (i != 1))
      {
        float f1;
        float f2;
        if (i != 0)
        {
          if (i == 2)
          {
            f1 = paramMotionEvent.getX();
            f2 = paramMotionEvent.getY();
            f1 = Math.abs(f1 - this.mInitialMotionX);
            f2 = Math.abs(f2 - this.mInitialMotionY);
            if ((f1 > this.mDragHelper.getTouchSlop()) && (f2 > f1))
            {
              this.mDragHelper.cancel();
              this.mIsUnableToDrag = true;
              return false;
            }
          }
        }
        else
        {
          this.mIsUnableToDrag = false;
          f2 = paramMotionEvent.getX();
          f1 = paramMotionEvent.getY();
          this.mInitialMotionX = f2;
          this.mInitialMotionY = f1;
          if ((this.mDragHelper.isViewUnder(this.mSlideableView, (int)f2, (int)f1)) && (isDimmed(this.mSlideableView)))
          {
            i = 1;
            break label247;
          }
        }
        i = 0;
        label247:
        bool1 = bool2;
        if (!this.mDragHelper.shouldInterceptTouchEvent(paramMotionEvent)) {
          if (i != 0) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }
        }
        return bool1;
      }
      this.mDragHelper.cancel();
      return false;
    }
    this.mDragHelper.cancel();
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = isLayoutRtlSupport();
    if (bool) {
      this.mDragHelper.setEdgeTrackingEnabled(2);
    } else {
      this.mDragHelper.setEdgeTrackingEnabled(1);
    }
    int k = paramInt3 - paramInt1;
    if (bool) {
      paramInt1 = getPaddingRight();
    } else {
      paramInt1 = getPaddingLeft();
    }
    if (bool) {
      paramInt4 = getPaddingLeft();
    } else {
      paramInt4 = getPaddingRight();
    }
    int n = getPaddingTop();
    int m = getChildCount();
    if (this.mFirstLayout)
    {
      float f;
      if ((this.mCanSlide) && (this.mPreservedOpenState)) {
        f = 1.0F;
      } else {
        f = 0.0F;
      }
      this.mSlideOffset = f;
    }
    paramInt2 = paramInt1;
    for (int i = 0; i < m; i++)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        int i1 = localView.getMeasuredWidth();
        int j;
        if (localLayoutParams.slideable)
        {
          paramInt3 = localLayoutParams.leftMargin;
          int i2 = localLayoutParams.rightMargin;
          j = k - paramInt4;
          i2 = Math.min(paramInt1, j - this.mOverhangSize) - paramInt2 - (paramInt3 + i2);
          this.mSlideRange = i2;
          if (bool) {
            paramInt3 = localLayoutParams.rightMargin;
          } else {
            paramInt3 = localLayoutParams.leftMargin;
          }
          if (paramInt2 + paramInt3 + i2 + i1 / 2 > j) {
            paramBoolean = true;
          } else {
            paramBoolean = false;
          }
          localLayoutParams.dimWhenOffset = paramBoolean;
          j = (int)(i2 * this.mSlideOffset);
          paramInt2 += paramInt3 + j;
          this.mSlideOffset = (j / this.mSlideRange);
          paramInt3 = 0;
        }
        else
        {
          if (this.mCanSlide)
          {
            paramInt2 = this.mParallaxBy;
            if (paramInt2 != 0)
            {
              paramInt3 = (int)((1.0F - this.mSlideOffset) * paramInt2);
              paramInt2 = paramInt1;
              break label356;
            }
          }
          paramInt2 = paramInt1;
          paramInt3 = 0;
        }
        label356:
        if (bool)
        {
          paramInt3 = k - paramInt2 + paramInt3;
          j = paramInt3 - i1;
        }
        else
        {
          j = paramInt2 - paramInt3;
          paramInt3 = j + i1;
        }
        localView.layout(j, n, paramInt3, localView.getMeasuredHeight() + n);
        paramInt1 += localView.getWidth();
      }
    }
    if (this.mFirstLayout)
    {
      if (this.mCanSlide)
      {
        if (this.mParallaxBy != 0) {
          parallaxOtherViews(this.mSlideOffset);
        }
        if (((LayoutParams)this.mSlideableView.getLayoutParams()).dimWhenOffset) {
          dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
        }
      }
      else
      {
        for (paramInt1 = 0; paramInt1 < m; paramInt1++) {
          dimChildView(getChildAt(paramInt1), 0.0F, this.mSliderFadeColor);
        }
      }
      updateObscuredViewsVisibility(this.mSlideableView);
    }
    this.mFirstLayout = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    int k;
    int n;
    if (m != 1073741824)
    {
      if (isInEditMode())
      {
        if (m == Integer.MIN_VALUE)
        {
          k = i;
          n = j;
          paramInt1 = paramInt2;
        }
        else
        {
          k = i;
          n = j;
          paramInt1 = paramInt2;
          if (m == 0)
          {
            k = 300;
            n = j;
            paramInt1 = paramInt2;
          }
        }
      }
      else {
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
      }
    }
    else
    {
      k = i;
      n = j;
      paramInt1 = paramInt2;
      if (j == 0) {
        if (isInEditMode())
        {
          k = i;
          n = j;
          paramInt1 = paramInt2;
          if (j == 0)
          {
            n = Integer.MIN_VALUE;
            paramInt1 = 300;
            k = i;
          }
        }
        else
        {
          throw new IllegalStateException("Height must not be UNSPECIFIED");
        }
      }
    }
    if (n != Integer.MIN_VALUE)
    {
      if (n != 1073741824)
      {
        paramInt1 = 0;
        paramInt2 = 0;
      }
      else
      {
        paramInt1 = paramInt1 - getPaddingTop() - getPaddingBottom();
        paramInt2 = paramInt1;
      }
    }
    else
    {
      paramInt2 = paramInt1 - getPaddingTop() - getPaddingBottom();
      paramInt1 = 0;
    }
    int i2 = k - getPaddingLeft() - getPaddingRight();
    int i3 = getChildCount();
    if (i3 > 2) {
      Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
    }
    this.mSlideableView = null;
    m = i2;
    int i1 = 0;
    boolean bool1 = false;
    float f2 = 0.0F;
    i = paramInt1;
    View localView;
    LayoutParams localLayoutParams;
    int i4;
    while (i1 < i3)
    {
      localView = getChildAt(i1);
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (localView.getVisibility() == 8)
      {
        localLayoutParams.dimWhenOffset = false;
      }
      else
      {
        float f1 = f2;
        if (localLayoutParams.weight > 0.0F)
        {
          f2 += localLayoutParams.weight;
          f1 = f2;
          if (localLayoutParams.width == 0) {}
        }
        else
        {
          paramInt1 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
          if (localLayoutParams.width == -2) {
            paramInt1 = View.MeasureSpec.makeMeasureSpec(i2 - paramInt1, Integer.MIN_VALUE);
          } else if (localLayoutParams.width == -1) {
            paramInt1 = View.MeasureSpec.makeMeasureSpec(i2 - paramInt1, 1073741824);
          } else {
            paramInt1 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824);
          }
          if (localLayoutParams.height == -2) {
            j = View.MeasureSpec.makeMeasureSpec(paramInt2, Integer.MIN_VALUE);
          } else if (localLayoutParams.height == -1) {
            j = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
          } else {
            j = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
          }
          localView.measure(paramInt1, j);
          j = localView.getMeasuredWidth();
          i4 = localView.getMeasuredHeight();
          paramInt1 = i;
          if (n == Integer.MIN_VALUE)
          {
            paramInt1 = i;
            if (i4 > i) {
              paramInt1 = Math.min(i4, paramInt2);
            }
          }
          j = m - j;
          if (j < 0) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          localLayoutParams.slideable = bool2;
          boolean bool2 = bool1 | bool2;
          i = paramInt1;
          bool1 = bool2;
          f2 = f1;
          m = j;
          if (localLayoutParams.slideable)
          {
            this.mSlideableView = localView;
            m = j;
            f2 = f1;
            bool1 = bool2;
            i = paramInt1;
          }
        }
      }
      i1++;
    }
    if ((bool1) || (f2 > 0.0F))
    {
      j = i2 - this.mOverhangSize;
      for (n = 0; n < i3; n++)
      {
        localView = getChildAt(n);
        if (localView.getVisibility() != 8)
        {
          for (;;)
          {
            localLayoutParams = (LayoutParams)localView.getLayoutParams();
            if (localView.getVisibility() != 8)
            {
              if ((localLayoutParams.width == 0) && (localLayoutParams.weight > 0.0F)) {
                paramInt1 = 1;
              } else {
                paramInt1 = 0;
              }
              if (paramInt1 != 0) {
                i1 = 0;
              } else {
                i1 = localView.getMeasuredWidth();
              }
              if ((bool1) && (localView != this.mSlideableView))
              {
                if ((localLayoutParams.width < 0) && ((i1 > j) || (localLayoutParams.weight > 0.0F)))
                {
                  if (paramInt1 != 0)
                  {
                    if (localLayoutParams.height == -2) {
                      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, Integer.MIN_VALUE);
                    } else if (localLayoutParams.height == -1) {
                      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
                    } else {
                      paramInt1 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
                    }
                  }
                  else {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
                  }
                  localView.measure(View.MeasureSpec.makeMeasureSpec(j, 1073741824), paramInt1);
                }
              }
              else if (localLayoutParams.weight > 0.0F)
              {
                if (localLayoutParams.width == 0)
                {
                  if (localLayoutParams.height == -2) {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, Integer.MIN_VALUE);
                  } else if (localLayoutParams.height == -1) {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
                  } else {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
                  }
                }
                else {
                  paramInt1 = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
                }
                if (!bool1) {
                  break;
                }
                int i5 = i2 - (localLayoutParams.leftMargin + localLayoutParams.rightMargin);
                i4 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                if (i1 != i5) {
                  localView.measure(i4, paramInt1);
                }
              }
            }
          }
          i4 = Math.max(0, m);
          localView.measure(View.MeasureSpec.makeMeasureSpec(i1 + (int)(localLayoutParams.weight * i4 / f2), 1073741824), paramInt1);
        }
      }
    }
    setMeasuredDimension(k, i + getPaddingTop() + getPaddingBottom());
    this.mCanSlide = bool1;
    if ((this.mDragHelper.getViewDragState() != 0) && (!bool1)) {
      this.mDragHelper.abort();
    }
  }
  
  void onPanelDragged(int paramInt)
  {
    if (this.mSlideableView == null)
    {
      this.mSlideOffset = 0.0F;
      return;
    }
    boolean bool = isLayoutRtlSupport();
    LayoutParams localLayoutParams = (LayoutParams)this.mSlideableView.getLayoutParams();
    int j = this.mSlideableView.getWidth();
    int i = paramInt;
    if (bool) {
      i = getWidth() - paramInt - j;
    }
    if (bool) {
      paramInt = getPaddingRight();
    } else {
      paramInt = getPaddingLeft();
    }
    if (bool) {
      j = localLayoutParams.rightMargin;
    } else {
      j = localLayoutParams.leftMargin;
    }
    float f = (i - (paramInt + j)) / this.mSlideRange;
    this.mSlideOffset = f;
    if (this.mParallaxBy != 0) {
      parallaxOtherViews(f);
    }
    if (localLayoutParams.dimWhenOffset) {
      dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
    }
    dispatchOnPanelSlide(this.mSlideableView);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (paramParcelable.isOpen) {
      openPane();
    } else {
      closePane();
    }
    this.mPreservedOpenState = paramParcelable.isOpen;
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    boolean bool;
    if (isSlideable()) {
      bool = isOpen();
    } else {
      bool = this.mPreservedOpenState;
    }
    localSavedState.isOpen = bool;
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      this.mFirstLayout = true;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.mCanSlide) {
      return super.onTouchEvent(paramMotionEvent);
    }
    this.mDragHelper.processTouchEvent(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    float f2;
    float f1;
    if (i != 0)
    {
      if ((i == 1) && (isDimmed(this.mSlideableView)))
      {
        f2 = paramMotionEvent.getX();
        f1 = paramMotionEvent.getY();
        float f3 = f2 - this.mInitialMotionX;
        float f4 = f1 - this.mInitialMotionY;
        i = this.mDragHelper.getTouchSlop();
        if ((f3 * f3 + f4 * f4 < i * i) && (this.mDragHelper.isViewUnder(this.mSlideableView, (int)f2, (int)f1))) {
          closePane(this.mSlideableView, 0);
        }
      }
    }
    else
    {
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      this.mInitialMotionX = f1;
      this.mInitialMotionY = f2;
    }
    return true;
  }
  
  public boolean openPane()
  {
    return openPane(this.mSlideableView, 0);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.mCanSlide))
    {
      boolean bool;
      if (paramView1 == this.mSlideableView) {
        bool = true;
      } else {
        bool = false;
      }
      this.mPreservedOpenState = bool;
    }
  }
  
  void setAllChildrenVisible()
  {
    int j = getChildCount();
    for (int i = 0; i < j; i++)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 4) {
        localView.setVisibility(0);
      }
    }
  }
  
  public void setCoveredFadeColor(int paramInt)
  {
    this.mCoveredFadeColor = paramInt;
  }
  
  public void setPanelSlideListener(PanelSlideListener paramPanelSlideListener)
  {
    this.mPanelSlideListener = paramPanelSlideListener;
  }
  
  public void setParallaxDistance(int paramInt)
  {
    this.mParallaxBy = paramInt;
    requestLayout();
  }
  
  @Deprecated
  public void setShadowDrawable(Drawable paramDrawable)
  {
    setShadowDrawableLeft(paramDrawable);
  }
  
  public void setShadowDrawableLeft(Drawable paramDrawable)
  {
    this.mShadowDrawableLeft = paramDrawable;
  }
  
  public void setShadowDrawableRight(Drawable paramDrawable)
  {
    this.mShadowDrawableRight = paramDrawable;
  }
  
  @Deprecated
  public void setShadowResource(int paramInt)
  {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }
  
  public void setShadowResourceLeft(int paramInt)
  {
    setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), paramInt));
  }
  
  public void setShadowResourceRight(int paramInt)
  {
    setShadowDrawableRight(ContextCompat.getDrawable(getContext(), paramInt));
  }
  
  public void setSliderFadeColor(int paramInt)
  {
    this.mSliderFadeColor = paramInt;
  }
  
  @Deprecated
  public void smoothSlideClosed()
  {
    closePane();
  }
  
  @Deprecated
  public void smoothSlideOpen()
  {
    openPane();
  }
  
  boolean smoothSlideTo(float paramFloat, int paramInt)
  {
    if (!this.mCanSlide) {
      return false;
    }
    boolean bool = isLayoutRtlSupport();
    Object localObject = (LayoutParams)this.mSlideableView.getLayoutParams();
    if (bool)
    {
      int i = getPaddingRight();
      int j = ((LayoutParams)localObject).rightMargin;
      paramInt = this.mSlideableView.getWidth();
      paramInt = (int)(getWidth() - (i + j + paramFloat * this.mSlideRange + paramInt));
    }
    else
    {
      paramInt = (int)(getPaddingLeft() + ((LayoutParams)localObject).leftMargin + paramFloat * this.mSlideRange);
    }
    ViewDragHelper localViewDragHelper = this.mDragHelper;
    localObject = this.mSlideableView;
    if (localViewDragHelper.smoothSlideViewTo((View)localObject, paramInt, ((View)localObject).getTop()))
    {
      setAllChildrenVisible();
      ViewCompat.postInvalidateOnAnimation(this);
      return true;
    }
    return false;
  }
  
  void updateObscuredViewsVisibility(View paramView)
  {
    boolean bool = isLayoutRtlSupport();
    int i;
    if (bool) {
      i = getWidth() - getPaddingRight();
    } else {
      i = getPaddingLeft();
    }
    int j;
    if (bool) {
      j = getPaddingLeft();
    } else {
      j = getWidth() - getPaddingRight();
    }
    int i4 = getPaddingTop();
    int i5 = getHeight();
    int i6 = getPaddingBottom();
    int k;
    int m;
    int n;
    int i1;
    if ((paramView != null) && (viewIsOpaque(paramView)))
    {
      k = paramView.getLeft();
      m = paramView.getRight();
      n = paramView.getTop();
      i1 = paramView.getBottom();
    }
    else
    {
      k = 0;
      m = 0;
      n = 0;
      i1 = 0;
    }
    int i7 = getChildCount();
    for (int i2 = 0; i2 < i7; i2++)
    {
      View localView = getChildAt(i2);
      if (localView == paramView) {
        break;
      }
      if (localView.getVisibility() != 8)
      {
        if (bool) {
          i3 = j;
        } else {
          i3 = i;
        }
        int i9 = Math.max(i3, localView.getLeft());
        int i8 = Math.max(i4, localView.getTop());
        if (bool) {
          i3 = i;
        } else {
          i3 = j;
        }
        int i10 = Math.min(i3, localView.getRight());
        int i3 = Math.min(i5 - i6, localView.getBottom());
        if ((i9 >= k) && (i8 >= n) && (i10 <= m) && (i3 <= i1)) {
          i3 = 4;
        } else {
          i3 = 0;
        }
        localView.setVisibility(i3);
      }
    }
  }
  
  class AccessibilityDelegate
    extends AccessibilityDelegateCompat
  {
    private final Rect mTmpRect = new Rect();
    
    AccessibilityDelegate() {}
    
    private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat1, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat2)
    {
      Rect localRect = this.mTmpRect;
      paramAccessibilityNodeInfoCompat2.getBoundsInParent(localRect);
      paramAccessibilityNodeInfoCompat1.setBoundsInParent(localRect);
      paramAccessibilityNodeInfoCompat2.getBoundsInScreen(localRect);
      paramAccessibilityNodeInfoCompat1.setBoundsInScreen(localRect);
      paramAccessibilityNodeInfoCompat1.setVisibleToUser(paramAccessibilityNodeInfoCompat2.isVisibleToUser());
      paramAccessibilityNodeInfoCompat1.setPackageName(paramAccessibilityNodeInfoCompat2.getPackageName());
      paramAccessibilityNodeInfoCompat1.setClassName(paramAccessibilityNodeInfoCompat2.getClassName());
      paramAccessibilityNodeInfoCompat1.setContentDescription(paramAccessibilityNodeInfoCompat2.getContentDescription());
      paramAccessibilityNodeInfoCompat1.setEnabled(paramAccessibilityNodeInfoCompat2.isEnabled());
      paramAccessibilityNodeInfoCompat1.setClickable(paramAccessibilityNodeInfoCompat2.isClickable());
      paramAccessibilityNodeInfoCompat1.setFocusable(paramAccessibilityNodeInfoCompat2.isFocusable());
      paramAccessibilityNodeInfoCompat1.setFocused(paramAccessibilityNodeInfoCompat2.isFocused());
      paramAccessibilityNodeInfoCompat1.setAccessibilityFocused(paramAccessibilityNodeInfoCompat2.isAccessibilityFocused());
      paramAccessibilityNodeInfoCompat1.setSelected(paramAccessibilityNodeInfoCompat2.isSelected());
      paramAccessibilityNodeInfoCompat1.setLongClickable(paramAccessibilityNodeInfoCompat2.isLongClickable());
      paramAccessibilityNodeInfoCompat1.addAction(paramAccessibilityNodeInfoCompat2.getActions());
      paramAccessibilityNodeInfoCompat1.setMovementGranularities(paramAccessibilityNodeInfoCompat2.getMovementGranularities());
    }
    
    public boolean filter(View paramView)
    {
      return SlidingPaneLayout.this.isDimmed(paramView);
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.obtain(paramAccessibilityNodeInfoCompat);
      super.onInitializeAccessibilityNodeInfo(paramView, localAccessibilityNodeInfoCompat);
      copyNodeInfoNoChildren(paramAccessibilityNodeInfoCompat, localAccessibilityNodeInfoCompat);
      localAccessibilityNodeInfoCompat.recycle();
      paramAccessibilityNodeInfoCompat.setClassName(SlidingPaneLayout.class.getName());
      paramAccessibilityNodeInfoCompat.setSource(paramView);
      paramView = ViewCompat.getParentForAccessibility(paramView);
      if ((paramView instanceof View)) {
        paramAccessibilityNodeInfoCompat.setParent((View)paramView);
      }
      int j = SlidingPaneLayout.this.getChildCount();
      for (int i = 0; i < j; i++)
      {
        paramView = SlidingPaneLayout.this.getChildAt(i);
        if ((!filter(paramView)) && (paramView.getVisibility() == 0))
        {
          ViewCompat.setImportantForAccessibility(paramView, 1);
          paramAccessibilityNodeInfoCompat.addChild(paramView);
        }
      }
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (!filter(paramView)) {
        return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
      }
      return false;
    }
  }
  
  private class DisableLayerRunnable
    implements Runnable
  {
    final View mChildView;
    
    DisableLayerRunnable(View paramView)
    {
      this.mChildView = paramView;
    }
    
    public void run()
    {
      if (this.mChildView.getParent() == SlidingPaneLayout.this)
      {
        this.mChildView.setLayerType(0, null);
        SlidingPaneLayout.this.invalidateChildRegion(this.mChildView);
      }
      SlidingPaneLayout.this.mPostedRunnables.remove(this);
    }
  }
  
  private class DragHelperCallback
    extends ViewDragHelper.Callback
  {
    DragHelperCallback() {}
    
    public int clampViewPositionHorizontal(View paramView, int paramInt1, int paramInt2)
    {
      paramView = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.this.mSlideableView.getLayoutParams();
      int i;
      if (SlidingPaneLayout.this.isLayoutRtlSupport())
      {
        paramInt2 = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.getPaddingRight() + paramView.rightMargin + SlidingPaneLayout.this.mSlideableView.getWidth());
        i = SlidingPaneLayout.this.mSlideRange;
        paramInt1 = Math.max(Math.min(paramInt1, paramInt2), paramInt2 - i);
      }
      else
      {
        i = SlidingPaneLayout.this.getPaddingLeft() + paramView.leftMargin;
        paramInt2 = SlidingPaneLayout.this.mSlideRange;
        paramInt1 = Math.min(Math.max(paramInt1, i), paramInt2 + i);
      }
      return paramInt1;
    }
    
    public int clampViewPositionVertical(View paramView, int paramInt1, int paramInt2)
    {
      return paramView.getTop();
    }
    
    public int getViewHorizontalDragRange(View paramView)
    {
      return SlidingPaneLayout.this.mSlideRange;
    }
    
    public void onEdgeDragStarted(int paramInt1, int paramInt2)
    {
      SlidingPaneLayout.this.mDragHelper.captureChildView(SlidingPaneLayout.this.mSlideableView, paramInt2);
    }
    
    public void onViewCaptured(View paramView, int paramInt)
    {
      SlidingPaneLayout.this.setAllChildrenVisible();
    }
    
    public void onViewDragStateChanged(int paramInt)
    {
      if (SlidingPaneLayout.this.mDragHelper.getViewDragState() == 0)
      {
        SlidingPaneLayout localSlidingPaneLayout;
        if (SlidingPaneLayout.this.mSlideOffset == 0.0F)
        {
          localSlidingPaneLayout = SlidingPaneLayout.this;
          localSlidingPaneLayout.updateObscuredViewsVisibility(localSlidingPaneLayout.mSlideableView);
          localSlidingPaneLayout = SlidingPaneLayout.this;
          localSlidingPaneLayout.dispatchOnPanelClosed(localSlidingPaneLayout.mSlideableView);
          SlidingPaneLayout.this.mPreservedOpenState = false;
        }
        else
        {
          localSlidingPaneLayout = SlidingPaneLayout.this;
          localSlidingPaneLayout.dispatchOnPanelOpened(localSlidingPaneLayout.mSlideableView);
          SlidingPaneLayout.this.mPreservedOpenState = true;
        }
      }
    }
    
    public void onViewPositionChanged(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      SlidingPaneLayout.this.onPanelDragged(paramInt1);
      SlidingPaneLayout.this.invalidate();
    }
    
    public void onViewReleased(View paramView, float paramFloat1, float paramFloat2)
    {
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
      int j;
      int i;
      if (SlidingPaneLayout.this.isLayoutRtlSupport())
      {
        j = SlidingPaneLayout.this.getPaddingRight() + localLayoutParams.rightMargin;
        if (paramFloat1 >= 0.0F)
        {
          i = j;
          if (paramFloat1 == 0.0F)
          {
            i = j;
            if (SlidingPaneLayout.this.mSlideOffset <= 0.5F) {}
          }
        }
        else
        {
          i = j + SlidingPaneLayout.this.mSlideRange;
        }
        j = SlidingPaneLayout.this.mSlideableView.getWidth();
        i = SlidingPaneLayout.this.getWidth() - i - j;
      }
      else
      {
        i = SlidingPaneLayout.this.getPaddingLeft();
        j = localLayoutParams.leftMargin + i;
        boolean bool = paramFloat1 < 0.0F;
        if (!bool)
        {
          i = j;
          if (!bool)
          {
            i = j;
            if (SlidingPaneLayout.this.mSlideOffset <= 0.5F) {}
          }
        }
        else
        {
          i = j + SlidingPaneLayout.this.mSlideRange;
        }
      }
      SlidingPaneLayout.this.mDragHelper.settleCapturedViewAt(i, paramView.getTop());
      SlidingPaneLayout.this.invalidate();
    }
    
    public boolean tryCaptureView(View paramView, int paramInt)
    {
      if (SlidingPaneLayout.this.mIsUnableToDrag) {
        return false;
      }
      return ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).slideable;
    }
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    private static final int[] ATTRS = { 16843137 };
    Paint dimPaint;
    boolean dimWhenOffset;
    boolean slideable;
    public float weight = 0.0F;
    
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ATTRS);
      this.weight = paramContext.getFloat(0, 0.0F);
      paramContext.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      this.weight = paramLayoutParams.weight;
    }
  }
  
  public static abstract interface PanelSlideListener
  {
    public abstract void onPanelClosed(View paramView);
    
    public abstract void onPanelOpened(View paramView);
    
    public abstract void onPanelSlide(View paramView, float paramFloat);
  }
  
  static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public SlidingPaneLayout.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new SlidingPaneLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public SlidingPaneLayout.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new SlidingPaneLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public SlidingPaneLayout.SavedState[] newArray(int paramAnonymousInt)
      {
        return new SlidingPaneLayout.SavedState[paramAnonymousInt];
      }
    };
    boolean isOpen;
    
    SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      boolean bool;
      if (paramParcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      this.isOpen = bool;
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.isOpen);
    }
  }
  
  public static class SimplePanelSlideListener
    implements SlidingPaneLayout.PanelSlideListener
  {
    public void onPanelClosed(View paramView) {}
    
    public void onPanelOpened(View paramView) {}
    
    public void onPanelSlide(View paramView, float paramFloat) {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\slidingpanelayout\widget\SlidingPaneLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */