package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzu;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ProductDetails
{
  private final String zza;
  private final JSONObject zzb;
  private final String zzc;
  private final String zzd;
  private final String zze;
  private final String zzf;
  private final String zzg;
  private final String zzh;
  private final String zzi;
  private final List zzj;
  private final List zzk;
  private final zzbi zzl;
  
  ProductDetails(String paramString)
    throws JSONException
  {
    this.zza = paramString;
    JSONObject localJSONObject = new JSONObject(paramString);
    this.zzb = localJSONObject;
    Object localObject = localJSONObject.optString("productId");
    this.zzc = ((String)localObject);
    paramString = localJSONObject.optString("type");
    this.zzd = paramString;
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      if (!TextUtils.isEmpty(paramString))
      {
        this.zze = localJSONObject.optString("title");
        this.zzf = localJSONObject.optString("name");
        this.zzg = localJSONObject.optString("description");
        this.zzh = localJSONObject.optString("skuDetailsToken");
        this.zzi = localJSONObject.optString("serializedDocid");
        localObject = localJSONObject.optJSONArray("subscriptionOfferDetails");
        int j = 0;
        int i;
        if (localObject != null)
        {
          paramString = new ArrayList();
          for (i = 0; i < ((JSONArray)localObject).length(); i++) {
            paramString.add(new SubscriptionOfferDetails(((JSONArray)localObject).getJSONObject(i)));
          }
          this.zzj = paramString;
        }
        else
        {
          if ((!paramString.equals("subs")) && (!paramString.equals("play_pass_subs"))) {
            paramString = null;
          } else {
            paramString = new ArrayList();
          }
          this.zzj = paramString;
        }
        localJSONObject = this.zzb.optJSONObject("oneTimePurchaseOfferDetails");
        paramString = this.zzb.optJSONArray("oneTimePurchaseOfferDetailsList");
        localObject = new ArrayList();
        if (paramString != null)
        {
          for (i = j; i < paramString.length(); i++) {
            ((List)localObject).add(new OneTimePurchaseOfferDetails(paramString.getJSONObject(i)));
          }
          this.zzk = ((List)localObject);
        }
        else if (localJSONObject != null)
        {
          ((List)localObject).add(new OneTimePurchaseOfferDetails(localJSONObject));
          this.zzk = ((List)localObject);
        }
        else
        {
          this.zzk = null;
        }
        paramString = this.zzb.optJSONObject("limitedQuantityInfo");
        if (paramString != null)
        {
          this.zzl = new zzbi(paramString);
          return;
        }
        this.zzl = null;
        return;
      }
      throw new IllegalArgumentException("Product type cannot be empty.");
    }
    throw new IllegalArgumentException("Product id cannot be empty.");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ProductDetails)) {
      return false;
    }
    paramObject = (ProductDetails)paramObject;
    return TextUtils.equals(this.zza, ((ProductDetails)paramObject).zza);
  }
  
  public String getDescription()
  {
    return this.zzg;
  }
  
  public String getName()
  {
    return this.zzf;
  }
  
  public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails()
  {
    List localList = this.zzk;
    if ((localList != null) && (!localList.isEmpty())) {
      return (OneTimePurchaseOfferDetails)this.zzk.get(0);
    }
    return null;
  }
  
  public String getProductId()
  {
    return this.zzc;
  }
  
  public String getProductType()
  {
    return this.zzd;
  }
  
  public List<SubscriptionOfferDetails> getSubscriptionOfferDetails()
  {
    return this.zzj;
  }
  
  public String getTitle()
  {
    return this.zze;
  }
  
  public int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public String toString()
  {
    String str1 = this.zza;
    String str6 = this.zzb.toString();
    String str2 = this.zzc;
    String str7 = this.zzd;
    String str5 = this.zze;
    String str3 = this.zzh;
    String str4 = String.valueOf(this.zzj);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ProductDetails{jsonString='");
    localStringBuilder.append(str1);
    localStringBuilder.append("', parsedJson=");
    localStringBuilder.append(str6);
    localStringBuilder.append(", productId='");
    localStringBuilder.append(str2);
    localStringBuilder.append("', productType='");
    localStringBuilder.append(str7);
    localStringBuilder.append("', title='");
    localStringBuilder.append(str5);
    localStringBuilder.append("', productDetailsToken='");
    localStringBuilder.append(str3);
    localStringBuilder.append("', subscriptionOfferDetails=");
    localStringBuilder.append(str4);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final String zza()
  {
    return this.zzb.optString("packageName");
  }
  
  final String zzb()
  {
    return this.zzh;
  }
  
  public String zzc()
  {
    return this.zzi;
  }
  
  public static final class OneTimePurchaseOfferDetails
  {
    private final String zza;
    private final long zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzu zzf;
    
    OneTimePurchaseOfferDetails(JSONObject paramJSONObject)
      throws JSONException
    {
      this.zza = paramJSONObject.optString("formattedPrice");
      this.zzb = paramJSONObject.optLong("priceAmountMicros");
      this.zzc = paramJSONObject.optString("priceCurrencyCode");
      this.zzd = paramJSONObject.optString("offerIdToken");
      this.zze = paramJSONObject.optString("offerId");
      paramJSONObject.optInt("offerType");
      paramJSONObject = paramJSONObject.optJSONArray("offerTags");
      ArrayList localArrayList = new ArrayList();
      if (paramJSONObject != null) {
        for (int i = 0; i < paramJSONObject.length(); i++) {
          localArrayList.add(paramJSONObject.getString(i));
        }
      }
      this.zzf = zzu.zzk(localArrayList);
    }
    
    public String getFormattedPrice()
    {
      return this.zza;
    }
    
    public long getPriceAmountMicros()
    {
      return this.zzb;
    }
    
    public String getPriceCurrencyCode()
    {
      return this.zzc;
    }
    
    public final String zza()
    {
      return this.zzd;
    }
  }
  
  public static final class PricingPhase
  {
    private final int billingCycleCount;
    private final String billingPeriod;
    private final String formattedPrice;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;
    private final int recurrenceMode;
    
    PricingPhase(JSONObject paramJSONObject)
    {
      this.billingPeriod = paramJSONObject.optString("billingPeriod");
      this.priceCurrencyCode = paramJSONObject.optString("priceCurrencyCode");
      this.formattedPrice = paramJSONObject.optString("formattedPrice");
      this.priceAmountMicros = paramJSONObject.optLong("priceAmountMicros");
      this.recurrenceMode = paramJSONObject.optInt("recurrenceMode");
      this.billingCycleCount = paramJSONObject.optInt("billingCycleCount");
    }
    
    public int getBillingCycleCount()
    {
      return this.billingCycleCount;
    }
    
    public String getBillingPeriod()
    {
      return this.billingPeriod;
    }
    
    public String getFormattedPrice()
    {
      return this.formattedPrice;
    }
    
    public long getPriceAmountMicros()
    {
      return this.priceAmountMicros;
    }
    
    public String getPriceCurrencyCode()
    {
      return this.priceCurrencyCode;
    }
    
    public int getRecurrenceMode()
    {
      return this.recurrenceMode;
    }
  }
  
  public static class PricingPhases
  {
    private final List<ProductDetails.PricingPhase> pricingPhaseList;
    
    PricingPhases(JSONArray paramJSONArray)
    {
      ArrayList localArrayList = new ArrayList();
      if (paramJSONArray != null) {
        for (int i = 0; i < paramJSONArray.length(); i++)
        {
          JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
          if (localJSONObject != null) {
            localArrayList.add(new ProductDetails.PricingPhase(localJSONObject));
          }
        }
      }
      this.pricingPhaseList = localArrayList;
    }
    
    public List<ProductDetails.PricingPhase> getPricingPhaseList()
    {
      return this.pricingPhaseList;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface RecurrenceMode
  {
    public static final int FINITE_RECURRING = 2;
    public static final int INFINITE_RECURRING = 1;
    public static final int NON_RECURRING = 3;
  }
  
  public static final class SubscriptionOfferDetails
  {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final ProductDetails.PricingPhases zzd;
    private final List zze;
    private final zzbh zzf;
    
    SubscriptionOfferDetails(JSONObject paramJSONObject)
      throws JSONException
    {
      this.zza = paramJSONObject.optString("basePlanId");
      Object localObject1 = paramJSONObject.optString("offerId");
      boolean bool = ((String)localObject1).isEmpty();
      Object localObject2 = null;
      if (true == bool) {
        localObject1 = null;
      }
      this.zzb = ((String)localObject1);
      this.zzc = paramJSONObject.getString("offerIdToken");
      this.zzd = new ProductDetails.PricingPhases(paramJSONObject.getJSONArray("pricingPhases"));
      localObject1 = paramJSONObject.optJSONObject("installmentPlanDetails");
      if (localObject1 == null) {
        localObject1 = localObject2;
      } else {
        localObject1 = new zzbh((JSONObject)localObject1);
      }
      this.zzf = ((zzbh)localObject1);
      localObject1 = new ArrayList();
      paramJSONObject = paramJSONObject.optJSONArray("offerTags");
      if (paramJSONObject != null) {
        for (int i = 0; i < paramJSONObject.length(); i++) {
          ((List)localObject1).add(paramJSONObject.getString(i));
        }
      }
      this.zze = ((List)localObject1);
    }
    
    public String getBasePlanId()
    {
      return this.zza;
    }
    
    public String getOfferId()
    {
      return this.zzb;
    }
    
    public List<String> getOfferTags()
    {
      return this.zze;
    }
    
    public String getOfferToken()
    {
      return this.zzc;
    }
    
    public ProductDetails.PricingPhases getPricingPhases()
    {
      return this.zzd;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\ProductDetails.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */