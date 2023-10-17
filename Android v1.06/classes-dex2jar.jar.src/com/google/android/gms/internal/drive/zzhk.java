package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzhk
  extends zzhh<DriveFolder>
{
  public zzhk(TaskCompletionSource<DriveFolder> paramTaskCompletionSource)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void zza(zzfn paramzzfn)
    throws RemoteException
  {
    zzay().setResult(paramzzfn.getDriveId().asDriveFolder());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */