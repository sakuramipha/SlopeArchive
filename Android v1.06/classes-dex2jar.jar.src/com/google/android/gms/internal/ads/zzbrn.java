package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbrn
  extends zzatp
  implements zzbro
{
  public zzbrn()
  {
    super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
  }
  
  public static zzbro zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    if ((localIInterface instanceof zzbro)) {
      return (zzbro)localIInterface;
    }
    return new zzbrm(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          return false;
        }
        zzf();
      }
      else
      {
        IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
        String str = paramParcel1.readString();
        localObject = paramParcel1.readString();
        zzatq.zzc(paramParcel1);
        zzg(localIObjectWrapper, str, (String)localObject);
      }
    }
    else
    {
      localObject = (Intent)zzatq.zza(paramParcel1, Intent.CREATOR);
      zzatq.zzc(paramParcel1);
      zze((Intent)localObject);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbrn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */