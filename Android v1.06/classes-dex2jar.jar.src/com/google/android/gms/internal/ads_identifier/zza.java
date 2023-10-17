package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zza
  implements IInterface
{
  private final IBinder zza;
  private final String zzb;
  
  protected zza(IBinder paramIBinder, String paramString)
  {
    this.zza = paramIBinder;
    this.zzb = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
  }
  
  public final IBinder asBinder()
  {
    return this.zza;
  }
  
  protected final Parcel zza()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(this.zzb);
    return localParcel;
  }
  
  /* Error */
  protected final Parcel zzb(int paramInt, Parcel paramParcel)
    throws android.os.RemoteException
  {
    // Byte code:
    //   0: invokestatic 30	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: aload_0
    //   6: getfield 17	com/google/android/gms/internal/ads_identifier/zza:zza	Landroid/os/IBinder;
    //   9: iload_1
    //   10: aload_2
    //   11: aload 4
    //   13: iconst_0
    //   14: invokeinterface 45 5 0
    //   19: pop
    //   20: aload 4
    //   22: invokevirtual 48	android/os/Parcel:readException	()V
    //   25: aload_2
    //   26: invokevirtual 51	android/os/Parcel:recycle	()V
    //   29: aload 4
    //   31: areturn
    //   32: astore_3
    //   33: goto +11 -> 44
    //   36: astore_3
    //   37: aload 4
    //   39: invokevirtual 51	android/os/Parcel:recycle	()V
    //   42: aload_3
    //   43: athrow
    //   44: aload_2
    //   45: invokevirtual 51	android/os/Parcel:recycle	()V
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
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads_identifier\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */