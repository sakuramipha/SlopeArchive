package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzch
  extends zzbn
  implements zzci
{
  public zzch()
  {
    super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramInt1 = zzd();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    }
    else
    {
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      Bundle localBundle = (Bundle)zzbo.zza(paramParcel1, Bundle.CREATOR);
      long l = paramParcel1.readLong();
      zzbo.zzc(paramParcel1);
      zze(str1, str2, localBundle, l);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */