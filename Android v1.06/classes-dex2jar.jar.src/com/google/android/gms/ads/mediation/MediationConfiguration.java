package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;

public class MediationConfiguration
{
  public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
  private final AdFormat zza;
  private final Bundle zzb;
  
  public MediationConfiguration(AdFormat paramAdFormat, Bundle paramBundle)
  {
    this.zza = paramAdFormat;
    this.zzb = paramBundle;
  }
  
  public AdFormat getFormat()
  {
    return this.zza;
  }
  
  public Bundle getServerParameters()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\MediationConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */