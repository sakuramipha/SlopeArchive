package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzdp
  extends zzatp
  implements zzdq
{
  public zzdp()
  {
    super("com.google.android.gms.ads.internal.client.IVideoController");
  }
  
  public static zzdq zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
    if ((localIInterface instanceof zzdq)) {
      return (zzdq)localIInterface;
    }
    return new zzdo(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    float f;
    switch (paramInt1)
    {
    default: 
      return false;
    case 13: 
      zzn();
      paramParcel2.writeNoException();
      break;
    case 12: 
      paramInt1 = zzo();
      paramParcel2.writeNoException();
      paramInt2 = zzatq.zza;
      paramParcel2.writeInt(paramInt1);
      break;
    case 11: 
      paramParcel1 = zzi();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 10: 
      paramInt1 = zzp();
      paramParcel2.writeNoException();
      paramInt2 = zzatq.zza;
      paramParcel2.writeInt(paramInt1);
      break;
    case 9: 
      f = zze();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 8: 
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject;
      if (localIBinder == null)
      {
        localObject = null;
      }
      else
      {
        localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
        if ((localObject instanceof zzdt)) {
          localObject = (zzdt)localObject;
        } else {
          localObject = new zzdr(localIBinder);
        }
      }
      zzatq.zzc(paramParcel1);
      zzm((zzdt)localObject);
      paramParcel2.writeNoException();
      break;
    case 7: 
      f = zzf();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 6: 
      f = zzg();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 5: 
      paramInt1 = zzh();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      break;
    case 4: 
      paramInt2 = zzq();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
      break;
    case 3: 
      boolean bool = zzatq.zzg(paramParcel1);
      zzatq.zzc(paramParcel1);
      zzj(bool);
      paramParcel2.writeNoException();
      break;
    case 2: 
      zzk();
      paramParcel2.writeNoException();
      break;
    case 1: 
      zzl();
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */