package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzavw
  extends zzato
  implements zzavy
{
  zzavw(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
  }
  
  public final void zzb()
    throws RemoteException
  {
    zzbh(5, zza());
  }
  
  public final void zzc()
    throws RemoteException
  {
    zzbh(2, zza());
  }
  
  public final void zzd(zze paramzze)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzze);
    zzbh(3, localParcel);
  }
  
  public final void zze()
    throws RemoteException
  {
    zzbh(4, zza());
  }
  
  public final void zzf()
    throws RemoteException
  {
    zzbh(1, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */