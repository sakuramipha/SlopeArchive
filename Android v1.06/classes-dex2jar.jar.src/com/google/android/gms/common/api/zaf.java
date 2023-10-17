package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class zaf<R extends Result>
  extends BasePendingResult<R>
{
  private final R zae;
  
  public zaf(R paramR)
  {
    super(Looper.getMainLooper());
    this.zae = paramR;
  }
  
  protected final R createFailedResult(Status paramStatus)
  {
    if (paramStatus.getStatusCode() == this.zae.getStatus().getStatusCode()) {
      return this.zae;
    }
    throw new UnsupportedOperationException("Creating failed results is not supported");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\zaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */