package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class zzbeg
  extends zzato
  implements zzbei
{
  zzbeg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
  }
  
  public final String zzg()
    throws RemoteException
  {
    Parcel localParcel = zzbg(2, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final List zzh()
    throws RemoteException
  {
    Parcel localParcel = zzbg(3, zza());
    ArrayList localArrayList = zzatq.zzb(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbeg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */