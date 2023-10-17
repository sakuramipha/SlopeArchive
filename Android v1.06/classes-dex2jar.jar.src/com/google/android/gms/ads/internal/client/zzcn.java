package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbny;

public abstract class zzcn
  extends zzatp
  implements zzco
{
  public zzcn()
  {
    super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1;
    boolean bool;
    Object localObject2;
    float f;
    switch (paramInt1)
    {
    default: 
      return false;
    case 18: 
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzt((String)localObject1);
      paramParcel2.writeNoException();
      break;
    case 17: 
      bool = zzatq.zzg(paramParcel1);
      zzatq.zzc(paramParcel1);
      zzj(bool);
      paramParcel2.writeNoException();
      break;
    case 16: 
      localObject2 = paramParcel1.readStrongBinder();
      if (localObject2 == null)
      {
        localObject1 = null;
      }
      else
      {
        localObject1 = ((IBinder)localObject2).queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
        if ((localObject1 instanceof zzda)) {
          localObject1 = (zzda)localObject1;
        } else {
          localObject1 = new zzcy((IBinder)localObject2);
        }
      }
      zzatq.zzc(paramParcel1);
      zzm((zzda)localObject1);
      paramParcel2.writeNoException();
      break;
    case 15: 
      zzi();
      paramParcel2.writeNoException();
      break;
    case 14: 
      localObject1 = (zzff)zzatq.zza(paramParcel1, zzff.CREATOR);
      zzatq.zzc(paramParcel1);
      zzu((zzff)localObject1);
      paramParcel2.writeNoException();
      break;
    case 13: 
      paramParcel1 = zzg();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 12: 
      localObject1 = zzbkk.zzc(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzs((zzbkl)localObject1);
      paramParcel2.writeNoException();
      break;
    case 11: 
      localObject1 = zzbnx.zzf(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzo((zzbny)localObject1);
      paramParcel2.writeNoException();
      break;
    case 10: 
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzh((String)localObject1);
      paramParcel2.writeNoException();
      break;
    case 9: 
      paramParcel1 = zzf();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 8: 
      paramInt1 = zzv();
      paramParcel2.writeNoException();
      paramInt2 = zzatq.zza;
      paramParcel2.writeInt(paramInt1);
      break;
    case 7: 
      f = zze();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      break;
    case 6: 
      localObject2 = paramParcel1.readString();
      localObject1 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzl((String)localObject2, (IObjectWrapper)localObject1);
      paramParcel2.writeNoException();
      break;
    case 5: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzn((IObjectWrapper)localObject2, (String)localObject1);
      paramParcel2.writeNoException();
      break;
    case 4: 
      bool = zzatq.zzg(paramParcel1);
      zzatq.zzc(paramParcel1);
      zzp(bool);
      paramParcel2.writeNoException();
      break;
    case 3: 
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzr((String)localObject1);
      paramParcel2.writeNoException();
      break;
    case 2: 
      f = paramParcel1.readFloat();
      zzatq.zzc(paramParcel1);
      zzq(f);
      paramParcel2.writeNoException();
      break;
    case 1: 
      zzk();
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */