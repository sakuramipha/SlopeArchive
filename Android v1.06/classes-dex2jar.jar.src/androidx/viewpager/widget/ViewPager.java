package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager
  extends ViewGroup
{
  private static final int CLOSE_ENOUGH = 2;
  private static final Comparator<ItemInfo> COMPARATOR = new Comparator()
  {
    public int compare(ViewPager.ItemInfo paramAnonymousItemInfo1, ViewPager.ItemInfo paramAnonymousItemInfo2)
    {
      return paramAnonymousItemInfo1.position - paramAnonymousItemInfo2.position;
    }
  };
  private static final boolean DEBUG = false;
  private static final int DEFAULT_GUTTER_SIZE = 16;
  private static final int DEFAULT_OFFSCREEN_PAGES = 1;
  private static final int DRAW_ORDER_DEFAULT = 0;
  private static final int DRAW_ORDER_FORWARD = 1;
  private static final int DRAW_ORDER_REVERSE = 2;
  private static final int INVALID_POINTER = -1;
  static final int[] LAYOUT_ATTRS = { 16842931 };
  private static final int MAX_SETTLE_DURATION = 600;
  private static final int MIN_DISTANCE_FOR_FLING = 25;
  private static final int MIN_FLING_VELOCITY = 400;
  public static final int SCROLL_STATE_DRAGGING = 1;
  public static final int SCROLL_STATE_IDLE = 0;
  public static final int SCROLL_STATE_SETTLING = 2;
  private static final String TAG = "ViewPager";
  private static final boolean USE_CACHE = false;
  private static final Interpolator sInterpolator = new Interpolator()
  {
    public float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat + 1.0F;
    }
  };
  private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();
  private int mActivePointerId = -1;
  PagerAdapter mAdapter;
  private List<OnAdapterChangeListener> mAdapterChangeListeners;
  private int mBottomPageBounds;
  private boolean mCalledSuper;
  private int mChildHeightMeasureSpec;
  private int mChildWidthMeasureSpec;
  private int mCloseEnough;
  int mCurItem;
  private int mDecorChildCount;
  private int mDefaultGutterSize;
  private int mDrawingOrder;
  private ArrayList<View> mDrawingOrderedChildren;
  private final Runnable mEndScrollRunnable = new Runnable()
  {
    public void run()
    {
      ViewPager.this.setScrollState(0);
      ViewPager.this.populate();
    }
  };
  private int mExpectedAdapterCount;
  private long mFakeDragBeginTime;
  private boolean mFakeDragging;
  private boolean mFirstLayout = true;
  private float mFirstOffset = -3.4028235E38F;
  private int mFlingDistance;
  private int mGutterSize;
  private boolean mInLayout;
  private float mInitialMotionX;
  private float mInitialMotionY;
  private OnPageChangeListener mInternalPageChangeListener;
  private boolean mIsBeingDragged;
  private boolean mIsScrollStarted;
  private boolean mIsUnableToDrag;
  private final ArrayList<ItemInfo> mItems = new ArrayList();
  private float mLastMotionX;
  private float mLastMotionY;
  private float mLastOffset = Float.MAX_VALUE;
  private EdgeEffect mLeftEdge;
  private Drawable mMarginDrawable;
  private int mMaximumVelocity;
  private int mMinimumVelocity;
  private boolean mNeedCalculatePageOffsets = false;
  private PagerObserver mObserver;
  private int mOffscreenPageLimit = 1;
  private OnPageChangeListener mOnPageChangeListener;
  private List<OnPageChangeListener> mOnPageChangeListeners;
  private int mPageMargin;
  private PageTransformer mPageTransformer;
  private int mPageTransformerLayerType;
  private boolean mPopulatePending;
  private Parcelable mRestoredAdapterState = null;
  private ClassLoader mRestoredClassLoader = null;
  private int mRestoredCurItem = -1;
  private EdgeEffect mRightEdge;
  private int mScrollState = 0;
  private Scroller mScroller;
  private boolean mScrollingCacheEnabled;
  private final ItemInfo mTempItem = new ItemInfo();
  private final Rect mTempRect = new Rect();
  private int mTopPageBounds;
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  
  public ViewPager(Context paramContext)
  {
    super(paramContext);
    initViewPager();
  }
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initViewPager();
  }
  
  private void calculatePageOffsets(ItemInfo paramItemInfo1, int paramInt, ItemInfo paramItemInfo2)
  {
    int m = this.mAdapter.getCount();
    int i = getClientWidth();
    float f2;
    if (i > 0) {
      f2 = this.mPageMargin / i;
    } else {
      f2 = 0.0F;
    }
    if (paramItemInfo2 != null)
    {
      i = paramItemInfo2.position;
      if (i < paramItemInfo1.position)
      {
        f1 = paramItemInfo2.offset + paramItemInfo2.widthFactor + f2;
        i++;
        j = 0;
        while ((i <= paramItemInfo1.position) && (j < this.mItems.size()))
        {
          for (paramItemInfo2 = (ItemInfo)this.mItems.get(j);; paramItemInfo2 = (ItemInfo)this.mItems.get(j))
          {
            k = i;
            f3 = f1;
            if (i <= paramItemInfo2.position) {
              break;
            }
            k = i;
            f3 = f1;
            if (j >= this.mItems.size() - 1) {
              break;
            }
            j++;
          }
          while (k < paramItemInfo2.position)
          {
            f3 += this.mAdapter.getPageWidth(k) + f2;
            k++;
          }
          paramItemInfo2.offset = f3;
          f1 = f3 + (paramItemInfo2.widthFactor + f2);
          i = k + 1;
        }
      }
      if (i > paramItemInfo1.position)
      {
        j = this.mItems.size() - 1;
        f1 = paramItemInfo2.offset;
        i--;
        while ((i >= paramItemInfo1.position) && (j >= 0))
        {
          for (paramItemInfo2 = (ItemInfo)this.mItems.get(j);; paramItemInfo2 = (ItemInfo)this.mItems.get(j))
          {
            k = i;
            f3 = f1;
            if (i >= paramItemInfo2.position) {
              break;
            }
            k = i;
            f3 = f1;
            if (j <= 0) {
              break;
            }
            j--;
          }
          while (k > paramItemInfo2.position)
          {
            f3 -= this.mAdapter.getPageWidth(k) + f2;
            k--;
          }
          f1 = f3 - (paramItemInfo2.widthFactor + f2);
          paramItemInfo2.offset = f1;
          i = k - 1;
        }
      }
    }
    int k = this.mItems.size();
    float f3 = paramItemInfo1.offset;
    i = paramItemInfo1.position - 1;
    if (paramItemInfo1.position == 0) {
      f1 = paramItemInfo1.offset;
    } else {
      f1 = -3.4028235E38F;
    }
    this.mFirstOffset = f1;
    int j = paramItemInfo1.position;
    m--;
    if (j == m) {
      f1 = paramItemInfo1.offset + paramItemInfo1.widthFactor - 1.0F;
    } else {
      f1 = Float.MAX_VALUE;
    }
    this.mLastOffset = f1;
    j = paramInt - 1;
    float f1 = f3;
    while (j >= 0)
    {
      paramItemInfo2 = (ItemInfo)this.mItems.get(j);
      while (i > paramItemInfo2.position)
      {
        f1 -= this.mAdapter.getPageWidth(i) + f2;
        i--;
      }
      f1 -= paramItemInfo2.widthFactor + f2;
      paramItemInfo2.offset = f1;
      if (paramItemInfo2.position == 0) {
        this.mFirstOffset = f1;
      }
      j--;
      i--;
    }
    f1 = paramItemInfo1.offset + paramItemInfo1.widthFactor + f2;
    j = paramItemInfo1.position + 1;
    i = paramInt + 1;
    for (paramInt = j; i < k; paramInt++)
    {
      paramItemInfo1 = (ItemInfo)this.mItems.get(i);
      while (paramInt < paramItemInfo1.position)
      {
        f1 += this.mAdapter.getPageWidth(paramInt) + f2;
        paramInt++;
      }
      if (paramItemInfo1.position == m) {
        this.mLastOffset = (paramItemInfo1.widthFactor + f1 - 1.0F);
      }
      paramItemInfo1.offset = f1;
      f1 += paramItemInfo1.widthFactor + f2;
      i++;
    }
    this.mNeedCalculatePageOffsets = false;
  }
  
  private void completeScroll(boolean paramBoolean)
  {
    int i;
    if (this.mScrollState == 2) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      setScrollingCacheEnabled(false);
      if ((this.mScroller.isFinished() ^ true))
      {
        this.mScroller.abortAnimation();
        int n = getScrollX();
        j = getScrollY();
        int m = this.mScroller.getCurrX();
        int k = this.mScroller.getCurrY();
        if ((n != m) || (j != k))
        {
          scrollTo(m, k);
          if (m != n) {
            pageScrolled(m);
          }
        }
      }
    }
    this.mPopulatePending = false;
    for (int j = 0; j < this.mItems.size(); j++)
    {
      ItemInfo localItemInfo = (ItemInfo)this.mItems.get(j);
      if (localItemInfo.scrolling)
      {
        localItemInfo.scrolling = false;
        i = 1;
      }
    }
    if (i != 0) {
      if (paramBoolean) {
        ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
      } else {
        this.mEndScrollRunnable.run();
      }
    }
  }
  
  private int determineTargetPage(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    if ((Math.abs(paramInt3) > this.mFlingDistance) && (Math.abs(paramInt2) > this.mMinimumVelocity))
    {
      if (paramInt2 <= 0) {
        paramInt1++;
      }
    }
    else
    {
      float f;
      if (paramInt1 >= this.mCurItem) {
        f = 0.4F;
      } else {
        f = 0.6F;
      }
      paramInt1 += (int)(paramFloat + f);
    }
    paramInt2 = paramInt1;
    if (this.mItems.size() > 0)
    {
      ItemInfo localItemInfo = (ItemInfo)this.mItems.get(0);
      Object localObject = this.mItems;
      localObject = (ItemInfo)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
      paramInt2 = Math.max(localItemInfo.position, Math.min(paramInt1, ((ItemInfo)localObject).position));
    }
    return paramInt2;
  }
  
  private void dispatchOnPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    Object localObject = this.mOnPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
    localObject = this.mOnPageChangeListeners;
    if (localObject != null)
    {
      int i = 0;
      int j = ((List)localObject).size();
      while (i < j)
      {
        localObject = (OnPageChangeListener)this.mOnPageChangeListeners.get(i);
        if (localObject != null) {
          ((OnPageChangeListener)localObject).onPageScrolled(paramInt1, paramFloat, paramInt2);
        }
        i++;
      }
    }
    localObject = this.mInternalPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
  }
  
  private void dispatchOnPageSelected(int paramInt)
  {
    Object localObject = this.mOnPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageSelected(paramInt);
    }
    localObject = this.mOnPageChangeListeners;
    if (localObject != null)
    {
      int i = 0;
      int j = ((List)localObject).size();
      while (i < j)
      {
        localObject = (OnPageChangeListener)this.mOnPageChangeListeners.get(i);
        if (localObject != null) {
          ((OnPageChangeListener)localObject).onPageSelected(paramInt);
        }
        i++;
      }
    }
    localObject = this.mInternalPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageSelected(paramInt);
    }
  }
  
  private void dispatchOnScrollStateChanged(int paramInt)
  {
    Object localObject = this.mOnPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageScrollStateChanged(paramInt);
    }
    localObject = this.mOnPageChangeListeners;
    if (localObject != null)
    {
      int i = 0;
      int j = ((List)localObject).size();
      while (i < j)
      {
        localObject = (OnPageChangeListener)this.mOnPageChangeListeners.get(i);
        if (localObject != null) {
          ((OnPageChangeListener)localObject).onPageScrollStateChanged(paramInt);
        }
        i++;
      }
    }
    localObject = this.mInternalPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageScrollStateChanged(paramInt);
    }
  }
  
  private void enableLayers(boolean paramBoolean)
  {
    int k = getChildCount();
    for (int i = 0; i < k; i++)
    {
      int j;
      if (paramBoolean) {
        j = this.mPageTransformerLayerType;
      } else {
        j = 0;
      }
      getChildAt(i).setLayerType(j, null);
    }
  }
  
  private void endDrag()
  {
    this.mIsBeingDragged = false;
    this.mIsUnableToDrag = false;
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }
  
  private Rect getChildRectInPagerCoordinates(Rect paramRect, View paramView)
  {
    Rect localRect = paramRect;
    if (paramRect == null) {
      localRect = new Rect();
    }
    if (paramView == null)
    {
      localRect.set(0, 0, 0, 0);
      return localRect;
    }
    localRect.left = paramView.getLeft();
    localRect.right = paramView.getRight();
    localRect.top = paramView.getTop();
    localRect.bottom = paramView.getBottom();
    for (paramRect = paramView.getParent(); ((paramRect instanceof ViewGroup)) && (paramRect != this); paramRect = paramRect.getParent())
    {
      paramRect = (ViewGroup)paramRect;
      localRect.left += paramRect.getLeft();
      localRect.right += paramRect.getRight();
      localRect.top += paramRect.getTop();
      localRect.bottom += paramRect.getBottom();
    }
    return localRect;
  }
  
  private int getClientWidth()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private ItemInfo infoForCurrentScrollPosition()
  {
    int i = getClientWidth();
    float f3 = 0.0F;
    float f1;
    if (i > 0) {
      f1 = getScrollX() / i;
    } else {
      f1 = 0.0F;
    }
    float f2;
    if (i > 0) {
      f2 = this.mPageMargin / i;
    } else {
      f2 = 0.0F;
    }
    Object localObject = null;
    float f4 = 0.0F;
    int k = -1;
    i = 0;
    int j = 1;
    while (i < this.mItems.size())
    {
      ItemInfo localItemInfo2 = (ItemInfo)this.mItems.get(i);
      int m = i;
      ItemInfo localItemInfo1 = localItemInfo2;
      if (j == 0)
      {
        int n = localItemInfo2.position;
        k++;
        m = i;
        localItemInfo1 = localItemInfo2;
        if (n != k)
        {
          localItemInfo1 = this.mTempItem;
          localItemInfo1.offset = (f3 + f4 + f2);
          localItemInfo1.position = k;
          localItemInfo1.widthFactor = this.mAdapter.getPageWidth(localItemInfo1.position);
          m = i - 1;
        }
      }
      f3 = localItemInfo1.offset;
      f4 = localItemInfo1.widthFactor;
      if ((j == 0) && (f1 < f3)) {
        return (ItemInfo)localObject;
      }
      if ((f1 >= f4 + f3 + f2) && (m != this.mItems.size() - 1))
      {
        k = localItemInfo1.position;
        f4 = localItemInfo1.widthFactor;
        i = m + 1;
        j = 0;
        localObject = localItemInfo1;
      }
      else
      {
        return localItemInfo1;
      }
    }
    return (ItemInfo)localObject;
  }
  
  private static boolean isDecorView(View paramView)
  {
    boolean bool;
    if (paramView.getClass().getAnnotation(DecorView.class) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isGutterDrag(float paramFloat1, float paramFloat2)
  {
    boolean bool;
    if (((paramFloat1 < this.mGutterSize) && (paramFloat2 > 0.0F)) || ((paramFloat1 > getWidth() - this.mGutterSize) && (paramFloat2 < 0.0F))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
      this.mLastMotionX = paramMotionEvent.getX(i);
      this.mActivePointerId = paramMotionEvent.getPointerId(i);
      paramMotionEvent = this.mVelocityTracker;
      if (paramMotionEvent != null) {
        paramMotionEvent.clear();
      }
    }
  }
  
  private boolean pageScrolled(int paramInt)
  {
    if (this.mItems.size() == 0)
    {
      if (this.mFirstLayout) {
        return false;
      }
      this.mCalledSuper = false;
      onPageScrolled(0, 0.0F, 0);
      if (this.mCalledSuper) {
        return false;
      }
      throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    ItemInfo localItemInfo = infoForCurrentScrollPosition();
    int j = getClientWidth();
    int k = this.mPageMargin;
    float f2 = k;
    float f1 = j;
    f2 /= f1;
    int i = localItemInfo.position;
    f1 = (paramInt / f1 - localItemInfo.offset) / (localItemInfo.widthFactor + f2);
    paramInt = (int)((j + k) * f1);
    this.mCalledSuper = false;
    onPageScrolled(i, f1, paramInt);
    if (this.mCalledSuper) {
      return true;
    }
    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
  }
  
  private boolean performDrag(float paramFloat)
  {
    float f1 = this.mLastMotionX;
    this.mLastMotionX = paramFloat;
    float f2 = getScrollX() + (f1 - paramFloat);
    float f3 = getClientWidth();
    paramFloat = this.mFirstOffset * f3;
    f1 = this.mLastOffset * f3;
    Object localObject1 = this.mItems;
    boolean bool2 = false;
    boolean bool1 = false;
    boolean bool3 = false;
    localObject1 = (ItemInfo)((ArrayList)localObject1).get(0);
    Object localObject2 = this.mItems;
    localObject2 = (ItemInfo)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
    if (((ItemInfo)localObject1).position != 0)
    {
      paramFloat = ((ItemInfo)localObject1).offset * f3;
      i = 0;
    }
    else
    {
      i = 1;
    }
    int j;
    if (((ItemInfo)localObject2).position != this.mAdapter.getCount() - 1)
    {
      f1 = ((ItemInfo)localObject2).offset * f3;
      j = 0;
    }
    else
    {
      j = 1;
    }
    if (f2 < paramFloat)
    {
      bool1 = bool3;
      if (i != 0)
      {
        this.mLeftEdge.onPull(Math.abs(paramFloat - f2) / f3);
        bool1 = true;
      }
    }
    else
    {
      paramFloat = f2;
      if (f2 > f1)
      {
        bool1 = bool2;
        if (j != 0)
        {
          this.mRightEdge.onPull(Math.abs(f2 - f1) / f3);
          bool1 = true;
        }
        paramFloat = f1;
      }
    }
    f1 = this.mLastMotionX;
    int i = (int)paramFloat;
    this.mLastMotionX = (f1 + (paramFloat - i));
    scrollTo(i, getScrollY());
    pageScrolled(i);
    return bool1;
  }
  
  private void recomputeScrollPosition(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > 0) && (!this.mItems.isEmpty()))
    {
      if (!this.mScroller.isFinished())
      {
        this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
      }
      else
      {
        int j = getPaddingLeft();
        int k = getPaddingRight();
        int i = getPaddingLeft();
        int m = getPaddingRight();
        scrollTo((int)(getScrollX() / (paramInt2 - i - m + paramInt4) * (paramInt1 - j - k + paramInt3)), getScrollY());
      }
    }
    else
    {
      ItemInfo localItemInfo = infoForPosition(this.mCurItem);
      float f;
      if (localItemInfo != null) {
        f = Math.min(localItemInfo.offset, this.mLastOffset);
      } else {
        f = 0.0F;
      }
      paramInt1 = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 != getScrollX())
      {
        completeScroll(false);
        scrollTo(paramInt1, getScrollY());
      }
    }
  }
  
  private void removeNonDecorViews()
  {
    int j;
    for (int i = 0; i < getChildCount(); i = j + 1)
    {
      j = i;
      if (!((LayoutParams)getChildAt(i).getLayoutParams()).isDecor)
      {
        removeViewAt(i);
        j = i - 1;
      }
    }
  }
  
  private void requestParentDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  private boolean resetTouch()
  {
    this.mActivePointerId = -1;
    endDrag();
    this.mLeftEdge.onRelease();
    this.mRightEdge.onRelease();
    boolean bool;
    if ((!this.mLeftEdge.isFinished()) && (!this.mRightEdge.isFinished())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void scrollToItem(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    ItemInfo localItemInfo = infoForPosition(paramInt1);
    int i;
    if (localItemInfo != null) {
      i = (int)(getClientWidth() * Math.max(this.mFirstOffset, Math.min(localItemInfo.offset, this.mLastOffset)));
    } else {
      i = 0;
    }
    if (paramBoolean1)
    {
      smoothScrollTo(i, 0, paramInt2);
      if (paramBoolean2) {
        dispatchOnPageSelected(paramInt1);
      }
    }
    else
    {
      if (paramBoolean2) {
        dispatchOnPageSelected(paramInt1);
      }
      completeScroll(false);
      scrollTo(i, 0);
      pageScrolled(i);
    }
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.mScrollingCacheEnabled != paramBoolean) {
      this.mScrollingCacheEnabled = paramBoolean;
    }
  }
  
  private void sortChildDrawingOrder()
  {
    if (this.mDrawingOrder != 0)
    {
      Object localObject = this.mDrawingOrderedChildren;
      if (localObject == null) {
        this.mDrawingOrderedChildren = new ArrayList();
      } else {
        ((ArrayList)localObject).clear();
      }
      int j = getChildCount();
      for (int i = 0; i < j; i++)
      {
        localObject = getChildAt(i);
        this.mDrawingOrderedChildren.add(localObject);
      }
      Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
    }
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int k = paramArrayList.size();
    int j = getDescendantFocusability();
    if (j != 393216) {
      for (int i = 0; i < getChildCount(); i++)
      {
        View localView = getChildAt(i);
        if (localView.getVisibility() == 0)
        {
          ItemInfo localItemInfo = infoForChild(localView);
          if ((localItemInfo != null) && (localItemInfo.position == this.mCurItem)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
      }
    }
    if ((j != 262144) || (k == paramArrayList.size()))
    {
      if (!isFocusable()) {
        return;
      }
      if (((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) {
        return;
      }
      if (paramArrayList != null) {
        paramArrayList.add(this);
      }
    }
  }
  
  ItemInfo addNewItem(int paramInt1, int paramInt2)
  {
    ItemInfo localItemInfo = new ItemInfo();
    localItemInfo.position = paramInt1;
    localItemInfo.object = this.mAdapter.instantiateItem(this, paramInt1);
    localItemInfo.widthFactor = this.mAdapter.getPageWidth(paramInt1);
    if ((paramInt2 >= 0) && (paramInt2 < this.mItems.size())) {
      this.mItems.add(paramInt2, localItemInfo);
    } else {
      this.mItems.add(localItemInfo);
    }
    return localItemInfo;
  }
  
  public void addOnAdapterChangeListener(OnAdapterChangeListener paramOnAdapterChangeListener)
  {
    if (this.mAdapterChangeListeners == null) {
      this.mAdapterChangeListeners = new ArrayList();
    }
    this.mAdapterChangeListeners.add(paramOnAdapterChangeListener);
  }
  
  public void addOnPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    if (this.mOnPageChangeListeners == null) {
      this.mOnPageChangeListeners = new ArrayList();
    }
    this.mOnPageChangeListeners.add(paramOnPageChangeListener);
  }
  
  public void addTouchables(ArrayList<View> paramArrayList)
  {
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        ItemInfo localItemInfo = infoForChild(localView);
        if ((localItemInfo != null) && (localItemInfo.position == this.mCurItem)) {
          localView.addTouchables(paramArrayList);
        }
      }
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    ViewGroup.LayoutParams localLayoutParams = paramLayoutParams;
    if (!checkLayoutParams(paramLayoutParams)) {
      localLayoutParams = generateLayoutParams(paramLayoutParams);
    }
    paramLayoutParams = (LayoutParams)localLayoutParams;
    paramLayoutParams.isDecor |= isDecorView(paramView);
    if (this.mInLayout)
    {
      if ((paramLayoutParams != null) && (paramLayoutParams.isDecor)) {
        throw new IllegalStateException("Cannot add pager decor view during layout");
      }
      paramLayoutParams.needsMeasure = true;
      addViewInLayout(paramView, paramInt, localLayoutParams);
    }
    else
    {
      super.addView(paramView, paramInt, localLayoutParams);
    }
  }
  
  public boolean arrowScroll(int paramInt)
  {
    View localView = findFocus();
    boolean bool = false;
    if (localView == this) {}
    Object localObject;
    int i;
    for (;;)
    {
      localObject = null;
      break;
      localObject = localView;
      if (localView == null) {
        break;
      }
      for (localObject = localView.getParent(); (localObject instanceof ViewGroup); localObject = ((ViewParent)localObject).getParent()) {
        if (localObject == this)
        {
          i = 1;
          break label70;
        }
      }
      i = 0;
      label70:
      localObject = localView;
      if (i != 0) {
        break;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(localView.getClass().getSimpleName());
      for (localObject = localView.getParent(); (localObject instanceof ViewGroup); localObject = ((ViewParent)localObject).getParent())
      {
        localStringBuilder.append(" => ");
        localStringBuilder.append(localObject.getClass().getSimpleName());
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("arrowScroll tried to find focus based on non-child current focused view ");
      ((StringBuilder)localObject).append(localStringBuilder.toString());
      Log.e("ViewPager", ((StringBuilder)localObject).toString());
    }
    localView = FocusFinder.getInstance().findNextFocus(this, (View)localObject, paramInt);
    int j;
    if ((localView != null) && (localView != localObject)) {
      if (paramInt == 17)
      {
        j = getChildRectInPagerCoordinates(this.mTempRect, localView).left;
        i = getChildRectInPagerCoordinates(this.mTempRect, (View)localObject).left;
        if ((localObject != null) && (j >= i)) {
          bool = pageLeft();
        } else {
          bool = localView.requestFocus();
        }
      }
    }
    for (;;)
    {
      break;
      if (paramInt == 66)
      {
        i = getChildRectInPagerCoordinates(this.mTempRect, localView).left;
        j = getChildRectInPagerCoordinates(this.mTempRect, (View)localObject).left;
        if ((localObject != null) && (i <= j))
        {
          bool = pageRight();
        }
        else
        {
          bool = localView.requestFocus();
          continue;
          if ((paramInt != 17) && (paramInt != 1))
          {
            if ((paramInt == 66) || (paramInt == 2)) {
              bool = pageRight();
            }
          }
          else {
            bool = pageLeft();
          }
        }
      }
    }
    if (bool) {
      playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
    }
    return bool;
  }
  
  public boolean beginFakeDrag()
  {
    if (this.mIsBeingDragged) {
      return false;
    }
    this.mFakeDragging = true;
    setScrollState(1);
    this.mLastMotionX = 0.0F;
    this.mInitialMotionX = 0.0F;
    Object localObject = this.mVelocityTracker;
    if (localObject == null) {
      this.mVelocityTracker = VelocityTracker.obtain();
    } else {
      ((VelocityTracker)localObject).clear();
    }
    long l = SystemClock.uptimeMillis();
    localObject = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
    this.mVelocityTracker.addMovement((MotionEvent)localObject);
    ((MotionEvent)localObject).recycle();
    this.mFakeDragBeginTime = l;
    return true;
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
    if ((paramBoolean) && (paramView.canScrollHorizontally(-paramInt1))) {
      paramBoolean = bool1;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    PagerAdapter localPagerAdapter = this.mAdapter;
    boolean bool2 = false;
    boolean bool1 = false;
    if (localPagerAdapter == null) {
      return false;
    }
    int i = getClientWidth();
    int j = getScrollX();
    if (paramInt < 0)
    {
      if (j > (int)(i * this.mFirstOffset)) {
        bool1 = true;
      }
      return bool1;
    }
    bool1 = bool2;
    if (paramInt > 0)
    {
      bool1 = bool2;
      if (j < (int)(i * this.mLastOffset)) {
        bool1 = true;
      }
    }
    return bool1;
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
  
  public void clearOnPageChangeListeners()
  {
    List localList = this.mOnPageChangeListeners;
    if (localList != null) {
      localList.clear();
    }
  }
  
  public void computeScroll()
  {
    this.mIsScrollStarted = true;
    if ((!this.mScroller.isFinished()) && (this.mScroller.computeScrollOffset()))
    {
      int i = getScrollX();
      int m = getScrollY();
      int k = this.mScroller.getCurrX();
      int j = this.mScroller.getCurrY();
      if ((i != k) || (m != j))
      {
        scrollTo(k, j);
        if (!pageScrolled(k))
        {
          this.mScroller.abortAnimation();
          scrollTo(0, j);
        }
      }
      ViewCompat.postInvalidateOnAnimation(this);
      return;
    }
    completeScroll(true);
  }
  
  void dataSetChanged()
  {
    int i4 = this.mAdapter.getCount();
    this.mExpectedAdapterCount = i4;
    int m;
    if ((this.mItems.size() < this.mOffscreenPageLimit * 2 + 1) && (this.mItems.size() < i4)) {
      m = 1;
    } else {
      m = 0;
    }
    int i = this.mCurItem;
    int k = 0;
    int j = 0;
    int n = m;
    Object localObject;
    while (k < this.mItems.size())
    {
      localObject = (ItemInfo)this.mItems.get(k);
      int i3 = this.mAdapter.getItemPosition(((ItemInfo)localObject).object);
      int i2;
      int i1;
      if (i3 == -1)
      {
        m = i;
        i2 = k;
        i1 = j;
      }
      else
      {
        if (i3 == -2)
        {
          this.mItems.remove(k);
          n = k - 1;
          m = j;
          if (j == 0)
          {
            this.mAdapter.startUpdate(this);
            m = 1;
          }
          this.mAdapter.destroyItem(this, ((ItemInfo)localObject).position, ((ItemInfo)localObject).object);
          k = n;
          j = m;
          if (this.mCurItem == ((ItemInfo)localObject).position)
          {
            i = Math.max(0, Math.min(this.mCurItem, i4 - 1));
            j = m;
            k = n;
          }
        }
        for (;;)
        {
          n = 1;
          m = i;
          i2 = k;
          i1 = j;
          break;
          m = i;
          i2 = k;
          i1 = j;
          if (((ItemInfo)localObject).position == i3) {
            break;
          }
          if (((ItemInfo)localObject).position == this.mCurItem) {
            i = i3;
          }
          ((ItemInfo)localObject).position = i3;
        }
      }
      k = i2 + 1;
      i = m;
      j = i1;
    }
    if (j != 0) {
      this.mAdapter.finishUpdate(this);
    }
    Collections.sort(this.mItems, COMPARATOR);
    if (n != 0)
    {
      k = getChildCount();
      for (j = 0; j < k; j++)
      {
        localObject = (LayoutParams)getChildAt(j).getLayoutParams();
        if (!((LayoutParams)localObject).isDecor) {
          ((LayoutParams)localObject).widthFactor = 0.0F;
        }
      }
      setCurrentItemInternal(i, false, true);
      requestLayout();
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool;
    if ((!super.dispatchKeyEvent(paramKeyEvent)) && (!executeKeyEvent(paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 4096) {
      return super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
    }
    int j = getChildCount();
    for (int i = 0; i < j; i++)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        ItemInfo localItemInfo = infoForChild(localView);
        if ((localItemInfo != null) && (localItemInfo.position == this.mCurItem) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))) {
          return true;
        }
      }
    }
    return false;
  }
  
  float distanceInfluenceForSnapDuration(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.47123894F);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int m = getOverScrollMode();
    int k = 0;
    int i = 0;
    if (m != 0) {
      if (m == 1)
      {
        PagerAdapter localPagerAdapter = this.mAdapter;
        if ((localPagerAdapter != null) && (localPagerAdapter.getCount() > 1)) {}
      }
      else
      {
        this.mLeftEdge.finish();
        this.mRightEdge.finish();
        break label257;
      }
    }
    int j;
    if (!this.mLeftEdge.isFinished())
    {
      k = paramCanvas.save();
      m = getHeight() - getPaddingTop() - getPaddingBottom();
      i = getWidth();
      paramCanvas.rotate(270.0F);
      paramCanvas.translate(-m + getPaddingTop(), this.mFirstOffset * i);
      this.mLeftEdge.setSize(m, i);
      j = false | this.mLeftEdge.draw(paramCanvas);
      paramCanvas.restoreToCount(k);
    }
    k = j;
    boolean bool;
    if (!this.mRightEdge.isFinished())
    {
      m = paramCanvas.save();
      int i2 = getWidth();
      k = getHeight();
      int i1 = getPaddingTop();
      int n = getPaddingBottom();
      paramCanvas.rotate(90.0F);
      paramCanvas.translate(-getPaddingTop(), -(this.mLastOffset + 1.0F) * i2);
      this.mRightEdge.setSize(k - i1 - n, i2);
      bool = j | this.mRightEdge.draw(paramCanvas);
      paramCanvas.restoreToCount(m);
    }
    label257:
    if (bool) {
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.mMarginDrawable;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  public void endFakeDrag()
  {
    if (this.mFakeDragging)
    {
      if (this.mAdapter != null)
      {
        Object localObject = this.mVelocityTracker;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.mMaximumVelocity);
        int j = (int)((VelocityTracker)localObject).getXVelocity(this.mActivePointerId);
        this.mPopulatePending = true;
        int i = getClientWidth();
        int k = getScrollX();
        localObject = infoForCurrentScrollPosition();
        setCurrentItemInternal(determineTargetPage(((ItemInfo)localObject).position, (k / i - ((ItemInfo)localObject).offset) / ((ItemInfo)localObject).widthFactor, j, (int)(this.mLastMotionX - this.mInitialMotionX)), true, true, j);
      }
      endDrag();
      this.mFakeDragging = false;
      return;
    }
    throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
  }
  
  public boolean executeKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0)
    {
      int i = paramKeyEvent.getKeyCode();
      if (i != 21)
      {
        if (i != 22)
        {
          if (i == 61)
          {
            if (paramKeyEvent.hasNoModifiers()) {
              return arrowScroll(2);
            }
            if (paramKeyEvent.hasModifiers(1)) {
              return arrowScroll(1);
            }
          }
        }
        else
        {
          if (paramKeyEvent.hasModifiers(2)) {
            return pageRight();
          }
          return arrowScroll(66);
        }
      }
      else
      {
        if (paramKeyEvent.hasModifiers(2)) {
          return pageLeft();
        }
        return arrowScroll(17);
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void fakeDragBy(float paramFloat)
  {
    if (this.mFakeDragging)
    {
      if (this.mAdapter == null) {
        return;
      }
      this.mLastMotionX += paramFloat;
      float f2 = getScrollX() - paramFloat;
      float f3 = getClientWidth();
      paramFloat = this.mFirstOffset * f3;
      float f1 = this.mLastOffset * f3;
      Object localObject1 = (ItemInfo)this.mItems.get(0);
      Object localObject2 = this.mItems;
      localObject2 = (ItemInfo)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
      if (((ItemInfo)localObject1).position != 0) {
        paramFloat = ((ItemInfo)localObject1).offset * f3;
      }
      if (((ItemInfo)localObject2).position != this.mAdapter.getCount() - 1) {
        f1 = ((ItemInfo)localObject2).offset * f3;
      }
      if (f2 >= paramFloat)
      {
        paramFloat = f2;
        if (f2 > f1) {
          paramFloat = f1;
        }
      }
      f1 = this.mLastMotionX;
      int i = (int)paramFloat;
      this.mLastMotionX = (f1 + (paramFloat - i));
      scrollTo(i, getScrollY());
      pageScrolled(i);
      long l = SystemClock.uptimeMillis();
      localObject1 = MotionEvent.obtain(this.mFakeDragBeginTime, l, 2, this.mLastMotionX, 0.0F, 0);
      this.mVelocityTracker.addMovement((MotionEvent)localObject1);
      ((MotionEvent)localObject1).recycle();
      return;
    }
    throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
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
    return generateDefaultLayoutParams();
  }
  
  public PagerAdapter getAdapter()
  {
    return this.mAdapter;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (this.mDrawingOrder == 2) {
      i = paramInt1 - 1 - paramInt2;
    }
    return ((LayoutParams)((View)this.mDrawingOrderedChildren.get(i)).getLayoutParams()).childIndex;
  }
  
  public int getCurrentItem()
  {
    return this.mCurItem;
  }
  
  public int getOffscreenPageLimit()
  {
    return this.mOffscreenPageLimit;
  }
  
  public int getPageMargin()
  {
    return this.mPageMargin;
  }
  
  ItemInfo infoForAnyChild(View paramView)
  {
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break label34;
      }
      if ((localViewParent == null) || (!(localViewParent instanceof View))) {
        break;
      }
      paramView = (View)localViewParent;
    }
    return null;
    label34:
    return infoForChild(paramView);
  }
  
  ItemInfo infoForChild(View paramView)
  {
    for (int i = 0; i < this.mItems.size(); i++)
    {
      ItemInfo localItemInfo = (ItemInfo)this.mItems.get(i);
      if (this.mAdapter.isViewFromObject(paramView, localItemInfo.object)) {
        return localItemInfo;
      }
    }
    return null;
  }
  
  ItemInfo infoForPosition(int paramInt)
  {
    for (int i = 0; i < this.mItems.size(); i++)
    {
      ItemInfo localItemInfo = (ItemInfo)this.mItems.get(i);
      if (localItemInfo.position == paramInt) {
        return localItemInfo;
      }
    }
    return null;
  }
  
  void initViewPager()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.mScroller = new Scroller(localContext, sInterpolator);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f = localContext.getResources().getDisplayMetrics().density;
    this.mTouchSlop = localViewConfiguration.getScaledPagingTouchSlop();
    this.mMinimumVelocity = ((int)(400.0F * f));
    this.mMaximumVelocity = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.mLeftEdge = new EdgeEffect(localContext);
    this.mRightEdge = new EdgeEffect(localContext);
    this.mFlingDistance = ((int)(25.0F * f));
    this.mCloseEnough = ((int)(2.0F * f));
    this.mDefaultGutterSize = ((int)(f * 16.0F));
    ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
    if (ViewCompat.getImportantForAccessibility(this) == 0) {
      ViewCompat.setImportantForAccessibility(this, 1);
    }
    ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener()
    {
      private final Rect mTempRect = new Rect();
      
      public WindowInsetsCompat onApplyWindowInsets(View paramAnonymousView, WindowInsetsCompat paramAnonymousWindowInsetsCompat)
      {
        paramAnonymousView = ViewCompat.onApplyWindowInsets(paramAnonymousView, paramAnonymousWindowInsetsCompat);
        if (paramAnonymousView.isConsumed()) {
          return paramAnonymousView;
        }
        paramAnonymousWindowInsetsCompat = this.mTempRect;
        paramAnonymousWindowInsetsCompat.left = paramAnonymousView.getSystemWindowInsetLeft();
        paramAnonymousWindowInsetsCompat.top = paramAnonymousView.getSystemWindowInsetTop();
        paramAnonymousWindowInsetsCompat.right = paramAnonymousView.getSystemWindowInsetRight();
        paramAnonymousWindowInsetsCompat.bottom = paramAnonymousView.getSystemWindowInsetBottom();
        int i = 0;
        int j = ViewPager.this.getChildCount();
        while (i < j)
        {
          WindowInsetsCompat localWindowInsetsCompat = ViewCompat.dispatchApplyWindowInsets(ViewPager.this.getChildAt(i), paramAnonymousView);
          paramAnonymousWindowInsetsCompat.left = Math.min(localWindowInsetsCompat.getSystemWindowInsetLeft(), paramAnonymousWindowInsetsCompat.left);
          paramAnonymousWindowInsetsCompat.top = Math.min(localWindowInsetsCompat.getSystemWindowInsetTop(), paramAnonymousWindowInsetsCompat.top);
          paramAnonymousWindowInsetsCompat.right = Math.min(localWindowInsetsCompat.getSystemWindowInsetRight(), paramAnonymousWindowInsetsCompat.right);
          paramAnonymousWindowInsetsCompat.bottom = Math.min(localWindowInsetsCompat.getSystemWindowInsetBottom(), paramAnonymousWindowInsetsCompat.bottom);
          i++;
        }
        return paramAnonymousView.replaceSystemWindowInsets(paramAnonymousWindowInsetsCompat.left, paramAnonymousWindowInsetsCompat.top, paramAnonymousWindowInsetsCompat.right, paramAnonymousWindowInsetsCompat.bottom);
      }
    });
  }
  
  public boolean isFakeDragging()
  {
    return this.mFakeDragging;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mFirstLayout = true;
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.mEndScrollRunnable);
    Scroller localScroller = this.mScroller;
    if ((localScroller != null) && (!localScroller.isFinished())) {
      this.mScroller.abortAnimation();
    }
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.mPageMargin > 0) && (this.mMarginDrawable != null) && (this.mItems.size() > 0) && (this.mAdapter != null))
    {
      int n = getScrollX();
      int k = getWidth();
      float f1 = this.mPageMargin;
      float f5 = k;
      float f2 = f1 / f5;
      Object localObject = this.mItems;
      int j = 0;
      localObject = (ItemInfo)((ArrayList)localObject).get(0);
      f1 = ((ItemInfo)localObject).offset;
      int m = this.mItems.size();
      int i = ((ItemInfo)localObject).position;
      int i1 = ((ItemInfo)this.mItems.get(m - 1)).position;
      while (i < i1)
      {
        while ((i > ((ItemInfo)localObject).position) && (j < m))
        {
          localObject = this.mItems;
          j++;
          localObject = (ItemInfo)((ArrayList)localObject).get(j);
        }
        float f3;
        if (i == ((ItemInfo)localObject).position)
        {
          f3 = (((ItemInfo)localObject).offset + ((ItemInfo)localObject).widthFactor) * f5;
          f1 = ((ItemInfo)localObject).offset + ((ItemInfo)localObject).widthFactor + f2;
        }
        else
        {
          float f4 = this.mAdapter.getPageWidth(i);
          f3 = f1 + (f4 + f2);
          f4 = (f1 + f4) * f5;
          f1 = f3;
          f3 = f4;
        }
        if (this.mPageMargin + f3 > n)
        {
          this.mMarginDrawable.setBounds(Math.round(f3), this.mTopPageBounds, Math.round(this.mPageMargin + f3), this.mBottomPageBounds);
          this.mMarginDrawable.draw(paramCanvas);
        }
        if (f3 > n + k) {
          break;
        }
        i++;
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction() & 0xFF;
    if ((i != 3) && (i != 1))
    {
      if (i != 0)
      {
        if (this.mIsBeingDragged) {
          return true;
        }
        if (this.mIsUnableToDrag) {
          return false;
        }
      }
      float f1;
      if (i != 0)
      {
        if (i != 2)
        {
          if (i == 6) {
            onSecondaryPointerUp(paramMotionEvent);
          }
        }
        else
        {
          i = this.mActivePointerId;
          if (i != -1)
          {
            i = paramMotionEvent.findPointerIndex(i);
            float f2 = paramMotionEvent.getX(i);
            f1 = f2 - this.mLastMotionX;
            float f4 = Math.abs(f1);
            float f3 = paramMotionEvent.getY(i);
            float f5 = Math.abs(f3 - this.mInitialMotionY);
            boolean bool = f1 < 0.0F;
            if ((bool) && (!isGutterDrag(this.mLastMotionX, f1)) && (canScroll(this, false, (int)f1, (int)f2, (int)f3)))
            {
              this.mLastMotionX = f2;
              this.mLastMotionY = f3;
              this.mIsUnableToDrag = true;
              return false;
            }
            int j = this.mTouchSlop;
            if ((f4 > j) && (f4 * 0.5F > f5))
            {
              this.mIsBeingDragged = true;
              requestParentDisallowInterceptTouchEvent(true);
              setScrollState(1);
              f4 = this.mInitialMotionX;
              f1 = this.mTouchSlop;
              if (bool) {
                f1 = f4 + f1;
              } else {
                f1 = f4 - f1;
              }
              this.mLastMotionX = f1;
              this.mLastMotionY = f3;
              setScrollingCacheEnabled(true);
            }
            else if (f5 > j)
            {
              this.mIsUnableToDrag = true;
            }
            if ((this.mIsBeingDragged) && (performDrag(f2))) {
              ViewCompat.postInvalidateOnAnimation(this);
            }
          }
        }
      }
      else
      {
        f1 = paramMotionEvent.getX();
        this.mInitialMotionX = f1;
        this.mLastMotionX = f1;
        f1 = paramMotionEvent.getY();
        this.mInitialMotionY = f1;
        this.mLastMotionY = f1;
        this.mActivePointerId = paramMotionEvent.getPointerId(0);
        this.mIsUnableToDrag = false;
        this.mIsScrollStarted = true;
        this.mScroller.computeScrollOffset();
        if ((this.mScrollState == 2) && (Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough))
        {
          this.mScroller.abortAnimation();
          this.mPopulatePending = false;
          populate();
          this.mIsBeingDragged = true;
          requestParentDisallowInterceptTouchEvent(true);
          setScrollState(1);
        }
        else
        {
          completeScroll(false);
          this.mIsBeingDragged = false;
        }
      }
      if (this.mVelocityTracker == null) {
        this.mVelocityTracker = VelocityTracker.obtain();
      }
      this.mVelocityTracker.addMovement(paramMotionEvent);
      return this.mIsBeingDragged;
    }
    resetTouch();
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i3 = getChildCount();
    int i4 = paramInt3 - paramInt1;
    int i5 = paramInt4 - paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 = getPaddingTop();
    paramInt4 = getPaddingRight();
    paramInt3 = getPaddingBottom();
    int i6 = getScrollX();
    int k = 0;
    View localView;
    LayoutParams localLayoutParams;
    for (int j = 0; k < i3; j = i)
    {
      localView = getChildAt(k);
      int i2 = paramInt2;
      int i1 = paramInt1;
      int n = paramInt4;
      int m = paramInt3;
      i = j;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        i2 = paramInt2;
        i1 = paramInt1;
        n = paramInt4;
        m = paramInt3;
        i = j;
        if (localLayoutParams.isDecor)
        {
          i = localLayoutParams.gravity & 0x7;
          n = localLayoutParams.gravity & 0x70;
          if (i != 1)
          {
            if (i != 3)
            {
              if (i != 5)
              {
                i = paramInt2;
                m = paramInt2;
                paramInt2 = i;
                break label245;
              }
              i = i4 - paramInt4 - localView.getMeasuredWidth();
              paramInt4 += localView.getMeasuredWidth();
            }
            else
            {
              i = localView.getMeasuredWidth() + paramInt2;
              m = paramInt2;
              paramInt2 = i;
              break label245;
            }
          }
          else {
            i = Math.max((i4 - localView.getMeasuredWidth()) / 2, paramInt2);
          }
          m = i;
          label245:
          if (n != 16)
          {
            if (n != 48)
            {
              if (n != 80)
              {
                n = paramInt1;
                i = paramInt1;
                paramInt1 = n;
              }
              else
              {
                i = i5 - paramInt3 - localView.getMeasuredHeight();
                paramInt3 += localView.getMeasuredHeight();
              }
            }
            else
            {
              n = localView.getMeasuredHeight() + paramInt1;
              i = paramInt1;
              paramInt1 = n;
            }
          }
          else {
            i = Math.max((i5 - localView.getMeasuredHeight()) / 2, paramInt1);
          }
          m += i6;
          localView.layout(m, i, localView.getMeasuredWidth() + m, i + localView.getMeasuredHeight());
          i = j + 1;
          m = paramInt3;
          n = paramInt4;
          i1 = paramInt1;
          i2 = paramInt2;
        }
      }
      k++;
      paramInt2 = i2;
      paramInt1 = i1;
      paramInt4 = n;
      paramInt3 = m;
    }
    for (int i = 0; i < i3; i++)
    {
      localView = getChildAt(i);
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (!localLayoutParams.isDecor)
        {
          ItemInfo localItemInfo = infoForChild(localView);
          if (localItemInfo != null)
          {
            float f = i4 - paramInt2 - paramInt4;
            k = (int)(localItemInfo.offset * f) + paramInt2;
            if (localLayoutParams.needsMeasure)
            {
              localLayoutParams.needsMeasure = false;
              localView.measure(View.MeasureSpec.makeMeasureSpec((int)(f * localLayoutParams.widthFactor), 1073741824), View.MeasureSpec.makeMeasureSpec(i5 - paramInt1 - paramInt3, 1073741824));
            }
            localView.layout(k, paramInt1, localView.getMeasuredWidth() + k, localView.getMeasuredHeight() + paramInt1);
          }
        }
      }
    }
    this.mTopPageBounds = paramInt1;
    this.mBottomPageBounds = (i5 - paramInt3);
    this.mDecorChildCount = j;
    if (this.mFirstLayout) {
      scrollToItem(this.mCurItem, false, 0, false);
    }
    this.mFirstLayout = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    paramInt1 = getMeasuredWidth();
    this.mGutterSize = Math.min(paramInt1 / 10, this.mDefaultGutterSize);
    paramInt1 = paramInt1 - getPaddingLeft() - getPaddingRight();
    paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i4 = getChildCount();
    int k = 0;
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      int i1 = 1;
      int i3 = 1073741824;
      if (k >= i4) {
        break;
      }
      localObject1 = getChildAt(k);
      int j = paramInt1;
      i = paramInt2;
      if (((View)localObject1).getVisibility() != 8)
      {
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        j = paramInt1;
        i = paramInt2;
        if (localObject2 != null)
        {
          j = paramInt1;
          i = paramInt2;
          if (((LayoutParams)localObject2).isDecor)
          {
            i = ((LayoutParams)localObject2).gravity & 0x7;
            j = ((LayoutParams)localObject2).gravity & 0x70;
            int n;
            if ((j != 48) && (j != 80)) {
              n = 0;
            } else {
              n = 1;
            }
            int m = i1;
            if (i != 3) {
              if (i == 5) {
                m = i1;
              } else {
                m = 0;
              }
            }
            i = Integer.MIN_VALUE;
            if (n != 0)
            {
              j = 1073741824;
            }
            else
            {
              j = i;
              if (m != 0)
              {
                i1 = 1073741824;
                j = i;
                i = i1;
                break label253;
              }
            }
            i = Integer.MIN_VALUE;
            label253:
            if (((LayoutParams)localObject2).width != -2)
            {
              if (((LayoutParams)localObject2).width != -1) {
                j = ((LayoutParams)localObject2).width;
              } else {
                j = paramInt1;
              }
              i1 = 1073741824;
            }
            else
            {
              i1 = j;
              j = paramInt1;
            }
            if (((LayoutParams)localObject2).height != -2)
            {
              if (((LayoutParams)localObject2).height != -1) {
                i = ((LayoutParams)localObject2).height;
              } else {
                i = paramInt2;
              }
            }
            else
            {
              int i2 = paramInt2;
              i3 = i;
              i = i2;
            }
            ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(j, i1), View.MeasureSpec.makeMeasureSpec(i, i3));
            if (n != 0)
            {
              i = paramInt2 - ((View)localObject1).getMeasuredHeight();
              j = paramInt1;
            }
            else
            {
              j = paramInt1;
              i = paramInt2;
              if (m != 0)
              {
                j = paramInt1 - ((View)localObject1).getMeasuredWidth();
                i = paramInt2;
              }
            }
          }
        }
      }
      k++;
      paramInt1 = j;
      paramInt2 = i;
    }
    this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
    this.mInLayout = true;
    populate();
    paramInt2 = 0;
    this.mInLayout = false;
    int i = getChildCount();
    while (paramInt2 < i)
    {
      localObject2 = getChildAt(paramInt2);
      if (((View)localObject2).getVisibility() != 8)
      {
        localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
        if ((localObject1 == null) || (!((LayoutParams)localObject1).isDecor)) {
          ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * ((LayoutParams)localObject1).widthFactor), 1073741824), this.mChildHeightMeasureSpec);
        }
      }
      paramInt2++;
    }
  }
  
  protected void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    int i = this.mDecorChildCount;
    int i1 = 0;
    View localView;
    if (i > 0)
    {
      int i4 = getScrollX();
      i = getPaddingLeft();
      int j = getPaddingRight();
      int i3 = getWidth();
      int i2 = getChildCount();
      for (int m = 0; m < i2; m++)
      {
        localView = getChildAt(m);
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (localLayoutParams.isDecor)
        {
          int k = localLayoutParams.gravity & 0x7;
          if (k != 1)
          {
            int n;
            if (k != 3)
            {
              if (k != 5)
              {
                n = i;
                k = i;
                i = n;
              }
              else
              {
                k = i3 - j - localView.getMeasuredWidth();
                j += localView.getMeasuredWidth();
              }
            }
            else
            {
              n = localView.getWidth() + i;
              k = i;
              i = n;
            }
          }
          else
          {
            k = Math.max((i3 - localView.getMeasuredWidth()) / 2, i);
          }
          k = k + i4 - localView.getLeft();
          if (k != 0) {
            localView.offsetLeftAndRight(k);
          }
        }
      }
    }
    dispatchOnPageScrolled(paramInt1, paramFloat, paramInt2);
    if (this.mPageTransformer != null)
    {
      paramInt2 = getScrollX();
      i = getChildCount();
      for (paramInt1 = i1; paramInt1 < i; paramInt1++)
      {
        localView = getChildAt(paramInt1);
        if (!((LayoutParams)localView.getLayoutParams()).isDecor)
        {
          paramFloat = (localView.getLeft() - paramInt2) / getClientWidth();
          this.mPageTransformer.transformPage(localView, paramFloat);
        }
      }
    }
    this.mCalledSuper = true;
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i = getChildCount();
    int k = -1;
    int j;
    if ((paramInt & 0x2) != 0)
    {
      k = i;
      i = 0;
      j = 1;
    }
    else
    {
      i--;
      j = -1;
    }
    while (i != k)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        ItemInfo localItemInfo = infoForChild(localView);
        if ((localItemInfo != null) && (localItemInfo.position == this.mCurItem) && (localView.requestFocus(paramInt, paramRect))) {
          return true;
        }
      }
      i += j;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    PagerAdapter localPagerAdapter = this.mAdapter;
    if (localPagerAdapter != null)
    {
      localPagerAdapter.restoreState(paramParcelable.adapterState, paramParcelable.loader);
      setCurrentItemInternal(paramParcelable.position, false, true);
    }
    else
    {
      this.mRestoredCurItem = paramParcelable.position;
      this.mRestoredAdapterState = paramParcelable.adapterState;
      this.mRestoredClassLoader = paramParcelable.loader;
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.position = this.mCurItem;
    PagerAdapter localPagerAdapter = this.mAdapter;
    if (localPagerAdapter != null) {
      localSavedState.adapterState = localPagerAdapter.saveState();
    }
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      paramInt2 = this.mPageMargin;
      recomputeScrollPosition(paramInt1, paramInt3, paramInt2, paramInt2);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.mFakeDragging) {
      return true;
    }
    int i = paramMotionEvent.getAction();
    boolean bool = false;
    if ((i == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {
      return false;
    }
    Object localObject = this.mAdapter;
    if ((localObject != null) && (((PagerAdapter)localObject).getCount() != 0))
    {
      if (this.mVelocityTracker == null) {
        this.mVelocityTracker = VelocityTracker.obtain();
      }
      this.mVelocityTracker.addMovement(paramMotionEvent);
      i = paramMotionEvent.getAction() & 0xFF;
      float f1;
      if (i != 0)
      {
        float f2;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 5)
              {
                if (i == 6)
                {
                  onSecondaryPointerUp(paramMotionEvent);
                  this.mLastMotionX = paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.mActivePointerId));
                }
              }
              else
              {
                i = paramMotionEvent.getActionIndex();
                this.mLastMotionX = paramMotionEvent.getX(i);
                this.mActivePointerId = paramMotionEvent.getPointerId(i);
              }
            }
            else if (this.mIsBeingDragged)
            {
              scrollToItem(this.mCurItem, true, 0, false);
              bool = resetTouch();
            }
          }
          else
          {
            if (!this.mIsBeingDragged)
            {
              i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
              if (i == -1)
              {
                bool = resetTouch();
                break label602;
              }
              f1 = paramMotionEvent.getX(i);
              float f3 = Math.abs(f1 - this.mLastMotionX);
              f2 = paramMotionEvent.getY(i);
              float f4 = Math.abs(f2 - this.mLastMotionY);
              if ((f3 > this.mTouchSlop) && (f3 > f4))
              {
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                f3 = this.mInitialMotionX;
                if (f1 - f3 > 0.0F) {
                  f1 = f3 + this.mTouchSlop;
                } else {
                  f1 = f3 - this.mTouchSlop;
                }
                this.mLastMotionX = f1;
                this.mLastMotionY = f2;
                setScrollState(1);
                setScrollingCacheEnabled(true);
                localObject = getParent();
                if (localObject != null) {
                  ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
                }
              }
            }
            if (this.mIsBeingDragged) {
              bool = false | performDrag(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.mActivePointerId)));
            }
          }
        }
        else if (this.mIsBeingDragged)
        {
          localObject = this.mVelocityTracker;
          ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.mMaximumVelocity);
          int j = (int)((VelocityTracker)localObject).getXVelocity(this.mActivePointerId);
          this.mPopulatePending = true;
          int k = getClientWidth();
          i = getScrollX();
          localObject = infoForCurrentScrollPosition();
          f2 = this.mPageMargin;
          f1 = k;
          f2 /= f1;
          setCurrentItemInternal(determineTargetPage(((ItemInfo)localObject).position, (i / f1 - ((ItemInfo)localObject).offset) / (((ItemInfo)localObject).widthFactor + f2), j, (int)(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, j);
          bool = resetTouch();
        }
      }
      else
      {
        this.mScroller.abortAnimation();
        this.mPopulatePending = false;
        populate();
        f1 = paramMotionEvent.getX();
        this.mInitialMotionX = f1;
        this.mLastMotionX = f1;
        f1 = paramMotionEvent.getY();
        this.mInitialMotionY = f1;
        this.mLastMotionY = f1;
        this.mActivePointerId = paramMotionEvent.getPointerId(0);
      }
      label602:
      if (bool) {
        ViewCompat.postInvalidateOnAnimation(this);
      }
      return true;
    }
    return false;
  }
  
  boolean pageLeft()
  {
    int i = this.mCurItem;
    if (i > 0)
    {
      setCurrentItem(i - 1, true);
      return true;
    }
    return false;
  }
  
  boolean pageRight()
  {
    PagerAdapter localPagerAdapter = this.mAdapter;
    if ((localPagerAdapter != null) && (this.mCurItem < localPagerAdapter.getCount() - 1))
    {
      setCurrentItem(this.mCurItem + 1, true);
      return true;
    }
    return false;
  }
  
  void populate()
  {
    populate(this.mCurItem);
  }
  
  void populate(int paramInt)
  {
    int i = this.mCurItem;
    if (i != paramInt)
    {
      localObject2 = infoForPosition(i);
      this.mCurItem = paramInt;
    }
    else
    {
      localObject2 = null;
    }
    if (this.mAdapter == null)
    {
      sortChildDrawingOrder();
      return;
    }
    if (this.mPopulatePending)
    {
      sortChildDrawingOrder();
      return;
    }
    if (getWindowToken() == null) {
      return;
    }
    this.mAdapter.startUpdate(this);
    paramInt = this.mOffscreenPageLimit;
    int i2 = Math.max(0, this.mCurItem - paramInt);
    int n = this.mAdapter.getCount();
    int i1 = Math.min(n - 1, this.mCurItem + paramInt);
    Object localObject1;
    if (n == this.mExpectedAdapterCount)
    {
      for (paramInt = 0; paramInt < this.mItems.size(); paramInt++)
      {
        localObject1 = (ItemInfo)this.mItems.get(paramInt);
        if (((ItemInfo)localObject1).position >= this.mCurItem)
        {
          if (((ItemInfo)localObject1).position != this.mCurItem) {
            break;
          }
          break label183;
        }
      }
      localObject1 = null;
      label183:
      Object localObject3 = localObject1;
      if (localObject1 == null)
      {
        localObject3 = localObject1;
        if (n > 0) {
          localObject3 = addNewItem(this.mCurItem, paramInt);
        }
      }
      if (localObject3 != null)
      {
        i = paramInt - 1;
        if (i >= 0) {
          localObject1 = (ItemInfo)this.mItems.get(i);
        } else {
          localObject1 = null;
        }
        int i3 = getClientWidth();
        float f3;
        if (i3 <= 0) {
          f3 = 0.0F;
        } else {
          f3 = 2.0F - ((ItemInfo)localObject3).widthFactor + getPaddingLeft() / i3;
        }
        int m = this.mCurItem - 1;
        int k;
        Object localObject4;
        float f1;
        for (float f2 = 0.0F; m >= 0; f2 = f1)
        {
          if ((f2 >= f3) && (m < i2))
          {
            if (localObject1 == null) {
              break;
            }
            k = paramInt;
            j = i;
            localObject4 = localObject1;
            f1 = f2;
            if (m != ((ItemInfo)localObject1).position) {
              break label560;
            }
            k = paramInt;
            j = i;
            localObject4 = localObject1;
            f1 = f2;
            if (((ItemInfo)localObject1).scrolling) {
              break label560;
            }
            this.mItems.remove(i);
            this.mAdapter.destroyItem(this, m, ((ItemInfo)localObject1).object);
            i--;
            paramInt--;
            j = paramInt;
            k = i;
            f1 = f2;
            if (i >= 0)
            {
              localObject1 = (ItemInfo)this.mItems.get(i);
              f1 = f2;
              break label549;
            }
          }
          else if ((localObject1 != null) && (m == ((ItemInfo)localObject1).position))
          {
            f2 += ((ItemInfo)localObject1).widthFactor;
            i--;
            j = paramInt;
            k = i;
            f1 = f2;
            if (i >= 0)
            {
              localObject1 = (ItemInfo)this.mItems.get(i);
              f1 = f2;
              break label549;
            }
          }
          else
          {
            f2 += addNewItem(m, i + 1).widthFactor;
            paramInt++;
            j = paramInt;
            k = i;
            f1 = f2;
            if (i >= 0)
            {
              localObject1 = (ItemInfo)this.mItems.get(i);
              f1 = f2;
              break label549;
            }
          }
          localObject1 = null;
          i = k;
          paramInt = j;
          label549:
          localObject4 = localObject1;
          j = i;
          k = paramInt;
          label560:
          m--;
          paramInt = k;
          i = j;
          localObject1 = localObject4;
        }
        f2 = ((ItemInfo)localObject3).widthFactor;
        int j = paramInt + 1;
        if (f2 < 2.0F)
        {
          if (j < this.mItems.size()) {
            localObject1 = (ItemInfo)this.mItems.get(j);
          } else {
            localObject1 = null;
          }
          if (i3 <= 0) {
            f3 = 0.0F;
          } else {
            f3 = getPaddingRight() / i3 + 2.0F;
          }
          i = this.mCurItem;
          localObject4 = localObject1;
          for (;;)
          {
            k = i + 1;
            if (k >= n) {
              break;
            }
            if ((f2 >= f3) && (k > i1))
            {
              if (localObject4 == null) {
                break;
              }
              f1 = f2;
              i = j;
              localObject1 = localObject4;
              if (k != ((ItemInfo)localObject4).position) {
                break label933;
              }
              f1 = f2;
              i = j;
              localObject1 = localObject4;
              if (((ItemInfo)localObject4).scrolling) {
                break label933;
              }
              this.mItems.remove(j);
              this.mAdapter.destroyItem(this, k, ((ItemInfo)localObject4).object);
              f1 = f2;
              i = j;
              if (j < this.mItems.size())
              {
                localObject1 = (ItemInfo)this.mItems.get(j);
                f1 = f2;
                i = j;
                break label933;
              }
            }
            do
            {
              do
              {
                localObject1 = null;
                break label933;
                if ((localObject4 == null) || (k != ((ItemInfo)localObject4).position)) {
                  break;
                }
                f2 += ((ItemInfo)localObject4).widthFactor;
                j++;
                f1 = f2;
                i = j;
              } while (j >= this.mItems.size());
              localObject1 = (ItemInfo)this.mItems.get(j);
              f1 = f2;
              i = j;
              break;
              localObject1 = addNewItem(k, j);
              j++;
              f2 += ((ItemInfo)localObject1).widthFactor;
              f1 = f2;
              i = j;
            } while (j >= this.mItems.size());
            localObject1 = (ItemInfo)this.mItems.get(j);
            i = j;
            f1 = f2;
            label933:
            f2 = f1;
            j = i;
            localObject4 = localObject1;
            i = k;
          }
        }
        calculatePageOffsets((ItemInfo)localObject3, paramInt, (ItemInfo)localObject2);
        this.mAdapter.setPrimaryItem(this, this.mCurItem, ((ItemInfo)localObject3).object);
      }
      this.mAdapter.finishUpdate(this);
      i = getChildCount();
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        localObject2 = getChildAt(paramInt);
        localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
        ((LayoutParams)localObject1).childIndex = paramInt;
        if ((!((LayoutParams)localObject1).isDecor) && (((LayoutParams)localObject1).widthFactor == 0.0F))
        {
          localObject2 = infoForChild((View)localObject2);
          if (localObject2 != null)
          {
            ((LayoutParams)localObject1).widthFactor = ((ItemInfo)localObject2).widthFactor;
            ((LayoutParams)localObject1).position = ((ItemInfo)localObject2).position;
          }
        }
      }
      sortChildDrawingOrder();
      if (hasFocus())
      {
        localObject1 = findFocus();
        if (localObject1 != null) {
          localObject1 = infoForAnyChild((View)localObject1);
        } else {
          localObject1 = null;
        }
        if ((localObject1 == null) || (((ItemInfo)localObject1).position != this.mCurItem)) {
          for (paramInt = 0; paramInt < getChildCount(); paramInt++)
          {
            localObject2 = getChildAt(paramInt);
            localObject1 = infoForChild((View)localObject2);
            if ((localObject1 != null) && (((ItemInfo)localObject1).position == this.mCurItem) && (((View)localObject2).requestFocus(2))) {
              break;
            }
          }
        }
      }
      return;
    }
    String str;
    try
    {
      localObject1 = getResources().getResourceName(getId());
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      str = Integer.toHexString(getId());
    }
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
    ((StringBuilder)localObject2).append(this.mExpectedAdapterCount);
    ((StringBuilder)localObject2).append(", found: ");
    ((StringBuilder)localObject2).append(n);
    ((StringBuilder)localObject2).append(" Pager id: ");
    ((StringBuilder)localObject2).append(str);
    ((StringBuilder)localObject2).append(" Pager class: ");
    ((StringBuilder)localObject2).append(getClass());
    ((StringBuilder)localObject2).append(" Problematic adapter: ");
    ((StringBuilder)localObject2).append(this.mAdapter.getClass());
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public void removeOnAdapterChangeListener(OnAdapterChangeListener paramOnAdapterChangeListener)
  {
    List localList = this.mAdapterChangeListeners;
    if (localList != null) {
      localList.remove(paramOnAdapterChangeListener);
    }
  }
  
  public void removeOnPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    List localList = this.mOnPageChangeListeners;
    if (localList != null) {
      localList.remove(paramOnPageChangeListener);
    }
  }
  
  public void removeView(View paramView)
  {
    if (this.mInLayout) {
      removeViewInLayout(paramView);
    } else {
      super.removeView(paramView);
    }
  }
  
  public void setAdapter(PagerAdapter paramPagerAdapter)
  {
    Object localObject = this.mAdapter;
    int j = 0;
    int i;
    if (localObject != null)
    {
      ((PagerAdapter)localObject).setViewPagerObserver(null);
      this.mAdapter.startUpdate(this);
      for (i = 0; i < this.mItems.size(); i++)
      {
        localObject = (ItemInfo)this.mItems.get(i);
        this.mAdapter.destroyItem(this, ((ItemInfo)localObject).position, ((ItemInfo)localObject).object);
      }
      this.mAdapter.finishUpdate(this);
      this.mItems.clear();
      removeNonDecorViews();
      this.mCurItem = 0;
      scrollTo(0, 0);
    }
    PagerAdapter localPagerAdapter = this.mAdapter;
    this.mAdapter = paramPagerAdapter;
    this.mExpectedAdapterCount = 0;
    if (paramPagerAdapter != null)
    {
      if (this.mObserver == null) {
        this.mObserver = new PagerObserver();
      }
      this.mAdapter.setViewPagerObserver(this.mObserver);
      this.mPopulatePending = false;
      boolean bool = this.mFirstLayout;
      this.mFirstLayout = true;
      this.mExpectedAdapterCount = this.mAdapter.getCount();
      if (this.mRestoredCurItem >= 0)
      {
        this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
        setCurrentItemInternal(this.mRestoredCurItem, false, true);
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
      }
      else if (!bool)
      {
        populate();
      }
      else
      {
        requestLayout();
      }
    }
    localObject = this.mAdapterChangeListeners;
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      int k = this.mAdapterChangeListeners.size();
      for (i = j; i < k; i++) {
        ((OnAdapterChangeListener)this.mAdapterChangeListeners.get(i)).onAdapterChanged(this, localPagerAdapter, paramPagerAdapter);
      }
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    this.mPopulatePending = false;
    setCurrentItemInternal(paramInt, this.mFirstLayout ^ true, false);
  }
  
  public void setCurrentItem(int paramInt, boolean paramBoolean)
  {
    this.mPopulatePending = false;
    setCurrentItemInternal(paramInt, paramBoolean, false);
  }
  
  void setCurrentItemInternal(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    setCurrentItemInternal(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  void setCurrentItemInternal(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    PagerAdapter localPagerAdapter = this.mAdapter;
    boolean bool = false;
    if ((localPagerAdapter != null) && (localPagerAdapter.getCount() > 0))
    {
      if ((!paramBoolean2) && (this.mCurItem == paramInt1) && (this.mItems.size() != 0))
      {
        setScrollingCacheEnabled(false);
        return;
      }
      int i;
      if (paramInt1 < 0)
      {
        i = 0;
      }
      else
      {
        i = paramInt1;
        if (paramInt1 >= this.mAdapter.getCount()) {
          i = this.mAdapter.getCount() - 1;
        }
      }
      int j = this.mOffscreenPageLimit;
      paramInt1 = this.mCurItem;
      if ((i > paramInt1 + j) || (i < paramInt1 - j)) {
        for (paramInt1 = 0; paramInt1 < this.mItems.size(); paramInt1++) {
          ((ItemInfo)this.mItems.get(paramInt1)).scrolling = true;
        }
      }
      paramBoolean2 = bool;
      if (this.mCurItem != i) {
        paramBoolean2 = true;
      }
      if (this.mFirstLayout)
      {
        this.mCurItem = i;
        if (paramBoolean2) {
          dispatchOnPageSelected(i);
        }
        requestLayout();
      }
      else
      {
        populate(i);
        scrollToItem(i, paramBoolean1, paramInt2, paramBoolean2);
      }
      return;
    }
    setScrollingCacheEnabled(false);
  }
  
  OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    OnPageChangeListener localOnPageChangeListener = this.mInternalPageChangeListener;
    this.mInternalPageChangeListener = paramOnPageChangeListener;
    return localOnPageChangeListener;
  }
  
  public void setOffscreenPageLimit(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 1)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Requested offscreen page limit ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" too small; defaulting to ");
      localStringBuilder.append(1);
      Log.w("ViewPager", localStringBuilder.toString());
      i = 1;
    }
    if (i != this.mOffscreenPageLimit)
    {
      this.mOffscreenPageLimit = i;
      populate();
    }
  }
  
  @Deprecated
  public void setOnPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    this.mOnPageChangeListener = paramOnPageChangeListener;
  }
  
  public void setPageMargin(int paramInt)
  {
    int j = this.mPageMargin;
    this.mPageMargin = paramInt;
    int i = getWidth();
    recomputeScrollPosition(i, i, paramInt, j);
    requestLayout();
  }
  
  public void setPageMarginDrawable(int paramInt)
  {
    setPageMarginDrawable(ContextCompat.getDrawable(getContext(), paramInt));
  }
  
  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    this.mMarginDrawable = paramDrawable;
    if (paramDrawable != null) {
      refreshDrawableState();
    }
    boolean bool;
    if (paramDrawable == null) {
      bool = true;
    } else {
      bool = false;
    }
    setWillNotDraw(bool);
    invalidate();
  }
  
  public void setPageTransformer(boolean paramBoolean, PageTransformer paramPageTransformer)
  {
    setPageTransformer(paramBoolean, paramPageTransformer, 2);
  }
  
  public void setPageTransformer(boolean paramBoolean, PageTransformer paramPageTransformer, int paramInt)
  {
    int j = 1;
    boolean bool1;
    if (paramPageTransformer != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2;
    if (this.mPageTransformer != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    int i;
    if (bool1 != bool2) {
      i = 1;
    } else {
      i = 0;
    }
    this.mPageTransformer = paramPageTransformer;
    setChildrenDrawingOrderEnabled(bool1);
    if (bool1)
    {
      if (paramBoolean) {
        j = 2;
      }
      this.mDrawingOrder = j;
      this.mPageTransformerLayerType = paramInt;
    }
    else
    {
      this.mDrawingOrder = 0;
    }
    if (i != 0) {
      populate();
    }
  }
  
  void setScrollState(int paramInt)
  {
    if (this.mScrollState == paramInt) {
      return;
    }
    this.mScrollState = paramInt;
    if (this.mPageTransformer != null)
    {
      boolean bool;
      if (paramInt != 0) {
        bool = true;
      } else {
        bool = false;
      }
      enableLayers(bool);
    }
    dispatchOnScrollStateChanged(paramInt);
  }
  
  void smoothScrollTo(int paramInt1, int paramInt2)
  {
    smoothScrollTo(paramInt1, paramInt2, 0);
  }
  
  void smoothScrollTo(int paramInt1, int paramInt2, int paramInt3)
  {
    if (getChildCount() == 0)
    {
      setScrollingCacheEnabled(false);
      return;
    }
    Scroller localScroller = this.mScroller;
    int i;
    if ((localScroller != null) && (!localScroller.isFinished())) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (this.mIsScrollStarted) {
        i = this.mScroller.getCurrX();
      } else {
        i = this.mScroller.getStartX();
      }
      this.mScroller.abortAnimation();
      setScrollingCacheEnabled(false);
    }
    else
    {
      i = getScrollX();
    }
    int j = getScrollY();
    int k = paramInt1 - i;
    paramInt2 -= j;
    if ((k == 0) && (paramInt2 == 0))
    {
      completeScroll(false);
      populate();
      setScrollState(0);
      return;
    }
    setScrollingCacheEnabled(true);
    setScrollState(2);
    paramInt1 = getClientWidth();
    int m = paramInt1 / 2;
    float f2 = Math.abs(k);
    float f1 = paramInt1;
    float f3 = Math.min(1.0F, f2 * 1.0F / f1);
    f2 = m;
    f3 = distanceInfluenceForSnapDuration(f3);
    paramInt1 = Math.abs(paramInt3);
    if (paramInt1 > 0)
    {
      paramInt1 = Math.round(Math.abs((f2 + f3 * f2) / paramInt1) * 1000.0F) * 4;
    }
    else
    {
      f2 = this.mAdapter.getPageWidth(this.mCurItem);
      paramInt1 = (int)((Math.abs(k) / (f1 * f2 + this.mPageMargin) + 1.0F) * 100.0F);
    }
    paramInt1 = Math.min(paramInt1, 600);
    this.mIsScrollStarted = false;
    this.mScroller.startScroll(i, j, k, paramInt2, paramInt1);
    ViewCompat.postInvalidateOnAnimation(this);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if ((!super.verifyDrawable(paramDrawable)) && (paramDrawable != this.mMarginDrawable)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface DecorView {}
  
  static class ItemInfo
  {
    Object object;
    float offset;
    int position;
    boolean scrolling;
    float widthFactor;
  }
  
  public static class LayoutParams
    extends ViewGroup.LayoutParams
  {
    int childIndex;
    public int gravity;
    public boolean isDecor;
    boolean needsMeasure;
    int position;
    float widthFactor = 0.0F;
    
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ViewPager.LAYOUT_ATTRS);
      this.gravity = paramContext.getInteger(0, 48);
      paramContext.recycle();
    }
  }
  
  class MyAccessibilityDelegate
    extends AccessibilityDelegateCompat
  {
    MyAccessibilityDelegate() {}
    
    private boolean canScroll()
    {
      PagerAdapter localPagerAdapter = ViewPager.this.mAdapter;
      boolean bool = true;
      if ((localPagerAdapter == null) || (ViewPager.this.mAdapter.getCount() <= 1)) {
        bool = false;
      }
      return bool;
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ViewPager.class.getName());
      paramAccessibilityEvent.setScrollable(canScroll());
      if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.this.mAdapter != null))
      {
        paramAccessibilityEvent.setItemCount(ViewPager.this.mAdapter.getCount());
        paramAccessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
        paramAccessibilityEvent.setToIndex(ViewPager.this.mCurItem);
      }
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
      paramAccessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
      paramAccessibilityNodeInfoCompat.setScrollable(canScroll());
      if (ViewPager.this.canScrollHorizontally(1)) {
        paramAccessibilityNodeInfoCompat.addAction(4096);
      }
      if (ViewPager.this.canScrollHorizontally(-1)) {
        paramAccessibilityNodeInfoCompat.addAction(8192);
      }
    }
    
    public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
        return true;
      }
      if (paramInt != 4096)
      {
        if (paramInt != 8192) {
          return false;
        }
        if (ViewPager.this.canScrollHorizontally(-1))
        {
          paramView = ViewPager.this;
          paramView.setCurrentItem(paramView.mCurItem - 1);
          return true;
        }
        return false;
      }
      if (ViewPager.this.canScrollHorizontally(1))
      {
        paramView = ViewPager.this;
        paramView.setCurrentItem(paramView.mCurItem + 1);
        return true;
      }
      return false;
    }
  }
  
  public static abstract interface OnAdapterChangeListener
  {
    public abstract void onAdapterChanged(ViewPager paramViewPager, PagerAdapter paramPagerAdapter1, PagerAdapter paramPagerAdapter2);
  }
  
  public static abstract interface OnPageChangeListener
  {
    public abstract void onPageScrollStateChanged(int paramInt);
    
    public abstract void onPageScrolled(int paramInt1, float paramFloat, int paramInt2);
    
    public abstract void onPageSelected(int paramInt);
  }
  
  public static abstract interface PageTransformer
  {
    public abstract void transformPage(View paramView, float paramFloat);
  }
  
  private class PagerObserver
    extends DataSetObserver
  {
    PagerObserver() {}
    
    public void onChanged()
    {
      ViewPager.this.dataSetChanged();
    }
    
    public void onInvalidated()
    {
      ViewPager.this.dataSetChanged();
    }
  }
  
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public ViewPager.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new ViewPager.SavedState(paramAnonymousParcel, null);
      }
      
      public ViewPager.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new ViewPager.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public ViewPager.SavedState[] newArray(int paramAnonymousInt)
      {
        return new ViewPager.SavedState[paramAnonymousInt];
      }
    };
    Parcelable adapterState;
    ClassLoader loader;
    int position;
    
    SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      ClassLoader localClassLoader = paramClassLoader;
      if (paramClassLoader == null) {
        localClassLoader = getClass().getClassLoader();
      }
      this.position = paramParcel.readInt();
      this.adapterState = paramParcel.readParcelable(localClassLoader);
      this.loader = localClassLoader;
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("FragmentPager.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" position=");
      localStringBuilder.append(this.position);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.position);
      paramParcel.writeParcelable(this.adapterState, paramInt);
    }
  }
  
  public static class SimpleOnPageChangeListener
    implements ViewPager.OnPageChangeListener
  {
    public void onPageScrollStateChanged(int paramInt) {}
    
    public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
    
    public void onPageSelected(int paramInt) {}
  }
  
  static class ViewPositionComparator
    implements Comparator<View>
  {
    public int compare(View paramView1, View paramView2)
    {
      paramView1 = (ViewPager.LayoutParams)paramView1.getLayoutParams();
      paramView2 = (ViewPager.LayoutParams)paramView2.getLayoutParams();
      if (paramView1.isDecor != paramView2.isDecor)
      {
        int i;
        if (paramView1.isDecor) {
          i = 1;
        } else {
          i = -1;
        }
        return i;
      }
      return paramView1.position - paramView2.position;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\viewpager\widget\ViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */