package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

final class zzdst
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  private final int zzd;
  private final String zze;
  private final int zzf;
  private final boolean zzg;
  
  public zzdst(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2, boolean paramBoolean)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = paramString3;
    this.zzd = paramInt1;
    this.zze = paramString4;
    this.zzf = paramInt2;
    this.zzg = paramBoolean;
  }
  
  public final JSONObject zza()
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("adapterClassName", this.zza);
    localJSONObject.put("version", this.zzc);
    zzbbc localzzbbc = zzbbk.zziL;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      localJSONObject.put("sdkVersion", this.zzb);
    }
    localJSONObject.put("status", this.zzd);
    localJSONObject.put("description", this.zze);
    localJSONObject.put("initializationLatencyMillis", this.zzf);
    localzzbbc = zzbbk.zziM;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      localJSONObject.put("supportsInitialization", this.zzg);
    }
    return localJSONObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */