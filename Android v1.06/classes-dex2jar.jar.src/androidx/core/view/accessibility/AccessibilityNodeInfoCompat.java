package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo;
import androidx.core.R.id;
import androidx.core.os.BuildCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AccessibilityNodeInfoCompat
{
  public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
  public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
  public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
  public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
  public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
  public static final String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
  public static final String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
  public static final String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
  public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
  public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
  public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
  public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
  public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
  public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
  public static final int ACTION_CLEAR_FOCUS = 2;
  public static final int ACTION_CLEAR_SELECTION = 8;
  public static final int ACTION_CLICK = 16;
  public static final int ACTION_COLLAPSE = 524288;
  public static final int ACTION_COPY = 16384;
  public static final int ACTION_CUT = 65536;
  public static final int ACTION_DISMISS = 1048576;
  public static final int ACTION_EXPAND = 262144;
  public static final int ACTION_FOCUS = 1;
  public static final int ACTION_LONG_CLICK = 32;
  public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
  public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
  public static final int ACTION_PASTE = 32768;
  public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
  public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
  public static final int ACTION_SCROLL_BACKWARD = 8192;
  public static final int ACTION_SCROLL_FORWARD = 4096;
  public static final int ACTION_SELECT = 4;
  public static final int ACTION_SET_SELECTION = 131072;
  public static final int ACTION_SET_TEXT = 2097152;
  private static final int BOOLEAN_PROPERTY_IS_HEADING = 2;
  private static final int BOOLEAN_PROPERTY_IS_SHOWING_HINT = 4;
  private static final int BOOLEAN_PROPERTY_IS_TEXT_ENTRY_KEY = 8;
  private static final String BOOLEAN_PROPERTY_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
  private static final int BOOLEAN_PROPERTY_SCREEN_READER_FOCUSABLE = 1;
  public static final int FOCUS_ACCESSIBILITY = 2;
  public static final int FOCUS_INPUT = 1;
  private static final String HINT_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
  public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
  public static final int MOVEMENT_GRANULARITY_LINE = 4;
  public static final int MOVEMENT_GRANULARITY_PAGE = 16;
  public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
  public static final int MOVEMENT_GRANULARITY_WORD = 2;
  private static final String PANE_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
  private static final String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
  private static final String SPANS_ACTION_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
  private static final String SPANS_END_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
  private static final String SPANS_FLAGS_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
  private static final String SPANS_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
  private static final String SPANS_START_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
  private static final String STATE_DESCRIPTION_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
  private static final String TOOLTIP_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
  private static int sClickableSpanId;
  private final AccessibilityNodeInfo mInfo;
  public int mParentVirtualDescendantId = -1;
  private int mVirtualDescendantId = -1;
  
  private AccessibilityNodeInfoCompat(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    this.mInfo = paramAccessibilityNodeInfo;
  }
  
  @Deprecated
  public AccessibilityNodeInfoCompat(Object paramObject)
  {
    this.mInfo = ((AccessibilityNodeInfo)paramObject);
  }
  
  private void addSpanLocationToExtras(ClickableSpan paramClickableSpan, Spanned paramSpanned, int paramInt)
  {
    extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(paramSpanned.getSpanStart(paramClickableSpan)));
    extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(paramSpanned.getSpanEnd(paramClickableSpan)));
    extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(paramSpanned.getSpanFlags(paramClickableSpan)));
    extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(paramInt));
  }
  
  private void clearExtrasSpans()
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }
  }
  
  private List<Integer> extrasIntList(String paramString)
  {
    if (Build.VERSION.SDK_INT < 19) {
      return new ArrayList();
    }
    ArrayList localArrayList2 = this.mInfo.getExtras().getIntegerArrayList(paramString);
    ArrayList localArrayList1 = localArrayList2;
    if (localArrayList2 == null)
    {
      localArrayList1 = new ArrayList();
      this.mInfo.getExtras().putIntegerArrayList(paramString, localArrayList1);
    }
    return localArrayList1;
  }
  
  private static String getActionSymbolicName(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            switch (paramInt)
            {
            default: 
              return "ACTION_UNKNOWN";
            case 16908362: 
              return "ACTION_PRESS_AND_HOLD";
            case 16908361: 
              return "ACTION_PAGE_RIGHT";
            case 16908360: 
              return "ACTION_PAGE_LEFT";
            case 16908359: 
              return "ACTION_PAGE_DOWN";
            case 16908358: 
              return "ACTION_PAGE_UP";
            case 16908357: 
              return "ACTION_HIDE_TOOLTIP";
            }
            return "ACTION_SHOW_TOOLTIP";
          case 16908349: 
            return "ACTION_SET_PROGRESS";
          case 16908348: 
            return "ACTION_CONTEXT_CLICK";
          case 16908347: 
            return "ACTION_SCROLL_RIGHT";
          case 16908346: 
            return "ACTION_SCROLL_DOWN";
          case 16908345: 
            return "ACTION_SCROLL_LEFT";
          case 16908344: 
            return "ACTION_SCROLL_UP";
          case 16908343: 
            return "ACTION_SCROLL_TO_POSITION";
          }
          return "ACTION_SHOW_ON_SCREEN";
        case 16908372: 
          return "ACTION_IME_ENTER";
        case 16908354: 
          return "ACTION_MOVE_WINDOW";
        case 2097152: 
          return "ACTION_SET_TEXT";
        case 524288: 
          return "ACTION_COLLAPSE";
        case 262144: 
          return "ACTION_EXPAND";
        case 131072: 
          return "ACTION_SET_SELECTION";
        case 65536: 
          return "ACTION_CUT";
        case 32768: 
          return "ACTION_PASTE";
        case 16384: 
          return "ACTION_COPY";
        case 8192: 
          return "ACTION_SCROLL_BACKWARD";
        case 4096: 
          return "ACTION_SCROLL_FORWARD";
        case 2048: 
          return "ACTION_PREVIOUS_HTML_ELEMENT";
        case 1024: 
          return "ACTION_NEXT_HTML_ELEMENT";
        case 512: 
          return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        case 256: 
          return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        case 128: 
          return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        case 64: 
          return "ACTION_ACCESSIBILITY_FOCUS";
        case 32: 
          return "ACTION_LONG_CLICK";
        case 16: 
          return "ACTION_CLICK";
        case 8: 
          return "ACTION_CLEAR_SELECTION";
        }
        return "ACTION_SELECT";
      }
      return "ACTION_CLEAR_FOCUS";
    }
    return "ACTION_FOCUS";
  }
  
  private boolean getBooleanProperty(int paramInt)
  {
    Bundle localBundle = getExtras();
    boolean bool = false;
    if (localBundle == null) {
      return false;
    }
    if ((localBundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & paramInt) == paramInt) {
      bool = true;
    }
    return bool;
  }
  
  public static ClickableSpan[] getClickableSpans(CharSequence paramCharSequence)
  {
    if ((paramCharSequence instanceof Spanned)) {
      return (ClickableSpan[])((Spanned)paramCharSequence).getSpans(0, paramCharSequence.length(), ClickableSpan.class);
    }
    return null;
  }
  
  private SparseArray<WeakReference<ClickableSpan>> getOrCreateSpansFromViewTags(View paramView)
  {
    SparseArray localSparseArray2 = getSpansFromViewTags(paramView);
    SparseArray localSparseArray1 = localSparseArray2;
    if (localSparseArray2 == null)
    {
      localSparseArray1 = new SparseArray();
      paramView.setTag(R.id.tag_accessibility_clickable_spans, localSparseArray1);
    }
    return localSparseArray1;
  }
  
  private SparseArray<WeakReference<ClickableSpan>> getSpansFromViewTags(View paramView)
  {
    return (SparseArray)paramView.getTag(R.id.tag_accessibility_clickable_spans);
  }
  
  private boolean hasSpans()
  {
    return extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
  }
  
  private int idForClickableSpan(ClickableSpan paramClickableSpan, SparseArray<WeakReference<ClickableSpan>> paramSparseArray)
  {
    if (paramSparseArray != null) {
      for (i = 0; i < paramSparseArray.size(); i++) {
        if (paramClickableSpan.equals((ClickableSpan)((WeakReference)paramSparseArray.valueAt(i)).get())) {
          return paramSparseArray.keyAt(i);
        }
      }
    }
    int i = sClickableSpanId;
    sClickableSpanId = i + 1;
    return i;
  }
  
  public static AccessibilityNodeInfoCompat obtain()
  {
    return wrap(AccessibilityNodeInfo.obtain());
  }
  
  public static AccessibilityNodeInfoCompat obtain(View paramView)
  {
    return wrap(AccessibilityNodeInfo.obtain(paramView));
  }
  
  public static AccessibilityNodeInfoCompat obtain(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return wrapNonNullInstance(AccessibilityNodeInfo.obtain(paramView, paramInt));
    }
    return null;
  }
  
  public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    return wrap(AccessibilityNodeInfo.obtain(paramAccessibilityNodeInfoCompat.mInfo));
  }
  
  private void removeCollectedSpans(View paramView)
  {
    SparseArray localSparseArray = getSpansFromViewTags(paramView);
    if (localSparseArray != null)
    {
      paramView = new ArrayList();
      int k = 0;
      int j;
      for (int i = 0;; i++)
      {
        j = k;
        if (i >= localSparseArray.size()) {
          break;
        }
        if (((WeakReference)localSparseArray.valueAt(i)).get() == null) {
          paramView.add(Integer.valueOf(i));
        }
      }
      while (j < paramView.size())
      {
        localSparseArray.remove(((Integer)paramView.get(j)).intValue());
        j++;
      }
    }
  }
  
  private void setBooleanProperty(int paramInt, boolean paramBoolean)
  {
    Bundle localBundle = getExtras();
    if (localBundle != null)
    {
      int j = localBundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
      int i;
      if (paramBoolean) {
        i = paramInt;
      } else {
        i = 0;
      }
      localBundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | j & (paramInt ^ 0xFFFFFFFF));
    }
  }
  
  public static AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return new AccessibilityNodeInfoCompat(paramAccessibilityNodeInfo);
  }
  
  static AccessibilityNodeInfoCompat wrapNonNullInstance(Object paramObject)
  {
    if (paramObject != null) {
      return new AccessibilityNodeInfoCompat(paramObject);
    }
    return null;
  }
  
  public void addAction(int paramInt)
  {
    this.mInfo.addAction(paramInt);
  }
  
  public void addAction(AccessibilityActionCompat paramAccessibilityActionCompat)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      this.mInfo.addAction((AccessibilityNodeInfo.AccessibilityAction)paramAccessibilityActionCompat.mAction);
    }
  }
  
  public void addChild(View paramView)
  {
    this.mInfo.addChild(paramView);
  }
  
  public void addChild(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      this.mInfo.addChild(paramView, paramInt);
    }
  }
  
  public void addSpansToExtras(CharSequence paramCharSequence, View paramView)
  {
    if ((Build.VERSION.SDK_INT >= 19) && (Build.VERSION.SDK_INT < 26))
    {
      clearExtrasSpans();
      removeCollectedSpans(paramView);
      ClickableSpan[] arrayOfClickableSpan = getClickableSpans(paramCharSequence);
      if ((arrayOfClickableSpan != null) && (arrayOfClickableSpan.length > 0))
      {
        getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
        paramView = getOrCreateSpansFromViewTags(paramView);
        for (int i = 0; (arrayOfClickableSpan != null) && (i < arrayOfClickableSpan.length); i++)
        {
          int j = idForClickableSpan(arrayOfClickableSpan[i], paramView);
          paramView.put(j, new WeakReference(arrayOfClickableSpan[i]));
          addSpanLocationToExtras(arrayOfClickableSpan[i], (Spanned)paramCharSequence, j);
        }
      }
    }
  }
  
  public boolean canOpenPopup()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.canOpenPopup();
    }
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof AccessibilityNodeInfoCompat)) {
      return false;
    }
    paramObject = (AccessibilityNodeInfoCompat)paramObject;
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.mInfo;
    if (localAccessibilityNodeInfo == null)
    {
      if (((AccessibilityNodeInfoCompat)paramObject).mInfo != null) {
        return false;
      }
    }
    else if (!localAccessibilityNodeInfo.equals(((AccessibilityNodeInfoCompat)paramObject).mInfo)) {
      return false;
    }
    if (this.mVirtualDescendantId != ((AccessibilityNodeInfoCompat)paramObject).mVirtualDescendantId) {
      return false;
    }
    return this.mParentVirtualDescendantId == ((AccessibilityNodeInfoCompat)paramObject).mParentVirtualDescendantId;
  }
  
  public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = this.mInfo.findAccessibilityNodeInfosByText(paramString);
    int j = paramString.size();
    for (int i = 0; i < j; i++) {
      localArrayList.add(wrap((AccessibilityNodeInfo)paramString.get(i)));
    }
    return localArrayList;
  }
  
  public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByViewId(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18)
    {
      Object localObject = this.mInfo.findAccessibilityNodeInfosByViewId(paramString);
      paramString = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramString.add(wrap((AccessibilityNodeInfo)((Iterator)localObject).next()));
      }
      return paramString;
    }
    return Collections.emptyList();
  }
  
  public AccessibilityNodeInfoCompat findFocus(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return wrapNonNullInstance(this.mInfo.findFocus(paramInt));
    }
    return null;
  }
  
  public AccessibilityNodeInfoCompat focusSearch(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return wrapNonNullInstance(this.mInfo.focusSearch(paramInt));
    }
    return null;
  }
  
  public List<AccessibilityActionCompat> getActionList()
  {
    List localList;
    if (Build.VERSION.SDK_INT >= 21) {
      localList = this.mInfo.getActionList();
    } else {
      localList = null;
    }
    if (localList != null)
    {
      ArrayList localArrayList = new ArrayList();
      int j = localList.size();
      for (int i = 0; i < j; i++) {
        localArrayList.add(new AccessibilityActionCompat(localList.get(i)));
      }
      return localArrayList;
    }
    return Collections.emptyList();
  }
  
  public int getActions()
  {
    return this.mInfo.getActions();
  }
  
  @Deprecated
  public void getBoundsInParent(Rect paramRect)
  {
    this.mInfo.getBoundsInParent(paramRect);
  }
  
  public void getBoundsInScreen(Rect paramRect)
  {
    this.mInfo.getBoundsInScreen(paramRect);
  }
  
  public AccessibilityNodeInfoCompat getChild(int paramInt)
  {
    return wrapNonNullInstance(this.mInfo.getChild(paramInt));
  }
  
  public int getChildCount()
  {
    return this.mInfo.getChildCount();
  }
  
  public CharSequence getClassName()
  {
    return this.mInfo.getClassName();
  }
  
  public CollectionInfoCompat getCollectionInfo()
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      AccessibilityNodeInfo.CollectionInfo localCollectionInfo = this.mInfo.getCollectionInfo();
      if (localCollectionInfo != null) {
        return new CollectionInfoCompat(localCollectionInfo);
      }
    }
    return null;
  }
  
  public CollectionItemInfoCompat getCollectionItemInfo()
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      AccessibilityNodeInfo.CollectionItemInfo localCollectionItemInfo = this.mInfo.getCollectionItemInfo();
      if (localCollectionItemInfo != null) {
        return new CollectionItemInfoCompat(localCollectionItemInfo);
      }
    }
    return null;
  }
  
  public CharSequence getContentDescription()
  {
    return this.mInfo.getContentDescription();
  }
  
  public int getDrawingOrder()
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return this.mInfo.getDrawingOrder();
    }
    return 0;
  }
  
  public CharSequence getError()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return this.mInfo.getError();
    }
    return null;
  }
  
  public Bundle getExtras()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.getExtras();
    }
    return new Bundle();
  }
  
  public CharSequence getHintText()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return this.mInfo.getHintText();
    }
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }
    return null;
  }
  
  @Deprecated
  public Object getInfo()
  {
    return this.mInfo;
  }
  
  public int getInputType()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.getInputType();
    }
    return 0;
  }
  
  public AccessibilityNodeInfoCompat getLabelFor()
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return wrapNonNullInstance(this.mInfo.getLabelFor());
    }
    return null;
  }
  
  public AccessibilityNodeInfoCompat getLabeledBy()
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return wrapNonNullInstance(this.mInfo.getLabeledBy());
    }
    return null;
  }
  
  public int getLiveRegion()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.getLiveRegion();
    }
    return 0;
  }
  
  public int getMaxTextLength()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return this.mInfo.getMaxTextLength();
    }
    return -1;
  }
  
  public int getMovementGranularities()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return this.mInfo.getMovementGranularities();
    }
    return 0;
  }
  
  public CharSequence getPackageName()
  {
    return this.mInfo.getPackageName();
  }
  
  public CharSequence getPaneTitle()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return this.mInfo.getPaneTitle();
    }
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
    }
    return null;
  }
  
  public AccessibilityNodeInfoCompat getParent()
  {
    return wrapNonNullInstance(this.mInfo.getParent());
  }
  
  public RangeInfoCompat getRangeInfo()
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      AccessibilityNodeInfo.RangeInfo localRangeInfo = this.mInfo.getRangeInfo();
      if (localRangeInfo != null) {
        return new RangeInfoCompat(localRangeInfo);
      }
    }
    return null;
  }
  
  public CharSequence getRoleDescription()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
    }
    return null;
  }
  
  public CharSequence getStateDescription()
  {
    if (BuildCompat.isAtLeastR()) {
      return this.mInfo.getStateDescription();
    }
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }
    return null;
  }
  
  public CharSequence getText()
  {
    if (hasSpans())
    {
      List localList1 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      List localList3 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      List localList2 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      List localList4 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      Object localObject = this.mInfo.getText();
      int j = this.mInfo.getText().length();
      int i = 0;
      localObject = new SpannableString(TextUtils.substring((CharSequence)localObject, 0, j));
      while (i < localList1.size())
      {
        ((Spannable)localObject).setSpan(new AccessibilityClickableSpanCompat(((Integer)localList4.get(i)).intValue(), this, getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)localList1.get(i)).intValue(), ((Integer)localList3.get(i)).intValue(), ((Integer)localList2.get(i)).intValue());
        i++;
      }
      return (CharSequence)localObject;
    }
    return this.mInfo.getText();
  }
  
  public int getTextSelectionEnd()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return this.mInfo.getTextSelectionEnd();
    }
    return -1;
  }
  
  public int getTextSelectionStart()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return this.mInfo.getTextSelectionStart();
    }
    return -1;
  }
  
  public CharSequence getTooltipText()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return this.mInfo.getTooltipText();
    }
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }
    return null;
  }
  
  public TouchDelegateInfoCompat getTouchDelegateInfo()
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      AccessibilityNodeInfo.TouchDelegateInfo localTouchDelegateInfo = this.mInfo.getTouchDelegateInfo();
      if (localTouchDelegateInfo != null) {
        return new TouchDelegateInfoCompat(localTouchDelegateInfo);
      }
    }
    return null;
  }
  
  public AccessibilityNodeInfoCompat getTraversalAfter()
  {
    if (Build.VERSION.SDK_INT >= 22) {
      return wrapNonNullInstance(this.mInfo.getTraversalAfter());
    }
    return null;
  }
  
  public AccessibilityNodeInfoCompat getTraversalBefore()
  {
    if (Build.VERSION.SDK_INT >= 22) {
      return wrapNonNullInstance(this.mInfo.getTraversalBefore());
    }
    return null;
  }
  
  public String getViewIdResourceName()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return this.mInfo.getViewIdResourceName();
    }
    return null;
  }
  
  public AccessibilityWindowInfoCompat getWindow()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return AccessibilityWindowInfoCompat.wrapNonNullInstance(this.mInfo.getWindow());
    }
    return null;
  }
  
  public int getWindowId()
  {
    return this.mInfo.getWindowId();
  }
  
  public int hashCode()
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.mInfo;
    int i;
    if (localAccessibilityNodeInfo == null) {
      i = 0;
    } else {
      i = localAccessibilityNodeInfo.hashCode();
    }
    return i;
  }
  
  public boolean isAccessibilityFocused()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return this.mInfo.isAccessibilityFocused();
    }
    return false;
  }
  
  public boolean isCheckable()
  {
    return this.mInfo.isCheckable();
  }
  
  public boolean isChecked()
  {
    return this.mInfo.isChecked();
  }
  
  public boolean isClickable()
  {
    return this.mInfo.isClickable();
  }
  
  public boolean isContentInvalid()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.isContentInvalid();
    }
    return false;
  }
  
  public boolean isContextClickable()
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return this.mInfo.isContextClickable();
    }
    return false;
  }
  
  public boolean isDismissable()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.isDismissable();
    }
    return false;
  }
  
  public boolean isEditable()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return this.mInfo.isEditable();
    }
    return false;
  }
  
  public boolean isEnabled()
  {
    return this.mInfo.isEnabled();
  }
  
  public boolean isFocusable()
  {
    return this.mInfo.isFocusable();
  }
  
  public boolean isFocused()
  {
    return this.mInfo.isFocused();
  }
  
  public boolean isHeading()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return this.mInfo.isHeading();
    }
    boolean bool2 = getBooleanProperty(2);
    boolean bool1 = true;
    if (bool2) {
      return true;
    }
    CollectionItemInfoCompat localCollectionItemInfoCompat = getCollectionItemInfo();
    if ((localCollectionItemInfoCompat == null) || (!localCollectionItemInfoCompat.isHeading())) {
      bool1 = false;
    }
    return bool1;
  }
  
  public boolean isImportantForAccessibility()
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return this.mInfo.isImportantForAccessibility();
    }
    return true;
  }
  
  public boolean isLongClickable()
  {
    return this.mInfo.isLongClickable();
  }
  
  public boolean isMultiLine()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return this.mInfo.isMultiLine();
    }
    return false;
  }
  
  public boolean isPassword()
  {
    return this.mInfo.isPassword();
  }
  
  public boolean isScreenReaderFocusable()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return this.mInfo.isScreenReaderFocusable();
    }
    return getBooleanProperty(1);
  }
  
  public boolean isScrollable()
  {
    return this.mInfo.isScrollable();
  }
  
  public boolean isSelected()
  {
    return this.mInfo.isSelected();
  }
  
  public boolean isShowingHintText()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return this.mInfo.isShowingHintText();
    }
    return getBooleanProperty(4);
  }
  
  public boolean isTextEntryKey()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return this.mInfo.isTextEntryKey();
    }
    return getBooleanProperty(8);
  }
  
  public boolean isVisibleToUser()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return this.mInfo.isVisibleToUser();
    }
    return false;
  }
  
  public boolean performAction(int paramInt)
  {
    return this.mInfo.performAction(paramInt);
  }
  
  public boolean performAction(int paramInt, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return this.mInfo.performAction(paramInt, paramBundle);
    }
    return false;
  }
  
  public void recycle()
  {
    this.mInfo.recycle();
  }
  
  public boolean refresh()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return this.mInfo.refresh();
    }
    return false;
  }
  
  public boolean removeAction(AccessibilityActionCompat paramAccessibilityActionCompat)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return this.mInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction)paramAccessibilityActionCompat.mAction);
    }
    return false;
  }
  
  public boolean removeChild(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return this.mInfo.removeChild(paramView);
    }
    return false;
  }
  
  public boolean removeChild(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return this.mInfo.removeChild(paramView, paramInt);
    }
    return false;
  }
  
  public void setAccessibilityFocused(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      this.mInfo.setAccessibilityFocused(paramBoolean);
    }
  }
  
  @Deprecated
  public void setBoundsInParent(Rect paramRect)
  {
    this.mInfo.setBoundsInParent(paramRect);
  }
  
  public void setBoundsInScreen(Rect paramRect)
  {
    this.mInfo.setBoundsInScreen(paramRect);
  }
  
  public void setCanOpenPopup(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.setCanOpenPopup(paramBoolean);
    }
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    this.mInfo.setCheckable(paramBoolean);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    this.mInfo.setChecked(paramBoolean);
  }
  
  public void setClassName(CharSequence paramCharSequence)
  {
    this.mInfo.setClassName(paramCharSequence);
  }
  
  public void setClickable(boolean paramBoolean)
  {
    this.mInfo.setClickable(paramBoolean);
  }
  
  public void setCollectionInfo(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.mInfo;
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = (AccessibilityNodeInfo.CollectionInfo)((CollectionInfoCompat)paramObject).mInfo;
      }
      localAccessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject);
    }
  }
  
  public void setCollectionItemInfo(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.mInfo;
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = (AccessibilityNodeInfo.CollectionItemInfo)((CollectionItemInfoCompat)paramObject).mInfo;
      }
      localAccessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject);
    }
  }
  
  public void setContentDescription(CharSequence paramCharSequence)
  {
    this.mInfo.setContentDescription(paramCharSequence);
  }
  
  public void setContentInvalid(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.setContentInvalid(paramBoolean);
    }
  }
  
  public void setContextClickable(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      this.mInfo.setContextClickable(paramBoolean);
    }
  }
  
  public void setDismissable(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.setDismissable(paramBoolean);
    }
  }
  
  public void setDrawingOrder(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      this.mInfo.setDrawingOrder(paramInt);
    }
  }
  
  public void setEditable(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      this.mInfo.setEditable(paramBoolean);
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.mInfo.setEnabled(paramBoolean);
  }
  
  public void setError(CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      this.mInfo.setError(paramCharSequence);
    }
  }
  
  public void setFocusable(boolean paramBoolean)
  {
    this.mInfo.setFocusable(paramBoolean);
  }
  
  public void setFocused(boolean paramBoolean)
  {
    this.mInfo.setFocused(paramBoolean);
  }
  
  public void setHeading(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      this.mInfo.setHeading(paramBoolean);
    } else {
      setBooleanProperty(2, paramBoolean);
    }
  }
  
  public void setHintText(CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      this.mInfo.setHintText(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", paramCharSequence);
    }
  }
  
  public void setImportantForAccessibility(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      this.mInfo.setImportantForAccessibility(paramBoolean);
    }
  }
  
  public void setInputType(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.setInputType(paramInt);
    }
  }
  
  public void setLabelFor(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      this.mInfo.setLabelFor(paramView);
    }
  }
  
  public void setLabelFor(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      this.mInfo.setLabelFor(paramView, paramInt);
    }
  }
  
  public void setLabeledBy(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      this.mInfo.setLabeledBy(paramView);
    }
  }
  
  public void setLabeledBy(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      this.mInfo.setLabeledBy(paramView, paramInt);
    }
  }
  
  public void setLiveRegion(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.setLiveRegion(paramInt);
    }
  }
  
  public void setLongClickable(boolean paramBoolean)
  {
    this.mInfo.setLongClickable(paramBoolean);
  }
  
  public void setMaxTextLength(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      this.mInfo.setMaxTextLength(paramInt);
    }
  }
  
  public void setMovementGranularities(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      this.mInfo.setMovementGranularities(paramInt);
    }
  }
  
  public void setMultiLine(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.setMultiLine(paramBoolean);
    }
  }
  
  public void setPackageName(CharSequence paramCharSequence)
  {
    this.mInfo.setPackageName(paramCharSequence);
  }
  
  public void setPaneTitle(CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      this.mInfo.setPaneTitle(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", paramCharSequence);
    }
  }
  
  public void setParent(View paramView)
  {
    this.mParentVirtualDescendantId = -1;
    this.mInfo.setParent(paramView);
  }
  
  public void setParent(View paramView, int paramInt)
  {
    this.mParentVirtualDescendantId = paramInt;
    if (Build.VERSION.SDK_INT >= 16) {
      this.mInfo.setParent(paramView, paramInt);
    }
  }
  
  public void setPassword(boolean paramBoolean)
  {
    this.mInfo.setPassword(paramBoolean);
  }
  
  public void setRangeInfo(RangeInfoCompat paramRangeInfoCompat)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo)paramRangeInfoCompat.mInfo);
    }
  }
  
  public void setRoleDescription(CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", paramCharSequence);
    }
  }
  
  public void setScreenReaderFocusable(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      this.mInfo.setScreenReaderFocusable(paramBoolean);
    } else {
      setBooleanProperty(1, paramBoolean);
    }
  }
  
  public void setScrollable(boolean paramBoolean)
  {
    this.mInfo.setScrollable(paramBoolean);
  }
  
  public void setSelected(boolean paramBoolean)
  {
    this.mInfo.setSelected(paramBoolean);
  }
  
  public void setShowingHintText(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      this.mInfo.setShowingHintText(paramBoolean);
    } else {
      setBooleanProperty(4, paramBoolean);
    }
  }
  
  public void setSource(View paramView)
  {
    this.mVirtualDescendantId = -1;
    this.mInfo.setSource(paramView);
  }
  
  public void setSource(View paramView, int paramInt)
  {
    this.mVirtualDescendantId = paramInt;
    if (Build.VERSION.SDK_INT >= 16) {
      this.mInfo.setSource(paramView, paramInt);
    }
  }
  
  public void setStateDescription(CharSequence paramCharSequence)
  {
    if (BuildCompat.isAtLeastR()) {
      this.mInfo.setStateDescription(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", paramCharSequence);
    }
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    this.mInfo.setText(paramCharSequence);
  }
  
  public void setTextEntryKey(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      this.mInfo.setTextEntryKey(paramBoolean);
    } else {
      setBooleanProperty(8, paramBoolean);
    }
  }
  
  public void setTextSelection(int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      this.mInfo.setTextSelection(paramInt1, paramInt2);
    }
  }
  
  public void setTooltipText(CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      this.mInfo.setTooltipText(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 19) {
      this.mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", paramCharSequence);
    }
  }
  
  public void setTouchDelegateInfo(TouchDelegateInfoCompat paramTouchDelegateInfoCompat)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      this.mInfo.setTouchDelegateInfo(paramTouchDelegateInfoCompat.mInfo);
    }
  }
  
  public void setTraversalAfter(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 22) {
      this.mInfo.setTraversalAfter(paramView);
    }
  }
  
  public void setTraversalAfter(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 22) {
      this.mInfo.setTraversalAfter(paramView, paramInt);
    }
  }
  
  public void setTraversalBefore(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 22) {
      this.mInfo.setTraversalBefore(paramView);
    }
  }
  
  public void setTraversalBefore(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 22) {
      this.mInfo.setTraversalBefore(paramView, paramInt);
    }
  }
  
  public void setViewIdResourceName(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18) {
      this.mInfo.setViewIdResourceName(paramString);
    }
  }
  
  public void setVisibleToUser(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      this.mInfo.setVisibleToUser(paramBoolean);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Object localObject1 = new Rect();
    getBoundsInParent((Rect)localObject1);
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("; boundsInParent: ");
    ((StringBuilder)localObject2).append(localObject1);
    localStringBuilder.append(((StringBuilder)localObject2).toString());
    getBoundsInScreen((Rect)localObject1);
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("; boundsInScreen: ");
    ((StringBuilder)localObject2).append(localObject1);
    localStringBuilder.append(((StringBuilder)localObject2).toString());
    localStringBuilder.append("; packageName: ");
    localStringBuilder.append(getPackageName());
    localStringBuilder.append("; className: ");
    localStringBuilder.append(getClassName());
    localStringBuilder.append("; text: ");
    localStringBuilder.append(getText());
    localStringBuilder.append("; contentDescription: ");
    localStringBuilder.append(getContentDescription());
    localStringBuilder.append("; viewId: ");
    localStringBuilder.append(getViewIdResourceName());
    localStringBuilder.append("; checkable: ");
    localStringBuilder.append(isCheckable());
    localStringBuilder.append("; checked: ");
    localStringBuilder.append(isChecked());
    localStringBuilder.append("; focusable: ");
    localStringBuilder.append(isFocusable());
    localStringBuilder.append("; focused: ");
    localStringBuilder.append(isFocused());
    localStringBuilder.append("; selected: ");
    localStringBuilder.append(isSelected());
    localStringBuilder.append("; clickable: ");
    localStringBuilder.append(isClickable());
    localStringBuilder.append("; longClickable: ");
    localStringBuilder.append(isLongClickable());
    localStringBuilder.append("; enabled: ");
    localStringBuilder.append(isEnabled());
    localStringBuilder.append("; password: ");
    localStringBuilder.append(isPassword());
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("; scrollable: ");
    ((StringBuilder)localObject1).append(isScrollable());
    localStringBuilder.append(((StringBuilder)localObject1).toString());
    localStringBuilder.append("; [");
    if (Build.VERSION.SDK_INT >= 21)
    {
      List localList = getActionList();
      for (i = 0; i < localList.size(); i++)
      {
        AccessibilityActionCompat localAccessibilityActionCompat = (AccessibilityActionCompat)localList.get(i);
        localObject2 = getActionSymbolicName(localAccessibilityActionCompat.getId());
        localObject1 = localObject2;
        if (((String)localObject2).equals("ACTION_UNKNOWN"))
        {
          localObject1 = localObject2;
          if (localAccessibilityActionCompat.getLabel() != null) {
            localObject1 = localAccessibilityActionCompat.getLabel().toString();
          }
        }
        localStringBuilder.append((String)localObject1);
        if (i != localList.size() - 1) {
          localStringBuilder.append(", ");
        }
      }
    }
    int i = getActions();
    while (i != 0)
    {
      int k = 1 << Integer.numberOfTrailingZeros(i);
      int j = i & (k ^ 0xFFFFFFFF);
      localStringBuilder.append(getActionSymbolicName(k));
      i = j;
      if (j != 0)
      {
        localStringBuilder.append(", ");
        i = j;
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public AccessibilityNodeInfo unwrap()
  {
    return this.mInfo;
  }
  
  public static class AccessibilityActionCompat
  {
    public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS;
    public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS;
    public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS;
    public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION;
    public static final AccessibilityActionCompat ACTION_CLICK;
    public static final AccessibilityActionCompat ACTION_COLLAPSE;
    public static final AccessibilityActionCompat ACTION_CONTEXT_CLICK;
    public static final AccessibilityActionCompat ACTION_COPY;
    public static final AccessibilityActionCompat ACTION_CUT;
    public static final AccessibilityActionCompat ACTION_DISMISS;
    public static final AccessibilityActionCompat ACTION_EXPAND;
    public static final AccessibilityActionCompat ACTION_FOCUS;
    public static final AccessibilityActionCompat ACTION_HIDE_TOOLTIP;
    public static final AccessibilityActionCompat ACTION_IME_ENTER;
    public static final AccessibilityActionCompat ACTION_LONG_CLICK;
    public static final AccessibilityActionCompat ACTION_MOVE_WINDOW;
    public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
    public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT;
    public static final AccessibilityActionCompat ACTION_PAGE_DOWN;
    public static final AccessibilityActionCompat ACTION_PAGE_LEFT;
    public static final AccessibilityActionCompat ACTION_PAGE_RIGHT;
    public static final AccessibilityActionCompat ACTION_PAGE_UP;
    public static final AccessibilityActionCompat ACTION_PASTE;
    public static final AccessibilityActionCompat ACTION_PRESS_AND_HOLD;
    public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
    public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT;
    public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD;
    public static final AccessibilityActionCompat ACTION_SCROLL_DOWN;
    public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD;
    public static final AccessibilityActionCompat ACTION_SCROLL_LEFT;
    public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT;
    public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION;
    public static final AccessibilityActionCompat ACTION_SCROLL_UP;
    public static final AccessibilityActionCompat ACTION_SELECT;
    public static final AccessibilityActionCompat ACTION_SET_PROGRESS;
    public static final AccessibilityActionCompat ACTION_SET_SELECTION;
    public static final AccessibilityActionCompat ACTION_SET_TEXT;
    public static final AccessibilityActionCompat ACTION_SHOW_ON_SCREEN;
    public static final AccessibilityActionCompat ACTION_SHOW_TOOLTIP;
    private static final String TAG = "A11yActionCompat";
    final Object mAction;
    protected final AccessibilityViewCommand mCommand;
    private final int mId;
    private final Class<? extends AccessibilityViewCommand.CommandArguments> mViewCommandArgumentClass;
    
    static
    {
      Object localObject2 = null;
      ACTION_FOCUS = new AccessibilityActionCompat(1, null);
      ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, null);
      ACTION_SELECT = new AccessibilityActionCompat(4, null);
      ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, null);
      ACTION_CLICK = new AccessibilityActionCompat(16, null);
      ACTION_LONG_CLICK = new AccessibilityActionCompat(32, null);
      ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(64, null);
      ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(128, null);
      ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(256, null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
      ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(512, null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
      ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(1024, null, AccessibilityViewCommand.MoveHtmlArguments.class);
      ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(2048, null, AccessibilityViewCommand.MoveHtmlArguments.class);
      ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(4096, null);
      ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(8192, null);
      ACTION_COPY = new AccessibilityActionCompat(16384, null);
      ACTION_PASTE = new AccessibilityActionCompat(32768, null);
      ACTION_CUT = new AccessibilityActionCompat(65536, null);
      ACTION_SET_SELECTION = new AccessibilityActionCompat(131072, null, AccessibilityViewCommand.SetSelectionArguments.class);
      ACTION_EXPAND = new AccessibilityActionCompat(262144, null);
      ACTION_COLLAPSE = new AccessibilityActionCompat(524288, null);
      ACTION_DISMISS = new AccessibilityActionCompat(1048576, null);
      ACTION_SET_TEXT = new AccessibilityActionCompat(2097152, null, AccessibilityViewCommand.SetTextArguments.class);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
      } else {
        localObject1 = null;
      }
      ACTION_SHOW_ON_SCREEN = new AccessibilityActionCompat(localObject1, 16908342, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
      } else {
        localObject1 = null;
      }
      ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(localObject1, 16908343, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
      } else {
        localObject1 = null;
      }
      ACTION_SCROLL_UP = new AccessibilityActionCompat(localObject1, 16908344, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
      } else {
        localObject1 = null;
      }
      ACTION_SCROLL_LEFT = new AccessibilityActionCompat(localObject1, 16908345, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
      } else {
        localObject1 = null;
      }
      ACTION_SCROLL_DOWN = new AccessibilityActionCompat(localObject1, 16908346, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
      } else {
        localObject1 = null;
      }
      ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(localObject1, 16908347, null, null, null);
      if (Build.VERSION.SDK_INT >= 29) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
      } else {
        localObject1 = null;
      }
      ACTION_PAGE_UP = new AccessibilityActionCompat(localObject1, 16908358, null, null, null);
      if (Build.VERSION.SDK_INT >= 29) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
      } else {
        localObject1 = null;
      }
      ACTION_PAGE_DOWN = new AccessibilityActionCompat(localObject1, 16908359, null, null, null);
      if (Build.VERSION.SDK_INT >= 29) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
      } else {
        localObject1 = null;
      }
      ACTION_PAGE_LEFT = new AccessibilityActionCompat(localObject1, 16908360, null, null, null);
      if (Build.VERSION.SDK_INT >= 29) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
      } else {
        localObject1 = null;
      }
      ACTION_PAGE_RIGHT = new AccessibilityActionCompat(localObject1, 16908361, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
      } else {
        localObject1 = null;
      }
      ACTION_CONTEXT_CLICK = new AccessibilityActionCompat(localObject1, 16908348, null, null, null);
      if (Build.VERSION.SDK_INT >= 24) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
      } else {
        localObject1 = null;
      }
      ACTION_SET_PROGRESS = new AccessibilityActionCompat(localObject1, 16908349, null, null, AccessibilityViewCommand.SetProgressArguments.class);
      if (Build.VERSION.SDK_INT >= 26) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
      } else {
        localObject1 = null;
      }
      ACTION_MOVE_WINDOW = new AccessibilityActionCompat(localObject1, 16908354, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
      if (Build.VERSION.SDK_INT >= 28) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
      } else {
        localObject1 = null;
      }
      ACTION_SHOW_TOOLTIP = new AccessibilityActionCompat(localObject1, 16908356, null, null, null);
      if (Build.VERSION.SDK_INT >= 28) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
      } else {
        localObject1 = null;
      }
      ACTION_HIDE_TOOLTIP = new AccessibilityActionCompat(localObject1, 16908357, null, null, null);
      if (Build.VERSION.SDK_INT >= 30) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
      } else {
        localObject1 = null;
      }
      ACTION_PRESS_AND_HOLD = new AccessibilityActionCompat(localObject1, 16908362, null, null, null);
      Object localObject1 = localObject2;
      if (Build.VERSION.SDK_INT >= 30) {
        localObject1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
      }
      ACTION_IME_ENTER = new AccessibilityActionCompat(localObject1, 16908372, null, null, null);
    }
    
    public AccessibilityActionCompat(int paramInt, CharSequence paramCharSequence)
    {
      this(null, paramInt, paramCharSequence, null, null);
    }
    
    public AccessibilityActionCompat(int paramInt, CharSequence paramCharSequence, AccessibilityViewCommand paramAccessibilityViewCommand)
    {
      this(null, paramInt, paramCharSequence, paramAccessibilityViewCommand, null);
    }
    
    private AccessibilityActionCompat(int paramInt, CharSequence paramCharSequence, Class<? extends AccessibilityViewCommand.CommandArguments> paramClass)
    {
      this(null, paramInt, paramCharSequence, null, paramClass);
    }
    
    AccessibilityActionCompat(Object paramObject)
    {
      this(paramObject, 0, null, null, null);
    }
    
    AccessibilityActionCompat(Object paramObject, int paramInt, CharSequence paramCharSequence, AccessibilityViewCommand paramAccessibilityViewCommand, Class<? extends AccessibilityViewCommand.CommandArguments> paramClass)
    {
      this.mId = paramInt;
      this.mCommand = paramAccessibilityViewCommand;
      if ((Build.VERSION.SDK_INT >= 21) && (paramObject == null)) {
        this.mAction = new AccessibilityNodeInfo.AccessibilityAction(paramInt, paramCharSequence);
      } else {
        this.mAction = paramObject;
      }
      this.mViewCommandArgumentClass = paramClass;
    }
    
    public AccessibilityActionCompat createReplacementAction(CharSequence paramCharSequence, AccessibilityViewCommand paramAccessibilityViewCommand)
    {
      return new AccessibilityActionCompat(null, this.mId, paramCharSequence, paramAccessibilityViewCommand, this.mViewCommandArgumentClass);
    }
    
    public boolean equals(Object paramObject)
    {
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof AccessibilityActionCompat)) {
        return false;
      }
      paramObject = (AccessibilityActionCompat)paramObject;
      Object localObject = this.mAction;
      if (localObject == null)
      {
        if (((AccessibilityActionCompat)paramObject).mAction != null) {
          return false;
        }
      }
      else if (!localObject.equals(((AccessibilityActionCompat)paramObject).mAction)) {
        return false;
      }
      return true;
    }
    
    public int getId()
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return ((AccessibilityNodeInfo.AccessibilityAction)this.mAction).getId();
      }
      return 0;
    }
    
    public CharSequence getLabel()
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return ((AccessibilityNodeInfo.AccessibilityAction)this.mAction).getLabel();
      }
      return null;
    }
    
    public int hashCode()
    {
      Object localObject = this.mAction;
      int i;
      if (localObject != null) {
        i = localObject.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public boolean perform(View paramView, Bundle paramBundle)
    {
      if (this.mCommand != null)
      {
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject4 = this.mViewCommandArgumentClass;
        Bundle localBundle;
        if (localObject4 != null)
        {
          try
          {
            localObject1 = (AccessibilityViewCommand.CommandArguments)((Class)localObject4).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            try
            {
              ((AccessibilityViewCommand.CommandArguments)localObject1).setBundle(paramBundle);
            }
            catch (Exception localException2)
            {
              paramBundle = (Bundle)localObject1;
              localObject1 = localException2;
            }
            localObject3 = this.mViewCommandArgumentClass;
          }
          catch (Exception localException1)
          {
            paramBundle = localException2;
          }
          Object localObject3;
          if (localObject3 == null) {
            localObject3 = "null";
          } else {
            localObject3 = ((Class)localObject3).getName();
          }
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("Failed to execute command with argument class ViewCommandArgument: ");
          ((StringBuilder)localObject4).append((String)localObject3);
          Log.e("A11yActionCompat", ((StringBuilder)localObject4).toString(), localException1);
          localBundle = paramBundle;
        }
        return this.mCommand.perform(paramView, localBundle);
      }
      return false;
    }
  }
  
  public static class CollectionInfoCompat
  {
    public static final int SELECTION_MODE_MULTIPLE = 2;
    public static final int SELECTION_MODE_NONE = 0;
    public static final int SELECTION_MODE_SINGLE = 1;
    final Object mInfo;
    
    CollectionInfoCompat(Object paramObject)
    {
      this.mInfo = paramObject;
    }
    
    public static CollectionInfoCompat obtain(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean));
      }
      return new CollectionInfoCompat(null);
    }
    
    public static CollectionInfoCompat obtain(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean, paramInt3));
      }
      if (Build.VERSION.SDK_INT >= 19) {
        return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean));
      }
      return new CollectionInfoCompat(null);
    }
    
    public int getColumnCount()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.CollectionInfo)this.mInfo).getColumnCount();
      }
      return -1;
    }
    
    public int getRowCount()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.CollectionInfo)this.mInfo).getRowCount();
      }
      return -1;
    }
    
    public int getSelectionMode()
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return ((AccessibilityNodeInfo.CollectionInfo)this.mInfo).getSelectionMode();
      }
      return 0;
    }
    
    public boolean isHierarchical()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.CollectionInfo)this.mInfo).isHierarchical();
      }
      return false;
    }
  }
  
  public static class CollectionItemInfoCompat
  {
    final Object mInfo;
    
    CollectionItemInfoCompat(Object paramObject)
    {
      this.mInfo = paramObject;
    }
    
    public static CollectionItemInfoCompat obtain(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean));
      }
      return new CollectionItemInfoCompat(null);
    }
    
    public static CollectionItemInfoCompat obtain(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramBoolean2));
      }
      if (Build.VERSION.SDK_INT >= 19) {
        return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1));
      }
      return new CollectionItemInfoCompat(null);
    }
    
    public int getColumnIndex()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.CollectionItemInfo)this.mInfo).getColumnIndex();
      }
      return 0;
    }
    
    public int getColumnSpan()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.CollectionItemInfo)this.mInfo).getColumnSpan();
      }
      return 0;
    }
    
    public int getRowIndex()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.CollectionItemInfo)this.mInfo).getRowIndex();
      }
      return 0;
    }
    
    public int getRowSpan()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.CollectionItemInfo)this.mInfo).getRowSpan();
      }
      return 0;
    }
    
    @Deprecated
    public boolean isHeading()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.CollectionItemInfo)this.mInfo).isHeading();
      }
      return false;
    }
    
    public boolean isSelected()
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return ((AccessibilityNodeInfo.CollectionItemInfo)this.mInfo).isSelected();
      }
      return false;
    }
  }
  
  public static class RangeInfoCompat
  {
    public static final int RANGE_TYPE_FLOAT = 1;
    public static final int RANGE_TYPE_INT = 0;
    public static final int RANGE_TYPE_PERCENT = 2;
    final Object mInfo;
    
    RangeInfoCompat(Object paramObject)
    {
      this.mInfo = paramObject;
    }
    
    public static RangeInfoCompat obtain(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(paramInt, paramFloat1, paramFloat2, paramFloat3));
      }
      return new RangeInfoCompat(null);
    }
    
    public float getCurrent()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.RangeInfo)this.mInfo).getCurrent();
      }
      return 0.0F;
    }
    
    public float getMax()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.RangeInfo)this.mInfo).getMax();
      }
      return 0.0F;
    }
    
    public float getMin()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.RangeInfo)this.mInfo).getMin();
      }
      return 0.0F;
    }
    
    public int getType()
    {
      if (Build.VERSION.SDK_INT >= 19) {
        return ((AccessibilityNodeInfo.RangeInfo)this.mInfo).getType();
      }
      return 0;
    }
  }
  
  public static final class TouchDelegateInfoCompat
  {
    final AccessibilityNodeInfo.TouchDelegateInfo mInfo;
    
    TouchDelegateInfoCompat(AccessibilityNodeInfo.TouchDelegateInfo paramTouchDelegateInfo)
    {
      this.mInfo = paramTouchDelegateInfo;
    }
    
    public TouchDelegateInfoCompat(Map<Region, View> paramMap)
    {
      if (Build.VERSION.SDK_INT >= 29) {
        this.mInfo = new AccessibilityNodeInfo.TouchDelegateInfo(paramMap);
      } else {
        this.mInfo = null;
      }
    }
    
    public Region getRegionAt(int paramInt)
    {
      if (Build.VERSION.SDK_INT >= 29) {
        return this.mInfo.getRegionAt(paramInt);
      }
      return null;
    }
    
    public int getRegionCount()
    {
      if (Build.VERSION.SDK_INT >= 29) {
        return this.mInfo.getRegionCount();
      }
      return 0;
    }
    
    public AccessibilityNodeInfoCompat getTargetForRegion(Region paramRegion)
    {
      if (Build.VERSION.SDK_INT >= 29)
      {
        paramRegion = this.mInfo.getTargetForRegion(paramRegion);
        if (paramRegion != null) {
          return AccessibilityNodeInfoCompat.wrap(paramRegion);
        }
      }
      return null;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\accessibility\AccessibilityNodeInfoCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */