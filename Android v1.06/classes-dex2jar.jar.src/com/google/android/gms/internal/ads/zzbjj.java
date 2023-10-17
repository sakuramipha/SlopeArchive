package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbjj
  extends zzato
  implements zzbjl
{
  zzbjj(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
  }
  
  public final zzbji zze(IObjectWrapper paramIObjectWrapper, zzbny paramzzbny, int paramInt, zzbjf paramzzbjf)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzatq.zzf(localParcel, paramzzbny);
    localParcel.writeInt(231700000);
    zzatq.zzf(localParcel, paramzzbjf);
    paramzzbny = zzbg(1, localParcel);
    paramIObjectWrapper = paramzzbny.readStrongBinder();
    if (paramIObjectWrapper == null)
    {
      paramIObjectWrapper = null;
    }
    else
    {
      paramzzbjf = paramIObjectWrapper.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
      if ((paramzzbjf instanceof zzbji)) {
        paramIObjectWrapper = (zzbji)paramzzbjf;
      } else {
        paramIObjectWrapper = new zzbjg(paramIObjectWrapper);
      }
    }
    paramzzbny.recycle();
    return paramIObjectWrapper;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */