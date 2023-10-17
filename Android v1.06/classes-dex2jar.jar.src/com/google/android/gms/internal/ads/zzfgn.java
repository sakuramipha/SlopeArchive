package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

public final class zzfgn
{
  private boolean zza;
  
  final void zza(Context paramContext)
  {
    zzfhv.zzb(paramContext, "Application Context cannot be null");
    if (!this.zza)
    {
      this.zza = true;
      zzfhj.zzb().zzc(paramContext);
      zzfhe localzzfhe = zzfhe.zza();
      if ((paramContext instanceof Application)) {
        ((Application)paramContext).registerActivityLifecycleCallbacks(localzzfhe);
      }
      zzfht.zzd(paramContext);
      zzfhg.zzb().zzc(paramContext);
    }
  }
  
  final boolean zzb()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfgn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */