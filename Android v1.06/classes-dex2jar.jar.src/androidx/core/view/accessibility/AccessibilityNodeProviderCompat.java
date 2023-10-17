package androidx.core.view.accessibility;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeProviderCompat
{
  public static final int HOST_VIEW_ID = -1;
  private final Object mProvider;
  
  public AccessibilityNodeProviderCompat()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      this.mProvider = new AccessibilityNodeProviderApi26(this);
    } else if (Build.VERSION.SDK_INT >= 19) {
      this.mProvider = new AccessibilityNodeProviderApi19(this);
    } else if (Build.VERSION.SDK_INT >= 16) {
      this.mProvider = new AccessibilityNodeProviderApi16(this);
    } else {
      this.mProvider = null;
    }
  }
  
  public AccessibilityNodeProviderCompat(Object paramObject)
  {
    this.mProvider = paramObject;
  }
  
  public void addExtraDataToAccessibilityNodeInfo(int paramInt, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat, String paramString, Bundle paramBundle) {}
  
  public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int paramInt)
  {
    return null;
  }
  
  public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    return null;
  }
  
  public AccessibilityNodeInfoCompat findFocus(int paramInt)
  {
    return null;
  }
  
  public Object getProvider()
  {
    return this.mProvider;
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }
  
  static class AccessibilityNodeProviderApi16
    extends AccessibilityNodeProvider
  {
    final AccessibilityNodeProviderCompat mCompat;
    
    AccessibilityNodeProviderApi16(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
    {
      this.mCompat = paramAccessibilityNodeProviderCompat;
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
    {
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = this.mCompat.createAccessibilityNodeInfo(paramInt);
      if (localAccessibilityNodeInfoCompat == null) {
        return null;
      }
      return localAccessibilityNodeInfoCompat.unwrap();
    }
    
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String paramString, int paramInt)
    {
      List localList = this.mCompat.findAccessibilityNodeInfosByText(paramString, paramInt);
      if (localList == null) {
        return null;
      }
      paramString = new ArrayList();
      int i = localList.size();
      for (paramInt = 0; paramInt < i; paramInt++) {
        paramString.add(((AccessibilityNodeInfoCompat)localList.get(paramInt)).unwrap());
      }
      return paramString;
    }
    
    public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
    {
      return this.mCompat.performAction(paramInt1, paramInt2, paramBundle);
    }
  }
  
  static class AccessibilityNodeProviderApi19
    extends AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi16
  {
    AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
    {
      super();
    }
    
    public AccessibilityNodeInfo findFocus(int paramInt)
    {
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = this.mCompat.findFocus(paramInt);
      if (localAccessibilityNodeInfoCompat == null) {
        return null;
      }
      return localAccessibilityNodeInfoCompat.unwrap();
    }
  }
  
  static class AccessibilityNodeProviderApi26
    extends AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi19
  {
    AccessibilityNodeProviderApi26(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
    {
      super();
    }
    
    public void addExtraDataToAccessibilityNodeInfo(int paramInt, AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString, Bundle paramBundle)
    {
      this.mCompat.addExtraDataToAccessibilityNodeInfo(paramInt, AccessibilityNodeInfoCompat.wrap(paramAccessibilityNodeInfo), paramString, paramBundle);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\accessibility\AccessibilityNodeProviderCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */