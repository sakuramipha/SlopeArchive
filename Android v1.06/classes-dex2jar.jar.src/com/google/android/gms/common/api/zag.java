package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

final class zag<R extends Result>
  extends BasePendingResult<R>
{
  private final R zae;
  
  public zag(GoogleApiClient paramGoogleApiClient, R paramR)
  {
    super(paramGoogleApiClient);
    this.zae = paramR;
  }
  
  protected final R createFailedResult(Status paramStatus)
  {
    return this.zae;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\zag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */