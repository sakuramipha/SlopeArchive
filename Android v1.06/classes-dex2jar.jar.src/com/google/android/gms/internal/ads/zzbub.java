package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;

public abstract class zzbub
  extends zzatp
  implements zzbuc
{
  public zzbub()
  {
    super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      localObject = (zzaz)zzatq.zza(paramParcel1, zzaz.CREATOR);
      zzatq.zzc(paramParcel1);
      zze((zzaz)localObject);
    }
    else
    {
      localObject = (ParcelFileDescriptor)zzatq.zza(paramParcel1, ParcelFileDescriptor.CREATOR);
      zzatq.zzc(paramParcel1);
      zzf((ParcelFileDescriptor)localObject);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */