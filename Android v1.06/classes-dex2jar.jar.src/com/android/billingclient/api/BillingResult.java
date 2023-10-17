package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;

public final class BillingResult
{
  private int zza;
  private String zzb;
  
  public static Builder newBuilder()
  {
    return new Builder(null);
  }
  
  public String getDebugMessage()
  {
    return this.zzb;
  }
  
  public int getResponseCode()
  {
    return this.zza;
  }
  
  public String toString()
  {
    String str2 = zzb.zzl(this.zza);
    String str1 = this.zzb;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Response Code: ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", Debug Message: ");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
  
  public static class Builder
  {
    private int zza;
    private String zzb = "";
    
    public BillingResult build()
    {
      BillingResult localBillingResult = new BillingResult();
      BillingResult.zzb(localBillingResult, this.zza);
      BillingResult.zza(localBillingResult, this.zzb);
      return localBillingResult;
    }
    
    public Builder setDebugMessage(String paramString)
    {
      this.zzb = paramString;
      return this;
    }
    
    public Builder setResponseCode(int paramInt)
    {
      this.zza = paramInt;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\BillingResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */