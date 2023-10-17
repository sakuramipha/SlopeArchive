package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzhn
  extends zzhh<MetadataBuffer>
{
  public zzhn(TaskCompletionSource<MetadataBuffer> paramTaskCompletionSource)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void zza(zzft paramzzft)
    throws RemoteException
  {
    zzay().setResult(new MetadataBuffer(paramzzft.zzau()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */