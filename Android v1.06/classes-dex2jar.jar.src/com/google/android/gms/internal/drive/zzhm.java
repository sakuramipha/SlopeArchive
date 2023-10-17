package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.drive.TransferPreferences;
import com.google.android.gms.drive.TransferPreferencesBuilder;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzhm
  extends zzhh<TransferPreferences>
{
  public zzhm(TaskCompletionSource<TransferPreferences> paramTaskCompletionSource)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void zza(zzfj paramzzfj)
    throws RemoteException
  {
    zzay().setResult(new TransferPreferencesBuilder(paramzzfj.zzas()).build());
  }
  
  public final void zza(zzga paramzzga)
    throws RemoteException
  {
    zzay().setResult(paramzzga.zzax());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzhm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */