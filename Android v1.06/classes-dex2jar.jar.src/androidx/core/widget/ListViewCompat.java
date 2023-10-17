package androidx.core.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;

public final class ListViewCompat
{
  public static boolean canScrollList(ListView paramListView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramListView.canScrollList(paramInt);
    }
    int j = paramListView.getChildCount();
    boolean bool2 = false;
    boolean bool1 = false;
    if (j == 0) {
      return false;
    }
    int i = paramListView.getFirstVisiblePosition();
    if (paramInt > 0)
    {
      paramInt = paramListView.getChildAt(j - 1).getBottom();
      if ((i + j < paramListView.getCount()) || (paramInt > paramListView.getHeight() - paramListView.getListPaddingBottom())) {
        bool1 = true;
      }
      return bool1;
    }
    paramInt = paramListView.getChildAt(0).getTop();
    if (i <= 0)
    {
      bool1 = bool2;
      if (paramInt >= paramListView.getListPaddingTop()) {}
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  public static void scrollListBy(ListView paramListView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      paramListView.scrollListBy(paramInt);
    }
    else
    {
      int i = paramListView.getFirstVisiblePosition();
      if (i == -1) {
        return;
      }
      View localView = paramListView.getChildAt(0);
      if (localView == null) {
        return;
      }
      paramListView.setSelectionFromTop(i, localView.getTop() - paramInt);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\widget\ListViewCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */