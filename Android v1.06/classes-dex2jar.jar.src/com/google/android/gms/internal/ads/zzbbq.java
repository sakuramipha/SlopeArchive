package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

public final class zzbbq
{
  private final String zza;
  private final Map zzb;
  private final Context zzc;
  private final String zzd;
  
  public zzbbq(Context paramContext, String paramString)
  {
    this.zzc = paramContext;
    this.zzd = paramString;
    this.zza = ((String)zzbcx.zzb.zze());
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    this.zzb = localLinkedHashMap;
    localLinkedHashMap.put("s", "gmob_sdk");
    localLinkedHashMap.put("v", "3");
    localLinkedHashMap.put("os", Build.VERSION.RELEASE);
    localLinkedHashMap.put("api_v", Build.VERSION.SDK);
    zzt.zzp();
    localLinkedHashMap.put("device", zzs.zzp());
    if (paramContext.getApplicationContext() != null) {
      paramString = paramContext.getApplicationContext().getPackageName();
    } else {
      paramString = paramContext.getPackageName();
    }
    localLinkedHashMap.put("app", paramString);
    zzt.zzp();
    boolean bool = zzs.zzA(paramContext);
    String str = "0";
    if (true != bool) {
      paramString = "0";
    } else {
      paramString = "1";
    }
    localLinkedHashMap.put("is_lite_sdk", paramString);
    paramString = zzt.zzm().zzb(paramContext);
    try
    {
      localLinkedHashMap.put("network_coarse", Integer.toString(((zzbul)paramString.get()).zzk));
      localLinkedHashMap.put("network_fine", Integer.toString(((zzbul)paramString.get()).zzl));
    }
    catch (Exception paramString)
    {
      zzt.zzo().zzu(paramString, "CsiConfiguration.CsiConfiguration");
    }
    paramString = zzbbk.zzjK;
    if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue())
    {
      paramString = this.zzb;
      zzt.zzp();
      if (true != zzs.zzx(paramContext)) {
        paramContext = str;
      } else {
        paramContext = "1";
      }
      paramString.put("is_bstar", paramContext);
    }
  }
  
  final Context zza()
  {
    return this.zzc;
  }
  
  final String zzb()
  {
    return this.zzd;
  }
  
  final String zzc()
  {
    return this.zza;
  }
  
  final Map zzd()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */