package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbem
  extends zzatp
  implements zzben
{
  public zzbem()
  {
    super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    float f;
    switch (paramInt1)
    {
    default: 
      return false;
    case 10: 
      paramInt1 = zzk();
      paramParcel2.writeNoException();
      paramInt2 = zzatq.zza;
      paramParcel2.writeInt(paramInt1);
      break;
    case 9: 
      localObject = paramParcel1.readStrongBinder();
      if (localObject == null)
      {
        localObject = null;
      }
      else
      {
        IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
        if ((localIInterface instanceof zzbfy)) {
          localObject = (zzbfy)localIInterface;
        } else {
          localObject = new zzbfy((IBinder)localObject);
        }
      }
      zzatq.zzc(paramParcel1);
      zzm((zzbfy)localObject);
      paramParcel2.writeNoException();
      break;
    case 8: 
      paramInt2 = zzl();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
      break;
    case 7: 
      paramParcel1 = zzh();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 6: 
      f = zzf();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 5: 
      f = zzg();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 4: 
      paramParcel1 = zzi();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 3: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzj((IObjectWrapper)localObject);
      paramParcel2.writeNoException();
      break;
    case 2: 
      f = zze();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */