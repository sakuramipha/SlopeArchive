package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract interface IStatusCallback
  extends IInterface
{
  public abstract void onResult(Status paramStatus)
    throws RemoteException;
  
  public static abstract class Stub
    extends zab
    implements IStatusCallback
  {
    public Stub()
    {
      super();
    }
    
    public static IStatusCallback asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
      if ((localIInterface instanceof IStatusCallback)) {
        return (IStatusCallback)localIInterface;
      }
      return new zaby(paramIBinder);
    }
    
    protected final boolean zaa(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      if (paramInt1 == 1)
      {
        onResult((Status)zac.zaa(paramParcel1, Status.CREATOR));
        return true;
      }
      return false;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\IStatusCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */