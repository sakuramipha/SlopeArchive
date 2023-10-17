package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfnb
{
  private static final zzfno zzb = new zzfno("OverlayDisplayService");
  private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
  final zzfnz zza;
  private final String zzd;
  
  zzfnb(Context paramContext)
  {
    if (zzfoc.zza(paramContext)) {
      this.zza = new zzfnz(paramContext.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfmw.zza, null);
    } else {
      this.zza = null;
    }
    this.zzd = paramContext.getPackageName();
  }
  
  final void zzc()
  {
    if (this.zza == null) {
      return;
    }
    zzb.zzc("unbind LMD display overlay service", new Object[0]);
    this.zza.zzu();
  }
  
  final void zzd(zzfms paramzzfms, zzfng paramzzfng)
  {
    if (this.zza == null)
    {
      zzb.zza("error: %s", new Object[] { "Play Store not found." });
      return;
    }
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    this.zza.zzs(new zzfmy(this, localTaskCompletionSource, paramzzfms, paramzzfng, localTaskCompletionSource), localTaskCompletionSource);
  }
  
  final void zze(zzfnd paramzzfnd, zzfng paramzzfng)
  {
    if (this.zza == null)
    {
      zzb.zza("error: %s", new Object[] { "Play Store not found." });
      return;
    }
    if (paramzzfnd.zzg() == null)
    {
      zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
      paramzzfnd = zzfnf.zzc();
      paramzzfnd.zzb(8160);
      paramzzfng.zza(paramzzfnd.zzc());
      return;
    }
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    this.zza.zzs(new zzfmx(this, localTaskCompletionSource, paramzzfnd, paramzzfng, localTaskCompletionSource), localTaskCompletionSource);
  }
  
  final void zzf(zzfni paramzzfni, zzfng paramzzfng, int paramInt)
  {
    if (this.zza == null)
    {
      zzb.zza("error: %s", new Object[] { "Play Store not found." });
      return;
    }
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    this.zza.zzs(new zzfmz(this, localTaskCompletionSource, paramzzfni, paramInt, paramzzfng, localTaskCompletionSource), localTaskCompletionSource);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfnb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */