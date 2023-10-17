package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzegt
  implements zzebx
{
  private final zzehx zza;
  
  public zzegt(zzehx paramzzehx)
  {
    this.zza = paramzzehx;
  }
  
  public final zzeby zza(String paramString, JSONObject paramJSONObject)
    throws zzfaf
  {
    paramJSONObject = this.zza.zza(paramString);
    if (paramJSONObject == null) {
      return null;
    }
    return new zzeby(paramJSONObject, new zzedr(), paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzegt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */