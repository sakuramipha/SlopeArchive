package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;

public final class zzbp
  extends zzato
  implements zzbr
{
  zzbp(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
  }
  
  public final void zze(IObjectWrapper paramIObjectWrapper)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    zzbh(2, localParcel);
  }
  
  public final boolean zzf(IObjectWrapper paramIObjectWrapper, String paramString1, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    paramIObjectWrapper = zzbg(1, localParcel);
    boolean bool = zzatq.zzg(paramIObjectWrapper);
    paramIObjectWrapper.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */