package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zad
  extends zab
  implements zae
{
  public zad()
  {
    super("com.google.android.gms.signin.internal.ISignInCallbacks");
  }
  
  protected final boolean zaa(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    switch (paramInt1)
    {
    case 5: 
    default: 
      return false;
    case 9: 
      paramParcel1 = (zag)zac.zaa(paramParcel1, zag.CREATOR);
      break;
    case 8: 
      zab((zak)zac.zaa(paramParcel1, zak.CREATOR));
      break;
    case 7: 
      localObject = (Status)zac.zaa(paramParcel1, Status.CREATOR);
      paramParcel1 = (GoogleSignInAccount)zac.zaa(paramParcel1, GoogleSignInAccount.CREATOR);
      break;
    case 6: 
      paramParcel1 = (Status)zac.zaa(paramParcel1, Status.CREATOR);
      break;
    case 4: 
      paramParcel1 = (Status)zac.zaa(paramParcel1, Status.CREATOR);
      break;
    case 3: 
      localObject = (ConnectionResult)zac.zaa(paramParcel1, ConnectionResult.CREATOR);
      paramParcel1 = (zaa)zac.zaa(paramParcel1, zaa.CREATOR);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\signin\internal\zad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */