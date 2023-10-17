package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public class zzhh<T>
  extends zzl
{
  private TaskCompletionSource<T> zziv;
  
  zzhh(TaskCompletionSource<T> paramTaskCompletionSource)
  {
    this.zziv = paramTaskCompletionSource;
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    this.zziv.setException(new ApiException(paramStatus));
  }
  
  public final TaskCompletionSource<T> zzay()
  {
    return this.zziv;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */