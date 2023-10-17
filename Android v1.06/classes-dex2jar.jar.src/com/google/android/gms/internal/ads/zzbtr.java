package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbtr
  extends zzatp
  implements zzbts
{
  public zzbtr()
  {
    super("com.google.android.gms.ads.internal.request.IAdRequestService");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject4 = null;
    Object localObject1 = null;
    Object localObject3 = null;
    Object localObject2 = null;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 4)
        {
          if (paramInt1 != 5)
          {
            if (paramInt1 != 6)
            {
              if (paramInt1 != 7) {
                return false;
              }
              localObject3 = paramParcel1.readString();
              localObject1 = paramParcel1.readStrongBinder();
              if (localObject1 == null)
              {
                localObject1 = localObject2;
              }
              else
              {
                localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if ((localObject2 instanceof zzbuc)) {
                  localObject1 = (zzbuc)localObject2;
                } else {
                  localObject1 = new zzbua((IBinder)localObject1);
                }
              }
              zzatq.zzc(paramParcel1);
              zzh((String)localObject3, (zzbuc)localObject1);
              paramParcel2.writeNoException();
            }
            else
            {
              localObject2 = (zzbug)zzatq.zza(paramParcel1, zzbug.CREATOR);
              localObject1 = paramParcel1.readStrongBinder();
              if (localObject1 == null)
              {
                localObject1 = localObject4;
              }
              else
              {
                localObject3 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if ((localObject3 instanceof zzbuc)) {
                  localObject1 = (zzbuc)localObject3;
                } else {
                  localObject1 = new zzbua((IBinder)localObject1);
                }
              }
              zzatq.zzc(paramParcel1);
              zze((zzbug)localObject2, (zzbuc)localObject1);
              paramParcel2.writeNoException();
            }
          }
          else
          {
            localObject2 = (zzbug)zzatq.zza(paramParcel1, zzbug.CREATOR);
            localObject3 = paramParcel1.readStrongBinder();
            if (localObject3 != null)
            {
              localObject1 = ((IBinder)localObject3).queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
              if ((localObject1 instanceof zzbuc)) {
                localObject1 = (zzbuc)localObject1;
              } else {
                localObject1 = new zzbua((IBinder)localObject3);
              }
            }
            zzatq.zzc(paramParcel1);
            zzf((zzbug)localObject2, (zzbuc)localObject1);
            paramParcel2.writeNoException();
          }
        }
        else
        {
          localObject2 = (zzbug)zzatq.zza(paramParcel1, zzbug.CREATOR);
          localObject1 = paramParcel1.readStrongBinder();
          if (localObject1 == null)
          {
            localObject1 = localObject3;
          }
          else
          {
            localObject3 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
            if ((localObject3 instanceof zzbuc)) {
              localObject1 = (zzbuc)localObject3;
            } else {
              localObject1 = new zzbua((IBinder)localObject1);
            }
          }
          zzatq.zzc(paramParcel1);
          zzg((zzbug)localObject2, (zzbuc)localObject1);
          paramParcel2.writeNoException();
        }
      }
      else
      {
        localObject1 = (zzbth)zzatq.zza(paramParcel1, zzbth.CREATOR);
        localObject1 = paramParcel1.readStrongBinder();
        if (localObject1 != null)
        {
          localObject1 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
          if ((localObject1 instanceof zzbtt)) {
            localObject1 = (zzbtt)localObject1;
          }
        }
        zzatq.zzc(paramParcel1);
        paramParcel2.writeNoException();
      }
    }
    else
    {
      localObject1 = (zzbth)zzatq.zza(paramParcel1, zzbth.CREATOR);
      zzatq.zzc(paramParcel1);
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, null);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbtr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */