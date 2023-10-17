package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbru
  extends zzatp
  implements zzbrv
{
  public zzbru()
  {
    super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }
  
  public static zzbrv zzG(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    if ((localIInterface instanceof zzbrv)) {
      return (zzbrv)localIInterface;
    }
    return new zzbrt(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return false;
    case 15: 
      paramInt1 = paramParcel1.readInt();
      String[] arrayOfString = paramParcel1.createStringArray();
      localObject = paramParcel1.createIntArray();
      zzatq.zzc(paramParcel1);
      zzo(paramInt1, arrayOfString, (int[])localObject);
      paramParcel2.writeNoException();
      break;
    case 14: 
      zzu();
      paramParcel2.writeNoException();
      break;
    case 13: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzj((IObjectWrapper)localObject);
      paramParcel2.writeNoException();
      break;
    case 12: 
      paramParcel1.readInt();
      paramParcel1.readInt();
      localObject = (Intent)zzatq.zza(paramParcel1, Intent.CREATOR);
      zzatq.zzc(paramParcel1);
      paramParcel2.writeNoException();
      break;
    case 11: 
      paramInt1 = zzF();
      paramParcel2.writeNoException();
      paramInt2 = zzatq.zza;
      paramParcel2.writeInt(paramInt1);
      break;
    case 10: 
      zzh();
      paramParcel2.writeNoException();
      break;
    case 9: 
      zzw();
      paramParcel2.writeNoException();
      break;
    case 8: 
      zzl();
      paramParcel2.writeNoException();
      break;
    case 7: 
      zzt();
      paramParcel2.writeNoException();
      break;
    case 6: 
      localObject = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzr((Bundle)localObject);
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, (Parcelable)localObject);
      break;
    case 5: 
      zzn();
      paramParcel2.writeNoException();
      break;
    case 4: 
      zzq();
      paramParcel2.writeNoException();
      break;
    case 3: 
      zzs();
      paramParcel2.writeNoException();
      break;
    case 2: 
      paramParcel2.writeNoException();
      break;
    case 1: 
      localObject = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzk((Bundle)localObject);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */