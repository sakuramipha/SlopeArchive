package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbny;

public final class zzdk
  extends zzato
  implements IInterface
{
  zzdk(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
  }
  
  public final zzdj zze(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Object localObject = zza();
    zzatq.zzf((Parcel)localObject, paramIObjectWrapper);
    zzatq.zzf((Parcel)localObject, paramzzbny);
    ((Parcel)localObject).writeInt(231700000);
    paramzzbny = zzbg(1, (Parcel)localObject);
    paramIObjectWrapper = paramzzbny.readStrongBinder();
    if (paramIObjectWrapper == null)
    {
      paramIObjectWrapper = null;
    }
    else
    {
      localObject = paramIObjectWrapper.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
      if ((localObject instanceof zzdj)) {
        paramIObjectWrapper = (zzdj)localObject;
      } else {
        paramIObjectWrapper = new zzdh(paramIObjectWrapper);
      }
    }
    paramzzbny.recycle();
    return paramIObjectWrapper;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */