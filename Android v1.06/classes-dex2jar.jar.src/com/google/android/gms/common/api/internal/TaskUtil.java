package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class TaskUtil
{
  public static void setResultOrApiException(Status paramStatus, TaskCompletionSource<Void> paramTaskCompletionSource)
  {
    setResultOrApiException(paramStatus, null, paramTaskCompletionSource);
  }
  
  public static <TResult> void setResultOrApiException(Status paramStatus, TResult paramTResult, TaskCompletionSource<TResult> paramTaskCompletionSource)
  {
    if (paramStatus.isSuccess())
    {
      paramTaskCompletionSource.setResult(paramTResult);
      return;
    }
    paramTaskCompletionSource.setException(new ApiException(paramStatus));
  }
  
  @Deprecated
  public static Task<Void> toVoidTaskThatFailsOnFalse(Task<Boolean> paramTask)
  {
    return paramTask.continueWith(new zacx());
  }
  
  public static <ResultT> boolean trySetResultOrApiException(Status paramStatus, ResultT paramResultT, TaskCompletionSource<ResultT> paramTaskCompletionSource)
  {
    if (paramStatus.isSuccess()) {
      return paramTaskCompletionSource.trySetResult(paramResultT);
    }
    return paramTaskCompletionSource.trySetException(new ApiException(paramStatus));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\TaskUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */