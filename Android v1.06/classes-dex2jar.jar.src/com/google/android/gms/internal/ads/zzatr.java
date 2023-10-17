package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzatr
  extends zzato
  implements zzatt
{
  zzatr(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.clearcut.IClearcut");
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper, String paramString)
    throws RemoteException
  {
    paramString = zza();
    zzatq.zzf(paramString, paramIObjectWrapper);
    paramString.writeString("GMA_SDK");
    zzbh(2, paramString);
  }
  
  public final void zzf()
    throws RemoteException
  {
    zzbh(3, zza());
  }
  
  public final void zzg(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    zzbh(7, localParcel);
  }
  
  public final void zzh(int[] paramArrayOfInt)
    throws RemoteException
  {
    paramArrayOfInt = zza();
    paramArrayOfInt.writeIntArray(null);
    zzbh(4, paramArrayOfInt);
  }
  
  public final void zzi(int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(0);
    zzbh(6, localParcel);
  }
  
  public final void zzj(byte[] paramArrayOfByte)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeByteArray(paramArrayOfByte);
    zzbh(5, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzatr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */