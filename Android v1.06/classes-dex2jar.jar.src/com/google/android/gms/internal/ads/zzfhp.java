package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class zzfhp
{
  private zzfin zza;
  private long zzb;
  private int zzc;
  
  public zzfhp()
  {
    zzb();
    this.zza = new zzfin(null);
  }
  
  public final WebView zza()
  {
    return (WebView)this.zza.get();
  }
  
  public final void zzb()
  {
    this.zzb = System.nanoTime();
    this.zzc = 1;
  }
  
  public void zzc()
  {
    this.zza.clear();
  }
  
  public final void zzd(String paramString, long paramLong)
  {
    if ((paramLong >= this.zzb) && (this.zzc != 3))
    {
      this.zzc = 3;
      zzfhi.zza().zzf(zza(), paramString);
    }
  }
  
  public final void zze(String paramString, long paramLong)
  {
    if (paramLong >= this.zzb)
    {
      this.zzc = 2;
      zzfhi.zza().zzf(zza(), paramString);
    }
  }
  
  public void zzf(zzfgs paramzzfgs, zzfgq paramzzfgq)
  {
    zzg(paramzzfgs, paramzzfgq, null);
  }
  
  protected final void zzg(zzfgs paramzzfgs, zzfgq paramzzfgq, JSONObject paramJSONObject)
  {
    paramzzfgs = paramzzfgs.zzh();
    JSONObject localJSONObject1 = new JSONObject();
    zzfht.zze(localJSONObject1, "environment", "app");
    zzfht.zze(localJSONObject1, "adSessionType", paramzzfgq.zzd());
    JSONObject localJSONObject2 = new JSONObject();
    Object localObject = Build.MANUFACTURER;
    String str = Build.MODEL;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("; ");
    localStringBuilder.append(str);
    zzfht.zze(localJSONObject2, "deviceType", localStringBuilder.toString());
    zzfht.zze(localJSONObject2, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
    zzfht.zze(localJSONObject2, "os", "Android");
    zzfht.zze(localJSONObject1, "deviceInfo", localJSONObject2);
    localObject = new JSONArray();
    ((JSONArray)localObject).put("clid");
    ((JSONArray)localObject).put("vlid");
    zzfht.zze(localJSONObject1, "supports", localObject);
    localObject = new JSONObject();
    zzfht.zze((JSONObject)localObject, "partnerName", paramzzfgq.zze().zzb());
    zzfht.zze((JSONObject)localObject, "partnerVersion", paramzzfgq.zze().zzc());
    zzfht.zze(localJSONObject1, "omidNativeInfo", localObject);
    localObject = new JSONObject();
    zzfht.zze((JSONObject)localObject, "libraryVersion", "1.3.37-google_20220829");
    zzfht.zze((JSONObject)localObject, "appId", zzfhg.zzb().zza().getApplicationContext().getPackageName());
    zzfht.zze(localJSONObject1, "app", localObject);
    if (paramzzfgq.zzf() != null) {
      zzfht.zze(localJSONObject1, "contentUrl", paramzzfgq.zzf());
    }
    zzfht.zze(localJSONObject1, "customReferenceData", paramzzfgq.zzg());
    localObject = new JSONObject();
    paramzzfgq = paramzzfgq.zzh().iterator();
    if (!paramzzfgq.hasNext())
    {
      zzfhi.zza().zzg(zza(), paramzzfgs, localJSONObject1, (JSONObject)localObject, paramJSONObject);
      return;
    }
    paramzzfgs = (zzfgy)paramzzfgq.next();
    throw null;
  }
  
  public final void zzh(float paramFloat)
  {
    zzfhi.zza().zze(zza(), paramFloat);
  }
  
  final void zzi(WebView paramWebView)
  {
    this.zza = new zzfin(paramWebView);
  }
  
  public void zzj() {}
  
  public final boolean zzk()
  {
    return this.zza.get() != null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */