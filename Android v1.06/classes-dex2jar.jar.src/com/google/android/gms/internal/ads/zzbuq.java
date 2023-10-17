package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamite.DynamiteModule;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbuq
  extends zzbur
{
  private final Object zza = new Object();
  private final Context zzb;
  private SharedPreferences zzc;
  private final zzbmo zzd;
  
  public zzbuq(Context paramContext, zzbmo paramzzbmo)
  {
    this.zzb = paramContext.getApplicationContext();
    this.zzd = paramzzbmo;
  }
  
  public static JSONObject zzc(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("js", zzbzz.zza().zza);
      localJSONObject.put("mf", zzbdd.zza.zze());
      localJSONObject.put("cl", "533571732");
      localJSONObject.put("rapid_rc", "dev");
      localJSONObject.put("rapid_rollup", "HEAD");
      localJSONObject.put("admob_module_version", 12451000);
      localJSONObject.put("dynamite_local_version", 231710100);
      localJSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(paramContext, "com.google.android.gms.ads.dynamite"));
      localJSONObject.put("container_version", 12451000);
      return localJSONObject;
    }
    catch (JSONException paramContext)
    {
      for (;;) {}
    }
  }
  
  public final zzfwb zza()
  {
    synchronized (this.zza)
    {
      if (this.zzc == null) {
        this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
      }
      long l = this.zzc.getLong("js_last_update", 0L);
      if (zzt.zzB().currentTimeMillis() - l < ((Long)zzbdd.zzb.zze()).longValue()) {
        return zzfvr.zzh(null);
      }
      JSONObject localJSONObject = zzc(this.zzb);
      return zzfvr.zzl(this.zzd.zzb(localJSONObject), new zzbup(this), zzcag.zzf);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbuq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */