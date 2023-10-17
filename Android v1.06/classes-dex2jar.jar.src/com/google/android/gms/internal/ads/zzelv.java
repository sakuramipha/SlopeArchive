package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzelv
  implements zzeqq
{
  final zzbzc zza;
  AppSetIdClient zzb;
  private final ScheduledExecutorService zzc;
  private final zzfwc zzd;
  private final Context zze;
  
  zzelv(Context paramContext, zzbzc paramzzbzc, ScheduledExecutorService paramScheduledExecutorService, zzfwc paramzzfwc)
  {
    zzbbc localzzbbc = zzbbk.zzcy;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) {
      this.zzb = AppSet.getClient(paramContext);
    }
    this.zze = paramContext;
    this.zza = paramzzbzc;
    this.zzc = paramScheduledExecutorService;
    this.zzd = paramzzfwc;
  }
  
  public final int zza()
  {
    return 11;
  }
  
  public final zzfwb zzb()
  {
    Object localObject = zzbbk.zzcu;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      localObject = zzbbk.zzcz;
      if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
      {
        localObject = zzbbk.zzcv;
        if (!((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
        {
          localObject = zzfvr.zzl(zzfmd.zza(this.zzb.getAppSetIdInfo()), zzels.zza, zzcag.zzf);
        }
        else
        {
          localObject = zzbbk.zzcy;
          if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue()) {
            localObject = zzfbd.zza(this.zze);
          } else {
            localObject = this.zzb.getAppSetIdInfo();
          }
          if (localObject == null)
          {
            localObject = zzfvr.zzh(new zzelw(null, -1));
          }
          else
          {
            zzfwb localzzfwb = zzfvr.zzm(zzfmd.zza((Task)localObject), zzelt.zza, zzcag.zzf);
            zzbbc localzzbbc = zzbbk.zzcw;
            localObject = localzzfwb;
            if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
            {
              localObject = zzbbk.zzcx;
              localObject = zzfvr.zzn(localzzfwb, ((Long)zzba.zzc().zzb((zzbbc)localObject)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
            }
            localObject = zzfvr.zze((zzfwb)localObject, Exception.class, new zzelu(this), this.zzd);
          }
        }
        return (zzfwb)localObject;
      }
    }
    return zzfvr.zzh(new zzelw(null, -1));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzelv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */