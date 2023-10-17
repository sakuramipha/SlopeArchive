package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

final class zzauv
  implements Runnable
{
  final ValueCallback zza;
  final zzaux zze;
  
  zzauv(zzaux paramzzaux, zzaun paramzzaun, WebView paramWebView, boolean paramBoolean)
  {
    this.zza = new zzauu(this, paramzzaun, paramWebView, paramBoolean);
  }
  
  public final void run()
  {
    if (this.zzc.getSettings().getJavaScriptEnabled()) {
      try
      {
        this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
        return;
      }
      finally
      {
        this.zza.onReceiveValue("");
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzauv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */