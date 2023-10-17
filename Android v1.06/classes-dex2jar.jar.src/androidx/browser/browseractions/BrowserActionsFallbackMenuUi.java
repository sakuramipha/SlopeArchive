package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.browser.R.id;
import androidx.browser.R.layout;
import androidx.browser.R.string;
import androidx.core.widget.TextViewCompat;
import java.util.ArrayList;
import java.util.List;

@Deprecated
class BrowserActionsFallbackMenuUi
  implements AdapterView.OnItemClickListener
{
  private static final String TAG = "BrowserActionskMenuUi";
  private BrowserActionsFallbackMenuDialog mBrowserActionsDialog;
  final Context mContext;
  private final List<BrowserActionItem> mMenuItems;
  BrowserActionsFallMenuUiListener mMenuUiListener;
  final Uri mUri;
  
  BrowserActionsFallbackMenuUi(Context paramContext, Uri paramUri, List<BrowserActionItem> paramList)
  {
    this.mContext = paramContext;
    this.mUri = paramUri;
    this.mMenuItems = buildFallbackMenuItemList(paramList);
  }
  
  private Runnable buildCopyAction()
  {
    new Runnable()
    {
      public void run()
      {
        ((ClipboardManager)BrowserActionsFallbackMenuUi.this.mContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", BrowserActionsFallbackMenuUi.this.mUri.toString()));
        String str = BrowserActionsFallbackMenuUi.this.mContext.getString(R.string.copy_toast_msg);
        Toast.makeText(BrowserActionsFallbackMenuUi.this.mContext, str, 0).show();
      }
    };
  }
  
  private List<BrowserActionItem> buildFallbackMenuItemList(List<BrowserActionItem> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BrowserActionItem(this.mContext.getString(R.string.fallback_menu_item_open_in_browser), buildOpenInBrowserAction()));
    localArrayList.add(new BrowserActionItem(this.mContext.getString(R.string.fallback_menu_item_copy_link), buildCopyAction()));
    localArrayList.add(new BrowserActionItem(this.mContext.getString(R.string.fallback_menu_item_share_link), buildShareAction()));
    localArrayList.addAll(paramList);
    return localArrayList;
  }
  
  private PendingIntent buildOpenInBrowserAction()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", this.mUri);
    return PendingIntent.getActivity(this.mContext, 0, localIntent, 67108864);
  }
  
  private PendingIntent buildShareAction()
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.putExtra("android.intent.extra.TEXT", this.mUri.toString());
    localIntent.setType("text/plain");
    return PendingIntent.getActivity(this.mContext, 0, localIntent, 67108864);
  }
  
  private BrowserActionsFallbackMenuView initMenuView(View paramView)
  {
    BrowserActionsFallbackMenuView localBrowserActionsFallbackMenuView = (BrowserActionsFallbackMenuView)paramView.findViewById(R.id.browser_actions_menu_view);
    final TextView localTextView = (TextView)paramView.findViewById(R.id.browser_actions_header_text);
    localTextView.setText(this.mUri.toString());
    localTextView.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (TextViewCompat.getMaxLines(localTextView) == Integer.MAX_VALUE)
        {
          localTextView.setMaxLines(1);
          localTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        else
        {
          localTextView.setMaxLines(Integer.MAX_VALUE);
          localTextView.setEllipsize(null);
        }
      }
    });
    paramView = (ListView)paramView.findViewById(R.id.browser_actions_menu_items);
    paramView.setAdapter(new BrowserActionsFallbackMenuAdapter(this.mMenuItems, this.mContext));
    paramView.setOnItemClickListener(this);
    return localBrowserActionsFallbackMenuView;
  }
  
  public void displayMenu()
  {
    final View localView = LayoutInflater.from(this.mContext).inflate(R.layout.browser_actions_context_menu_page, null);
    BrowserActionsFallbackMenuDialog localBrowserActionsFallbackMenuDialog = new BrowserActionsFallbackMenuDialog(this.mContext, initMenuView(localView));
    this.mBrowserActionsDialog = localBrowserActionsFallbackMenuDialog;
    localBrowserActionsFallbackMenuDialog.setContentView(localView);
    if (this.mMenuUiListener != null) {
      this.mBrowserActionsDialog.setOnShowListener(new DialogInterface.OnShowListener()
      {
        public void onShow(DialogInterface paramAnonymousDialogInterface)
        {
          if (BrowserActionsFallbackMenuUi.this.mMenuUiListener == null)
          {
            Log.e("BrowserActionskMenuUi", "Cannot trigger menu item listener, it is null");
            return;
          }
          BrowserActionsFallbackMenuUi.this.mMenuUiListener.onMenuShown(localView);
        }
      });
    }
    this.mBrowserActionsDialog.show();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (BrowserActionItem)this.mMenuItems.get(paramInt);
    if (paramAdapterView.getAction() != null) {
      try
      {
        paramAdapterView.getAction().send();
      }
      catch (PendingIntent.CanceledException paramAdapterView)
      {
        Log.e("BrowserActionskMenuUi", "Failed to send custom item action", paramAdapterView);
      }
    } else if (paramAdapterView.getRunnableAction() != null) {
      paramAdapterView.getRunnableAction().run();
    }
    paramAdapterView = this.mBrowserActionsDialog;
    if (paramAdapterView == null)
    {
      Log.e("BrowserActionskMenuUi", "Cannot dismiss dialog, it has already been dismissed.");
      return;
    }
    paramAdapterView.dismiss();
  }
  
  void setMenuUiListener(BrowserActionsFallMenuUiListener paramBrowserActionsFallMenuUiListener)
  {
    this.mMenuUiListener = paramBrowserActionsFallMenuUiListener;
  }
  
  static abstract interface BrowserActionsFallMenuUiListener
  {
    public abstract void onMenuShown(View paramView);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\browseractions\BrowserActionsFallbackMenuUi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */