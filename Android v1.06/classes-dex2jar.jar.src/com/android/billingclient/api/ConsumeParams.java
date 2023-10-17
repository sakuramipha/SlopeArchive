package com.android.billingclient.api;

public final class ConsumeParams
{
  private String zza;
  
  public static Builder newBuilder()
  {
    return new Builder(null);
  }
  
  public String getPurchaseToken()
  {
    return this.zza;
  }
  
  public static final class Builder
  {
    private String zza;
    
    public ConsumeParams build()
    {
      String str = this.zza;
      if (str != null)
      {
        ConsumeParams localConsumeParams = new ConsumeParams(null);
        ConsumeParams.zza(localConsumeParams, str);
        return localConsumeParams;
      }
      throw new IllegalArgumentException("Purchase token must be set");
    }
    
    public Builder setPurchaseToken(String paramString)
    {
      this.zza = paramString;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\ConsumeParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */