package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;

public final class zzcg
  extends zzato
  implements zzci
{
  zzcg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
  }
  
  public final void zzb()
    throws RemoteException
  {
    zzbh(5, zza());
  }
  
  public final void zzc()
    throws RemoteException
  {
    zzbh(3, zza());
  }
  
  public final void zzd(zze paramzze)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzze);
    zzbh(1, localParcel);
  }
  
  public final void zze()
    throws RemoteException
  {
    zzbh(4, zza());
  }
  
  public final void zzf()
    throws RemoteException
  {
    zzbh(2, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */