package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzbg;
import com.google.android.gms.internal.consent_sdk.zzbh;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzc;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzl;

public final class UserMessagingPlatform
{
  public static ConsentInformation getConsentInformation(Context paramContext)
  {
    return zzc.zza(paramContext).zzb();
  }
  
  public static void loadAndShowConsentFormIfRequired(Activity paramActivity, ConsentForm.OnConsentFormDismissedListener paramOnConsentFormDismissedListener)
  {
    if (zzc.zza(paramActivity).zzb().canRequestAds())
    {
      paramOnConsentFormDismissedListener.onConsentFormDismissed(null);
      return;
    }
    zzbq localzzbq = zzc.zza(paramActivity).zzc();
    zzct.zza();
    paramActivity = new zzbg(paramActivity, paramOnConsentFormDismissedListener);
    paramOnConsentFormDismissedListener.getClass();
    localzzbq.zzb(paramActivity, new zzbh(paramOnConsentFormDismissedListener));
  }
  
  public static void loadConsentForm(Context paramContext, OnConsentFormLoadSuccessListener paramOnConsentFormLoadSuccessListener, OnConsentFormLoadFailureListener paramOnConsentFormLoadFailureListener)
  {
    zzc.zza(paramContext).zzc().zzb(paramOnConsentFormLoadSuccessListener, paramOnConsentFormLoadFailureListener);
  }
  
  public static void showPrivacyOptionsForm(Activity paramActivity, ConsentForm.OnConsentFormDismissedListener paramOnConsentFormDismissedListener)
  {
    zzc.zza(paramActivity).zzc().zze(paramActivity, paramOnConsentFormDismissedListener);
  }
  
  public static abstract interface OnConsentFormLoadFailureListener
  {
    public abstract void onConsentFormLoadFailure(FormError paramFormError);
  }
  
  public static abstract interface OnConsentFormLoadSuccessListener
  {
    public abstract void onConsentFormLoadSuccess(ConsentForm paramConsentForm);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\androi\\ump\UserMessagingPlatform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */