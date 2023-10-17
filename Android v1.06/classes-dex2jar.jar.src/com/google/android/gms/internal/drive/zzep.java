package com.google.android.gms.internal.drive;

import android.content.IntentSender;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzep
  extends zza
  implements zzeo
{
  zzep(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.drive.internal.IDriveService");
  }
  
  public final IntentSender zza(zzgm paramzzgm)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzgm);
    localParcel = zza(10, localParcel);
    paramzzgm = (IntentSender)zzc.zza(localParcel, IntentSender.CREATOR);
    localParcel.recycle();
    return paramzzgm;
  }
  
  public final IntentSender zza(zzu paramzzu)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzu);
    localParcel = zza(11, localParcel);
    paramzzu = (IntentSender)zzc.zza(localParcel, IntentSender.CREATOR);
    localParcel.recycle();
    return paramzzu;
  }
  
  public final zzec zza(zzgj paramzzgj, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzgj);
    zzc.zza(localParcel, paramzzeq);
    paramzzgj = zza(7, localParcel);
    paramzzeq = (zzec)zzc.zza(paramzzgj, zzec.CREATOR);
    paramzzgj.recycle();
    return paramzzeq;
  }
  
  public final void zza(zzab paramzzab, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzab);
    zzc.zza(localParcel, paramzzeq);
    zzb(24, localParcel);
  }
  
  public final void zza(zzad paramzzad)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzad);
    zzb(16, localParcel);
  }
  
  public final void zza(zzek paramzzek, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzek);
    zzc.zza(localParcel, paramzzeq);
    zzb(1, localParcel);
  }
  
  public final void zza(zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzeq);
    zzb(9, localParcel);
  }
  
  public final void zza(zzex paramzzex, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzex);
    zzc.zza(localParcel, paramzzeq);
    zzb(13, localParcel);
  }
  
  public final void zza(zzgq paramzzgq, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzgq);
    zzc.zza(localParcel, paramzzeq);
    zzb(2, localParcel);
  }
  
  public final void zza(zzgs paramzzgs, zzes paramzzes, String paramString, zzeq paramzzeq)
    throws RemoteException
  {
    paramString = zza();
    zzc.zza(paramString, paramzzgs);
    zzc.zza(paramString, paramzzes);
    paramString.writeString(null);
    zzc.zza(paramString, paramzzeq);
    zzb(15, paramString);
  }
  
  public final void zza(zzgu paramzzgu, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzgu);
    zzc.zza(localParcel, paramzzeq);
    zzb(36, localParcel);
  }
  
  public final void zza(zzgw paramzzgw, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzgw);
    zzc.zza(localParcel, paramzzeq);
    zzb(28, localParcel);
  }
  
  public final void zza(zzhb paramzzhb, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzhb);
    zzc.zza(localParcel, paramzzeq);
    zzb(17, localParcel);
  }
  
  public final void zza(zzhd paramzzhd, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzhd);
    zzc.zza(localParcel, paramzzeq);
    zzb(38, localParcel);
  }
  
  public final void zza(zzhf paramzzhf, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzhf);
    zzc.zza(localParcel, paramzzeq);
    zzb(3, localParcel);
  }
  
  public final void zza(zzj paramzzj, zzes paramzzes, String paramString, zzeq paramzzeq)
    throws RemoteException
  {
    paramString = zza();
    zzc.zza(paramString, paramzzj);
    zzc.zza(paramString, paramzzes);
    paramString.writeString(null);
    zzc.zza(paramString, paramzzeq);
    zzb(14, paramString);
  }
  
  public final void zza(zzm paramzzm, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzm);
    zzc.zza(localParcel, paramzzeq);
    zzb(18, localParcel);
  }
  
  public final void zza(zzo paramzzo, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzo);
    zzc.zza(localParcel, paramzzeq);
    zzb(8, localParcel);
  }
  
  public final void zza(zzr paramzzr, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzr);
    zzc.zza(localParcel, paramzzeq);
    zzb(4, localParcel);
  }
  
  public final void zza(zzw paramzzw, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzw);
    zzc.zza(localParcel, paramzzeq);
    zzb(5, localParcel);
  }
  
  public final void zza(zzy paramzzy, zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzy);
    zzc.zza(localParcel, paramzzeq);
    zzb(6, localParcel);
  }
  
  public final void zzb(zzeq paramzzeq)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zza(localParcel, paramzzeq);
    zzb(35, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */