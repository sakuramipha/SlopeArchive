package com.google.android.ump;

import android.app.Activity;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract interface ConsentInformation
{
  public abstract boolean canRequestAds();
  
  public abstract int getConsentStatus();
  
  public abstract PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();
  
  public abstract boolean isConsentFormAvailable();
  
  public abstract void requestConsentInfoUpdate(Activity paramActivity, ConsentRequestParameters paramConsentRequestParameters, OnConsentInfoUpdateSuccessListener paramOnConsentInfoUpdateSuccessListener, OnConsentInfoUpdateFailureListener paramOnConsentInfoUpdateFailureListener);
  
  public abstract void reset();
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ConsentStatus
  {
    public static final int NOT_REQUIRED = 1;
    public static final int OBTAINED = 3;
    public static final int REQUIRED = 2;
    public static final int UNKNOWN = 0;
  }
  
  public static abstract interface OnConsentInfoUpdateFailureListener
  {
    public abstract void onConsentInfoUpdateFailure(FormError paramFormError);
  }
  
  public static abstract interface OnConsentInfoUpdateSuccessListener
  {
    public abstract void onConsentInfoUpdateSuccess();
  }
  
  public static enum PrivacyOptionsRequirementStatus
  {
    private static final PrivacyOptionsRequirementStatus[] zza;
    
    static
    {
      PrivacyOptionsRequirementStatus localPrivacyOptionsRequirementStatus2 = new PrivacyOptionsRequirementStatus("UNKNOWN", 0);
      UNKNOWN = localPrivacyOptionsRequirementStatus2;
      PrivacyOptionsRequirementStatus localPrivacyOptionsRequirementStatus1 = new PrivacyOptionsRequirementStatus("NOT_REQUIRED", 1);
      NOT_REQUIRED = localPrivacyOptionsRequirementStatus1;
      PrivacyOptionsRequirementStatus localPrivacyOptionsRequirementStatus3 = new PrivacyOptionsRequirementStatus("REQUIRED", 2);
      REQUIRED = localPrivacyOptionsRequirementStatus3;
      zza = new PrivacyOptionsRequirementStatus[] { localPrivacyOptionsRequirementStatus2, localPrivacyOptionsRequirementStatus1, localPrivacyOptionsRequirementStatus3 };
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\androi\\ump\ConsentInformation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */