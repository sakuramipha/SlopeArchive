package androidx.core.content;

import android.content.Intent;
import android.os.Build.VERSION;

public final class IntentCompat
{
  public static final String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
  public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
  public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
  public static final String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
  public static final String EXTRA_TIME = "android.intent.extra.TIME";
  
  public static Intent makeMainSelectorActivity(String paramString1, String paramString2)
  {
    if (Build.VERSION.SDK_INT >= 15) {
      return Intent.makeMainSelectorActivity(paramString1, paramString2);
    }
    paramString1 = new Intent(paramString1);
    paramString1.addCategory(paramString2);
    return paramString1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\content\IntentCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */