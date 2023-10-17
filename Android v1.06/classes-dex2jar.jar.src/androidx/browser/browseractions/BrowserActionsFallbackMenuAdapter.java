package androidx.browser.browseractions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.R.id;
import androidx.browser.R.layout;
import androidx.core.content.res.ResourcesCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@Deprecated
class BrowserActionsFallbackMenuAdapter
  extends BaseAdapter
{
  private final Context mContext;
  private final List<BrowserActionItem> mMenuItems;
  
  BrowserActionsFallbackMenuAdapter(List<BrowserActionItem> paramList, Context paramContext)
  {
    this.mMenuItems = paramList;
    this.mContext = paramContext;
  }
  
  public int getCount()
  {
    return this.mMenuItems.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.mMenuItems.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, final ViewGroup paramViewGroup)
  {
    final Object localObject1 = (BrowserActionItem)this.mMenuItems.get(paramInt);
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.mContext).inflate(R.layout.browser_actions_context_menu_row, null);
      paramViewGroup = (ImageView)paramView.findViewById(R.id.browser_actions_menu_item_icon);
      localObject2 = (TextView)paramView.findViewById(R.id.browser_actions_menu_item_text);
      if ((paramViewGroup != null) && (localObject2 != null))
      {
        paramViewGroup = new ViewHolderItem(paramViewGroup, (TextView)localObject2);
        paramView.setTag(paramViewGroup);
      }
      else
      {
        throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
      }
    }
    else
    {
      paramViewGroup = (ViewHolderItem)paramView.getTag();
    }
    final Object localObject2 = ((BrowserActionItem)localObject1).getTitle();
    paramViewGroup.mText.setText((CharSequence)localObject2);
    if (((BrowserActionItem)localObject1).getIconId() != 0)
    {
      localObject1 = ResourcesCompat.getDrawable(this.mContext.getResources(), ((BrowserActionItem)localObject1).getIconId(), null);
      paramViewGroup.mIcon.setImageDrawable((Drawable)localObject1);
    }
    else if (((BrowserActionItem)localObject1).getIconUri() != null)
    {
      localObject1 = BrowserServiceFileProvider.loadBitmap(this.mContext.getContentResolver(), ((BrowserActionItem)localObject1).getIconUri());
      ((ListenableFuture)localObject1).addListener(new Runnable()new Executor
      {
        public void run()
        {
          if (!TextUtils.equals(localObject2, paramViewGroup.mText.getText())) {
            return;
          }
          Bitmap localBitmap2;
          try
          {
            Bitmap localBitmap1 = (Bitmap)localObject1.get();
          }
          catch (ExecutionException|InterruptedException localExecutionException)
          {
            localBitmap2 = null;
          }
          if (localBitmap2 != null)
          {
            paramViewGroup.mIcon.setVisibility(0);
            paramViewGroup.mIcon.setImageBitmap(localBitmap2);
          }
          else
          {
            paramViewGroup.mIcon.setVisibility(4);
            paramViewGroup.mIcon.setImageBitmap(null);
          }
        }
      }, new Executor()
      {
        public void execute(Runnable paramAnonymousRunnable)
        {
          paramAnonymousRunnable.run();
        }
      });
    }
    else
    {
      paramViewGroup.mIcon.setImageBitmap(null);
      paramViewGroup.mIcon.setVisibility(4);
    }
    return paramView;
  }
  
  static class ViewHolderItem
  {
    final ImageView mIcon;
    final TextView mText;
    
    ViewHolderItem(ImageView paramImageView, TextView paramTextView)
    {
      this.mIcon = paramImageView;
      this.mText = paramTextView;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\browseractions\BrowserActionsFallbackMenuAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */