package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzbm
  extends zzatp
  implements zzbn
{
  public zzbm()
  {
    super("com.google.android.gms.ads.internal.client.IAdLoader");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    zzl localzzl;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3)
        {
          if (paramInt1 != 4)
          {
            if (paramInt1 != 5) {
              return false;
            }
            localzzl = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
            paramInt1 = paramParcel1.readInt();
            zzatq.zzc(paramParcel1);
            zzh(localzzl, paramInt1);
            paramParcel2.writeNoException();
          }
          else
          {
            paramParcel1 = zzf();
            paramParcel2.writeNoException();
            paramParcel2.writeString(paramParcel1);
          }
        }
        else
        {
          paramInt2 = zzi();
          paramParcel2.writeNoException();
          paramInt1 = zzatq.zza;
          paramParcel2.writeInt(paramInt2);
        }
      }
      else
      {
        paramParcel1 = zze();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
      }
    }
    else
    {
      localzzl = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      zzatq.zzc(paramParcel1);
      zzg(localzzl);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */