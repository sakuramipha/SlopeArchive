package androidx.core.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public final class ViewParentCompat
{
  private static final String TAG = "ViewParentCompat";
  private static int[] sTempNestedScrollConsumed;
  
  private static int[] getTempNestedScrollConsumed()
  {
    int[] arrayOfInt = sTempNestedScrollConsumed;
    if (arrayOfInt == null)
    {
      sTempNestedScrollConsumed = new int[2];
    }
    else
    {
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
    }
    return sTempNestedScrollConsumed;
  }
  
  public static void notifySubtreeAccessibilityStateChanged(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramViewParent.notifySubtreeAccessibilityStateChanged(paramView1, paramView2, paramInt);
    }
  }
  
  public static boolean onNestedFling(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      try
      {
        paramBoolean = paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
        return paramBoolean;
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        paramView = new StringBuilder();
        paramView.append("ViewParent ");
        paramView.append(paramViewParent);
        paramView.append(" does not implement interface method onNestedFling");
        Log.e("ViewParentCompat", paramView.toString(), localAbstractMethodError);
      }
    } else if ((paramViewParent instanceof NestedScrollingParent)) {
      return ((NestedScrollingParent)paramViewParent).onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
    }
    return false;
  }
  
  public static boolean onNestedPreFling(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      try
      {
        boolean bool = paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
        return bool;
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        paramView = new StringBuilder();
        paramView.append("ViewParent ");
        paramView.append(paramViewParent);
        paramView.append(" does not implement interface method onNestedPreFling");
        Log.e("ViewParentCompat", paramView.toString(), localAbstractMethodError);
      }
    } else if ((paramViewParent instanceof NestedScrollingParent)) {
      return ((NestedScrollingParent)paramViewParent).onNestedPreFling(paramView, paramFloat1, paramFloat2);
    }
    return false;
  }
  
  public static void onNestedPreScroll(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    onNestedPreScroll(paramViewParent, paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }
  
  public static void onNestedPreScroll(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if ((paramViewParent instanceof NestedScrollingParent2)) {
      ((NestedScrollingParent2)paramViewParent).onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt, paramInt3);
    } else if (paramInt3 == 0) {
      if (Build.VERSION.SDK_INT >= 21) {
        try
        {
          paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
        }
        catch (AbstractMethodError paramArrayOfInt)
        {
          paramView = new StringBuilder();
          paramView.append("ViewParent ");
          paramView.append(paramViewParent);
          paramView.append(" does not implement interface method onNestedPreScroll");
          Log.e("ViewParentCompat", paramView.toString(), paramArrayOfInt);
        }
      } else if ((paramViewParent instanceof NestedScrollingParent)) {
        ((NestedScrollingParent)paramViewParent).onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
      }
    }
  }
  
  public static void onNestedScroll(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    onNestedScroll(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0, getTempNestedScrollConsumed());
  }
  
  public static void onNestedScroll(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    onNestedScroll(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, getTempNestedScrollConsumed());
  }
  
  public static void onNestedScroll(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    if ((paramViewParent instanceof NestedScrollingParent3))
    {
      ((NestedScrollingParent3)paramViewParent).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfInt);
    }
    else
    {
      paramArrayOfInt[0] += paramInt3;
      paramArrayOfInt[1] += paramInt4;
      if ((paramViewParent instanceof NestedScrollingParent2)) {
        ((NestedScrollingParent2)paramViewParent).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      } else if (paramInt5 == 0) {
        if (Build.VERSION.SDK_INT >= 21) {
          try
          {
            paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
          }
          catch (AbstractMethodError paramArrayOfInt)
          {
            paramView = new StringBuilder();
            paramView.append("ViewParent ");
            paramView.append(paramViewParent);
            paramView.append(" does not implement interface method onNestedScroll");
            Log.e("ViewParentCompat", paramView.toString(), paramArrayOfInt);
          }
        } else if ((paramViewParent instanceof NestedScrollingParent)) {
          ((NestedScrollingParent)paramViewParent).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
        }
      }
    }
  }
  
  public static void onNestedScrollAccepted(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    onNestedScrollAccepted(paramViewParent, paramView1, paramView2, paramInt, 0);
  }
  
  public static void onNestedScrollAccepted(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    if ((paramViewParent instanceof NestedScrollingParent2)) {
      ((NestedScrollingParent2)paramViewParent).onNestedScrollAccepted(paramView1, paramView2, paramInt1, paramInt2);
    } else if (paramInt2 == 0) {
      if (Build.VERSION.SDK_INT >= 21) {
        try
        {
          paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt1);
        }
        catch (AbstractMethodError paramView1)
        {
          paramView2 = new StringBuilder();
          paramView2.append("ViewParent ");
          paramView2.append(paramViewParent);
          paramView2.append(" does not implement interface method onNestedScrollAccepted");
          Log.e("ViewParentCompat", paramView2.toString(), paramView1);
        }
      } else if ((paramViewParent instanceof NestedScrollingParent)) {
        ((NestedScrollingParent)paramViewParent).onNestedScrollAccepted(paramView1, paramView2, paramInt1);
      }
    }
  }
  
  public static boolean onStartNestedScroll(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    return onStartNestedScroll(paramViewParent, paramView1, paramView2, paramInt, 0);
  }
  
  public static boolean onStartNestedScroll(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    if ((paramViewParent instanceof NestedScrollingParent2)) {
      return ((NestedScrollingParent2)paramViewParent).onStartNestedScroll(paramView1, paramView2, paramInt1, paramInt2);
    }
    if (paramInt2 == 0) {
      if (Build.VERSION.SDK_INT >= 21) {
        try
        {
          boolean bool = paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt1);
          return bool;
        }
        catch (AbstractMethodError paramView1)
        {
          paramView2 = new StringBuilder();
          paramView2.append("ViewParent ");
          paramView2.append(paramViewParent);
          paramView2.append(" does not implement interface method onStartNestedScroll");
          Log.e("ViewParentCompat", paramView2.toString(), paramView1);
        }
      } else if ((paramViewParent instanceof NestedScrollingParent)) {
        return ((NestedScrollingParent)paramViewParent).onStartNestedScroll(paramView1, paramView2, paramInt1);
      }
    }
    return false;
  }
  
  public static void onStopNestedScroll(ViewParent paramViewParent, View paramView)
  {
    onStopNestedScroll(paramViewParent, paramView, 0);
  }
  
  public static void onStopNestedScroll(ViewParent paramViewParent, View paramView, int paramInt)
  {
    if ((paramViewParent instanceof NestedScrollingParent2)) {
      ((NestedScrollingParent2)paramViewParent).onStopNestedScroll(paramView, paramInt);
    } else if (paramInt == 0) {
      if (Build.VERSION.SDK_INT >= 21) {
        try
        {
          paramViewParent.onStopNestedScroll(paramView);
        }
        catch (AbstractMethodError localAbstractMethodError)
        {
          paramView = new StringBuilder();
          paramView.append("ViewParent ");
          paramView.append(paramViewParent);
          paramView.append(" does not implement interface method onStopNestedScroll");
          Log.e("ViewParentCompat", paramView.toString(), localAbstractMethodError);
        }
      } else if ((paramViewParent instanceof NestedScrollingParent)) {
        ((NestedScrollingParent)paramViewParent).onStopNestedScroll(paramView);
      }
    }
  }
  
  @Deprecated
  public static boolean requestSendAccessibilityEvent(ViewParent paramViewParent, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return paramViewParent.requestSendAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\ViewParentCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */