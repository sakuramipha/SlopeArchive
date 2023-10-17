package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbkv
  extends zzatp
  implements zzbkw
{
  public zzbkv()
  {
    super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbkv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */