package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzcf
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzcf> CREATOR = new zzcg();
  final int zza;
  public final zzo zzb;
  public final zzr zzc;
  public final PendingIntent zzd;
  @Deprecated
  public final int zze;
  @Deprecated
  public final String zzf;
  @Deprecated
  public final String zzg;
  @Deprecated
  public final boolean zzh;
  @Deprecated
  public final ClientAppContext zzi;
  
  public zzcf(int paramInt1, IBinder paramIBinder1, IBinder paramIBinder2, PendingIntent paramPendingIntent, int paramInt2, String paramString1, String paramString2, boolean paramBoolean, ClientAppContext paramClientAppContext)
  {
    this.zza = paramInt1;
    Object localObject = null;
    if (paramIBinder1 == null)
    {
      paramIBinder1 = null;
    }
    else
    {
      IInterface localIInterface = paramIBinder1.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
      if ((localIInterface instanceof zzo)) {
        paramIBinder1 = (zzo)localIInterface;
      } else {
        paramIBinder1 = new zzm(paramIBinder1);
      }
    }
    this.zzb = paramIBinder1;
    if (paramIBinder2 == null)
    {
      paramIBinder1 = (IBinder)localObject;
    }
    else
    {
      paramIBinder1 = paramIBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
      if ((paramIBinder1 instanceof zzr)) {
        paramIBinder1 = (zzr)paramIBinder1;
      } else {
        paramIBinder1 = new zzp(paramIBinder2);
      }
    }
    this.zzc = paramIBinder1;
    this.zzd = paramPendingIntent;
    this.zze = paramInt2;
    this.zzf = paramString1;
    this.zzg = paramString2;
    this.zzh = paramBoolean;
    this.zzi = ClientAppContext.zza(paramClientAppContext, paramString2, paramString1, paramBoolean);
  }
  
  public zzcf(IBinder paramIBinder1, IBinder paramIBinder2, PendingIntent paramPendingIntent)
  {
    this(1, paramIBinder1, paramIBinder2, paramPendingIntent, 0, null, null, false, null);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    Object localObject = this.zzb;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((zzo)localObject).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 2, (IBinder)localObject, false);
    SafeParcelWriter.writeIBinder(paramParcel, 3, this.zzc.asBinder(), false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzd, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zze);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzf, false);
    SafeParcelWriter.writeString(paramParcel, 7, this.zzg, false);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzh);
    SafeParcelWriter.writeParcelable(paramParcel, 9, this.zzi, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzcf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */