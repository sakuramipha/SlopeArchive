package com.android.billingclient.api;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class InAppMessageResult
{
  private final String mPurchaseToken;
  private final int mResponseCode;
  
  public InAppMessageResult(int paramInt, String paramString)
  {
    this.mResponseCode = paramInt;
    this.mPurchaseToken = paramString;
  }
  
  public String getPurchaseToken()
  {
    return this.mPurchaseToken;
  }
  
  public int getResponseCode()
  {
    return this.mResponseCode;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface InAppMessageResponseCode
  {
    public static final int NO_ACTION_NEEDED = 0;
    public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\InAppMessageResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */