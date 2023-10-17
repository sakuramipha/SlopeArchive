package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract interface zzavr
  extends IInterface
{
  public abstract zzbu zze()
    throws RemoteException;
  
  public abstract zzdn zzf()
    throws RemoteException;
  
  public abstract void zzg(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void zzh(zzdg paramzzdg)
    throws RemoteException;
  
  public abstract void zzi(IObjectWrapper paramIObjectWrapper, zzavy paramzzavy)
    throws RemoteException;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */