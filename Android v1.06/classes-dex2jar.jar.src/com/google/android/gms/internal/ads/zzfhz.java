package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

public final class zzfhz
{
  private JSONObject zza;
  private final zzfii zzb;
  
  public zzfhz(zzfii paramzzfii)
  {
    this.zzb = paramzzfii;
  }
  
  public final JSONObject zza()
  {
    return this.zza;
  }
  
  public final void zzb()
  {
    this.zzb.zzb(new zzfij(this));
  }
  
  public final void zzc(JSONObject paramJSONObject, HashSet paramHashSet, long paramLong)
  {
    this.zzb.zzb(new zzfik(this, paramHashSet, paramJSONObject, paramLong));
  }
  
  public final void zzd(JSONObject paramJSONObject, HashSet paramHashSet, long paramLong)
  {
    this.zzb.zzb(new zzfil(this, paramHashSet, paramJSONObject, paramLong));
  }
  
  public final void zze(JSONObject paramJSONObject)
  {
    this.zza = paramJSONObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfhz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */