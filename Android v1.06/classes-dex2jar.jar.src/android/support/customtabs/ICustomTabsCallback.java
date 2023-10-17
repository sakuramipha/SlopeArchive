package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface ICustomTabsCallback
  extends IInterface
{
  public abstract void extraCallback(String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public abstract Bundle extraCallbackWithResult(String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void onMessageChannelReady(Bundle paramBundle)
    throws RemoteException;
  
  public abstract void onNavigationEvent(int paramInt, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void onPostMessage(String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void onRelationshipValidationResult(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle)
    throws RemoteException;
  
  public static class Default
    implements ICustomTabsCallback
  {
    public IBinder asBinder()
    {
      return null;
    }
    
    public void extraCallback(String paramString, Bundle paramBundle)
      throws RemoteException
    {}
    
    public Bundle extraCallbackWithResult(String paramString, Bundle paramBundle)
      throws RemoteException
    {
      return null;
    }
    
    public void onMessageChannelReady(Bundle paramBundle)
      throws RemoteException
    {}
    
    public void onNavigationEvent(int paramInt, Bundle paramBundle)
      throws RemoteException
    {}
    
    public void onPostMessage(String paramString, Bundle paramBundle)
      throws RemoteException
    {}
    
    public void onRelationshipValidationResult(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle)
      throws RemoteException
    {}
  }
  
  public static abstract class Stub
    extends Binder
    implements ICustomTabsCallback
  {
    private static final String DESCRIPTOR = "android.support.customtabs.ICustomTabsCallback";
    static final int TRANSACTION_extraCallback = 3;
    static final int TRANSACTION_extraCallbackWithResult = 7;
    static final int TRANSACTION_onMessageChannelReady = 4;
    static final int TRANSACTION_onNavigationEvent = 2;
    static final int TRANSACTION_onPostMessage = 5;
    static final int TRANSACTION_onRelationshipValidationResult = 6;
    
    public Stub()
    {
      attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }
    
    public static ICustomTabsCallback asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
      if ((localIInterface != null) && ((localIInterface instanceof ICustomTabsCallback))) {
        return (ICustomTabsCallback)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public static ICustomTabsCallback getDefaultImpl()
    {
      return Proxy.sDefaultImpl;
    }
    
    public static boolean setDefaultImpl(ICustomTabsCallback paramICustomTabsCallback)
    {
      if (Proxy.sDefaultImpl == null)
      {
        if (paramICustomTabsCallback != null)
        {
          Proxy.sDefaultImpl = paramICustomTabsCallback;
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
        boolean bool = false;
        Object localObject2 = null;
        Object localObject4 = null;
        Object localObject6 = null;
        Object localObject1 = null;
        Object localObject5 = null;
        Object localObject3 = null;
        switch (paramInt1)
        {
        default: 
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        case 7: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
          localObject2 = paramParcel1.readString();
          localObject1 = localObject3;
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramParcel1 = extraCallbackWithResult((String)localObject2, (Bundle)localObject1);
          paramParcel2.writeNoException();
          if (paramParcel1 != null)
          {
            paramParcel2.writeInt(1);
            paramParcel1.writeToParcel(paramParcel2, 1);
          }
          else
          {
            paramParcel2.writeInt(0);
          }
          return true;
        case 6: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
          paramInt1 = paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          } else {
            localObject1 = null;
          }
          if (paramParcel1.readInt() != 0) {
            bool = true;
          }
          if (paramParcel1.readInt() != 0) {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          onRelationshipValidationResult(paramInt1, (Uri)localObject1, bool, (Bundle)localObject2);
          paramParcel2.writeNoException();
          return true;
        case 5: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
          localObject2 = paramParcel1.readString();
          localObject1 = localObject4;
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          onPostMessage((String)localObject2, (Bundle)localObject1);
          paramParcel2.writeNoException();
          return true;
        case 4: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
          localObject1 = localObject6;
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          onMessageChannelReady((Bundle)localObject1);
          paramParcel2.writeNoException();
          return true;
        case 3: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
          localObject2 = paramParcel1.readString();
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          extraCallback((String)localObject2, (Bundle)localObject1);
          paramParcel2.writeNoException();
          return true;
        }
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        paramInt1 = paramParcel1.readInt();
        localObject1 = localObject5;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        onNavigationEvent(paramInt1, (Bundle)localObject1);
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel2.writeString("android.support.customtabs.ICustomTabsCallback");
      return true;
    }
    
    private static class Proxy
      implements ICustomTabsCallback
    {
      public static ICustomTabsCallback sDefaultImpl;
      private IBinder mRemote;
      
      Proxy(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }
      
      public IBinder asBinder()
      {
        return this.mRemote;
      }
      
      public void extraCallback(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
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
          if ((!this.mRemote.transact(3, localParcel2, localParcel1, 0)) && (ICustomTabsCallback.Stub.getDefaultImpl() != null))
          {
            ICustomTabsCallback.Stub.getDefaultImpl().extraCallback(paramString, paramBundle);
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
      
      public Bundle extraCallbackWithResult(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
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
          if ((!this.mRemote.transact(7, localParcel2, localParcel1, 0)) && (ICustomTabsCallback.Stub.getDefaultImpl() != null))
          {
            paramString = ICustomTabsCallback.Stub.getDefaultImpl().extraCallbackWithResult(paramString, paramBundle);
            return paramString;
          }
          localParcel1.readException();
          if (localParcel1.readInt() != 0) {
            paramString = (Bundle)Bundle.CREATOR.createFromParcel(localParcel1);
          } else {
            paramString = null;
          }
          return paramString;
        }
        finally
        {
          localParcel1.recycle();
          localParcel2.recycle();
        }
      }
      
      public String getInterfaceDescriptor()
      {
        return "android.support.customtabs.ICustomTabsCallback";
      }
      
      public void onMessageChannelReady(Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          if (paramBundle != null)
          {
            localParcel2.writeInt(1);
            paramBundle.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          if ((!this.mRemote.transact(4, localParcel2, localParcel1, 0)) && (ICustomTabsCallback.Stub.getDefaultImpl() != null))
          {
            ICustomTabsCallback.Stub.getDefaultImpl().onMessageChannelReady(paramBundle);
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
      
      public void onNavigationEvent(int paramInt, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          localParcel1.writeInt(paramInt);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if ((!this.mRemote.transact(2, localParcel1, localParcel2, 0)) && (ICustomTabsCallback.Stub.getDefaultImpl() != null))
          {
            ICustomTabsCallback.Stub.getDefaultImpl().onNavigationEvent(paramInt, paramBundle);
            return;
          }
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void onPostMessage(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          localParcel1.writeString(paramString);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if ((!this.mRemote.transact(5, localParcel1, localParcel2, 0)) && (ICustomTabsCallback.Stub.getDefaultImpl() != null))
          {
            ICustomTabsCallback.Stub.getDefaultImpl().onPostMessage(paramString, paramBundle);
            return;
          }
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void onRelationshipValidationResult(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          localParcel1.writeInt(paramInt);
          if (paramUri != null)
          {
            localParcel1.writeInt(1);
            paramUri.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          int i;
          if (paramBoolean) {
            i = 1;
          } else {
            i = 0;
          }
          localParcel1.writeInt(i);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if ((!this.mRemote.transact(6, localParcel1, localParcel2, 0)) && (ICustomTabsCallback.Stub.getDefaultImpl() != null))
          {
            ICustomTabsCallback.Stub.getDefaultImpl().onRelationshipValidationResult(paramInt, paramUri, paramBoolean, paramBundle);
            return;
          }
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\android\support\customtabs\ICustomTabsCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */