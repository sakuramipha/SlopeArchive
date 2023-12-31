package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

public final class OptionalPendingResultImpl<R extends Result>
  extends OptionalPendingResult<R>
{
  private final BasePendingResult<R> zaa;
  
  public OptionalPendingResultImpl(PendingResult<R> paramPendingResult)
  {
    this.zaa = ((BasePendingResult)paramPendingResult);
  }
  
  public final void addStatusListener(PendingResult.StatusListener paramStatusListener)
  {
    this.zaa.addStatusListener(paramStatusListener);
  }
  
  public final R await()
  {
    return this.zaa.await();
  }
  
  public final R await(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.zaa.await(paramLong, paramTimeUnit);
  }
  
  public final void cancel()
  {
    this.zaa.cancel();
  }
  
  public final R get()
  {
    if (this.zaa.isReady())
    {
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      return this.zaa.await(0L, localTimeUnit);
    }
    throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
  }
  
  public final boolean isCanceled()
  {
    return this.zaa.isCanceled();
  }
  
  public final boolean isDone()
  {
    return this.zaa.isReady();
  }
  
  public final void setResultCallback(ResultCallback<? super R> paramResultCallback)
  {
    this.zaa.setResultCallback(paramResultCallback);
  }
  
  public final void setResultCallback(ResultCallback<? super R> paramResultCallback, long paramLong, TimeUnit paramTimeUnit)
  {
    this.zaa.setResultCallback(paramResultCallback, paramLong, paramTimeUnit);
  }
  
  public final <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> paramResultTransform)
  {
    return this.zaa.then(paramResultTransform);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\OptionalPendingResultImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */