package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzcgr
  extends zzatp
  implements zzcgs
{
  public zzcgr()
  {
    super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
  }
  
  protected final boolean zzbE(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    Object localObject1;
    Object localObject2;
    String str;
    switch (paramInt1)
    {
    default: 
      return false;
    case 19: 
      localObject1 = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzr((Bundle)localObject1);
      paramParcel2.writeNoException();
      break;
    case 18: 
      paramParcel1 = zze();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 17: 
      paramParcel1 = zzg();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 16: 
      paramParcel1 = zzh();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 15: 
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      str = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzs((IObjectWrapper)localObject2, (String)localObject1, str);
      paramParcel2.writeNoException();
      break;
    case 14: 
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzn((String)localObject1);
      paramParcel2.writeNoException();
      break;
    case 13: 
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      zzl((String)localObject1);
      paramParcel2.writeNoException();
      break;
    case 12: 
      long l = zzc();
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
      break;
    case 11: 
      paramParcel1 = zzi();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 10: 
      paramParcel1 = zzf();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 9: 
      localObject1 = paramParcel1.readString();
      str = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzj((String)localObject1, str);
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
      break;
    case 8: 
      localObject1 = paramParcel1.readString();
      str = paramParcel1.readString();
      localObject2 = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzm((String)localObject1, str, (Bundle)localObject2);
      paramParcel2.writeNoException();
      break;
    case 7: 
      localObject1 = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzq((Bundle)localObject1);
      paramParcel2.writeNoException();
      break;
    case 6: 
      localObject1 = paramParcel1.readString();
      zzatq.zzc(paramParcel1);
      paramInt1 = zzb((String)localObject1);
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      break;
    case 5: 
      localObject1 = paramParcel1.readString();
      str = paramParcel1.readString();
      boolean bool = zzatq.zzg(paramParcel1);
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzk((String)localObject1, str, bool);
      paramParcel2.writeNoException();
      paramParcel2.writeMap(paramParcel1);
      break;
    case 4: 
      localObject1 = paramParcel1.readString();
      str = paramParcel1.readString();
      localObject2 = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
      zzatq.zzc(paramParcel1);
      zzt((String)localObject1, str, (IObjectWrapper)localObject2);
      paramParcel2.writeNoException();
      break;
    case 3: 
      localObject1 = paramParcel1.readString();
      str = paramParcel1.readString();
      localObject2 = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzo((String)localObject1, str, (Bundle)localObject2);
      paramParcel2.writeNoException();
      break;
    case 2: 
      localObject1 = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      paramParcel1 = zzd((Bundle)localObject1);
      paramParcel2.writeNoException();
      zzatq.zze(paramParcel2, paramParcel1);
      break;
    case 1: 
      localObject1 = (Bundle)zzatq.zza(paramParcel1, Bundle.CREATOR);
      zzatq.zzc(paramParcel1);
      zzp((Bundle)localObject1);
      paramParcel2.writeNoException();
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */