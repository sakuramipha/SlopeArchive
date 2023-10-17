package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ConnectionTelemetryConfiguration
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzl();
  private final RootTelemetryConfiguration zza;
  private final boolean zzb;
  private final boolean zzc;
  private final int[] zzd;
  private final int zze;
  private final int[] zzf;
  
  public ConnectionTelemetryConfiguration(RootTelemetryConfiguration paramRootTelemetryConfiguration, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt1, int paramInt, int[] paramArrayOfInt2)
  {
    this.zza = paramRootTelemetryConfiguration;
    this.zzb = paramBoolean1;
    this.zzc = paramBoolean2;
    this.zzd = paramArrayOfInt1;
    this.zze = paramInt;
    this.zzf = paramArrayOfInt2;
  }
  
  public int getMaxMethodInvocationsLogged()
  {
    return this.zze;
  }
  
  public int[] getMethodInvocationMethodKeyAllowlist()
  {
    return this.zzd;
  }
  
  public int[] getMethodInvocationMethodKeyDisallowlist()
  {
    return this.zzf;
  }
  
  public boolean getMethodInvocationTelemetryEnabled()
  {
    return this.zzb;
  }
  
  public boolean getMethodTimingTelemetryEnabled()
  {
    return this.zzc;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 1, this.zza, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 2, getMethodInvocationTelemetryEnabled());
    SafeParcelWriter.writeBoolean(paramParcel, 3, getMethodTimingTelemetryEnabled());
    SafeParcelWriter.writeIntArray(paramParcel, 4, getMethodInvocationMethodKeyAllowlist(), false);
    SafeParcelWriter.writeInt(paramParcel, 5, getMaxMethodInvocationsLogged());
    SafeParcelWriter.writeIntArray(paramParcel, 6, getMethodInvocationMethodKeyDisallowlist(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
  
  public final RootTelemetryConfiguration zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\ConnectionTelemetryConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */