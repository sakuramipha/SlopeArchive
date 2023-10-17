package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzay
  implements BaseImplementation.ResultHolder<Status>
{
  zzay(zzbg paramzzbg, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void setFailedResult(Status paramStatus)
  {
    this.zza.setException(new ApiException(paramStatus));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */