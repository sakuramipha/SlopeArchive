package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcnf
  implements zzcwd
{
  private final zzfav zza;
  
  public zzcnf(zzfav paramzzfav)
  {
    this.zza = paramzzfav;
  }
  
  public final void zzbn(Context paramContext)
  {
    try
    {
      this.zza.zzg();
      return;
    }
    catch (zzfaf paramContext)
    {
      zzbzt.zzk("Cannot invoke onDestroy for the mediation adapter.", paramContext);
    }
  }
  
  public final void zzbp(Context paramContext)
  {
    try
    {
      this.zza.zzt();
      return;
    }
    catch (zzfaf paramContext)
    {
      zzbzt.zzk("Cannot invoke onPause for the mediation adapter.", paramContext);
    }
  }
  
  public final void zzbq(Context paramContext)
  {
    try
    {
      this.zza.zzu();
      if (paramContext != null) {
        this.zza.zzs(paramContext);
      }
      return;
    }
    catch (zzfaf paramContext)
    {
      zzbzt.zzk("Cannot invoke onResume for the mediation adapter.", paramContext);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcnf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */