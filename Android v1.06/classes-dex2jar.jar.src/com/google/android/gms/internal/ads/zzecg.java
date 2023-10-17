package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

public final class zzecg
  implements zzebv
{
  private final zzcor zza;
  private final Context zzb;
  private final zzdnk zzc;
  private final zzfaa zzd;
  private final Executor zze;
  private final zzbzz zzf;
  private final zzbik zzg;
  private final boolean zzh;
  
  public zzecg(zzcor paramzzcor, Context paramContext, Executor paramExecutor, zzdnk paramzzdnk, zzfaa paramzzfaa, zzbzz paramzzbzz, zzbik paramzzbik)
  {
    this.zzb = paramContext;
    this.zza = paramzzcor;
    this.zze = paramExecutor;
    this.zzc = paramzzdnk;
    this.zzd = paramzzfaa;
    this.zzf = paramzzbzz;
    this.zzg = paramzzbik;
    paramzzcor = zzbbk.zziq;
    this.zzh = ((Boolean)zzba.zzc().zzb(paramzzcor)).booleanValue();
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf)
  {
    zzdno localzzdno = new zzdno();
    paramzzezr = zzfvr.zzm(zzfvr.zzh(null), new zzece(this, paramzzezf, paramzzezr, localzzdno), this.zze);
    paramzzezr.zzc(new zzecf(localzzdno), this.zze);
    return paramzzezr;
  }
  
  public final boolean zzb(zzezr paramzzezr, zzezf paramzzezf)
  {
    paramzzezr = paramzzezf.zzt;
    return (paramzzezr != null) && (paramzzezr.zza != null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzecg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */