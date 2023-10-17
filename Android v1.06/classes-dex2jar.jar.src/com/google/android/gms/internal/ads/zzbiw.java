package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzbiw
  implements zzbii
{
  private final Object zza = new Object();
  private final Map zzb = new HashMap();
  
  public final void zza(Object paramObject, Map paramMap)
  {
    Object localObject2 = (String)paramMap.get("id");
    String str1 = (String)paramMap.get("fail");
    paramObject = (String)paramMap.get("fail_reason");
    ??? = (String)paramMap.get("fail_stack");
    String str2 = (String)paramMap.get("result");
    if (true == TextUtils.isEmpty((CharSequence)???)) {
      paramObject = "Unknown Fail Reason.";
    }
    if (TextUtils.isEmpty((CharSequence)???)) {
      paramMap = "";
    } else {
      paramMap = "\n".concat(String.valueOf(???));
    }
    synchronized (this.zza)
    {
      zzbiv localzzbiv = (zzbiv)this.zzb.remove(localObject2);
      if (localzzbiv == null)
      {
        paramObject = new java/lang/StringBuilder;
        ((StringBuilder)paramObject).<init>();
        ((StringBuilder)paramObject).append("Received result for unexpected method invocation: ");
        ((StringBuilder)paramObject).append((String)localObject2);
        zzbzt.zzj(((StringBuilder)paramObject).toString());
        return;
      }
      if (!TextUtils.isEmpty(str1))
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append((String)paramObject);
        ((StringBuilder)localObject2).append(paramMap);
        localzzbiv.zza(((StringBuilder)localObject2).toString());
        return;
      }
      if (str2 == null)
      {
        localzzbiv.zzb(null);
        return;
      }
      try
      {
        paramObject = new org/json/JSONObject;
        ((JSONObject)paramObject).<init>(str2);
        if (zze.zzc())
        {
          localObject2 = ((JSONObject)paramObject).toString(2);
          paramMap = new java/lang/StringBuilder;
          paramMap.<init>();
          paramMap.append("Result GMSG: ");
          paramMap.append((String)localObject2);
          zze.zza(paramMap.toString());
        }
        localzzbiv.zzb((JSONObject)paramObject);
      }
      catch (JSONException paramObject)
      {
        localzzbiv.zza(((JSONException)paramObject).getMessage());
      }
      return;
    }
  }
  
  public final zzfwb zzb(zzblo paramzzblo, String paramString, JSONObject paramJSONObject)
  {
    zzcal localzzcal = new zzcal();
    zzt.zzp();
    String str = UUID.randomUUID().toString();
    zzc(str, new zzbiu(this, localzzcal));
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("id", str);
      localJSONObject.put("args", paramJSONObject);
      paramzzblo.zzl(paramString, localJSONObject);
    }
    catch (Exception paramzzblo)
    {
      localzzcal.zze(paramzzblo);
    }
    return localzzcal;
  }
  
  public final void zzc(String paramString, zzbiv paramzzbiv)
  {
    synchronized (this.zza)
    {
      this.zzb.put(paramString, paramzzbiv);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbiw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */