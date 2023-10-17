package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbrm
  extends zzato
  implements zzbro
{
  zzbrm(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
  }
  
  public final void zze(Intent paramIntent)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramIntent);
    zzbh(1, localParcel);
  }
  
  public final void zzf()
    throws RemoteException
  {
    zzbh(3, zza());
  }
  
  public final void zzg(IObjectWrapper paramIObjectWrapper, String paramString1, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbh(2, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */