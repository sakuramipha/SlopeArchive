package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface ITrustedWebActivityCallback
  extends IInterface
{
  public abstract void onExtraCallback(String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public static class Default
    implements ITrustedWebActivityCallback
  {
    public IBinder asBinder()
    {
      return null;
    }
    
    public void onExtraCallback(String paramString, Bundle paramBundle)
      throws RemoteException
    {}
  }
  
  public static abstract class Stub
    extends Binder
    implements ITrustedWebActivityCallback
  {
    private static final String DESCRIPTOR = "android.support.customtabs.trusted.ITrustedWebActivityCallback";
    static final int TRANSACTION_onExtraCallback = 2;
    
    public Stub()
    {
      attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityCallback");
    }
    
    public static ITrustedWebActivityCallback asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
      if ((localIInterface != null) && ((localIInterface instanceof ITrustedWebActivityCallback))) {
        return (ITrustedWebActivityCallback)localIInterface;
      }
      return new Proxy(paramIBinder);
    }
    
    public static ITrustedWebActivityCallback getDefaultImpl()
    {
      return Proxy.sDefaultImpl;
    }
    
    public static boolean setDefaultImpl(ITrustedWebActivityCallback paramITrustedWebActivityCallback)
    {
      if (Proxy.sDefaultImpl == null)
      {
        if (paramITrustedWebActivityCallback != null)
        {
          Proxy.sDefaultImpl = paramITrustedWebActivityCallback;
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
      if (paramInt1 != 2)
      {
        if (paramInt1 != 1598968902) {
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        }
        paramParcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityCallback");
        return true;
      }
      paramParcel1.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
      String str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      } else {
        paramParcel1 = null;
      }
      onExtraCallback(str, paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
    
    private static class Proxy
      implements ITrustedWebActivityCallback
    {
      public static ITrustedWebActivityCallback sDefaultImpl;
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
        return "android.support.customtabs.trusted.ITrustedWebActivityCallback";
      }
      
      public void onExtraCallback(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        try
        {
          localParcel2.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityCallback");
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
          if ((!this.mRemote.transact(2, localParcel2, localParcel1, 0)) && (ITrustedWebActivityCallback.Stub.getDefaultImpl() != null))
          {
            ITrustedWebActivityCallback.Stub.getDefaultImpl().onExtraCallback(paramString, paramBundle);
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\android\support\customtabs\trusted\ITrustedWebActivityCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */