package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

public abstract class zzbjv
  extends zzatp
  implements zzbjw
{
  public zzbjv()
  {
    super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      paramParcel2 = (ParcelFileDescriptor)zzatq.zza(paramParcel1, ParcelFileDescriptor.CREATOR);
      zzatq.zzc(paramParcel1);
      zzb(paramParcel2);
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbjv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */