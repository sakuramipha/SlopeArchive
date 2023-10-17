package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

@Deprecated
public final class zzh
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzh> CREATOR = new zzi();
  final int zza;
  public final zzr zzb;
  @Deprecated
  public final String zzc;
  @Deprecated
  public final ClientAppContext zzd;
  
  zzh(int paramInt, IBinder paramIBinder, String paramString, ClientAppContext paramClientAppContext)
  {
    this.zza = paramInt;
    if (paramIBinder == null)
    {
      paramIBinder = null;
    }
    else
    {
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
      if ((localIInterface instanceof zzr)) {
        paramIBinder = (zzr)localIInterface;
      } else {
        paramIBinder = new zzp(paramIBinder);
      }
    }
    this.zzb = paramIBinder;
    this.zzc = paramString;
    this.zzd = ClientAppContext.zza(paramClientAppContext, null, paramString, false);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeIBinder(paramParcel, 2, this.zzb.asBinder(), false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzd, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */