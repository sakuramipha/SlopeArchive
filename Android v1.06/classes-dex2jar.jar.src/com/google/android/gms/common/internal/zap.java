package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

final class zap
  implements PendingResult.StatusListener
{
  final PendingResult zaa;
  
  zap(PendingResult paramPendingResult, TaskCompletionSource paramTaskCompletionSource, PendingResultUtil.ResultConverter paramResultConverter, zas paramzas) {}
  
  public final void onComplete(Status paramStatus)
  {
    if (paramStatus.isSuccess())
    {
      paramStatus = this.zaa.await(0L, TimeUnit.MILLISECONDS);
      this.zab.setResult(this.zac.convert(paramStatus));
      return;
    }
    this.zab.setException(ApiExceptionUtil.fromStatus(paramStatus));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */