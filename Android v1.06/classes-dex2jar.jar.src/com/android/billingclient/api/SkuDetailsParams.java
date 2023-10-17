package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public class SkuDetailsParams
{
  private String zza;
  private List zzb;
  
  public static Builder newBuilder()
  {
    return new Builder(null);
  }
  
  public String getSkuType()
  {
    return this.zza;
  }
  
  public List<String> getSkusList()
  {
    return this.zzb;
  }
  
  public static class Builder
  {
    private String zza;
    private List zzb;
    
    public SkuDetailsParams build()
    {
      String str = this.zza;
      if (str != null)
      {
        if (this.zzb != null)
        {
          SkuDetailsParams localSkuDetailsParams = new SkuDetailsParams();
          SkuDetailsParams.zza(localSkuDetailsParams, str);
          SkuDetailsParams.zzb(localSkuDetailsParams, this.zzb);
          return localSkuDetailsParams;
        }
        throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
      }
      throw new IllegalArgumentException("SKU type must be set");
    }
    
    public Builder setSkusList(List<String> paramList)
    {
      this.zzb = new ArrayList(paramList);
      return this;
    }
    
    public Builder setType(String paramString)
    {
      this.zza = paramString;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\SkuDetailsParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */