package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface IPostMessageService
  extends IInterface
{
  public abstract void onMessageChannelReady(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void onPostMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public static class Default
    implements IPostMessageService
  {
    public IBinder asBinder()
    {
      return null;
    }
    
    public void onMessageChannelReady(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
      throws RemoteException
    {}
    
    public void onPostMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
      throws RemoteException
    {}
  }
  
  public static abstract class Stub
    extends Binder
    implements IPostMessageService
  {
    private static final String DESCRIPTOR = "android.support.customtabs.IPostMessageService";
    static final int TRANSACTION_onMessageChannelReady = 2;
    static final int TRANSACTION_onPostMessage = 3;
    
    public Stub()
    {
      attachInterface(this, "android.support.customtabs.IPostMessageService");
    }
    
    public static IPostMessageService asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.IPostMessageService");
      if ((localIInterface != null) && ((localIInterface instanceof IPostMessageService))) {
        return (IPostMessageService)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public static IPostMessageService getDefaultImpl()
    {
      return Proxy.sDefaultImpl;
    }
    
    public static boolean setDefaultImpl(IPostMessageService paramIPostMessageService)
    {
      if (Proxy.sDefaultImpl == null)
      {
        if (paramIPostMessageService != null)
        {
          Proxy.sDefaultImpl = paramIPostMessageService;
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
      String str = null;
      Object localObject = null;
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3)
        {
          if (paramInt1 != 1598968902) {
            return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
          }
          paramParcel2.writeString("android.support.customtabs.IPostMessageService");
          return true;
        }
        paramParcel1.enforceInterface("android.support.customtabs.IPostMessageService");
        localICustomTabsCallback = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        str = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {
          localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        onPostMessage(localICustomTabsCallback, str, (Bundle)localObject);
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel1.enforceInterface("android.support.customtabs.IPostMessageService");
      ICustomTabsCallback localICustomTabsCallback = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject = str;
      if (paramParcel1.readInt() != 0) {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      onMessageChannelReady(localICustomTabsCallback, (Bundle)localObject);
      paramParcel2.writeNoException();
      return true;
    }
    
    private static class Proxy
      implements IPostMessageService
    {
      public static IPostMessageService sDefaultImpl;
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
        return "android.support.customtabs.IPostMessageService";
      }
      
      public void onMessageChannelReady(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.IPostMessageService");
          IBinder localIBinder;
          if (paramICustomTabsCallback != null) {
            localIBinder = paramICustomTabsCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel2.writeStrongBinder(localIBinder);
          if (paramBundle != null)
          {
            localParcel2.writeInt(1);
            paramBundle.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          if ((!this.mRemote.transact(2, localParcel2, localParcel1, 0)) && (IPostMessageService.Stub.getDefaultImpl() != null))
          {
            IPostMessageService.Stub.getDefaultImpl().onMessageChannelReady(paramICustomTabsCallback, paramBundle);
            return;
          }
          localParcel1.readException();
          return;
        }
        finally
        {
          localParcel1.recycle();
          localParcel2.recycle();
        }
      }
      
      public void onPostMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.IPostMessageService");
          IBinder localIBinder;
          if (paramICustomTabsCallback != null) {
            localIBinder = paramICustomTabsCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel2.writeStrongBinder(localIBinder);
          localParcel2.writeString(paramString);
          if (paramBundle != null)
          {
            localParcel2.writeInt(1);
            paramBundle.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          if ((!this.mRemote.transact(3, localParcel2, localParcel1, 0)) && (IPostMessageService.Stub.getDefaultImpl() != null))
          {
            IPostMessageService.Stub.getDefaultImpl().onPostMessage(paramICustomTabsCallback, paramString, paramBundle);
            return;
          }
          localParcel1.readException();
          return;
        }
        finally
        {
          localParcel1.recycle();
          localParcel2.recycle();
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\android\support\customtabs\IPostMessageService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */