package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

final class zah<R extends Result>
  extends BasePendingResult<R>
{
  public zah(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected final R createFailedResult(Status paramStatus)
  {
    throw new UnsupportedOperationException("Creating failed results is not supported");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\zah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */