package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzbq
  extends zzatp
  implements zzbr
{
  public zzbq()
  {
    super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    IObjectWrapper localIObjectWrapper;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2) {
        return false;
      }
      localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zze(localIObjectWrapper);
      paramParcel2.writeNoException();
    }
    else
    {
      localIObjectWrapper = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      paramInt1 = zzf(localIObjectWrapper, str1, str2);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */