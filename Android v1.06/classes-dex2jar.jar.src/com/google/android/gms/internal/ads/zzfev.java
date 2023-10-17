package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import java.util.Map;

public final class zzfev
{
  private final Context zza;
  private final String zzb;
  private final String zzc;
  
  public zzfev(Context paramContext, zzbzz paramzzbzz)
  {
    this.zza = paramContext;
    this.zzb = paramContext.getPackageName();
    this.zzc = paramzzbzz.zza;
  }
  
  public final void zza(Map paramMap)
  {
    paramMap.put("s", "gmob_sdk");
    paramMap.put("v", "3");
    paramMap.put("os", Build.VERSION.RELEASE);
    paramMap.put("api_v", Build.VERSION.SDK);
    zzt.zzp();
    paramMap.put("device", zzs.zzp());
    paramMap.put("app", this.zzb);
    zzt.zzp();
    boolean bool = zzs.zzA(this.zza);
    String str = "0";
    if (true != bool) {
      localObject = "0";
    } else {
      localObject = "1";
    }
    paramMap.put("is_lite_sdk", localObject);
    Object localObject = zzbbk.zza;
    List localList = zzba.zza().zzb();
    localObject = zzbbk.zzgF;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
      localList.addAll(zzt.zzo().zzh().zzh().zzd());
    }
    paramMap.put("e", TextUtils.join(",", localList));
    paramMap.put("sdkVersion", this.zzc);
    localObject = zzbbk.zzjK;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      zzt.zzp();
      if (true != zzs.zzx(this.zza)) {
        localObject = str;
      } else {
        localObject = "1";
      }
      paramMap.put("is_bstar", localObject);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */