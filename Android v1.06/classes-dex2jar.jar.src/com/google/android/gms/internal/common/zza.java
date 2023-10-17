package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza
  implements IInterface
{
  private final IBinder zza;
  private final String zzb;
  
  protected zza(IBinder paramIBinder, String paramString)
  {
    this.zza = paramIBinder;
    this.zzb = paramString;
  }
  
  public final IBinder asBinder()
  {
    return this.zza;
  }
  
  /* Error */
  protected final Parcel zzB(int paramInt, Parcel paramParcel)
    throws RemoteException
  {
    // Byte code:
    //   0: invokestatic 34	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: aload_0
    //   6: getfield 17	com/google/android/gms/internal/common/zza:zza	Landroid/os/IBinder;
    //   9: iload_1
    //   10: aload_2
    //   11: aload 4
    //   13: iconst_0
    //   14: invokeinterface 40 5 0
    //   19: pop
    //   20: aload 4
    //   22: invokevirtual 43	android/os/Parcel:readException	()V
    //   25: aload_2
    //   26: invokevirtual 46	android/os/Parcel:recycle	()V
    //   29: aload 4
    //   31: areturn
    //   32: astore_3
    //   33: goto +11 -> 44
    //   36: astore_3
    //   37: aload 4
    //   39: invokevirtual 46	android/os/Parcel:recycle	()V
    //   42: aload_3
    //   43: athrow
    //   44: aload_2
    //   45: invokevirtual 46	android/os/Parcel:recycle	()V
    //   48: aload_3
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	zza
    //   0	50	1	paramInt	int
    //   0	50	2	paramParcel	Parcel
    //   32	1	3	localObject	Object
    //   36	13	3	localRuntimeException	RuntimeException
    //   3	35	4	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   5	25	32	finally
    //   37	44	32	finally
    //   5	25	36	java/lang/RuntimeException
  }
  
  protected final void zzC(int paramInt, Parcel paramParcel)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      this.zza.transact(1, paramParcel, localParcel, 0);
      localParcel.readException();
      return;
    }
    finally
    {
      paramParcel.recycle();
      localParcel.recycle();
    }
  }
  
  protected final void zzD(int paramInt, Parcel paramParcel)
    throws RemoteException
  {
    try
    {
      this.zza.transact(2, paramParcel, null, 1);
      return;
    }
    finally
    {
      paramParcel.recycle();
    }
  }
  
  protected final Parcel zza()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(this.zzb);
    return localParcel;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */