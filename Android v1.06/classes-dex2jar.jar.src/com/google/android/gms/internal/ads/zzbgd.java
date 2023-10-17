package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbgd
  extends zzatp
  implements zzbge
{
  public zzbgd()
  {
    super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
  }
  
  public static zzbge zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    if ((localIInterface instanceof zzbge)) {
      return (zzbge)localIInterface;
    }
    return new zzbgc(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      Object localObject = paramParcel1.readStrongBinder();
      if (localObject == null)
      {
        localObject = null;
      }
      else
      {
        IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        if ((localIInterface instanceof zzbgn)) {
          localObject = (zzbgn)localIInterface;
        } else {
          localObject = new zzbgl((IBinder)localObject);
        }
      }
      zzatq.zzc(paramParcel1);
      zze((zzbgn)localObject);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */