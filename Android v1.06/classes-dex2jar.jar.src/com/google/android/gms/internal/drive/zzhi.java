package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzhi
  extends zzhh<DriveContents>
{
  public zzhi(TaskCompletionSource<DriveContents> paramTaskCompletionSource)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void zza(zzfh paramzzfh)
    throws RemoteException
  {
    zzay().setResult(new zzbi(paramzzfh.zzar()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */