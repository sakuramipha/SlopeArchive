package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;

public final class zzdr
  extends zzato
  implements zzdt
{
  zzdr(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
  }
  
  public final void zze()
    throws RemoteException
  {
    zzbh(4, zza());
  }
  
  public final void zzf(boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    int i = zzatq.zza;
    localParcel.writeInt(paramBoolean);
    zzbh(5, localParcel);
  }
  
  public final void zzg()
    throws RemoteException
  {
    zzbh(3, zza());
  }
  
  public final void zzh()
    throws RemoteException
  {
    zzbh(2, zza());
  }
  
  public final void zzi()
    throws RemoteException
  {
    zzbh(1, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */