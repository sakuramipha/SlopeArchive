package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbpn
  extends zzato
  implements zzbpp
{
  zzbpn(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
  }
  
  public final void zze(String paramString)
    throws RemoteException
  {
    paramString = zza();
    paramString.writeString("Adapter returned null.");
    zzbh(2, paramString);
  }
  
  public final void zzf(zze paramzze)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzze);
    zzbh(3, localParcel);
  }
  
  public final void zzg(zzbon paramzzbon)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzf(localParcel, paramzzbon);
    zzbh(1, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */