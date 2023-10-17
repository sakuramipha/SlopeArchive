package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzhq
  extends zzhh<Boolean>
{
  public zzhq(TaskCompletionSource<Boolean> paramTaskCompletionSource)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void onSuccess()
    throws RemoteException
  {
    zzay().setResult(Boolean.valueOf(true));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */