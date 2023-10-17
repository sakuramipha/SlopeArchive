package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbvr
  extends zzatp
  implements zzbvs
{
  public zzbvr()
  {
    super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
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
      zze();
      break;
    case 6: 
      zzf();
      break;
    case 5: 
      localObject = (zze)zzatq.zza(paramParcel1, zze.CREATOR);
      zzatq.zzc(paramParcel1);
      zzi((zze)localObject);
      break;
    case 4: 
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      zzh(paramInt1);
      break;
    case 3: 
      IBinder localIBinder = paramParcel1.readStrongBinder();
      if (localIBinder == null)
      {
        localObject = null;
      }
      else
      {
        localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        if ((localObject instanceof zzbvm)) {
          localObject = (zzbvm)localObject;
        } else {
          localObject = new zzbvk(localIBinder);
        }
      }
      zzatq.zzc(paramParcel1);
      zzk((zzbvm)localObject);
      break;
    case 2: 
      zzg();
      break;
    case 1: 
      zzj();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */