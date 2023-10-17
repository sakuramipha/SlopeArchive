package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

public class StatusCallback
  extends IStatusCallback.Stub
{
  private final BaseImplementation.ResultHolder<Status> mResultHolder;
  
  public StatusCallback(BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    this.mResultHolder = paramResultHolder;
  }
  
  public void onResult(Status paramStatus)
  {
    this.mResultHolder.setResult(paramStatus);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\StatusCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */