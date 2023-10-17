package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbgg
  extends zzatp
  implements zzbgh
{
  public zzbgg()
  {
    super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
  }
  
  public static zzbgh zzc(IBinder paramIBinder)
  {
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    if ((localIInterface instanceof zzbgh)) {
      return (zzbgh)localIInterface;
    }
    return new zzbgf(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 2)
    {
      IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramInt1 = zzb(localIObjectWrapper);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */