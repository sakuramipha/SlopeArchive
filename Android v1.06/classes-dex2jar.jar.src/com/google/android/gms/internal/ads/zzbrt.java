package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbrt
  extends zzato
  implements zzbrv
{
  zzbrt(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }
  
  public final boolean zzF()
    throws RemoteException
  {
    Parcel localParcel = zzbg(11, zza());
    boolean bool = zzatq.zzg(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void zzg(int paramInt1, int paramInt2, Intent paramIntent)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt1);
    localParcel.writeInt(paramInt2);
    zzatq.zzd(localParcel, paramIntent);
    zzbh(12, localParcel);
  }
  
  public final void zzh()
    throws RemoteException
  {
    zzbh(10, zza());
  }
  
  public final void zzj(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(13, localParcel);
  }
  
  public final void zzk(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramBundle);
    zzbh(1, localParcel);
  }
  
  public final void zzl()
    throws RemoteException
  {
    zzbh(8, zza());
  }
  
  public final void zzn()
    throws RemoteException
  {
    zzbh(5, zza());
  }
  
  public final void zzo(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    localParcel.writeStringArray(paramArrayOfString);
    localParcel.writeIntArray(paramArrayOfInt);
    zzbh(15, localParcel);
  }
  
  public final void zzp()
    throws RemoteException
  {
    zzbh(2, zza());
  }
  
  public final void zzq()
    throws RemoteException
  {
    zzbh(4, zza());
  }
  
  public final void zzr(Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramBundle);
    localParcel = zzbg(6, localParcel);
    if (localParcel.readInt() != 0) {
      paramBundle.readFromParcel(localParcel);
    }
    localParcel.recycle();
  }
  
  public final void zzs()
    throws RemoteException
  {
    zzbh(3, zza());
  }
  
  public final void zzt()
    throws RemoteException
  {
    zzbh(7, zza());
  }
  
  public final void zzu()
    throws RemoteException
  {
    zzbh(14, zza());
  }
  
  public final void zzw()
    throws RemoteException
  {
    zzbh(9, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */