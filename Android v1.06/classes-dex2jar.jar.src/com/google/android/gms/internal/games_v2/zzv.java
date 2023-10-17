package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzv
  extends zzm
{
  zzv(zzw paramzzw, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void zzb(Status paramStatus, zzaa paramzzaa)
  {
    if (paramzzaa == null)
    {
      this.zza.setException(new ApiException(paramStatus));
      return;
    }
    this.zza.setResult(paramzzaa);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */