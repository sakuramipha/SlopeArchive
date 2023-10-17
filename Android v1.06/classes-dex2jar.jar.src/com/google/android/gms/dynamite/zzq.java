package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzq
  extends zza
  implements IInterface
{
  zzq(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
  }
  
  public final int zze()
    throws RemoteException
  {
    Parcel localParcel = zzB(6, zza());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final int zzf(IObjectWrapper paramIObjectWrapper, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    zzc.zzb(localParcel, paramBoolean);
    paramIObjectWrapper = zzB(3, localParcel);
    int i = paramIObjectWrapper.readInt();
    paramIObjectWrapper.recycle();
    return i;
  }
  
  public final int zzg(IObjectWrapper paramIObjectWrapper, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    zzc.zzb(localParcel, paramBoolean);
    paramIObjectWrapper = zzB(5, localParcel);
    int i = paramIObjectWrapper.readInt();
    paramIObjectWrapper.recycle();
    return i;
  }
  
  public final IObjectWrapper zzh(IObjectWrapper paramIObjectWrapper, String paramString, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    paramIObjectWrapper = zzB(2, localParcel);
    paramString = IObjectWrapper.Stub.asInterface(paramIObjectWrapper.readStrongBinder());
    paramIObjectWrapper.recycle();
    return paramString;
  }
  
  public final IObjectWrapper zzi(IObjectWrapper paramIObjectWrapper1, String paramString, int paramInt, IObjectWrapper paramIObjectWrapper2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper1);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    zzc.zze(localParcel, paramIObjectWrapper2);
    paramIObjectWrapper1 = zzB(8, localParcel);
    paramString = IObjectWrapper.Stub.asInterface(paramIObjectWrapper1.readStrongBinder());
    paramIObjectWrapper1.recycle();
    return paramString;
  }
  
  public final IObjectWrapper zzj(IObjectWrapper paramIObjectWrapper, String paramString, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    paramIObjectWrapper = zzB(4, localParcel);
    paramString = IObjectWrapper.Stub.asInterface(paramIObjectWrapper.readStrongBinder());
    paramIObjectWrapper.recycle();
    return paramString;
  }
  
  public final IObjectWrapper zzk(IObjectWrapper paramIObjectWrapper, String paramString, boolean paramBoolean, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    zzc.zzb(localParcel, paramBoolean);
    localParcel.writeLong(paramLong);
    paramIObjectWrapper = zzB(7, localParcel);
    paramString = IObjectWrapper.Stub.asInterface(paramIObjectWrapper.readStrongBinder());
    paramIObjectWrapper.recycle();
    return paramString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamite\zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */