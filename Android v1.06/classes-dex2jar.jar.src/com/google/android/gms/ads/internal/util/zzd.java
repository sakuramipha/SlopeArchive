package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings.Global;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbcz;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaj;

public final class zzd
{
  public static void zza(Context paramContext)
  {
    int i = zzbzs.zza;
    if (((Boolean)zzbcz.zza.zze()).booleanValue()) {}
    try
    {
      i = Settings.Global.getInt(paramContext.getContentResolver(), "development_settings_enabled", 0);
      if ((i != 0) && (!zzbzs.zzl()))
      {
        paramContext = new zzc(paramContext).zzb();
        zzbzt.zzi("Updating ad debug logging enablement.");
        zzcaj.zza(paramContext, "AdDebugLogUpdater.updateEnablement");
      }
      return;
    }
    catch (Exception paramContext)
    {
      zzbzt.zzk("Fail to determine debug setting.", paramContext);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */