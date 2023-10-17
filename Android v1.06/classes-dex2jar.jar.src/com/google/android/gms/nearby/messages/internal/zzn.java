package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.nearby.zzb;
import com.google.android.gms.internal.nearby.zzc;

public abstract class zzn
  extends zzb
  implements zzo
{
  public zzn()
  {
    super("com.google.android.gms.nearby.messages.internal.IMessageListener");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 4) {
          return false;
        }
        zzd(paramParcel1.createTypedArrayList(Update.CREATOR));
      }
      else
      {
        paramParcel1 = (zzae)zzc.zzb(paramParcel1, zzae.CREATOR);
      }
    }
    else {
      paramParcel1 = (zzae)zzc.zzb(paramParcel1, zzae.CREATOR);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */