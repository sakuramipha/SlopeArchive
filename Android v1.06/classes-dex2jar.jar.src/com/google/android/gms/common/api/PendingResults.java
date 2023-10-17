package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

public final class PendingResults
{
  public static PendingResult<Status> canceledPendingResult()
  {
    StatusPendingResult localStatusPendingResult = new StatusPendingResult(Looper.getMainLooper());
    localStatusPendingResult.cancel();
    return localStatusPendingResult;
  }
  
  public static <R extends Result> PendingResult<R> canceledPendingResult(R paramR)
  {
    Preconditions.checkNotNull(paramR, "Result must not be null");
    boolean bool;
    if (paramR.getStatus().getStatusCode() == 16) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "Status code must be CommonStatusCodes.CANCELED");
    paramR = new zaf(paramR);
    paramR.cancel();
    return paramR;
  }
  
  public static <R extends Result> PendingResult<R> immediateFailedResult(R paramR, GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkNotNull(paramR, "Result must not be null");
    Preconditions.checkArgument(paramR.getStatus().isSuccess() ^ true, "Status code must not be SUCCESS");
    paramGoogleApiClient = new zag(paramGoogleApiClient, paramR);
    paramGoogleApiClient.setResult(paramR);
    return paramGoogleApiClient;
  }
  
  public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R paramR)
  {
    Preconditions.checkNotNull(paramR, "Result must not be null");
    zah localzah = new zah(null);
    localzah.setResult(paramR);
    return new OptionalPendingResultImpl(localzah);
  }
  
  public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R paramR, GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkNotNull(paramR, "Result must not be null");
    paramGoogleApiClient = new zah(paramGoogleApiClient);
    paramGoogleApiClient.setResult(paramR);
    return new OptionalPendingResultImpl(paramGoogleApiClient);
  }
  
  public static PendingResult<Status> immediatePendingResult(Status paramStatus)
  {
    Preconditions.checkNotNull(paramStatus, "Result must not be null");
    StatusPendingResult localStatusPendingResult = new StatusPendingResult(Looper.getMainLooper());
    localStatusPendingResult.setResult(paramStatus);
    return localStatusPendingResult;
  }
  
  public static PendingResult<Status> immediatePendingResult(Status paramStatus, GoogleApiClient paramGoogleApiClient)
  {
    Preconditions.checkNotNull(paramStatus, "Result must not be null");
    paramGoogleApiClient = new StatusPendingResult(paramGoogleApiClient);
    paramGoogleApiClient.setResult(paramStatus);
    return paramGoogleApiClient;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\PendingResults.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */