package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public final class zzdvd
  implements zzdwb
{
  private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
  private final zzdud zzb;
  private final zzfwc zzc;
  private final zzfaa zzd;
  private final ScheduledExecutorService zze;
  private final zzdzz zzf;
  private final zzffq zzg;
  private final Context zzh;
  
  zzdvd(Context paramContext, zzfaa paramzzfaa, zzdud paramzzdud, zzfwc paramzzfwc, ScheduledExecutorService paramScheduledExecutorService, zzdzz paramzzdzz, zzffq paramzzffq)
  {
    this.zzh = paramContext;
    this.zzd = paramzzfaa;
    this.zzb = paramzzdud;
    this.zzc = paramzzfwc;
    this.zze = paramScheduledExecutorService;
    this.zzf = paramzzdzz;
    this.zzg = paramzzffq;
  }
  
  public final zzfwb zzb(zzbug paramzzbug)
  {
    paramzzbug = this.zzb.zzb(paramzzbug);
    zzfff localzzfff = zzffe.zza(this.zzh, 11);
    zzffp.zzd(paramzzbug, localzzfff);
    zzfwb localzzfwb = zzfvr.zzm(paramzzbug, new zzdva(this), this.zzc);
    zzbbc localzzbbc = zzbbk.zzfj;
    paramzzbug = localzzfwb;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      paramzzbug = zzbbk.zzfk;
      paramzzbug = zzfvr.zzf(zzfvr.zzn(localzzfwb, ((Integer)zzba.zzc().zzb(paramzzbug)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, zzdvb.zza, zzcag.zzf);
    }
    zzffp.zza(paramzzbug, this.zzg, localzzfff);
    zzfvr.zzq(paramzzbug, new zzdvc(this), zzcag.zzf);
    return paramzzbug;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdvd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */