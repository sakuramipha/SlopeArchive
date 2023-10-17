package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzfgp
{
  private final zzfgw zza;
  private final zzfgw zzb;
  private final zzfgt zzc;
  private final zzfgv zzd;
  
  private zzfgp(zzfgt paramzzfgt, zzfgv paramzzfgv, zzfgw paramzzfgw1, zzfgw paramzzfgw2, boolean paramBoolean)
  {
    this.zzc = paramzzfgt;
    this.zzd = paramzzfgv;
    this.zza = paramzzfgw1;
    if (paramzzfgw2 == null)
    {
      this.zzb = zzfgw.zzc;
      return;
    }
    this.zzb = paramzzfgw2;
  }
  
  public static zzfgp zza(zzfgt paramzzfgt, zzfgv paramzzfgv, zzfgw paramzzfgw1, zzfgw paramzzfgw2, boolean paramBoolean)
  {
    zzfhv.zzb(paramzzfgv, "ImpressionType is null");
    zzfhv.zzb(paramzzfgw1, "Impression owner is null");
    if (paramzzfgw1 != zzfgw.zzc)
    {
      if ((paramzzfgt == zzfgt.zza) && (paramzzfgw1 == zzfgw.zza)) {
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
      }
      if ((paramzzfgv == zzfgv.zza) && (paramzzfgw1 == zzfgw.zza)) {
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
      }
      return new zzfgp(paramzzfgt, paramzzfgv, paramzzfgw1, paramzzfgw2, true);
    }
    throw new IllegalArgumentException("Impression owner is none");
  }
  
  public final JSONObject zzb()
  {
    JSONObject localJSONObject = new JSONObject();
    zzfht.zze(localJSONObject, "impressionOwner", this.zza);
    zzfht.zze(localJSONObject, "mediaEventsOwner", this.zzb);
    zzfht.zze(localJSONObject, "creativeType", this.zzc);
    zzfht.zze(localJSONObject, "impressionType", this.zzd);
    zzfht.zze(localJSONObject, "isolateVerificationScripts", Boolean.valueOf(true));
    return localJSONObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfgp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */