package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract interface IAccountAccessor
  extends IInterface
{
  public abstract Account zzb()
    throws RemoteException;
  
  public static abstract class Stub
    extends zzb
    implements IAccountAccessor
  {
    public Stub()
    {
      super();
    }
    
    public static IAccountAccessor asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
      if ((localIInterface instanceof IAccountAccessor)) {
        return (IAccountAccessor)localIInterface;
      }
      return new zzv(paramIBinder);
    }
    
    protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      if (paramInt1 == 2)
      {
        paramParcel1 = zzb();
        paramParcel2.writeNoException();
        zzc.zzd(paramParcel2, paramParcel1);
        return true;
      }
      return false;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\IAccountAccessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */