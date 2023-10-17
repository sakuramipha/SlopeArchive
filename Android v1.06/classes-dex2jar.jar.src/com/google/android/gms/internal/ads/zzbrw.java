package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbrw
  extends zzato
  implements zzbry
{
  zzbrw(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
  }
  
  public final IBinder zze(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Object localObject = zza();
    zzatq.zzf((Parcel)localObject, paramIObjectWrapper);
    paramIObjectWrapper = zzbg(1, (Parcel)localObject);
    localObject = paramIObjectWrapper.readStrongBinder();
    paramIObjectWrapper.recycle();
    return (IBinder)localObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */