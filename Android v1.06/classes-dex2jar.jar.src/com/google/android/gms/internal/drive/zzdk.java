package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.drive.events.ListenerToken;
import com.google.android.gms.drive.events.OpenFileCallback;

final class zzdk
  extends zzl
{
  private final zzch zzfw;
  private final ListenerToken zzgj;
  private final ListenerHolder<OpenFileCallback> zzgk;
  
  zzdk(ListenerToken paramListenerToken, ListenerHolder<OpenFileCallback> paramListenerHolder)
  {
    this.zzgj = paramListenerHolder;
    ListenerHolder localListenerHolder;
    this.zzgk = localListenerHolder;
  }
  
  private final void zza(zzdg<OpenFileCallback> paramzzdg)
  {
    this.zzgk.notifyListener(new zzdo(this, paramzzdg));
  }
  
  public final void zza(Status paramStatus)
    throws RemoteException
  {
    zza(new zzdl(this, paramStatus));
  }
  
  public final void zza(zzfh paramzzfh)
    throws RemoteException
  {
    zza(new zzdn(this, paramzzfh));
  }
  
  public final void zza(zzfl paramzzfl)
    throws RemoteException
  {
    zza(new zzdm(paramzzfl));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzdk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */