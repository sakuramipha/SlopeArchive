package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public abstract interface IGmsCallbacks
  extends IInterface
{
  public abstract void onPostInitComplete(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void zzb(int paramInt, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void zzc(int paramInt, IBinder paramIBinder, zzj paramzzj)
    throws RemoteException;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\IGmsCallbacks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */