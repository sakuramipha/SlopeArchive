package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class PendingResultUtil
{
  private static final zas zaa = new zao();
  
  public static <R extends Result, T extends Response<R>> Task<T> toResponseTask(PendingResult<R> paramPendingResult, T paramT)
  {
    return toTask(paramPendingResult, new zaq(paramT));
  }
  
  public static <R extends Result, T> Task<T> toTask(PendingResult<R> paramPendingResult, ResultConverter<R, T> paramResultConverter)
  {
    zas localzas = zaa;
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    paramPendingResult.addStatusListener(new zap(paramPendingResult, localTaskCompletionSource, paramResultConverter, localzas));
    return localTaskCompletionSource.getTask();
  }
  
  public static <R extends Result> Task<Void> toVoidTask(PendingResult<R> paramPendingResult)
  {
    return toTask(paramPendingResult, new zar());
  }
  
  public static abstract interface ResultConverter<R extends Result, T>
  {
    public abstract T convert(R paramR);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\PendingResultUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */