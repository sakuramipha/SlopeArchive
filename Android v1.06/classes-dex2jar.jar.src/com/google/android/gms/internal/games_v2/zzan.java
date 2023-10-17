package com.google.android.gms.internal.games_v2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzh;

public final class zzan
  extends zzh
{
  public static final Parcelable.Creator<zzan> CREATOR = new zzao();
  private final Bundle zza;
  private final IBinder zzb;
  
  zzan(Bundle paramBundle, IBinder paramIBinder)
  {
    this.zza = paramBundle;
    this.zzb = paramIBinder;
  }
  
  public zzan(zzam paramzzam)
  {
    this.zza = paramzzam.zza();
    this.zzb = paramzzam.zza;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBundle(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeIBinder(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */