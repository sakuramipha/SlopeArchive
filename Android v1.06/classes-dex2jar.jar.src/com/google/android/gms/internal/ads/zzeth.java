package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeth
  implements zzeqq
{
  final ScheduledExecutorService zza;
  final Context zzb;
  final zzbrz zzc;
  
  public zzeth(zzbrz paramzzbrz, ScheduledExecutorService paramScheduledExecutorService, Context paramContext)
  {
    this.zzc = paramzzbrz;
    this.zza = paramScheduledExecutorService;
    this.zzb = paramContext;
  }
  
  public final int zza()
  {
    return 49;
  }
  
  public final zzfwb zzb()
  {
    zzfwb localzzfwb = zzfvr.zzh(new Bundle());
    zzbbc localzzbbc = zzbbk.zzdO;
    return zzfvr.zzl(zzfvr.zzn(localzzfwb, ((Long)zzba.zzc().zzb(localzzbbc)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzetg.zza, zzcag.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */