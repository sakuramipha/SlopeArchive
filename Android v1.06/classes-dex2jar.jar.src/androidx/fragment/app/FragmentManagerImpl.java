package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.collection.ArraySet;
import androidx.core.util.DebugUtils;
import androidx.core.util.LogWriter;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStore;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class FragmentManagerImpl
  extends FragmentManager
  implements LayoutInflater.Factory2
{
  static final Interpolator ACCELERATE_CUBIC = new AccelerateInterpolator(1.5F);
  static final Interpolator ACCELERATE_QUINT;
  static final int ANIM_DUR = 220;
  public static final int ANIM_STYLE_CLOSE_ENTER = 3;
  public static final int ANIM_STYLE_CLOSE_EXIT = 4;
  public static final int ANIM_STYLE_FADE_ENTER = 5;
  public static final int ANIM_STYLE_FADE_EXIT = 6;
  public static final int ANIM_STYLE_OPEN_ENTER = 1;
  public static final int ANIM_STYLE_OPEN_EXIT = 2;
  static boolean DEBUG = false;
  static final Interpolator DECELERATE_CUBIC;
  static final Interpolator DECELERATE_QUINT = new DecelerateInterpolator(2.5F);
  static final String TAG = "FragmentManager";
  static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
  static final String TARGET_STATE_TAG = "android:target_state";
  static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
  static final String VIEW_STATE_TAG = "android:view_state";
  static Field sAnimationListenerField;
  SparseArray<Fragment> mActive;
  final ArrayList<Fragment> mAdded = new ArrayList();
  ArrayList<Integer> mAvailBackStackIndices;
  ArrayList<BackStackRecord> mBackStack;
  ArrayList<FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
  ArrayList<BackStackRecord> mBackStackIndices;
  FragmentContainer mContainer;
  ArrayList<Fragment> mCreatedMenus;
  int mCurState = 0;
  boolean mDestroyed;
  Runnable mExecCommit = new Runnable()
  {
    public void run()
    {
      FragmentManagerImpl.this.execPendingActions();
    }
  };
  boolean mExecutingActions;
  boolean mHavePendingDeferredStart;
  FragmentHostCallback mHost;
  private final CopyOnWriteArrayList<FragmentLifecycleCallbacksHolder> mLifecycleCallbacks = new CopyOnWriteArrayList();
  boolean mNeedMenuInvalidate;
  int mNextFragmentIndex = 0;
  String mNoTransactionsBecause;
  Fragment mParent;
  ArrayList<OpGenerator> mPendingActions;
  ArrayList<StartEnterTransitionListener> mPostponedTransactions;
  Fragment mPrimaryNav;
  FragmentManagerNonConfig mSavedNonConfig;
  SparseArray<Parcelable> mStateArray = null;
  Bundle mStateBundle = null;
  boolean mStateSaved;
  boolean mStopped;
  ArrayList<Fragment> mTmpAddedFragments;
  ArrayList<Boolean> mTmpIsPop;
  ArrayList<BackStackRecord> mTmpRecords;
  
  static
  {
    DECELERATE_CUBIC = new DecelerateInterpolator(1.5F);
    ACCELERATE_QUINT = new AccelerateInterpolator(2.5F);
  }
  
  private void addAddedFragments(ArraySet<Fragment> paramArraySet)
  {
    int i = this.mCurState;
    if (i < 1) {
      return;
    }
    int k = Math.min(i, 3);
    int j = this.mAdded.size();
    for (i = 0; i < j; i++)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment.mState < k)
      {
        moveToState(localFragment, k, localFragment.getNextAnim(), localFragment.getNextTransition(), false);
        if ((localFragment.mView != null) && (!localFragment.mHidden) && (localFragment.mIsNewlyAdded)) {
          paramArraySet.add(localFragment);
        }
      }
    }
  }
  
  private void animateRemoveFragment(final Fragment paramFragment, AnimationOrAnimator paramAnimationOrAnimator, int paramInt)
  {
    final View localView = paramFragment.mView;
    final ViewGroup localViewGroup = paramFragment.mContainer;
    localViewGroup.startViewTransition(localView);
    paramFragment.setStateAfterAnimating(paramInt);
    Object localObject;
    if (paramAnimationOrAnimator.animation != null)
    {
      localObject = new EndViewTransitionAnimator(paramAnimationOrAnimator.animation, localViewGroup, localView);
      paramFragment.setAnimatingAway(paramFragment.mView);
      ((Animation)localObject).setAnimationListener(new AnimationListenerWrapper(getAnimationListener((Animation)localObject))
      {
        public void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          super.onAnimationEnd(paramAnonymousAnimation);
          localViewGroup.post(new Runnable()
          {
            public void run()
            {
              if (FragmentManagerImpl.2.this.val$fragment.getAnimatingAway() != null)
              {
                FragmentManagerImpl.2.this.val$fragment.setAnimatingAway(null);
                FragmentManagerImpl.this.moveToState(FragmentManagerImpl.2.this.val$fragment, FragmentManagerImpl.2.this.val$fragment.getStateAfterAnimating(), 0, 0, false);
              }
            }
          });
        }
      });
      setHWLayerAnimListenerIfAlpha(localView, paramAnimationOrAnimator);
      paramFragment.mView.startAnimation((Animation)localObject);
    }
    else
    {
      localObject = paramAnimationOrAnimator.animator;
      paramFragment.setAnimator(paramAnimationOrAnimator.animator);
      ((Animator)localObject).addListener(new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          localViewGroup.endViewTransition(localView);
          paramAnonymousAnimator = paramFragment.getAnimator();
          paramFragment.setAnimator(null);
          if ((paramAnonymousAnimator != null) && (localViewGroup.indexOfChild(localView) < 0))
          {
            paramAnonymousAnimator = FragmentManagerImpl.this;
            Fragment localFragment = paramFragment;
            paramAnonymousAnimator.moveToState(localFragment, localFragment.getStateAfterAnimating(), 0, 0, false);
          }
        }
      });
      ((Animator)localObject).setTarget(paramFragment.mView);
      setHWLayerAnimListenerIfAlpha(paramFragment.mView, paramAnimationOrAnimator);
      ((Animator)localObject).start();
    }
  }
  
  private void burpActive()
  {
    SparseArray localSparseArray = this.mActive;
    if (localSparseArray != null) {
      for (int i = localSparseArray.size() - 1; i >= 0; i--) {
        if (this.mActive.valueAt(i) == null)
        {
          localSparseArray = this.mActive;
          localSparseArray.delete(localSparseArray.keyAt(i));
        }
      }
    }
  }
  
  private void checkStateLoss()
  {
    if (!isStateSaved())
    {
      if (this.mNoTransactionsBecause == null) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Can not perform this action inside of ");
      localStringBuilder.append(this.mNoTransactionsBecause);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
  }
  
  private void cleanupExec()
  {
    this.mExecutingActions = false;
    this.mTmpIsPop.clear();
    this.mTmpRecords.clear();
  }
  
  private void dispatchStateChange(int paramInt)
  {
    try
    {
      this.mExecutingActions = true;
      moveToState(paramInt, false);
      this.mExecutingActions = false;
      execPendingActions();
      return;
    }
    finally
    {
      this.mExecutingActions = false;
    }
  }
  
  private void endAnimatingAwayFragments()
  {
    Object localObject = this.mActive;
    int j = 0;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = ((SparseArray)localObject).size();
    }
    while (j < i)
    {
      Fragment localFragment = (Fragment)this.mActive.valueAt(j);
      if (localFragment != null) {
        if (localFragment.getAnimatingAway() != null)
        {
          int k = localFragment.getStateAfterAnimating();
          View localView = localFragment.getAnimatingAway();
          localObject = localView.getAnimation();
          if (localObject != null)
          {
            ((Animation)localObject).cancel();
            localView.clearAnimation();
          }
          localFragment.setAnimatingAway(null);
          moveToState(localFragment, k, 0, 0, false);
        }
        else if (localFragment.getAnimator() != null)
        {
          localFragment.getAnimator().end();
        }
      }
      j++;
    }
  }
  
  private void ensureExecReady(boolean paramBoolean)
  {
    if (!this.mExecutingActions)
    {
      if (this.mHost != null)
      {
        if (Looper.myLooper() == this.mHost.getHandler().getLooper())
        {
          if (!paramBoolean) {
            checkStateLoss();
          }
          if (this.mTmpRecords == null)
          {
            this.mTmpRecords = new ArrayList();
            this.mTmpIsPop = new ArrayList();
          }
          this.mExecutingActions = true;
          try
          {
            executePostponedTransaction(null, null);
            return;
          }
          finally
          {
            this.mExecutingActions = false;
          }
        }
        throw new IllegalStateException("Must be called from main thread of fragment host");
      }
      throw new IllegalStateException("Fragment host has been destroyed");
    }
    throw new IllegalStateException("FragmentManager is already executing transactions");
  }
  
  private static void executeOps(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      BackStackRecord localBackStackRecord = (BackStackRecord)paramArrayList.get(paramInt1);
      boolean bool2 = ((Boolean)paramArrayList1.get(paramInt1)).booleanValue();
      boolean bool1 = true;
      if (bool2)
      {
        localBackStackRecord.bumpBackStackNesting(-1);
        if (paramInt1 != paramInt2 - 1) {
          bool1 = false;
        }
        localBackStackRecord.executePopOps(bool1);
      }
      else
      {
        localBackStackRecord.bumpBackStackNesting(1);
        localBackStackRecord.executeOps();
      }
      paramInt1++;
    }
  }
  
  private void executeOpsTogether(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    boolean bool = ((BackStackRecord)paramArrayList.get(i)).mReorderingAllowed;
    Object localObject = this.mTmpAddedFragments;
    if (localObject == null) {
      this.mTmpAddedFragments = new ArrayList();
    } else {
      ((ArrayList)localObject).clear();
    }
    this.mTmpAddedFragments.addAll(this.mAdded);
    localObject = getPrimaryNavigationFragment();
    int k = i;
    int j = 0;
    while (k < paramInt2)
    {
      BackStackRecord localBackStackRecord = (BackStackRecord)paramArrayList.get(k);
      if (!((Boolean)paramArrayList1.get(k)).booleanValue()) {
        localObject = localBackStackRecord.expandOps(this.mTmpAddedFragments, (Fragment)localObject);
      } else {
        localObject = localBackStackRecord.trackAddedFragmentsInPop(this.mTmpAddedFragments, (Fragment)localObject);
      }
      if ((j == 0) && (!localBackStackRecord.mAddToBackStack)) {
        j = 0;
      } else {
        j = 1;
      }
      k++;
    }
    this.mTmpAddedFragments.clear();
    if (!bool) {
      FragmentTransition.startTransitions(this, paramArrayList, paramArrayList1, paramInt1, paramInt2, false);
    }
    executeOps(paramArrayList, paramArrayList1, paramInt1, paramInt2);
    if (bool)
    {
      localObject = new ArraySet();
      addAddedFragments((ArraySet)localObject);
      k = postponePostponableTransactions(paramArrayList, paramArrayList1, paramInt1, paramInt2, (ArraySet)localObject);
      makeRemovedFragmentsInvisible((ArraySet)localObject);
    }
    else
    {
      k = paramInt2;
    }
    int m = i;
    if (k != i)
    {
      m = i;
      if (bool)
      {
        FragmentTransition.startTransitions(this, paramArrayList, paramArrayList1, paramInt1, k, true);
        moveToState(this.mCurState, true);
      }
    }
    for (m = i; m < paramInt2; m++)
    {
      localObject = (BackStackRecord)paramArrayList.get(m);
      if ((((Boolean)paramArrayList1.get(m)).booleanValue()) && (((BackStackRecord)localObject).mIndex >= 0))
      {
        freeBackStackIndex(((BackStackRecord)localObject).mIndex);
        ((BackStackRecord)localObject).mIndex = -1;
      }
      ((BackStackRecord)localObject).runOnCommitRunnables();
    }
    if (j != 0) {
      reportBackStackChanged();
    }
  }
  
  private void executePostponedTransaction(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    Object localObject = this.mPostponedTransactions;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((ArrayList)localObject).size();
    }
    int i = 0;
    while (i < j)
    {
      localObject = (StartEnterTransitionListener)this.mPostponedTransactions.get(i);
      int k;
      int m;
      if ((paramArrayList != null) && (!((StartEnterTransitionListener)localObject).mIsBack))
      {
        k = paramArrayList.indexOf(((StartEnterTransitionListener)localObject).mRecord);
        if ((k != -1) && (((Boolean)paramArrayList1.get(k)).booleanValue()))
        {
          ((StartEnterTransitionListener)localObject).cancelTransaction();
          k = j;
          m = i;
          break label221;
        }
      }
      if (!((StartEnterTransitionListener)localObject).isReady())
      {
        k = j;
        m = i;
        if (paramArrayList != null)
        {
          k = j;
          m = i;
          if (!((StartEnterTransitionListener)localObject).mRecord.interactsWith(paramArrayList, 0, paramArrayList.size())) {}
        }
      }
      else
      {
        this.mPostponedTransactions.remove(i);
        m = i - 1;
        k = j - 1;
        if ((paramArrayList != null) && (!((StartEnterTransitionListener)localObject).mIsBack))
        {
          i = paramArrayList.indexOf(((StartEnterTransitionListener)localObject).mRecord);
          if ((i != -1) && (((Boolean)paramArrayList1.get(i)).booleanValue()))
          {
            ((StartEnterTransitionListener)localObject).cancelTransaction();
            break label221;
          }
        }
        ((StartEnterTransitionListener)localObject).completeTransaction();
      }
      label221:
      i = m + 1;
      j = k;
    }
  }
  
  private Fragment findFragmentUnder(Fragment paramFragment)
  {
    ViewGroup localViewGroup = paramFragment.mContainer;
    View localView = paramFragment.mView;
    if ((localViewGroup != null) && (localView != null)) {
      for (int i = this.mAdded.indexOf(paramFragment) - 1; i >= 0; i--)
      {
        paramFragment = (Fragment)this.mAdded.get(i);
        if ((paramFragment.mContainer == localViewGroup) && (paramFragment.mView != null)) {
          return paramFragment;
        }
      }
    }
    return null;
  }
  
  private void forcePostponedTransactions()
  {
    if (this.mPostponedTransactions != null) {
      while (!this.mPostponedTransactions.isEmpty()) {
        ((StartEnterTransitionListener)this.mPostponedTransactions.remove(0)).completeTransaction();
      }
    }
  }
  
  private boolean generateOpsForPendingActions(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    try
    {
      ArrayList localArrayList = this.mPendingActions;
      int i = 0;
      if ((localArrayList != null) && (localArrayList.size() != 0))
      {
        int j = this.mPendingActions.size();
        boolean bool = false;
        while (i < j)
        {
          bool |= ((OpGenerator)this.mPendingActions.get(i)).generateOps(paramArrayList, paramArrayList1);
          i++;
        }
        this.mPendingActions.clear();
        this.mHost.getHandler().removeCallbacks(this.mExecCommit);
        return bool;
      }
      return false;
    }
    finally {}
  }
  
  private static Animation.AnimationListener getAnimationListener(Animation paramAnimation)
  {
    try
    {
      if (sAnimationListenerField == null)
      {
        Field localField = Animation.class.getDeclaredField("mListener");
        sAnimationListenerField = localField;
        localField.setAccessible(true);
      }
      paramAnimation = (Animation.AnimationListener)sAnimationListenerField.get(paramAnimation);
    }
    catch (IllegalAccessException paramAnimation)
    {
      Log.e("FragmentManager", "Cannot access Animation's mListener field", paramAnimation);
    }
    catch (NoSuchFieldException paramAnimation)
    {
      Log.e("FragmentManager", "No field with the name mListener is found in Animation class", paramAnimation);
    }
    paramAnimation = null;
    return paramAnimation;
  }
  
  static AnimationOrAnimator makeFadeAnimation(Context paramContext, float paramFloat1, float paramFloat2)
  {
    paramContext = new AlphaAnimation(paramFloat1, paramFloat2);
    paramContext.setInterpolator(DECELERATE_CUBIC);
    paramContext.setDuration(220L);
    return new AnimationOrAnimator(paramContext);
  }
  
  static AnimationOrAnimator makeOpenCloseAnimation(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramContext = new AnimationSet(false);
    Object localObject = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    ((ScaleAnimation)localObject).setInterpolator(DECELERATE_QUINT);
    ((ScaleAnimation)localObject).setDuration(220L);
    paramContext.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(paramFloat3, paramFloat4);
    ((AlphaAnimation)localObject).setInterpolator(DECELERATE_CUBIC);
    ((AlphaAnimation)localObject).setDuration(220L);
    paramContext.addAnimation((Animation)localObject);
    return new AnimationOrAnimator(paramContext);
  }
  
  private void makeRemovedFragmentsInvisible(ArraySet<Fragment> paramArraySet)
  {
    int j = paramArraySet.size();
    for (int i = 0; i < j; i++)
    {
      Fragment localFragment = (Fragment)paramArraySet.valueAt(i);
      if (!localFragment.mAdded)
      {
        View localView = localFragment.getView();
        localFragment.mPostponedAlpha = localView.getAlpha();
        localView.setAlpha(0.0F);
      }
    }
  }
  
  static boolean modifiesAlpha(Animator paramAnimator)
  {
    if (paramAnimator == null) {
      return false;
    }
    int i;
    if ((paramAnimator instanceof ValueAnimator))
    {
      paramAnimator = ((ValueAnimator)paramAnimator).getValues();
      for (i = 0; i < paramAnimator.length; i++) {
        if ("alpha".equals(paramAnimator[i].getPropertyName())) {
          return true;
        }
      }
    }
    if ((paramAnimator instanceof AnimatorSet))
    {
      paramAnimator = ((AnimatorSet)paramAnimator).getChildAnimations();
      for (i = 0; i < paramAnimator.size(); i++) {
        if (modifiesAlpha((Animator)paramAnimator.get(i))) {
          return true;
        }
      }
    }
    return false;
  }
  
  static boolean modifiesAlpha(AnimationOrAnimator paramAnimationOrAnimator)
  {
    if ((paramAnimationOrAnimator.animation instanceof AlphaAnimation)) {
      return true;
    }
    if ((paramAnimationOrAnimator.animation instanceof AnimationSet))
    {
      paramAnimationOrAnimator = ((AnimationSet)paramAnimationOrAnimator.animation).getAnimations();
      for (int i = 0; i < paramAnimationOrAnimator.size(); i++) {
        if ((paramAnimationOrAnimator.get(i) instanceof AlphaAnimation)) {
          return true;
        }
      }
      return false;
    }
    return modifiesAlpha(paramAnimationOrAnimator.animator);
  }
  
  private boolean popBackStackImmediate(String paramString, int paramInt1, int paramInt2)
  {
    execPendingActions();
    ensureExecReady(true);
    Object localObject = this.mPrimaryNav;
    if ((localObject != null) && (paramInt1 < 0) && (paramString == null))
    {
      localObject = ((Fragment)localObject).peekChildFragmentManager();
      if ((localObject != null) && (((FragmentManager)localObject).popBackStackImmediate())) {
        return true;
      }
    }
    boolean bool = popBackStackState(this.mTmpRecords, this.mTmpIsPop, paramString, paramInt1, paramInt2);
    if (bool) {
      this.mExecutingActions = true;
    }
    try
    {
      removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
      cleanupExec();
    }
    finally
    {
      cleanupExec();
    }
    burpActive();
    return bool;
  }
  
  private int postponePostponableTransactions(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, ArraySet<Fragment> paramArraySet)
  {
    int i = paramInt2 - 1;
    int k;
    for (int j = paramInt2; i >= paramInt1; j = k)
    {
      BackStackRecord localBackStackRecord = (BackStackRecord)paramArrayList.get(i);
      boolean bool = ((Boolean)paramArrayList1.get(i)).booleanValue();
      int m;
      if ((localBackStackRecord.isPostponed()) && (!localBackStackRecord.interactsWith(paramArrayList, i + 1, paramInt2))) {
        m = 1;
      } else {
        m = 0;
      }
      k = j;
      if (m != 0)
      {
        if (this.mPostponedTransactions == null) {
          this.mPostponedTransactions = new ArrayList();
        }
        StartEnterTransitionListener localStartEnterTransitionListener = new StartEnterTransitionListener(localBackStackRecord, bool);
        this.mPostponedTransactions.add(localStartEnterTransitionListener);
        localBackStackRecord.setOnStartPostponedListener(localStartEnterTransitionListener);
        if (bool) {
          localBackStackRecord.executeOps();
        } else {
          localBackStackRecord.executePopOps(false);
        }
        k = j - 1;
        if (i != k)
        {
          paramArrayList.remove(i);
          paramArrayList.add(k, localBackStackRecord);
        }
        addAddedFragments(paramArraySet);
      }
      i--;
    }
    return j;
  }
  
  private void removeRedundantOperationsAndExecute(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    if ((paramArrayList != null) && (!paramArrayList.isEmpty()))
    {
      if ((paramArrayList1 != null) && (paramArrayList.size() == paramArrayList1.size()))
      {
        executePostponedTransaction(paramArrayList, paramArrayList1);
        int n = paramArrayList.size();
        int i = 0;
        int j;
        for (int k = 0; i < n; k = j)
        {
          int m = i;
          j = k;
          if (!((BackStackRecord)paramArrayList.get(i)).mReorderingAllowed)
          {
            if (k != i) {
              executeOpsTogether(paramArrayList, paramArrayList1, k, i);
            }
            k = i + 1;
            j = k;
            if (((Boolean)paramArrayList1.get(i)).booleanValue()) {
              for (;;)
              {
                j = k;
                if (k >= n) {
                  break;
                }
                j = k;
                if (!((Boolean)paramArrayList1.get(k)).booleanValue()) {
                  break;
                }
                j = k;
                if (((BackStackRecord)paramArrayList.get(k)).mReorderingAllowed) {
                  break;
                }
                k++;
              }
            }
            executeOpsTogether(paramArrayList, paramArrayList1, i, j);
            m = j - 1;
          }
          i = m + 1;
        }
        if (k != n) {
          executeOpsTogether(paramArrayList, paramArrayList1, k, n);
        }
        return;
      }
      throw new IllegalStateException("Internal error with the back stack records");
    }
  }
  
  public static int reverseTransit(int paramInt)
  {
    int i = 8194;
    if (paramInt != 4097) {
      if (paramInt != 4099)
      {
        if (paramInt != 8194) {
          i = 0;
        } else {
          i = 4097;
        }
      }
      else {
        i = 4099;
      }
    }
    return i;
  }
  
  private static void setHWLayerAnimListenerIfAlpha(View paramView, AnimationOrAnimator paramAnimationOrAnimator)
  {
    if ((paramView != null) && (paramAnimationOrAnimator != null) && (shouldRunOnHWLayer(paramView, paramAnimationOrAnimator))) {
      if (paramAnimationOrAnimator.animator != null)
      {
        paramAnimationOrAnimator.animator.addListener(new AnimatorOnHWLayerIfNeededListener(paramView));
      }
      else
      {
        Animation.AnimationListener localAnimationListener = getAnimationListener(paramAnimationOrAnimator.animation);
        paramView.setLayerType(2, null);
        paramAnimationOrAnimator.animation.setAnimationListener(new AnimateOnHWLayerIfNeededListener(paramView, localAnimationListener));
      }
    }
  }
  
  private static void setRetaining(FragmentManagerNonConfig paramFragmentManagerNonConfig)
  {
    if (paramFragmentManagerNonConfig == null) {
      return;
    }
    Object localObject = paramFragmentManagerNonConfig.getFragments();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((Fragment)((Iterator)localObject).next()).mRetaining = true;
      }
    }
    paramFragmentManagerNonConfig = paramFragmentManagerNonConfig.getChildNonConfigs();
    if (paramFragmentManagerNonConfig != null)
    {
      paramFragmentManagerNonConfig = paramFragmentManagerNonConfig.iterator();
      while (paramFragmentManagerNonConfig.hasNext()) {
        setRetaining((FragmentManagerNonConfig)paramFragmentManagerNonConfig.next());
      }
    }
  }
  
  static boolean shouldRunOnHWLayer(View paramView, AnimationOrAnimator paramAnimationOrAnimator)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramView != null) {
      if (paramAnimationOrAnimator == null)
      {
        bool1 = bool2;
      }
      else
      {
        bool1 = bool2;
        if (Build.VERSION.SDK_INT >= 19)
        {
          bool1 = bool2;
          if (paramView.getLayerType() == 0)
          {
            bool1 = bool2;
            if (ViewCompat.hasOverlappingRendering(paramView))
            {
              bool1 = bool2;
              if (modifiesAlpha(paramAnimationOrAnimator)) {
                bool1 = true;
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  private void throwException(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new LogWriter("FragmentManager"));
    FragmentHostCallback localFragmentHostCallback = this.mHost;
    if (localFragmentHostCallback != null) {
      try
      {
        localFragmentHostCallback.onDump("  ", null, localPrintWriter, new String[0]);
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
      }
    } else {
      try
      {
        dump("  ", null, localException1, new String[0]);
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
      }
    }
    throw paramRuntimeException;
  }
  
  public static int transitToStyleIndex(int paramInt, boolean paramBoolean)
  {
    if (paramInt != 4097)
    {
      if (paramInt != 4099)
      {
        if (paramInt != 8194) {
          paramInt = -1;
        } else if (paramBoolean) {
          paramInt = 3;
        } else {
          paramInt = 4;
        }
      }
      else if (paramBoolean) {
        paramInt = 5;
      } else {
        paramInt = 6;
      }
    }
    else if (paramBoolean) {
      paramInt = 1;
    } else {
      paramInt = 2;
    }
    return paramInt;
  }
  
  void addBackStackState(BackStackRecord paramBackStackRecord)
  {
    if (this.mBackStack == null) {
      this.mBackStack = new ArrayList();
    }
    this.mBackStack.add(paramBackStackRecord);
  }
  
  public void addFragment(Fragment paramFragment, boolean paramBoolean)
  {
    if (DEBUG)
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("add: ");
      ((StringBuilder)???).append(paramFragment);
      Log.v("FragmentManager", ((StringBuilder)???).toString());
    }
    makeActive(paramFragment);
    if (!paramFragment.mDetached)
    {
      if (!this.mAdded.contains(paramFragment)) {
        synchronized (this.mAdded)
        {
          this.mAdded.add(paramFragment);
          paramFragment.mAdded = true;
          paramFragment.mRemoving = false;
          if (paramFragment.mView == null) {
            paramFragment.mHiddenChanged = false;
          }
          if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
            this.mNeedMenuInvalidate = true;
          }
          if (!paramBoolean) {
            return;
          }
          moveToState(paramFragment);
        }
      }
      ??? = new StringBuilder();
      ((StringBuilder)???).append("Fragment already added: ");
      ((StringBuilder)???).append(paramFragment);
      throw new IllegalStateException(((StringBuilder)???).toString());
    }
  }
  
  public void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener paramOnBackStackChangedListener)
  {
    if (this.mBackStackChangeListeners == null) {
      this.mBackStackChangeListeners = new ArrayList();
    }
    this.mBackStackChangeListeners.add(paramOnBackStackChangedListener);
  }
  
  public int allocBackStackIndex(BackStackRecord paramBackStackRecord)
  {
    try
    {
      Object localObject = this.mAvailBackStackIndices;
      if ((localObject != null) && (((ArrayList)localObject).size() > 0))
      {
        localObject = this.mAvailBackStackIndices;
        i = ((Integer)((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1)).intValue();
        if (DEBUG)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Adding back stack index ");
          ((StringBuilder)localObject).append(i);
          ((StringBuilder)localObject).append(" with ");
          ((StringBuilder)localObject).append(paramBackStackRecord);
          Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        }
        this.mBackStackIndices.set(i, paramBackStackRecord);
        return i;
      }
      if (this.mBackStackIndices == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.mBackStackIndices = ((ArrayList)localObject);
      }
      int i = this.mBackStackIndices.size();
      if (DEBUG)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Setting back stack index ");
        ((StringBuilder)localObject).append(i);
        ((StringBuilder)localObject).append(" to ");
        ((StringBuilder)localObject).append(paramBackStackRecord);
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
      }
      this.mBackStackIndices.add(paramBackStackRecord);
      return i;
    }
    finally {}
  }
  
  public void attachController(FragmentHostCallback paramFragmentHostCallback, FragmentContainer paramFragmentContainer, Fragment paramFragment)
  {
    if (this.mHost == null)
    {
      this.mHost = paramFragmentHostCallback;
      this.mContainer = paramFragmentContainer;
      this.mParent = paramFragment;
      return;
    }
    throw new IllegalStateException("Already attached");
  }
  
  public void attachFragment(Fragment paramFragment)
  {
    if (DEBUG)
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("attach: ");
      ((StringBuilder)???).append(paramFragment);
      Log.v("FragmentManager", ((StringBuilder)???).toString());
    }
    if (paramFragment.mDetached)
    {
      paramFragment.mDetached = false;
      if (!paramFragment.mAdded)
      {
        if (!this.mAdded.contains(paramFragment))
        {
          if (DEBUG)
          {
            ??? = new StringBuilder();
            ((StringBuilder)???).append("add from attach: ");
            ((StringBuilder)???).append(paramFragment);
            Log.v("FragmentManager", ((StringBuilder)???).toString());
          }
          synchronized (this.mAdded)
          {
            this.mAdded.add(paramFragment);
            paramFragment.mAdded = true;
            if ((!paramFragment.mHasMenu) || (!paramFragment.mMenuVisible)) {
              return;
            }
            this.mNeedMenuInvalidate = true;
          }
        }
        ??? = new StringBuilder();
        ((StringBuilder)???).append("Fragment already added: ");
        ((StringBuilder)???).append(paramFragment);
        throw new IllegalStateException(((StringBuilder)???).toString());
      }
    }
  }
  
  public FragmentTransaction beginTransaction()
  {
    return new BackStackRecord(this);
  }
  
  void completeExecute(BackStackRecord paramBackStackRecord, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean1) {
      paramBackStackRecord.executePopOps(paramBoolean3);
    } else {
      paramBackStackRecord.executeOps();
    }
    Object localObject = new ArrayList(1);
    ArrayList localArrayList = new ArrayList(1);
    ((ArrayList)localObject).add(paramBackStackRecord);
    localArrayList.add(Boolean.valueOf(paramBoolean1));
    if (paramBoolean2) {
      FragmentTransition.startTransitions(this, (ArrayList)localObject, localArrayList, 0, 1, true);
    }
    if (paramBoolean3) {
      moveToState(this.mCurState, true);
    }
    localObject = this.mActive;
    if (localObject != null)
    {
      int j = ((SparseArray)localObject).size();
      for (int i = 0; i < j; i++)
      {
        localObject = (Fragment)this.mActive.valueAt(i);
        if ((localObject != null) && (((Fragment)localObject).mView != null) && (((Fragment)localObject).mIsNewlyAdded) && (paramBackStackRecord.interactsWith(((Fragment)localObject).mContainerId)))
        {
          if (((Fragment)localObject).mPostponedAlpha > 0.0F) {
            ((Fragment)localObject).mView.setAlpha(((Fragment)localObject).mPostponedAlpha);
          }
          if (paramBoolean3)
          {
            ((Fragment)localObject).mPostponedAlpha = 0.0F;
          }
          else
          {
            ((Fragment)localObject).mPostponedAlpha = -1.0F;
            ((Fragment)localObject).mIsNewlyAdded = false;
          }
        }
      }
    }
  }
  
  void completeShowHideFragment(final Fragment paramFragment)
  {
    if (paramFragment.mView != null)
    {
      AnimationOrAnimator localAnimationOrAnimator = loadAnimation(paramFragment, paramFragment.getNextTransition(), paramFragment.mHidden ^ true, paramFragment.getNextTransitionStyle());
      if ((localAnimationOrAnimator != null) && (localAnimationOrAnimator.animator != null))
      {
        localAnimationOrAnimator.animator.setTarget(paramFragment.mView);
        if (paramFragment.mHidden)
        {
          if (paramFragment.isHideReplaced())
          {
            paramFragment.setHideReplaced(false);
          }
          else
          {
            final ViewGroup localViewGroup = paramFragment.mContainer;
            final View localView = paramFragment.mView;
            localViewGroup.startViewTransition(localView);
            localAnimationOrAnimator.animator.addListener(new AnimatorListenerAdapter()
            {
              public void onAnimationEnd(Animator paramAnonymousAnimator)
              {
                localViewGroup.endViewTransition(localView);
                paramAnonymousAnimator.removeListener(this);
                if (paramFragment.mView != null) {
                  paramFragment.mView.setVisibility(8);
                }
              }
            });
          }
        }
        else {
          paramFragment.mView.setVisibility(0);
        }
        setHWLayerAnimListenerIfAlpha(paramFragment.mView, localAnimationOrAnimator);
        localAnimationOrAnimator.animator.start();
      }
      else
      {
        if (localAnimationOrAnimator != null)
        {
          setHWLayerAnimListenerIfAlpha(paramFragment.mView, localAnimationOrAnimator);
          paramFragment.mView.startAnimation(localAnimationOrAnimator.animation);
          localAnimationOrAnimator.animation.start();
        }
        int i;
        if ((paramFragment.mHidden) && (!paramFragment.isHideReplaced())) {
          i = 8;
        } else {
          i = 0;
        }
        paramFragment.mView.setVisibility(i);
        if (paramFragment.isHideReplaced()) {
          paramFragment.setHideReplaced(false);
        }
      }
    }
    if ((paramFragment.mAdded) && (paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
      this.mNeedMenuInvalidate = true;
    }
    paramFragment.mHiddenChanged = false;
    paramFragment.onHiddenChanged(paramFragment.mHidden);
  }
  
  public void detachFragment(Fragment paramFragment)
  {
    if (DEBUG)
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("detach: ");
      ((StringBuilder)???).append(paramFragment);
      Log.v("FragmentManager", ((StringBuilder)???).toString());
    }
    if (!paramFragment.mDetached)
    {
      paramFragment.mDetached = true;
      if (paramFragment.mAdded)
      {
        if (DEBUG)
        {
          ??? = new StringBuilder();
          ((StringBuilder)???).append("remove from detach: ");
          ((StringBuilder)???).append(paramFragment);
          Log.v("FragmentManager", ((StringBuilder)???).toString());
        }
        synchronized (this.mAdded)
        {
          this.mAdded.remove(paramFragment);
          if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
            this.mNeedMenuInvalidate = true;
          }
          paramFragment.mAdded = false;
        }
      }
    }
  }
  
  public void dispatchActivityCreated()
  {
    this.mStateSaved = false;
    this.mStopped = false;
    dispatchStateChange(2);
  }
  
  public void dispatchConfigurationChanged(Configuration paramConfiguration)
  {
    for (int i = 0; i < this.mAdded.size(); i++)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment != null) {
        localFragment.performConfigurationChanged(paramConfiguration);
      }
    }
  }
  
  public boolean dispatchContextItemSelected(MenuItem paramMenuItem)
  {
    if (this.mCurState < 1) {
      return false;
    }
    for (int i = 0; i < this.mAdded.size(); i++)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if ((localFragment != null) && (localFragment.performContextItemSelected(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public void dispatchCreate()
  {
    this.mStateSaved = false;
    this.mStopped = false;
    dispatchStateChange(1);
  }
  
  public boolean dispatchCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i = this.mCurState;
    int j = 0;
    if (i < 1) {
      return false;
    }
    Object localObject1 = null;
    i = 0;
    boolean bool2;
    for (boolean bool1 = false; i < this.mAdded.size(); bool1 = bool2)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      Object localObject2 = localObject1;
      bool2 = bool1;
      if (localFragment != null)
      {
        localObject2 = localObject1;
        bool2 = bool1;
        if (localFragment.performCreateOptionsMenu(paramMenu, paramMenuInflater))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new ArrayList();
          }
          ((ArrayList)localObject2).add(localFragment);
          bool2 = true;
        }
      }
      i++;
      localObject1 = localObject2;
    }
    if (this.mCreatedMenus != null) {
      for (i = j; i < this.mCreatedMenus.size(); i++)
      {
        paramMenu = (Fragment)this.mCreatedMenus.get(i);
        if ((localObject1 == null) || (!((ArrayList)localObject1).contains(paramMenu))) {
          paramMenu.onDestroyOptionsMenu();
        }
      }
    }
    this.mCreatedMenus = ((ArrayList)localObject1);
    return bool1;
  }
  
  public void dispatchDestroy()
  {
    this.mDestroyed = true;
    execPendingActions();
    dispatchStateChange(0);
    this.mHost = null;
    this.mContainer = null;
    this.mParent = null;
  }
  
  public void dispatchDestroyView()
  {
    dispatchStateChange(1);
  }
  
  public void dispatchLowMemory()
  {
    for (int i = 0; i < this.mAdded.size(); i++)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment != null) {
        localFragment.performLowMemory();
      }
    }
  }
  
  public void dispatchMultiWindowModeChanged(boolean paramBoolean)
  {
    for (int i = this.mAdded.size() - 1; i >= 0; i--)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment != null) {
        localFragment.performMultiWindowModeChanged(paramBoolean);
      }
    }
  }
  
  void dispatchOnFragmentActivityCreated(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentActivityCreated(paramFragment, paramBundle, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (((FragmentLifecycleCallbacksHolder)localObject).mRecursive)) {
        ((FragmentLifecycleCallbacksHolder)localObject).mCallback.onFragmentActivityCreated(this, paramFragment, paramBundle);
      }
    }
  }
  
  void dispatchOnFragmentAttached(Fragment paramFragment, Context paramContext, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentAttached(paramFragment, paramContext, true);
      }
    }
    localObject = this.mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (localFragmentLifecycleCallbacksHolder.mRecursive)) {
        localFragmentLifecycleCallbacksHolder.mCallback.onFragmentAttached(this, paramFragment, paramContext);
      }
    }
  }
  
  void dispatchOnFragmentCreated(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentCreated(paramFragment, paramBundle, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (((FragmentLifecycleCallbacksHolder)localObject).mRecursive)) {
        ((FragmentLifecycleCallbacksHolder)localObject).mCallback.onFragmentCreated(this, paramFragment, paramBundle);
      }
    }
  }
  
  void dispatchOnFragmentDestroyed(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentDestroyed(paramFragment, true);
      }
    }
    localObject = this.mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (localFragmentLifecycleCallbacksHolder.mRecursive)) {
        localFragmentLifecycleCallbacksHolder.mCallback.onFragmentDestroyed(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentDetached(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentDetached(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (((FragmentLifecycleCallbacksHolder)localObject).mRecursive)) {
        ((FragmentLifecycleCallbacksHolder)localObject).mCallback.onFragmentDetached(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentPaused(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentPaused(paramFragment, true);
      }
    }
    localObject = this.mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (localFragmentLifecycleCallbacksHolder.mRecursive)) {
        localFragmentLifecycleCallbacksHolder.mCallback.onFragmentPaused(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentPreAttached(Fragment paramFragment, Context paramContext, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentPreAttached(paramFragment, paramContext, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (((FragmentLifecycleCallbacksHolder)localObject).mRecursive)) {
        ((FragmentLifecycleCallbacksHolder)localObject).mCallback.onFragmentPreAttached(this, paramFragment, paramContext);
      }
    }
  }
  
  void dispatchOnFragmentPreCreated(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentPreCreated(paramFragment, paramBundle, true);
      }
    }
    localObject = this.mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (localFragmentLifecycleCallbacksHolder.mRecursive)) {
        localFragmentLifecycleCallbacksHolder.mCallback.onFragmentPreCreated(this, paramFragment, paramBundle);
      }
    }
  }
  
  void dispatchOnFragmentResumed(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentResumed(paramFragment, true);
      }
    }
    localObject = this.mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (localFragmentLifecycleCallbacksHolder.mRecursive)) {
        localFragmentLifecycleCallbacksHolder.mCallback.onFragmentResumed(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentSaveInstanceState(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentSaveInstanceState(paramFragment, paramBundle, true);
      }
    }
    localObject = this.mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (localFragmentLifecycleCallbacksHolder.mRecursive)) {
        localFragmentLifecycleCallbacksHolder.mCallback.onFragmentSaveInstanceState(this, paramFragment, paramBundle);
      }
    }
  }
  
  void dispatchOnFragmentStarted(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentStarted(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (((FragmentLifecycleCallbacksHolder)localObject).mRecursive)) {
        ((FragmentLifecycleCallbacksHolder)localObject).mCallback.onFragmentStarted(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentStopped(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentStopped(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (((FragmentLifecycleCallbacksHolder)localObject).mRecursive)) {
        ((FragmentLifecycleCallbacksHolder)localObject).mCallback.onFragmentStopped(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentViewCreated(Fragment paramFragment, View paramView, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentViewCreated(paramFragment, paramView, paramBundle, true);
      }
    }
    localObject = this.mLifecycleCallbacks.iterator();
    while (((Iterator)localObject).hasNext())
    {
      FragmentLifecycleCallbacksHolder localFragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder)((Iterator)localObject).next();
      if ((!paramBoolean) || (localFragmentLifecycleCallbacksHolder.mRecursive)) {
        localFragmentLifecycleCallbacksHolder.mCallback.onFragmentViewCreated(this, paramFragment, paramView, paramBundle);
      }
    }
  }
  
  void dispatchOnFragmentViewDestroyed(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.mParent;
    if (localObject != null)
    {
      localObject = ((Fragment)localObject).getFragmentManager();
      if ((localObject instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localObject).dispatchOnFragmentViewDestroyed(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      localObject = (FragmentLifecycleCallbacksHolder)localIterator.next();
      if ((!paramBoolean) || (((FragmentLifecycleCallbacksHolder)localObject).mRecursive)) {
        ((FragmentLifecycleCallbacksHolder)localObject).mCallback.onFragmentViewDestroyed(this, paramFragment);
      }
    }
  }
  
  public boolean dispatchOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (this.mCurState < 1) {
      return false;
    }
    for (int i = 0; i < this.mAdded.size(); i++)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if ((localFragment != null) && (localFragment.performOptionsItemSelected(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public void dispatchOptionsMenuClosed(Menu paramMenu)
  {
    if (this.mCurState < 1) {
      return;
    }
    for (int i = 0; i < this.mAdded.size(); i++)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment != null) {
        localFragment.performOptionsMenuClosed(paramMenu);
      }
    }
  }
  
  public void dispatchPause()
  {
    dispatchStateChange(3);
  }
  
  public void dispatchPictureInPictureModeChanged(boolean paramBoolean)
  {
    for (int i = this.mAdded.size() - 1; i >= 0; i--)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment != null) {
        localFragment.performPictureInPictureModeChanged(paramBoolean);
      }
    }
  }
  
  public boolean dispatchPrepareOptionsMenu(Menu paramMenu)
  {
    int j = this.mCurState;
    int i = 0;
    if (j < 1) {
      return false;
    }
    boolean bool2;
    for (boolean bool1 = false; i < this.mAdded.size(); bool1 = bool2)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      bool2 = bool1;
      if (localFragment != null)
      {
        bool2 = bool1;
        if (localFragment.performPrepareOptionsMenu(paramMenu)) {
          bool2 = true;
        }
      }
      i++;
    }
    return bool1;
  }
  
  public void dispatchResume()
  {
    this.mStateSaved = false;
    this.mStopped = false;
    dispatchStateChange(4);
  }
  
  public void dispatchStart()
  {
    this.mStateSaved = false;
    this.mStopped = false;
    dispatchStateChange(3);
  }
  
  public void dispatchStop()
  {
    this.mStopped = true;
    dispatchStateChange(2);
  }
  
  void doPendingDeferredStart()
  {
    if (this.mHavePendingDeferredStart)
    {
      this.mHavePendingDeferredStart = false;
      startPendingDeferredFragments();
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("    ");
    localObject1 = ((StringBuilder)localObject1).toString();
    Object localObject2 = this.mActive;
    int j = 0;
    int i;
    if (localObject2 != null)
    {
      k = ((SparseArray)localObject2).size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        for (i = 0; i < k; i++)
        {
          localObject2 = (Fragment)this.mActive.valueAt(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localObject2);
          if (localObject2 != null) {
            ((Fragment)localObject2).dump((String)localObject1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
        }
      }
    }
    int k = this.mAdded.size();
    if (k > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      for (i = 0; i < k; i++)
      {
        localObject2 = (Fragment)this.mAdded.get(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(i);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(((Fragment)localObject2).toString());
      }
    }
    localObject2 = this.mCreatedMenus;
    if (localObject2 != null)
    {
      k = ((ArrayList)localObject2).size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (i = 0; i < k; i++)
        {
          localObject2 = (Fragment)this.mCreatedMenus.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((Fragment)localObject2).toString());
        }
      }
    }
    localObject2 = this.mBackStack;
    if (localObject2 != null)
    {
      k = ((ArrayList)localObject2).size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (i = 0; i < k; i++)
        {
          localObject2 = (BackStackRecord)this.mBackStack.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((BackStackRecord)localObject2).toString());
          ((BackStackRecord)localObject2).dump((String)localObject1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
    try
    {
      paramFileDescriptor = this.mBackStackIndices;
      if (paramFileDescriptor != null)
      {
        k = paramFileDescriptor.size();
        if (k > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          for (i = 0; i < k; i++)
          {
            paramFileDescriptor = (BackStackRecord)this.mBackStackIndices.get(i);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
          }
        }
      }
      paramFileDescriptor = this.mAvailBackStackIndices;
      if ((paramFileDescriptor != null) && (paramFileDescriptor.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.mAvailBackStackIndices.toArray()));
      }
      paramFileDescriptor = this.mPendingActions;
      if (paramFileDescriptor != null)
      {
        k = paramFileDescriptor.size();
        if (k > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          for (i = j; i < k; i++)
          {
            paramFileDescriptor = (OpGenerator)this.mPendingActions.get(i);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
          }
        }
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("FragmentManager misc state:");
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mHost=");
      paramPrintWriter.println(this.mHost);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mContainer=");
      paramPrintWriter.println(this.mContainer);
      if (this.mParent != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mParent=");
        paramPrintWriter.println(this.mParent);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mCurState=");
      paramPrintWriter.print(this.mCurState);
      paramPrintWriter.print(" mStateSaved=");
      paramPrintWriter.print(this.mStateSaved);
      paramPrintWriter.print(" mStopped=");
      paramPrintWriter.print(this.mStopped);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(this.mDestroyed);
      if (this.mNeedMenuInvalidate)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mNeedMenuInvalidate=");
        paramPrintWriter.println(this.mNeedMenuInvalidate);
      }
      if (this.mNoTransactionsBecause != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mNoTransactionsBecause=");
        paramPrintWriter.println(this.mNoTransactionsBecause);
      }
      return;
    }
    finally {}
  }
  
  public void enqueueAction(OpGenerator paramOpGenerator, boolean paramBoolean)
  {
    if (!paramBoolean) {
      checkStateLoss();
    }
    try
    {
      if ((!this.mDestroyed) && (this.mHost != null))
      {
        if (this.mPendingActions == null)
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          this.mPendingActions = localArrayList;
        }
        this.mPendingActions.add(paramOpGenerator);
        scheduleCommit();
        return;
      }
      if (paramBoolean) {
        return;
      }
      paramOpGenerator = new java/lang/IllegalStateException;
      paramOpGenerator.<init>("Activity has been destroyed");
      throw paramOpGenerator;
    }
    finally {}
  }
  
  void ensureInflatedFragmentView(Fragment paramFragment)
  {
    if ((paramFragment.mFromLayout) && (!paramFragment.mPerformedCreateView))
    {
      paramFragment.performCreateView(paramFragment.performGetLayoutInflater(paramFragment.mSavedFragmentState), null, paramFragment.mSavedFragmentState);
      if (paramFragment.mView != null)
      {
        paramFragment.mInnerView = paramFragment.mView;
        paramFragment.mView.setSaveFromParentEnabled(false);
        if (paramFragment.mHidden) {
          paramFragment.mView.setVisibility(8);
        }
        paramFragment.onViewCreated(paramFragment.mView, paramFragment.mSavedFragmentState);
        dispatchOnFragmentViewCreated(paramFragment, paramFragment.mView, paramFragment.mSavedFragmentState, false);
      }
      else
      {
        paramFragment.mInnerView = null;
      }
    }
  }
  
  /* Error */
  public boolean execPendingActions()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: invokespecial 673	androidx/fragment/app/FragmentManagerImpl:ensureExecReady	(Z)V
    //   5: iconst_0
    //   6: istore_1
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 359	androidx/fragment/app/FragmentManagerImpl:mTmpRecords	Ljava/util/ArrayList;
    //   12: aload_0
    //   13: getfield 354	androidx/fragment/app/FragmentManagerImpl:mTmpIsPop	Ljava/util/ArrayList;
    //   16: invokespecial 1227	androidx/fragment/app/FragmentManagerImpl:generateOpsForPendingActions	(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    //   19: ifeq +36 -> 55
    //   22: aload_0
    //   23: iconst_1
    //   24: putfield 352	androidx/fragment/app/FragmentManagerImpl:mExecutingActions	Z
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 359	androidx/fragment/app/FragmentManagerImpl:mTmpRecords	Ljava/util/ArrayList;
    //   32: aload_0
    //   33: getfield 354	androidx/fragment/app/FragmentManagerImpl:mTmpIsPop	Ljava/util/ArrayList;
    //   36: invokespecial 688	androidx/fragment/app/FragmentManagerImpl:removeRedundantOperationsAndExecute	(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   39: aload_0
    //   40: invokespecial 690	androidx/fragment/app/FragmentManagerImpl:cleanupExec	()V
    //   43: iconst_1
    //   44: istore_1
    //   45: goto -38 -> 7
    //   48: astore_2
    //   49: aload_0
    //   50: invokespecial 690	androidx/fragment/app/FragmentManagerImpl:cleanupExec	()V
    //   53: aload_2
    //   54: athrow
    //   55: aload_0
    //   56: invokevirtual 693	androidx/fragment/app/FragmentManagerImpl:doPendingDeferredStart	()V
    //   59: aload_0
    //   60: invokespecial 695	androidx/fragment/app/FragmentManagerImpl:burpActive	()V
    //   63: iload_1
    //   64: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	FragmentManagerImpl
    //   6	58	1	bool	boolean
    //   48	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   27	39	48	finally
  }
  
  public void execSingleAction(OpGenerator paramOpGenerator, boolean paramBoolean)
  {
    if ((paramBoolean) && ((this.mHost == null) || (this.mDestroyed))) {
      return;
    }
    ensureExecReady(paramBoolean);
    if (paramOpGenerator.generateOps(this.mTmpRecords, this.mTmpIsPop)) {
      this.mExecutingActions = true;
    }
    try
    {
      removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
      cleanupExec();
    }
    finally
    {
      cleanupExec();
    }
    burpActive();
  }
  
  public boolean executePendingTransactions()
  {
    boolean bool = execPendingActions();
    forcePostponedTransactions();
    return bool;
  }
  
  public Fragment findFragmentById(int paramInt)
  {
    for (int i = this.mAdded.size() - 1; i >= 0; i--)
    {
      localObject = (Fragment)this.mAdded.get(i);
      if ((localObject != null) && (((Fragment)localObject).mFragmentId == paramInt)) {
        return (Fragment)localObject;
      }
    }
    Object localObject = this.mActive;
    if (localObject != null) {
      for (i = ((SparseArray)localObject).size() - 1; i >= 0; i--)
      {
        localObject = (Fragment)this.mActive.valueAt(i);
        if ((localObject != null) && (((Fragment)localObject).mFragmentId == paramInt)) {
          return (Fragment)localObject;
        }
      }
    }
    return null;
  }
  
  public Fragment findFragmentByTag(String paramString)
  {
    int i;
    if (paramString != null) {
      for (i = this.mAdded.size() - 1; i >= 0; i--)
      {
        localObject = (Fragment)this.mAdded.get(i);
        if ((localObject != null) && (paramString.equals(((Fragment)localObject).mTag))) {
          return (Fragment)localObject;
        }
      }
    }
    Object localObject = this.mActive;
    if ((localObject != null) && (paramString != null)) {
      for (i = ((SparseArray)localObject).size() - 1; i >= 0; i--)
      {
        localObject = (Fragment)this.mActive.valueAt(i);
        if ((localObject != null) && (paramString.equals(((Fragment)localObject).mTag))) {
          return (Fragment)localObject;
        }
      }
    }
    return null;
  }
  
  public Fragment findFragmentByWho(String paramString)
  {
    Object localObject = this.mActive;
    if ((localObject != null) && (paramString != null)) {
      for (int i = ((SparseArray)localObject).size() - 1; i >= 0; i--)
      {
        localObject = (Fragment)this.mActive.valueAt(i);
        if (localObject != null)
        {
          localObject = ((Fragment)localObject).findFragmentByWho(paramString);
          if (localObject != null) {
            return (Fragment)localObject;
          }
        }
      }
    }
    return null;
  }
  
  public void freeBackStackIndex(int paramInt)
  {
    try
    {
      this.mBackStackIndices.set(paramInt, null);
      Object localObject1;
      if (this.mAvailBackStackIndices == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.mAvailBackStackIndices = ((ArrayList)localObject1);
      }
      if (DEBUG)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Freeing back stack index ");
        ((StringBuilder)localObject1).append(paramInt);
        Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
      }
      this.mAvailBackStackIndices.add(Integer.valueOf(paramInt));
      return;
    }
    finally {}
  }
  
  int getActiveFragmentCount()
  {
    SparseArray localSparseArray = this.mActive;
    if (localSparseArray == null) {
      return 0;
    }
    return localSparseArray.size();
  }
  
  List<Fragment> getActiveFragments()
  {
    Object localObject = this.mActive;
    if (localObject == null) {
      return null;
    }
    int j = ((SparseArray)localObject).size();
    localObject = new ArrayList(j);
    for (int i = 0; i < j; i++) {
      ((ArrayList)localObject).add(this.mActive.valueAt(i));
    }
    return (List<Fragment>)localObject;
  }
  
  public FragmentManager.BackStackEntry getBackStackEntryAt(int paramInt)
  {
    return (FragmentManager.BackStackEntry)this.mBackStack.get(paramInt);
  }
  
  public int getBackStackEntryCount()
  {
    ArrayList localArrayList = this.mBackStack;
    int i;
    if (localArrayList != null) {
      i = localArrayList.size();
    } else {
      i = 0;
    }
    return i;
  }
  
  public Fragment getFragment(Bundle paramBundle, String paramString)
  {
    int i = paramBundle.getInt(paramString, -1);
    if (i == -1) {
      return null;
    }
    Fragment localFragment = (Fragment)this.mActive.get(i);
    if (localFragment == null)
    {
      paramBundle = new StringBuilder();
      paramBundle.append("Fragment no longer exists for key ");
      paramBundle.append(paramString);
      paramBundle.append(": index ");
      paramBundle.append(i);
      throwException(new IllegalStateException(paramBundle.toString()));
    }
    return localFragment;
  }
  
  public List<Fragment> getFragments()
  {
    if (this.mAdded.isEmpty()) {
      return Collections.emptyList();
    }
    synchronized (this.mAdded)
    {
      List localList = (List)this.mAdded.clone();
      return localList;
    }
  }
  
  LayoutInflater.Factory2 getLayoutInflaterFactory()
  {
    return this;
  }
  
  public Fragment getPrimaryNavigationFragment()
  {
    return this.mPrimaryNav;
  }
  
  public void hideFragment(Fragment paramFragment)
  {
    if (DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("hide: ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (!paramFragment.mHidden)
    {
      paramFragment.mHidden = true;
      paramFragment.mHiddenChanged = (true ^ paramFragment.mHiddenChanged);
    }
  }
  
  public boolean isDestroyed()
  {
    return this.mDestroyed;
  }
  
  boolean isStateAtLeast(int paramInt)
  {
    boolean bool;
    if (this.mCurState >= paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isStateSaved()
  {
    boolean bool;
    if ((!this.mStateSaved) && (!this.mStopped)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  AnimationOrAnimator loadAnimation(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int k = paramFragment.getNextAnim();
    Animation localAnimation = paramFragment.onCreateAnimation(paramInt1, paramBoolean, k);
    if (localAnimation != null) {
      return new AnimationOrAnimator(localAnimation);
    }
    paramFragment = paramFragment.onCreateAnimator(paramInt1, paramBoolean, k);
    if (paramFragment != null) {
      return new AnimationOrAnimator(paramFragment);
    }
    if (k != 0)
    {
      boolean bool = "anim".equals(this.mHost.getContext().getResources().getResourceTypeName(k));
      int j = 0;
      int i = j;
      if (bool) {
        try
        {
          paramFragment = AnimationUtils.loadAnimation(this.mHost.getContext(), k);
          if (paramFragment != null)
          {
            paramFragment = new AnimationOrAnimator(paramFragment);
            return paramFragment;
          }
          i = 1;
        }
        catch (RuntimeException paramFragment)
        {
          i = j;
        }
        catch (Resources.NotFoundException paramFragment)
        {
          throw paramFragment;
        }
      }
      if (i == 0) {
        try
        {
          paramFragment = AnimatorInflater.loadAnimator(this.mHost.getContext(), k);
          if (paramFragment != null)
          {
            paramFragment = new AnimationOrAnimator(paramFragment);
            return paramFragment;
          }
        }
        catch (RuntimeException paramFragment)
        {
          if (!bool)
          {
            paramFragment = AnimationUtils.loadAnimation(this.mHost.getContext(), k);
            if (paramFragment != null) {
              return new AnimationOrAnimator(paramFragment);
            }
          }
          else
          {
            throw paramFragment;
          }
        }
      }
    }
    localAnimation = null;
    if (paramInt1 == 0) {
      return null;
    }
    paramInt1 = transitToStyleIndex(paramInt1, paramBoolean);
    if (paramInt1 < 0) {
      return null;
    }
    switch (paramInt1)
    {
    default: 
      paramFragment = localAnimation;
      if (paramInt2 == 0)
      {
        paramFragment = localAnimation;
        if (this.mHost.onHasWindowAnimations())
        {
          this.mHost.onGetWindowAnimations();
          paramFragment = localAnimation;
        }
      }
      break;
    case 6: 
      return makeFadeAnimation(this.mHost.getContext(), 1.0F, 0.0F);
    case 5: 
      return makeFadeAnimation(this.mHost.getContext(), 0.0F, 1.0F);
    case 4: 
      return makeOpenCloseAnimation(this.mHost.getContext(), 1.0F, 1.075F, 1.0F, 0.0F);
    case 3: 
      return makeOpenCloseAnimation(this.mHost.getContext(), 0.975F, 1.0F, 0.0F, 1.0F);
    case 2: 
      return makeOpenCloseAnimation(this.mHost.getContext(), 1.0F, 0.975F, 1.0F, 0.0F);
    case 1: 
      paramFragment = makeOpenCloseAnimation(this.mHost.getContext(), 1.125F, 1.0F, 0.0F, 1.0F);
    }
    return paramFragment;
  }
  
  void makeActive(Fragment paramFragment)
  {
    if (paramFragment.mIndex >= 0) {
      return;
    }
    int i = this.mNextFragmentIndex;
    this.mNextFragmentIndex = (i + 1);
    paramFragment.setIndex(i, this.mParent);
    if (this.mActive == null) {
      this.mActive = new SparseArray();
    }
    this.mActive.put(paramFragment.mIndex, paramFragment);
    if (DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Allocated fragment index ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  void makeInactive(Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0) {
      return;
    }
    if (DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Freeing fragment index ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    this.mActive.put(paramFragment.mIndex, null);
    paramFragment.initState();
  }
  
  void moveFragmentToExpectedState(Fragment paramFragment)
  {
    if (paramFragment == null) {
      return;
    }
    int j = this.mCurState;
    int i = j;
    if (paramFragment.mRemoving) {
      if (paramFragment.isInBackStack()) {
        i = Math.min(j, 1);
      } else {
        i = Math.min(j, 0);
      }
    }
    moveToState(paramFragment, i, paramFragment.getNextTransition(), paramFragment.getNextTransitionStyle(), false);
    if (paramFragment.mView != null)
    {
      Object localObject = findFragmentUnder(paramFragment);
      if (localObject != null)
      {
        View localView = ((Fragment)localObject).mView;
        localObject = paramFragment.mContainer;
        i = ((ViewGroup)localObject).indexOfChild(localView);
        j = ((ViewGroup)localObject).indexOfChild(paramFragment.mView);
        if (j < i)
        {
          ((ViewGroup)localObject).removeViewAt(j);
          ((ViewGroup)localObject).addView(paramFragment.mView, i);
        }
      }
      if ((paramFragment.mIsNewlyAdded) && (paramFragment.mContainer != null))
      {
        if (paramFragment.mPostponedAlpha > 0.0F) {
          paramFragment.mView.setAlpha(paramFragment.mPostponedAlpha);
        }
        paramFragment.mPostponedAlpha = 0.0F;
        paramFragment.mIsNewlyAdded = false;
        localObject = loadAnimation(paramFragment, paramFragment.getNextTransition(), true, paramFragment.getNextTransitionStyle());
        if (localObject != null)
        {
          setHWLayerAnimListenerIfAlpha(paramFragment.mView, (AnimationOrAnimator)localObject);
          if (((AnimationOrAnimator)localObject).animation != null)
          {
            paramFragment.mView.startAnimation(((AnimationOrAnimator)localObject).animation);
          }
          else
          {
            ((AnimationOrAnimator)localObject).animator.setTarget(paramFragment.mView);
            ((AnimationOrAnimator)localObject).animator.start();
          }
        }
      }
    }
    if (paramFragment.mHiddenChanged) {
      completeShowHideFragment(paramFragment);
    }
  }
  
  void moveToState(int paramInt, boolean paramBoolean)
  {
    if ((this.mHost == null) && (paramInt != 0)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (paramInt == this.mCurState)) {
      return;
    }
    this.mCurState = paramInt;
    if (this.mActive != null)
    {
      int i = this.mAdded.size();
      for (paramInt = 0; paramInt < i; paramInt++) {
        moveFragmentToExpectedState((Fragment)this.mAdded.get(paramInt));
      }
      i = this.mActive.size();
      Object localObject;
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        localObject = (Fragment)this.mActive.valueAt(paramInt);
        if ((localObject != null) && ((((Fragment)localObject).mRemoving) || (((Fragment)localObject).mDetached)) && (!((Fragment)localObject).mIsNewlyAdded)) {
          moveFragmentToExpectedState((Fragment)localObject);
        }
      }
      startPendingDeferredFragments();
      if (this.mNeedMenuInvalidate)
      {
        localObject = this.mHost;
        if ((localObject != null) && (this.mCurState == 4))
        {
          ((FragmentHostCallback)localObject).onSupportInvalidateOptionsMenu();
          this.mNeedMenuInvalidate = false;
        }
      }
    }
  }
  
  void moveToState(Fragment paramFragment)
  {
    moveToState(paramFragment, this.mCurState, 0, 0, false);
  }
  
  void moveToState(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    boolean bool2 = paramFragment.mAdded;
    int j = 1;
    boolean bool1 = true;
    if ((bool2) && (!paramFragment.mDetached)) {
      break label44;
    }
    int i = paramInt1;
    paramInt1 = i;
    if (i > 1) {
      paramInt1 = 1;
    }
    label44:
    i = paramInt1;
    if (paramFragment.mRemoving)
    {
      i = paramInt1;
      if (paramInt1 > paramFragment.mState) {
        if ((paramFragment.mState == 0) && (paramFragment.isInBackStack())) {
          i = 1;
        } else {
          i = paramFragment.mState;
        }
      }
    }
    if ((paramFragment.mDeferStart) && (paramFragment.mState < 3) && (i > 2)) {
      paramInt1 = 2;
    } else {
      paramInt1 = i;
    }
    Object localObject2;
    if (paramFragment.mState <= paramInt1)
    {
      if ((paramFragment.mFromLayout) && (!paramFragment.mInLayout)) {
        return;
      }
      if ((paramFragment.getAnimatingAway() != null) || (paramFragment.getAnimator() != null))
      {
        paramFragment.setAnimatingAway(null);
        paramFragment.setAnimator(null);
        moveToState(paramFragment, paramFragment.getStateAfterAnimating(), 0, 0, true);
      }
      i = paramFragment.mState;
      Object localObject1;
      if (i != 0)
      {
        paramInt2 = paramInt1;
        if (i != 1)
        {
          paramInt3 = paramInt1;
          if (i == 2) {
            break label1220;
          }
          paramInt2 = paramInt1;
          if (i == 3) {
            break label1284;
          }
          i = paramInt1;
          break label1969;
        }
      }
      else
      {
        paramInt2 = paramInt1;
        if (paramInt1 > 0)
        {
          if (DEBUG)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("moveto CREATED: ");
            ((StringBuilder)localObject1).append(paramFragment);
            Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
          }
          paramInt2 = paramInt1;
          if (paramFragment.mSavedFragmentState != null)
          {
            paramFragment.mSavedFragmentState.setClassLoader(this.mHost.getContext().getClassLoader());
            paramFragment.mSavedViewState = paramFragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            paramFragment.mTarget = getFragment(paramFragment.mSavedFragmentState, "android:target_state");
            if (paramFragment.mTarget != null) {
              paramFragment.mTargetRequestCode = paramFragment.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            if (paramFragment.mSavedUserVisibleHint != null)
            {
              paramFragment.mUserVisibleHint = paramFragment.mSavedUserVisibleHint.booleanValue();
              paramFragment.mSavedUserVisibleHint = null;
            }
            else
            {
              paramFragment.mUserVisibleHint = paramFragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            paramInt2 = paramInt1;
            if (!paramFragment.mUserVisibleHint)
            {
              paramFragment.mDeferStart = true;
              paramInt2 = paramInt1;
              if (paramInt1 > 2) {
                paramInt2 = 2;
              }
            }
          }
          paramFragment.mHost = this.mHost;
          paramFragment.mParentFragment = this.mParent;
          localObject1 = this.mParent;
          if (localObject1 != null) {
            localObject1 = ((Fragment)localObject1).mChildFragmentManager;
          } else {
            localObject1 = this.mHost.getFragmentManagerImpl();
          }
          paramFragment.mFragmentManager = ((FragmentManagerImpl)localObject1);
          if (paramFragment.mTarget != null) {
            if (this.mActive.get(paramFragment.mTarget.mIndex) == paramFragment.mTarget)
            {
              if (paramFragment.mTarget.mState < 1) {
                moveToState(paramFragment.mTarget, 1, 0, 0, true);
              }
            }
            else
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Fragment ");
              ((StringBuilder)localObject1).append(paramFragment);
              ((StringBuilder)localObject1).append(" declared target fragment ");
              ((StringBuilder)localObject1).append(paramFragment.mTarget);
              ((StringBuilder)localObject1).append(" that does not belong to this FragmentManager!");
              throw new IllegalStateException(((StringBuilder)localObject1).toString());
            }
          }
          dispatchOnFragmentPreAttached(paramFragment, this.mHost.getContext(), false);
          paramFragment.mCalled = false;
          paramFragment.onAttach(this.mHost.getContext());
          if (paramFragment.mCalled)
          {
            if (paramFragment.mParentFragment == null) {
              this.mHost.onAttachFragment(paramFragment);
            } else {
              paramFragment.mParentFragment.onAttachFragment(paramFragment);
            }
            dispatchOnFragmentAttached(paramFragment, this.mHost.getContext(), false);
            if (!paramFragment.mIsCreated)
            {
              dispatchOnFragmentPreCreated(paramFragment, paramFragment.mSavedFragmentState, false);
              paramFragment.performCreate(paramFragment.mSavedFragmentState);
              dispatchOnFragmentCreated(paramFragment, paramFragment.mSavedFragmentState, false);
            }
            else
            {
              paramFragment.restoreChildFragmentState(paramFragment.mSavedFragmentState);
              paramFragment.mState = 1;
            }
            paramFragment.mRetaining = false;
          }
          else
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Fragment ");
            ((StringBuilder)localObject1).append(paramFragment);
            ((StringBuilder)localObject1).append(" did not call through to super.onAttach()");
            throw new SuperNotCalledException(((StringBuilder)localObject1).toString());
          }
        }
      }
      ensureInflatedFragmentView(paramFragment);
      paramInt3 = paramInt2;
      if (paramInt2 > 1)
      {
        if (DEBUG)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("moveto ACTIVITY_CREATED: ");
          ((StringBuilder)localObject1).append(paramFragment);
          Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
        }
        if (!paramFragment.mFromLayout)
        {
          if (paramFragment.mContainerId != 0)
          {
            if (paramFragment.mContainerId == -1)
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Cannot create fragment ");
              ((StringBuilder)localObject1).append(paramFragment);
              ((StringBuilder)localObject1).append(" for a container view with no id");
              throwException(new IllegalArgumentException(((StringBuilder)localObject1).toString()));
            }
            ViewGroup localViewGroup = (ViewGroup)this.mContainer.onFindViewById(paramFragment.mContainerId);
            localObject1 = localViewGroup;
            if (localViewGroup == null)
            {
              localObject1 = localViewGroup;
              if (!paramFragment.mRestored)
              {
                try
                {
                  localObject1 = paramFragment.getResources().getResourceName(paramFragment.mContainerId);
                }
                catch (Resources.NotFoundException localNotFoundException)
                {
                  localObject2 = "unknown";
                }
                StringBuilder localStringBuilder = new StringBuilder();
                localStringBuilder.append("No view found for id 0x");
                localStringBuilder.append(Integer.toHexString(paramFragment.mContainerId));
                localStringBuilder.append(" (");
                localStringBuilder.append((String)localObject2);
                localStringBuilder.append(") for fragment ");
                localStringBuilder.append(paramFragment);
                throwException(new IllegalArgumentException(localStringBuilder.toString()));
                localObject2 = localViewGroup;
              }
            }
          }
          else
          {
            localObject2 = null;
          }
          paramFragment.mContainer = ((ViewGroup)localObject2);
          paramFragment.performCreateView(paramFragment.performGetLayoutInflater(paramFragment.mSavedFragmentState), (ViewGroup)localObject2, paramFragment.mSavedFragmentState);
          if (paramFragment.mView != null)
          {
            paramFragment.mInnerView = paramFragment.mView;
            paramFragment.mView.setSaveFromParentEnabled(false);
            if (localObject2 != null) {
              ((ViewGroup)localObject2).addView(paramFragment.mView);
            }
            if (paramFragment.mHidden) {
              paramFragment.mView.setVisibility(8);
            }
            paramFragment.onViewCreated(paramFragment.mView, paramFragment.mSavedFragmentState);
            dispatchOnFragmentViewCreated(paramFragment, paramFragment.mView, paramFragment.mSavedFragmentState, false);
            if ((paramFragment.mView.getVisibility() == 0) && (paramFragment.mContainer != null)) {
              paramBoolean = bool1;
            } else {
              paramBoolean = false;
            }
            paramFragment.mIsNewlyAdded = paramBoolean;
          }
          else
          {
            paramFragment.mInnerView = null;
          }
        }
        paramFragment.performActivityCreated(paramFragment.mSavedFragmentState);
        dispatchOnFragmentActivityCreated(paramFragment, paramFragment.mSavedFragmentState, false);
        if (paramFragment.mView != null) {
          paramFragment.restoreViewState(paramFragment.mSavedFragmentState);
        }
        paramFragment.mSavedFragmentState = null;
        paramInt3 = paramInt2;
      }
      label1220:
      paramInt2 = paramInt3;
      if (paramInt3 > 2)
      {
        if (DEBUG)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("moveto STARTED: ");
          ((StringBuilder)localObject2).append(paramFragment);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        paramFragment.performStart();
        dispatchOnFragmentStarted(paramFragment, false);
        paramInt2 = paramInt3;
      }
      label1284:
      i = paramInt2;
      if (paramInt2 > 3)
      {
        if (DEBUG)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("moveto RESUMED: ");
          ((StringBuilder)localObject2).append(paramFragment);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        paramFragment.performResume();
        dispatchOnFragmentResumed(paramFragment, false);
        paramFragment.mSavedFragmentState = null;
        paramFragment.mSavedViewState = null;
        i = paramInt2;
      }
    }
    else
    {
      i = paramInt1;
      if (paramFragment.mState > paramInt1)
      {
        i = paramFragment.mState;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 4)
              {
                i = paramInt1;
                break label1969;
              }
              if (paramInt1 < 4)
              {
                if (DEBUG)
                {
                  localObject2 = new StringBuilder();
                  ((StringBuilder)localObject2).append("movefrom RESUMED: ");
                  ((StringBuilder)localObject2).append(paramFragment);
                  Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
                }
                paramFragment.performPause();
                dispatchOnFragmentPaused(paramFragment, false);
              }
            }
            if (paramInt1 < 3)
            {
              if (DEBUG)
              {
                localObject2 = new StringBuilder();
                ((StringBuilder)localObject2).append("movefrom STARTED: ");
                ((StringBuilder)localObject2).append(paramFragment);
                Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
              }
              paramFragment.performStop();
              dispatchOnFragmentStopped(paramFragment, false);
            }
          }
          if (paramInt1 < 2)
          {
            if (DEBUG)
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("movefrom ACTIVITY_CREATED: ");
              ((StringBuilder)localObject2).append(paramFragment);
              Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
            }
            if ((paramFragment.mView != null) && (this.mHost.onShouldSaveFragmentState(paramFragment)) && (paramFragment.mSavedViewState == null)) {
              saveFragmentViewState(paramFragment);
            }
            paramFragment.performDestroyView();
            dispatchOnFragmentViewDestroyed(paramFragment, false);
            if ((paramFragment.mView != null) && (paramFragment.mContainer != null))
            {
              paramFragment.mContainer.endViewTransition(paramFragment.mView);
              paramFragment.mView.clearAnimation();
              if ((this.mCurState > 0) && (!this.mDestroyed) && (paramFragment.mView.getVisibility() == 0) && (paramFragment.mPostponedAlpha >= 0.0F)) {
                localObject2 = loadAnimation(paramFragment, paramInt2, false, paramInt3);
              } else {
                localObject2 = null;
              }
              paramFragment.mPostponedAlpha = 0.0F;
              if (localObject2 != null) {
                animateRemoveFragment(paramFragment, (AnimationOrAnimator)localObject2, paramInt1);
              }
              paramFragment.mContainer.removeView(paramFragment.mView);
            }
            paramFragment.mContainer = null;
            paramFragment.mView = null;
            paramFragment.mViewLifecycleOwner = null;
            paramFragment.mViewLifecycleOwnerLiveData.setValue(null);
            paramFragment.mInnerView = null;
            paramFragment.mInLayout = false;
          }
        }
        i = paramInt1;
        if (paramInt1 < 1)
        {
          if (this.mDestroyed) {
            if (paramFragment.getAnimatingAway() != null)
            {
              localObject2 = paramFragment.getAnimatingAway();
              paramFragment.setAnimatingAway(null);
              ((View)localObject2).clearAnimation();
            }
            else if (paramFragment.getAnimator() != null)
            {
              localObject2 = paramFragment.getAnimator();
              paramFragment.setAnimator(null);
              ((Animator)localObject2).cancel();
            }
          }
          if ((paramFragment.getAnimatingAway() == null) && (paramFragment.getAnimator() == null))
          {
            if (DEBUG)
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("movefrom CREATED: ");
              ((StringBuilder)localObject2).append(paramFragment);
              Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
            }
            if (!paramFragment.mRetaining)
            {
              paramFragment.performDestroy();
              dispatchOnFragmentDestroyed(paramFragment, false);
            }
            else
            {
              paramFragment.mState = 0;
            }
            paramFragment.performDetach();
            dispatchOnFragmentDetached(paramFragment, false);
            i = paramInt1;
            if (!paramBoolean) {
              if (!paramFragment.mRetaining)
              {
                makeInactive(paramFragment);
                i = paramInt1;
              }
              else
              {
                paramFragment.mHost = null;
                paramFragment.mParentFragment = null;
                paramFragment.mFragmentManager = null;
                i = paramInt1;
              }
            }
          }
          else
          {
            paramFragment.setStateAfterAnimating(paramInt1);
            i = j;
          }
        }
      }
    }
    label1969:
    if (paramFragment.mState != i)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("moveToState: Fragment state for ");
      ((StringBuilder)localObject2).append(paramFragment);
      ((StringBuilder)localObject2).append(" not updated inline; ");
      ((StringBuilder)localObject2).append("expected state ");
      ((StringBuilder)localObject2).append(i);
      ((StringBuilder)localObject2).append(" found ");
      ((StringBuilder)localObject2).append(paramFragment.mState);
      Log.w("FragmentManager", ((StringBuilder)localObject2).toString());
      paramFragment.mState = i;
    }
  }
  
  public void noteStateNotSaved()
  {
    this.mSavedNonConfig = null;
    int i = 0;
    this.mStateSaved = false;
    this.mStopped = false;
    int j = this.mAdded.size();
    while (i < j)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment != null) {
        localFragment.noteStateNotSaved();
      }
      i++;
    }
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString)) {
      return null;
    }
    paramString = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, FragmentTag.Fragment);
    int i = 0;
    String str1 = paramString;
    if (paramString == null) {
      str1 = localTypedArray.getString(0);
    }
    int k = localTypedArray.getResourceId(1, -1);
    String str2 = localTypedArray.getString(2);
    localTypedArray.recycle();
    if (!Fragment.isSupportFragmentClass(this.mHost.getContext(), str1)) {
      return null;
    }
    if (paramView != null) {
      i = paramView.getId();
    }
    if ((i == -1) && (k == -1) && (str2 == null))
    {
      paramView = new StringBuilder();
      paramView.append(paramAttributeSet.getPositionDescription());
      paramView.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
      paramView.append(str1);
      throw new IllegalArgumentException(paramView.toString());
    }
    if (k != -1) {
      paramView = findFragmentById(k);
    } else {
      paramView = null;
    }
    paramString = paramView;
    if (paramView == null)
    {
      paramString = paramView;
      if (str2 != null) {
        paramString = findFragmentByTag(str2);
      }
    }
    paramView = paramString;
    if (paramString == null)
    {
      paramView = paramString;
      if (i != -1) {
        paramView = findFragmentById(i);
      }
    }
    if (DEBUG)
    {
      paramString = new StringBuilder();
      paramString.append("onCreateView: id=0x");
      paramString.append(Integer.toHexString(k));
      paramString.append(" fname=");
      paramString.append(str1);
      paramString.append(" existing=");
      paramString.append(paramView);
      Log.v("FragmentManager", paramString.toString());
    }
    if (paramView == null)
    {
      paramString = this.mContainer.instantiate(paramContext, str1, null);
      paramString.mFromLayout = true;
      int j;
      if (k != 0) {
        j = k;
      } else {
        j = i;
      }
      paramString.mFragmentId = j;
      paramString.mContainerId = i;
      paramString.mTag = str2;
      paramString.mInLayout = true;
      paramString.mFragmentManager = this;
      paramString.mHost = this.mHost;
      paramString.onInflate(this.mHost.getContext(), paramAttributeSet, paramString.mSavedFragmentState);
      addFragment(paramString, true);
    }
    else
    {
      if (paramView.mInLayout) {
        break label566;
      }
      paramView.mInLayout = true;
      paramView.mHost = this.mHost;
      paramString = paramView;
      if (!paramView.mRetaining)
      {
        paramView.onInflate(this.mHost.getContext(), paramAttributeSet, paramView.mSavedFragmentState);
        paramString = paramView;
      }
    }
    if ((this.mCurState < 1) && (paramString.mFromLayout)) {
      moveToState(paramString, 1, 0, 0, false);
    } else {
      moveToState(paramString);
    }
    if (paramString.mView != null)
    {
      if (k != 0) {
        paramString.mView.setId(k);
      }
      if (paramString.mView.getTag() == null) {
        paramString.mView.setTag(str2);
      }
      return paramString.mView;
    }
    paramView = new StringBuilder();
    paramView.append("Fragment ");
    paramView.append(str1);
    paramView.append(" did not create a view.");
    throw new IllegalStateException(paramView.toString());
    label566:
    paramView = new StringBuilder();
    paramView.append(paramAttributeSet.getPositionDescription());
    paramView.append(": Duplicate id 0x");
    paramView.append(Integer.toHexString(k));
    paramView.append(", tag ");
    paramView.append(str2);
    paramView.append(", or parent id 0x");
    paramView.append(Integer.toHexString(i));
    paramView.append(" with another fragment for ");
    paramView.append(str1);
    throw new IllegalArgumentException(paramView.toString());
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public void performPendingDeferredStart(Fragment paramFragment)
  {
    if (paramFragment.mDeferStart)
    {
      if (this.mExecutingActions)
      {
        this.mHavePendingDeferredStart = true;
        return;
      }
      paramFragment.mDeferStart = false;
      moveToState(paramFragment, this.mCurState, 0, 0, false);
    }
  }
  
  public void popBackStack()
  {
    enqueueAction(new PopBackStackState(null, -1, 0), false);
  }
  
  public void popBackStack(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      enqueueAction(new PopBackStackState(null, paramInt1, paramInt2), false);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Bad id: ");
    localStringBuilder.append(paramInt1);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void popBackStack(String paramString, int paramInt)
  {
    enqueueAction(new PopBackStackState(paramString, -1, paramInt), false);
  }
  
  public boolean popBackStackImmediate()
  {
    checkStateLoss();
    return popBackStackImmediate(null, -1, 0);
  }
  
  public boolean popBackStackImmediate(int paramInt1, int paramInt2)
  {
    checkStateLoss();
    execPendingActions();
    if (paramInt1 >= 0) {
      return popBackStackImmediate(null, paramInt1, paramInt2);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Bad id: ");
    localStringBuilder.append(paramInt1);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public boolean popBackStackImmediate(String paramString, int paramInt)
  {
    checkStateLoss();
    return popBackStackImmediate(paramString, -1, paramInt);
  }
  
  boolean popBackStackState(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = this.mBackStack;
    if (localObject == null) {
      return false;
    }
    if ((paramString == null) && (paramInt1 < 0) && ((paramInt2 & 0x1) == 0))
    {
      paramInt1 = ((ArrayList)localObject).size() - 1;
      if (paramInt1 < 0) {
        return false;
      }
      paramArrayList.add(this.mBackStack.remove(paramInt1));
      paramArrayList1.add(Boolean.valueOf(true));
    }
    else
    {
      if ((paramString == null) && (paramInt1 < 0))
      {
        paramInt1 = -1;
      }
      else
      {
        for (int i = ((ArrayList)localObject).size() - 1; i >= 0; i--)
        {
          localObject = (BackStackRecord)this.mBackStack.get(i);
          if (((paramString != null) && (paramString.equals(((BackStackRecord)localObject).getName()))) || ((paramInt1 >= 0) && (paramInt1 == ((BackStackRecord)localObject).mIndex))) {
            break;
          }
        }
        if (i < 0) {
          return false;
        }
        int j = i;
        if ((paramInt2 & 0x1) != 0) {
          for (;;)
          {
            paramInt2 = i - 1;
            j = paramInt2;
            if (paramInt2 < 0) {
              break;
            }
            localObject = (BackStackRecord)this.mBackStack.get(paramInt2);
            if (paramString != null)
            {
              i = paramInt2;
              if (paramString.equals(((BackStackRecord)localObject).getName())) {}
            }
            else
            {
              j = paramInt2;
              if (paramInt1 < 0) {
                break;
              }
              j = paramInt2;
              if (paramInt1 != ((BackStackRecord)localObject).mIndex) {
                break;
              }
              i = paramInt2;
            }
          }
        }
        paramInt1 = j;
      }
      if (paramInt1 == this.mBackStack.size() - 1) {
        return false;
      }
      for (paramInt2 = this.mBackStack.size() - 1; paramInt2 > paramInt1; paramInt2--)
      {
        paramArrayList.add(this.mBackStack.remove(paramInt2));
        paramArrayList1.add(Boolean.valueOf(true));
      }
    }
    return true;
  }
  
  public void putFragment(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Fragment ");
      localStringBuilder.append(paramFragment);
      localStringBuilder.append(" is not currently in the FragmentManager");
      throwException(new IllegalStateException(localStringBuilder.toString()));
    }
    paramBundle.putInt(paramString, paramFragment.mIndex);
  }
  
  public void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks, boolean paramBoolean)
  {
    this.mLifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(paramFragmentLifecycleCallbacks, paramBoolean));
  }
  
  public void removeFragment(Fragment paramFragment)
  {
    if (DEBUG)
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("remove: ");
      ((StringBuilder)???).append(paramFragment);
      ((StringBuilder)???).append(" nesting=");
      ((StringBuilder)???).append(paramFragment.mBackStackNesting);
      Log.v("FragmentManager", ((StringBuilder)???).toString());
    }
    boolean bool = paramFragment.isInBackStack();
    if ((!paramFragment.mDetached) || ((bool ^ true))) {}
    synchronized (this.mAdded)
    {
      this.mAdded.remove(paramFragment);
      if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
        this.mNeedMenuInvalidate = true;
      }
      paramFragment.mAdded = false;
      paramFragment.mRemoving = true;
      return;
    }
  }
  
  public void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener paramOnBackStackChangedListener)
  {
    ArrayList localArrayList = this.mBackStackChangeListeners;
    if (localArrayList != null) {
      localArrayList.remove(paramOnBackStackChangedListener);
    }
  }
  
  void reportBackStackChanged()
  {
    if (this.mBackStackChangeListeners != null) {
      for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
        ((FragmentManager.OnBackStackChangedListener)this.mBackStackChangeListeners.get(i)).onBackStackChanged();
      }
    }
  }
  
  void restoreAllState(Parcelable paramParcelable, FragmentManagerNonConfig arg2)
  {
    if (paramParcelable == null) {
      return;
    }
    FragmentManagerState localFragmentManagerState = (FragmentManagerState)paramParcelable;
    if (localFragmentManagerState.mActive == null) {
      return;
    }
    Object localObject4;
    Object localObject2;
    Object localObject3;
    int j;
    if (??? != null)
    {
      localObject4 = ???.getFragments();
      localObject2 = ???.getChildNonConfigs();
      localObject3 = ???.getViewModelStores();
      if (localObject4 != null) {
        i = ((List)localObject4).size();
      } else {
        i = 0;
      }
      for (j = 0;; j++)
      {
        localObject1 = localObject2;
        paramParcelable = (Parcelable)localObject3;
        if (j >= i) {
          break;
        }
        paramParcelable = (Fragment)((List)localObject4).get(j);
        if (DEBUG)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("restoreAllState: re-attaching retained ");
          ((StringBuilder)localObject1).append(paramParcelable);
          Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
        }
        for (int k = 0; (k < localFragmentManagerState.mActive.length) && (localFragmentManagerState.mActive[k].mIndex != paramParcelable.mIndex); k++) {}
        if (k == localFragmentManagerState.mActive.length)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Could not find active fragment with index ");
          ((StringBuilder)localObject1).append(paramParcelable.mIndex);
          throwException(new IllegalStateException(((StringBuilder)localObject1).toString()));
        }
        localObject1 = localFragmentManagerState.mActive[k];
        ((FragmentState)localObject1).mInstance = paramParcelable;
        paramParcelable.mSavedViewState = null;
        paramParcelable.mBackStackNesting = 0;
        paramParcelable.mInLayout = false;
        paramParcelable.mAdded = false;
        paramParcelable.mTarget = null;
        if (((FragmentState)localObject1).mSavedFragmentState != null)
        {
          ((FragmentState)localObject1).mSavedFragmentState.setClassLoader(this.mHost.getContext().getClassLoader());
          paramParcelable.mSavedViewState = ((FragmentState)localObject1).mSavedFragmentState.getSparseParcelableArray("android:view_state");
          paramParcelable.mSavedFragmentState = ((FragmentState)localObject1).mSavedFragmentState;
        }
      }
    }
    Object localObject1 = null;
    paramParcelable = null;
    this.mActive = new SparseArray(localFragmentManagerState.mActive.length);
    for (int i = 0; i < localFragmentManagerState.mActive.length; i++)
    {
      localObject4 = localFragmentManagerState.mActive[i];
      if (localObject4 != null)
      {
        if ((localObject1 != null) && (i < ((List)localObject1).size())) {
          localObject2 = (FragmentManagerNonConfig)((List)localObject1).get(i);
        } else {
          localObject2 = null;
        }
        if ((paramParcelable != null) && (i < paramParcelable.size())) {
          localObject3 = (ViewModelStore)paramParcelable.get(i);
        } else {
          localObject3 = null;
        }
        localObject2 = ((FragmentState)localObject4).instantiate(this.mHost, this.mContainer, this.mParent, (FragmentManagerNonConfig)localObject2, (ViewModelStore)localObject3);
        if (DEBUG)
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("restoreAllState: active #");
          ((StringBuilder)localObject3).append(i);
          ((StringBuilder)localObject3).append(": ");
          ((StringBuilder)localObject3).append(localObject2);
          Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
        }
        this.mActive.put(((Fragment)localObject2).mIndex, localObject2);
        ((FragmentState)localObject4).mInstance = null;
      }
    }
    if (??? != null)
    {
      ??? = ???.getFragments();
      if (??? != null) {
        i = ???.size();
      } else {
        i = 0;
      }
      for (j = 0; j < i; j++)
      {
        paramParcelable = (Fragment)???.get(j);
        if (paramParcelable.mTargetIndex >= 0)
        {
          paramParcelable.mTarget = ((Fragment)this.mActive.get(paramParcelable.mTargetIndex));
          if (paramParcelable.mTarget == null)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Re-attaching retained fragment ");
            ((StringBuilder)localObject1).append(paramParcelable);
            ((StringBuilder)localObject1).append(" target no longer exists: ");
            ((StringBuilder)localObject1).append(paramParcelable.mTargetIndex);
            Log.w("FragmentManager", ((StringBuilder)localObject1).toString());
          }
        }
      }
    }
    this.mAdded.clear();
    if (localFragmentManagerState.mAdded != null)
    {
      i = 0;
      for (;;)
      {
        if (i >= localFragmentManagerState.mAdded.length) {
          break label882;
        }
        paramParcelable = (Fragment)this.mActive.get(localFragmentManagerState.mAdded[i]);
        if (paramParcelable == null)
        {
          ??? = new StringBuilder();
          ???.append("No instantiated fragment for index #");
          ???.append(localFragmentManagerState.mAdded[i]);
          throwException(new IllegalStateException(???.toString()));
        }
        paramParcelable.mAdded = true;
        if (DEBUG)
        {
          ??? = new StringBuilder();
          ???.append("restoreAllState: added #");
          ???.append(i);
          ???.append(": ");
          ???.append(paramParcelable);
          Log.v("FragmentManager", ???.toString());
        }
        if (!this.mAdded.contains(paramParcelable)) {
          synchronized (this.mAdded)
          {
            this.mAdded.add(paramParcelable);
            i++;
          }
        }
      }
      throw new IllegalStateException("Already added!");
    }
    label882:
    if (localFragmentManagerState.mBackStack != null)
    {
      this.mBackStack = new ArrayList(localFragmentManagerState.mBackStack.length);
      for (i = 0; i < localFragmentManagerState.mBackStack.length; i++)
      {
        paramParcelable = localFragmentManagerState.mBackStack[i].instantiate(this);
        if (DEBUG)
        {
          ??? = new StringBuilder();
          ???.append("restoreAllState: back stack #");
          ???.append(i);
          ???.append(" (index ");
          ???.append(paramParcelable.mIndex);
          ???.append("): ");
          ???.append(paramParcelable);
          Log.v("FragmentManager", ???.toString());
          ??? = new PrintWriter(new LogWriter("FragmentManager"));
          paramParcelable.dump("  ", ???, false);
          ???.close();
        }
        this.mBackStack.add(paramParcelable);
        if (paramParcelable.mIndex >= 0) {
          setBackStackIndex(paramParcelable.mIndex, paramParcelable);
        }
      }
    }
    this.mBackStack = null;
    if (localFragmentManagerState.mPrimaryNavActiveIndex >= 0) {
      this.mPrimaryNav = ((Fragment)this.mActive.get(localFragmentManagerState.mPrimaryNavActiveIndex));
    }
    this.mNextFragmentIndex = localFragmentManagerState.mNextFragmentIndex;
  }
  
  FragmentManagerNonConfig retainNonConfig()
  {
    setRetaining(this.mSavedNonConfig);
    return this.mSavedNonConfig;
  }
  
  Parcelable saveAllState()
  {
    forcePostponedTransactions();
    endAnimatingAwayFragments();
    execPendingActions();
    this.mStateSaved = true;
    Object localObject3 = null;
    this.mSavedNonConfig = null;
    Object localObject1 = this.mActive;
    if ((localObject1 != null) && (((SparseArray)localObject1).size() > 0))
    {
      int m = this.mActive.size();
      FragmentState[] arrayOfFragmentState = new FragmentState[m];
      int k = 0;
      int i = 0;
      int j = 0;
      while (i < m)
      {
        localObject1 = (Fragment)this.mActive.valueAt(i);
        if (localObject1 != null)
        {
          if (((Fragment)localObject1).mIndex < 0)
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("Failure saving state: active ");
            ((StringBuilder)localObject2).append(localObject1);
            ((StringBuilder)localObject2).append(" has cleared index: ");
            ((StringBuilder)localObject2).append(((Fragment)localObject1).mIndex);
            throwException(new IllegalStateException(((StringBuilder)localObject2).toString()));
          }
          localObject2 = new FragmentState((Fragment)localObject1);
          arrayOfFragmentState[i] = localObject2;
          if ((((Fragment)localObject1).mState > 0) && (((FragmentState)localObject2).mSavedFragmentState == null))
          {
            ((FragmentState)localObject2).mSavedFragmentState = saveFragmentBasicState((Fragment)localObject1);
            if (((Fragment)localObject1).mTarget != null)
            {
              if (((Fragment)localObject1).mTarget.mIndex < 0)
              {
                localObject4 = new StringBuilder();
                ((StringBuilder)localObject4).append("Failure saving state: ");
                ((StringBuilder)localObject4).append(localObject1);
                ((StringBuilder)localObject4).append(" has target not in fragment manager: ");
                ((StringBuilder)localObject4).append(((Fragment)localObject1).mTarget);
                throwException(new IllegalStateException(((StringBuilder)localObject4).toString()));
              }
              if (((FragmentState)localObject2).mSavedFragmentState == null) {
                ((FragmentState)localObject2).mSavedFragmentState = new Bundle();
              }
              putFragment(((FragmentState)localObject2).mSavedFragmentState, "android:target_state", ((Fragment)localObject1).mTarget);
              if (((Fragment)localObject1).mTargetRequestCode != 0) {
                ((FragmentState)localObject2).mSavedFragmentState.putInt("android:target_req_state", ((Fragment)localObject1).mTargetRequestCode);
              }
            }
          }
          else
          {
            ((FragmentState)localObject2).mSavedFragmentState = ((Fragment)localObject1).mSavedFragmentState;
          }
          if (DEBUG)
          {
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("Saved state of ");
            ((StringBuilder)localObject4).append(localObject1);
            ((StringBuilder)localObject4).append(": ");
            ((StringBuilder)localObject4).append(((FragmentState)localObject2).mSavedFragmentState);
            Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
          }
          j = 1;
        }
        i++;
      }
      if (j == 0)
      {
        if (DEBUG) {
          Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return null;
      }
      j = this.mAdded.size();
      if (j > 0)
      {
        localObject2 = new int[j];
        for (i = 0;; i++)
        {
          localObject1 = localObject2;
          if (i >= j) {
            break;
          }
          localObject2[i] = ((Fragment)this.mAdded.get(i)).mIndex;
          if (localObject2[i] < 0)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("Failure saving state: active ");
            ((StringBuilder)localObject1).append(this.mAdded.get(i));
            ((StringBuilder)localObject1).append(" has cleared index: ");
            ((StringBuilder)localObject1).append(localObject2[i]);
            throwException(new IllegalStateException(((StringBuilder)localObject1).toString()));
          }
          if (DEBUG)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("saveAllState: adding fragment #");
            ((StringBuilder)localObject1).append(i);
            ((StringBuilder)localObject1).append(": ");
            ((StringBuilder)localObject1).append(this.mAdded.get(i));
            Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
          }
        }
      }
      localObject1 = null;
      Object localObject4 = this.mBackStack;
      Object localObject2 = localObject3;
      if (localObject4 != null)
      {
        j = ((ArrayList)localObject4).size();
        localObject2 = localObject3;
        if (j > 0)
        {
          localObject3 = new BackStackState[j];
          for (i = k;; i++)
          {
            localObject2 = localObject3;
            if (i >= j) {
              break;
            }
            localObject3[i] = new BackStackState((BackStackRecord)this.mBackStack.get(i));
            if (DEBUG)
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("saveAllState: adding back stack #");
              ((StringBuilder)localObject2).append(i);
              ((StringBuilder)localObject2).append(": ");
              ((StringBuilder)localObject2).append(this.mBackStack.get(i));
              Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
            }
          }
        }
      }
      localObject3 = new FragmentManagerState();
      ((FragmentManagerState)localObject3).mActive = arrayOfFragmentState;
      ((FragmentManagerState)localObject3).mAdded = ((int[])localObject1);
      ((FragmentManagerState)localObject3).mBackStack = ((BackStackState[])localObject2);
      localObject1 = this.mPrimaryNav;
      if (localObject1 != null) {
        ((FragmentManagerState)localObject3).mPrimaryNavActiveIndex = ((Fragment)localObject1).mIndex;
      }
      ((FragmentManagerState)localObject3).mNextFragmentIndex = this.mNextFragmentIndex;
      saveNonConfig();
      return (Parcelable)localObject3;
    }
    return null;
  }
  
  Bundle saveFragmentBasicState(Fragment paramFragment)
  {
    if (this.mStateBundle == null) {
      this.mStateBundle = new Bundle();
    }
    paramFragment.performSaveInstanceState(this.mStateBundle);
    dispatchOnFragmentSaveInstanceState(paramFragment, this.mStateBundle, false);
    boolean bool = this.mStateBundle.isEmpty();
    Object localObject2 = null;
    if (!bool)
    {
      localObject2 = this.mStateBundle;
      this.mStateBundle = null;
    }
    if (paramFragment.mView != null) {
      saveFragmentViewState(paramFragment);
    }
    Object localObject1 = localObject2;
    if (paramFragment.mSavedViewState != null)
    {
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new Bundle();
      }
      ((Bundle)localObject1).putSparseParcelableArray("android:view_state", paramFragment.mSavedViewState);
    }
    localObject2 = localObject1;
    if (!paramFragment.mUserVisibleHint)
    {
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new Bundle();
      }
      ((Bundle)localObject2).putBoolean("android:user_visible_hint", paramFragment.mUserVisibleHint);
    }
    return (Bundle)localObject2;
  }
  
  public Fragment.SavedState saveFragmentInstanceState(Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Fragment ");
      ((StringBuilder)localObject1).append(paramFragment);
      ((StringBuilder)localObject1).append(" is not currently in the FragmentManager");
      throwException(new IllegalStateException(((StringBuilder)localObject1).toString()));
    }
    int i = paramFragment.mState;
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (i > 0)
    {
      paramFragment = saveFragmentBasicState(paramFragment);
      localObject1 = localObject2;
      if (paramFragment != null) {
        localObject1 = new Fragment.SavedState(paramFragment);
      }
    }
    return (Fragment.SavedState)localObject1;
  }
  
  void saveFragmentViewState(Fragment paramFragment)
  {
    if (paramFragment.mInnerView == null) {
      return;
    }
    SparseArray localSparseArray = this.mStateArray;
    if (localSparseArray == null) {
      this.mStateArray = new SparseArray();
    } else {
      localSparseArray.clear();
    }
    paramFragment.mInnerView.saveHierarchyState(this.mStateArray);
    if (this.mStateArray.size() > 0)
    {
      paramFragment.mSavedViewState = this.mStateArray;
      this.mStateArray = null;
    }
  }
  
  void saveNonConfig()
  {
    if (this.mActive != null)
    {
      Object localObject1 = null;
      Object localObject3 = null;
      Object localObject2 = localObject3;
      int i = 0;
      for (;;)
      {
        localObject6 = localObject1;
        localObject5 = localObject3;
        localObject4 = localObject2;
        if (i >= this.mActive.size()) {
          break;
        }
        Fragment localFragment = (Fragment)this.mActive.valueAt(i);
        localObject5 = localObject1;
        Object localObject7 = localObject3;
        localObject6 = localObject2;
        if (localFragment != null)
        {
          localObject4 = localObject1;
          int j;
          if (localFragment.mRetainInstance)
          {
            localObject5 = localObject1;
            if (localObject1 == null) {
              localObject5 = new ArrayList();
            }
            ((ArrayList)localObject5).add(localFragment);
            if (localFragment.mTarget != null) {
              j = localFragment.mTarget.mIndex;
            } else {
              j = -1;
            }
            localFragment.mTargetIndex = j;
            localObject4 = localObject5;
            if (DEBUG)
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("retainNonConfig: keeping retained ");
              ((StringBuilder)localObject1).append(localFragment);
              Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
              localObject4 = localObject5;
            }
          }
          if (localFragment.mChildFragmentManager != null)
          {
            localFragment.mChildFragmentManager.saveNonConfig();
            localObject5 = localFragment.mChildFragmentManager.mSavedNonConfig;
          }
          else
          {
            localObject5 = localFragment.mChildNonConfig;
          }
          localObject1 = localObject3;
          if (localObject3 == null)
          {
            localObject1 = localObject3;
            if (localObject5 != null)
            {
              localObject3 = new ArrayList(this.mActive.size());
              for (j = 0;; j++)
              {
                localObject1 = localObject3;
                if (j >= i) {
                  break;
                }
                ((ArrayList)localObject3).add(null);
              }
            }
          }
          if (localObject1 != null) {
            ((ArrayList)localObject1).add(localObject5);
          }
          localObject3 = localObject2;
          if (localObject2 == null)
          {
            localObject3 = localObject2;
            if (localFragment.mViewModelStore != null)
            {
              localObject2 = new ArrayList(this.mActive.size());
              for (j = 0;; j++)
              {
                localObject3 = localObject2;
                if (j >= i) {
                  break;
                }
                ((ArrayList)localObject2).add(null);
              }
            }
          }
          localObject5 = localObject4;
          localObject7 = localObject1;
          localObject6 = localObject3;
          if (localObject3 != null)
          {
            ((ArrayList)localObject3).add(localFragment.mViewModelStore);
            localObject6 = localObject3;
            localObject7 = localObject1;
            localObject5 = localObject4;
          }
        }
        i++;
        localObject1 = localObject5;
        localObject3 = localObject7;
        localObject2 = localObject6;
      }
    }
    Object localObject6 = null;
    Object localObject5 = null;
    Object localObject4 = localObject5;
    if ((localObject6 == null) && (localObject5 == null) && (localObject4 == null)) {
      this.mSavedNonConfig = null;
    } else {
      this.mSavedNonConfig = new FragmentManagerNonConfig((List)localObject6, (List)localObject5, (List)localObject4);
    }
  }
  
  void scheduleCommit()
  {
    try
    {
      ArrayList localArrayList = this.mPostponedTransactions;
      int k = 0;
      int i;
      if ((localArrayList != null) && (!localArrayList.isEmpty())) {
        i = 1;
      } else {
        i = 0;
      }
      localArrayList = this.mPendingActions;
      int j = k;
      if (localArrayList != null)
      {
        j = k;
        if (localArrayList.size() == 1) {
          j = 1;
        }
      }
      if ((i != 0) || (j != 0))
      {
        this.mHost.getHandler().removeCallbacks(this.mExecCommit);
        this.mHost.getHandler().post(this.mExecCommit);
      }
      return;
    }
    finally {}
  }
  
  public void setBackStackIndex(int paramInt, BackStackRecord paramBackStackRecord)
  {
    try
    {
      Object localObject;
      if (this.mBackStackIndices == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.mBackStackIndices = ((ArrayList)localObject);
      }
      int j = this.mBackStackIndices.size();
      int i = j;
      if (paramInt < j)
      {
        if (DEBUG)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Setting back stack index ");
          ((StringBuilder)localObject).append(paramInt);
          ((StringBuilder)localObject).append(" to ");
          ((StringBuilder)localObject).append(paramBackStackRecord);
          Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        }
        this.mBackStackIndices.set(paramInt, paramBackStackRecord);
      }
      else
      {
        while (i < paramInt)
        {
          this.mBackStackIndices.add(null);
          if (this.mAvailBackStackIndices == null)
          {
            localObject = new java/util/ArrayList;
            ((ArrayList)localObject).<init>();
            this.mAvailBackStackIndices = ((ArrayList)localObject);
          }
          if (DEBUG)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            ((StringBuilder)localObject).append("Adding available back stack index ");
            ((StringBuilder)localObject).append(i);
            Log.v("FragmentManager", ((StringBuilder)localObject).toString());
          }
          this.mAvailBackStackIndices.add(Integer.valueOf(i));
          i++;
        }
        if (DEBUG)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Adding back stack index ");
          ((StringBuilder)localObject).append(paramInt);
          ((StringBuilder)localObject).append(" with ");
          ((StringBuilder)localObject).append(paramBackStackRecord);
          Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        }
        this.mBackStackIndices.add(paramBackStackRecord);
      }
      return;
    }
    finally {}
  }
  
  public void setPrimaryNavigationFragment(Fragment paramFragment)
  {
    if ((paramFragment != null) && ((this.mActive.get(paramFragment.mIndex) != paramFragment) || ((paramFragment.mHost != null) && (paramFragment.getFragmentManager() != this))))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Fragment ");
      localStringBuilder.append(paramFragment);
      localStringBuilder.append(" is not an active fragment of FragmentManager ");
      localStringBuilder.append(this);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    this.mPrimaryNav = paramFragment;
  }
  
  public void showFragment(Fragment paramFragment)
  {
    if (DEBUG)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("show: ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (paramFragment.mHidden)
    {
      paramFragment.mHidden = false;
      paramFragment.mHiddenChanged ^= true;
    }
  }
  
  void startPendingDeferredFragments()
  {
    if (this.mActive == null) {
      return;
    }
    for (int i = 0; i < this.mActive.size(); i++)
    {
      Fragment localFragment = (Fragment)this.mActive.valueAt(i);
      if (localFragment != null) {
        performPendingDeferredStart(localFragment);
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    Fragment localFragment = this.mParent;
    if (localFragment != null) {
      DebugUtils.buildShortClassTag(localFragment, localStringBuilder);
    } else {
      DebugUtils.buildShortClassTag(this.mHost, localStringBuilder);
    }
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  public void unregisterFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = this.mLifecycleCallbacks;
    int i = 0;
    try
    {
      int j = this.mLifecycleCallbacks.size();
      while (i < j)
      {
        if (((FragmentLifecycleCallbacksHolder)this.mLifecycleCallbacks.get(i)).mCallback == paramFragmentLifecycleCallbacks)
        {
          this.mLifecycleCallbacks.remove(i);
          break;
        }
        i++;
      }
      return;
    }
    finally {}
  }
  
  private static class AnimateOnHWLayerIfNeededListener
    extends FragmentManagerImpl.AnimationListenerWrapper
  {
    View mView;
    
    AnimateOnHWLayerIfNeededListener(View paramView, Animation.AnimationListener paramAnimationListener)
    {
      super();
      this.mView = paramView;
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      if ((!ViewCompat.isAttachedToWindow(this.mView)) && (Build.VERSION.SDK_INT < 24)) {
        this.mView.setLayerType(0, null);
      } else {
        this.mView.post(new Runnable()
        {
          public void run()
          {
            FragmentManagerImpl.AnimateOnHWLayerIfNeededListener.this.mView.setLayerType(0, null);
          }
        });
      }
      super.onAnimationEnd(paramAnimation);
    }
  }
  
  private static class AnimationListenerWrapper
    implements Animation.AnimationListener
  {
    private final Animation.AnimationListener mWrapped;
    
    AnimationListenerWrapper(Animation.AnimationListener paramAnimationListener)
    {
      this.mWrapped = paramAnimationListener;
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      Animation.AnimationListener localAnimationListener = this.mWrapped;
      if (localAnimationListener != null) {
        localAnimationListener.onAnimationEnd(paramAnimation);
      }
    }
    
    public void onAnimationRepeat(Animation paramAnimation)
    {
      Animation.AnimationListener localAnimationListener = this.mWrapped;
      if (localAnimationListener != null) {
        localAnimationListener.onAnimationRepeat(paramAnimation);
      }
    }
    
    public void onAnimationStart(Animation paramAnimation)
    {
      Animation.AnimationListener localAnimationListener = this.mWrapped;
      if (localAnimationListener != null) {
        localAnimationListener.onAnimationStart(paramAnimation);
      }
    }
  }
  
  private static class AnimationOrAnimator
  {
    public final Animation animation;
    public final Animator animator;
    
    AnimationOrAnimator(Animator paramAnimator)
    {
      this.animation = null;
      this.animator = paramAnimator;
      if (paramAnimator != null) {
        return;
      }
      throw new IllegalStateException("Animator cannot be null");
    }
    
    AnimationOrAnimator(Animation paramAnimation)
    {
      this.animation = paramAnimation;
      this.animator = null;
      if (paramAnimation != null) {
        return;
      }
      throw new IllegalStateException("Animation cannot be null");
    }
  }
  
  private static class AnimatorOnHWLayerIfNeededListener
    extends AnimatorListenerAdapter
  {
    View mView;
    
    AnimatorOnHWLayerIfNeededListener(View paramView)
    {
      this.mView = paramView;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      this.mView.setLayerType(0, null);
      paramAnimator.removeListener(this);
    }
    
    public void onAnimationStart(Animator paramAnimator)
    {
      this.mView.setLayerType(2, null);
    }
  }
  
  private static class EndViewTransitionAnimator
    extends AnimationSet
    implements Runnable
  {
    private boolean mAnimating = true;
    private final View mChild;
    private boolean mEnded;
    private final ViewGroup mParent;
    private boolean mTransitionEnded;
    
    EndViewTransitionAnimator(Animation paramAnimation, ViewGroup paramViewGroup, View paramView)
    {
      super();
      this.mParent = paramViewGroup;
      this.mChild = paramView;
      addAnimation(paramAnimation);
      paramViewGroup.post(this);
    }
    
    public boolean getTransformation(long paramLong, Transformation paramTransformation)
    {
      this.mAnimating = true;
      if (this.mEnded) {
        return this.mTransitionEnded ^ true;
      }
      if (!super.getTransformation(paramLong, paramTransformation))
      {
        this.mEnded = true;
        OneShotPreDrawListener.add(this.mParent, this);
      }
      return true;
    }
    
    public boolean getTransformation(long paramLong, Transformation paramTransformation, float paramFloat)
    {
      this.mAnimating = true;
      if (this.mEnded) {
        return this.mTransitionEnded ^ true;
      }
      if (!super.getTransformation(paramLong, paramTransformation, paramFloat))
      {
        this.mEnded = true;
        OneShotPreDrawListener.add(this.mParent, this);
      }
      return true;
    }
    
    public void run()
    {
      if ((!this.mEnded) && (this.mAnimating))
      {
        this.mAnimating = false;
        this.mParent.post(this);
      }
      else
      {
        this.mParent.endViewTransition(this.mChild);
        this.mTransitionEnded = true;
      }
    }
  }
  
  private static final class FragmentLifecycleCallbacksHolder
  {
    final FragmentManager.FragmentLifecycleCallbacks mCallback;
    final boolean mRecursive;
    
    FragmentLifecycleCallbacksHolder(FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks, boolean paramBoolean)
    {
      this.mCallback = paramFragmentLifecycleCallbacks;
      this.mRecursive = paramBoolean;
    }
  }
  
  static class FragmentTag
  {
    public static final int[] Fragment = { 16842755, 16842960, 16842961 };
    public static final int Fragment_id = 1;
    public static final int Fragment_name = 0;
    public static final int Fragment_tag = 2;
  }
  
  static abstract interface OpGenerator
  {
    public abstract boolean generateOps(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1);
  }
  
  private class PopBackStackState
    implements FragmentManagerImpl.OpGenerator
  {
    final int mFlags;
    final int mId;
    final String mName;
    
    PopBackStackState(String paramString, int paramInt1, int paramInt2)
    {
      this.mName = paramString;
      this.mId = paramInt1;
      this.mFlags = paramInt2;
    }
    
    public boolean generateOps(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1)
    {
      if ((FragmentManagerImpl.this.mPrimaryNav != null) && (this.mId < 0) && (this.mName == null))
      {
        FragmentManager localFragmentManager = FragmentManagerImpl.this.mPrimaryNav.peekChildFragmentManager();
        if ((localFragmentManager != null) && (localFragmentManager.popBackStackImmediate())) {
          return false;
        }
      }
      return FragmentManagerImpl.this.popBackStackState(paramArrayList, paramArrayList1, this.mName, this.mId, this.mFlags);
    }
  }
  
  static class StartEnterTransitionListener
    implements Fragment.OnStartEnterTransitionListener
  {
    final boolean mIsBack;
    private int mNumPostponed;
    final BackStackRecord mRecord;
    
    StartEnterTransitionListener(BackStackRecord paramBackStackRecord, boolean paramBoolean)
    {
      this.mIsBack = paramBoolean;
      this.mRecord = paramBackStackRecord;
    }
    
    public void cancelTransaction()
    {
      this.mRecord.mManager.completeExecute(this.mRecord, this.mIsBack, false, false);
    }
    
    public void completeTransaction()
    {
      int i = this.mNumPostponed;
      int j = 0;
      if (i > 0) {
        i = 1;
      } else {
        i = 0;
      }
      FragmentManagerImpl localFragmentManagerImpl = this.mRecord.mManager;
      int k = localFragmentManagerImpl.mAdded.size();
      while (j < k)
      {
        Fragment localFragment = (Fragment)localFragmentManagerImpl.mAdded.get(j);
        localFragment.setOnStartEnterTransitionListener(null);
        if ((i != 0) && (localFragment.isPostponed())) {
          localFragment.startPostponedEnterTransition();
        }
        j++;
      }
      this.mRecord.mManager.completeExecute(this.mRecord, this.mIsBack, i ^ 0x1, true);
    }
    
    public boolean isReady()
    {
      boolean bool;
      if (this.mNumPostponed == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void onStartEnterTransition()
    {
      int i = this.mNumPostponed - 1;
      this.mNumPostponed = i;
      if (i != 0) {
        return;
      }
      this.mRecord.mManager.scheduleCommit();
    }
    
    public void startListening()
    {
      this.mNumPostponed += 1;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\fragment\app\FragmentManagerImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */