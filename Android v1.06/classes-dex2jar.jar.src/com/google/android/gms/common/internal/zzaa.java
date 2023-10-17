package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzaa
  extends zza
  implements IGmsCallbacks
{
  zzaa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
  }
  
  public final void onPostInitComplete(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeInt(paramInt);
    localParcel.writeStrongBinder(paramIBinder);
    zzc.zzc(localParcel, paramBundle);
    zzC(1, localParcel);
  }
  
  public final void zzb(int paramInt, Bundle paramBundle)
    throws RemoteException
  {
    throw null;
  }
  
  public final void zzc(int paramInt, IBinder paramIBinder, zzj paramzzj)
    throws RemoteException
  {
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */