package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzavt
  extends zzatp
  implements zzavu
{
  public zzavt()
  {
    super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
  }
  
  public static zzavu zze(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    if ((localIInterface instanceof zzavu)) {
      return (zzavu)localIInterface;
    }
    return new zzavs(paramIBinder);
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
        localObject = (zze)zzatq.zza(paramParcel1, zze.CREATOR);
        zzatq.zzc(paramParcel1);
        zzc((zze)localObject);
      }
      else
      {
        paramParcel1.readInt();
        zzatq.zzc(paramParcel1);
      }
    }
    else
    {
      IBinder localIBinder = paramParcel1.readStrongBinder();
      if (localIBinder == null)
      {
        localObject = null;
      }
      else
      {
        localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        if ((localObject instanceof zzavr)) {
          localObject = (zzavr)localObject;
        } else {
          localObject = new zzavp(localIBinder);
        }
      }
      zzatq.zzc(paramParcel1);
      zzd((zzavr)localObject);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */