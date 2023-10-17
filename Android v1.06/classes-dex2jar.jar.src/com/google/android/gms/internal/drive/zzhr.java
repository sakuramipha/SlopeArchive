package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzhr
  extends zzhh<Void>
{
  public zzhr(TaskCompletionSource<Void> paramTaskCompletionSource)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void onSuccess()
    throws RemoteException
  {
    TaskUtil.setResultOrApiException(Status.RESULT_SUCCESS, zzay());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */