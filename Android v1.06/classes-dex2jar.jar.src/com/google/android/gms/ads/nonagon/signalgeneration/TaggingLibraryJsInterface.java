package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzfgj;
import com.google.android.gms.internal.ads.zzfwc;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

final class TaggingLibraryJsInterface
{
  private final Context zza;
  private final WebView zzb;
  private final zzaqq zzc;
  private final int zzd;
  private final zzdqh zze;
  private final boolean zzf;
  private final zzfwc zzg = zzcag.zze;
  private final zzfgj zzh;
  
  TaggingLibraryJsInterface(WebView paramWebView, zzaqq paramzzaqq, zzdqh paramzzdqh, zzfgj paramzzfgj)
  {
    this.zzb = paramWebView;
    paramWebView = paramWebView.getContext();
    this.zza = paramWebView;
    this.zzc = paramzzaqq;
    this.zze = paramzzdqh;
    zzbbk.zza(paramWebView);
    paramWebView = zzbbk.zziS;
    this.zzd = ((Integer)zzba.zzc().zzb(paramWebView)).intValue();
    paramWebView = zzbbk.zziT;
    this.zzf = ((Boolean)zzba.zzc().zzb(paramWebView)).booleanValue();
    this.zzh = paramzzfgj;
  }
  
  @JavascriptInterface
  public String getClickSignals(String paramString)
  {
    try
    {
      long l1 = zzt.zzB().currentTimeMillis();
      String str = this.zzc.zzc().zze(this.zza, paramString, this.zzb);
      if (this.zzf)
      {
        long l2 = zzt.zzB().currentTimeMillis();
        zzdqh localzzdqh = this.zze;
        paramString = new android/util/Pair;
        paramString.<init>("clat", String.valueOf(l2 - l1));
        zzf.zzc(localzzdqh, null, "csg", new Pair[] { paramString });
      }
      return str;
    }
    catch (RuntimeException paramString)
    {
      zzbzt.zzh("Exception getting click signals. ", paramString);
      zzt.zzo().zzu(paramString, "TaggingLibraryJsInterface.getClickSignals");
    }
    return "";
  }
  
  @JavascriptInterface
  public String getClickSignalsWithTimeout(String paramString, int paramInt)
  {
    if (paramInt <= 0)
    {
      paramString = new StringBuilder();
      paramString.append("Invalid timeout for getting click signals. Timeout=");
      paramString.append(paramInt);
      zzbzt.zzg(paramString.toString());
      return "";
    }
    paramInt = Math.min(paramInt, this.zzd);
    paramString = zzcag.zza.zzb(new zzaq(this, paramString));
    long l = paramInt;
    try
    {
      paramString = (String)paramString.get(l, TimeUnit.MILLISECONDS);
      return paramString;
    }
    catch (ExecutionException paramString) {}catch (TimeoutException paramString) {}catch (InterruptedException paramString) {}
    zzbzt.zzh("Exception getting click signals with timeout. ", paramString);
    zzt.zzo().zzu(paramString, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
    if ((paramString instanceof TimeoutException)) {
      return "17";
    }
    return "";
  }
  
  @JavascriptInterface
  public String getQueryInfo()
  {
    zzt.zzp();
    String str = UUID.randomUUID().toString();
    Bundle localBundle = new Bundle();
    localBundle.putString("query_info_type", "requester_type_6");
    zzar localzzar = new zzar(this, str);
    Object localObject = zzbbk.zziV;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      this.zzg.execute(new zzao(this, localBundle, localzzar));
    }
    else
    {
      localObject = this.zza;
      AdFormat localAdFormat = AdFormat.BANNER;
      AdRequest.Builder localBuilder = new AdRequest.Builder();
      localBuilder.addNetworkExtrasBundle(AdMobAdapter.class, localBundle);
      QueryInfo.generate((Context)localObject, localAdFormat, localBuilder.build(), localzzar);
    }
    return str;
  }
  
  @JavascriptInterface
  public String getViewSignals()
  {
    try
    {
      long l2 = zzt.zzB().currentTimeMillis();
      String str = this.zzc.zzc().zzh(this.zza, this.zzb, null);
      if (this.zzf)
      {
        long l1 = zzt.zzB().currentTimeMillis();
        zzdqh localzzdqh = this.zze;
        Pair localPair = new android/util/Pair;
        localPair.<init>("vlat", String.valueOf(l1 - l2));
        zzf.zzc(localzzdqh, null, "vsg", new Pair[] { localPair });
      }
      return str;
    }
    catch (RuntimeException localRuntimeException)
    {
      zzbzt.zzh("Exception getting view signals. ", localRuntimeException);
      zzt.zzo().zzu(localRuntimeException, "TaggingLibraryJsInterface.getViewSignals");
    }
    return "";
  }
  
  @JavascriptInterface
  public String getViewSignalsWithTimeout(int paramInt)
  {
    if (paramInt <= 0)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid timeout for getting view signals. Timeout=");
      ((StringBuilder)localObject).append(paramInt);
      zzbzt.zzg(((StringBuilder)localObject).toString());
      return "";
    }
    paramInt = Math.min(paramInt, this.zzd);
    Object localObject = zzcag.zza.zzb(new zzap(this));
    long l = paramInt;
    try
    {
      localObject = (String)((Future)localObject).get(l, TimeUnit.MILLISECONDS);
      return (String)localObject;
    }
    catch (ExecutionException localExecutionException) {}catch (TimeoutException localTimeoutException) {}catch (InterruptedException localInterruptedException) {}
    zzbzt.zzh("Exception getting view signals with timeout. ", localInterruptedException);
    zzt.zzo().zzu(localInterruptedException, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
    if ((localInterruptedException instanceof TimeoutException)) {
      return "17";
    }
    return "";
  }
  
  @JavascriptInterface
  public void recordClick(String paramString)
  {
    zzbbc localzzbbc = zzbbk.zziX;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (!TextUtils.isEmpty(paramString))) {
      zzcag.zza.execute(new zzan(this, paramString));
    }
  }
  
  @JavascriptInterface
  public void reportTouchEvent(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      int j = localJSONObject.getInt("x");
      int k = localJSONObject.getInt("y");
      int m = localJSONObject.getInt("duration_ms");
      float f = (float)localJSONObject.getDouble("force");
      int i = localJSONObject.getInt("type");
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3) {
              i = -1;
            } else {
              i = 3;
            }
          }
          else {
            i = 2;
          }
        }
        else {
          i = 1;
        }
      }
      else {
        i = 0;
      }
      paramString = MotionEvent.obtain(0L, m, i, j, k, f, 1.0F, 0, 1.0F, 1.0F, 0, 0);
      try
      {
        this.zzc.zzd(paramString);
        return;
      }
      catch (JSONException paramString) {}catch (RuntimeException paramString) {}
      zzbzt.zzh("Failed to parse the touch string. ", paramString);
    }
    catch (JSONException paramString) {}catch (RuntimeException paramString) {}
    zzt.zzo().zzu(paramString, "TaggingLibraryJsInterface.reportTouchEvent");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\TaggingLibraryJsInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */