package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zacp;

public abstract class ResultTransform<R extends Result, S extends Result>
{
  public final PendingResult<S> createFailedResult(Status paramStatus)
  {
    return new zacp(paramStatus);
  }
  
  public Status onFailure(Status paramStatus)
  {
    return paramStatus;
  }
  
  public abstract PendingResult<S> onSuccess(R paramR);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\ResultTransform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */