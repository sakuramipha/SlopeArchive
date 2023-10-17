package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import java.util.Objects;

public final class zzbjo
  extends zzbjb
{
  public static final int zza = 0;
  private WebViewClient zzb;
  private final H5AdsRequestHandler zzc;
  private final WebView zzd;
  
  public zzbjo(Context paramContext, WebView paramWebView)
  {
    Objects.requireNonNull(paramContext);
    Objects.requireNonNull(paramWebView);
    zzfoz.zzf(paramWebView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
    this.zzd = paramWebView;
    this.zzc = new H5AdsRequestHandler(paramContext, new zzbjn(paramWebView));
  }
  
  private final boolean zzc(WebView paramWebView)
  {
    if (this.zzd.equals(paramWebView)) {
      return true;
    }
    zzbzt.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
    return false;
  }
  
  public final WebViewClient getDelegate()
  {
    return this.zzb;
  }
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    if (!zzc(paramWebView)) {
      return;
    }
    if (!this.zzc.handleH5AdsRequest(paramString)) {
      super.onLoadResource(paramWebView, paramString);
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    if (!zzc(this.zzd)) {
      return false;
    }
    String str = paramWebResourceRequest.getUrl().toString();
    if (this.zzc.handleH5AdsRequest(str)) {
      return true;
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramWebResourceRequest);
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (!zzc(paramWebView)) {
      return false;
    }
    if (this.zzc.handleH5AdsRequest(paramString)) {
      return true;
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
  
  public final void zza()
  {
    this.zzc.clearAdObjects();
  }
  
  public final void zzb(WebViewClient paramWebViewClient)
  {
    boolean bool;
    if (paramWebViewClient != this) {
      bool = true;
    } else {
      bool = false;
    }
    zzfoz.zzf(bool, "Delegate cannot be itself.");
    this.zzb = paramWebViewClient;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */