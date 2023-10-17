package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONObject;

public final class zzfhi
{
  private static final zzfhi zza = new zzfhi();
  
  public static final zzfhi zza()
  {
    return zza;
  }
  
  final void zzb(WebView paramWebView, String paramString, Object... paramVarArgs)
  {
    if (paramWebView != null)
    {
      StringBuilder localStringBuilder = new StringBuilder(128);
      localStringBuilder.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
      localStringBuilder.append(paramString);
      localStringBuilder.append("(");
      int j = paramVarArgs.length;
      if (j > 0)
      {
        for (int i = 0; i < j; i++)
        {
          paramString = paramVarArgs[i];
          if (paramString == null)
          {
            localStringBuilder.append("\"\"");
          }
          else if ((paramString instanceof String))
          {
            paramString = paramString.toString();
            if (paramString.startsWith("{"))
            {
              localStringBuilder.append(paramString);
            }
            else
            {
              localStringBuilder.append('"');
              localStringBuilder.append(paramString);
              localStringBuilder.append('"');
            }
          }
          else
          {
            localStringBuilder.append(paramString);
          }
          localStringBuilder.append(",");
        }
        localStringBuilder.setLength(localStringBuilder.length() - 1);
      }
      localStringBuilder.append(")}");
      paramString = localStringBuilder.toString();
      paramVarArgs = paramWebView.getHandler();
      if ((paramVarArgs != null) && (Looper.myLooper() != paramVarArgs.getLooper()))
      {
        paramVarArgs.post(new zzfhh(this, paramWebView, paramString));
        return;
      }
      paramWebView.loadUrl(paramString);
      return;
    }
    zzfgl.zza.booleanValue();
  }
  
  public final void zzc(WebView paramWebView)
  {
    zzb(paramWebView, "finishSession", new Object[0]);
  }
  
  public final void zzd(WebView paramWebView, JSONObject paramJSONObject)
  {
    zzb(paramWebView, "init", new Object[] { paramJSONObject });
  }
  
  public final void zze(WebView paramWebView, float paramFloat)
  {
    zzb(paramWebView, "setDeviceVolume", new Object[] { Float.valueOf(paramFloat) });
  }
  
  public final void zzf(WebView paramWebView, String paramString)
  {
    zzb(paramWebView, "setNativeViewHierarchy", new Object[] { paramString });
  }
  
  public final void zzg(WebView paramWebView, String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    zzb(paramWebView, "startSession", new Object[] { paramString, paramJSONObject1, paramJSONObject2, paramJSONObject3 });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */