package androidx.core.text;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

public final class TextUtilsCompat
{
  private static final String ARAB_SCRIPT_SUBTAG = "Arab";
  private static final String HEBR_SCRIPT_SUBTAG = "Hebr";
  private static final Locale ROOT = new Locale("", "");
  
  private static int getLayoutDirectionFromFirstChar(Locale paramLocale)
  {
    int i = Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0));
    if ((i != 1) && (i != 2)) {
      return 0;
    }
    return 1;
  }
  
  public static int getLayoutDirectionFromLocale(Locale paramLocale)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return TextUtils.getLayoutDirectionFromLocale(paramLocale);
    }
    if ((paramLocale != null) && (!paramLocale.equals(ROOT)))
    {
      String str = ICUCompat.maximizeAndGetScript(paramLocale);
      if (str == null) {
        return getLayoutDirectionFromFirstChar(paramLocale);
      }
      if ((str.equalsIgnoreCase("Arab")) || (str.equalsIgnoreCase("Hebr"))) {
        return 1;
      }
    }
    return 0;
  }
  
  public static String htmlEncode(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return TextUtils.htmlEncode(paramString);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      if (c != '"')
      {
        if (c != '<')
        {
          if (c != '>')
          {
            if (c != '&')
            {
              if (c != '\'') {
                localStringBuilder.append(c);
              } else {
                localStringBuilder.append("&#39;");
              }
            }
            else {
              localStringBuilder.append("&amp;");
            }
          }
          else {
            localStringBuilder.append("&gt;");
          }
        }
        else {
          localStringBuilder.append("&lt;");
        }
      }
      else {
        localStringBuilder.append("&quot;");
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\text\TextUtilsCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */