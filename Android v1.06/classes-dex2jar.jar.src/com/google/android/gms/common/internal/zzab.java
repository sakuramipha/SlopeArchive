package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class zzab
  extends zzb
  implements IGmsCallbacks
{
  public zzab()
  {
    super("com.google.android.gms.common.internal.IGmsCallbacks");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          return false;
        }
        zzc(paramParcel1.readInt(), paramParcel1.readStrongBinder(), (zzj)zzc.zza(paramParcel1, zzj.CREATOR));
      }
      else
      {
        zzb(paramParcel1.readInt(), (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR));
      }
    }
    else {
      onPostInitComplete(paramParcel1.readInt(), paramParcel1.readStrongBinder(), (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR));
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */