package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzj
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzj> CREATOR = new zzk();
  Bundle zza;
  Feature[] zzb;
  int zzc;
  ConnectionTelemetryConfiguration zzd;
  
  public zzj() {}
  
  zzj(Bundle paramBundle, Feature[] paramArrayOfFeature, int paramInt, ConnectionTelemetryConfiguration paramConnectionTelemetryConfiguration)
  {
    this.zza = paramBundle;
    this.zzb = paramArrayOfFeature;
    this.zzc = paramInt;
    this.zzd = paramConnectionTelemetryConfiguration;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBundle(paramParcel, 1, this.zza, false);
    SafeParcelWriter.writeTypedArray(paramParcel, 2, this.zzb, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzc);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzd, paramInt, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */