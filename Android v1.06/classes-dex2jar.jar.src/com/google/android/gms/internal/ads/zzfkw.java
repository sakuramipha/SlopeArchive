package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzfkw
  extends zzato
  implements zzfky
{
  zzfkw(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper, String paramString1, String paramString2)
    throws RemoteException
  {
    paramString2 = zza();
    zzatq.zzf(paramString2, paramIObjectWrapper);
    paramString2.writeString(paramString1);
    paramString2.writeString(null);
    zzbh(8, paramString2);
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
    localParcel.writeInt(paramInt);
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */