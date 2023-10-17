package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbom
  extends zzatp
  implements zzbon
{
  public zzbom()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
  }
  
  public static zzbon zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    if ((localIInterface instanceof zzbon)) {
      return (zzbon)localIInterface;
    }
    return new zzbol(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    float f;
    IObjectWrapper localIObjectWrapper1;
    switch (paramInt1)
    {
    default: 
      return false;
    case 25: 
      f = zzg();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 24: 
      f = zzh();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 23: 
      f = zzf();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 22: 
      localIObjectWrapper1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzz(localIObjectWrapper1);
      paramParcel2.writeNoException();
      break;
    case 21: 
      IObjectWrapper localIObjectWrapper3 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      IObjectWrapper localIObjectWrapper2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localIObjectWrapper1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzy(localIObjectWrapper3, localIObjectWrapper2, localIObjectWrapper1);
      paramParcel2.writeNoException();
      break;
    case 20: 
      localIObjectWrapper1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzw(localIObjectWrapper1);
      paramParcel2.writeNoException();
      break;
    case 19: 
      zzx();
      paramParcel2.writeNoException();
      break;
    case 18: 
      paramInt2 = zzA();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
      break;
    case 17: 
      paramInt2 = zzB();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
      break;
    case 16: 
      paramParcel1 = zzi();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 15: 
      paramParcel1 = zzo();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 14: 
      paramParcel1 = zzn();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 13: 
      paramParcel1 = zzm();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 12: 
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, null);
      break;
    case 11: 
      paramParcel1 = zzj();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 10: 
      paramParcel1 = zzt();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 9: 
      paramParcel1 = zzu();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 8: 
      double d = zze();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      break;
    case 7: 
      paramParcel1 = zzp();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 6: 
      paramParcel1 = zzr();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 5: 
      paramParcel1 = zzl();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 4: 
      paramParcel1 = zzq();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 3: 
      paramParcel1 = zzv();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
      break;
    case 2: 
      paramParcel1 = zzs();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */