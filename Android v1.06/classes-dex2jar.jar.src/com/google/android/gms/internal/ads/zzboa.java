package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public abstract class zzboa
  extends zzatp
  implements zzbob
{
  public zzboa()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject3 = null;
    Object localObject5 = null;
    Object localObject2 = null;
    Object localObject9 = null;
    Object localObject4 = null;
    Object localObject6 = null;
    switch (paramInt1)
    {
    case 29: 
    default: 
      return false;
    case 39: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzH((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 38: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject4 = paramParcel1.readString();
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject6;
      }
      else
      {
        localObject5 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject5 instanceof zzboe)) {
          localObject1 = (zzboe)localObject5;
        } else {
          localObject1 = new zzboc((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzt((IObjectWrapper)localObject2, (zzl)localObject3, (String)localObject4, (zzboe)localObject1);
      paramParcel2.writeNoException();
      break;
    case 37: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzJ((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 36: 
      paramParcel1 = zzj();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 35: 
      localObject5 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject2 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
      localObject6 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject3 = paramParcel1.readString();
      localObject4 = paramParcel1.readString();
      localObject7 = paramParcel1.readStrongBinder();
      if (localObject7 != null) {
        for (;;)
        {
          localObject1 = ((IBinder)localObject7).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
          if ((localObject1 instanceof zzboe)) {
            localObject1 = (zzboe)localObject1;
          } else {
            localObject1 = new zzboc((IBinder)localObject7);
          }
        }
      }
      zzatq.zzc(paramParcel1);
      zzw((IObjectWrapper)localObject5, (zzq)localObject2, (zzl)localObject6, (String)localObject3, (String)localObject4, (zzboe)localObject1);
      paramParcel2.writeNoException();
      break;
    case 34: 
      paramParcel1 = zzm();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 33: 
      paramParcel1 = zzl();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 32: 
      localObject4 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject7;
      }
      else
      {
        localObject5 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject5 instanceof zzboe)) {
          localObject1 = (zzboe)localObject5;
        } else {
          localObject1 = new zzboc((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzC((IObjectWrapper)localObject4, (zzl)localObject3, (String)localObject2, (zzboe)localObject1);
      paramParcel2.writeNoException();
      break;
    case 31: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject1 = zzbkh.zzb(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.createTypedArrayList(zzbko.CREATOR);
      zzatq.zzc(paramParcel1);
      zzq((IObjectWrapper)localObject2, (zzbki)localObject1, (List)localObject3);
      paramParcel2.writeNoException();
      break;
    case 30: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzK((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 28: 
      localObject3 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject4 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject8;
      }
      else
      {
        localObject5 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject5 instanceof zzboe)) {
          localObject1 = (zzboe)localObject5;
        } else {
          localObject1 = new zzboc((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzA((IObjectWrapper)localObject3, (zzl)localObject4, (String)localObject2, (zzboe)localObject1);
      paramParcel2.writeNoException();
      break;
    case 27: 
      paramParcel1 = zzk();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 26: 
      paramParcel1 = zzh();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 25: 
      boolean bool = zzatq.zzg(paramParcel1);
      zzatq.zzc(paramParcel1);
      zzG(bool);
      paramParcel2.writeNoException();
      break;
    case 24: 
      paramParcel1 = zzi();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 23: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = zzbvg.zzb(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.createStringArrayList();
      zzatq.zzc(paramParcel1);
      zzr((IObjectWrapper)localObject2, (zzbvh)localObject3, (List)localObject1);
      paramParcel2.writeNoException();
      break;
    case 22: 
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(0);
      break;
    case 21: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzD((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 20: 
      localObject2 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject3 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzB((zzl)localObject2, (String)localObject3, (String)localObject1);
      paramParcel2.writeNoException();
      break;
    case 19: 
      paramParcel1 = zzg();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 18: 
      paramParcel1 = zzf();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 17: 
      paramParcel1 = zze();
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 16: 
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, null);
      break;
    case 15: 
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, null);
      break;
    case 14: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject6 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject4 = paramParcel1.readString();
      localObject5 = paramParcel1.readString();
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null) {
        localObject1 = localObject3;
      }
      for (;;)
      {
        break;
        localObject3 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject3 instanceof zzboe)) {
          localObject1 = (zzboe)localObject3;
        } else {
          localObject1 = new zzboc((IBinder)localObject1);
        }
      }
      localObject7 = (zzbee)zzatq.zza(paramParcel1, zzbee.CREATOR);
      localObject3 = paramParcel1.createStringArrayList();
      zzatq.zzc(paramParcel1);
      zzz((IObjectWrapper)localObject2, (zzl)localObject6, (String)localObject4, (String)localObject5, (zzboe)localObject1, (zzbee)localObject7, (List)localObject3);
      paramParcel2.writeNoException();
      break;
    case 13: 
      paramInt2 = zzN();
      paramParcel2.writeNoException();
      paramInt1 = zzatq.zza;
      paramParcel2.writeInt(paramInt2);
      break;
    case 12: 
      zzL();
      paramParcel2.writeNoException();
      break;
    case 11: 
      localObject2 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzs((zzl)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      break;
    case 10: 
      localObject4 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject5 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject2 = paramParcel1.readString();
      localObject1 = zzbvg.zzb(paramParcel1.readStrongBinder());
      localObject3 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzp((IObjectWrapper)localObject4, (zzl)localObject5, (String)localObject2, (zzbvh)localObject1, (String)localObject3);
      paramParcel2.writeNoException();
      break;
    case 9: 
      zzF();
      paramParcel2.writeNoException();
      break;
    case 8: 
      zzE();
      paramParcel2.writeNoException();
      break;
    case 7: 
      localObject4 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject6 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject3 = paramParcel1.readString();
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null) {
        localObject1 = localObject5;
      }
      for (;;)
      {
        break;
        localObject5 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject5 instanceof zzboe)) {
          localObject1 = (zzboe)localObject5;
        } else {
          localObject1 = new zzboc((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzy((IObjectWrapper)localObject4, (zzl)localObject6, (String)localObject3, (String)localObject2, (zzboe)localObject1);
      paramParcel2.writeNoException();
      break;
    case 6: 
      localObject5 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject4 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
      localObject3 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject7 = paramParcel1.readString();
      localObject6 = paramParcel1.readString();
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null) {
        localObject1 = localObject2;
      }
      for (;;)
      {
        break;
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject2 instanceof zzboe)) {
          localObject1 = (zzboe)localObject2;
        } else {
          localObject1 = new zzboc((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzv((IObjectWrapper)localObject5, (zzq)localObject4, (zzl)localObject3, (String)localObject7, (String)localObject6, (zzboe)localObject1);
      paramParcel2.writeNoException();
      break;
    case 5: 
      zzo();
      paramParcel2.writeNoException();
      break;
    case 4: 
      zzI();
      paramParcel2.writeNoException();
      break;
    case 3: 
      localObject3 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject2 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject4 = paramParcel1.readString();
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null)
      {
        localObject1 = localObject9;
      }
      else
      {
        localObject5 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject5 instanceof zzboe)) {
          localObject1 = (zzboe)localObject5;
        } else {
          localObject1 = new zzboc((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzx((IObjectWrapper)localObject3, (zzl)localObject2, (String)localObject4, (zzboe)localObject1);
      paramParcel2.writeNoException();
      break;
    case 2: 
      paramParcel1 = zzn();
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 1: 
      localObject6 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject5 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
      localObject3 = (zzl)zzatq.zza(paramParcel1, zzl.CREATOR);
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null) {
        localObject1 = localObject4;
      }
      for (;;)
      {
        break;
        localObject4 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localObject4 instanceof zzboe)) {
          localObject1 = (zzboe)localObject4;
        } else {
          localObject1 = new zzboc((IBinder)localObject1);
        }
      }
      zzatq.zzc(paramParcel1);
      zzu((IObjectWrapper)localObject6, (zzq)localObject5, (zzl)localObject3, (String)localObject2, (zzboe)localObject1);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzboa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */