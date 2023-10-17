package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class zzfhs
  extends zzfhp
{
  private WebView zza;
  private Long zzb = null;
  private final Map zzc;
  
  public zzfhs(Map paramMap, String paramString)
  {
    this.zzc = paramMap;
  }
  
  public final void zzc()
  {
    super.zzc();
    if (this.zzb == null) {
      l = 4000L;
    } else {
      l = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
    }
    long l = Math.max(4000L - l, 2000L);
    new Handler().postDelayed(new zzfhr(this), l);
    this.zza = null;
  }
  
  public final void zzf(zzfgs paramzzfgs, zzfgq paramzzfgq)
  {
    JSONObject localJSONObject = new JSONObject();
    Map localMap = paramzzfgq.zzi();
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      zzfht.zze(localJSONObject, str, (zzfgy)localMap.get(str));
    }
    zzg(paramzzfgs, paramzzfgq, localJSONObject);
  }
  
  public final void zzj()
  {
    Object localObject = new WebView(zzfhg.zzb().zza());
    this.zza = ((WebView)localObject);
    ((WebView)localObject).getSettings().setJavaScriptEnabled(true);
    zzi(this.zza);
    localObject = this.zza;
    if ((localObject != null) && (!TextUtils.isEmpty(null))) {
      ((WebView)localObject).loadUrl("javascript: null");
    }
    localObject = this.zzc.keySet().iterator();
    if (!((Iterator)localObject).hasNext())
    {
      this.zzb = Long.valueOf(System.nanoTime());
      return;
    }
    localObject = (String)((Iterator)localObject).next();
    localObject = (zzfgy)this.zzc.get(localObject);
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */