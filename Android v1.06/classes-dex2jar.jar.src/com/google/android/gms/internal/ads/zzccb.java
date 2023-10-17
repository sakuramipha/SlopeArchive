package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzccb
{
  public final boolean zza;
  public final int zzb;
  public final int zzc;
  public final int zzd;
  public final String zze;
  public final int zzf;
  public final int zzg;
  public final int zzh;
  public final int zzi;
  public final boolean zzj;
  public final boolean zzk;
  public final boolean zzl;
  public final boolean zzm;
  public final long zzn;
  public final long zzo;
  
  public zzccb(String paramString)
  {
    zzbbc localzzbbc = null;
    Object localObject = localzzbbc;
    if (paramString != null) {
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
      }
      catch (JSONException paramString)
      {
        localObject = localzzbbc;
      }
    }
    this.zza = zza((JSONObject)localObject, "aggressive_media_codec_release", zzbbk.zzJ);
    this.zzb = zzb((JSONObject)localObject, "byte_buffer_precache_limit", zzbbk.zzl);
    this.zzc = zzb((JSONObject)localObject, "exo_cache_buffer_size", zzbbk.zzw);
    this.zzd = zzb((JSONObject)localObject, "exo_connect_timeout_millis", zzbbk.zzh);
    localzzbbc = zzbbk.zzg;
    if (localObject != null) {}
    try
    {
      paramString = ((JSONObject)localObject).getString("exo_player_version");
    }
    catch (JSONException paramString)
    {
      for (;;) {}
    }
    paramString = (String)zzba.zzc().zzb(localzzbbc);
    this.zze = paramString;
    this.zzf = zzb((JSONObject)localObject, "exo_read_timeout_millis", zzbbk.zzi);
    this.zzg = zzb((JSONObject)localObject, "load_check_interval_bytes", zzbbk.zzj);
    this.zzh = zzb((JSONObject)localObject, "player_precache_limit", zzbbk.zzk);
    this.zzi = zzb((JSONObject)localObject, "socket_receive_buffer_size", zzbbk.zzm);
    this.zzj = zza((JSONObject)localObject, "use_cache_data_source", zzbbk.zzdX);
    zzb((JSONObject)localObject, "min_retry_count", zzbbk.zzn);
    this.zzk = zza((JSONObject)localObject, "treat_load_exception_as_non_fatal", zzbbk.zzq);
    this.zzl = zza((JSONObject)localObject, "enable_multiple_video_playback", zzbbk.zzbK);
    this.zzm = zza((JSONObject)localObject, "use_range_http_data_source", zzbbk.zzbM);
    this.zzn = zzc((JSONObject)localObject, "range_http_data_source_high_water_mark", zzbbk.zzbN);
    this.zzo = zzc((JSONObject)localObject, "range_http_data_source_low_water_mark", zzbbk.zzbO);
  }
  
  private static final boolean zza(JSONObject paramJSONObject, String paramString, zzbbc paramzzbbc)
  {
    boolean bool2 = ((Boolean)zzba.zzc().zzb(paramzzbbc)).booleanValue();
    boolean bool1 = bool2;
    if (paramJSONObject != null) {}
    try
    {
      bool1 = paramJSONObject.getBoolean(paramString);
      return bool1;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        bool1 = bool2;
      }
    }
  }
  
  private static final int zzb(JSONObject paramJSONObject, String paramString, zzbbc paramzzbbc)
  {
    if (paramJSONObject != null) {}
    try
    {
      int i = paramJSONObject.getInt(paramString);
      return i;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return ((Integer)zzba.zzc().zzb(paramzzbbc)).intValue();
  }
  
  private static final long zzc(JSONObject paramJSONObject, String paramString, zzbbc paramzzbbc)
  {
    if (paramJSONObject != null) {}
    try
    {
      long l = paramJSONObject.getLong(paramString);
      return l;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return ((Long)zzba.zzc().zzb(paramzzbbc)).longValue();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzccb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */