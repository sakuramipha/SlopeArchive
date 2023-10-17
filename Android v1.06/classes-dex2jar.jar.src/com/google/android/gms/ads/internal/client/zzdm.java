package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzdm
  extends zzatp
  implements zzdn
{
  public zzdm()
  {
    super("com.google.android.gms.ads.internal.client.IResponseInfo");
  }
  
  public static zzdn zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
    if ((localIInterface instanceof zzdn)) {
      return (zzdn)localIInterface;
    }
    return new zzdl(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 6: 
      paramParcel1 = zzh();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 5: 
      paramParcel1 = zze();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 4: 
      paramParcel1 = zzf();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 3: 
      paramParcel1 = zzj();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 2: 
      paramParcel1 = zzi();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 1: 
      paramParcel1 = zzg();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */