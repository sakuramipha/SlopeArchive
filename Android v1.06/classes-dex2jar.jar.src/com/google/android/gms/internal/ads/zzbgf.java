package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbgf
  extends zzato
  implements zzbgh
{
  zzbgf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
  }
  
  public final boolean zzb(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    paramIObjectWrapper = zzbg(2, localParcel);
    boolean bool = zzatq.zzg(paramIObjectWrapper);
    paramIObjectWrapper.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */