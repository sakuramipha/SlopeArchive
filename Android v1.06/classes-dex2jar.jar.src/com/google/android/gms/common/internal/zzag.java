package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzag
{
  private static final Object zza = new Object();
  private static boolean zzb;
  private static String zzc;
  private static int zzd;
  
  public static int zza(Context paramContext)
  {
    zzc(paramContext);
    return zzd;
  }
  
  public static String zzb(Context paramContext)
  {
    zzc(paramContext);
    return zzc;
  }
  
  private static void zzc(Context paramContext)
  {
    synchronized (zza)
    {
      if (zzb) {
        return;
      }
      zzb = true;
      String str = paramContext.getPackageName();
      paramContext = Wrappers.packageManager(paramContext);
      try
      {
        paramContext = paramContext.getApplicationInfo(str, 128).metaData;
        if (paramContext == null) {
          return;
        }
        zzc = paramContext.getString("com.google.app.id");
        zzd = paramContext.getInt("com.google.android.gms.version");
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.wtf("MetadataValueReader", "This should never happen.", paramContext);
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */