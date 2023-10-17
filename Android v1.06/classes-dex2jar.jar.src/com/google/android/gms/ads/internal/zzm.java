package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzfba;

final class zzm
  extends WebViewClient
{
  final zzs zza;
  
  zzm(zzs paramzzs) {}
  
  public final void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    paramWebView = this.zza;
    if (zzs.zzh(paramWebView) != null) {
      try
      {
        zzs.zzh(paramWebView).zzf(zzfba.zzd(1, null, null));
      }
      catch (RemoteException paramWebView)
      {
        zzbzt.zzl("#007 Could not call remote method.", paramWebView);
      }
    }
    paramWebView = this.zza;
    if (zzs.zzh(paramWebView) != null) {
      try
      {
        zzs.zzh(paramWebView).zze(0);
        return;
      }
      catch (RemoteException paramWebView)
      {
        zzbzt.zzl("#007 Could not call remote method.", paramWebView);
      }
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString.startsWith(this.zza.zzq())) {
      return false;
    }
    if (paramString.startsWith("gmsg://noAdLoaded"))
    {
      paramWebView = this.zza;
      if (zzs.zzh(paramWebView) != null) {
        try
        {
          zzs.zzh(paramWebView).zzf(zzfba.zzd(3, null, null));
        }
        catch (RemoteException paramWebView)
        {
          zzbzt.zzl("#007 Could not call remote method.", paramWebView);
        }
      }
      paramWebView = this.zza;
      if (zzs.zzh(paramWebView) != null) {
        try
        {
          zzs.zzh(paramWebView).zze(3);
        }
        catch (RemoteException paramWebView)
        {
          zzbzt.zzl("#007 Could not call remote method.", paramWebView);
        }
      }
      this.zza.zzV(0);
      return true;
    }
    if (paramString.startsWith("gmsg://scriptLoadFailed"))
    {
      paramWebView = this.zza;
      if (zzs.zzh(paramWebView) != null) {
        try
        {
          zzs.zzh(paramWebView).zzf(zzfba.zzd(1, null, null));
        }
        catch (RemoteException paramWebView)
        {
          zzbzt.zzl("#007 Could not call remote method.", paramWebView);
        }
      }
      paramWebView = this.zza;
      if (zzs.zzh(paramWebView) != null) {
        try
        {
          zzs.zzh(paramWebView).zze(0);
        }
        catch (RemoteException paramWebView)
        {
          zzbzt.zzl("#007 Could not call remote method.", paramWebView);
        }
      }
      this.zza.zzV(0);
      return true;
    }
    if (paramString.startsWith("gmsg://adResized"))
    {
      paramWebView = this.zza;
      if (zzs.zzh(paramWebView) != null) {
        try
        {
          zzs.zzh(paramWebView).zzi();
        }
        catch (RemoteException paramWebView)
        {
          zzbzt.zzl("#007 Could not call remote method.", paramWebView);
        }
      }
      int i = this.zza.zzb(paramString);
      this.zza.zzV(i);
      return true;
    }
    if (paramString.startsWith("gmsg://")) {
      return true;
    }
    paramWebView = this.zza;
    if (zzs.zzh(paramWebView) != null) {
      try
      {
        zzs.zzh(paramWebView).zzc();
        zzs.zzh(this.zza).zzh();
      }
      catch (RemoteException paramWebView)
      {
        zzbzt.zzl("#007 Could not call remote method.", paramWebView);
      }
    }
    paramWebView = zzs.zzo(this.zza, paramString);
    zzs.zzw(this.zza, paramWebView);
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\zzm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */