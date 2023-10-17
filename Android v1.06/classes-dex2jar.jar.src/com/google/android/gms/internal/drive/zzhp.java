package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzhp
  extends zzhh<Metadata>
{
  public zzhp(TaskCompletionSource<Metadata> paramTaskCompletionSource)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void zza(zzfy paramzzfy)
    throws RemoteException
  {
    zzay().setResult(new zzaa(paramzzfy.zzaw()));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */