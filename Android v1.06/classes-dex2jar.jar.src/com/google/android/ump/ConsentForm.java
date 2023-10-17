package com.google.android.ump;

import android.app.Activity;

public abstract interface ConsentForm
{
  public abstract void show(Activity paramActivity, OnConsentFormDismissedListener paramOnConsentFormDismissedListener);
  
  public static abstract interface OnConsentFormDismissedListener
  {
    public abstract void onConsentFormDismissed(FormError paramFormError);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\androi\\ump\ConsentForm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */