package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbte
  extends zzatp
  implements zzbtf
{
  public zzbte()
  {
    super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      zzb();
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */