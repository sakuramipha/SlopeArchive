package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzho
  extends zzhh<MetadataBuffer>
{
  public zzho(TaskCompletionSource<MetadataBuffer> paramTaskCompletionSource)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void zza(zzfv paramzzfv)
    throws RemoteException
  {
    zzay().setResult(new MetadataBuffer(paramzzfv.zzav()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */