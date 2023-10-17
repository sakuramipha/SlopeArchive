package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class BillingClient
{
  public static Builder newBuilder(Context paramContext)
  {
    return new Builder(paramContext, null);
  }
  
  public abstract void acknowledgePurchase(AcknowledgePurchaseParams paramAcknowledgePurchaseParams, AcknowledgePurchaseResponseListener paramAcknowledgePurchaseResponseListener);
  
  public abstract void consumeAsync(ConsumeParams paramConsumeParams, ConsumeResponseListener paramConsumeResponseListener);
  
  public abstract void endConnection();
  
  public abstract int getConnectionState();
  
  public abstract BillingResult isFeatureSupported(String paramString);
  
  public abstract boolean isReady();
  
  public abstract BillingResult launchBillingFlow(Activity paramActivity, BillingFlowParams paramBillingFlowParams);
  
  @Deprecated
  public abstract void launchPriceChangeConfirmationFlow(Activity paramActivity, PriceChangeFlowParams paramPriceChangeFlowParams, PriceChangeConfirmationListener paramPriceChangeConfirmationListener);
  
  public abstract void queryProductDetailsAsync(QueryProductDetailsParams paramQueryProductDetailsParams, ProductDetailsResponseListener paramProductDetailsResponseListener);
  
  public abstract void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams paramQueryPurchaseHistoryParams, PurchaseHistoryResponseListener paramPurchaseHistoryResponseListener);
  
  @Deprecated
  public abstract void queryPurchaseHistoryAsync(String paramString, PurchaseHistoryResponseListener paramPurchaseHistoryResponseListener);
  
  public abstract void queryPurchasesAsync(QueryPurchasesParams paramQueryPurchasesParams, PurchasesResponseListener paramPurchasesResponseListener);
  
  @Deprecated
  public abstract void queryPurchasesAsync(String paramString, PurchasesResponseListener paramPurchasesResponseListener);
  
  @Deprecated
  public abstract void querySkuDetailsAsync(SkuDetailsParams paramSkuDetailsParams, SkuDetailsResponseListener paramSkuDetailsResponseListener);
  
  public abstract BillingResult showInAppMessages(Activity paramActivity, InAppMessageParams paramInAppMessageParams, InAppMessageResponseListener paramInAppMessageResponseListener);
  
  public abstract void startConnection(BillingClientStateListener paramBillingClientStateListener);
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface BillingResponseCode
  {
    public static final int BILLING_UNAVAILABLE = 3;
    public static final int DEVELOPER_ERROR = 5;
    public static final int ERROR = 6;
    public static final int FEATURE_NOT_SUPPORTED = -2;
    public static final int ITEM_ALREADY_OWNED = 7;
    public static final int ITEM_NOT_OWNED = 8;
    public static final int ITEM_UNAVAILABLE = 4;
    public static final int OK = 0;
    public static final int SERVICE_DISCONNECTED = -1;
    public static final int SERVICE_TIMEOUT = -3;
    public static final int SERVICE_UNAVAILABLE = 2;
    public static final int USER_CANCELED = 1;
  }
  
  public static final class Builder
  {
    private volatile String zza;
    private volatile boolean zzb;
    private final Context zzc;
    private volatile PurchasesUpdatedListener zzd;
    private volatile zzbf zze;
    private volatile zzc zzf;
    
    public BillingClient build()
    {
      if (this.zzc != null)
      {
        if (this.zzd != null)
        {
          if (this.zzb)
          {
            if (this.zzd != null) {
              return new BillingClientImpl(null, this.zzb, this.zzc, this.zzd, null);
            }
            return new BillingClientImpl(null, this.zzb, this.zzc, null);
          }
          throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
        }
        throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
      }
      throw new IllegalArgumentException("Please provide a valid Context.");
    }
    
    public Builder enablePendingPurchases()
    {
      this.zzb = true;
      return this;
    }
    
    public Builder setListener(PurchasesUpdatedListener paramPurchasesUpdatedListener)
    {
      this.zzd = paramPurchasesUpdatedListener;
      return this;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ConnectionState
  {
    public static final int CLOSED = 3;
    public static final int CONNECTED = 2;
    public static final int CONNECTING = 1;
    public static final int DISCONNECTED = 0;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface FeatureType
  {
    public static final String IN_APP_MESSAGING = "bbb";
    public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
    public static final String PRODUCT_DETAILS = "fff";
    public static final String SUBSCRIPTIONS = "subscriptions";
    public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ProductType
  {
    public static final String INAPP = "inapp";
    public static final String SUBS = "subs";
  }
  
  @Deprecated
  @Retention(RetentionPolicy.SOURCE)
  public static @interface SkuType
  {
    public static final String INAPP = "inapp";
    public static final String SUBS = "subs";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\BillingClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */