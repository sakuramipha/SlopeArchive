package com.google.android.gms.games.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.internal.games_v2.zza;
import com.google.android.gms.internal.games_v2.zzc;

public final class zzap
  extends zza
  implements IInterface
{
  zzap(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.games.internal.IGamesService");
  }
  
  public final void zzA(zzam paramzzam, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    zzc.zzc(localParcel, paramBoolean);
    zzc(6504, localParcel);
  }
  
  public final void zzB(zzam paramzzam, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    zzc.zzc(localParcel, paramBoolean);
    zzc(6503, localParcel);
  }
  
  public final void zzC(zzam paramzzam, Bundle paramBundle, int paramInt1, int paramInt2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    zzc.zzd(localParcel, paramBundle);
    localParcel.writeInt(paramInt1);
    localParcel.writeInt(paramInt2);
    zzc(5021, localParcel);
  }
  
  public final void zzD(zzam paramzzam, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt1);
    localParcel.writeInt(paramInt2);
    localParcel.writeInt(paramInt3);
    zzc.zzc(localParcel, paramBoolean);
    zzc(5020, localParcel);
  }
  
  public final void zzE(zzam paramzzam, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    zzc.zzc(localParcel, paramBoolean);
    zzc(17001, localParcel);
  }
  
  public final void zzF(zzam paramzzam, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    zzc.zzc(localParcel, paramBoolean);
    zzc(13006, localParcel);
  }
  
  public final void zzG(zzam paramzzam, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    zzc.zzc(localParcel, paramBoolean1);
    zzc.zzc(localParcel, paramBoolean2);
    zzc(9020, localParcel);
  }
  
  public final void zzH(zzam paramzzam, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    zzc.zzc(localParcel, paramBoolean);
    zzc(12002, localParcel);
  }
  
  public final void zzI(zzam paramzzam, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt1);
    localParcel.writeInt(paramInt2);
    localParcel.writeInt(paramInt3);
    zzc.zzc(localParcel, paramBoolean);
    zzc(5019, localParcel);
  }
  
  public final void zzJ(zzam paramzzam, String paramString, boolean paramBoolean, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    zzc.zzc(localParcel, paramBoolean);
    localParcel.writeInt(paramInt);
    zzc(15001, localParcel);
  }
  
  public final void zzK(zzao paramzzao, long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzao);
    localParcel.writeLong(paramLong);
    zzc(15501, localParcel);
  }
  
  public final void zzL(zzam paramzzam, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    zzc.zzc(localParcel, paramBoolean);
    zzc(27003, localParcel);
  }
  
  public final void zzM(zzam paramzzam, String paramString1, String paramString2, SnapshotMetadataChangeEntity paramSnapshotMetadataChangeEntity, Contents paramContents)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzc.zzd(localParcel, paramSnapshotMetadataChangeEntity);
    zzc.zzd(localParcel, paramContents);
    zzc(12033, localParcel);
  }
  
  public final void zzN(zzam paramzzam, String paramString, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    localParcel.writeStrongBinder(paramIBinder);
    zzc.zzd(localParcel, paramBundle);
    zzc(5023, localParcel);
  }
  
  public final void zzO(zzam paramzzam, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    localParcel.writeStrongBinder(paramIBinder);
    zzc.zzd(localParcel, paramBundle);
    zzc(7003, localParcel);
  }
  
  public final void zzP(IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeStrongBinder(paramIBinder);
    zzc.zzd(localParcel, paramBundle);
    zzc(5005, localParcel);
  }
  
  public final void zzQ(zzam paramzzam)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    zzc(5002, localParcel);
  }
  
  public final void zzR(zzam paramzzam, String paramString1, long paramLong, String paramString2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString1);
    localParcel.writeLong(paramLong);
    localParcel.writeString(paramString2);
    zzc(7002, localParcel);
  }
  
  public final void zzS(zzam paramzzam, String paramString, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    localParcel.writeStrongBinder(paramIBinder);
    zzc.zzd(localParcel, paramBundle);
    zzc(5024, localParcel);
  }
  
  public final int zzd()
    throws RemoteException
  {
    Parcel localParcel = zzb(12036, zza());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final int zze()
    throws RemoteException
  {
    Parcel localParcel = zzb(12035, zza());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final PendingIntent zzf()
    throws RemoteException
  {
    Parcel localParcel = zzb(25015, zza());
    PendingIntent localPendingIntent = (PendingIntent)zzc.zza(localParcel, PendingIntent.CREATOR);
    localParcel.recycle();
    return localPendingIntent;
  }
  
  public final Intent zzg()
    throws RemoteException
  {
    Parcel localParcel = zzb(9005, zza());
    Intent localIntent = (Intent)zzc.zza(localParcel, Intent.CREATOR);
    localParcel.recycle();
    return localIntent;
  }
  
  public final Intent zzh()
    throws RemoteException
  {
    Parcel localParcel = zzb(9003, zza());
    Intent localIntent = (Intent)zzc.zza(localParcel, Intent.CREATOR);
    localParcel.recycle();
    return localIntent;
  }
  
  public final Intent zzi(PlayerEntity paramPlayerEntity)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramPlayerEntity);
    localParcel = zzb(15503, localParcel);
    paramPlayerEntity = (Intent)zzc.zza(localParcel, Intent.CREATOR);
    localParcel.recycle();
    return paramPlayerEntity;
  }
  
  public final Intent zzj(String paramString1, String paramString2, String paramString3)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    paramString2 = zzb(25016, localParcel);
    paramString1 = (Intent)zzc.zza(paramString2, Intent.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final Intent zzk(String paramString, int paramInt1, int paramInt2)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt1);
    localParcel.writeInt(paramInt2);
    localParcel = zzb(18001, localParcel);
    paramString = (Intent)zzc.zza(localParcel, Intent.CREATOR);
    localParcel.recycle();
    return paramString;
  }
  
  public final Intent zzl()
    throws RemoteException
  {
    Parcel localParcel = zzb(9010, zza());
    Intent localIntent = (Intent)zzc.zza(localParcel, Intent.CREATOR);
    localParcel.recycle();
    return localIntent;
  }
  
  public final Intent zzm(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
    throws RemoteException
  {
    Object localObject = zza();
    ((Parcel)localObject).writeString(paramString);
    zzc.zzc((Parcel)localObject, paramBoolean1);
    zzc.zzc((Parcel)localObject, paramBoolean2);
    ((Parcel)localObject).writeInt(paramInt);
    paramString = zzb(12001, (Parcel)localObject);
    localObject = (Intent)zzc.zza(paramString, Intent.CREATOR);
    paramString.recycle();
    return (Intent)localObject;
  }
  
  public final DataHolder zzn()
    throws RemoteException
  {
    Parcel localParcel = zzb(5013, zza());
    DataHolder localDataHolder = (DataHolder)zzc.zza(localParcel, DataHolder.CREATOR);
    localParcel.recycle();
    return localDataHolder;
  }
  
  public final String zzo()
    throws RemoteException
  {
    Parcel localParcel = zzb(5012, zza());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final void zzp()
    throws RemoteException
  {
    zzc(5006, zza());
  }
  
  public final void zzq(long paramLong)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeLong(paramLong);
    zzc(5001, localParcel);
  }
  
  public final void zzr(zzam paramzzam, String paramString, SnapshotMetadataChangeEntity paramSnapshotMetadataChangeEntity, Contents paramContents)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    zzc.zzd(localParcel, paramSnapshotMetadataChangeEntity);
    zzc.zzd(localParcel, paramContents);
    zzc(12007, localParcel);
  }
  
  public final void zzs(zzam paramzzam, String paramString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    zzc(12020, localParcel);
  }
  
  public final void zzt(Contents paramContents)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzd(localParcel, paramContents);
    zzc(12019, localParcel);
  }
  
  public final void zzu(zzam paramzzam, String paramString1, String paramString2, int paramInt1, int paramInt2)
    throws RemoteException
  {
    paramString1 = zza();
    zzc.zzf(paramString1, paramzzam);
    paramString1.writeString(null);
    paramString1.writeString(paramString2);
    paramString1.writeInt(paramInt1);
    paramString1.writeInt(paramInt2);
    zzc(8001, paramString1);
  }
  
  public final void zzv(zzam paramzzam, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    localParcel.writeStrongBinder(paramIBinder);
    zzc.zzd(localParcel, paramBundle);
    zzc(5025, localParcel);
  }
  
  public final void zzw(String paramString, int paramInt)
    throws RemoteException
  {
    Parcel localParcel = zza();
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    zzc(12017, localParcel);
  }
  
  public final void zzx(zzam paramzzam, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    zzc.zzc(localParcel, paramBoolean);
    zzc(6001, localParcel);
  }
  
  public final void zzy(zzam paramzzam, boolean paramBoolean)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    zzc.zzc(localParcel, paramBoolean);
    zzc(12016, localParcel);
  }
  
  public final void zzz(zzam paramzzam, boolean paramBoolean, String[] paramArrayOfString)
    throws RemoteException
  {
    Parcel localParcel = zza();
    zzc.zzf(localParcel, paramzzam);
    zzc.zzc(localParcel, paramBoolean);
    localParcel.writeStringArray(paramArrayOfString);
    zzc(12031, localParcel);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */