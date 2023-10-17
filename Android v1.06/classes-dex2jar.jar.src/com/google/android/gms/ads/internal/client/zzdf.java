package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzdf
  extends zzatp
  implements zzdg
{
  public zzdf()
  {
    super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
  }
  
  public static zzdg zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    if ((localIInterface instanceof zzdg)) {
      return (zzdg)localIInterface;
    }
    return new zzde(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramInt2 = zzf();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
    }
    else
    {
      zzs localzzs = (zzs)zzatq.zza(paramParcel1, zzs.CREATOR);
      zzatq.zzc(paramParcel1);
      zze(localzzs);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */