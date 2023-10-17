package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbez
  extends zzatp
  implements zzbfa
{
  public zzbez()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
  }
  
  public static zzbfa zze(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    if ((localIInterface instanceof zzbfa)) {
      return (zzbfa)localIInterface;
    }
    return new zzbey(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    IObjectWrapper localIObjectWrapper;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          return false;
        }
        localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
        zzatq.zzc(paramParcel1);
        zzb(localIObjectWrapper);
      }
      else
      {
        zzd();
      }
    }
    else
    {
      localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzc(localIObjectWrapper);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */