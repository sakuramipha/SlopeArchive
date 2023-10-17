package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbvo
  extends zzatp
  implements zzbvp
{
  public zzbvo()
  {
    super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
  }
  
  public static zzbvp zzq(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    if ((localIInterface instanceof zzbvp)) {
      return (zzbvp)localIInterface;
    }
    return new zzbvn(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject2 = null;
    Object localObject1 = null;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      return false;
    case 15: 
      bool = zzatq.zzg(paramParcel1);
      zzatq.zzc(paramParcel1);
      zzh(bool);
      paramParcel2.writeNoException();
      break;
    case 14: 
      localObject2 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject3 = paramParcel1.readStrongBinder();
      if (localObject3 != null)
      {
        localObject1 = ((IBinder)localObject3).queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
        if ((localObject1 instanceof zzbvw)) {
          localObject1 = (zzbvw)localObject1;
        } else {
          localObject1 = new zzbvu((IBinder)localObject3);
        }
      }
      zzatq.zzc(paramParcel1);
      zzg((zzl)localObject2, (zzbvw)localObject1);
      paramParcel2.writeNoException();
      break;
    case 13: 
      localObject1 = zzdf.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzj((zzdg)localObject1);
      paramParcel2.writeNoException();
      break;
    case 12: 
      paramParcel1 = zzc();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 11: 
      paramParcel1 = zzd();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 10: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      bool = zzatq.zzg(paramParcel1);
      zzatq.zzc(paramParcel1);
      zzn((IObjectWrapper)localObject1, bool);
      paramParcel2.writeNoException();
      break;
    case 9: 
      paramParcel1 = zzb();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 8: 
      localObject1 = zzdc.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzi((zzdd)localObject1);
      paramParcel2.writeNoException();
      break;
    case 7: 
      localObject1 = (zzbwd)zzatq.zza(paramParcel1, zzbwd.CREATOR);
      zzatq.zzc(paramParcel1);
      zzl((zzbwd)localObject1);
      paramParcel2.writeNoException();
      break;
    case 6: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject3;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
        if ((localObject2 instanceof zzbvx)) {
          localObject1 = (zzbvx)localObject2;
        } else {
          localObject1 = new zzbvx((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzp((zzbvx)localObject1);
      paramParcel2.writeNoException();
      break;
    case 5: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzm((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 4: 
      paramParcel1 = zze();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 3: 
      paramInt1 = zzo();
      paramParcel2.writeNoException();
      paramInt2 = zzatq.zza;
      paramParcel2.writeInt(paramInt1);
      break;
    case 2: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject4;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
        if ((localObject2 instanceof zzbvs)) {
          localObject1 = (zzbvs)localObject2;
        } else {
          localObject1 = new zzbvq((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzk((zzbvs)localObject1);
      paramParcel2.writeNoException();
      break;
    case 1: 
      localObject3 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
        if ((localObject2 instanceof zzbvw)) {
          localObject1 = (zzbvw)localObject2;
        } else {
          localObject1 = new zzbvu((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzf((zzl)localObject3, (zzbvw)localObject1);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbvo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */