package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbfw
  extends zzatp
  implements zzbfx
{
  public zzbfw()
  {
    super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
  }
  
  public static zzbfx zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    if ((localIInterface instanceof zzbfx)) {
      return (zzbfx)localIInterface;
    }
    return new zzbfv(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject;
      if (localIBinder == null)
      {
        localObject = null;
      }
      else
      {
        localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if ((localObject instanceof zzbfk)) {
          localObject = (zzbfk)localObject;
        } else {
          localObject = new zzbfi(localIBinder);
        }
      }
      zzatq.zzc(paramParcel1);
      zze((zzbfk)localObject);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */