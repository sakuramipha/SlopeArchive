package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzety
  implements zzeqq
{
  private final zzbzc zza;
  private final boolean zzb;
  private final boolean zzc;
  private final ScheduledExecutorService zzd;
  private final zzfwc zze;
  private final String zzf;
  private final zzbyr zzg;
  
  zzety(zzbzc paramzzbzc, boolean paramBoolean1, boolean paramBoolean2, zzbyr paramzzbyr, zzfwc paramzzfwc, String paramString, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.zza = paramzzbzc;
    this.zzb = paramBoolean1;
    this.zzc = paramBoolean2;
    this.zzg = paramzzbyr;
    this.zze = paramzzfwc;
    this.zzf = paramString;
    this.zzd = paramScheduledExecutorService;
  }
  
  public final int zza()
  {
    return 50;
  }
  
  public final zzfwb zzb()
  {
    zzbbc localzzbbc = zzbbk.zzgT;
    if ((((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue()) && (this.zzc)) {
      return zzfvr.zzh(null);
    }
    if (!this.zzb) {
      return zzfvr.zzh(null);
    }
    return zzfvr.zze(zzfvr.zzn(zzfvr.zzl(zzfvr.zzh(null), zzetw.zza, this.zze), ((Long)zzbdr.zzd.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzetx(this), this.zze);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzety.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */