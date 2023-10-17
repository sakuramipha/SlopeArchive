package com.google.android.gms.common.wrappers;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.PlatformVersion;

public class InstantApps
{
  private static Context zza;
  private static Boolean zzb;
  
  public static boolean isInstantApp(Context paramContext)
  {
    try
    {
      Context localContext1 = paramContext.getApplicationContext();
      Context localContext2 = zza;
      if (localContext2 != null)
      {
        Boolean localBoolean = zzb;
        if ((localBoolean != null) && (localContext2 == localContext1))
        {
          bool = localBoolean.booleanValue();
          return bool;
        }
      }
      zzb = null;
      if (PlatformVersion.isAtLeastO()) {
        zzb = Boolean.valueOf(localContext1.getPackageManager().isInstantApp());
      } else {
        try
        {
          paramContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
          zzb = Boolean.valueOf(true);
        }
        catch (ClassNotFoundException paramContext)
        {
          zzb = Boolean.valueOf(false);
        }
      }
      zza = localContext1;
      boolean bool = zzb.booleanValue();
      return bool;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\wrappers\InstantApps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */