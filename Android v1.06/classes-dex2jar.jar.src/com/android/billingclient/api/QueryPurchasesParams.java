package com.android.billingclient.api;

public final class QueryPurchasesParams
{
  private final String zza;
  
  public static Builder newBuilder()
  {
    return new Builder(null);
  }
  
  public final String zza()
  {
    return this.zza;
  }
  
  public static class Builder
  {
    private String zza;
    
    public QueryPurchasesParams build()
    {
      if (this.zza != null) {
        return new QueryPurchasesParams(this, null);
      }
      throw new IllegalArgumentException("Product type must be set");
    }
    
    public Builder setProductType(String paramString)
    {
      this.zza = paramString;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\QueryPurchasesParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */