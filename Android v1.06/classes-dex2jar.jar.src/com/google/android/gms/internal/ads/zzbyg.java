package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbyg
  extends zzatp
  implements zzbyh
{
  public zzbyg()
  {
    super("com.google.android.gms.ads.internal.signals.ISignalCallback");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      String str1;
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          return false;
        }
        str1 = paramParcel1.readString();
        String str2 = paramParcel1.readString();
        Bundle localBundle = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
        zzatq.zzc(paramParcel1);
        zzc(str1, str2, localBundle);
      }
      else
      {
        str1 = paramParcel1.readString();
        zzatq.zzc(paramParcel1);
        zzb(str1);
      }
    }
    else
    {
      paramParcel1.readString();
      paramParcel1.readString();
      zzatq.zzc(paramParcel1);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbyg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */