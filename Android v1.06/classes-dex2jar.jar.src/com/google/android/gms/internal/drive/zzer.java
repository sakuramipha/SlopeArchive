package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.zza;

public abstract class zzer
  extends zzb
  implements zzeq
{
  public zzer()
  {
    super("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    switch (paramInt1)
    {
    case 10: 
    case 19: 
    default: 
      return false;
    case 22: 
      zza((zzgf)zzc.zza(paramParcel1, zzgf.CREATOR));
      break;
    case 21: 
      zza((zzgz)zzc.zza(paramParcel1, zzgz.CREATOR));
      break;
    case 20: 
      zza((zzem)zzc.zza(paramParcel1, zzem.CREATOR));
      break;
    case 18: 
      zza((zzff)zzc.zza(paramParcel1, zzff.CREATOR));
      break;
    case 17: 
      zza((zza)zzc.zza(paramParcel1, zza.CREATOR));
      break;
    case 16: 
      zza((zzfr)zzc.zza(paramParcel1, zzfr.CREATOR));
      break;
    case 15: 
      zzb(zzc.zza(paramParcel1));
      break;
    case 14: 
      zza((zzfj)zzc.zza(paramParcel1, zzfj.CREATOR));
      break;
    case 13: 
      zza((zzga)zzc.zza(paramParcel1, zzga.CREATOR));
      break;
    case 12: 
      zza((zzgd)zzc.zza(paramParcel1, zzgd.CREATOR));
      break;
    case 11: 
      zza((zzfx)zzc.zza(paramParcel1, zzfx.CREATOR), zzip.zzb(paramParcel1.readStrongBinder()));
      break;
    case 9: 
      zza((zzgh)zzc.zza(paramParcel1, zzgh.CREATOR));
      break;
    case 8: 
      zza((zzfv)zzc.zza(paramParcel1, zzfv.CREATOR));
      break;
    case 7: 
      onSuccess();
      break;
    case 6: 
      zza((Status)zzc.zza(paramParcel1, Status.CREATOR));
      break;
    case 5: 
      zza((zzfh)zzc.zza(paramParcel1, zzfh.CREATOR));
      break;
    case 4: 
      zza((zzfy)zzc.zza(paramParcel1, zzfy.CREATOR));
      break;
    case 3: 
      zza((zzfn)zzc.zza(paramParcel1, zzfn.CREATOR));
      break;
    case 2: 
      zza((zzft)zzc.zza(paramParcel1, zzft.CREATOR));
      break;
    case 1: 
      zza((zzfl)zzc.zza(paramParcel1, zzfl.CREATOR));
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */