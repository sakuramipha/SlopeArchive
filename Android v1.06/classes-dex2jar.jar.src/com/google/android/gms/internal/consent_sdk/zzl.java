package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener;
import com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener;
import com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.ConsentRequestParameters.Builder;

public final class zzl
  implements ConsentInformation
{
  private final zzas zza;
  private final zzx zzb;
  private final zzbq zzc;
  private final Object zzd = new Object();
  private final Object zze = new Object();
  private boolean zzf = false;
  private boolean zzg = false;
  private ConsentRequestParameters zzh = new ConsentRequestParameters.Builder().build();
  
  public zzl(zzas paramzzas, zzx paramzzx, zzbq paramzzbq)
  {
    this.zza = paramzzas;
    this.zzb = paramzzx;
    this.zzc = paramzzbq;
  }
  
  public final boolean canRequestAds()
  {
    int i;
    if (!zzc()) {
      i = 0;
    } else {
      i = this.zza.zza();
    }
    return (i == 1) || (i == 3);
  }
  
  public final int getConsentStatus()
  {
    if (!zzc()) {
      return 0;
    }
    return this.zza.zza();
  }
  
  public final ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus()
  {
    if (!zzc()) {
      return ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;
    }
    return this.zza.zzb();
  }
  
  public final boolean isConsentFormAvailable()
  {
    return this.zzc.zzf();
  }
  
  public final void requestConsentInfoUpdate(Activity paramActivity, ConsentRequestParameters paramConsentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener paramOnConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener paramOnConsentInfoUpdateFailureListener)
  {
    synchronized (this.zzd)
    {
      this.zzf = true;
      this.zzh = paramConsentRequestParameters;
      this.zzb.zzc(paramActivity, paramConsentRequestParameters, paramOnConsentInfoUpdateSuccessListener, paramOnConsentInfoUpdateFailureListener);
      return;
    }
  }
  
  public final void reset()
  {
    this.zzc.zzd(null);
    this.zza.zze();
    synchronized (this.zzd)
    {
      this.zzf = false;
      return;
    }
  }
  
  public final void zza(Activity paramActivity)
  {
    if ((zzc()) && (!zzd()))
    {
      zzb(true);
      this.zzb.zzc(paramActivity, this.zzh, new zzj(this), new zzk(this));
      return;
    }
    boolean bool2 = zzc();
    boolean bool1 = zzd();
    paramActivity = new StringBuilder();
    paramActivity.append("Retry request is not executed. consentInfoUpdateHasBeenCalled=");
    paramActivity.append(bool2);
    paramActivity.append(", retryRequestIsInProgress=");
    paramActivity.append(bool1);
    Log.w("UserMessagingPlatform", paramActivity.toString());
  }
  
  public final void zzb(boolean paramBoolean)
  {
    synchronized (this.zze)
    {
      this.zzg = paramBoolean;
      return;
    }
  }
  
  public final boolean zzc()
  {
    synchronized (this.zzd)
    {
      boolean bool = this.zzf;
      return bool;
    }
  }
  
  public final boolean zzd()
  {
    synchronized (this.zze)
    {
      boolean bool = this.zzg;
      return bool;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */