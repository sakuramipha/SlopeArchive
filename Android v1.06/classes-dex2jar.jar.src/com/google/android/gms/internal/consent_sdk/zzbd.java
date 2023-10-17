package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener;
import com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener;

final class zzbd
  implements UserMessagingPlatform.OnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener
{
  private final UserMessagingPlatform.OnConsentFormLoadSuccessListener zza;
  private final UserMessagingPlatform.OnConsentFormLoadFailureListener zzb;
  
  public final void onConsentFormLoadFailure(FormError paramFormError)
  {
    this.zzb.onConsentFormLoadFailure(paramFormError);
  }
  
  public final void onConsentFormLoadSuccess(ConsentForm paramConsentForm)
  {
    this.zza.onConsentFormLoadSuccess(paramConsentForm);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */