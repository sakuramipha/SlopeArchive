package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

public final class zzar
  implements zzdo
{
  private final zzdr zza;
  private final zzdr zzb;
  private final zzdr zzc;
  
  public zzar(zzdr paramzzdr1, zzdr paramzzdr2, zzdr paramzzdr3)
  {
    this.zza = paramzzdr1;
    this.zzb = paramzzdr2;
    this.zzc = paramzzdr3;
  }
  
  public final zzaq zza()
  {
    Application localApplication = (Application)this.zza.zzb();
    zzas localzzas = (zzas)this.zzb.zzb();
    Executor localExecutor = zzct.zzb;
    zzdq.zza(localExecutor);
    return new zzaq(localApplication, localzzas, localExecutor);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */