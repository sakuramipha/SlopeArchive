package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class FragmentTransition
{
  private static final int[] INVERSE_OPS = { 0, 3, 0, 1, 5, 4, 7, 6, 9, 8 };
  private static final FragmentTransitionImpl PLATFORM_IMPL;
  private static final FragmentTransitionImpl SUPPORT_IMPL = resolveSupportImpl();
  
  static
  {
    FragmentTransitionCompat21 localFragmentTransitionCompat21;
    if (Build.VERSION.SDK_INT >= 21) {
      localFragmentTransitionCompat21 = new FragmentTransitionCompat21();
    } else {
      localFragmentTransitionCompat21 = null;
    }
    PLATFORM_IMPL = localFragmentTransitionCompat21;
  }
  
  private static void addSharedElementsWithMatchingNames(ArrayList<View> paramArrayList, ArrayMap<String, View> paramArrayMap, Collection<String> paramCollection)
  {
    for (int i = paramArrayMap.size() - 1; i >= 0; i--)
    {
      View localView = (View)paramArrayMap.valueAt(i);
      if (paramCollection.contains(ViewCompat.getTransitionName(localView))) {
        paramArrayList.add(localView);
      }
    }
  }
  
  private static void addToFirstInLastOut(BackStackRecord paramBackStackRecord, BackStackRecord.Op paramOp, SparseArray<FragmentContainerTransition> paramSparseArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    Fragment localFragment = paramOp.fragment;
    if (localFragment == null) {
      return;
    }
    int m = localFragment.mContainerId;
    if (m == 0) {
      return;
    }
    int i;
    if (paramBoolean1) {
      i = INVERSE_OPS[paramOp.cmd];
    } else {
      i = paramOp.cmd;
    }
    boolean bool1 = false;
    boolean bool2 = false;
    if (i != 1) {
      if (i != 3) {
        if (i != 4) {
          if (i != 5)
          {
            if (i == 6) {
              break label201;
            }
            if (i == 7) {
              break label287;
            }
            i = 0;
            bool1 = bool2;
          }
        }
      }
    }
    int j;
    int k;
    for (;;)
    {
      j = 0;
      k = 0;
      break;
      if (paramBoolean2)
      {
        if ((!localFragment.mHiddenChanged) || (localFragment.mHidden) || (!localFragment.mAdded)) {
          break label324;
        }
      }
      else
      {
        bool1 = localFragment.mHidden;
        break label327;
        if (paramBoolean2)
        {
          if ((!localFragment.mHiddenChanged) || (!localFragment.mAdded) || (!localFragment.mHidden)) {}
        }
        else {
          for (;;)
          {
            break;
            if ((!localFragment.mAdded) || (localFragment.mHidden)) {
              break label249;
            }
            continue;
            label201:
            if (!paramBoolean2) {
              break label255;
            }
            if ((localFragment.mAdded) || (localFragment.mView == null) || (localFragment.mView.getVisibility() != 0) || (localFragment.mPostponedAlpha < 0.0F)) {
              break label249;
            }
          }
        }
        for (;;)
        {
          i = 1;
          break;
          label249:
          label255:
          do
          {
            i = 0;
            break;
          } while ((!localFragment.mAdded) || (localFragment.mHidden));
        }
        k = i;
        i = 0;
        j = 1;
        break;
        label287:
        if (paramBoolean2)
        {
          bool1 = localFragment.mIsNewlyAdded;
          break label327;
        }
        if ((localFragment.mAdded) || (localFragment.mHidden)) {
          break label324;
        }
      }
      bool1 = true;
      break label327;
      label324:
      bool1 = false;
      label327:
      i = 1;
    }
    Object localObject = (FragmentContainerTransition)paramSparseArray.get(m);
    paramOp = (BackStackRecord.Op)localObject;
    if (bool1)
    {
      paramOp = ensureContainer((FragmentContainerTransition)localObject, paramSparseArray, m);
      paramOp.lastIn = localFragment;
      paramOp.lastInIsPop = paramBoolean1;
      paramOp.lastInTransaction = paramBackStackRecord;
    }
    if ((!paramBoolean2) && (i != 0))
    {
      if ((paramOp != null) && (paramOp.firstOut == localFragment)) {
        paramOp.firstOut = null;
      }
      localObject = paramBackStackRecord.mManager;
      if ((localFragment.mState < 1) && (((FragmentManagerImpl)localObject).mCurState >= 1) && (!paramBackStackRecord.mReorderingAllowed))
      {
        ((FragmentManagerImpl)localObject).makeActive(localFragment);
        ((FragmentManagerImpl)localObject).moveToState(localFragment, 1, 0, 0, false);
      }
    }
    localObject = paramOp;
    if (k != 0) {
      if (paramOp != null)
      {
        localObject = paramOp;
        if (paramOp.firstOut != null) {}
      }
      else
      {
        localObject = ensureContainer(paramOp, paramSparseArray, m);
        ((FragmentContainerTransition)localObject).firstOut = localFragment;
        ((FragmentContainerTransition)localObject).firstOutIsPop = paramBoolean1;
        ((FragmentContainerTransition)localObject).firstOutTransaction = paramBackStackRecord;
      }
    }
    if ((!paramBoolean2) && (j != 0) && (localObject != null) && (((FragmentContainerTransition)localObject).lastIn == localFragment)) {
      ((FragmentContainerTransition)localObject).lastIn = null;
    }
  }
  
  public static void calculateFragments(BackStackRecord paramBackStackRecord, SparseArray<FragmentContainerTransition> paramSparseArray, boolean paramBoolean)
  {
    int j = paramBackStackRecord.mOps.size();
    for (int i = 0; i < j; i++) {
      addToFirstInLastOut(paramBackStackRecord, (BackStackRecord.Op)paramBackStackRecord.mOps.get(i), paramSparseArray, false, paramBoolean);
    }
  }
  
  private static ArrayMap<String, String> calculateNameOverrides(int paramInt1, ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt2, int paramInt3)
  {
    ArrayMap localArrayMap = new ArrayMap();
    paramInt3--;
    while (paramInt3 >= paramInt2)
    {
      Object localObject = (BackStackRecord)paramArrayList.get(paramInt3);
      if (((BackStackRecord)localObject).interactsWith(paramInt1))
      {
        boolean bool = ((Boolean)paramArrayList1.get(paramInt3)).booleanValue();
        if (((BackStackRecord)localObject).mSharedElementSourceNames != null)
        {
          int j = ((BackStackRecord)localObject).mSharedElementSourceNames.size();
          ArrayList localArrayList2;
          ArrayList localArrayList1;
          if (bool)
          {
            localArrayList2 = ((BackStackRecord)localObject).mSharedElementSourceNames;
            localArrayList1 = ((BackStackRecord)localObject).mSharedElementTargetNames;
          }
          else
          {
            localArrayList1 = ((BackStackRecord)localObject).mSharedElementSourceNames;
            localArrayList2 = ((BackStackRecord)localObject).mSharedElementTargetNames;
          }
          for (int i = 0; i < j; i++)
          {
            localObject = (String)localArrayList1.get(i);
            String str2 = (String)localArrayList2.get(i);
            String str1 = (String)localArrayMap.remove(str2);
            if (str1 != null) {
              localArrayMap.put(localObject, str1);
            } else {
              localArrayMap.put(localObject, str2);
            }
          }
        }
      }
      paramInt3--;
    }
    return localArrayMap;
  }
  
  public static void calculatePopFragments(BackStackRecord paramBackStackRecord, SparseArray<FragmentContainerTransition> paramSparseArray, boolean paramBoolean)
  {
    if (!paramBackStackRecord.mManager.mContainer.onHasView()) {
      return;
    }
    for (int i = paramBackStackRecord.mOps.size() - 1; i >= 0; i--) {
      addToFirstInLastOut(paramBackStackRecord, (BackStackRecord.Op)paramBackStackRecord.mOps.get(i), paramSparseArray, true, paramBoolean);
    }
  }
  
  static void callSharedElementStartEnd(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean1, ArrayMap<String, View> paramArrayMap, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      paramFragment1 = paramFragment2.getEnterTransitionCallback();
    } else {
      paramFragment1 = paramFragment1.getEnterTransitionCallback();
    }
    if (paramFragment1 != null)
    {
      paramFragment2 = new ArrayList();
      ArrayList localArrayList = new ArrayList();
      int j = 0;
      int i;
      if (paramArrayMap == null) {
        i = 0;
      } else {
        i = paramArrayMap.size();
      }
      while (j < i)
      {
        localArrayList.add(paramArrayMap.keyAt(j));
        paramFragment2.add(paramArrayMap.valueAt(j));
        j++;
      }
      if (paramBoolean2) {
        paramFragment1.onSharedElementStart(localArrayList, paramFragment2, null);
      } else {
        paramFragment1.onSharedElementEnd(localArrayList, paramFragment2, null);
      }
    }
  }
  
  private static boolean canHandleAll(FragmentTransitionImpl paramFragmentTransitionImpl, List<Object> paramList)
  {
    int j = paramList.size();
    for (int i = 0; i < j; i++) {
      if (!paramFragmentTransitionImpl.canHandle(paramList.get(i))) {
        return false;
      }
    }
    return true;
  }
  
  static ArrayMap<String, View> captureInSharedElements(FragmentTransitionImpl paramFragmentTransitionImpl, ArrayMap<String, String> paramArrayMap, Object paramObject, FragmentContainerTransition paramFragmentContainerTransition)
  {
    Fragment localFragment = paramFragmentContainerTransition.lastIn;
    View localView = localFragment.getView();
    if ((!paramArrayMap.isEmpty()) && (paramObject != null) && (localView != null))
    {
      ArrayMap localArrayMap = new ArrayMap();
      paramFragmentTransitionImpl.findNamedViews(localArrayMap, localView);
      paramFragmentTransitionImpl = paramFragmentContainerTransition.lastInTransaction;
      if (paramFragmentContainerTransition.lastInIsPop)
      {
        paramObject = localFragment.getExitTransitionCallback();
        paramFragmentTransitionImpl = paramFragmentTransitionImpl.mSharedElementSourceNames;
      }
      else
      {
        paramObject = localFragment.getEnterTransitionCallback();
        paramFragmentTransitionImpl = paramFragmentTransitionImpl.mSharedElementTargetNames;
      }
      if (paramFragmentTransitionImpl != null)
      {
        localArrayMap.retainAll(paramFragmentTransitionImpl);
        localArrayMap.retainAll(paramArrayMap.values());
      }
      if (paramObject != null)
      {
        ((SharedElementCallback)paramObject).onMapSharedElements(paramFragmentTransitionImpl, localArrayMap);
        for (int i = paramFragmentTransitionImpl.size() - 1; i >= 0; i--)
        {
          paramFragmentContainerTransition = (String)paramFragmentTransitionImpl.get(i);
          paramObject = (View)localArrayMap.get(paramFragmentContainerTransition);
          if (paramObject == null)
          {
            paramObject = findKeyForValue(paramArrayMap, paramFragmentContainerTransition);
            if (paramObject != null) {
              paramArrayMap.remove(paramObject);
            }
          }
          else if (!paramFragmentContainerTransition.equals(ViewCompat.getTransitionName((View)paramObject)))
          {
            paramFragmentContainerTransition = findKeyForValue(paramArrayMap, paramFragmentContainerTransition);
            if (paramFragmentContainerTransition != null) {
              paramArrayMap.put(paramFragmentContainerTransition, ViewCompat.getTransitionName((View)paramObject));
            }
          }
        }
      }
      retainValues(paramArrayMap, localArrayMap);
      return localArrayMap;
    }
    paramArrayMap.clear();
    return null;
  }
  
  private static ArrayMap<String, View> captureOutSharedElements(FragmentTransitionImpl paramFragmentTransitionImpl, ArrayMap<String, String> paramArrayMap, Object paramObject, FragmentContainerTransition paramFragmentContainerTransition)
  {
    if ((!paramArrayMap.isEmpty()) && (paramObject != null))
    {
      paramObject = paramFragmentContainerTransition.firstOut;
      ArrayMap localArrayMap = new ArrayMap();
      paramFragmentTransitionImpl.findNamedViews(localArrayMap, ((Fragment)paramObject).getView());
      paramFragmentTransitionImpl = paramFragmentContainerTransition.firstOutTransaction;
      if (paramFragmentContainerTransition.firstOutIsPop)
      {
        paramObject = ((Fragment)paramObject).getEnterTransitionCallback();
        paramFragmentTransitionImpl = paramFragmentTransitionImpl.mSharedElementTargetNames;
      }
      else
      {
        paramObject = ((Fragment)paramObject).getExitTransitionCallback();
        paramFragmentTransitionImpl = paramFragmentTransitionImpl.mSharedElementSourceNames;
      }
      localArrayMap.retainAll(paramFragmentTransitionImpl);
      if (paramObject != null)
      {
        ((SharedElementCallback)paramObject).onMapSharedElements(paramFragmentTransitionImpl, localArrayMap);
        for (int i = paramFragmentTransitionImpl.size() - 1; i >= 0; i--)
        {
          paramFragmentContainerTransition = (String)paramFragmentTransitionImpl.get(i);
          paramObject = (View)localArrayMap.get(paramFragmentContainerTransition);
          if (paramObject == null)
          {
            paramArrayMap.remove(paramFragmentContainerTransition);
          }
          else if (!paramFragmentContainerTransition.equals(ViewCompat.getTransitionName((View)paramObject)))
          {
            paramFragmentContainerTransition = (String)paramArrayMap.remove(paramFragmentContainerTransition);
            paramArrayMap.put(ViewCompat.getTransitionName((View)paramObject), paramFragmentContainerTransition);
          }
        }
      }
      paramArrayMap.retainAll(localArrayMap.keySet());
      return localArrayMap;
    }
    paramArrayMap.clear();
    return null;
  }
  
  private static FragmentTransitionImpl chooseImpl(Fragment paramFragment1, Fragment paramFragment2)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramFragment1 != null)
    {
      Object localObject = paramFragment1.getExitTransition();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
      localObject = paramFragment1.getReturnTransition();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
      paramFragment1 = paramFragment1.getSharedElementReturnTransition();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
    }
    if (paramFragment2 != null)
    {
      paramFragment1 = paramFragment2.getEnterTransition();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
      paramFragment1 = paramFragment2.getReenterTransition();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
      paramFragment1 = paramFragment2.getSharedElementEnterTransition();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    paramFragment1 = PLATFORM_IMPL;
    if ((paramFragment1 != null) && (canHandleAll(paramFragment1, localArrayList))) {
      return paramFragment1;
    }
    paramFragment2 = SUPPORT_IMPL;
    if ((paramFragment2 != null) && (canHandleAll(paramFragment2, localArrayList))) {
      return paramFragment2;
    }
    if ((paramFragment1 == null) && (paramFragment2 == null)) {
      return null;
    }
    throw new IllegalArgumentException("Invalid Transition types");
  }
  
  static ArrayList<View> configureEnteringExitingViews(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList, View paramView)
  {
    if (paramObject != null)
    {
      ArrayList localArrayList = new ArrayList();
      paramFragment = paramFragment.getView();
      if (paramFragment != null) {
        paramFragmentTransitionImpl.captureTransitioningViews(localArrayList, paramFragment);
      }
      if (paramArrayList != null) {
        localArrayList.removeAll(paramArrayList);
      }
      paramFragment = localArrayList;
      if (!localArrayList.isEmpty())
      {
        localArrayList.add(paramView);
        paramFragmentTransitionImpl.addTargets(paramObject, localArrayList);
        paramFragment = localArrayList;
      }
    }
    else
    {
      paramFragment = null;
    }
    return paramFragment;
  }
  
  private static Object configureSharedElementsOrdered(FragmentTransitionImpl paramFragmentTransitionImpl, ViewGroup paramViewGroup, final View paramView, final ArrayMap<String, String> paramArrayMap, final FragmentContainerTransition paramFragmentContainerTransition, final ArrayList<View> paramArrayList1, final ArrayList<View> paramArrayList2, final Object paramObject1, final Object paramObject2)
  {
    final Fragment localFragment2 = paramFragmentContainerTransition.lastIn;
    final Fragment localFragment1 = paramFragmentContainerTransition.firstOut;
    if ((localFragment2 != null) && (localFragment1 != null))
    {
      final boolean bool = paramFragmentContainerTransition.lastInIsPop;
      final Object localObject;
      if (paramArrayMap.isEmpty()) {
        localObject = null;
      } else {
        localObject = getSharedElementTransition(paramFragmentTransitionImpl, localFragment2, localFragment1, bool);
      }
      ArrayMap localArrayMap = captureOutSharedElements(paramFragmentTransitionImpl, paramArrayMap, localObject, paramFragmentContainerTransition);
      if (paramArrayMap.isEmpty()) {
        localObject = null;
      } else {
        paramArrayList1.addAll(localArrayMap.values());
      }
      if ((paramObject1 == null) && (paramObject2 == null) && (localObject == null)) {
        return null;
      }
      callSharedElementStartEnd(localFragment2, localFragment1, bool, localArrayMap, true);
      if (localObject != null)
      {
        Rect localRect = new Rect();
        paramFragmentTransitionImpl.setSharedElementTargets(localObject, paramView, paramArrayList1);
        setOutEpicenter(paramFragmentTransitionImpl, localObject, paramObject2, localArrayMap, paramFragmentContainerTransition.firstOutIsPop, paramFragmentContainerTransition.firstOutTransaction);
        paramObject2 = localRect;
        if (paramObject1 != null)
        {
          paramFragmentTransitionImpl.setEpicenter(paramObject1, localRect);
          paramObject2 = localRect;
        }
      }
      else
      {
        paramObject2 = null;
      }
      OneShotPreDrawListener.add(paramViewGroup, new Runnable()
      {
        final FragmentTransitionImpl val$impl;
        
        public void run()
        {
          ArrayMap localArrayMap = FragmentTransition.captureInSharedElements(this.val$impl, paramArrayMap, localObject, paramFragmentContainerTransition);
          if (localArrayMap != null)
          {
            paramArrayList2.addAll(localArrayMap.values());
            paramArrayList2.add(paramView);
          }
          FragmentTransition.callSharedElementStartEnd(localFragment2, localFragment1, bool, localArrayMap, false);
          Object localObject = localObject;
          if (localObject != null)
          {
            this.val$impl.swapSharedElementTargets(localObject, paramArrayList1, paramArrayList2);
            localObject = FragmentTransition.getInEpicenterView(localArrayMap, paramFragmentContainerTransition, paramObject1, bool);
            if (localObject != null) {
              this.val$impl.getBoundsOnScreen((View)localObject, paramObject2);
            }
          }
        }
      });
      return localObject;
    }
    return null;
  }
  
  private static Object configureSharedElementsReordered(final FragmentTransitionImpl paramFragmentTransitionImpl, ViewGroup paramViewGroup, final View paramView, ArrayMap<String, String> paramArrayMap, final FragmentContainerTransition paramFragmentContainerTransition, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2, Object paramObject1, Object paramObject2)
  {
    Fragment localFragment2 = paramFragmentContainerTransition.lastIn;
    final Fragment localFragment1 = paramFragmentContainerTransition.firstOut;
    if (localFragment2 != null) {
      localFragment2.getView().setVisibility(0);
    }
    if ((localFragment2 != null) && (localFragment1 != null))
    {
      final boolean bool = paramFragmentContainerTransition.lastInIsPop;
      Object localObject;
      if (paramArrayMap.isEmpty()) {
        localObject = null;
      } else {
        localObject = getSharedElementTransition(paramFragmentTransitionImpl, localFragment2, localFragment1, bool);
      }
      ArrayMap localArrayMap2 = captureOutSharedElements(paramFragmentTransitionImpl, paramArrayMap, localObject, paramFragmentContainerTransition);
      final ArrayMap localArrayMap1 = captureInSharedElements(paramFragmentTransitionImpl, paramArrayMap, localObject, paramFragmentContainerTransition);
      if (paramArrayMap.isEmpty())
      {
        if (localArrayMap2 != null) {
          localArrayMap2.clear();
        }
        if (localArrayMap1 != null) {
          localArrayMap1.clear();
        }
        paramArrayMap = null;
      }
      else
      {
        addSharedElementsWithMatchingNames(paramArrayList1, localArrayMap2, paramArrayMap.keySet());
        addSharedElementsWithMatchingNames(paramArrayList2, localArrayMap1, paramArrayMap.values());
        paramArrayMap = (ArrayMap<String, String>)localObject;
      }
      if ((paramObject1 == null) && (paramObject2 == null) && (paramArrayMap == null)) {
        return null;
      }
      callSharedElementStartEnd(localFragment2, localFragment1, bool, localArrayMap2, true);
      if (paramArrayMap != null)
      {
        paramArrayList2.add(paramView);
        paramFragmentTransitionImpl.setSharedElementTargets(paramArrayMap, paramView, paramArrayList1);
        setOutEpicenter(paramFragmentTransitionImpl, paramArrayMap, paramObject2, localArrayMap2, paramFragmentContainerTransition.firstOutIsPop, paramFragmentContainerTransition.firstOutTransaction);
        paramView = new Rect();
        paramFragmentContainerTransition = getInEpicenterView(localArrayMap1, paramFragmentContainerTransition, paramObject1, bool);
        if (paramFragmentContainerTransition != null) {
          paramFragmentTransitionImpl.setEpicenter(paramObject1, paramView);
        }
      }
      else
      {
        paramFragmentContainerTransition = null;
        paramView = null;
      }
      OneShotPreDrawListener.add(paramViewGroup, new Runnable()
      {
        final Fragment val$inFragment;
        
        public void run()
        {
          FragmentTransition.callSharedElementStartEnd(this.val$inFragment, localFragment1, bool, localArrayMap1, false);
          View localView = paramFragmentContainerTransition;
          if (localView != null) {
            paramFragmentTransitionImpl.getBoundsOnScreen(localView, paramView);
          }
        }
      });
      return paramArrayMap;
    }
    return null;
  }
  
  private static void configureTransitionsOrdered(FragmentManagerImpl paramFragmentManagerImpl, int paramInt, FragmentContainerTransition paramFragmentContainerTransition, View paramView, ArrayMap<String, String> paramArrayMap)
  {
    if (paramFragmentManagerImpl.mContainer.onHasView()) {
      paramFragmentManagerImpl = (ViewGroup)paramFragmentManagerImpl.mContainer.onFindViewById(paramInt);
    } else {
      paramFragmentManagerImpl = null;
    }
    if (paramFragmentManagerImpl == null) {
      return;
    }
    Fragment localFragment = paramFragmentContainerTransition.lastIn;
    Object localObject4 = paramFragmentContainerTransition.firstOut;
    FragmentTransitionImpl localFragmentTransitionImpl = chooseImpl((Fragment)localObject4, localFragment);
    if (localFragmentTransitionImpl == null) {
      return;
    }
    boolean bool2 = paramFragmentContainerTransition.lastInIsPop;
    boolean bool1 = paramFragmentContainerTransition.firstOutIsPop;
    Object localObject2 = getEnterTransition(localFragmentTransitionImpl, localFragment, bool2);
    Object localObject1 = getExitTransition(localFragmentTransitionImpl, (Fragment)localObject4, bool1);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject3 = configureSharedElementsOrdered(localFragmentTransitionImpl, paramFragmentManagerImpl, paramView, paramArrayMap, paramFragmentContainerTransition, localArrayList2, localArrayList1, localObject2, localObject1);
    if ((localObject2 == null) && (localObject3 == null) && (localObject1 == null)) {
      return;
    }
    localObject4 = configureEnteringExitingViews(localFragmentTransitionImpl, localObject1, (Fragment)localObject4, localArrayList2, paramView);
    if ((localObject4 != null) && (!((ArrayList)localObject4).isEmpty())) {
      break label183;
    }
    localObject1 = null;
    label183:
    localFragmentTransitionImpl.addTarget(localObject2, paramView);
    paramFragmentContainerTransition = mergeTransitions(localFragmentTransitionImpl, localObject2, localObject1, localObject3, localFragment, paramFragmentContainerTransition.lastInIsPop);
    if (paramFragmentContainerTransition != null)
    {
      localArrayList2 = new ArrayList();
      localFragmentTransitionImpl.scheduleRemoveTargets(paramFragmentContainerTransition, localObject2, localArrayList2, localObject1, (ArrayList)localObject4, localObject3, localArrayList1);
      scheduleTargetChange(localFragmentTransitionImpl, paramFragmentManagerImpl, localFragment, paramView, localArrayList1, localObject2, localArrayList2, localObject1, (ArrayList)localObject4);
      localFragmentTransitionImpl.setNameOverridesOrdered(paramFragmentManagerImpl, localArrayList1, paramArrayMap);
      localFragmentTransitionImpl.beginDelayedTransition(paramFragmentManagerImpl, paramFragmentContainerTransition);
      localFragmentTransitionImpl.scheduleNameReset(paramFragmentManagerImpl, localArrayList1, paramArrayMap);
    }
  }
  
  private static void configureTransitionsReordered(FragmentManagerImpl paramFragmentManagerImpl, int paramInt, FragmentContainerTransition paramFragmentContainerTransition, View paramView, ArrayMap<String, String> paramArrayMap)
  {
    if (paramFragmentManagerImpl.mContainer.onHasView()) {
      paramFragmentManagerImpl = (ViewGroup)paramFragmentManagerImpl.mContainer.onFindViewById(paramInt);
    } else {
      paramFragmentManagerImpl = null;
    }
    if (paramFragmentManagerImpl == null) {
      return;
    }
    Object localObject5 = paramFragmentContainerTransition.lastIn;
    Object localObject3 = paramFragmentContainerTransition.firstOut;
    FragmentTransitionImpl localFragmentTransitionImpl = chooseImpl((Fragment)localObject3, (Fragment)localObject5);
    if (localFragmentTransitionImpl == null) {
      return;
    }
    boolean bool1 = paramFragmentContainerTransition.lastInIsPop;
    boolean bool2 = paramFragmentContainerTransition.firstOutIsPop;
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject2 = getEnterTransition(localFragmentTransitionImpl, (Fragment)localObject5, bool1);
    Object localObject1 = getExitTransition(localFragmentTransitionImpl, (Fragment)localObject3, bool2);
    Object localObject4 = configureSharedElementsReordered(localFragmentTransitionImpl, paramFragmentManagerImpl, paramView, paramArrayMap, paramFragmentContainerTransition, localArrayList1, localArrayList2, localObject2, localObject1);
    if ((localObject2 == null) && (localObject4 == null) && (localObject1 == null)) {
      return;
    }
    paramFragmentContainerTransition = configureEnteringExitingViews(localFragmentTransitionImpl, localObject1, (Fragment)localObject3, localArrayList1, paramView);
    paramView = configureEnteringExitingViews(localFragmentTransitionImpl, localObject2, (Fragment)localObject5, localArrayList2, paramView);
    setViewVisibility(paramView, 4);
    localObject5 = mergeTransitions(localFragmentTransitionImpl, localObject2, localObject1, localObject4, (Fragment)localObject5, bool1);
    if (localObject5 != null)
    {
      replaceHide(localFragmentTransitionImpl, localObject1, (Fragment)localObject3, paramFragmentContainerTransition);
      localObject3 = localFragmentTransitionImpl.prepareSetNameOverridesReordered(localArrayList2);
      localFragmentTransitionImpl.scheduleRemoveTargets(localObject5, localObject2, paramView, localObject1, paramFragmentContainerTransition, localObject4, localArrayList2);
      localFragmentTransitionImpl.beginDelayedTransition(paramFragmentManagerImpl, localObject5);
      localFragmentTransitionImpl.setNameOverridesReordered(paramFragmentManagerImpl, localArrayList1, localArrayList2, (ArrayList)localObject3, paramArrayMap);
      setViewVisibility(paramView, 0);
      localFragmentTransitionImpl.swapSharedElementTargets(localObject4, localArrayList1, localArrayList2);
    }
  }
  
  private static FragmentContainerTransition ensureContainer(FragmentContainerTransition paramFragmentContainerTransition, SparseArray<FragmentContainerTransition> paramSparseArray, int paramInt)
  {
    FragmentContainerTransition localFragmentContainerTransition = paramFragmentContainerTransition;
    if (paramFragmentContainerTransition == null)
    {
      localFragmentContainerTransition = new FragmentContainerTransition();
      paramSparseArray.put(paramInt, localFragmentContainerTransition);
    }
    return localFragmentContainerTransition;
  }
  
  private static String findKeyForValue(ArrayMap<String, String> paramArrayMap, String paramString)
  {
    int j = paramArrayMap.size();
    for (int i = 0; i < j; i++) {
      if (paramString.equals(paramArrayMap.valueAt(i))) {
        return (String)paramArrayMap.keyAt(i);
      }
    }
    return null;
  }
  
  private static Object getEnterTransition(FragmentTransitionImpl paramFragmentTransitionImpl, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {
      paramFragment = paramFragment.getReenterTransition();
    } else {
      paramFragment = paramFragment.getEnterTransition();
    }
    return paramFragmentTransitionImpl.cloneTransition(paramFragment);
  }
  
  private static Object getExitTransition(FragmentTransitionImpl paramFragmentTransitionImpl, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {
      paramFragment = paramFragment.getReturnTransition();
    } else {
      paramFragment = paramFragment.getExitTransition();
    }
    return paramFragmentTransitionImpl.cloneTransition(paramFragment);
  }
  
  static View getInEpicenterView(ArrayMap<String, View> paramArrayMap, FragmentContainerTransition paramFragmentContainerTransition, Object paramObject, boolean paramBoolean)
  {
    paramFragmentContainerTransition = paramFragmentContainerTransition.lastInTransaction;
    if ((paramObject != null) && (paramArrayMap != null) && (paramFragmentContainerTransition.mSharedElementSourceNames != null) && (!paramFragmentContainerTransition.mSharedElementSourceNames.isEmpty()))
    {
      if (paramBoolean) {
        paramFragmentContainerTransition = (String)paramFragmentContainerTransition.mSharedElementSourceNames.get(0);
      } else {
        paramFragmentContainerTransition = (String)paramFragmentContainerTransition.mSharedElementTargetNames.get(0);
      }
      return (View)paramArrayMap.get(paramFragmentContainerTransition);
    }
    return null;
  }
  
  private static Object getSharedElementTransition(FragmentTransitionImpl paramFragmentTransitionImpl, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean)
  {
    if ((paramFragment1 != null) && (paramFragment2 != null))
    {
      if (paramBoolean) {
        paramFragment1 = paramFragment2.getSharedElementReturnTransition();
      } else {
        paramFragment1 = paramFragment1.getSharedElementEnterTransition();
      }
      return paramFragmentTransitionImpl.wrapTransitionInSet(paramFragmentTransitionImpl.cloneTransition(paramFragment1));
    }
    return null;
  }
  
  private static Object mergeTransitions(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject1, Object paramObject2, Object paramObject3, Fragment paramFragment, boolean paramBoolean)
  {
    if ((paramObject1 != null) && (paramObject2 != null) && (paramFragment != null))
    {
      if (paramBoolean) {
        paramBoolean = paramFragment.getAllowReturnTransitionOverlap();
      } else {
        paramBoolean = paramFragment.getAllowEnterTransitionOverlap();
      }
    }
    else {
      paramBoolean = true;
    }
    if (paramBoolean) {
      paramFragmentTransitionImpl = paramFragmentTransitionImpl.mergeTransitionsTogether(paramObject2, paramObject1, paramObject3);
    } else {
      paramFragmentTransitionImpl = paramFragmentTransitionImpl.mergeTransitionsInSequence(paramObject2, paramObject1, paramObject3);
    }
    return paramFragmentTransitionImpl;
  }
  
  private static void replaceHide(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList)
  {
    if ((paramFragment != null) && (paramObject != null) && (paramFragment.mAdded) && (paramFragment.mHidden) && (paramFragment.mHiddenChanged))
    {
      paramFragment.setHideReplaced(true);
      paramFragmentTransitionImpl.scheduleHideFragmentView(paramObject, paramFragment.getView(), paramArrayList);
      OneShotPreDrawListener.add(paramFragment.mContainer, new Runnable()
      {
        final ArrayList val$exitingViews;
        
        public void run()
        {
          FragmentTransition.setViewVisibility(this.val$exitingViews, 4);
        }
      });
    }
  }
  
  private static FragmentTransitionImpl resolveSupportImpl()
  {
    try
    {
      FragmentTransitionImpl localFragmentTransitionImpl = (FragmentTransitionImpl)Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localFragmentTransitionImpl;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static void retainValues(ArrayMap<String, String> paramArrayMap, ArrayMap<String, View> paramArrayMap1)
  {
    for (int i = paramArrayMap.size() - 1; i >= 0; i--) {
      if (!paramArrayMap1.containsKey((String)paramArrayMap.valueAt(i))) {
        paramArrayMap.removeAt(i);
      }
    }
  }
  
  private static void scheduleTargetChange(final FragmentTransitionImpl paramFragmentTransitionImpl, ViewGroup paramViewGroup, final Fragment paramFragment, final View paramView, final ArrayList<View> paramArrayList1, Object paramObject1, final ArrayList<View> paramArrayList2, final Object paramObject2, final ArrayList<View> paramArrayList3)
  {
    OneShotPreDrawListener.add(paramViewGroup, new Runnable()
    {
      final Object val$enterTransition;
      
      public void run()
      {
        Object localObject = this.val$enterTransition;
        if (localObject != null)
        {
          paramFragmentTransitionImpl.removeTarget(localObject, paramView);
          localObject = FragmentTransition.configureEnteringExitingViews(paramFragmentTransitionImpl, this.val$enterTransition, paramFragment, paramArrayList1, paramView);
          paramArrayList2.addAll((Collection)localObject);
        }
        if (paramArrayList3 != null)
        {
          if (paramObject2 != null)
          {
            localObject = new ArrayList();
            ((ArrayList)localObject).add(paramView);
            paramFragmentTransitionImpl.replaceTargets(paramObject2, paramArrayList3, (ArrayList)localObject);
          }
          paramArrayList3.clear();
          paramArrayList3.add(paramView);
        }
      }
    });
  }
  
  private static void setOutEpicenter(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject1, Object paramObject2, ArrayMap<String, View> paramArrayMap, boolean paramBoolean, BackStackRecord paramBackStackRecord)
  {
    if ((paramBackStackRecord.mSharedElementSourceNames != null) && (!paramBackStackRecord.mSharedElementSourceNames.isEmpty()))
    {
      if (paramBoolean) {
        paramBackStackRecord = (String)paramBackStackRecord.mSharedElementTargetNames.get(0);
      } else {
        paramBackStackRecord = (String)paramBackStackRecord.mSharedElementSourceNames.get(0);
      }
      paramArrayMap = (View)paramArrayMap.get(paramBackStackRecord);
      paramFragmentTransitionImpl.setEpicenter(paramObject1, paramArrayMap);
      if (paramObject2 != null) {
        paramFragmentTransitionImpl.setEpicenter(paramObject2, paramArrayMap);
      }
    }
  }
  
  static void setViewVisibility(ArrayList<View> paramArrayList, int paramInt)
  {
    if (paramArrayList == null) {
      return;
    }
    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      ((View)paramArrayList.get(i)).setVisibility(paramInt);
    }
  }
  
  static void startTransitions(FragmentManagerImpl paramFragmentManagerImpl, ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramFragmentManagerImpl.mCurState < 1) {
      return;
    }
    SparseArray localSparseArray = new SparseArray();
    Object localObject;
    for (int i = paramInt1; i < paramInt2; i++)
    {
      localObject = (BackStackRecord)paramArrayList.get(i);
      if (((Boolean)paramArrayList1.get(i)).booleanValue()) {
        calculatePopFragments((BackStackRecord)localObject, localSparseArray, paramBoolean);
      } else {
        calculateFragments((BackStackRecord)localObject, localSparseArray, paramBoolean);
      }
    }
    if (localSparseArray.size() != 0)
    {
      View localView = new View(paramFragmentManagerImpl.mHost.getContext());
      int j = localSparseArray.size();
      for (i = 0; i < j; i++)
      {
        int k = localSparseArray.keyAt(i);
        ArrayMap localArrayMap = calculateNameOverrides(k, paramArrayList, paramArrayList1, paramInt1, paramInt2);
        localObject = (FragmentContainerTransition)localSparseArray.valueAt(i);
        if (paramBoolean) {
          configureTransitionsReordered(paramFragmentManagerImpl, k, (FragmentContainerTransition)localObject, localView, localArrayMap);
        } else {
          configureTransitionsOrdered(paramFragmentManagerImpl, k, (FragmentContainerTransition)localObject, localView, localArrayMap);
        }
      }
    }
  }
  
  static boolean supportsTransition()
  {
    boolean bool;
    if ((PLATFORM_IMPL == null) && (SUPPORT_IMPL == null)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  static class FragmentContainerTransition
  {
    public Fragment firstOut;
    public boolean firstOutIsPop;
    public BackStackRecord firstOutTransaction;
    public Fragment lastIn;
    public boolean lastInIsPop;
    public BackStackRecord lastInTransaction;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\fragment\app\FragmentTransition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */