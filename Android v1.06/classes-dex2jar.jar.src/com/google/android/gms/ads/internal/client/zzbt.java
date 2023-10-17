package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzbvc;

public abstract class zzbt
  extends zzatp
  implements zzbu
{
  public zzbt()
  {
    super("com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  public static zzbu zzac(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
    if ((localIInterface instanceof zzbu)) {
      return (zzbu)localIInterface;
    }
    return new zzbs(paramIBinder);
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1 = null;
    Object localObject6 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject3 = null;
    IBinder localIBinder = null;
    Object localObject2 = null;
    Object localObject7 = null;
    boolean bool;
    switch (paramInt1)
    {
    case 16: 
    case 17: 
    case 27: 
    case 28: 
    default: 
      return false;
    case 45: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject7;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        if ((localObject2 instanceof zzci)) {
          localObject1 = (zzci)localObject2;
        } else {
          localObject1 = new zzcg((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzJ((zzci)localObject1);
      paramParcel2.writeNoException();
      break;
    case 44: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzW((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 43: 
      localObject2 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localIBinder = paramParcel1.readStrongBinder();
      if (localIBinder != null)
      {
        localObject1 = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
        if ((localObject1 instanceof zzbk)) {
          localObject1 = (zzbk)localObject1;
        } else {
          localObject1 = new zzbi(localIBinder);
        }
      }
      zzatq.zzc(paramParcel1);
      zzy((zzl)localObject2, (zzbk)localObject1);
      paramParcel2.writeNoException();
      break;
    case 42: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject6;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if ((localObject2 instanceof zzdg)) {
          localObject1 = (zzdg)localObject2;
        } else {
          localObject1 = new zzde((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzP((zzdg)localObject1);
      paramParcel2.writeNoException();
      break;
    case 41: 
      paramParcel1 = zzk();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 40: 
      localObject1 = zzavt.zze(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzH((zzavu)localObject1);
      paramParcel2.writeNoException();
      break;
    case 39: 
      localObject1 = (zzw)zzatq.zza(paramParcel1, zzw.CREATOR);
      zzatq.zzc(paramParcel1);
      zzI((zzw)localObject1);
      paramParcel2.writeNoException();
      break;
    case 38: 
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzR((String)localObject1);
      paramParcel2.writeNoException();
      break;
    case 37: 
      paramParcel1 = zzd();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 36: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject4;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        if ((localObject2 instanceof zzby)) {
          localObject1 = (zzby)localObject2;
        } else {
          localObject1 = new zzbw((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzE((zzby)localObject1);
      paramParcel2.writeNoException();
      break;
    case 35: 
      paramParcel1 = zzt();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 34: 
      bool = zzatq.zzg(paramParcel1);
      zzatq.zzc(paramParcel1);
      zzL(bool);
      paramParcel2.writeNoException();
      break;
    case 33: 
      paramParcel1 = zzi();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 32: 
      paramParcel1 = zzj();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 31: 
      paramParcel1 = zzr();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 30: 
      localObject1 = (zzdu)zzatq.zza(paramParcel1, zzdu.CREATOR);
      zzatq.zzc(paramParcel1);
      zzK((zzdu)localObject1);
      paramParcel2.writeNoException();
      break;
    case 29: 
      localObject1 = (zzfl)zzatq.zza(paramParcel1, zzfl.CREATOR);
      zzatq.zzc(paramParcel1);
      zzU((zzfl)localObject1);
      paramParcel2.writeNoException();
      break;
    case 26: 
      paramParcel1 = zzl();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 25: 
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzT((String)localObject1);
      paramParcel2.writeNoException();
      break;
    case 24: 
      localObject1 = zzbvb.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzS((zzbvc)localObject1);
      paramParcel2.writeNoException();
      break;
    case 23: 
      paramInt2 = zzY();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
      break;
    case 22: 
      bool = zzatq.zzg(paramParcel1);
      zzatq.zzc(paramParcel1);
      zzN(bool);
      paramParcel2.writeNoException();
      break;
    case 21: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject5;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        if ((localObject2 instanceof zzcf)) {
          localObject1 = (zzcf)localObject2;
        } else {
          localObject1 = new zzcf((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzab((zzcf)localObject1);
      paramParcel2.writeNoException();
      break;
    case 20: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject3;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
        if ((localObject2 instanceof zzbe)) {
          localObject1 = (zzbe)localObject2;
        } else {
          localObject1 = new zzbc((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzC((zzbe)localObject1);
      paramParcel2.writeNoException();
      break;
    case 19: 
      localObject1 = zzbch.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzO((zzbci)localObject1);
      paramParcel2.writeNoException();
      break;
    case 18: 
      paramParcel1 = zzs();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 15: 
      localObject1 = zzbsg.zzb(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzQ((zzbsh)localObject1, (String)localObject2);
      paramParcel2.writeNoException();
      break;
    case 14: 
      localObject1 = zzbsd.zzb(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzM((zzbse)localObject1);
      paramParcel2.writeNoException();
      break;
    case 13: 
      localObject1 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
      zzatq.zzc(paramParcel1);
      zzF((zzq)localObject1);
      paramParcel2.writeNoException();
      break;
    case 12: 
      paramParcel1 = zzg();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 11: 
      zzA();
      paramParcel2.writeNoException();
      break;
    case 10: 
      paramParcel2.writeNoException();
      break;
    case 9: 
      zzX();
      paramParcel2.writeNoException();
      break;
    case 8: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localIBinder;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if ((localObject2 instanceof zzcb)) {
          localObject1 = (zzcb)localObject2;
        } else {
          localObject1 = new zzbz((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzG((zzcb)localObject1);
      paramParcel2.writeNoException();
      break;
    case 7: 
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
        if ((localObject2 instanceof zzbh)) {
          localObject1 = (zzbh)localObject2;
        } else {
          localObject1 = new zzbf((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzD((zzbh)localObject1);
      paramParcel2.writeNoException();
      break;
    case 6: 
      zzB();
      paramParcel2.writeNoException();
      break;
    case 5: 
      zzz();
      paramParcel2.writeNoException();
      break;
    case 4: 
      localObject1 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      zzatq.zzc(paramParcel1);
      paramInt1 = zzaa((zzl)localObject1);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      break;
    case 3: 
      paramInt2 = zzZ();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
      break;
    case 2: 
      zzx();
      paramParcel2.writeNoException();
      break;
    case 1: 
      paramParcel1 = zzn();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */