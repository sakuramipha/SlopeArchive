package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface IWorkManagerImpl
  extends IInterface
{
  public abstract void cancelAllWork(IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException;
  
  public abstract void cancelAllWorkByTag(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException;
  
  public abstract void cancelUniqueWork(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException;
  
  public abstract void cancelWorkById(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException;
  
  public abstract void enqueueContinuation(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException;
  
  public abstract void enqueueWorkRequests(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException;
  
  public abstract void queryWorkInfo(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException;
  
  public abstract void setProgress(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
    throws RemoteException;
  
  public static class Default
    implements IWorkManagerImpl
  {
    public IBinder asBinder()
    {
      return null;
    }
    
    public void cancelAllWork(IWorkManagerImplCallback paramIWorkManagerImplCallback)
      throws RemoteException
    {}
    
    public void cancelAllWorkByTag(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
      throws RemoteException
    {}
    
    public void cancelUniqueWork(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
      throws RemoteException
    {}
    
    public void cancelWorkById(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
      throws RemoteException
    {}
    
    public void enqueueContinuation(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
      throws RemoteException
    {}
    
    public void enqueueWorkRequests(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
      throws RemoteException
    {}
    
    public void queryWorkInfo(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
      throws RemoteException
    {}
    
    public void setProgress(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
      throws RemoteException
    {}
  }
  
  public static abstract class Stub
    extends Binder
    implements IWorkManagerImpl
  {
    private static final String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImpl";
    static final int TRANSACTION_cancelAllWork = 6;
    static final int TRANSACTION_cancelAllWorkByTag = 4;
    static final int TRANSACTION_cancelUniqueWork = 5;
    static final int TRANSACTION_cancelWorkById = 3;
    static final int TRANSACTION_enqueueContinuation = 2;
    static final int TRANSACTION_enqueueWorkRequests = 1;
    static final int TRANSACTION_queryWorkInfo = 7;
    static final int TRANSACTION_setProgress = 8;
    
    public Stub()
    {
      attachInterface(this, "androidx.work.multiprocess.IWorkManagerImpl");
    }
    
    public static IWorkManagerImpl asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImpl");
      if ((localIInterface != null) && ((localIInterface instanceof IWorkManagerImpl))) {
        return (IWorkManagerImpl)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public static IWorkManagerImpl getDefaultImpl()
    {
      return Proxy.sDefaultImpl;
    }
    
    public static boolean setDefaultImpl(IWorkManagerImpl paramIWorkManagerImpl)
    {
      if (Proxy.sDefaultImpl == null)
      {
        if (paramIWorkManagerImpl != null)
        {
          Proxy.sDefaultImpl = paramIWorkManagerImpl;
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
      if (paramInt1 != 1598968902)
      {
        switch (paramInt1)
        {
        default: 
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        case 8: 
          paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
          setProgress(paramParcel1.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
          return true;
        case 7: 
          paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
          queryWorkInfo(paramParcel1.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
          return true;
        case 6: 
          paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
          cancelAllWork(IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
          return true;
        case 5: 
          paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
          cancelUniqueWork(paramParcel1.readString(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
          return true;
        case 4: 
          paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
          cancelAllWorkByTag(paramParcel1.readString(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
          return true;
        case 3: 
          paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
          cancelWorkById(paramParcel1.readString(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
          return true;
        case 2: 
          paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
          enqueueContinuation(paramParcel1.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
          return true;
        }
        paramParcel1.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
        enqueueWorkRequests(paramParcel1.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
        return true;
      }
      paramParcel2.writeString("androidx.work.multiprocess.IWorkManagerImpl");
      return true;
    }
    
    private static class Proxy
      implements IWorkManagerImpl
    {
      public static IWorkManagerImpl sDefaultImpl;
      private IBinder mRemote;
      
      Proxy(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }
      
      public IBinder asBinder()
      {
        return this.mRemote;
      }
      
      public void cancelAllWork(IWorkManagerImplCallback paramIWorkManagerImplCallback)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
          IBinder localIBinder;
          if (paramIWorkManagerImplCallback != null) {
            localIBinder = paramIWorkManagerImplCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel.writeStrongBinder(localIBinder);
          if ((!this.mRemote.transact(6, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
          {
            IWorkManagerImpl.Stub.getDefaultImpl().cancelAllWork(paramIWorkManagerImplCallback);
            return;
          }
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void cancelAllWorkByTag(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
          localParcel.writeString(paramString);
          IBinder localIBinder;
          if (paramIWorkManagerImplCallback != null) {
            localIBinder = paramIWorkManagerImplCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel.writeStrongBinder(localIBinder);
          if ((!this.mRemote.transact(4, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
          {
            IWorkManagerImpl.Stub.getDefaultImpl().cancelAllWorkByTag(paramString, paramIWorkManagerImplCallback);
            return;
          }
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void cancelUniqueWork(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
          localParcel.writeString(paramString);
          IBinder localIBinder;
          if (paramIWorkManagerImplCallback != null) {
            localIBinder = paramIWorkManagerImplCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel.writeStrongBinder(localIBinder);
          if ((!this.mRemote.transact(5, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
          {
            IWorkManagerImpl.Stub.getDefaultImpl().cancelUniqueWork(paramString, paramIWorkManagerImplCallback);
            return;
          }
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void cancelWorkById(String paramString, IWorkManagerImplCallback paramIWorkManagerImplCallback)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
          localParcel.writeString(paramString);
          IBinder localIBinder;
          if (paramIWorkManagerImplCallback != null) {
            localIBinder = paramIWorkManagerImplCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel.writeStrongBinder(localIBinder);
          if ((!this.mRemote.transact(3, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
          {
            IWorkManagerImpl.Stub.getDefaultImpl().cancelWorkById(paramString, paramIWorkManagerImplCallback);
            return;
          }
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void enqueueContinuation(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
          localParcel.writeByteArray(paramArrayOfByte);
          IBinder localIBinder;
          if (paramIWorkManagerImplCallback != null) {
            localIBinder = paramIWorkManagerImplCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel.writeStrongBinder(localIBinder);
          if ((!this.mRemote.transact(2, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
          {
            IWorkManagerImpl.Stub.getDefaultImpl().enqueueContinuation(paramArrayOfByte, paramIWorkManagerImplCallback);
            return;
          }
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void enqueueWorkRequests(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
          localParcel.writeByteArray(paramArrayOfByte);
          IBinder localIBinder;
          if (paramIWorkManagerImplCallback != null) {
            localIBinder = paramIWorkManagerImplCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel.writeStrongBinder(localIBinder);
          if ((!this.mRemote.transact(1, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
          {
            IWorkManagerImpl.Stub.getDefaultImpl().enqueueWorkRequests(paramArrayOfByte, paramIWorkManagerImplCallback);
            return;
          }
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public String getInterfaceDescriptor()
      {
        return "androidx.work.multiprocess.IWorkManagerImpl";
      }
      
      public void queryWorkInfo(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
          localParcel.writeByteArray(paramArrayOfByte);
          IBinder localIBinder;
          if (paramIWorkManagerImplCallback != null) {
            localIBinder = paramIWorkManagerImplCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel.writeStrongBinder(localIBinder);
          if ((!this.mRemote.transact(7, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
          {
            IWorkManagerImpl.Stub.getDefaultImpl().queryWorkInfo(paramArrayOfByte, paramIWorkManagerImplCallback);
            return;
          }
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public void setProgress(byte[] paramArrayOfByte, IWorkManagerImplCallback paramIWorkManagerImplCallback)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
          localParcel.writeByteArray(paramArrayOfByte);
          IBinder localIBinder;
          if (paramIWorkManagerImplCallback != null) {
            localIBinder = paramIWorkManagerImplCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel.writeStrongBinder(localIBinder);
          if ((!this.mRemote.transact(8, localParcel, null, 1)) && (IWorkManagerImpl.Stub.getDefaultImpl() != null))
          {
            IWorkManagerImpl.Stub.getDefaultImpl().setProgress(paramArrayOfByte, paramIWorkManagerImplCallback);
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\multiprocess\IWorkManagerImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */