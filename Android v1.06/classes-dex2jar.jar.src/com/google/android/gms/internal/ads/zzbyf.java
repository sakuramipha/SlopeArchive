package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbyf
  extends zzato
  implements zzbyh
{
  zzbyf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
  }
  
  public final void zzb(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(2, localParcel);
  }
  
  public final void zzc(String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzatq.zzd(localParcel, paramBundle);
    zzbh(3, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */