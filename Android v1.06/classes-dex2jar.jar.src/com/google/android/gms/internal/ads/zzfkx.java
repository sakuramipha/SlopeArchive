package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzfkx
  extends zzatp
  implements zzfky
{
  public zzfkx()
  {
    super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 8: 
      IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readString();
      paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      break;
    case 7: 
      paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      break;
    case 6: 
      paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      break;
    case 5: 
      paramParcel1.createByteArray();
      zzatq.zzc(paramParcel1);
      break;
    case 4: 
      paramParcel1.createIntArray();
      zzatq.zzc(paramParcel1);
      break;
    case 2: 
      IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      paramParcel1.readString();
      zzatq.zzc(paramParcel1);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfkx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */