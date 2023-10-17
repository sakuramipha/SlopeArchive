package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzavq
  extends zzatp
  implements zzavr
{
  public zzavq()
  {
    super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return false;
    case 7: 
      localObject = zzdf.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzh((zzdg)localObject);
      paramParcel2.writeNoException();
      break;
    case 6: 
      boolean bool = zzatq.zzg(paramParcel1);
      zzatq.zzc(paramParcel1);
      zzg(bool);
      paramParcel2.writeNoException();
      break;
    case 5: 
      paramParcel1 = zzf();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 4: 
      IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject = paramParcel1.readStrongBinder();
      if (localObject == null)
      {
        localObject = null;
      }
      else
      {
        IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
        if ((localIInterface instanceof zzavy)) {
          localObject = (zzavy)localIInterface;
        } else {
          localObject = new zzavw((IBinder)localObject);
        }
      }
      zzatq.zzc(paramParcel1);
      zzi(localIObjectWrapper, (zzavy)localObject);
      paramParcel2.writeNoException();
      break;
    case 3: 
      localObject = paramParcel1.readStrongBinder();
      if (localObject != null)
      {
        localObject = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
        if ((localObject instanceof zzavv)) {
          localObject = (zzavv)localObject;
        }
      }
      zzatq.zzc(paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 2: 
      paramParcel1 = zze();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */