package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdsn
  implements zzcvl, zzcyd, zzcxa
{
  private final zzdsz zza;
  private final String zzb;
  private final String zzc;
  private int zzd;
  private zzdsm zze;
  private zzcvb zzf;
  private zze zzg;
  private String zzh;
  private String zzi;
  private boolean zzj;
  private boolean zzk;
  
  zzdsn(zzdsz paramzzdsz, zzfaa paramzzfaa, String paramString)
  {
    this.zza = paramzzdsz;
    this.zzc = paramString;
    this.zzb = paramzzfaa.zzf;
    this.zzd = 0;
    this.zze = zzdsm.zza;
  }
  
  private static JSONObject zzh(zze paramzze)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("errorDomain", paramzze.zzc);
    localJSONObject.put("errorCode", paramzze.zza);
    localJSONObject.put("errorDescription", paramzze.zzb);
    paramzze = paramzze.zzd;
    if (paramzze == null) {
      paramzze = null;
    } else {
      paramzze = zzh(paramzze);
    }
    localJSONObject.put("underlyingError", paramzze);
    return localJSONObject;
  }
  
  private final JSONObject zzi(zzcvb paramzzcvb)
    throws JSONException
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("winningAdapterClassName", paramzzcvb.zzg());
    localJSONObject1.put("responseSecsSinceEpoch", paramzzcvb.zzc());
    localJSONObject1.put("responseId", paramzzcvb.zzi());
    Object localObject = zzbbk.zziI;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = paramzzcvb.zzd();
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        zzbzt.zze("Bidding data: ".concat(String.valueOf(localObject)));
        localJSONObject1.put("biddingData", new JSONObject((String)localObject));
      }
    }
    if (!TextUtils.isEmpty(this.zzh)) {
      localJSONObject1.put("adRequestUrl", this.zzh);
    }
    if (!TextUtils.isEmpty(this.zzi)) {
      localJSONObject1.put("postBody", this.zzi);
    }
    localObject = new JSONArray();
    Iterator localIterator = paramzzcvb.zzj().iterator();
    while (localIterator.hasNext())
    {
      paramzzcvb = (zzu)localIterator.next();
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("adapterClassName", paramzzcvb.zza);
      localJSONObject2.put("latencyMillis", paramzzcvb.zzb);
      zzbbc localzzbbc = zzbbk.zziJ;
      if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
        localJSONObject2.put("credentials", zzay.zzb().zzh(paramzzcvb.zzd));
      }
      paramzzcvb = paramzzcvb.zzc;
      if (paramzzcvb == null) {
        paramzzcvb = null;
      } else {
        paramzzcvb = zzh(paramzzcvb);
      }
      localJSONObject2.put("error", paramzzcvb);
      ((JSONArray)localObject).put(localJSONObject2);
    }
    localJSONObject1.put("adNetworks", localObject);
    return localJSONObject1;
  }
  
  public final void zza(zze paramzze)
  {
    this.zze = zzdsm.zzc;
    this.zzg = paramzze;
    paramzze = zzbbk.zziN;
    if (((Boolean)zzba.zzc().zzb(paramzze)).booleanValue()) {
      this.zza.zzf(this.zzb, this);
    }
  }
  
  public final void zzb(zzezr paramzzezr)
  {
    if (!paramzzezr.zzb.zza.isEmpty()) {
      this.zzd = ((zzezf)paramzzezr.zzb.zza.get(0)).zzb;
    }
    if (!TextUtils.isEmpty(paramzzezr.zzb.zzb.zzk)) {
      this.zzh = paramzzezr.zzb.zzb.zzk;
    }
    if (!TextUtils.isEmpty(paramzzezr.zzb.zzb.zzl)) {
      this.zzi = paramzzezr.zzb.zzb.zzl;
    }
  }
  
  public final void zzbA(zzbug paramzzbug)
  {
    paramzzbug = zzbbk.zziN;
    if (!((Boolean)zzba.zzc().zzb(paramzzbug)).booleanValue()) {
      this.zza.zzf(this.zzb, this);
    }
  }
  
  public final void zzbD(zzcrf paramzzcrf)
  {
    this.zzf = paramzzcrf.zzl();
    this.zze = zzdsm.zzb;
    paramzzcrf = zzbbk.zziN;
    if (((Boolean)zzba.zzc().zzb(paramzzcrf)).booleanValue()) {
      this.zza.zzf(this.zzb, this);
    }
  }
  
  public final String zzc()
  {
    return this.zzc;
  }
  
  public final JSONObject zzd()
    throws JSONException
  {
    JSONObject localJSONObject2 = new JSONObject();
    localJSONObject2.put("state", this.zze);
    localJSONObject2.put("format", zzezf.zza(this.zzd));
    Object localObject1 = zzbbk.zziN;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue())
    {
      localJSONObject2.put("isOutOfContext", this.zzj);
      if (this.zzj) {
        localJSONObject2.put("shown", this.zzk);
      }
    }
    localObject1 = this.zzf;
    JSONObject localJSONObject1 = null;
    if (localObject1 != null)
    {
      localObject1 = zzi((zzcvb)localObject1);
    }
    else
    {
      Object localObject2 = this.zzg;
      localObject1 = localJSONObject1;
      if (localObject2 != null)
      {
        localObject2 = ((zze)localObject2).zze;
        localObject1 = localJSONObject1;
        if (localObject2 != null)
        {
          localObject2 = (zzcvb)localObject2;
          localJSONObject1 = zzi((zzcvb)localObject2);
          localObject1 = localJSONObject1;
          if (((zzcvb)localObject2).zzj().isEmpty())
          {
            localObject1 = new JSONArray();
            ((JSONArray)localObject1).put(zzh(this.zzg));
            localJSONObject1.put("errors", localObject1);
            localObject1 = localJSONObject1;
          }
        }
      }
    }
    localJSONObject2.put("responseInfo", localObject1);
    return localJSONObject2;
  }
  
  public final void zze()
  {
    this.zzj = true;
  }
  
  public final void zzf()
  {
    this.zzk = true;
  }
  
  public final boolean zzg()
  {
    return this.zze != zzdsm.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdsn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */