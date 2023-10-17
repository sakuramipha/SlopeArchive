package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzfnm
  extends zzatp
  implements zzfnn
{
  public zzfnm()
  {
    super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      paramParcel2 = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzb(paramParcel2);
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfnm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */