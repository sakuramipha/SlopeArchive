package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzhl
  extends zzhh<DriveId>
{
  public zzhl(TaskCompletionSource<DriveId> paramTaskCompletionSource)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void zza(zzfn paramzzfn)
    throws RemoteException
  {
    zzay().setResult(paramzzfn.getDriveId());
  }
  
  public final void zza(zzfy paramzzfy)
    throws RemoteException
  {
    zzay().setResult(new zzaa(paramzzfy.zzaw()).getDriveId());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */