package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
public class BrowserActionsIntent
{
  public static final String ACTION_BROWSER_ACTIONS_OPEN = "androidx.browser.browseractions.browser_action_open";
  public static final String EXTRA_APP_ID = "androidx.browser.browseractions.APP_ID";
  public static final String EXTRA_MENU_ITEMS = "androidx.browser.browseractions.extra.MENU_ITEMS";
  public static final String EXTRA_SELECTED_ACTION_PENDING_INTENT = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
  public static final String EXTRA_TYPE = "androidx.browser.browseractions.extra.TYPE";
  public static final int ITEM_COPY = 3;
  public static final int ITEM_DOWNLOAD = 2;
  public static final int ITEM_INVALID_ITEM = -1;
  public static final int ITEM_OPEN_IN_INCOGNITO = 1;
  public static final int ITEM_OPEN_IN_NEW_TAB = 0;
  public static final int ITEM_SHARE = 4;
  public static final String KEY_ACTION = "androidx.browser.browseractions.ACTION";
  public static final String KEY_ICON_ID = "androidx.browser.browseractions.ICON_ID";
  private static final String KEY_ICON_URI = "androidx.browser.browseractions.ICON_URI";
  public static final String KEY_TITLE = "androidx.browser.browseractions.TITLE";
  public static final int MAX_CUSTOM_ITEMS = 5;
  private static final String TAG = "BrowserActions";
  private static final String TEST_URL = "https://www.example.com";
  public static final int URL_TYPE_AUDIO = 3;
  public static final int URL_TYPE_FILE = 4;
  public static final int URL_TYPE_IMAGE = 1;
  public static final int URL_TYPE_NONE = 0;
  public static final int URL_TYPE_PLUGIN = 5;
  public static final int URL_TYPE_VIDEO = 2;
  private static BrowserActionsFallDialogListener sDialogListenter;
  private final Intent mIntent;
  
  BrowserActionsIntent(Intent paramIntent)
  {
    this.mIntent = paramIntent;
  }
  
  public static List<ResolveInfo> getBrowserActionsIntentHandlers(Context paramContext)
  {
    Intent localIntent = new Intent("androidx.browser.browseractions.browser_action_open", Uri.parse("https://www.example.com"));
    return paramContext.getPackageManager().queryIntentActivities(localIntent, 131072);
  }
  
  @Deprecated
  public static String getCreatorPackageName(Intent paramIntent)
  {
    return getUntrustedCreatorPackageName(paramIntent);
  }
  
  public static String getUntrustedCreatorPackageName(Intent paramIntent)
  {
    paramIntent = (PendingIntent)paramIntent.getParcelableExtra("androidx.browser.browseractions.APP_ID");
    if (paramIntent != null)
    {
      if (Build.VERSION.SDK_INT >= 17) {
        return paramIntent.getCreatorPackage();
      }
      return paramIntent.getTargetPackage();
    }
    return null;
  }
  
  public static void launchIntent(Context paramContext, Intent paramIntent)
  {
    launchIntent(paramContext, paramIntent, getBrowserActionsIntentHandlers(paramContext));
  }
  
  static void launchIntent(Context paramContext, Intent paramIntent, List<ResolveInfo> paramList)
  {
    if ((paramList != null) && (paramList.size() != 0))
    {
      int j = paramList.size();
      int i = 0;
      if (j == 1)
      {
        paramIntent.setPackage(((ResolveInfo)paramList.get(0)).activityInfo.packageName);
      }
      else
      {
        Object localObject = new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com"));
        localObject = paramContext.getPackageManager().resolveActivity((Intent)localObject, 65536);
        if (localObject != null)
        {
          localObject = ((ResolveInfo)localObject).activityInfo.packageName;
          while (i < paramList.size())
          {
            if (((String)localObject).equals(((ResolveInfo)paramList.get(i)).activityInfo.packageName))
            {
              paramIntent.setPackage((String)localObject);
              break;
            }
            i++;
          }
        }
      }
      ContextCompat.startActivity(paramContext, paramIntent, null);
      return;
    }
    openFallbackBrowserActionsMenu(paramContext, paramIntent);
  }
  
  public static void openBrowserAction(Context paramContext, Uri paramUri)
  {
    launchIntent(paramContext, new Builder(paramContext, paramUri).build().getIntent());
  }
  
  public static void openBrowserAction(Context paramContext, Uri paramUri, int paramInt, ArrayList<BrowserActionItem> paramArrayList, PendingIntent paramPendingIntent)
  {
    launchIntent(paramContext, new Builder(paramContext, paramUri).setUrlType(paramInt).setCustomItems(paramArrayList).setOnItemSelectedAction(paramPendingIntent).build().getIntent());
  }
  
  private static void openFallbackBrowserActionsMenu(Context paramContext, Intent paramIntent)
  {
    Uri localUri = paramIntent.getData();
    paramIntent = paramIntent.getParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS");
    if (paramIntent != null) {
      paramIntent = parseBrowserActionItems(paramIntent);
    } else {
      paramIntent = null;
    }
    openFallbackBrowserActionsMenu(paramContext, localUri, paramIntent);
  }
  
  private static void openFallbackBrowserActionsMenu(Context paramContext, Uri paramUri, List<BrowserActionItem> paramList)
  {
    new BrowserActionsFallbackMenuUi(paramContext, paramUri, paramList).displayMenu();
    paramContext = sDialogListenter;
    if (paramContext != null) {
      paramContext.onDialogShown();
    }
  }
  
  public static List<BrowserActionItem> parseBrowserActionItems(ArrayList<Bundle> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramArrayList.size())
    {
      Object localObject2 = (Bundle)paramArrayList.get(i);
      Object localObject1 = ((Bundle)localObject2).getString("androidx.browser.browseractions.TITLE");
      PendingIntent localPendingIntent = (PendingIntent)((Bundle)localObject2).getParcelable("androidx.browser.browseractions.ACTION");
      int j = ((Bundle)localObject2).getInt("androidx.browser.browseractions.ICON_ID");
      localObject2 = (Uri)((Bundle)localObject2).getParcelable("androidx.browser.browseractions.ICON_URI");
      if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (localPendingIntent != null))
      {
        if (j != 0) {
          localObject1 = new BrowserActionItem((String)localObject1, localPendingIntent, j);
        } else {
          localObject1 = new BrowserActionItem((String)localObject1, localPendingIntent, (Uri)localObject2);
        }
        localArrayList.add(localObject1);
        i++;
      }
      else
      {
        throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
      }
    }
    return localArrayList;
  }
  
  static void setDialogShownListenter(BrowserActionsFallDialogListener paramBrowserActionsFallDialogListener)
  {
    sDialogListenter = paramBrowserActionsFallDialogListener;
  }
  
  public Intent getIntent()
  {
    return this.mIntent;
  }
  
  static abstract interface BrowserActionsFallDialogListener
  {
    public abstract void onDialogShown();
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface BrowserActionsItemId {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface BrowserActionsUrlType {}
  
  public static final class Builder
  {
    private Context mContext;
    private List<Uri> mImageUris = new ArrayList();
    private final Intent mIntent = new Intent("androidx.browser.browseractions.browser_action_open");
    private ArrayList<Bundle> mMenuItems = new ArrayList();
    private PendingIntent mOnItemSelectedPendingIntent = null;
    private int mType = 0;
    private Uri mUri;
    
    public Builder(Context paramContext, Uri paramUri)
    {
      this.mContext = paramContext;
      this.mUri = paramUri;
    }
    
    private Bundle getBundleFromItem(BrowserActionItem paramBrowserActionItem)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("androidx.browser.browseractions.TITLE", paramBrowserActionItem.getTitle());
      localBundle.putParcelable("androidx.browser.browseractions.ACTION", paramBrowserActionItem.getAction());
      if (paramBrowserActionItem.getIconId() != 0) {
        localBundle.putInt("androidx.browser.browseractions.ICON_ID", paramBrowserActionItem.getIconId());
      }
      if (paramBrowserActionItem.getIconUri() != null) {
        localBundle.putParcelable("androidx.browser.browseractions.ICON_URI", paramBrowserActionItem.getIconUri());
      }
      return localBundle;
    }
    
    public BrowserActionsIntent build()
    {
      this.mIntent.setData(this.mUri);
      this.mIntent.putExtra("androidx.browser.browseractions.extra.TYPE", this.mType);
      this.mIntent.putParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS", this.mMenuItems);
      PendingIntent localPendingIntent = PendingIntent.getActivity(this.mContext, 0, new Intent(), 67108864);
      this.mIntent.putExtra("androidx.browser.browseractions.APP_ID", localPendingIntent);
      localPendingIntent = this.mOnItemSelectedPendingIntent;
      if (localPendingIntent != null) {
        this.mIntent.putExtra("androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT", localPendingIntent);
      }
      BrowserServiceFileProvider.grantReadPermission(this.mIntent, this.mImageUris, this.mContext);
      return new BrowserActionsIntent(this.mIntent);
    }
    
    public Builder setCustomItems(ArrayList<BrowserActionItem> paramArrayList)
    {
      if (paramArrayList.size() <= 5)
      {
        int i = 0;
        while (i < paramArrayList.size()) {
          if ((!TextUtils.isEmpty(((BrowserActionItem)paramArrayList.get(i)).getTitle())) && (((BrowserActionItem)paramArrayList.get(i)).getAction() != null))
          {
            this.mMenuItems.add(getBundleFromItem((BrowserActionItem)paramArrayList.get(i)));
            if (((BrowserActionItem)paramArrayList.get(i)).getIconUri() != null) {
              this.mImageUris.add(((BrowserActionItem)paramArrayList.get(i)).getIconUri());
            }
            i++;
          }
          else
          {
            throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
          }
        }
        return this;
      }
      throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
    }
    
    public Builder setCustomItems(BrowserActionItem... paramVarArgs)
    {
      return setCustomItems(new ArrayList(Arrays.asList(paramVarArgs)));
    }
    
    public Builder setOnItemSelectedAction(PendingIntent paramPendingIntent)
    {
      this.mOnItemSelectedPendingIntent = paramPendingIntent;
      return this;
    }
    
    public Builder setUrlType(int paramInt)
    {
      this.mType = paramInt;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\browser\browseractions\BrowserActionsIntent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */