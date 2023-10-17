package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbtv
  extends zzatp
  implements zzbtw
{
  public zzbtv()
  {
    super("com.google.android.gms.ads.internal.request.IAdsService");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          return false;
        }
        localObject3 = (zzbto)zzatq.zza(paramParcel1, zzbto.CREATOR);
        localObject1 = paramParcel1.readStrongBinder();
        if (localObject1 == null)
        {
          localObject1 = localObject2;
        }
        else
        {
          localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
          if ((localObject2 instanceof zzbtz)) {
            localObject1 = (zzbtz)localObject2;
          } else {
            localObject1 = new zzbtx((IBinder)localObject1);
          }
        }
        zzatq.zzc(paramParcel1);
        zze((zzbto)localObject3, (zzbtz)localObject1);
      }
      else
      {
        localObject1 = (zzbtk)zzatq.zza(paramParcel1, zzbtk.CREATOR);
        localObject1 = paramParcel1.readStrongBinder();
        if (localObject1 != null)
        {
          localObject1 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
          if ((localObject1 instanceof zzbtz)) {
            localObject1 = (zzbtz)localObject1;
          }
        }
        zzatq.zzc(paramParcel1);
      }
    }
    else
    {
      localObject2 = (zzbtk)zzatq.zza(paramParcel1, zzbtk.CREATOR);
      localObject3 = paramParcel1.readStrongBinder();
      if (localObject3 != null)
      {
        localObject1 = ((IBinder)localObject3).queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
        if ((localObject1 instanceof zzbtz)) {
          localObject1 = (zzbtz)localObject1;
        } else {
          localObject1 = new zzbtx((IBinder)localObject3);
        }
      }
      zzatq.zzc(paramParcel1);
      zzf((zzbtk)localObject2, (zzbtz)localObject1);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbtv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */