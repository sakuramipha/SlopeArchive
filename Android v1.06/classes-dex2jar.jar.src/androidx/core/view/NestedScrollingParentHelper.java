package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

public class NestedScrollingParentHelper
{
  private int mNestedScrollAxesNonTouch;
  private int mNestedScrollAxesTouch;
  
  public NestedScrollingParentHelper(ViewGroup paramViewGroup) {}
  
  public int getNestedScrollAxes()
  {
    return this.mNestedScrollAxesTouch | this.mNestedScrollAxesNonTouch;
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    onNestedScrollAccepted(paramView1, paramView2, paramInt, 0);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 1) {
      this.mNestedScrollAxesNonTouch = paramInt1;
    } else {
      this.mNestedScrollAxesTouch = paramInt1;
    }
  }
  
  public void onStopNestedScroll(View paramView)
  {
    onStopNestedScroll(paramView, 0);
  }
  
  public void onStopNestedScroll(View paramView, int paramInt)
  {
    if (paramInt == 1) {
      this.mNestedScrollAxesNonTouch = 0;
    } else {
      this.mNestedScrollAxesTouch = 0;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\view\NestedScrollingParentHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */