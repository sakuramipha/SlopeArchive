package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdhg
  extends zzdhh
{
  private final JSONObject zzb;
  private final boolean zzc;
  private final boolean zzd;
  private final boolean zze;
  private final boolean zzf;
  private final String zzg;
  private final JSONObject zzh;
  
  public zzdhg(zzezf paramzzezf, JSONObject paramJSONObject)
  {
    super(paramzzezf);
    this.zzb = zzbu.zzg(paramJSONObject, new String[] { "tracking_urls_and_actions", "active_view" });
    boolean bool = false;
    this.zzc = zzbu.zzk(false, paramJSONObject, new String[] { "allow_pub_owned_ad_view" });
    this.zzd = zzbu.zzk(false, paramJSONObject, new String[] { "attribution", "allow_pub_rendering" });
    this.zze = zzbu.zzk(false, paramJSONObject, new String[] { "enable_omid" });
    this.zzg = zzbu.zzb("", paramJSONObject, new String[] { "watermark_overlay_png_base64" });
    if (paramJSONObject.optJSONObject("overlay") != null) {
      bool = true;
    }
    this.zzf = bool;
    paramzzezf = zzbbk.zzeO;
    if (((Boolean)zzba.zzc().zzb(paramzzezf)).booleanValue()) {}
    for (paramzzezf = paramJSONObject.optJSONObject("omid_settings");; paramzzezf = null)
    {
      this.zzh = paramzzezf;
      return;
    }
  }
  
  public final zzfad zza()
  {
    Object localObject = this.zzh;
    if (localObject != null) {
      localObject = new zzfad((JSONObject)localObject);
    } else {
      localObject = this.zza.zzW;
    }
    return (zzfad)localObject;
  }
  
  public final String zzb()
  {
    return this.zzg;
  }
  
  public final JSONObject zzc()
  {
    JSONObject localJSONObject = this.zzb;
    if (localJSONObject != null) {
      return localJSONObject;
    }
    try
    {
      localJSONObject = new JSONObject(this.zza.zzA);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public final boolean zzd()
  {
    return this.zze;
  }
  
  public final boolean zze()
  {
    return this.zzc;
  }
  
  public final boolean zzf()
  {
    return this.zzd;
  }
  
  public final boolean zzg()
  {
    return this.zzf;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdhg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */