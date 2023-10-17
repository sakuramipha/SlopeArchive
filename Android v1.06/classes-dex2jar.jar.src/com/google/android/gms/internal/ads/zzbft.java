package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbft
  extends zzatp
  implements zzbfu
{
  public zzbft()
  {
    super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
  }
  
  public static zzbfu zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    if ((localIInterface instanceof zzbfu)) {
      return (zzbfu)localIInterface;
    }
    return new zzbfs(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      Object localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if ((localObject2 instanceof zzbfk)) {
          localObject1 = (zzbfk)localObject2;
        } else {
          localObject1 = new zzbfi((IBinder)localObject1);
        }
      }
      Object localObject2 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zze((zzbfk)localObject1, (String)localObject2);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */