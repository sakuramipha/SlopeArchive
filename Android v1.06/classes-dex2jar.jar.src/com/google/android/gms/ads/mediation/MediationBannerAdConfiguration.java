package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class MediationBannerAdConfiguration
  extends MediationAdConfiguration
{
  private final AdSize zza;
  
  public MediationBannerAdConfiguration(Context paramContext, String paramString1, Bundle paramBundle1, Bundle paramBundle2, boolean paramBoolean, Location paramLocation, int paramInt1, int paramInt2, String paramString2, AdSize paramAdSize, String paramString3)
  {
    super(paramContext, paramString1, paramBundle1, paramBundle2, paramBoolean, paramLocation, paramInt1, paramInt2, paramString2, paramString3);
    this.zza = paramAdSize;
  }
  
  public AdSize getAdSize()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\MediationBannerAdConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */