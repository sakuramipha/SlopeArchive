package com.google.android.gms.internal.consent_sdk;

import android.os.Build.VERSION;
import android.webkit.WebView;

public final class zzcu
{
  private static Boolean zza;
  
  public static void zza(WebView paramWebView, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      try
      {
        Boolean localBoolean = zza;
        if (localBoolean == null) {
          try
          {
            paramWebView.evaluateJavascript("(function(){})()", null);
            zza = Boolean.valueOf(true);
          }
          catch (IllegalStateException localIllegalStateException)
          {
            zza = Boolean.valueOf(false);
          }
        }
        boolean bool = zza.booleanValue();
        if (bool)
        {
          paramWebView.evaluateJavascript(paramString, null);
          return;
        }
      }
      finally {}
    }
    paramWebView.loadUrl("javascript:".concat(paramString));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzcu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */