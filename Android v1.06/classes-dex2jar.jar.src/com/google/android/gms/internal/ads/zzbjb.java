package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public abstract class zzbjb
  extends WebViewClient
{
  public final void doUpdateVisitedHistory(WebView paramWebView, String paramString, boolean paramBoolean)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.doUpdateVisitedHistory(paramWebView, paramString, paramBoolean);
  }
  
  protected abstract WebViewClient getDelegate();
  
  public final void onFormResubmission(WebView paramWebView, Message paramMessage1, Message paramMessage2)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onFormResubmission(paramWebView, paramMessage1, paramMessage2);
  }
  
  public void onLoadResource(WebView paramWebView, String paramString)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onLoadResource(paramWebView, paramString);
  }
  
  public final void onPageCommitVisible(WebView paramWebView, String paramString)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onPageCommitVisible(paramWebView, paramString);
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onPageFinished(paramWebView, paramString);
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public final void onReceivedClientCertRequest(WebView paramWebView, ClientCertRequest paramClientCertRequest)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onReceivedClientCertRequest(paramWebView, paramClientCertRequest);
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }
  
  public final void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onReceivedError(paramWebView, paramWebResourceRequest, paramWebResourceError);
  }
  
  public final void onReceivedHttpAuthRequest(WebView paramWebView, HttpAuthHandler paramHttpAuthHandler, String paramString1, String paramString2)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onReceivedHttpAuthRequest(paramWebView, paramHttpAuthHandler, paramString1, paramString2);
  }
  
  public final void onReceivedHttpError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceResponse paramWebResourceResponse)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onReceivedHttpError(paramWebView, paramWebResourceRequest, paramWebResourceResponse);
  }
  
  public final void onReceivedLoginRequest(WebView paramWebView, String paramString1, String paramString2, String paramString3)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onReceivedLoginRequest(paramWebView, paramString1, paramString2, paramString3);
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
  }
  
  public final boolean onRenderProcessGone(WebView paramWebView, RenderProcessGoneDetail paramRenderProcessGoneDetail)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return false;
    }
    return localWebViewClient.onRenderProcessGone(paramWebView, paramRenderProcessGoneDetail);
  }
  
  public final void onSafeBrowsingHit(WebView paramWebView, WebResourceRequest paramWebResourceRequest, int paramInt, SafeBrowsingResponse paramSafeBrowsingResponse)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onSafeBrowsingHit(paramWebView, paramWebResourceRequest, paramInt, paramSafeBrowsingResponse);
  }
  
  public final void onScaleChanged(WebView paramWebView, float paramFloat1, float paramFloat2)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onScaleChanged(paramWebView, paramFloat1, paramFloat2);
  }
  
  public final void onTooManyRedirects(WebView paramWebView, Message paramMessage1, Message paramMessage2)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onTooManyRedirects(paramWebView, paramMessage1, paramMessage2);
  }
  
  public final void onUnhandledKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return;
    }
    localWebViewClient.onUnhandledKeyEvent(paramWebView, paramKeyEvent);
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return null;
    }
    return localWebViewClient.shouldInterceptRequest(paramWebView, paramWebResourceRequest);
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return null;
    }
    return localWebViewClient.shouldInterceptRequest(paramWebView, paramString);
  }
  
  public final boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return false;
    }
    return localWebViewClient.shouldOverrideKeyEvent(paramWebView, paramKeyEvent);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return false;
    }
    return localWebViewClient.shouldOverrideUrlLoading(paramWebView, paramWebResourceRequest);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    WebViewClient localWebViewClient = getDelegate();
    if (localWebViewClient == null) {
      return false;
    }
    return localWebViewClient.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */