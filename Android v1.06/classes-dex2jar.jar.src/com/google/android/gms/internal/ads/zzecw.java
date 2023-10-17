package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzecw
  implements zzebv
{
  private final zzcqa zza;
  private final Context zzb;
  private final zzdnk zzc;
  private final zzfaa zzd;
  private final Executor zze;
  private final zzfon zzf;
  
  public zzecw(zzcqa paramzzcqa, Context paramContext, Executor paramExecutor, zzdnk paramzzdnk, zzfaa paramzzfaa, zzfon paramzzfon)
  {
    this.zzb = paramContext;
    this.zza = paramzzcqa;
    this.zze = paramExecutor;
    this.zzc = paramzzdnk;
    this.zzd = paramzzfaa;
    this.zzf = paramzzfon;
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf)
  {
    return zzfvr.zzm(zzfvr.zzh(null), new zzecq(this, paramzzezr, paramzzezf), this.zze);
  }
  
  public final boolean zzb(zzezr paramzzezr, zzezf paramzzezf)
  {
    paramzzezr = paramzzezf.zzt;
    return (paramzzezr != null) && (paramzzezr.zza != null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzecw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */