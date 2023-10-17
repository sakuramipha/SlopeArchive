package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT>
{
  public abstract void onFailure(AdError paramAdError);
  
  @Deprecated
  public abstract void onFailure(String paramString);
  
  public abstract MediationAdCallbackT onSuccess(MediationAdT paramMediationAdT);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\MediationAdLoadCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */