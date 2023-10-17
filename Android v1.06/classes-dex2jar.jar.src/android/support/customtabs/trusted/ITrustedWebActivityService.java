package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface ITrustedWebActivityService
  extends IInterface
{
  public abstract Bundle areNotificationsEnabled(Bundle paramBundle)
    throws RemoteException;
  
  public abstract void cancelNotification(Bundle paramBundle)
    throws RemoteException;
  
  public abstract Bundle extraCommand(String paramString, Bundle paramBundle, IBinder paramIBinder)
    throws RemoteException;
  
  public abstract Bundle getActiveNotifications()
    throws RemoteException;
  
  public abstract Bundle getSmallIconBitmap()
    throws RemoteException;
  
  public abstract int getSmallIconId()
    throws RemoteException;
  
  public abstract Bundle notifyNotificationWithChannel(Bundle paramBundle)
    throws RemoteException;
  
  public static class Default
    implements ITrustedWebActivityService
  {
    public Bundle areNotificationsEnabled(Bundle paramBundle)
      throws RemoteException
    {
      return null;
    }
    
    public IBinder asBinder()
    {
      return null;
    }
    
    public void cancelNotification(Bundle paramBundle)
      throws RemoteException
    {}
    
    public Bundle extraCommand(String paramString, Bundle paramBundle, IBinder paramIBinder)
      throws RemoteException
    {
      return null;
    }
    
    public Bundle getActiveNotifications()
      throws RemoteException
    {
      return null;
    }
    
    public Bundle getSmallIconBitmap()
      throws RemoteException
    {
      return null;
    }
    
    public int getSmallIconId()
      throws RemoteException
    {
      return 0;
    }
    
    public Bundle notifyNotificationWithChannel(Bundle paramBundle)
      throws RemoteException
    {
      return null;
    }
  }
  
  public static abstract class Stub
    extends Binder
    implements ITrustedWebActivityService
  {
    private static final String DESCRIPTOR = "android.support.customtabs.trusted.ITrustedWebActivityService";
    static final int TRANSACTION_areNotificationsEnabled = 6;
    static final int TRANSACTION_cancelNotification = 3;
    static final int TRANSACTION_extraCommand = 9;
    static final int TRANSACTION_getActiveNotifications = 5;
    static final int TRANSACTION_getSmallIconBitmap = 7;
    static final int TRANSACTION_getSmallIconId = 4;
    static final int TRANSACTION_notifyNotificationWithChannel = 2;
    
    public Stub()
    {
      attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
    }
    
    public static ITrustedWebActivityService asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
      if ((localIInterface != null) && ((localIInterface instanceof ITrustedWebActivityService))) {
        return (ITrustedWebActivityService)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public static ITrustedWebActivityService getDefaultImpl()
    {
      return Proxy.sDefaultImpl;
    }
    
    public static boolean setDefaultImpl(ITrustedWebActivityService paramITrustedWebActivityService)
    {
      if (Proxy.sDefaultImpl == null)
      {
        if (paramITrustedWebActivityService != null)
        {
          Proxy.sDefaultImpl = paramITrustedWebActivityService;
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
      Object localObject2 = null;
      String str = null;
      Object localObject1 = null;
      Object localObject3 = null;
      if (paramInt1 != 9)
      {
        if (paramInt1 != 1598968902)
        {
          switch (paramInt1)
          {
          default: 
            return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
          case 7: 
            paramParcel1.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            paramParcel1 = getSmallIconBitmap();
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
            paramParcel1.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            localObject1 = localObject3;
            if (paramParcel1.readInt() != 0) {
              localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            }
            paramParcel1 = areNotificationsEnabled((Bundle)localObject1);
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
          case 5: 
            paramParcel1.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            paramParcel1 = getActiveNotifications();
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
          case 4: 
            paramParcel1.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            paramInt1 = getSmallIconId();
            paramParcel2.writeNoException();
            paramParcel2.writeInt(paramInt1);
            return true;
          case 3: 
            paramParcel1.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            localObject1 = localObject2;
            if (paramParcel1.readInt() != 0) {
              localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            }
            cancelNotification((Bundle)localObject1);
            paramParcel2.writeNoException();
            return true;
          }
          paramParcel1.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
          localObject1 = str;
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramParcel1 = notifyNotificationWithChannel((Bundle)localObject1);
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
        }
        paramParcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
        return true;
      }
      paramParcel1.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
      str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      paramParcel1 = extraCommand(str, (Bundle)localObject1, paramParcel1.readStrongBinder());
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
    }
    
    private static class Proxy
      implements ITrustedWebActivityService
    {
      public static ITrustedWebActivityService sDefaultImpl;
      private IBinder mRemote;
      
      Proxy(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }
      
      public Bundle areNotificationsEnabled(Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
          if (paramBundle != null)
          {
            localParcel2.writeInt(1);
            paramBundle.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          if ((!this.mRemote.transact(6, localParcel2, localParcel1, 0)) && (ITrustedWebActivityService.Stub.getDefaultImpl() != null))
          {
            paramBundle = ITrustedWebActivityService.Stub.getDefaultImpl().areNotificationsEnabled(paramBundle);
            return paramBundle;
          }
          localParcel1.readException();
          if (localParcel1.readInt() != 0) {
            paramBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel1);
          } else {
            paramBundle = null;
          }
          return paramBundle;
        }
        finally
        {
          localParcel1.recycle();
          localParcel2.recycle();
        }
      }
      
      public IBinder asBinder()
      {
        return this.mRemote;
      }
      
      public void cancelNotification(Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
          if (paramBundle != null)
          {
            localParcel2.writeInt(1);
            paramBundle.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          if ((!this.mRemote.transact(3, localParcel2, localParcel1, 0)) && (ITrustedWebActivityService.Stub.getDefaultImpl() != null))
          {
            ITrustedWebActivityService.Stub.getDefaultImpl().cancelNotification(paramBundle);
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
      
      public Bundle extraCommand(String paramString, Bundle paramBundle, IBinder paramIBinder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
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
          localParcel1.writeStrongBinder(paramIBinder);
          if ((!this.mRemote.transact(9, localParcel1, localParcel2, 0)) && (ITrustedWebActivityService.Stub.getDefaultImpl() != null))
          {
            paramString = ITrustedWebActivityService.Stub.getDefaultImpl().extraCommand(paramString, paramBundle, paramIBinder);
            return paramString;
          }
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            paramString = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            paramString = null;
          }
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public Bundle getActiveNotifications()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
          Bundle localBundle;
          if ((!this.mRemote.transact(5, localParcel1, localParcel2, 0)) && (ITrustedWebActivityService.Stub.getDefaultImpl() != null))
          {
            localBundle = ITrustedWebActivityService.Stub.getDefaultImpl().getActiveNotifications();
            return localBundle;
          }
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            localBundle = null;
          }
          return localBundle;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public String getInterfaceDescriptor()
      {
        return "android.support.customtabs.trusted.ITrustedWebActivityService";
      }
      
      public Bundle getSmallIconBitmap()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
          Bundle localBundle;
          if ((!this.mRemote.transact(7, localParcel1, localParcel2, 0)) && (ITrustedWebActivityService.Stub.getDefaultImpl() != null))
          {
            localBundle = ITrustedWebActivityService.Stub.getDefaultImpl().getSmallIconBitmap();
            return localBundle;
          }
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            localBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            localBundle = null;
          }
          return localBundle;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public int getSmallIconId()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
          if ((!this.mRemote.transact(4, localParcel1, localParcel2, 0)) && (ITrustedWebActivityService.Stub.getDefaultImpl() != null))
          {
            i = ITrustedWebActivityService.Stub.getDefaultImpl().getSmallIconId();
            return i;
          }
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public Bundle notifyNotificationWithChannel(Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if ((!this.mRemote.transact(2, localParcel1, localParcel2, 0)) && (ITrustedWebActivityService.Stub.getDefaultImpl() != null))
          {
            paramBundle = ITrustedWebActivityService.Stub.getDefaultImpl().notifyNotificationWithChannel(paramBundle);
            return paramBundle;
          }
          localParcel2.readException();
          if (localParcel2.readInt() != 0) {
            paramBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
          } else {
            paramBundle = null;
          }
          return paramBundle;
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\android\support\customtabs\trusted\ITrustedWebActivityService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */