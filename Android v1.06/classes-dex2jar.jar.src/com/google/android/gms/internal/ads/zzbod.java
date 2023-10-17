package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public abstract class zzbod
  extends zzatp
  implements zzboe
{
  public zzbod()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }
  
  public static zzboe zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    if ((localIInterface instanceof zzboe)) {
      return (zzboe)localIInterface;
    }
    return new zzboc(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return false;
    case 24: 
      localObject = (zze)zzatq.zza(paramParcel1, zze.CREATOR);
      zzatq.zzc(paramParcel1);
      zzk((zze)localObject);
      break;
    case 23: 
      localObject = (zze)zzatq.zza(paramParcel1, zze.CREATOR);
      zzatq.zzc(paramParcel1);
      zzh((zze)localObject);
      break;
    case 22: 
      paramInt1 = paramParcel1.readInt();
      localObject = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzi(paramInt1, (String)localObject);
      break;
    case 21: 
      localObject = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzl((String)localObject);
      break;
    case 20: 
      zzx();
      break;
    case 19: 
      localObject = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      break;
    case 18: 
      zzu();
      break;
    case 17: 
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      zzj(paramInt1);
      break;
    case 16: 
      localObject = zzbvl.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzt((zzbvm)localObject);
      break;
    case 15: 
      zzw();
      break;
    case 14: 
      localObject = (zzbvi)zzatq.zza(paramParcel1, zzbvi.CREATOR);
      zzatq.zzc(paramParcel1);
      zzs((zzbvi)localObject);
      break;
    case 13: 
      zzy();
      break;
    case 12: 
      paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      break;
    case 11: 
      zzv();
      break;
    case 10: 
      zzbfj.zzb(paramParcel1.readStrongBinder());
      paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      break;
    case 9: 
      String str = paramParcel1.readString();
      localObject = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzq(str, (String)localObject);
      break;
    case 8: 
      zzm();
      break;
    case 7: 
      localObject = paramParcel1.readStrongBinder();
      if (localObject != null)
      {
        localObject = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
        if ((localObject instanceof zzboi)) {
          localObject = (zzboi)localObject;
        }
      }
      zzatq.zzc(paramParcel1);
      break;
    case 6: 
      zzo();
      break;
    case 5: 
      zzp();
      break;
    case 4: 
      zzn();
      break;
    case 3: 
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      zzg(paramInt1);
      break;
    case 2: 
      zzf();
      break;
    case 1: 
      zze();
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */