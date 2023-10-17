package com.android.billingclient.api;

import org.json.JSONException;

@Deprecated
public class PriceChangeFlowParams
{
  private SkuDetails skuDetails;
  
  public static Builder newBuilder()
  {
    return new Builder();
  }
  
  public SkuDetails getSkuDetails()
  {
    return this.skuDetails;
  }
  
  @Deprecated
  public static class Builder
  {
    private SkuDetails skuDetails;
    
    private Builder setSkuDetails(String paramString)
    {
      try
      {
        SkuDetails localSkuDetails = new com/android/billingclient/api/SkuDetails;
        localSkuDetails.<init>(paramString);
        this.skuDetails = localSkuDetails;
        return this;
      }
      catch (JSONException paramString)
      {
        throw new IllegalArgumentException("Incorrect skuDetails JSON object!", paramString);
      }
    }
    
    public PriceChangeFlowParams build()
    {
      SkuDetails localSkuDetails = this.skuDetails;
      if (localSkuDetails != null)
      {
        PriceChangeFlowParams localPriceChangeFlowParams = new PriceChangeFlowParams();
        PriceChangeFlowParams.-$$Nest$fputskuDetails(localPriceChangeFlowParams, localSkuDetails);
        return localPriceChangeFlowParams;
      }
      throw new IllegalArgumentException("SkuDetails must be set");
    }
    
    public Builder setSkuDetails(SkuDetails paramSkuDetails)
    {
      this.skuDetails = paramSkuDetails;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\PriceChangeFlowParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */