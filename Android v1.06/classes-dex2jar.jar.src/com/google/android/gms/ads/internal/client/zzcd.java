package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbje;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbny;

public abstract class zzcd
  extends zzatp
  implements zzce
{
  public zzcd()
  {
    super("com.google.android.gms.ads.internal.client.IClientApi");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    switch (paramInt1)
    {
    default: 
      return false;
    case 17: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject2 = zzbnx.zzf(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzh((IObjectWrapper)localObject1, (zzbny)localObject2, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 16: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject1 = zzbnx.zzf(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      localObject3 = zzbje.zzc(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzk((IObjectWrapper)localObject2, (zzbny)localObject1, paramInt1, (zzbjf)localObject3);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 15: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject2 = zzbnx.zzf(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzl((IObjectWrapper)localObject1, (zzbny)localObject2, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 14: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject2 = zzbnx.zzf(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzp((IObjectWrapper)localObject1, (zzbny)localObject2, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 13: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
      localObject2 = paramParcel1.readString();
      localObject4 = zzbnx.zzf(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzc((IObjectWrapper)localObject1, (zzq)localObject3, (String)localObject2, (zzbny)localObject4, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 12: 
      localObject3 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      localObject1 = zzbnx.zzf(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzo((IObjectWrapper)localObject3, (String)localObject2, (zzbny)localObject1, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 11: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzj((IObjectWrapper)localObject1, (IObjectWrapper)localObject3, (IObjectWrapper)localObject2);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 10: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject3 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
      localObject1 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzf((IObjectWrapper)localObject2, (zzq)localObject3, (String)localObject1, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 9: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzg((IObjectWrapper)localObject1, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 8: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzm((IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 7: 
      IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, null);
      break;
    case 6: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject1 = zzbnx.zzf(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzn((IObjectWrapper)localObject2, (zzbny)localObject1, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 5: 
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzi((IObjectWrapper)localObject1, (IObjectWrapper)localObject2);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 4: 
      IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, null);
      break;
    case 3: 
      localObject3 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      localObject2 = zzbnx.zzf(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzb((IObjectWrapper)localObject3, (String)localObject1, (zzbny)localObject2, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 2: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject4 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
      localObject3 = paramParcel1.readString();
      localObject1 = zzbnx.zzf(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zze((IObjectWrapper)localObject2, (zzq)localObject4, (String)localObject3, (zzbny)localObject1, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
      break;
    case 1: 
      localObject3 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject4 = (zzq)zzatq.zza(paramParcel1, zzq.CREATOR);
      localObject2 = paramParcel1.readString();
      localObject1 = zzbnx.zzf(paramParcel1.readStrongBinder());
      paramInt1 = paramParcel1.readInt();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzd((IObjectWrapper)localObject3, (zzq)localObject4, (String)localObject2, (zzbny)localObject1, paramInt1);
      paramParcel2.writeNoException();
      zzatq.zzf(paramParcel2, paramParcel1);
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */