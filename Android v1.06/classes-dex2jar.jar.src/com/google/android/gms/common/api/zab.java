package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

final class zab
  implements PendingResult.StatusListener
{
  final Batch zaa;
  
  zab(Batch paramBatch) {}
  
  public final void onComplete(Status paramStatus)
  {
    synchronized (Batch.zab(this.zaa))
    {
      if (this.zaa.isCanceled()) {
        return;
      }
      if (paramStatus.isCanceled()) {
        Batch.zad(this.zaa, true);
      } else if (!paramStatus.isSuccess()) {
        Batch.zac(this.zaa, true);
      }
      paramStatus = this.zaa;
      Batch.zae(paramStatus, Batch.zaa(paramStatus) - 1);
      paramStatus = this.zaa;
      if (Batch.zaa(paramStatus) == 0) {
        if (Batch.zah(paramStatus))
        {
          Batch.zaf(paramStatus);
        }
        else
        {
          if (Batch.zag(paramStatus))
          {
            paramStatus = new com/google/android/gms/common/api/Status;
            paramStatus.<init>(13);
          }
          else
          {
            paramStatus = Status.RESULT_SUCCESS;
          }
          Batch localBatch = this.zaa;
          BatchResult localBatchResult = new com/google/android/gms/common/api/BatchResult;
          localBatchResult.<init>(paramStatus, Batch.zai(localBatch));
          localBatch.setResult(localBatchResult);
        }
      }
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\zab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */