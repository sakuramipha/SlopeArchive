package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class SkuDetails
{
  private final String zza;
  private final JSONObject zzb;
  
  public SkuDetails(String paramString)
    throws JSONException
  {
    this.zza = paramString;
    paramString = new JSONObject(paramString);
    this.zzb = paramString;
    if (!TextUtils.isEmpty(paramString.optString("productId")))
    {
      if (!TextUtils.isEmpty(paramString.optString("type"))) {
        return;
      }
      throw new IllegalArgumentException("SkuType cannot be empty.");
    }
    throw new IllegalArgumentException("SKU cannot be empty.");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SkuDetails)) {
      return false;
    }
    paramObject = (SkuDetails)paramObject;
    return TextUtils.equals(this.zza, ((SkuDetails)paramObject).zza);
  }
  
  public String getDescription()
  {
    return this.zzb.optString("description");
  }
  
  public String getFreeTrialPeriod()
  {
    return this.zzb.optString("freeTrialPeriod");
  }
  
  public String getIconUrl()
  {
    return this.zzb.optString("iconUrl");
  }
  
  public String getIntroductoryPrice()
  {
    return this.zzb.optString("introductoryPrice");
  }
  
  public long getIntroductoryPriceAmountMicros()
  {
    return this.zzb.optLong("introductoryPriceAmountMicros");
  }
  
  public int getIntroductoryPriceCycles()
  {
    return this.zzb.optInt("introductoryPriceCycles");
  }
  
  public String getIntroductoryPricePeriod()
  {
    return this.zzb.optString("introductoryPricePeriod");
  }
  
  public String getOriginalJson()
  {
    return this.zza;
  }
  
  public String getOriginalPrice()
  {
    if (this.zzb.has("original_price")) {
      return this.zzb.optString("original_price");
    }
    return getPrice();
  }
  
  public long getOriginalPriceAmountMicros()
  {
    if (this.zzb.has("original_price_micros")) {
      return this.zzb.optLong("original_price_micros");
    }
    return getPriceAmountMicros();
  }
  
  public String getPrice()
  {
    return this.zzb.optString("price");
  }
  
  public long getPriceAmountMicros()
  {
    return this.zzb.optLong("price_amount_micros");
  }
  
  public String getPriceCurrencyCode()
  {
    return this.zzb.optString("price_currency_code");
  }
  
  public String getSku()
  {
    return this.zzb.optString("productId");
  }
  
  public String getSubscriptionPeriod()
  {
    return this.zzb.optString("subscriptionPeriod");
  }
  
  public String getTitle()
  {
    return this.zzb.optString("title");
  }
  
  public String getType()
  {
    return this.zzb.optString("type");
  }
  
  public int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public String toString()
  {
    return "SkuDetails: ".concat(String.valueOf(this.zza));
  }
  
  public int zza()
  {
    return this.zzb.optInt("offer_type");
  }
  
  public String zzb()
  {
    return this.zzb.optString("offer_id");
  }
  
  public String zzc()
  {
    String str2 = this.zzb.optString("offerIdToken");
    String str1 = str2;
    if (str2.isEmpty()) {
      str1 = this.zzb.optString("offer_id_token");
    }
    return str1;
  }
  
  public final String zzd()
  {
    return this.zzb.optString("packageName");
  }
  
  public String zze()
  {
    return this.zzb.optString("serializedDocid");
  }
  
  final String zzf()
  {
    return this.zzb.optString("skuDetailsToken");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\SkuDetails.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */