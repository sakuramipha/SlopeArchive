package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbfj
  extends zzatp
  implements zzbfk
{
  public zzbfj()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
  }
  
  public static zzbfk zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    if ((localIInterface instanceof zzbfk)) {
      return (zzbfk)localIInterface;
    }
    return new zzbfi(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return false;
    case 17: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramInt1 = zzr((IObjectWrapper)localObject);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      break;
    case 16: 
      paramParcel1 = zzf();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 15: 
      zzm();
      paramParcel2.writeNoException();
      break;
    case 14: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzp((IObjectWrapper)localObject);
      paramParcel2.writeNoException();
      break;
    case 13: 
      paramInt1 = zzt();
      paramParcel2.writeNoException();
      paramInt2 = zzatq.zza;
      paramParcel2.writeInt(paramInt1);
      break;
    case 12: 
      paramInt2 = zzq();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
      break;
    case 11: 
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, null);
      break;
    case 10: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramInt1 = zzs((IObjectWrapper)localObject);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      break;
    case 9: 
      paramParcel1 = zzh();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 8: 
      zzl();
      paramParcel2.writeNoException();
      break;
    case 7: 
      paramParcel1 = zze();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 6: 
      zzo();
      paramParcel2.writeNoException();
      break;
    case 5: 
      localObject = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzn((String)localObject);
      paramParcel2.writeNoException();
      break;
    case 4: 
      paramParcel1 = zzi();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 3: 
      paramParcel1 = zzk();
      paramParcel2.writeNoException();
      paramParcel2.writeStringList(paramParcel1);
      break;
    case 2: 
      localObject = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzg((String)localObject);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 1: 
      localObject = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzj((String)localObject);
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */