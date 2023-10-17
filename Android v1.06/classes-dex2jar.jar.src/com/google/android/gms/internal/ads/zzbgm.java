package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;

public abstract class zzbgm
  extends zzatp
  implements zzbgn
{
  public zzbgm()
  {
    super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return false;
    case 32: 
      localObject = zzdf.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzE((zzdg)localObject);
      paramParcel2.writeNoException();
      break;
    case 31: 
      paramParcel1 = zzg();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 30: 
      paramInt1 = zzG();
      paramParcel2.writeNoException();
      paramInt2 = zzatq.zza;
      paramParcel2.writeInt(paramInt1);
      break;
    case 29: 
      paramParcel1 = zzj();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 28: 
      zzA();
      paramParcel2.writeNoException();
      break;
    case 27: 
      zzC();
      paramParcel2.writeNoException();
      break;
    case 26: 
      localObject = zzcr.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzD((zzcs)localObject);
      paramParcel2.writeNoException();
      break;
    case 25: 
      localObject = zzcv.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzy((zzcw)localObject);
      paramParcel2.writeNoException();
      break;
    case 24: 
      paramInt2 = zzH();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
      break;
    case 23: 
      paramParcel1 = zzv();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
      break;
    case 22: 
      zzw();
      paramParcel2.writeNoException();
      break;
    case 21: 
      localObject = paramParcel1.readStrongBinder();
      if (localObject == null)
      {
        localObject = null;
      }
      else
      {
        IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
        if ((localIInterface instanceof zzbgk)) {
          localObject = (zzbgk)localIInterface;
        } else {
          localObject = new zzbgi((IBinder)localObject);
        }
      }
      zzatq.zzc(paramParcel1);
      zzF((zzbgk)localObject);
      paramParcel2.writeNoException();
      break;
    case 20: 
      paramParcel1 = zzf();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 19: 
      paramParcel1 = zzl();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 18: 
      paramParcel1 = zzm();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 17: 
      localObject = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzB((Bundle)localObject);
      paramParcel2.writeNoException();
      break;
    case 16: 
      localObject = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      paramInt1 = zzI((Bundle)localObject);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      break;
    case 15: 
      localObject = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzz((Bundle)localObject);
      paramParcel2.writeNoException();
      break;
    case 14: 
      paramParcel1 = zzi();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 13: 
      zzx();
      paramParcel2.writeNoException();
      break;
    case 12: 
      paramParcel1 = zzr();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 11: 
      paramParcel1 = zzh();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 10: 
      paramParcel1 = zzs();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 9: 
      paramParcel1 = zzt();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 8: 
      double d = zze();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      break;
    case 7: 
      paramParcel1 = zzn();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 6: 
      paramParcel1 = zzp();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 5: 
      paramParcel1 = zzk();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 4: 
      paramParcel1 = zzo();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 3: 
      paramParcel1 = zzu();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
      break;
    case 2: 
      paramParcel1 = zzq();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbgm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */