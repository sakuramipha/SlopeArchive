package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class RootTelemetryConfiguration
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzai();
  private final int zza;
  private final boolean zzb;
  private final boolean zzc;
  private final int zzd;
  private final int zze;
  
  public RootTelemetryConfiguration(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int paramInt3)
  {
    this.zza = paramInt1;
    this.zzb = paramBoolean1;
    this.zzc = paramBoolean2;
    this.zzd = paramInt2;
    this.zze = paramInt3;
  }
  
  public int getBatchPeriodMillis()
  {
    return this.zzd;
  }
  
  public int getMaxMethodInvocationsInBatch()
  {
    return this.zze;
  }
  
  public boolean getMethodInvocationTelemetryEnabled()
  {
    return this.zzb;
  }
  
  public boolean getMethodTimingTelemetryEnabled()
  {
    return this.zzc;
  }
  
  public int getVersion()
  {
    return this.zza;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, getVersion());
    SafeParcelWriter.writeBoolean(paramParcel, 2, getMethodInvocationTelemetryEnabled());
    SafeParcelWriter.writeBoolean(paramParcel, 3, getMethodTimingTelemetryEnabled());
    SafeParcelWriter.writeInt(paramParcel, 4, getBatchPeriodMillis());
    SafeParcelWriter.writeInt(paramParcel, 5, getMaxMethodInvocationsInBatch());
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\RootTelemetryConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */