package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

public abstract class PendingResultFacade<A extends Result, B extends Result>
  extends PendingResult<B>
{
  public final void addStatusListener(PendingResult.StatusListener paramStatusListener)
  {
    throw null;
  }
  
  public final B await()
  {
    throw null;
  }
  
  public final B await(long paramLong, TimeUnit paramTimeUnit)
  {
    throw null;
  }
  
  public final void cancel()
  {
    throw null;
  }
  
  public final boolean isCanceled()
  {
    throw null;
  }
  
  public final void setResultCallback(ResultCallback<? super B> paramResultCallback)
  {
    throw null;
  }
  
  public final void setResultCallback(ResultCallback<? super B> paramResultCallback, long paramLong, TimeUnit paramTimeUnit)
  {
    throw null;
  }
  
  public final <S extends Result> TransformedResult<S> then(ResultTransform<? super B, ? extends S> paramResultTransform)
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\PendingResultFacade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */