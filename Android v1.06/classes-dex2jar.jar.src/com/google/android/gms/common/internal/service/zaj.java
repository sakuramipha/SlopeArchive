package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zab;

public abstract class zaj
  extends zab
  implements zak
{
  public zaj()
  {
    super("com.google.android.gms.common.internal.service.ICommonCallbacks");
  }
  
  protected final boolean zaa(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      zab(paramParcel1.readInt());
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\service\zaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */