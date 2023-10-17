package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface IWorkManagerImplCallback
  extends IInterface
{
  public abstract void onFailure(String paramString)
    throws RemoteException;
  
  public abstract void onSuccess(byte[] paramArrayOfByte)
    throws RemoteException;
  
  public static class Default
    implements IWorkManagerImplCallback
  {
    public IBinder asBinder()
    {
      return null;
    }
    
    public void onFailure(String paramString)
      throws RemoteException
    {}
    
    public void onSuccess(byte[] paramArrayOfByte)
      throws RemoteException
    {}
  }
  
  public static abstract class Stub
    extends Binder
    implements IWorkManagerImplCallback
  {
    private static final String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImplCallback";
    static final int TRANSACTION_onFailure = 2;
    static final int TRANSACTION_onSuccess = 1;
    
    public Stub()
    {
      attachInterface(this, "androidx.work.multiprocess.IWorkManagerImplCallback");
    }
    
    public static IWorkManagerImplCallback asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
      if ((localIInterface != null) && ((localIInterface instanceof IWorkManagerImplCallback))) {
        return (IWorkManagerImplCallback)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public static IWorkManagerImplCallback getDefaultImpl()
    {
      return Proxy.sDefaultImpl;
    }
    
    public static boolean setDefaultImpl(IWorkManagerImplCallback paramIWorkManagerImplCallback)
    {
      if (Proxy.sDefaultImpl == null)
      {
        if (paramIWorkManagerImplCallback != null)
        {
          Proxy.sDefaultImpl = paramIWorkManagerImplCallback;
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
        if (paramInt1 != 2)
        {
          if (paramInt1 != 1598968902) {
            return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
          }
          paramParcel2.writeString("androidx.work.multiprocess.IWorkManagerImplCallback");
          return true;
        }
        paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
        onFailure(paramParcel1.readString());
        return true;
      }
      paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
      onSuccess(paramParcel1.createByteArray());
      return true;
    }
    
    private static class Proxy
      implements IWorkManagerImplCallback
    {
      public static IWorkManagerImplCallback sDefaultImpl;
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
        return "androidx.work.multiprocess.IWorkManagerImplCallback";
      }
      
      public void onFailure(String paramString)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
          localParcel.writeString(paramString);
          if ((!this.mRemote.transact(2, localParcel, null, 1)) && (IWorkManagerImplCallback.Stub.getDefaultImpl() != null))
          {
            IWorkManagerImplCallback.Stub.getDefaultImpl().onFailure(paramString);
            return;
          }
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void onSuccess(byte[] paramArrayOfByte)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
          localParcel.writeByteArray(paramArrayOfByte);
          if ((!this.mRemote.transact(1, localParcel, null, 1)) && (IWorkManagerImplCallback.Stub.getDefaultImpl() != null))
          {
            IWorkManagerImplCallback.Stub.getDefaultImpl().onSuccess(paramArrayOfByte);
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\multiprocess\IWorkManagerImplCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */