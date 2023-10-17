package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbyw;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzffe;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfft;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfwb;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zze
{
  private Context zza;
  private long zzb = 0L;
  
  public final void zza(Context paramContext, zzbzz paramzzbzz, String paramString, Runnable paramRunnable, zzfft paramzzfft)
  {
    zzb(paramContext, paramzzbzz, true, null, paramString, null, paramRunnable, paramzzfft);
  }
  
  final void zzb(Context paramContext, zzbzz paramzzbzz, boolean paramBoolean, zzbyw paramzzbyw, String paramString1, String paramString2, Runnable paramRunnable, zzfft paramzzfft)
  {
    if (zzt.zzB().elapsedRealtime() - this.zzb < 5000L)
    {
      zzbzt.zzj("Not retrying to fetch app settings");
      return;
    }
    this.zzb = zzt.zzB().elapsedRealtime();
    if (paramzzbyw != null)
    {
      long l2 = paramzzbyw.zza();
      long l1 = zzt.zzB().currentTimeMillis();
      localObject = zzbbk.zzdN;
      if ((l1 - l2 <= ((Long)zzba.zzc().zzb((zzbbc)localObject)).longValue()) && (paramzzbyw.zzi())) {
        return;
      }
    }
    if (paramContext == null)
    {
      zzbzt.zzj("Context not provided to fetch application settings");
      return;
    }
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(paramString2)))
    {
      zzbzt.zzj("App settings could not be fetched. Required parameters missing");
      return;
    }
    Object localObject = paramContext.getApplicationContext();
    paramzzbyw = (zzbyw)localObject;
    if (localObject == null) {
      paramzzbyw = paramContext;
    }
    this.zza = paramzzbyw;
    paramzzbyw = zzffe.zza(paramContext, 4);
    paramzzbyw.zzh();
    zzbmo localzzbmo = zzt.zzf().zza(this.zza, paramzzbzz, paramzzfft).zza("google.afma.config.fetchAppSettings", zzbmv.zza, zzbmv.zza);
    try
    {
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      if (!TextUtils.isEmpty(paramString1)) {
        ((JSONObject)localObject).put("app_id", paramString1);
      } else if (!TextUtils.isEmpty(paramString2)) {
        ((JSONObject)localObject).put("ad_unit_id", paramString2);
      }
      ((JSONObject)localObject).put("is_init", paramBoolean);
      ((JSONObject)localObject).put("pn", paramContext.getPackageName());
      paramString1 = zzbbk.zza;
      ((JSONObject)localObject).put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
      ((JSONObject)localObject).put("js", paramzzbzz.zza);
      try
      {
        paramzzbzz = this.zza.getApplicationInfo();
        if (paramzzbzz != null)
        {
          paramContext = Wrappers.packageManager(paramContext).getPackageInfo(paramzzbzz.packageName, 0);
          if (paramContext != null) {
            ((JSONObject)localObject).put("version", paramContext.versionCode);
          }
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
      }
      paramContext = localzzbmo.zzb(localObject);
      paramzzbzz = new com/google/android/gms/ads/internal/zzd;
      paramzzbzz.<init>(paramzzfft, paramzzbyw);
      paramzzbzz = zzfvr.zzm(paramContext, paramzzbzz, zzcag.zzf);
      if (paramRunnable != null) {
        paramContext.zzc(paramRunnable, zzcag.zzf);
      }
      zzcaj.zza(paramzzbzz, "ConfigLoader.maybeFetchNewAppSettings");
      return;
    }
    catch (Exception paramContext)
    {
      zzbzt.zzh("Error requesting application settings", paramContext);
      paramzzbyw.zzg(paramContext);
      paramzzbyw.zzf(false);
      paramzzfft.zzb(paramzzbyw.zzl());
    }
  }
  
  public final void zzc(Context paramContext, zzbzz paramzzbzz, String paramString, zzbyw paramzzbyw, zzfft paramzzfft)
  {
    String str;
    if (paramzzbyw != null) {
      str = paramzzbyw.zzb();
    } else {
      str = null;
    }
    zzb(paramContext, paramzzbzz, false, paramzzbyw, str, paramString, null, paramzzfft);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */