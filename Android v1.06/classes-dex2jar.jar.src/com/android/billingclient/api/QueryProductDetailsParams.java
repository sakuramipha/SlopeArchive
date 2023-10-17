package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class QueryProductDetailsParams
{
  private final zzu zza;
  
  public static Builder newBuilder()
  {
    return new Builder(null);
  }
  
  public final zzu zza()
  {
    return this.zza;
  }
  
  public final String zzb()
  {
    return ((Product)this.zza.get(0)).zzb();
  }
  
  public static class Builder
  {
    private zzu zza;
    
    public QueryProductDetailsParams build()
    {
      return new QueryProductDetailsParams(this, null);
    }
    
    public Builder setProductList(List<QueryProductDetailsParams.Product> paramList)
    {
      if ((paramList != null) && (!paramList.isEmpty()))
      {
        HashSet localHashSet = new HashSet();
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          QueryProductDetailsParams.Product localProduct = (QueryProductDetailsParams.Product)localIterator.next();
          if (!"play_pass_subs".equals(localProduct.zzb())) {
            localHashSet.add(localProduct.zzb());
          }
        }
        if (localHashSet.size() <= 1)
        {
          this.zza = zzu.zzk(paramList);
          return this;
        }
        throw new IllegalArgumentException("All products should be of the same product type.");
      }
      throw new IllegalArgumentException("Product list cannot be empty.");
    }
  }
  
  public static class Product
  {
    private final String zza;
    private final String zzb;
    
    public static Builder newBuilder()
    {
      return new Builder(null);
    }
    
    public final String zza()
    {
      return this.zza;
    }
    
    public final String zzb()
    {
      return this.zzb;
    }
    
    public static class Builder
    {
      private String zza;
      private String zzb;
      
      public QueryProductDetailsParams.Product build()
      {
        if (!"first_party".equals(this.zzb))
        {
          if (this.zza != null)
          {
            if (this.zzb != null) {
              return new QueryProductDetailsParams.Product(this, null);
            }
            throw new IllegalArgumentException("Product type must be provided.");
          }
          throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
      }
      
      public Builder setProductId(String paramString)
      {
        this.zza = paramString;
        return this;
      }
      
      public Builder setProductType(String paramString)
      {
        this.zzb = paramString;
        return this;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\QueryProductDetailsParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */