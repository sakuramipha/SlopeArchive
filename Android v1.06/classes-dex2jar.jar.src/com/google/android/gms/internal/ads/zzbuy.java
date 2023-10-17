package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzbuy
  extends zzatp
  implements zzbuz
{
  public zzbuy()
  {
    super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        localObject1 = null;
        Object localObject2 = null;
        if (paramInt1 != 3)
        {
          if (paramInt1 != 34)
          {
            switch (paramInt1)
            {
            default: 
              return false;
            case 21: 
              paramParcel1 = zzc();
              paramParcel2.writeNoException();
              zzatq.zzf(paramParcel2, paramParcel1);
              break;
            case 20: 
              paramInt2 = zzt();
              paramParcel2.writeNoException();
              paramInt1 = zzatq.zza;
              paramParcel2.writeInt(paramInt2);
              break;
            case 19: 
              localObject1 = paramParcel1.readString();
              zzatq.zzc(paramParcel1);
              zzm((String)localObject1);
              paramParcel2.writeNoException();
              break;
            case 18: 
              localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
              zzatq.zzc(paramParcel1);
              zzr((IObjectWrapper)localObject1);
              paramParcel2.writeNoException();
              break;
            case 17: 
              paramParcel1.readString();
              zzatq.zzc(paramParcel1);
              paramParcel2.writeNoException();
              break;
            case 16: 
              localObject1 = paramParcel1.readStrongBinder();
              if (localObject1 == null)
              {
                localObject1 = localObject2;
              }
              else
              {
                localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                if ((localObject2 instanceof zzbux)) {
                  localObject1 = (zzbux)localObject2;
                } else {
                  localObject1 = new zzbux((IBinder)localObject1);
                }
              }
              zzatq.zzc(paramParcel1);
              zzu((zzbux)localObject1);
              paramParcel2.writeNoException();
              break;
            case 15: 
              paramParcel1 = zzb();
              paramParcel2.writeNoException();
              zzatq.zze(paramParcel2, paramParcel1);
              break;
            case 14: 
              localObject1 = zzbx.zzb(paramParcel1.readStrongBinder());
              zzatq.zzc(paramParcel1);
              zzl((zzby)localObject1);
              paramParcel2.writeNoException();
              break;
            case 13: 
              localObject1 = paramParcel1.readString();
              zzatq.zzc(paramParcel1);
              zzp((String)localObject1);
              paramParcel2.writeNoException();
              break;
            case 12: 
              paramParcel1 = zzd();
              paramParcel2.writeNoException();
              paramParcel2.writeString(paramParcel1);
              break;
            case 11: 
              localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
              zzatq.zzc(paramParcel1);
              zzf((IObjectWrapper)localObject1);
              paramParcel2.writeNoException();
              break;
            case 10: 
              localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
              zzatq.zzc(paramParcel1);
              zzk((IObjectWrapper)localObject1);
              paramParcel2.writeNoException();
              break;
            case 9: 
              localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
              zzatq.zzc(paramParcel1);
              zzi((IObjectWrapper)localObject1);
              paramParcel2.writeNoException();
              break;
            case 8: 
              zze();
              paramParcel2.writeNoException();
              break;
            case 7: 
              zzj();
              paramParcel2.writeNoException();
              break;
            case 6: 
              zzh();
              paramParcel2.writeNoException();
              break;
            case 5: 
              paramInt1 = zzs();
              paramParcel2.writeNoException();
              paramInt2 = zzatq.zza;
              paramParcel2.writeInt(paramInt1);
              break;
            }
          }
          else
          {
            boolean bool = zzatq.zzg(paramParcel1);
            zzatq.zzc(paramParcel1);
            zzn(bool);
            paramParcel2.writeNoException();
          }
        }
        else
        {
          localObject2 = paramParcel1.readStrongBinder();
          if (localObject2 != null)
          {
            localObject1 = ((IBinder)localObject2).queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
            if ((localObject1 instanceof zzbvc)) {
              localObject1 = (zzbvc)localObject1;
            } else {
              localObject1 = new zzbva((IBinder)localObject2);
            }
          }
          zzatq.zzc(paramParcel1);
          zzo((zzbvc)localObject1);
          paramParcel2.writeNoException();
        }
      }
      else
      {
        zzq();
        paramParcel2.writeNoException();
      }
    }
    else
    {
      localObject1 = (zzbvd)zzatq.zza(paramParcel1, zzbvd.CREATOR);
      zzatq.zzc(paramParcel1);
      zzg((zzbvd)localObject1);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbuy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */