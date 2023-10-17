package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract interface zzaf
  extends IInterface
{
  public abstract zzq zze(zzn paramzzn)
    throws RemoteException;
  
  public abstract boolean zzf(zzs paramzzs, IObjectWrapper paramIObjectWrapper)
    throws RemoteException;
  
  public abstract boolean zzg()
    throws RemoteException;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */