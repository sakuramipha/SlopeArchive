package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import java.util.ArrayList;
import java.util.List;

public final class zzdl
  extends zzato
  implements zzdn
{
  zzdl(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
  }
  
  public final Bundle zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(5, zza());
    Bundle localBundle = (Bundle)zzatq.zza(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final zzu zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(4, zza());
    zzu localzzu = (zzu)zzatq.zza(localParcel, zzu.CREATOR);
    localParcel.recycle();
    return localzzu;
  }
  
  public final String zzg()
    throws RemoteException
  {
    Parcel localParcel = zzbg(1, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzh()
    throws RemoteException
  {
    Parcel localParcel = zzbg(6, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String zzi()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final List zzj()
    throws RemoteException
  {
    Parcel localParcel = zzbg(3, zza());
    ArrayList localArrayList = localParcel.createTypedArrayList(zzu.CREATOR);
    localParcel.recycle();
    return localArrayList;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */