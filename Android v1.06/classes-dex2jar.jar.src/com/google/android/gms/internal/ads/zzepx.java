package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

public final class zzepx
  implements zzeqq
{
  private final String zza;
  private final zzfwc zzb;
  private final ScheduledExecutorService zzc;
  private final Context zzd;
  private final zzfaa zze;
  private final zzcgw zzf;
  
  zzepx(zzfwc paramzzfwc, ScheduledExecutorService paramScheduledExecutorService, String paramString, Context paramContext, zzfaa paramzzfaa, zzcgw paramzzcgw)
  {
    this.zzb = paramzzfwc;
    this.zzc = paramScheduledExecutorService;
    this.zza = paramString;
    this.zzd = paramContext;
    this.zze = paramzzfaa;
    this.zzf = paramzzcgw;
  }
  
  public final int zza()
  {
    return 33;
  }
  
  public final zzfwb zzb()
  {
    zzbbc localzzbbc = zzbbk.zzgQ;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (!"adUnitId".equals(this.zze.zzf))) {
      return zzfvr.zzk(new zzepu(this), this.zzb);
    }
    return this.zzb.zzb(zzept.zza);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzepx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */