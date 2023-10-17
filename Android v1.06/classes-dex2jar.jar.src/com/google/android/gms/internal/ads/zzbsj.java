package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public abstract class zzbsj
  extends zzatp
  implements zzbsk
{
  public zzbsj()
  {
    super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
  }
  
  public static zzbsk zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    if ((localIInterface instanceof zzbsk)) {
      return (zzbsk)localIInterface;
    }
    return new zzbsi(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      localObject = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zze((String)localObject);
    }
    else
    {
      localObject = paramParcel1.createTypedArrayList(Uri.CREATOR);
      zzatq.zzc(paramParcel1);
      zzf((List)localObject);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbsj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */