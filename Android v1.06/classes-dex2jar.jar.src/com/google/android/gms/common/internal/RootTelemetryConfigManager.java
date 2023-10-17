package com.google.android.gms.common.internal;

public final class RootTelemetryConfigManager
{
  private static RootTelemetryConfigManager zza;
  private static final RootTelemetryConfiguration zzb = new RootTelemetryConfiguration(0, false, false, 0, 0);
  private RootTelemetryConfiguration zzc;
  
  public static RootTelemetryConfigManager getInstance()
  {
    try
    {
      if (zza == null)
      {
        localRootTelemetryConfigManager = new com/google/android/gms/common/internal/RootTelemetryConfigManager;
        localRootTelemetryConfigManager.<init>();
        zza = localRootTelemetryConfigManager;
      }
      RootTelemetryConfigManager localRootTelemetryConfigManager = zza;
      return localRootTelemetryConfigManager;
    }
    finally {}
  }
  
  public RootTelemetryConfiguration getConfig()
  {
    return this.zzc;
  }
  
  public final void zza(RootTelemetryConfiguration paramRootTelemetryConfiguration)
  {
    if (paramRootTelemetryConfiguration == null) {}
    try
    {
      this.zzc = zzb;
      return;
    }
    finally {}
    RootTelemetryConfiguration localRootTelemetryConfiguration = this.zzc;
    if (localRootTelemetryConfiguration != null)
    {
      int i = localRootTelemetryConfiguration.getVersion();
      int j = paramRootTelemetryConfiguration.getVersion();
      if (i >= j) {
        return;
      }
    }
    this.zzc = paramRootTelemetryConfiguration;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\RootTelemetryConfigManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */