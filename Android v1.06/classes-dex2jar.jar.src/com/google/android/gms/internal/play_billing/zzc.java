package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzc
  extends zzh
  implements zze
{
  zzc(IBinder paramIBinder)
  {
    super(paramIBinder, "com.android.vending.billing.IInAppBillingService");
  }
  
  public final int zza(int paramInt, String paramString1, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(3);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    paramString1 = zzp(5, localParcel);
    paramInt = paramString1.readInt();
    paramString1.recycle();
    return paramInt;
  }
  
  public final int zzc(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(paramInt);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzj.zzc(localParcel, paramBundle);
    paramString1 = zzp(10, localParcel);
    paramInt = paramString1.readInt();
    paramString1.recycle();
    return paramInt;
  }
  
  public final Bundle zzd(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(9);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzj.zzc(localParcel, paramBundle);
    paramString1 = zzp(902, localParcel);
    paramString2 = (Bundle)zzj.zza(paramString1, Bundle.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final Bundle zze(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(9);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzj.zzc(localParcel, paramBundle);
    paramString1 = zzp(12, localParcel);
    paramString2 = (Bundle)zzj.zza(paramString1, Bundle.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final Bundle zzf(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
    throws RemoteException
  {
    paramString4 = zzo();
    paramString4.writeInt(3);
    paramString4.writeString(paramString1);
    paramString4.writeString(paramString2);
    paramString4.writeString(paramString3);
    paramString4.writeString(null);
    paramString2 = zzp(3, paramString4);
    paramString1 = (Bundle)zzj.zza(paramString2, Bundle.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final Bundle zzg(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle)
    throws RemoteException
  {
    paramString4 = zzo();
    paramString4.writeInt(paramInt);
    paramString4.writeString(paramString1);
    paramString4.writeString(paramString2);
    paramString4.writeString(paramString3);
    paramString4.writeString(null);
    zzj.zzc(paramString4, paramBundle);
    paramString1 = zzp(8, paramString4);
    paramString2 = (Bundle)zzj.zza(paramString1, Bundle.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final Bundle zzh(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(6);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    zzj.zzc(localParcel, paramBundle);
    paramString1 = zzp(9, localParcel);
    paramString2 = (Bundle)zzj.zza(paramString1, Bundle.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final Bundle zzi(int paramInt, String paramString1, String paramString2, String paramString3)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(3);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    paramString2 = zzp(4, localParcel);
    paramString1 = (Bundle)zzj.zza(paramString2, Bundle.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final Bundle zzj(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(9);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    zzj.zzc(localParcel, paramBundle);
    paramString2 = zzp(11, localParcel);
    paramString1 = (Bundle)zzj.zza(paramString2, Bundle.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final Bundle zzk(int paramInt, String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(3);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzj.zzc(localParcel, paramBundle);
    paramString1 = zzp(2, localParcel);
    paramString2 = (Bundle)zzj.zza(paramString1, Bundle.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final Bundle zzl(int paramInt, String paramString1, String paramString2, Bundle paramBundle1, Bundle paramBundle2)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(paramInt);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzj.zzc(localParcel, paramBundle1);
    zzj.zzc(localParcel, paramBundle2);
    paramString1 = zzp(901, localParcel);
    paramString2 = (Bundle)zzj.zza(paramString1, Bundle.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final Bundle zzm(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
    throws RemoteException
  {
    paramString3 = zzo();
    paramString3.writeInt(8);
    paramString3.writeString(paramString1);
    paramString3.writeString(paramString2);
    paramString3.writeString("subs");
    zzj.zzc(paramString3, paramBundle);
    paramString1 = zzp(801, paramString3);
    paramString2 = (Bundle)zzj.zza(paramString1, Bundle.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final void zzn(int paramInt, String paramString, Bundle paramBundle, zzg paramzzg)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(12);
    localParcel.writeString(paramString);
    zzj.zzc(localParcel, paramBundle);
    zzj.zzd(localParcel, paramzzg);
    zzq(1201, localParcel);
  }
  
  public final int zzr(int paramInt, String paramString1, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = zzo();
    localParcel.writeInt(paramInt);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    paramString1 = zzp(1, localParcel);
    paramInt = paramString1.readInt();
    paramString1.recycle();
    return paramInt;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\play_billing\zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */