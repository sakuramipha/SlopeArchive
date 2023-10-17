package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzx
  extends zza
{
  private final TaskCompletionSource zza;
  
  zzx(TaskCompletionSource paramTaskCompletionSource)
  {
    this.zza = paramTaskCompletionSource;
  }
  
  public final void zzl(Status paramStatus, String paramString)
  {
    if (!paramStatus.isSuccess())
    {
      paramString = this.zza;
      int i = zzak.zze;
      paramString.setException(ApiExceptionUtil.fromStatus(paramStatus));
      return;
    }
    this.zza.setResult(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */