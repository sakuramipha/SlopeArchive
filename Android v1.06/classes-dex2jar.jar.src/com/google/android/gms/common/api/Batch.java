package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

public final class Batch
  extends BasePendingResult<BatchResult>
{
  private int zae;
  private boolean zaf;
  private boolean zag;
  private final PendingResult<?>[] zah;
  private final Object zai;
  
  public void cancel()
  {
    super.cancel();
    PendingResult[] arrayOfPendingResult = this.zah;
    int j = arrayOfPendingResult.length;
    for (int i = 0; i < j; i++) {
      arrayOfPendingResult[i].cancel();
    }
  }
  
  public BatchResult createFailedResult(Status paramStatus)
  {
    return new BatchResult(paramStatus, this.zah);
  }
  
  public static final class Builder
  {
    private List<PendingResult<?>> zaa = new ArrayList();
    private GoogleApiClient zab;
    
    public Builder(GoogleApiClient paramGoogleApiClient)
    {
      this.zab = paramGoogleApiClient;
    }
    
    public <R extends Result> BatchResultToken<R> add(PendingResult<R> paramPendingResult)
    {
      BatchResultToken localBatchResultToken = new BatchResultToken(this.zaa.size());
      this.zaa.add(paramPendingResult);
      return localBatchResultToken;
    }
    
    public Batch build()
    {
      return new Batch(this.zaa, this.zab, null);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\Batch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */