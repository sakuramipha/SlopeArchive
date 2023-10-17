package androidx.core.telephony.mbms;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.telephony.mbms.ServiceInfo;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public final class MbmsHelper
{
  public static CharSequence getBestNameForService(Context paramContext, ServiceInfo paramServiceInfo)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject = null;
    if (i < 28) {
      return null;
    }
    LocaleList localLocaleList = paramContext.getResources().getConfiguration().getLocales();
    i = paramServiceInfo.getNamedContentLocales().size();
    if (i == 0) {
      return null;
    }
    paramContext = new String[i];
    i = 0;
    Iterator localIterator = paramServiceInfo.getNamedContentLocales().iterator();
    while (localIterator.hasNext())
    {
      paramContext[i] = ((Locale)localIterator.next()).toLanguageTag();
      i++;
    }
    paramContext = localLocaleList.getFirstMatch(paramContext);
    if (paramContext == null) {
      paramContext = (Context)localObject;
    } else {
      paramContext = paramServiceInfo.getNameForLocale(paramContext);
    }
    return paramContext;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\telephony\mbms\MbmsHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */