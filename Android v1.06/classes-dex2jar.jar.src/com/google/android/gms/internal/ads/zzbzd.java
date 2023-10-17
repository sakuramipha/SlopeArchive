package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;

public final class zzbzd
{
  long zza = -1L;
  long zzb = -1L;
  int zzc = -1;
  int zzd = -1;
  long zze = 0L;
  final String zzf;
  int zzg = 0;
  int zzh = 0;
  private final Object zzi = new Object();
  private final zzg zzj;
  
  public zzbzd(String paramString, zzg paramzzg)
  {
    this.zzf = paramString;
    this.zzj = paramzzg;
  }
  
  private final void zzg()
  {
    if (((Boolean)zzbdk.zza.zze()).booleanValue()) {
      synchronized (this.zzi)
      {
        this.zzc -= 1;
        this.zzd -= 1;
        return;
      }
    }
  }
  
  public final Bundle zza(Context paramContext, String paramString)
  {
    synchronized (this.zzi)
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      if (!this.zzj.zzP()) {
        localBundle.putString("session_id", this.zzf);
      }
      localBundle.putLong("basets", this.zzb);
      localBundle.putLong("currts", this.zza);
      localBundle.putString("seq_num", paramString);
      localBundle.putInt("preqs", this.zzc);
      localBundle.putInt("preqs_in_session", this.zzd);
      localBundle.putLong("time_in_session", this.zze);
      localBundle.putInt("pclick", this.zzg);
      localBundle.putInt("pimp", this.zzh);
      paramContext = zzbuu.zza(paramContext);
      int i = paramContext.getResources().getIdentifier("Theme.Translucent", "style", "android");
      boolean bool = false;
      if (i == 0)
      {
        zzbzt.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      }
      else
      {
        paramString = new android/content/ComponentName;
        paramString.<init>(paramContext.getPackageName(), "com.google.android.gms.ads.AdActivity");
        try
        {
          if (i == paramContext.getPackageManager().getActivityInfo(paramString, 0).theme) {
            bool = true;
          } else {
            zzbzt.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
          }
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          zzbzt.zzj("Fail to fetch AdActivity theme");
          zzbzt.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
      }
      localBundle.putBoolean("support_transparent_background", bool);
      return localBundle;
    }
  }
  
  public final void zzb()
  {
    synchronized (this.zzi)
    {
      this.zzg += 1;
      return;
    }
  }
  
  public final void zzc()
  {
    synchronized (this.zzi)
    {
      this.zzh += 1;
      return;
    }
  }
  
  public final void zzd()
  {
    zzg();
  }
  
  public final void zze()
  {
    zzg();
  }
  
  public final void zzf(zzl paramzzl, long paramLong)
  {
    synchronized (this.zzi)
    {
      long l1 = this.zzj.zzd();
      long l2 = zzt.zzB().currentTimeMillis();
      if (this.zzb == -1L)
      {
        localzzbbc = zzbbk.zzaQ;
        if (l2 - l1 > ((Long)zzba.zzc().zzb(localzzbbc)).longValue()) {
          this.zzd = -1;
        } else {
          this.zzd = this.zzj.zzc();
        }
        this.zzb = paramLong;
        this.zza = paramLong;
      }
      else
      {
        this.zza = paramLong;
      }
      zzbbc localzzbbc = zzbbk.zzdk;
      if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
      {
        paramzzl = paramzzl.zzc;
        if ((paramzzl != null) && (paramzzl.getInt("gw", 2) == 1)) {
          return;
        }
      }
      this.zzc += 1;
      int i = this.zzd + 1;
      this.zzd = i;
      if (i == 0)
      {
        this.zze = 0L;
        this.zzj.zzD(l2);
      }
      else
      {
        this.zze = (l2 - this.zzj.zze());
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */