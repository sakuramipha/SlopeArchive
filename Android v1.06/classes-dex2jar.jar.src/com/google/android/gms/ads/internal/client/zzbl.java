package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;

public final class zzbl
  extends zzato
  implements zzbn
{
  zzbl(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
  }
  
  public final String zze()
    throws RemoteException
  {
    throw null;
  }
  
  public final String zzf()
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzg(zzl paramzzl)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzl);
    zzbh(1, localParcel);
  }
  
  public final void zzh(zzl paramzzl, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzzl);
    localParcel.writeInt(paramInt);
    zzbh(5, localParcel);
  }
  
  public final boolean zzi()
    throws RemoteException
  {
    Parcel localParcel = zzbg(3, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */