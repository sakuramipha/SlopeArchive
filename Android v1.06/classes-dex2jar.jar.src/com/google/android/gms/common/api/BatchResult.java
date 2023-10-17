package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

public final class BatchResult
  implements Result
{
  private final Status zaa;
  private final PendingResult<?>[] zab;
  
  BatchResult(Status paramStatus, PendingResult<?>[] paramArrayOfPendingResult)
  {
    this.zaa = paramStatus;
    this.zab = paramArrayOfPendingResult;
  }
  
  public Status getStatus()
  {
    return this.zaa;
  }
  
  public <R extends Result> R take(BatchResultToken<R> paramBatchResultToken)
  {
    boolean bool;
    if (paramBatchResultToken.mId < this.zab.length) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "The result token does not belong to this batch");
    return this.zab[paramBatchResultToken.mId].await(0L, TimeUnit.MILLISECONDS);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\BatchResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */