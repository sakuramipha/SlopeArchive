package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcl<T>
  implements BaseImplementation.ResultHolder<T>
{
  private final TaskCompletionSource<Void> zza;
  
  zzcl(TaskCompletionSource<Void> paramTaskCompletionSource)
  {
    TaskCompletionSource localTaskCompletionSource;
    this.zza = localTaskCompletionSource;
  }
  
  public final void setFailedResult(Status paramStatus)
  {
    this.zza.setException(new ApiException(paramStatus));
  }
  
  public final void setResult(T paramT)
  {
    this.zza.setResult(null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */