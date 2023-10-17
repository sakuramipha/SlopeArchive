package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbuv
  extends zzatp
  implements zzbuw
{
  public zzbuv()
  {
    super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramInt1 = zzb();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    }
    else
    {
      paramParcel1 = zzc();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbuv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */