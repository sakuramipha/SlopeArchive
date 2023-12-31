package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

public final class DeviceProperties
{
  private static Boolean zza;
  private static Boolean zzb;
  private static Boolean zzc;
  private static Boolean zzd;
  private static Boolean zze;
  private static Boolean zzf;
  private static Boolean zzg;
  private static Boolean zzh;
  private static Boolean zzi;
  private static Boolean zzj;
  private static Boolean zzk;
  private static Boolean zzl;
  
  public static boolean isAuto(Context paramContext)
  {
    paramContext = paramContext.getPackageManager();
    if (zzi == null)
    {
      boolean bool3 = PlatformVersion.isAtLeastO();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (paramContext.hasSystemFeature("android.hardware.type.automotive")) {
          bool1 = true;
        }
      }
      zzi = Boolean.valueOf(bool1);
    }
    return zzi.booleanValue();
  }
  
  public static boolean isBstar(Context paramContext)
  {
    if (zzl == null)
    {
      boolean bool3 = PlatformVersion.isAtLeastR();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (paramContext.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
          bool1 = true;
        }
      }
      zzl = Boolean.valueOf(bool1);
    }
    return zzl.booleanValue();
  }
  
  public static boolean isLatchsky(Context paramContext)
  {
    if (zzf == null)
    {
      paramContext = paramContext.getPackageManager();
      boolean bool3 = paramContext.hasSystemFeature("com.google.android.feature.services_updater");
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (paramContext.hasSystemFeature("cn.google.services")) {
          bool1 = true;
        }
      }
      zzf = Boolean.valueOf(bool1);
    }
    return zzf.booleanValue();
  }
  
  public static boolean isPhone(Context paramContext)
  {
    if (zza == null)
    {
      boolean bool3 = isTablet(paramContext);
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (!bool3)
      {
        bool1 = bool2;
        if (!isWearable(paramContext))
        {
          bool1 = bool2;
          if (!zzb(paramContext))
          {
            if (zzh == null) {
              zzh = Boolean.valueOf(paramContext.getPackageManager().hasSystemFeature("org.chromium.arc"));
            }
            bool1 = bool2;
            if (!zzh.booleanValue())
            {
              bool1 = bool2;
              if (!isAuto(paramContext))
              {
                bool1 = bool2;
                if (!isTv(paramContext))
                {
                  if (zzk == null) {
                    zzk = Boolean.valueOf(paramContext.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                  }
                  bool1 = bool2;
                  if (!zzk.booleanValue())
                  {
                    bool1 = bool2;
                    if (!isBstar(paramContext)) {
                      bool1 = true;
                    }
                  }
                }
              }
            }
          }
        }
      }
      zza = Boolean.valueOf(bool1);
    }
    return zza.booleanValue();
  }
  
  public static boolean isSevenInchTablet(Context paramContext)
  {
    return zzc(paramContext.getResources());
  }
  
  public static boolean isSidewinder(Context paramContext)
  {
    return zza(paramContext);
  }
  
  public static boolean isTablet(Context paramContext)
  {
    return isTablet(paramContext.getResources());
  }
  
  public static boolean isTablet(Resources paramResources)
  {
    boolean bool = false;
    if (paramResources == null) {
      return false;
    }
    if (zzb == null)
    {
      if ((paramResources.getConfiguration().screenLayout & 0xF) > 3) {}
      while (zzc(paramResources))
      {
        bool = true;
        break;
      }
      zzb = Boolean.valueOf(bool);
    }
    return zzb.booleanValue();
  }
  
  public static boolean isTv(Context paramContext)
  {
    paramContext = paramContext.getPackageManager();
    if (zzj == null)
    {
      boolean bool3 = paramContext.hasSystemFeature("com.google.android.tv");
      boolean bool2 = true;
      boolean bool1 = bool2;
      if (!bool3)
      {
        bool1 = bool2;
        if (!paramContext.hasSystemFeature("android.hardware.type.television")) {
          if (paramContext.hasSystemFeature("android.software.leanback")) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }
        }
      }
      zzj = Boolean.valueOf(bool1);
    }
    return zzj.booleanValue();
  }
  
  public static boolean isUserBuild()
  {
    int i = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    return "user".equals(Build.TYPE);
  }
  
  public static boolean isWearable(Context paramContext)
  {
    paramContext = paramContext.getPackageManager();
    if (zzd == null)
    {
      boolean bool3 = PlatformVersion.isAtLeastKitKatWatch();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (paramContext.hasSystemFeature("android.hardware.type.watch")) {
          bool1 = true;
        }
      }
      zzd = Boolean.valueOf(bool1);
    }
    return zzd.booleanValue();
  }
  
  public static boolean isWearableWithoutPlayStore(Context paramContext)
  {
    boolean bool2 = isWearable(paramContext);
    boolean bool1 = true;
    if (bool2)
    {
      if (!PlatformVersion.isAtLeastN()) {
        return bool1;
      }
      if ((zza(paramContext)) && (!PlatformVersion.isAtLeastO())) {
        return true;
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public static boolean zza(Context paramContext)
  {
    if (zze == null)
    {
      boolean bool3 = PlatformVersion.isAtLeastLollipop();
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool3)
      {
        bool1 = bool2;
        if (paramContext.getPackageManager().hasSystemFeature("cn.google")) {
          bool1 = true;
        }
      }
      zze = Boolean.valueOf(bool1);
    }
    return zze.booleanValue();
  }
  
  public static boolean zzb(Context paramContext)
  {
    if (zzg == null)
    {
      boolean bool3 = paramContext.getPackageManager().hasSystemFeature("android.hardware.type.iot");
      boolean bool2 = true;
      boolean bool1 = bool2;
      if (!bool3) {
        if (paramContext.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      zzg = Boolean.valueOf(bool1);
    }
    return zzg.booleanValue();
  }
  
  public static boolean zzc(Resources paramResources)
  {
    boolean bool2 = false;
    if (paramResources == null) {
      return false;
    }
    if (zzc == null)
    {
      paramResources = paramResources.getConfiguration();
      boolean bool1 = bool2;
      if ((paramResources.screenLayout & 0xF) <= 3)
      {
        bool1 = bool2;
        if (paramResources.smallestScreenWidthDp >= 600) {
          bool1 = true;
        }
      }
      zzc = Boolean.valueOf(bool1);
    }
    return zzc.booleanValue();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\DeviceProperties.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */