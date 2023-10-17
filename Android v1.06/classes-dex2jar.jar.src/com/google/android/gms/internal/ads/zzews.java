package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

final class zzews
{
  private final zzfbm zza;
  private final zzcup zzb;
  private final Executor zzc;
  private zzewr zzd;
  
  public zzews(zzfbm paramzzfbm, zzcup paramzzcup, Executor paramExecutor)
  {
    this.zza = paramzzfbm;
    this.zzb = paramzzcup;
    this.zzc = paramExecutor;
  }
  
  @Deprecated
  private final zzfbw zze()
  {
    Object localObject = this.zzb.zzg();
    zzl localzzl = ((zzfaa)localObject).zzd;
    String str = ((zzfaa)localObject).zzf;
    localObject = ((zzfaa)localObject).zzj;
    return this.zza.zzc(localzzl, str, (zzw)localObject);
  }
  
  public final zzfwb zzc()
  {
    Object localObject = this.zzd;
    if (localObject == null)
    {
      if (!((Boolean)zzbdk.zza.zze()).booleanValue())
      {
        localObject = new zzewr(null, zze(), null);
        this.zzd = ((zzewr)localObject);
        localObject = zzfvr.zzh(localObject);
      }
      else
      {
        localObject = zzfvr.zze(zzfvr.zzl(zzfvi.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzewp(this), this.zzc), zzdwc.class, new zzewo(this), this.zzc);
      }
      return zzfvr.zzl((zzfwb)localObject, zzewn.zza, this.zzc);
    }
    return zzfvr.zzh(localObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzews.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */