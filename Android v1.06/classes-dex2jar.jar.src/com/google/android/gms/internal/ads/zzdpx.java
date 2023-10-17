package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class zzdpx
{
  private final ConcurrentHashMap zza;
  private final zzbzg zzb;
  private final zzfaa zzc;
  private final String zzd;
  private final String zze;
  
  public zzdpx(zzdqh paramzzdqh, zzbzg paramzzbzg, zzfaa paramzzfaa, String paramString1, String paramString2)
  {
    paramzzdqh = paramzzdqh.zzc();
    this.zza = paramzzdqh;
    this.zzb = paramzzbzg;
    this.zzc = paramzzfaa;
    this.zzd = paramString1;
    this.zze = paramString2;
    paramzzbzg = zzbbk.zzgL;
    if (!((Boolean)zzba.zzc().zzb(paramzzbzg)).booleanValue()) {
      return;
    }
    int j = zzf.zze(paramzzfaa);
    int i = j - 1;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            paramzzdqh.put("se", "r_both");
          } else {
            paramzzdqh.put("se", "r_adstring");
          }
        }
        else {
          paramzzdqh.put("se", "r_adinfo");
        }
      }
      else {
        paramzzdqh.put("se", "query_g");
      }
      paramzzdqh.put("scar", "true");
      paramzzbzg = zzbbk.zzhk;
      if (((Boolean)zzba.zzc().zzb(paramzzbzg)).booleanValue()) {
        paramzzdqh.put("ad_format", paramString2);
      }
      if (j == 2) {
        paramzzdqh.put("rid", paramString1);
      }
      zzd("ragent", paramzzfaa.zzd.zzp);
      zzd("rtype", zzf.zza(zzf.zzb(paramzzfaa.zzd)));
      return;
    }
    paramzzdqh.put("scar", "false");
  }
  
  private final void zzd(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      this.zza.put(paramString1, paramString2);
    }
  }
  
  public final Map zza()
  {
    return this.zza;
  }
  
  public final void zzb(zzezr paramzzezr)
  {
    if (!paramzzezr.zzb.zza.isEmpty()) {
      switch (((zzezf)paramzzezr.zzb.zza.get(0)).zzb)
      {
      default: 
        this.zza.put("ad_format", "unknown");
        break;
      case 6: 
        this.zza.put("ad_format", "app_open_ad");
        ConcurrentHashMap localConcurrentHashMap = this.zza;
        String str;
        if (true != this.zzb.zzk()) {
          str = "0";
        } else {
          str = "1";
        }
        localConcurrentHashMap.put("as", str);
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
    zzd("gqi", paramzzezr.zzb.zzb.zzb);
  }
  
  public final void zzc(Bundle paramBundle)
  {
    if (paramBundle.containsKey("cnt")) {
      this.zza.put("network_coarse", Integer.toString(paramBundle.getInt("cnt")));
    }
    if (paramBundle.containsKey("gnt")) {
      this.zza.put("network_fine", Integer.toString(paramBundle.getInt("gnt")));
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdpx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */