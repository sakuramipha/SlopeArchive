package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzfnj
  extends zzato
  implements zzfnl
{
  zzfnj(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
  }
  
  public final void zze(Bundle paramBundle, zzfnn paramzzfnn)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramBundle);
    zzatq.zzf(localParcel, paramzzfnn);
    zzbi(2, localParcel);
  }
  
  public final void zzf(String paramString, Bundle paramBundle, zzfnn paramzzfnn)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    zzatq.zzd(localParcel, paramBundle);
    zzatq.zzf(localParcel, paramzzfnn);
    zzbi(1, localParcel);
  }
  
  public final void zzg(Bundle paramBundle, zzfnn paramzzfnn)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzatq.zzd(localParcel, paramBundle);
    zzatq.zzf(localParcel, paramzzfnn);
    zzbi(3, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfnj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */