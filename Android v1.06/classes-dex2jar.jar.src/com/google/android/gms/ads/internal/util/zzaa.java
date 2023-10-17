package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzawx;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcgd;
import java.io.InputStream;
import java.util.Map;

public class zzaa
{
  public static zzaa zzo(int paramInt)
  {
    if (paramInt >= 30) {
      return new zzy();
    }
    if (paramInt >= 28) {
      return new zzx();
    }
    if (paramInt >= 26) {
      return new zzv();
    }
    if (paramInt >= 24) {
      return new zzu();
    }
    if (paramInt >= 21) {
      return new zzt();
    }
    return new zzaa();
  }
  
  public int zza()
  {
    return 1;
  }
  
  public CookieManager zzb(Context paramContext)
  {
    com.google.android.gms.ads.internal.zzt.zzp();
    if (zzs.zzB()) {
      return null;
    }
    try
    {
      CookieSyncManager.createInstance(paramContext);
      paramContext = CookieManager.getInstance();
      return paramContext;
    }
    finally
    {
      zzbzt.zzh("Failed to obtain CookieManager.", paramContext);
      com.google.android.gms.ads.internal.zzt.zzo().zzu(paramContext, "ApiLevelUtil.getCookieManager");
    }
    return null;
  }
  
  public WebResourceResponse zzc(String paramString1, String paramString2, int paramInt, String paramString3, Map paramMap, InputStream paramInputStream)
  {
    return new WebResourceResponse(paramString1, paramString2, paramInputStream);
  }
  
  public zzcfi zzd(zzcfb paramzzcfb, zzawx paramzzawx, boolean paramBoolean)
  {
    return new zzcgd(paramzzcfb, paramzzawx, paramBoolean);
  }
  
  public boolean zze(Activity paramActivity, Configuration paramConfiguration)
  {
    return false;
  }
  
  public Intent zzg(Activity paramActivity)
  {
    if (paramActivity == null) {
      return null;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
    localIntent.putExtra("app_package", paramActivity.getPackageName());
    localIntent.putExtra("app_uid", paramActivity.getApplicationInfo().uid);
    return localIntent;
  }
  
  public void zzh(Context paramContext, String paramString1, String paramString2) {}
  
  public boolean zzi(Context paramContext, String paramString)
  {
    return false;
  }
  
  public int zzj(Context paramContext, TelephonyManager paramTelephonyManager)
  {
    return 1001;
  }
  
  public int zzk(AudioManager paramAudioManager)
  {
    return 0;
  }
  
  public void zzl(Activity paramActivity) {}
  
  public int zzn(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkType();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */