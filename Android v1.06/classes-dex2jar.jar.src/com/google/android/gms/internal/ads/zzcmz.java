package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final class zzcmz
  implements zzcmm
{
  private final zzbxa zza;
  
  zzcmz(zzbxa paramzzbxa)
  {
    this.zza = paramzzbxa;
  }
  
  public final void zza(JSONObject paramJSONObject)
  {
    long l = paramJSONObject.optLong("timestamp");
    int j;
    if (paramJSONObject.optBoolean("npa_reset")) {
      int i = -1;
    } else {
      j = paramJSONObject.optBoolean("npa");
    }
    this.zza.zzb(j, l);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcmz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */