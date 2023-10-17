package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbvg
  extends zzatp
  implements zzbvh
{
  public zzbvg()
  {
    super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
  }
  
  public static zzbvh zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    if ((localIInterface instanceof zzbvh)) {
      return (zzbvh)localIInterface;
    }
    return new zzbvf(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return false;
    case 12: 
      localObject = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      break;
    case 11: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzn((IObjectWrapper)localObject);
      break;
    case 10: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzh((IObjectWrapper)localObject);
      break;
    case 9: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      zzg((IObjectWrapper)localObject, paramInt1);
      break;
    case 8: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zze((IObjectWrapper)localObject);
      break;
    case 7: 
      IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject = (zzbvi)zzatq.zza(paramParcel1, zzbvi.CREATOR);
      zzatq.zzc(paramParcel1);
      zzm(localIObjectWrapper, (zzbvi)localObject);
      break;
    case 6: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzf((IObjectWrapper)localObject);
      break;
    case 5: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzo((IObjectWrapper)localObject);
      break;
    case 4: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzj((IObjectWrapper)localObject);
      break;
    case 3: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzi((IObjectWrapper)localObject);
      break;
    case 2: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      zzk((IObjectWrapper)localObject, paramInt1);
      break;
    case 1: 
      localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzl((IObjectWrapper)localObject);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */