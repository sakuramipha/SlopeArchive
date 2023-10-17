package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzca
  extends zzatp
  implements zzcb
{
  public zzca()
  {
    super("com.google.android.gms.ads.internal.client.IAppEventListener");
  }
  
  public static zzcb zzd(IBinder paramIBinder)
  {
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
    if ((localIInterface instanceof zzcb)) {
      return (zzcb)localIInterface;
    }
    return new zzbz(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzc(str1, str2);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */