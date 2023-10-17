package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbjo;

public final class H5AdsWebViewClient
  extends zzbjb
{
  private final zzbjo zza;
  
  public H5AdsWebViewClient(Context paramContext, WebView paramWebView)
  {
    this.zza = new zzbjo(paramContext, paramWebView);
  }
  
  public void clearAdObjects()
  {
    this.zza.zza();
  }
  
  protected WebViewClient getDelegate()
  {
    return this.zza;
  }
  
  public WebViewClient getDelegateWebViewClient()
  {
    return this.zza.getDelegate();
  }
  
  public void setDelegateWebViewClient(WebViewClient paramWebViewClient)
  {
    this.zza.zzb(paramWebViewClient);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\h5\H5AdsWebViewClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */