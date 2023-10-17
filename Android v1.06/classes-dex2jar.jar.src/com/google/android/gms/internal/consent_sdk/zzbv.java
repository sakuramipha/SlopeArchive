package com.google.android.gms.internal.consent_sdk;

import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class zzbv
  extends WebViewClient
{
  final zzbw zza;
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    if (zzbw.zze(this.zza, paramString)) {
      zzbw.zza(this.zza).zzd(paramString);
    }
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    if (!zzbw.zzd(this.zza))
    {
      Log.d("UserMessagingPlatform", "Wall html loaded.");
      zzbw.zzb(this.zza, true);
    }
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    zzbw.zza(this.zza).zze(paramInt, paramString1, paramString2);
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    paramWebView = paramWebResourceRequest.getUrl().toString();
    if (zzbw.zze(this.zza, paramWebView))
    {
      zzbw.zza(this.zza).zzd(paramWebView);
      return true;
    }
    return false;
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (zzbw.zze(this.zza, paramString))
    {
      zzbw.zza(this.zza).zzd(paramString);
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */