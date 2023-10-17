package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzfem
{
  private final HashMap zza;
  private final zzfes zzb;
  
  private zzfem()
  {
    HashMap localHashMap = new HashMap();
    this.zza = localHashMap;
    this.zzb = new zzfes(zzt.zzB());
    localHashMap.put("new_csi", "1");
  }
  
  public static zzfem zzb(String paramString)
  {
    zzfem localzzfem = new zzfem();
    localzzfem.zza.put("action", paramString);
    return localzzfem;
  }
  
  public static zzfem zzc(String paramString)
  {
    zzfem localzzfem = new zzfem();
    localzzfem.zza.put("request_id", paramString);
    return localzzfem;
  }
  
  public final zzfem zza(String paramString1, String paramString2)
  {
    this.zza.put(paramString1, paramString2);
    return this;
  }
  
  public final zzfem zzd(String paramString)
  {
    this.zzb.zzb(paramString);
    return this;
  }
  
  public final zzfem zze(String paramString1, String paramString2)
  {
    this.zzb.zzc(paramString1, paramString2);
    return this;
  }
  
  public final zzfem zzf(zzezf paramzzezf)
  {
    this.zza.put("aai", paramzzezf.zzx);
    return this;
  }
  
  public final zzfem zzg(zzezi paramzzezi)
  {
    if (!TextUtils.isEmpty(paramzzezi.zzb)) {
      this.zza.put("gqi", paramzzezi.zzb);
    }
    return this;
  }
  
  public final zzfem zzh(zzezr paramzzezr, zzbzg paramzzbzg)
  {
    paramzzezr = paramzzezr.zzb;
    zzg(paramzzezr.zzb);
    if (!paramzzezr.zza.isEmpty()) {
      switch (((zzezf)paramzzezr.zza.get(0)).zzb)
      {
      default: 
        this.zza.put("ad_format", "unknown");
        break;
      case 6: 
        this.zza.put("ad_format", "app_open_ad");
        if (paramzzbzg != null)
        {
          HashMap localHashMap = this.zza;
          if (true != paramzzbzg.zzk()) {
            paramzzezr = "0";
          } else {
            paramzzezr = "1";
          }
          localHashMap.put("as", paramzzezr);
        }
        break;
      case 5: 
        this.zza.put("ad_format", "rewarded");
        break;
      case 4: 
        this.zza.put("ad_format", "native_advanced");
        break;
      case 3: 
        this.zza.put("ad_format", "native_express");
        break;
      case 2: 
        this.zza.put("ad_format", "interstitial");
        break;
      case 1: 
        this.zza.put("ad_format", "banner");
      }
    }
    return this;
  }
  
  public final zzfem zzi(Bundle paramBundle)
  {
    if (paramBundle.containsKey("cnt")) {
      this.zza.put("network_coarse", Integer.toString(paramBundle.getInt("cnt")));
    }
    if (paramBundle.containsKey("gnt")) {
      this.zza.put("network_fine", Integer.toString(paramBundle.getInt("gnt")));
    }
    return this;
  }
  
  public final Map zzj()
  {
    HashMap localHashMap = new HashMap(this.zza);
    Iterator localIterator = this.zzb.zza().iterator();
    while (localIterator.hasNext())
    {
      zzfer localzzfer = (zzfer)localIterator.next();
      localHashMap.put(localzzfer.zza, localzzfer.zzb);
    }
    return localHashMap;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */