package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.Strategy;

public final class zzby
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzby> CREATOR = new zzbz();
  final int zza;
  public final zzae zzb;
  public final Strategy zzc;
  public final zzr zzd;
  @Deprecated
  public final String zze;
  @Deprecated
  public final String zzf;
  @Deprecated
  public final boolean zzg;
  public final zzv zzh;
  @Deprecated
  public final boolean zzi;
  @Deprecated
  public final ClientAppContext zzj;
  public final int zzk;
  
  zzby(int paramInt1, zzae paramzzae, Strategy paramStrategy, IBinder paramIBinder1, String paramString1, String paramString2, boolean paramBoolean1, IBinder paramIBinder2, boolean paramBoolean2, ClientAppContext paramClientAppContext, int paramInt2)
  {
    this.zza = paramInt1;
    this.zzb = paramzzae;
    this.zzc = paramStrategy;
    paramStrategy = null;
    if (paramIBinder1 == null)
    {
      paramzzae = null;
    }
    else
    {
      paramzzae = paramIBinder1.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
      if ((paramzzae instanceof zzr)) {
        paramzzae = (zzr)paramzzae;
      } else {
        paramzzae = new zzp(paramIBinder1);
      }
    }
    this.zzd = paramzzae;
    this.zze = paramString1;
    this.zzf = paramString2;
    this.zzg = paramBoolean1;
    if (paramIBinder2 == null)
    {
      paramzzae = paramStrategy;
    }
    else
    {
      paramzzae = paramIBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
      if ((paramzzae instanceof zzv)) {
        paramzzae = (zzv)paramzzae;
      } else {
        paramzzae = new zzt(paramIBinder2);
      }
    }
    this.zzh = paramzzae;
    this.zzi = paramBoolean2;
    this.zzj = ClientAppContext.zza(paramClientAppContext, paramString2, paramString1, paramBoolean2);
    this.zzk = paramInt2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzb, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzc, paramInt, false);
    SafeParcelWriter.writeIBinder(paramParcel, 4, this.zzd.asBinder(), false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzf, false);
    SafeParcelWriter.writeBoolean(paramParcel, 7, this.zzg);
    Object localObject = this.zzh;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((zzv)localObject).asBinder();
    }
    SafeParcelWriter.writeIBinder(paramParcel, 8, (IBinder)localObject, false);
    SafeParcelWriter.writeBoolean(paramParcel, 9, this.zzi);
    SafeParcelWriter.writeParcelable(paramParcel, 10, this.zzj, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 11, this.zzk);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */