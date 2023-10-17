package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbvt
  extends zzato
  implements IInterface
{
  zzbvt(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
  }
  
  public final IBinder zze(IObjectWrapper paramIObjectWrapper, String paramString, zzbny paramzzbny, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    paramIObjectWrapper = zzbg(1, localParcel);
    paramString = paramIObjectWrapper.readStrongBinder();
    paramIObjectWrapper.recycle();
    return paramString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */