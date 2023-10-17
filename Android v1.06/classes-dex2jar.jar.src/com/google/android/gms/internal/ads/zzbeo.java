package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public final class zzbeo
  extends zzato
  implements zzbeq
{
  zzbeo(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }
  
  public final double zzb()
    throws RemoteException
  {
    Parcel localParcel = zzbg(3, zza());
    double d = localParcel.readDouble();
    localParcel.recycle();
    return d;
  }
  
  public final int zzc()
    throws RemoteException
  {
    Parcel localParcel = zzbg(5, zza());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final int zzd()
    throws RemoteException
  {
    Parcel localParcel = zzbg(4, zza());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final Uri zze()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    Uri localUri = (Uri)zzatq.zza(localParcel, Uri.CREATOR);
    localParcel.recycle();
    return localUri;
  }
  
  public final IObjectWrapper zzf()
    throws RemoteException
  {
    Parcel localParcel = zzbg(1, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbeo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */