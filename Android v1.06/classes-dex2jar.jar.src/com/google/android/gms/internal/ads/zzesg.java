package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzesg
  implements zzeqq
{
  private final zzbzc zza;
  private final String zzb;
  private final ScheduledExecutorService zzc;
  private final zzfwc zzd;
  private final zzawa zze;
  
  zzesg(String paramString, zzawa paramzzawa, zzbzc paramzzbzc, ScheduledExecutorService paramScheduledExecutorService, zzfwc paramzzfwc)
  {
    this.zzb = paramString;
    this.zze = paramzzawa;
    this.zza = paramzzbzc;
    this.zzc = paramScheduledExecutorService;
    this.zzd = paramzzfwc;
  }
  
  public final int zza()
  {
    return 43;
  }
  
  public final zzfwb zzb()
  {
    Object localObject = zzbbk.zzcu;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = zzbbk.zzcz;
      if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
      {
        zzfwb localzzfwb = zzfvr.zzm(zzfmd.zza(Tasks.forResult(null)), zzese.zza, this.zzd);
        localObject = localzzfwb;
        if (((Boolean)zzbcs.zza.zze()).booleanValue()) {
          localObject = zzfvr.zzn(localzzfwb, ((Long)zzbcs.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfvr.zze((zzfwb)localObject, Exception.class, new zzesf(this), this.zzd);
      }
    }
    return zzfvr.zzh(new zzesh(null, -1));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzesg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */