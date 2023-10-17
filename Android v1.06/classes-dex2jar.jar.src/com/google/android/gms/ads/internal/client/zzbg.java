package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

public abstract class zzbg
  extends zzatp
  implements zzbh
{
  public zzbg()
  {
    super("com.google.android.gms.ads.internal.client.IAdListener");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 9: 
      zzk();
      break;
    case 8: 
      zze localzze = (zze)zzatq.zza(paramParcel1, zze.CREATOR);
      zzatq.zzc(paramParcel1);
      zzf(localzze);
      break;
    case 7: 
      zzg();
      break;
    case 6: 
      zzc();
      break;
    case 5: 
      zzj();
      break;
    case 4: 
      zzi();
      break;
    case 2: 
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      zze(paramInt1);
      break;
    case 1: 
      zzd();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */