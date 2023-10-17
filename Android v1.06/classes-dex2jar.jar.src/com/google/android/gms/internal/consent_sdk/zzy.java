package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

public final class zzy
  implements zzdo
{
  private final zzdr zza;
  private final zzdr zzb;
  private final zzdr zzc;
  private final zzdr zzd;
  private final zzdr zze;
  private final zzdr zzf;
  private final zzdr zzg;
  private final zzdr zzh;
  private final zzdr zzi;
  
  public zzy(zzdr paramzzdr1, zzdr paramzzdr2, zzdr paramzzdr3, zzdr paramzzdr4, zzdr paramzzdr5, zzdr paramzzdr6, zzdr paramzzdr7, zzdr paramzzdr8, zzdr paramzzdr9)
  {
    this.zza = paramzzdr1;
    this.zzb = paramzzdr2;
    this.zzc = paramzzdr3;
    this.zzd = paramzzdr4;
    this.zze = paramzzdr5;
    this.zzf = paramzzdr6;
    this.zzg = paramzzdr7;
    this.zzh = paramzzdr8;
    this.zzi = paramzzdr9;
  }
  
  public final zzx zza()
  {
    Application localApplication = (Application)this.zza.zzb();
    zzae localzzae = (zzae)this.zzb.zzb();
    Handler localHandler = zzct.zza;
    zzdq.zza(localHandler);
    Executor localExecutor = zzct.zzb;
    zzdq.zza(localExecutor);
    return new zzx(localApplication, localzzae, localHandler, localExecutor, (zzas)this.zze.zzb(), (zzbq)this.zzf.zzb(), ((zzq)this.zzg).zza(), ((zzad)this.zzh).zza(), (zzg)this.zzi.zzb());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */