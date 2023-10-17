package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzca
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzca> CREATOR = new zzcb();
  final int zza;
  public final zzr zzb;
  public final zzy zzc;
  public boolean zzd;
  @Deprecated
  public String zze;
  @Deprecated
  public final ClientAppContext zzf;
  
  zzca(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, boolean paramBoolean, String paramString, ClientAppContext paramClientAppContext)
  {
    this.zza = paramInt;
    if (paramIBinder1 == null)
    {
      paramIBinder1 = null;
    }
    else
    {
      IInterface localIInterface = paramIBinder1.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
      if ((localIInterface instanceof zzr)) {
        paramIBinder1 = (zzr)localIInterface;
      } else {
        paramIBinder1 = new zzp(paramIBinder1);
      }
    }
    this.zzb = paramIBinder1;
    if (paramIBinder2 == null)
    {
      paramIBinder1 = null;
    }
    else
    {
      paramIBinder1 = paramIBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
      if ((paramIBinder1 instanceof zzy)) {
        paramIBinder1 = (zzy)paramIBinder1;
      } else {
        paramIBinder1 = new zzw(paramIBinder2);
      }
    }
    this.zzc = paramIBinder1;
    this.zzd = paramBoolean;
    this.zze = paramString;
    this.zzf = ClientAppContext.zza(paramClientAppContext, null, paramString, false);
  }
  
  public zzca(IBinder paramIBinder1, IBinder paramIBinder2)
  {
    this(1, paramIBinder1, paramIBinder2, false, null, null);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeIBinder(paramParcel, 2, this.zzb.asBinder(), false);
    SafeParcelWriter.writeIBinder(paramParcel, 3, this.zzc.asBinder(), false);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.writeString(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzf, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */