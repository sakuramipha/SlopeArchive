package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final class zzbnj
  implements zzbiv
{
  final zzbnk zza;
  private final zzcal zzb;
  
  public zzbnj(zzbnk paramzzbnk, zzcal paramzzcal)
  {
    this.zzb = paramzzcal;
  }
  
  public final void zza(String paramString)
  {
    if (paramString == null) {}
    try
    {
      paramString = this.zzb;
      localObject = new com/google/android/gms/internal/ads/zzbmn;
      ((zzbmn)localObject).<init>();
      paramString.zze((Throwable)localObject);
      return;
    }
    catch (IllegalStateException paramString)
    {
      Object localObject;
      zzbmn localzzbmn;
      for (;;) {}
    }
    localObject = this.zzb;
    localzzbmn = new com/google/android/gms/internal/ads/zzbmn;
    localzzbmn.<init>(paramString);
    ((zzcal)localObject).zze(localzzbmn);
  }
  
  public final void zzb(JSONObject paramJSONObject)
  {
    try
    {
      this.zzb.zzd(paramJSONObject);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      this.zzb.zze(paramJSONObject);
      return;
    }
    catch (IllegalStateException paramJSONObject)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */