package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;

public final class zzcfa
  extends WebChromeClient
{
  private final zzcfb zza;
  
  public zzcfa(zzcfb paramzzcfb)
  {
    this.zza = paramzzcfb;
  }
  
  private static final Context zzb(WebView paramWebView)
  {
    if (!(paramWebView instanceof zzcfb)) {
      return paramWebView.getContext();
    }
    zzcfb localzzcfb = (zzcfb)paramWebView;
    paramWebView = localzzcfb.zzi();
    if (paramWebView != null) {
      return paramWebView;
    }
    return localzzcfb.getContext();
  }
  
  public final void onCloseWindow(WebView paramWebView)
  {
    if (!(paramWebView instanceof zzcfb))
    {
      zzbzt.zzj("Tried to close a WebView that wasn't an AdWebView.");
      return;
    }
    paramWebView = ((zzcfb)paramWebView).zzL();
    if (paramWebView == null)
    {
      zzbzt.zzj("Tried to close an AdWebView not associated with an overlay.");
      return;
    }
    paramWebView.zzb();
  }
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str1 = paramConsoleMessage.message();
    String str2 = paramConsoleMessage.sourceId();
    int i = paramConsoleMessage.lineNumber();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("JS: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(" (");
    localStringBuilder.append(str2);
    localStringBuilder.append(":");
    localStringBuilder.append(i);
    localStringBuilder.append(")");
    str1 = localStringBuilder.toString();
    if (str1.contains("Application Cache")) {
      return super.onConsoleMessage(paramConsoleMessage);
    }
    i = zzcez.zza[paramConsoleMessage.messageLevel().ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if ((i != 3) && (i != 4))
        {
          if (i != 5) {
            zzbzt.zzi(str1);
          } else {
            zzbzt.zze(str1);
          }
        }
        else {
          zzbzt.zzi(str1);
        }
      }
      else {
        zzbzt.zzj(str1);
      }
    }
    else {
      zzbzt.zzg(str1);
    }
    return super.onConsoleMessage(paramConsoleMessage);
  }
  
  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebView.WebViewTransport localWebViewTransport = (WebView.WebViewTransport)paramMessage.obj;
    paramWebView = new WebView(paramWebView.getContext());
    if (this.zza.zzH() != null) {
      paramWebView.setWebViewClient(this.zza.zzH());
    }
    localWebViewTransport.setWebView(paramWebView);
    paramMessage.sendToTarget();
    return true;
  }
  
  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l = 5242880L - paramLong3;
    if (l <= 0L)
    {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    }
    if (paramLong1 == 0L)
    {
      if ((paramLong2 > l) || (paramLong2 > 1048576L)) {
        paramLong2 = 0L;
      }
    }
    else if (paramLong2 == 0L)
    {
      paramLong2 = Math.min(paramLong1 + Math.min(131072L, l), 1048576L);
    }
    else
    {
      paramLong3 = paramLong1;
      if (paramLong2 <= Math.min(1048576L - paramLong1, l)) {
        paramLong3 = paramLong1 + paramLong2;
      }
      paramLong2 = paramLong3;
    }
    paramQuotaUpdater.updateQuota(paramLong2);
  }
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      zzt.zzp();
      if (!zzs.zzw(this.zza.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
      {
        zzt.zzp();
        if (!zzs.zzw(this.zza.getContext(), "android.permission.ACCESS_COARSE_LOCATION"))
        {
          bool = false;
          break label56;
        }
      }
      boolean bool = true;
      label56:
      paramCallback.invoke(paramString, bool, true);
    }
  }
  
  public final void onHideCustomView()
  {
    zzl localzzl = this.zza.zzL();
    if (localzzl == null)
    {
      zzbzt.zzj("Could not get ad overlay when hiding custom view.");
      return;
    }
    localzzl.zzf();
  }
  
  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return zza(zzb(paramWebView), "alert", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return zza(zzb(paramWebView), "onBeforeUnload", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return zza(zzb(paramWebView), "confirm", paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return zza(zzb(paramWebView), "prompt", paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }
  
  @Deprecated
  public final void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    zzl localzzl = this.zza.zzL();
    if (localzzl == null)
    {
      zzbzt.zzj("Could not get ad overlay when showing custom view.");
      paramCustomViewCallback.onCustomViewHidden();
      return;
    }
    localzzl.zzB(paramView, paramCustomViewCallback);
    localzzl.zzz(paramInt);
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    onShowCustomView(paramView, -1, paramCustomViewCallback);
  }
  
  protected final boolean zza(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    try
    {
      Object localObject = this.zza;
      if ((localObject != null) && (((zzcfb)localObject).zzN() != null) && (this.zza.zzN().zzd() != null))
      {
        localObject = this.zza.zzN().zzd();
        if ((localObject != null) && (!((zzb)localObject).zzc()))
        {
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>();
          paramContext.append("window.");
          paramContext.append(paramString1);
          paramContext.append("('");
          paramContext.append(paramString3);
          paramContext.append("')");
          ((zzb)localObject).zzb(paramContext.toString());
          return false;
        }
      }
      zzt.zzp();
      paramString1 = zzs.zzG(paramContext);
      paramString1.setTitle(paramString2);
      if (paramBoolean)
      {
        localObject = new android/widget/LinearLayout;
        ((LinearLayout)localObject).<init>(paramContext);
        ((LinearLayout)localObject).setOrientation(1);
        paramJsResult = new android/widget/TextView;
        paramJsResult.<init>(paramContext);
        paramJsResult.setText(paramString3);
        paramString2 = new android/widget/EditText;
        paramString2.<init>(paramContext);
        paramString2.setText(paramString4);
        ((LinearLayout)localObject).addView(paramJsResult);
        ((LinearLayout)localObject).addView(paramString2);
        paramContext = paramString1.setView((View)localObject);
        paramString1 = new com/google/android/gms/internal/ads/zzcey;
        paramString1.<init>(paramJsPromptResult, paramString2);
        paramContext = paramContext.setPositiveButton(17039370, paramString1);
        paramString1 = new com/google/android/gms/internal/ads/zzcex;
        paramString1.<init>(paramJsPromptResult);
        paramContext = paramContext.setNegativeButton(17039360, paramString1);
        paramString1 = new com/google/android/gms/internal/ads/zzcew;
        paramString1.<init>(paramJsPromptResult);
        paramContext.setOnCancelListener(paramString1).create().show();
      }
      else
      {
        paramString1 = paramString1.setMessage(paramString3);
        paramContext = new com/google/android/gms/internal/ads/zzcev;
        paramContext.<init>(paramJsResult);
        paramContext = paramString1.setPositiveButton(17039370, paramContext);
        paramString1 = new com/google/android/gms/internal/ads/zzceu;
        paramString1.<init>(paramJsResult);
        paramString1 = paramContext.setNegativeButton(17039360, paramString1);
        paramContext = new com/google/android/gms/internal/ads/zzcet;
        paramContext.<init>(paramJsResult);
        paramString1.setOnCancelListener(paramContext).create().show();
      }
    }
    catch (WindowManager.BadTokenException paramContext)
    {
      zzbzt.zzk("Fail to display Dialog.", paramContext);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */