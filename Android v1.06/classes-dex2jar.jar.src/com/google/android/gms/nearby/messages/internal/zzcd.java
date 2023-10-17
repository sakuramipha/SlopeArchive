package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzcd
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzcd> CREATOR = new zzce();
  final int zza;
  public final zzae zzb;
  public final zzr zzc;
  @Deprecated
  public final String zzd;
  @Deprecated
  public final String zze;
  @Deprecated
  public final boolean zzf;
  @Deprecated
  public final ClientAppContext zzg;
  
  zzcd(int paramInt, zzae paramzzae, IBinder paramIBinder, String paramString1, String paramString2, boolean paramBoolean, ClientAppContext paramClientAppContext)
  {
    this.zza = paramInt;
    this.zzb = paramzzae;
    if (paramIBinder == null)
    {
      paramzzae = null;
    }
    else
    {
      paramzzae = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
      if ((paramzzae instanceof zzr)) {
        paramzzae = (zzr)paramzzae;
      } else {
        paramzzae = new zzp(paramIBinder);
      }
    }
    this.zzc = paramzzae;
    this.zzd = paramString1;
    this.zze = paramString2;
    this.zzf = paramBoolean;
    this.zzg = ClientAppContext.zza(paramClientAppContext, paramString2, paramString1, paramBoolean);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zzb, paramInt, false);
    SafeParcelWriter.writeIBinder(paramParcel, 3, this.zzc.asBinder(), false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeBoolean(paramParcel, 6, this.zzf);
    SafeParcelWriter.writeParcelable(paramParcel, 7, this.zzg, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */