package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public abstract class zzbyj
  extends zzatp
  implements zzbyk
{
  public zzbyj()
  {
    super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
  }
  
  public static zzbyk zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    if ((localIInterface instanceof zzbyk)) {
      return (zzbyk)localIInterface;
    }
    return new zzbyi(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1 = null;
    Object localObject2;
    Object localObject3;
    switch (paramInt1)
    {
    default: 
      return false;
    case 10: 
      localObject2 = paramParcel1.createTypedArrayList(Uri.CREATOR);
      localObject3 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject1 = zzbsj.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzg((List)localObject2, (IObjectWrapper)localObject3, (zzbsk)localObject1);
      paramParcel2.writeNoException();
      break;
    case 9: 
      localObject2 = paramParcel1.createTypedArrayList(Uri.CREATOR);
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = zzbsj.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzh((List)localObject2, (IObjectWrapper)localObject1, (zzbsk)localObject3);
      paramParcel2.writeNoException();
      break;
    case 8: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzi((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 7: 
      localObject1 = (zzbst)zzatq.zza(paramParcel1, zzbst.CREATOR);
      zzatq.zzc(paramParcel1);
      zzf((zzbst)localObject1);
      paramParcel2.writeNoException();
      break;
    case 6: 
      localObject1 = paramParcel1.createTypedArrayList(Uri.CREATOR);
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = zzbsj.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzk((List)localObject1, (IObjectWrapper)localObject2, (zzbsk)localObject3);
      paramParcel2.writeNoException();
      break;
    case 5: 
      localObject2 = paramParcel1.createTypedArrayList(Uri.CREATOR);
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = zzbsj.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzl((List)localObject2, (IObjectWrapper)localObject1, (zzbsk)localObject3);
      paramParcel2.writeNoException();
      break;
    case 4: 
      IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, null);
      break;
    case 3: 
      IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, null);
      break;
    case 2: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzj((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 1: 
      localObject3 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject2 = (zzbyo)zzatq.zza(paramParcel1, zzbyo.CREATOR);
      IBinder localIBinder = paramParcel1.readStrongBinder();
      if (localIBinder != null)
      {
        localObject1 = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
        if ((localObject1 instanceof zzbyh)) {
          localObject1 = (zzbyh)localObject1;
        } else {
          localObject1 = new zzbyf(localIBinder);
        }
      }
      zzatq.zzc(paramParcel1);
      zze((IObjectWrapper)localObject3, (zzbyo)localObject2, (zzbyh)localObject1);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */