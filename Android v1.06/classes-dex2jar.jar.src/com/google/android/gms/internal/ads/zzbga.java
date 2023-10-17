package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbga
  extends zzatp
  implements zzbgb
{
  public zzbga()
  {
    super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
  }
  
  public static zzbgb zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    if ((localIInterface instanceof zzbgb)) {
      return (zzbgb)localIInterface;
    }
    return new zzbfz(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      zzbu localzzbu = zzbt.zzac(paramParcel1.readStrongBinder());
      IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zze(localzzbu, localIObjectWrapper);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */