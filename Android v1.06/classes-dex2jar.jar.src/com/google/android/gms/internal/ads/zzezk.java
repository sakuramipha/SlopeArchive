package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzezk
{
  public final String zza;
  public final String zzb;
  public final JSONObject zzc;
  public final JSONObject zzd;
  
  zzezk(JsonReader paramJsonReader)
    throws IllegalStateException, IOException, JSONException, NumberFormatException
  {
    paramJsonReader = zzbu.zzh(paramJsonReader);
    this.zzd = paramJsonReader;
    this.zza = paramJsonReader.optString("ad_html", null);
    this.zzb = paramJsonReader.optString("ad_base_url", null);
    this.zzc = paramJsonReader.optJSONObject("ad_json");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzezk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */