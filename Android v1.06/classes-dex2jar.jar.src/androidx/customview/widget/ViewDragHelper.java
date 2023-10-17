package androidx.customview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

public class ViewDragHelper
{
  private static final int BASE_SETTLE_DURATION = 256;
  public static final int DIRECTION_ALL = 3;
  public static final int DIRECTION_HORIZONTAL = 1;
  public static final int DIRECTION_VERTICAL = 2;
  public static final int EDGE_ALL = 15;
  public static final int EDGE_BOTTOM = 8;
  public static final int EDGE_LEFT = 1;
  public static final int EDGE_RIGHT = 2;
  private static final int EDGE_SIZE = 20;
  public static final int EDGE_TOP = 4;
  public static final int INVALID_POINTER = -1;
  private static final int MAX_SETTLE_DURATION = 600;
  public static final int STATE_DRAGGING = 1;
  public static final int STATE_IDLE = 0;
  public static final int STATE_SETTLING = 2;
  private static final String TAG = "ViewDragHelper";
  private static final Interpolator sInterpolator = new Interpolator()
  {
    public float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat + 1.0F;
    }
  };
  private int mActivePointerId = -1;
  private final Callback mCallback;
  private View mCapturedView;
  private int mDragState;
  private int[] mEdgeDragsInProgress;
  private int[] mEdgeDragsLocked;
  private int mEdgeSize;
  private int[] mInitialEdgesTouched;
  private float[] mInitialMotionX;
  private float[] mInitialMotionY;
  private float[] mLastMotionX;
  private float[] mLastMotionY;
  private float mMaxVelocity;
  private float mMinVelocity;
  private final ViewGroup mParentView;
  private int mPointersDown;
  private boolean mReleaseInProgress;
  private OverScroller mScroller;
  private final Runnable mSetIdleRunnable = new Runnable()
  {
    public void run()
    {
      ViewDragHelper.this.setDragState(0);
    }
  };
  private int mTouchSlop;
  private int mTrackingEdges;
  private VelocityTracker mVelocityTracker;
  
  private ViewDragHelper(Context paramContext, ViewGroup paramViewGroup, Callback paramCallback)
  {
    if (paramViewGroup != null)
    {
      if (paramCallback != null)
      {
        this.mParentView = paramViewGroup;
        this.mCallback = paramCallback;
        paramViewGroup = ViewConfiguration.get(paramContext);
        this.mEdgeSize = ((int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F));
        this.mTouchSlop = paramViewGroup.getScaledTouchSlop();
        this.mMaxVelocity = paramViewGroup.getScaledMaximumFlingVelocity();
        this.mMinVelocity = paramViewGroup.getScaledMinimumFlingVelocity();
        this.mScroller = new OverScroller(paramContext, sInterpolator);
        return;
      }
      throw new IllegalArgumentException("Callback may not be null");
    }
    throw new IllegalArgumentException("Parent view may not be null");
  }
  
  private boolean checkNewEdgeDrag(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    int i = this.mInitialEdgesTouched[paramInt1];
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((i & paramInt2) == paramInt2)
    {
      bool1 = bool2;
      if ((this.mTrackingEdges & paramInt2) != 0)
      {
        bool1 = bool2;
        if ((this.mEdgeDragsLocked[paramInt1] & paramInt2) != paramInt2)
        {
          bool1 = bool2;
          if ((this.mEdgeDragsInProgress[paramInt1] & paramInt2) != paramInt2)
          {
            i = this.mTouchSlop;
            if ((paramFloat1 <= i) && (paramFloat2 <= i))
            {
              bool1 = bool2;
            }
            else
            {
              if ((paramFloat1 < paramFloat2 * 0.5F) && (this.mCallback.onEdgeLock(paramInt2)))
              {
                int[] arrayOfInt = this.mEdgeDragsLocked;
                arrayOfInt[paramInt1] |= paramInt2;
                return false;
              }
              bool1 = bool2;
              if ((this.mEdgeDragsInProgress[paramInt1] & paramInt2) == 0)
              {
                bool1 = bool2;
                if (paramFloat1 > this.mTouchSlop) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  private boolean checkTouchSlop(View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramView == null) {
      return false;
    }
    int i;
    if (this.mCallback.getViewHorizontalDragRange(paramView) > 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (this.mCallback.getViewVerticalDragRange(paramView) > 0) {
      j = 1;
    } else {
      j = 0;
    }
    if ((i != 0) && (j != 0))
    {
      i = this.mTouchSlop;
      bool1 = bool3;
      if (paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2 > i * i) {
        bool1 = true;
      }
      return bool1;
    }
    if (i != 0)
    {
      if (Math.abs(paramFloat1) > this.mTouchSlop) {
        bool1 = true;
      }
      return bool1;
    }
    bool1 = bool2;
    if (j != 0)
    {
      bool1 = bool2;
      if (Math.abs(paramFloat2) > this.mTouchSlop) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private float clampMag(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2) {
      return 0.0F;
    }
    if (f > paramFloat3)
    {
      if (paramFloat1 <= 0.0F) {
        paramFloat3 = -paramFloat3;
      }
      return paramFloat3;
    }
    return paramFloat1;
  }
  
  private int clampMag(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt1);
    if (i < paramInt2) {
      return 0;
    }
    if (i > paramInt3)
    {
      if (paramInt1 <= 0) {
        paramInt3 = -paramInt3;
      }
      return paramInt3;
    }
    return paramInt1;
  }
  
  private void clearMotionHistory()
  {
    float[] arrayOfFloat = this.mInitialMotionX;
    if (arrayOfFloat == null) {
      return;
    }
    Arrays.fill(arrayOfFloat, 0.0F);
    Arrays.fill(this.mInitialMotionY, 0.0F);
    Arrays.fill(this.mLastMotionX, 0.0F);
    Arrays.fill(this.mLastMotionY, 0.0F);
    Arrays.fill(this.mInitialEdgesTouched, 0);
    Arrays.fill(this.mEdgeDragsInProgress, 0);
    Arrays.fill(this.mEdgeDragsLocked, 0);
    this.mPointersDown = 0;
  }
  
  private void clearMotionHistory(int paramInt)
  {
    if ((this.mInitialMotionX != null) && (isPointerDown(paramInt)))
    {
      this.mInitialMotionX[paramInt] = 0.0F;
      this.mInitialMotionY[paramInt] = 0.0F;
      this.mLastMotionX[paramInt] = 0.0F;
      this.mLastMotionY[paramInt] = 0.0F;
      this.mInitialEdgesTouched[paramInt] = 0;
      this.mEdgeDragsInProgress[paramInt] = 0;
      this.mEdgeDragsLocked[paramInt] = 0;
      this.mPointersDown = ((1 << paramInt ^ 0xFFFFFFFF) & this.mPointersDown);
    }
  }
  
  private int computeAxisDuration(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return 0;
    }
    int j = this.mParentView.getWidth();
    int i = j / 2;
    float f2 = Math.min(1.0F, Math.abs(paramInt1) / j);
    float f1 = i;
    f2 = distanceInfluenceForSnapDuration(f2);
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {
      paramInt1 = Math.round(Math.abs((f1 + f2 * f1) / paramInt2) * 1000.0F) * 4;
    } else {
      paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F);
    }
    return Math.min(paramInt1, 600);
  }
  
  private int computeSettleDuration(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = clampMag(paramInt3, (int)this.mMinVelocity, (int)this.mMaxVelocity);
    paramInt3 = clampMag(paramInt4, (int)this.mMinVelocity, (int)this.mMaxVelocity);
    int k = Math.abs(paramInt1);
    int n = Math.abs(paramInt2);
    int j = Math.abs(i);
    int m = Math.abs(paramInt3);
    paramInt4 = j + m;
    int i1 = k + n;
    float f2;
    float f1;
    if (i != 0)
    {
      f2 = j;
      f1 = paramInt4;
    }
    else
    {
      f2 = k;
      f1 = i1;
    }
    float f3 = f2 / f1;
    if (paramInt3 != 0)
    {
      f1 = m;
      f2 = paramInt4;
    }
    else
    {
      f1 = n;
      f2 = i1;
    }
    f1 /= f2;
    paramInt1 = computeAxisDuration(paramInt1, i, this.mCallback.getViewHorizontalDragRange(paramView));
    paramInt2 = computeAxisDuration(paramInt2, paramInt3, this.mCallback.getViewVerticalDragRange(paramView));
    return (int)(paramInt1 * f3 + paramInt2 * f1);
  }
  
  public static ViewDragHelper create(ViewGroup paramViewGroup, float paramFloat, Callback paramCallback)
  {
    paramViewGroup = create(paramViewGroup, paramCallback);
    paramViewGroup.mTouchSlop = ((int)(paramViewGroup.mTouchSlop * (1.0F / paramFloat)));
    return paramViewGroup;
  }
  
  public static ViewDragHelper create(ViewGroup paramViewGroup, Callback paramCallback)
  {
    return new ViewDragHelper(paramViewGroup.getContext(), paramViewGroup, paramCallback);
  }
  
  private void dispatchViewReleased(float paramFloat1, float paramFloat2)
  {
    this.mReleaseInProgress = true;
    this.mCallback.onViewReleased(this.mCapturedView, paramFloat1, paramFloat2);
    this.mReleaseInProgress = false;
    if (this.mDragState == 1) {
      setDragState(0);
    }
  }
  
  private float distanceInfluenceForSnapDuration(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.47123894F);
  }
  
  private void dragTo(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = this.mCapturedView.getLeft();
    int k = this.mCapturedView.getTop();
    int i = paramInt1;
    if (paramInt3 != 0)
    {
      i = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, paramInt1, paramInt3);
      ViewCompat.offsetLeftAndRight(this.mCapturedView, i - j);
    }
    paramInt1 = paramInt2;
    if (paramInt4 != 0)
    {
      paramInt1 = this.mCallback.clampViewPositionVertical(this.mCapturedView, paramInt2, paramInt4);
      ViewCompat.offsetTopAndBottom(this.mCapturedView, paramInt1 - k);
    }
    if ((paramInt3 != 0) || (paramInt4 != 0)) {
      this.mCallback.onViewPositionChanged(this.mCapturedView, i, paramInt1, i - j, paramInt1 - k);
    }
  }
  
  private void ensureMotionHistorySizeForId(int paramInt)
  {
    Object localObject = this.mInitialMotionX;
    if ((localObject == null) || (localObject.length <= paramInt))
    {
      paramInt++;
      float[] arrayOfFloat1 = new float[paramInt];
      float[] arrayOfFloat2 = new float[paramInt];
      float[] arrayOfFloat3 = new float[paramInt];
      float[] arrayOfFloat4 = new float[paramInt];
      int[] arrayOfInt1 = new int[paramInt];
      int[] arrayOfInt2 = new int[paramInt];
      int[] arrayOfInt3 = new int[paramInt];
      if (localObject != null)
      {
        System.arraycopy(localObject, 0, arrayOfFloat1, 0, localObject.length);
        localObject = this.mInitialMotionY;
        System.arraycopy(localObject, 0, arrayOfFloat2, 0, localObject.length);
        localObject = this.mLastMotionX;
        System.arraycopy(localObject, 0, arrayOfFloat3, 0, localObject.length);
        localObject = this.mLastMotionY;
        System.arraycopy(localObject, 0, arrayOfFloat4, 0, localObject.length);
        localObject = this.mInitialEdgesTouched;
        System.arraycopy(localObject, 0, arrayOfInt1, 0, localObject.length);
        localObject = this.mEdgeDragsInProgress;
        System.arraycopy(localObject, 0, arrayOfInt2, 0, localObject.length);
        localObject = this.mEdgeDragsLocked;
        System.arraycopy(localObject, 0, arrayOfInt3, 0, localObject.length);
      }
      this.mInitialMotionX = arrayOfFloat1;
      this.mInitialMotionY = arrayOfFloat2;
      this.mLastMotionX = arrayOfFloat3;
      this.mLastMotionY = arrayOfFloat4;
      this.mInitialEdgesTouched = arrayOfInt1;
      this.mEdgeDragsInProgress = arrayOfInt2;
      this.mEdgeDragsLocked = arrayOfInt3;
    }
  }
  
  private boolean forceSettleCapturedViewAt(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = this.mCapturedView.getLeft();
    int i = this.mCapturedView.getTop();
    paramInt1 -= j;
    paramInt2 -= i;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.mScroller.abortAnimation();
      setDragState(0);
      return false;
    }
    paramInt3 = computeSettleDuration(this.mCapturedView, paramInt1, paramInt2, paramInt3, paramInt4);
    this.mScroller.startScroll(j, i, paramInt1, paramInt2, paramInt3);
    setDragState(2);
    return true;
  }
  
  private int getEdgesTouched(int paramInt1, int paramInt2)
  {
    if (paramInt1 < this.mParentView.getLeft() + this.mEdgeSize) {
      i = 1;
    } else {
      i = 0;
    }
    int j = i;
    if (paramInt2 < this.mParentView.getTop() + this.mEdgeSize) {
      j = i | 0x4;
    }
    int i = j;
    if (paramInt1 > this.mParentView.getRight() - this.mEdgeSize) {
      i = j | 0x2;
    }
    paramInt1 = i;
    if (paramInt2 > this.mParentView.getBottom() - this.mEdgeSize) {
      paramInt1 = i | 0x8;
    }
    return paramInt1;
  }
  
  private boolean isValidPointerForActionMove(int paramInt)
  {
    if (!isPointerDown(paramInt))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Ignoring pointerId=");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" because ACTION_DOWN was not received ");
      localStringBuilder.append("for this pointer before ACTION_MOVE. It likely happened because ");
      localStringBuilder.append(" ViewDragHelper did not receive all the events in the event stream.");
      Log.e("ViewDragHelper", localStringBuilder.toString());
      return false;
    }
    return true;
  }
  
  private void releaseViewForPointerUp()
  {
    this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
    dispatchViewReleased(clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
  }
  
  private void reportNewEdgeDrags(float paramFloat1, float paramFloat2, int paramInt)
  {
    boolean bool1 = checkNewEdgeDrag(paramFloat1, paramFloat2, paramInt, 1);
    boolean bool2 = bool1;
    if (checkNewEdgeDrag(paramFloat2, paramFloat1, paramInt, 4)) {
      j = bool1 | true;
    }
    bool1 = j;
    int i;
    if (checkNewEdgeDrag(paramFloat1, paramFloat2, paramInt, 2)) {
      i = j | 0x2;
    }
    int j = i;
    if (checkNewEdgeDrag(paramFloat2, paramFloat1, paramInt, 8)) {
      j = i | 0x8;
    }
    if (j != 0)
    {
      int[] arrayOfInt = this.mEdgeDragsInProgress;
      arrayOfInt[paramInt] |= j;
      this.mCallback.onEdgeDragStarted(j, paramInt);
    }
  }
  
  private void saveInitialMotion(float paramFloat1, float paramFloat2, int paramInt)
  {
    ensureMotionHistorySizeForId(paramInt);
    float[] arrayOfFloat = this.mInitialMotionX;
    this.mLastMotionX[paramInt] = paramFloat1;
    arrayOfFloat[paramInt] = paramFloat1;
    arrayOfFloat = this.mInitialMotionY;
    this.mLastMotionY[paramInt] = paramFloat2;
    arrayOfFloat[paramInt] = paramFloat2;
    this.mInitialEdgesTouched[paramInt] = getEdgesTouched((int)paramFloat1, (int)paramFloat2);
    this.mPointersDown |= 1 << paramInt;
  }
  
  private void saveLastMotion(MotionEvent paramMotionEvent)
  {
    int j = paramMotionEvent.getPointerCount();
    for (int i = 0; i < j; i++)
    {
      int k = paramMotionEvent.getPointerId(i);
      if (isValidPointerForActionMove(k))
      {
        float f1 = paramMotionEvent.getX(i);
        float f2 = paramMotionEvent.getY(i);
        this.mLastMotionX[k] = f1;
        this.mLastMotionY[k] = f2;
      }
    }
  }
  
  public void abort()
  {
    cancel();
    if (this.mDragState == 2)
    {
      int i = this.mScroller.getCurrX();
      int m = this.mScroller.getCurrY();
      this.mScroller.abortAnimation();
      int k = this.mScroller.getCurrX();
      int j = this.mScroller.getCurrY();
      this.mCallback.onViewPositionChanged(this.mCapturedView, k, j, k - i, j - m);
    }
    setDragState(0);
  }
  
  protected boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool2 = paramView instanceof ViewGroup;
    boolean bool1 = true;
    if (bool2)
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int j = paramView.getScrollX();
      int k = paramView.getScrollY();
      for (int i = localViewGroup.getChildCount() - 1; i >= 0; i--)
      {
        View localView = localViewGroup.getChildAt(i);
        int m = paramInt3 + j;
        if ((m >= localView.getLeft()) && (m < localView.getRight()))
        {
          int n = paramInt4 + k;
          if ((n >= localView.getTop()) && (n < localView.getBottom()) && (canScroll(localView, true, paramInt1, paramInt2, m - localView.getLeft(), n - localView.getTop()))) {
            return true;
          }
        }
      }
    }
    if (paramBoolean)
    {
      paramBoolean = bool1;
      if (paramView.canScrollHorizontally(-paramInt1)) {
        return paramBoolean;
      }
      if (paramView.canScrollVertically(-paramInt2)) {
        return bool1;
      }
    }
    paramBoolean = false;
    return paramBoolean;
  }
  
  public void cancel()
  {
    this.mActivePointerId = -1;
    clearMotionHistory();
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }
  
  public void captureChildView(View paramView, int paramInt)
  {
    if (paramView.getParent() == this.mParentView)
    {
      this.mCapturedView = paramView;
      this.mActivePointerId = paramInt;
      this.mCallback.onViewCaptured(paramView, paramInt);
      setDragState(1);
      return;
    }
    paramView = new StringBuilder();
    paramView.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    paramView.append(this.mParentView);
    paramView.append(")");
    throw new IllegalArgumentException(paramView.toString());
  }
  
  public boolean checkTouchSlop(int paramInt)
  {
    int j = this.mInitialMotionX.length;
    for (int i = 0; i < j; i++) {
      if (checkTouchSlop(paramInt, i)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean checkTouchSlop(int paramInt1, int paramInt2)
  {
    boolean bool4 = isPointerDown(paramInt2);
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool1 = false;
    if (!bool4) {
      return false;
    }
    int i;
    if ((paramInt1 & 0x1) == 1) {
      i = 1;
    } else {
      i = 0;
    }
    if ((paramInt1 & 0x2) == 2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    float f1 = this.mLastMotionX[paramInt2] - this.mInitialMotionX[paramInt2];
    float f2 = this.mLastMotionY[paramInt2] - this.mInitialMotionY[paramInt2];
    if ((i != 0) && (paramInt1 != 0))
    {
      paramInt1 = this.mTouchSlop;
      if (f1 * f1 + f2 * f2 > paramInt1 * paramInt1) {
        bool1 = true;
      }
      return bool1;
    }
    if (i != 0)
    {
      bool1 = bool3;
      if (Math.abs(f1) > this.mTouchSlop) {
        bool1 = true;
      }
      return bool1;
    }
    bool1 = bool2;
    if (paramInt1 != 0)
    {
      bool1 = bool2;
      if (Math.abs(f2) > this.mTouchSlop) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public boolean continueSettling(boolean paramBoolean)
  {
    int i = this.mDragState;
    boolean bool2 = false;
    if (i == 2)
    {
      boolean bool3 = this.mScroller.computeScrollOffset();
      i = this.mScroller.getCurrX();
      int k = this.mScroller.getCurrY();
      int m = i - this.mCapturedView.getLeft();
      int j = k - this.mCapturedView.getTop();
      if (m != 0) {
        ViewCompat.offsetLeftAndRight(this.mCapturedView, m);
      }
      if (j != 0) {
        ViewCompat.offsetTopAndBottom(this.mCapturedView, j);
      }
      if ((m != 0) || (j != 0)) {
        this.mCallback.onViewPositionChanged(this.mCapturedView, i, k, m, j);
      }
      boolean bool1 = bool3;
      if (bool3)
      {
        bool1 = bool3;
        if (i == this.mScroller.getFinalX())
        {
          bool1 = bool3;
          if (k == this.mScroller.getFinalY())
          {
            this.mScroller.abortAnimation();
            bool1 = false;
          }
        }
      }
      if (!bool1) {
        if (paramBoolean) {
          this.mParentView.post(this.mSetIdleRunnable);
        } else {
          setDragState(0);
        }
      }
    }
    paramBoolean = bool2;
    if (this.mDragState == 2) {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public View findTopChildUnder(int paramInt1, int paramInt2)
  {
    for (int i = this.mParentView.getChildCount() - 1; i >= 0; i--)
    {
      View localView = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(i));
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom())) {
        return localView;
      }
    }
    return null;
  }
  
  public void flingCapturedView(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.mReleaseInProgress)
    {
      this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int)this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int)this.mVelocityTracker.getYVelocity(this.mActivePointerId), paramInt1, paramInt3, paramInt2, paramInt4);
      setDragState(2);
      return;
    }
    throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
  }
  
  public int getActivePointerId()
  {
    return this.mActivePointerId;
  }
  
  public View getCapturedView()
  {
    return this.mCapturedView;
  }
  
  public int getEdgeSize()
  {
    return this.mEdgeSize;
  }
  
  public float getMinVelocity()
  {
    return this.mMinVelocity;
  }
  
  public int getTouchSlop()
  {
    return this.mTouchSlop;
  }
  
  public int getViewDragState()
  {
    return this.mDragState;
  }
  
  public boolean isCapturedViewUnder(int paramInt1, int paramInt2)
  {
    return isViewUnder(this.mCapturedView, paramInt1, paramInt2);
  }
  
  public boolean isEdgeTouched(int paramInt)
  {
    int j = this.mInitialEdgesTouched.length;
    for (int i = 0; i < j; i++) {
      if (isEdgeTouched(paramInt, i)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean isEdgeTouched(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((isPointerDown(paramInt2)) && ((paramInt1 & this.mInitialEdgesTouched[paramInt2]) != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isPointerDown(int paramInt)
  {
    int i = this.mPointersDown;
    boolean bool = true;
    if ((1 << paramInt & i) == 0) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isViewUnder(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    if (paramView == null) {
      return false;
    }
    boolean bool1 = bool2;
    if (paramInt1 >= paramView.getLeft())
    {
      bool1 = bool2;
      if (paramInt1 < paramView.getRight())
      {
        bool1 = bool2;
        if (paramInt2 >= paramView.getTop())
        {
          bool1 = bool2;
          if (paramInt2 < paramView.getBottom()) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public void processTouchEvent(MotionEvent paramMotionEvent)
  {
    int m = paramMotionEvent.getActionMasked();
    int k = paramMotionEvent.getActionIndex();
    if (m == 0) {
      cancel();
    }
    if (this.mVelocityTracker == null) {
      this.mVelocityTracker = VelocityTracker.obtain();
    }
    this.mVelocityTracker.addMovement(paramMotionEvent);
    int j = 0;
    int i = 0;
    float f2;
    float f1;
    if (m != 0)
    {
      if (m != 1)
      {
        Object localObject;
        if (m != 2)
        {
          if (m != 3)
          {
            if (m != 5)
            {
              if (m == 6)
              {
                j = paramMotionEvent.getPointerId(k);
                if ((this.mDragState == 1) && (j == this.mActivePointerId))
                {
                  k = paramMotionEvent.getPointerCount();
                  while (i < k)
                  {
                    m = paramMotionEvent.getPointerId(i);
                    if (m != this.mActivePointerId)
                    {
                      f2 = paramMotionEvent.getX(i);
                      f1 = paramMotionEvent.getY(i);
                      View localView = findTopChildUnder((int)f2, (int)f1);
                      localObject = this.mCapturedView;
                      if ((localView == localObject) && (tryCaptureViewForDrag((View)localObject, m)))
                      {
                        i = this.mActivePointerId;
                        break label212;
                      }
                    }
                    i++;
                  }
                  i = -1;
                  label212:
                  if (i == -1) {
                    releaseViewForPointerUp();
                  }
                }
                clearMotionHistory(j);
              }
            }
            else
            {
              i = paramMotionEvent.getPointerId(k);
              f1 = paramMotionEvent.getX(k);
              f2 = paramMotionEvent.getY(k);
              saveInitialMotion(f1, f2, i);
              if (this.mDragState == 0)
              {
                tryCaptureViewForDrag(findTopChildUnder((int)f1, (int)f2), i);
                k = this.mInitialEdgesTouched[i];
                j = this.mTrackingEdges;
                if ((k & j) != 0) {
                  this.mCallback.onEdgeTouched(k & j, i);
                }
              }
              else if (isCapturedViewUnder((int)f1, (int)f2))
              {
                tryCaptureViewForDrag(this.mCapturedView, i);
              }
            }
          }
          else
          {
            if (this.mDragState == 1) {
              dispatchViewReleased(0.0F, 0.0F);
            }
            cancel();
          }
        }
        else if (this.mDragState == 1)
        {
          if (isValidPointerForActionMove(this.mActivePointerId))
          {
            i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
            f2 = paramMotionEvent.getX(i);
            f1 = paramMotionEvent.getY(i);
            localObject = this.mLastMotionX;
            j = this.mActivePointerId;
            i = (int)(f2 - localObject[j]);
            j = (int)(f1 - this.mLastMotionY[j]);
            dragTo(this.mCapturedView.getLeft() + i, this.mCapturedView.getTop() + j, i, j);
            saveLastMotion(paramMotionEvent);
          }
        }
        else
        {
          k = paramMotionEvent.getPointerCount();
          for (i = j; i < k; i++)
          {
            j = paramMotionEvent.getPointerId(i);
            if (isValidPointerForActionMove(j))
            {
              float f3 = paramMotionEvent.getX(i);
              float f4 = paramMotionEvent.getY(i);
              f1 = f3 - this.mInitialMotionX[j];
              f2 = f4 - this.mInitialMotionY[j];
              reportNewEdgeDrags(f1, f2, j);
              if (this.mDragState == 1) {
                break;
              }
              localObject = findTopChildUnder((int)f3, (int)f4);
              if ((checkTouchSlop((View)localObject, f1, f2)) && (tryCaptureViewForDrag((View)localObject, j))) {
                break;
              }
            }
          }
          saveLastMotion(paramMotionEvent);
        }
      }
      else
      {
        if (this.mDragState == 1) {
          releaseViewForPointerUp();
        }
        cancel();
      }
    }
    else
    {
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      k = paramMotionEvent.getPointerId(0);
      paramMotionEvent = findTopChildUnder((int)f1, (int)f2);
      saveInitialMotion(f1, f2, k);
      tryCaptureViewForDrag(paramMotionEvent, k);
      i = this.mInitialEdgesTouched[k];
      j = this.mTrackingEdges;
      if ((i & j) != 0) {
        this.mCallback.onEdgeTouched(i & j, k);
      }
    }
  }
  
  void setDragState(int paramInt)
  {
    this.mParentView.removeCallbacks(this.mSetIdleRunnable);
    if (this.mDragState != paramInt)
    {
      this.mDragState = paramInt;
      this.mCallback.onViewDragStateChanged(paramInt);
      if (this.mDragState == 0) {
        this.mCapturedView = null;
      }
    }
  }
  
  public void setEdgeTrackingEnabled(int paramInt)
  {
    this.mTrackingEdges = paramInt;
  }
  
  public void setMinVelocity(float paramFloat)
  {
    this.mMinVelocity = paramFloat;
  }
  
  public boolean settleCapturedViewAt(int paramInt1, int paramInt2)
  {
    if (this.mReleaseInProgress) {
      return forceSettleCapturedViewAt(paramInt1, paramInt2, (int)this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int)this.mVelocityTracker.getYVelocity(this.mActivePointerId));
    }
    throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
  }
  
  public boolean shouldInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    int j = paramMotionEvent.getActionIndex();
    if (i == 0) {
      cancel();
    }
    if (this.mVelocityTracker == null) {
      this.mVelocityTracker = VelocityTracker.obtain();
    }
    this.mVelocityTracker.addMovement(paramMotionEvent);
    float f1;
    float f2;
    int k;
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          if (i == 3) {
            break label513;
          }
          if (i != 5) {
            if (i != 6) {
              break label615;
            }
          }
        }
      }
      for (;;)
      {
        clearMotionHistory(paramMotionEvent.getPointerId(j));
        continue;
        i = paramMotionEvent.getPointerId(j);
        f1 = paramMotionEvent.getX(j);
        f2 = paramMotionEvent.getY(j);
        saveInitialMotion(f1, f2, i);
        j = this.mDragState;
        if (j == 0)
        {
          k = this.mInitialEdgesTouched[i];
          j = this.mTrackingEdges;
          if ((k & j) != 0) {
            this.mCallback.onEdgeTouched(k & j, i);
          }
        }
        else if (j == 2)
        {
          paramMotionEvent = findTopChildUnder((int)f1, (int)f2);
          if (paramMotionEvent == this.mCapturedView)
          {
            tryCaptureViewForDrag(paramMotionEvent, i);
            continue;
            if ((this.mInitialMotionX != null) && (this.mInitialMotionY != null))
            {
              k = paramMotionEvent.getPointerCount();
              for (i = 0; i < k; i++)
              {
                int m = paramMotionEvent.getPointerId(i);
                if (isValidPointerForActionMove(m))
                {
                  float f4 = paramMotionEvent.getX(i);
                  f2 = paramMotionEvent.getY(i);
                  float f3 = f4 - this.mInitialMotionX[m];
                  f1 = f2 - this.mInitialMotionY[m];
                  View localView = findTopChildUnder((int)f4, (int)f2);
                  if ((localView != null) && (checkTouchSlop(localView, f3, f1))) {
                    j = 1;
                  } else {
                    j = 0;
                  }
                  if (j != 0)
                  {
                    int n = localView.getLeft();
                    int i1 = (int)f3;
                    i1 = this.mCallback.clampViewPositionHorizontal(localView, n + i1, i1);
                    int i2 = localView.getTop();
                    int i3 = (int)f1;
                    int i4 = this.mCallback.clampViewPositionVertical(localView, i2 + i3, i3);
                    i3 = this.mCallback.getViewHorizontalDragRange(localView);
                    int i5 = this.mCallback.getViewVerticalDragRange(localView);
                    if (((i3 == 0) || ((i3 > 0) && (i1 == n))) && ((i5 == 0) || ((i5 > 0) && (i4 == i2)))) {
                      break;
                    }
                  }
                  else
                  {
                    reportNewEdgeDrags(f3, f1, m);
                    if ((this.mDragState == 1) || ((j != 0) && (tryCaptureViewForDrag(localView, m)))) {
                      break;
                    }
                  }
                }
              }
              saveLastMotion(paramMotionEvent);
              continue;
              label513:
              cancel();
            }
          }
        }
      }
    }
    else
    {
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      k = paramMotionEvent.getPointerId(0);
      saveInitialMotion(f1, f2, k);
      paramMotionEvent = findTopChildUnder((int)f1, (int)f2);
      if ((paramMotionEvent == this.mCapturedView) && (this.mDragState == 2)) {
        tryCaptureViewForDrag(paramMotionEvent, k);
      }
      i = this.mInitialEdgesTouched[k];
      j = this.mTrackingEdges;
      if ((i & j) != 0) {
        this.mCallback.onEdgeTouched(i & j, k);
      }
    }
    label615:
    boolean bool = false;
    if (this.mDragState == 1) {
      bool = true;
    }
    return bool;
  }
  
  public boolean smoothSlideViewTo(View paramView, int paramInt1, int paramInt2)
  {
    this.mCapturedView = paramView;
    this.mActivePointerId = -1;
    boolean bool = forceSettleCapturedViewAt(paramInt1, paramInt2, 0, 0);
    if ((!bool) && (this.mDragState == 0) && (this.mCapturedView != null)) {
      this.mCapturedView = null;
    }
    return bool;
  }
  
  boolean tryCaptureViewForDrag(View paramView, int paramInt)
  {
    if ((paramView == this.mCapturedView) && (this.mActivePointerId == paramInt)) {
      return true;
    }
    if ((paramView != null) && (this.mCallback.tryCaptureView(paramView, paramInt)))
    {
      this.mActivePointerId = paramInt;
      captureChildView(paramView, paramInt);
      return true;
    }
    return false;
  }
  
  public static abstract class Callback
  {
    public int clampViewPositionHorizontal(View paramView, int paramInt1, int paramInt2)
    {
      return 0;
    }
    
    public int clampViewPositionVertical(View paramView, int paramInt1, int paramInt2)
    {
      return 0;
    }
    
    public int getOrderedChildIndex(int paramInt)
    {
      return paramInt;
    }
    
    public int getViewHorizontalDragRange(View paramView)
    {
      return 0;
    }
    
    public int getViewVerticalDragRange(View paramView)
    {
      return 0;
    }
    
    public void onEdgeDragStarted(int paramInt1, int paramInt2) {}
    
    public boolean onEdgeLock(int paramInt)
    {
      return false;
    }
    
    public void onEdgeTouched(int paramInt1, int paramInt2) {}
    
    public void onViewCaptured(View paramView, int paramInt) {}
    
    public void onViewDragStateChanged(int paramInt) {}
    
    public void onViewPositionChanged(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
    
    public void onViewReleased(View paramView, float paramFloat1, float paramFloat2) {}
    
    public abstract boolean tryCaptureView(View paramView, int paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\customview\widget\ViewDragHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */