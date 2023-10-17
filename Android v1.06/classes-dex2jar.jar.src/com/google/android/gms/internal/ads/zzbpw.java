package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbpw
  extends zzato
  implements zzbpy
{
  zzbpw(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
  }
  
  public final void zze(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(1, localParcel);
  }
  
  public final void zzf(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzbh(2, localParcel);
  }
  
  public final void zzg(zze paramzze)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzze);
    zzbh(3, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */