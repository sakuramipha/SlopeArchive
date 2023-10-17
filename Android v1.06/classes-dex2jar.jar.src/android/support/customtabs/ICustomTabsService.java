package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import java.util.List;

public abstract interface ICustomTabsService
  extends IInterface
{
  public abstract Bundle extraCommand(String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public abstract boolean mayLaunchUrl(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
    throws RemoteException;
  
  public abstract boolean newSession(ICustomTabsCallback paramICustomTabsCallback)
    throws RemoteException;
  
  public abstract boolean newSessionWithExtras(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
    throws RemoteException;
  
  public abstract int postMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public abstract boolean receiveFile(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, int paramInt, Bundle paramBundle)
    throws RemoteException;
  
  public abstract boolean requestPostMessageChannel(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri)
    throws RemoteException;
  
  public abstract boolean requestPostMessageChannelWithExtras(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle)
    throws RemoteException;
  
  public abstract boolean updateVisuals(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
    throws RemoteException;
  
  public abstract boolean validateRelationship(ICustomTabsCallback paramICustomTabsCallback, int paramInt, Uri paramUri, Bundle paramBundle)
    throws RemoteException;
  
  public abstract boolean warmup(long paramLong)
    throws RemoteException;
  
  public static class Default
    implements ICustomTabsService
  {
    public IBinder asBinder()
    {
      return null;
    }
    
    public Bundle extraCommand(String paramString, Bundle paramBundle)
      throws RemoteException
    {
      return null;
    }
    
    public boolean mayLaunchUrl(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
      throws RemoteException
    {
      return false;
    }
    
    public boolean newSession(ICustomTabsCallback paramICustomTabsCallback)
      throws RemoteException
    {
      return false;
    }
    
    public boolean newSessionWithExtras(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
      throws RemoteException
    {
      return false;
    }
    
    public int postMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
      throws RemoteException
    {
      return 0;
    }
    
    public boolean receiveFile(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, int paramInt, Bundle paramBundle)
      throws RemoteException
    {
      return false;
    }
    
    public boolean requestPostMessageChannel(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri)
      throws RemoteException
    {
      return false;
    }
    
    public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle)
      throws RemoteException
    {
      return false;
    }
    
    public boolean updateVisuals(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
      throws RemoteException
    {
      return false;
    }
    
    public boolean validateRelationship(ICustomTabsCallback paramICustomTabsCallback, int paramInt, Uri paramUri, Bundle paramBundle)
      throws RemoteException
    {
      return false;
    }
    
    public boolean warmup(long paramLong)
      throws RemoteException
    {
      return false;
    }
  }
  
  public static abstract class Stub
    extends Binder
    implements ICustomTabsService
  {
    private static final String DESCRIPTOR = "android.support.customtabs.ICustomTabsService";
    static final int TRANSACTION_extraCommand = 5;
    static final int TRANSACTION_mayLaunchUrl = 4;
    static final int TRANSACTION_newSession = 3;
    static final int TRANSACTION_newSessionWithExtras = 10;
    static final int TRANSACTION_postMessage = 8;
    static final int TRANSACTION_receiveFile = 12;
    static final int TRANSACTION_requestPostMessageChannel = 7;
    static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
    static final int TRANSACTION_updateVisuals = 6;
    static final int TRANSACTION_validateRelationship = 9;
    static final int TRANSACTION_warmup = 2;
    
    public Stub()
    {
      attachInterface(this, "android.support.customtabs.ICustomTabsService");
    }
    
    public static ICustomTabsService asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
      if ((localIInterface != null) && ((localIInterface instanceof ICustomTabsService))) {
        return (ICustomTabsService)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public static ICustomTabsService getDefaultImpl()
    {
      return Proxy.sDefaultImpl;
    }
    
    public static boolean setDefaultImpl(ICustomTabsService paramICustomTabsService)
    {
      if (Proxy.sDefaultImpl == null)
      {
        if (paramICustomTabsService != null)
        {
          Proxy.sDefaultImpl = paramICustomTabsService;
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
        ICustomTabsCallback localICustomTabsCallback1 = null;
        Object localObject6 = null;
        Object localObject3 = null;
        Object localObject1 = null;
        Object localObject7 = null;
        Object localObject4 = null;
        Object localObject5 = null;
        Object localObject2 = null;
        ICustomTabsCallback localICustomTabsCallback2 = null;
        switch (paramInt1)
        {
        default: 
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        case 12: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
          localICustomTabsCallback1 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          } else {
            localObject1 = null;
          }
          paramInt1 = paramParcel1.readInt();
          localObject2 = localICustomTabsCallback2;
          if (paramParcel1.readInt() != 0) {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramInt1 = receiveFile(localICustomTabsCallback1, (Uri)localObject1, paramInt1, (Bundle)localObject2);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          return true;
        case 11: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
          localICustomTabsCallback2 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          } else {
            localObject1 = null;
          }
          localObject2 = localICustomTabsCallback1;
          if (paramParcel1.readInt() != 0) {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramInt1 = requestPostMessageChannelWithExtras(localICustomTabsCallback2, (Uri)localObject1, (Bundle)localObject2);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          return true;
        case 10: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
          localObject2 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
          localObject1 = localObject6;
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramInt1 = newSessionWithExtras((ICustomTabsCallback)localObject2, (Bundle)localObject1);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          return true;
        case 9: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
          localICustomTabsCallback1 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
          paramInt1 = paramParcel1.readInt();
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          } else {
            localObject1 = null;
          }
          localObject2 = localObject3;
          if (paramParcel1.readInt() != 0) {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramInt1 = validateRelationship(localICustomTabsCallback1, paramInt1, (Uri)localObject1, (Bundle)localObject2);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          return true;
        case 8: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
          localICustomTabsCallback1 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
          localObject2 = paramParcel1.readString();
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramInt1 = postMessage(localICustomTabsCallback1, (String)localObject2, (Bundle)localObject1);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          return true;
        case 7: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
          localObject2 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
          localObject1 = localObject7;
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          }
          paramInt1 = requestPostMessageChannel((ICustomTabsCallback)localObject2, (Uri)localObject1);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          return true;
        case 6: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
          localObject2 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
          localObject1 = localObject4;
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramInt1 = updateVisuals((ICustomTabsCallback)localObject2, (Bundle)localObject1);
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          return true;
        case 5: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
          localObject2 = paramParcel1.readString();
          localObject1 = localObject5;
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramParcel1 = extraCommand((String)localObject2, (Bundle)localObject1);
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
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
          localICustomTabsCallback1 = ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
          if (paramParcel1.readInt() != 0) {
            localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          } else {
            localObject1 = null;
          }
          if (paramParcel1.readInt() != 0) {
            localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          paramInt1 = mayLaunchUrl(localICustomTabsCallback1, (Uri)localObject1, (Bundle)localObject2, paramParcel1.createTypedArrayList(Bundle.CREATOR));
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          return true;
        case 3: 
          paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
          paramInt1 = newSession(ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          paramParcel2.writeInt(paramInt1);
          return true;
        }
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        paramInt1 = warmup(paramParcel1.readLong());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      }
      paramParcel2.writeString("android.support.customtabs.ICustomTabsService");
      return true;
    }
    
    private static class Proxy
      implements ICustomTabsService
    {
      public static ICustomTabsService sDefaultImpl;
      private IBinder mRemote;
      
      Proxy(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }
      
      public IBinder asBinder()
      {
        return this.mRemote;
      }
      
      public Bundle extraCommand(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
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
          if ((!this.mRemote.transact(5, localParcel1, localParcel2, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            paramString = ICustomTabsService.Stub.getDefaultImpl().extraCommand(paramString, paramBundle);
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
      
      public String getInterfaceDescriptor()
      {
        return "android.support.customtabs.ICustomTabsService";
      }
      
      public boolean mayLaunchUrl(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          IBinder localIBinder;
          if (paramICustomTabsCallback != null) {
            localIBinder = paramICustomTabsCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel1.writeStrongBinder(localIBinder);
          boolean bool = true;
          if (paramUri != null)
          {
            localParcel1.writeInt(1);
            paramUri.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          localParcel1.writeTypedList(paramList);
          if ((!this.mRemote.transact(4, localParcel1, localParcel2, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            bool = ICustomTabsService.Stub.getDefaultImpl().mayLaunchUrl(paramICustomTabsCallback, paramUri, paramBundle, paramList);
            return bool;
          }
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i == 0) {
            bool = false;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean newSession(ICustomTabsCallback paramICustomTabsCallback)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          if (paramICustomTabsCallback != null) {
            localIBinder = paramICustomTabsCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel1.writeStrongBinder(localIBinder);
          IBinder localIBinder = this.mRemote;
          boolean bool = false;
          if ((!localIBinder.transact(3, localParcel1, localParcel2, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            bool = ICustomTabsService.Stub.getDefaultImpl().newSession(paramICustomTabsCallback);
            return bool;
          }
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean newSessionWithExtras(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          IBinder localIBinder;
          if (paramICustomTabsCallback != null) {
            localIBinder = paramICustomTabsCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel2.writeStrongBinder(localIBinder);
          boolean bool = true;
          if (paramBundle != null)
          {
            localParcel2.writeInt(1);
            paramBundle.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          if ((!this.mRemote.transact(10, localParcel2, localParcel1, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            bool = ICustomTabsService.Stub.getDefaultImpl().newSessionWithExtras(paramICustomTabsCallback, paramBundle);
            return bool;
          }
          localParcel1.readException();
          int i = localParcel1.readInt();
          if (i == 0) {
            bool = false;
          }
          return bool;
        }
        finally
        {
          localParcel1.recycle();
          localParcel2.recycle();
        }
      }
      
      public int postMessage(ICustomTabsCallback paramICustomTabsCallback, String paramString, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
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
          if ((!this.mRemote.transact(8, localParcel2, localParcel1, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            i = ICustomTabsService.Stub.getDefaultImpl().postMessage(paramICustomTabsCallback, paramString, paramBundle);
            return i;
          }
          localParcel1.readException();
          int i = localParcel1.readInt();
          return i;
        }
        finally
        {
          localParcel1.recycle();
          localParcel2.recycle();
        }
      }
      
      public boolean receiveFile(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, int paramInt, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          IBinder localIBinder;
          if (paramICustomTabsCallback != null) {
            localIBinder = paramICustomTabsCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel2.writeStrongBinder(localIBinder);
          boolean bool = true;
          if (paramUri != null)
          {
            localParcel2.writeInt(1);
            paramUri.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          localParcel2.writeInt(paramInt);
          if (paramBundle != null)
          {
            localParcel2.writeInt(1);
            paramBundle.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          if ((!this.mRemote.transact(12, localParcel2, localParcel1, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            bool = ICustomTabsService.Stub.getDefaultImpl().receiveFile(paramICustomTabsCallback, paramUri, paramInt, paramBundle);
            return bool;
          }
          localParcel1.readException();
          paramInt = localParcel1.readInt();
          if (paramInt == 0) {
            bool = false;
          }
          return bool;
        }
        finally
        {
          localParcel1.recycle();
          localParcel2.recycle();
        }
      }
      
      public boolean requestPostMessageChannel(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          IBinder localIBinder;
          if (paramICustomTabsCallback != null) {
            localIBinder = paramICustomTabsCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel2.writeStrongBinder(localIBinder);
          boolean bool = true;
          if (paramUri != null)
          {
            localParcel2.writeInt(1);
            paramUri.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          if ((!this.mRemote.transact(7, localParcel2, localParcel1, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            bool = ICustomTabsService.Stub.getDefaultImpl().requestPostMessageChannel(paramICustomTabsCallback, paramUri);
            return bool;
          }
          localParcel1.readException();
          int i = localParcel1.readInt();
          if (i == 0) {
            bool = false;
          }
          return bool;
        }
        finally
        {
          localParcel1.recycle();
          localParcel2.recycle();
        }
      }
      
      public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback paramICustomTabsCallback, Uri paramUri, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          IBinder localIBinder;
          if (paramICustomTabsCallback != null) {
            localIBinder = paramICustomTabsCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel1.writeStrongBinder(localIBinder);
          boolean bool = true;
          if (paramUri != null)
          {
            localParcel1.writeInt(1);
            paramUri.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if ((!this.mRemote.transact(11, localParcel1, localParcel2, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            bool = ICustomTabsService.Stub.getDefaultImpl().requestPostMessageChannelWithExtras(paramICustomTabsCallback, paramUri, paramBundle);
            return bool;
          }
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i == 0) {
            bool = false;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean updateVisuals(ICustomTabsCallback paramICustomTabsCallback, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          IBinder localIBinder;
          if (paramICustomTabsCallback != null) {
            localIBinder = paramICustomTabsCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel1.writeStrongBinder(localIBinder);
          boolean bool = true;
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          else
          {
            localParcel1.writeInt(0);
          }
          if ((!this.mRemote.transact(6, localParcel1, localParcel2, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            bool = ICustomTabsService.Stub.getDefaultImpl().updateVisuals(paramICustomTabsCallback, paramBundle);
            return bool;
          }
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i == 0) {
            bool = false;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean validateRelationship(ICustomTabsCallback paramICustomTabsCallback, int paramInt, Uri paramUri, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          IBinder localIBinder;
          if (paramICustomTabsCallback != null) {
            localIBinder = paramICustomTabsCallback.asBinder();
          } else {
            localIBinder = null;
          }
          localParcel2.writeStrongBinder(localIBinder);
          localParcel2.writeInt(paramInt);
          boolean bool = true;
          if (paramUri != null)
          {
            localParcel2.writeInt(1);
            paramUri.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          if (paramBundle != null)
          {
            localParcel2.writeInt(1);
            paramBundle.writeToParcel(localParcel2, 0);
          }
          else
          {
            localParcel2.writeInt(0);
          }
          if ((!this.mRemote.transact(9, localParcel2, localParcel1, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            bool = ICustomTabsService.Stub.getDefaultImpl().validateRelationship(paramICustomTabsCallback, paramInt, paramUri, paramBundle);
            return bool;
          }
          localParcel1.readException();
          paramInt = localParcel1.readInt();
          if (paramInt == 0) {
            bool = false;
          }
          return bool;
        }
        finally
        {
          localParcel1.recycle();
          localParcel2.recycle();
        }
      }
      
      public boolean warmup(long paramLong)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          localParcel2.writeLong(paramLong);
          IBinder localIBinder = this.mRemote;
          boolean bool = false;
          if ((!localIBinder.transact(2, localParcel2, localParcel1, 0)) && (ICustomTabsService.Stub.getDefaultImpl() != null))
          {
            bool = ICustomTabsService.Stub.getDefaultImpl().warmup(paramLong);
            return bool;
          }
          localParcel1.readException();
          int i = localParcel1.readInt();
          if (i != 0) {
            bool = true;
          }
          return bool;
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\android\support\customtabs\ICustomTabsService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */