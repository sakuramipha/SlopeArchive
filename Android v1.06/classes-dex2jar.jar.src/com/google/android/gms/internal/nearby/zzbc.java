package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.internal.Preconditions;

final class zzbc
  extends zzem
{
  private final BaseImplementation.ResultHolder<Status> zza;
  
  zzbc(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    this.zza = ((BaseImplementation.ResultHolder)Preconditions.checkNotNull(paramResultHolder));
  }
  
  public final void zzb(int paramInt)
  {
    Status localStatus = zzbf.zzE(paramInt);
    if (localStatus.isSuccess())
    {
      this.zza.setResult(localStatus);
      return;
    }
    this.zza.setFailedResult(localStatus);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzbc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */