package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

public final class zzedy
  implements zzebv
{
  private final Context zza;
  private final zzdnk zzb;
  private final zzdeq zzc;
  private final zzfaa zzd;
  private final Executor zze;
  private final zzbzz zzf;
  private final zzbik zzg;
  private final boolean zzh;
  
  public zzedy(Context paramContext, zzbzz paramzzbzz, zzfaa paramzzfaa, Executor paramExecutor, zzdeq paramzzdeq, zzdnk paramzzdnk, zzbik paramzzbik)
  {
    this.zza = paramContext;
    this.zzd = paramzzfaa;
    this.zzc = paramzzdeq;
    this.zze = paramExecutor;
    this.zzf = paramzzbzz;
    this.zzb = paramzzdnk;
    this.zzg = paramzzbik;
    paramContext = zzbbk.zziq;
    this.zzh = ((Boolean)zzba.zzc().zzb(paramContext)).booleanValue();
  }
  
  public final zzfwb zza(zzezr paramzzezr, zzezf paramzzezf)
  {
    zzdno localzzdno = new zzdno();
    paramzzezr = zzfvr.zzm(zzfvr.zzh(null), new zzedt(this, paramzzezf, paramzzezr, localzzdno), this.zze);
    paramzzezr.zzc(new zzedu(localzzdno), this.zze);
    return paramzzezr;
  }
  
  public final boolean zzb(zzezr paramzzezr, zzezf paramzzezf)
  {
    paramzzezr = paramzzezf.zzt;
    return (paramzzezr != null) && (paramzzezr.zza != null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzedy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */