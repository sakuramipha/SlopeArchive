package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbet
  extends zzatp
  implements zzbeu
{
  public zzbet()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
  }
  
  public static zzbeu zzbx(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    if ((localIInterface instanceof zzbeu)) {
      return (zzbeu)localIInterface;
    }
    return new zzbes(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1;
    Object localObject2;
    switch (paramInt1)
    {
    default: 
      return false;
    case 9: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzbv((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 8: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        if ((localObject2 instanceof zzben)) {
          localObject1 = (zzben)localObject2;
        } else {
          localObject1 = new zzbel((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzbu((zzben)localObject1);
      paramParcel2.writeNoException();
      break;
    case 7: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzd((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 6: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzbt((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 5: 
      IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 4: 
      zzc();
      paramParcel2.writeNoException();
      break;
    case 3: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzbw((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 2: 
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzb((String)localObject1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 1: 
      localObject2 = paramParcel1.readString();
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzbs((String)localObject2, (IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */