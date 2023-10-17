package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbfg
  extends zzatp
  implements zzbfh
{
  public zzbfg()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Bundle localBundle;
    switch (paramInt1)
    {
    default: 
      return false;
    case 17: 
      paramParcel1 = zzl();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 16: 
      paramParcel1 = zzf();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 15: 
      paramParcel1 = zzd();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 14: 
      localBundle = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzp(localBundle);
      paramParcel2.writeNoException();
      break;
    case 13: 
      localBundle = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      paramInt1 = zzq(localBundle);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      break;
    case 12: 
      localBundle = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzo(localBundle);
      paramParcel2.writeNoException();
      break;
    case 11: 
      paramParcel1 = zzc();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 10: 
      zzn();
      paramParcel2.writeNoException();
      break;
    case 9: 
      paramParcel1 = zzb();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 8: 
      paramParcel1 = zzh();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 7: 
      paramParcel1 = zzj();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 6: 
      paramParcel1 = zze();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 5: 
      paramParcel1 = zzi();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 4: 
      paramParcel1 = zzm();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
      break;
    case 3: 
      paramParcel1 = zzk();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 2: 
      paramParcel1 = zzg();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbfg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */