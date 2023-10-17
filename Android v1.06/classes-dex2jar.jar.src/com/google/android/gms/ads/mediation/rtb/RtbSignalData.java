package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

public class RtbSignalData
{
  private final Context zza;
  private final List zzb;
  private final Bundle zzc;
  private final AdSize zzd;
  
  public RtbSignalData(Context paramContext, List<MediationConfiguration> paramList, Bundle paramBundle, AdSize paramAdSize)
  {
    this.zza = paramContext;
    this.zzb = paramList;
    this.zzc = paramBundle;
    this.zzd = paramAdSize;
  }
  
  public AdSize getAdSize()
  {
    return this.zzd;
  }
  
  @Deprecated
  public MediationConfiguration getConfiguration()
  {
    List localList = this.zzb;
    if ((localList != null) && (localList.size() > 0)) {
      return (MediationConfiguration)this.zzb.get(0);
    }
    return null;
  }
  
  public List<MediationConfiguration> getConfigurations()
  {
    return this.zzb;
  }
  
  public Context getContext()
  {
    return this.zza;
  }
  
  public Bundle getNetworkExtras()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\rtb\RtbSignalData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */