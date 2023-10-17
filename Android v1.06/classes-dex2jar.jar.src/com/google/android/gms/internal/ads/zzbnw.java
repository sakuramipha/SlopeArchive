package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbnw
  extends zzato
  implements zzbny
{
  zzbnw(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
  }
  
  public final zzbob zzb(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    localParcel = zzbg(1, localParcel);
    IBinder localIBinder = localParcel.readStrongBinder();
    if (localIBinder == null)
    {
      paramString = null;
    }
    else
    {
      paramString = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      if ((paramString instanceof zzbob)) {
        paramString = (zzbob)paramString;
      } else {
        paramString = new zzbnz(localIBinder);
      }
    }
    localParcel.recycle();
    return paramString;
  }
  
  public final zzbpv zzc(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    localParcel = zzbg(3, localParcel);
    paramString = zzbpu.zzb(localParcel.readStrongBinder());
    localParcel.recycle();
    return paramString;
  }
  
  public final boolean zzd(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    paramString = zzbg(4, localParcel);
    boolean bool = zzatq.zzg(paramString);
    paramString.recycle();
    return bool;
  }
  
  public final boolean zze(String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    paramString = zzbg(2, localParcel);
    boolean bool = zzatq.zzg(paramString);
    paramString.recycle();
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbnw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */