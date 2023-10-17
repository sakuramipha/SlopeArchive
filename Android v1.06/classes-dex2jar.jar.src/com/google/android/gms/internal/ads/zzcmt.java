package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

public final class zzcmt
  implements zzcmm
{
  private final zzdsz zza;
  
  zzcmt(zzdsz paramzzdsz)
  {
    this.zza = paramzzdsz;
  }
  
  public final void zza(JSONObject paramJSONObject)
  {
    if (paramJSONObject != null)
    {
      zzbbc localzzbbc = zzbbk.zziH;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        this.zza.zzl(paramJSONObject);
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcmt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */