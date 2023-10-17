package androidx.core.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R.id;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class AccessibilityDelegateCompat
{
  private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
  private final View.AccessibilityDelegate mBridge;
  private final View.AccessibilityDelegate mOriginalDelegate;
  
  public AccessibilityDelegateCompat()
  {
    this(DEFAULT_DELEGATE);
  }
  
  public AccessibilityDelegateCompat(View.AccessibilityDelegate paramAccessibilityDelegate)
  {
    this.mOriginalDelegate = paramAccessibilityDelegate;
    this.mBridge = new AccessibilityDelegateAdapter(this);
  }
  
  static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(View paramView)
  {
    List localList = (List)paramView.getTag(R.id.tag_accessibility_actions);
    paramView = localList;
    if (localList == null) {
      paramView = Collections.emptyList();
    }
    return paramView;
  }
  
  private boolean isSpanStillValid(ClickableSpan paramClickableSpan, View paramView)
  {
    if (paramClickableSpan != null)
    {
      paramView = AccessibilityNodeInfoCompat.getClickableSpans(paramView.createAccessibilityNodeInfo().getText());
      for (int i = 0; (paramView != null) && (i < paramView.length); i++) {
        if (paramClickableSpan.equals(paramView[i])) {
          return true;
        }
      }
    }
    return false;
  }
  
  private boolean performClickableSpanAction(int paramInt, View paramView)
  {
    Object localObject = (SparseArray)paramView.getTag(R.id.tag_accessibility_clickable_spans);
    if (localObject != null)
    {
      localObject = (WeakReference)((SparseArray)localObject).get(paramInt);
      if (localObject != null)
      {
        localObject = (ClickableSpan)((WeakReference)localObject).get();
        if (isSpanStillValid((ClickableSpan)localObject, paramView))
        {
          ((ClickableSpan)localObject).onClick(paramView);
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramView = this.mOriginalDelegate.getAccessibilityNodeProvider(paramView);
      if (paramView != null) {
        return new AccessibilityNodeProviderCompat(paramView);
      }
    }
    return null;
  }
  
  View.AccessibilityDelegate getBridge()
  {
    return this.mBridge;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.mOriginalDelegate.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat.unwrap());
  }
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.mOriginalDelegate.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.mOriginalDelegate.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    List localList = getActionList(paramView);
    boolean bool1 = false;
    for (int i = 0;; i++)
    {
      bool2 = bool1;
      if (i >= localList.size()) {
        break;
      }
      AccessibilityNodeInfoCompat.AccessibilityActionCompat localAccessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat)localList.get(i);
      if (localAccessibilityActionCompat.getId() == paramInt)
      {
        bool2 = localAccessibilityActionCompat.perform(paramView, paramBundle);
        break;
      }
    }
    bool1 = bool2;
    if (!bool2)
    {
      bool1 = bool2;
      if (Build.VERSION.SDK_INT >= 16) {
        bool1 = this.mOriginalDelegate.performAccessibilityAction(paramView, paramInt, paramBundle);
      }
    }
    boolean bool2 = bool1;
    if (!bool1)
    {
      bool2 = bool1;
      if (paramInt == R.id.accessibility_action_clickable_span) {
        bool2 = performClickableSpanAction(paramBundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), paramView);
      }
    }
    return bool2;
  }
  
  public void sendAccessibilityEvent(View paramView, int paramInt)
  {
    this.mOriginalDelegate.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.mOriginalDelegate.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
  
  static final class AccessibilityDelegateAdapter
    extends View.AccessibilityDelegate
  {
    final AccessibilityDelegateCompat mCompat;
    
    AccessibilityDelegateAdapter(AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
    {
      this.mCompat = paramAccessibilityDelegateCompat;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return this.mCompat.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    }
    
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
    {
      paramView = this.mCompat.getAccessibilityNodeProvider(paramView);
      if (paramView != null) {
        paramView = (AccessibilityNodeProvider)paramView.getProvider();
      } else {
        paramView = null;
      }
      return paramView;
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      this.mCompat.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.wrap(paramAccessibilityNodeInfo);
      localAccessibilityNodeInfoCompat.setScreenReaderFocusable(ViewCompat.isScreenReaderFocusable(paramView));
      localAccessibilityNodeInfoCompat.setHeading(ViewCompat.isAccessibilityHeading(paramView));
      localAccessibilityNodeInfoCompat.setPaneTitle(ViewCompat.getAccessibilityPaneTitle(paramView));
      localAccessibilityNodeInfoCompat.setStateDescription(ViewCompat.getStateDescription(paramView));
      this.mCompat.onInitializeAccessibilityNodeInfo(paramView, localAccessibilityNodeInfoCompat);
      localAccessibilityNodeInfoCompat.addSpansToExtras(paramAccessibilityNodeInfo.getText(), paramView);
      paramView = AccessibilityDelegateCompat.getActionList(paramView);
      for (int i = 0; i < paramView.size(); i++) {
        localAccessibilityNodeInfoCompat.addAction((AccessibilityNodeInfoCompat.AccessibilityActionCompat)paramView.get(i));
      }
    }
    
    public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      this.mCompat.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return this.mCompat.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    
    public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      return this.mCompat.performAccessibilityAction(paramView, paramInt, paramBundle);
    }
    
    public void sendAccessibilityEvent(View paramView, int paramInt)
    {
      this.mCompat.sendAccessibilityEvent(paramView, paramInt);
    }
    
    public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      this.mCompat.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\AccessibilityDelegateCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */