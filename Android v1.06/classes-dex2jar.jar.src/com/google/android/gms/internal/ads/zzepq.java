package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzepq
  implements zzeqq
{
  final String zza;
  private final zzfwc zzb;
  private final ScheduledExecutorService zzc;
  private final zzeib zzd;
  private final Context zze;
  private final zzfaa zzf;
  private final zzehx zzg;
  private final zzdnx zzh;
  private final zzdsg zzi;
  
  public zzepq(zzfwc paramzzfwc, ScheduledExecutorService paramScheduledExecutorService, String paramString, zzeib paramzzeib, Context paramContext, zzfaa paramzzfaa, zzehx paramzzehx, zzdnx paramzzdnx, zzdsg paramzzdsg)
  {
    this.zzb = paramzzfwc;
    this.zzc = paramScheduledExecutorService;
    this.zza = paramString;
    this.zzd = paramzzeib;
    this.zze = paramContext;
    this.zzf = paramzzfaa;
    this.zzg = paramzzehx;
    this.zzh = paramzzdnx;
    this.zzi = paramzzdsg;
  }
  
  private final zzfvi zzf(String paramString, List paramList, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramBundle = zzfvi.zzv(zzfvr.zzk(new zzepo(this, paramString, paramList, paramBundle, paramBoolean1, paramBoolean2), this.zzb));
    zzbbc localzzbbc = zzbbk.zzbv;
    paramList = paramBundle;
    if (!((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      paramList = zzbbk.zzbo;
      paramList = (zzfvi)zzfvr.zzn(paramBundle, ((Long)zzba.zzc().zzb(paramList)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
    }
    return (zzfvi)zzfvr.zze(paramList, Throwable.class, new zzepp(paramString), this.zzb);
  }
  
  private final void zzg(zzbpv paramzzbpv, Bundle paramBundle, List paramList, zzeie paramzzeie)
    throws RemoteException
  {
    paramzzbpv.zzh(ObjectWrapper.wrap(this.zze), this.zza, paramBundle, (Bundle)paramList.get(0), this.zzf.zze, paramzzeie);
  }
  
  public final int zza()
  {
    return 32;
  }
  
  public final zzfwb zzb()
  {
    return zzfvr.zzk(new zzepk(this), this.zzb);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzepq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */