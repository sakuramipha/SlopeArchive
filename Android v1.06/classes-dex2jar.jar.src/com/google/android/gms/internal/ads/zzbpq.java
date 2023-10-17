package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbpq
  extends zzato
  implements zzbps
{
  zzbpq(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
  }
  
  public final void zze(String paramString)
    throws RemoteException
  {
    paramString = zza();
    paramString.writeString("Adapter returned null.");
    zzbh(3, paramString);
  }
  
  public final void zzf(zze paramzze)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramzze);
    zzbh(4, localParcel);
  }
  
  public final void zzg()
    throws RemoteException
  {
    zzbh(2, zza());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbpq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */