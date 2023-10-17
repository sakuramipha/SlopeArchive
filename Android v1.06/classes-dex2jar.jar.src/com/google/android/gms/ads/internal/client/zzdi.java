package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzdi
  extends zzatp
  implements zzdj
{
  public zzdi()
  {
    super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      String str = paramParcel1.readString();
      IObjectWrapper localIObjectWrapper2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      IObjectWrapper localIObjectWrapper1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zze(str, localIObjectWrapper2, localIObjectWrapper1);
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */