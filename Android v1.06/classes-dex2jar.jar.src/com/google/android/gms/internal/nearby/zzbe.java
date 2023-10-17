package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;

final class zzbe
  extends zzep
{
  private final BaseImplementation.ResultHolder<Connections.StartAdvertisingResult> zza;
  
  zzbe(BaseImplementation.ResultHolder<Connections.StartAdvertisingResult> paramResultHolder)
  {
    this.zza = ((BaseImplementation.ResultHolder)Preconditions.checkNotNull(paramResultHolder));
  }
  
  public final void zzb(zzfq paramzzfq)
  {
    Status localStatus = zzbf.zzE(paramzzfq.zza());
    if (localStatus.isSuccess())
    {
      this.zza.setResult(new zzbd(localStatus, paramzzfq.zzb()));
      return;
    }
    this.zza.setFailedResult(localStatus);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzbe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */