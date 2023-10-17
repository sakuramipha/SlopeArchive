package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface IGmsServiceBroker
  extends IInterface
{
  public abstract void getService(IGmsCallbacks paramIGmsCallbacks, GetServiceRequest paramGetServiceRequest)
    throws RemoteException;
  
  public static abstract class Stub
    extends Binder
    implements IGmsServiceBroker
  {
    public Stub()
    {
      attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      if (paramInt1 > 16777215) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      IBinder localIBinder = paramParcel1.readStrongBinder();
      GetServiceRequest localGetServiceRequest = null;
      Object localObject;
      if (localIBinder == null)
      {
        localObject = null;
      }
      else
      {
        localObject = localIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
        if ((localObject instanceof IGmsCallbacks)) {
          localObject = (IGmsCallbacks)localObject;
        } else {
          localObject = new zzaa(localIBinder);
        }
      }
      if (paramInt1 == 46)
      {
        if (paramParcel1.readInt() != 0) {
          localGetServiceRequest = (GetServiceRequest)GetServiceRequest.CREATOR.createFromParcel(paramParcel1);
        }
        getService((IGmsCallbacks)localObject, localGetServiceRequest);
        Preconditions.checkNotNull(paramParcel2);
        paramParcel2.writeNoException();
        return true;
      }
      if (paramInt1 == 47)
      {
        if (paramParcel1.readInt() != 0) {
          paramParcel1 = (zzaj)zzaj.CREATOR.createFromParcel(paramParcel1);
        }
        throw new UnsupportedOperationException();
      }
      paramParcel1.readInt();
      if (paramInt1 != 4)
      {
        paramParcel1.readString();
        if (paramInt1 != 1)
        {
          if ((paramInt1 != 2) && (paramInt1 != 23) && (paramInt1 != 25) && (paramInt1 != 27)) {
            if (paramInt1 != 30) {
              if (paramInt1 != 34) {
                if ((paramInt1 == 41) || (paramInt1 == 43) || (paramInt1 == 37) || (paramInt1 == 38)) {
                  break label453;
                }
              }
            }
          }
          switch (paramInt1)
          {
          default: 
            break;
          case 19: 
            paramParcel1.readStrongBinder();
            if (paramParcel1.readInt() == 0) {
              break;
            }
            paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            break;
          case 10: 
            paramParcel1.readString();
            paramParcel1.createStringArray();
            break;
          case 9: 
            paramParcel1.readString();
            paramParcel1.createStringArray();
            paramParcel1.readString();
            paramParcel1.readStrongBinder();
            paramParcel1.readString();
            if (paramParcel1.readInt() == 0) {
              break;
            }
            paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            break;
            paramParcel1.readString();
            break;
          case 20: 
            paramParcel1.createStringArray();
            paramParcel1.readString();
            if (paramParcel1.readInt() == 0) {
              break;
            }
            paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            break;
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 11: 
          case 12: 
          case 13: 
          case 14: 
          case 15: 
          case 16: 
          case 17: 
          case 18: 
            label453:
            if (paramParcel1.readInt() == 0) {
              break;
            }
            paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
            break;
          }
        }
        else
        {
          paramParcel1.readString();
          paramParcel1.createStringArray();
          paramParcel1.readString();
          if (paramParcel1.readInt() != 0) {
            paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
        }
      }
      throw new UnsupportedOperationException();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\IGmsServiceBroker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */