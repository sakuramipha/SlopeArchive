package com.google.android.gms.common.api;

import android.util.Log;

public abstract class ResultCallbacks<R extends Result>
  implements ResultCallback<R>
{
  public abstract void onFailure(Status paramStatus);
  
  public final void onResult(R paramR)
  {
    Status localStatus = paramR.getStatus();
    if (localStatus.isSuccess())
    {
      onSuccess(paramR);
      return;
    }
    onFailure(localStatus);
    if ((paramR instanceof Releasable)) {
      try
      {
        ((Releasable)paramR).release();
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        paramR = String.valueOf(paramR);
        String.valueOf(paramR).length();
        Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(paramR)), localRuntimeException);
      }
    }
  }
  
  public abstract void onSuccess(R paramR);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\ResultCallbacks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */