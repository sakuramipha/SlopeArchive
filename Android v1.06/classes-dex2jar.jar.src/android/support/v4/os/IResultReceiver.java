package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface IResultReceiver
  extends IInterface
{
  public abstract void send(int paramInt, Bundle paramBundle)
    throws RemoteException;
  
  public static class Default
    implements IResultReceiver
  {
    public IBinder asBinder()
    {
      return null;
    }
    
    public void send(int paramInt, Bundle paramBundle)
      throws RemoteException
    {}
  }
  
  public static abstract class Stub
    extends Binder
    implements IResultReceiver
  {
    private static final String DESCRIPTOR = "android.support.v4.os.IResultReceiver";
    static final int TRANSACTION_send = 1;
    
    public Stub()
    {
      attachInterface(this, "android.support.v4.os.IResultReceiver");
    }
    
    public static IResultReceiver asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
      if ((localIInterface != null) && ((localIInterface instanceof IResultReceiver))) {
        return (IResultReceiver)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public static IResultReceiver getDefaultImpl()
    {
      return Proxy.sDefaultImpl;
    }
    
    public static boolean setDefaultImpl(IResultReceiver paramIResultReceiver)
    {
      if (Proxy.sDefaultImpl == null)
      {
        if (paramIResultReceiver != null)
        {
          Proxy.sDefaultImpl = paramIResultReceiver;
          return true;
        }
        return false;
      }
      throw new IllegalStateException("setDefaultImpl() called twice");
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      if (paramInt1 != 1)
      {
        if (paramInt1 != 1598968902) {
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        }
        paramParcel2.writeString("android.support.v4.os.IResultReceiver");
        return true;
      }
      paramParcel1.enforceInterface("android.support.v4.os.IResultReceiver");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      } else {
        paramParcel1 = null;
      }
      send(paramInt1, paramParcel1);
      return true;
    }
    
    private static class Proxy
      implements IResultReceiver
    {
      public static IResultReceiver sDefaultImpl;
      private IBinder mRemote;
      
      Proxy(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }
      
      public IBinder asBinder()
      {
        return this.mRemote;
      }
      
      public String getInterfaceDescriptor()
      {
        return "android.support.v4.os.IResultReceiver";
      }
      
      public void send(int paramInt, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("android.support.v4.os.IResultReceiver");
          localParcel.writeInt(paramInt);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
          }
          else
          {
            localParcel.writeInt(0);
          }
          if ((!this.mRemote.transact(1, localParcel, null, 1)) && (IResultReceiver.Stub.getDefaultImpl() != null))
          {
            IResultReceiver.Stub.getDefaultImpl().send(paramInt, paramBundle);
            return;
          }
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\android\support\v4\os\IResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */