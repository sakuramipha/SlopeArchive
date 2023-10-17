package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.util.Collections;
import java.util.Map;

public class zzcge
  extends zzcfi
{
  public zzcge(zzcfb paramzzcfb, zzawx paramzzawx, boolean paramBoolean)
  {
    super(paramzzcfb, paramzzawx, paramBoolean);
  }
  
  protected final WebResourceResponse zzN(WebView paramWebView, String paramString, Map paramMap)
  {
    if (!(paramWebView instanceof zzcfb))
    {
      zzbzt.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
      return null;
    }
    zzcfb localzzcfb = (zzcfb)paramWebView;
    paramWebView = this.zza;
    if (paramWebView != null) {
      paramWebView.zzd(paramString, paramMap, 1);
    }
    if (!"mraid.js".equalsIgnoreCase(new File(paramString).getName()))
    {
      paramWebView = paramMap;
      if (paramMap == null) {
        paramWebView = Collections.emptyMap();
      }
      return super.zzc(paramString, paramWebView);
    }
    if (localzzcfb.zzN() != null) {
      localzzcfb.zzN().zzE();
    }
    if (localzzcfb.zzO().zzi())
    {
      paramWebView = zzbbk.zzP;
      paramWebView = (String)zzba.zzc().zzb(paramWebView);
    }
    else if (localzzcfb.zzaA())
    {
      paramWebView = zzbbk.zzO;
      paramWebView = (String)zzba.zzc().zzb(paramWebView);
    }
    else
    {
      paramWebView = zzbbk.zzN;
      paramWebView = (String)zzba.zzc().zzb(paramWebView);
    }
    zzt.zzp();
    return zzs.zzt(localzzcfb.getContext(), localzzcfb.zzn().zza, paramWebView);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */