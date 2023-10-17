package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbyl
  extends zzato
  implements zzbyn
{
  zzbyl(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
  }
  
  public final zzbyk zze(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Object localObject = zza();
    zzatq.zzf((Parcel)localObject, paramIObjectWrapper);
    zzatq.zzf((Parcel)localObject, paramzzbny);
    ((Parcel)localObject).writeInt(231700000);
    paramzzbny = zzbg(2, (Parcel)localObject);
    localObject = paramzzbny.readStrongBinder();
    if (localObject == null)
    {
      paramIObjectWrapper = null;
    }
    else
    {
      paramIObjectWrapper = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
      if ((paramIObjectWrapper instanceof zzbyk)) {
        paramIObjectWrapper = (zzbyk)paramIObjectWrapper;
      } else {
        paramIObjectWrapper = new zzbyi((IBinder)localObject);
      }
    }
    paramzzbny.recycle();
    return paramIObjectWrapper;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */