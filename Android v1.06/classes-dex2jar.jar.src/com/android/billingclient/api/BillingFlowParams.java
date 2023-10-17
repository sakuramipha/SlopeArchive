package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzm;
import com.google.android.gms.internal.play_billing.zzu;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class BillingFlowParams
{
  public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
  private boolean zza;
  private String zzb;
  private String zzc;
  private SubscriptionUpdateParams zzd;
  private zzu zze;
  private ArrayList zzf;
  private boolean zzg;
  
  public static Builder newBuilder()
  {
    return new Builder(null);
  }
  
  public final int zza()
  {
    return this.zzd.zza();
  }
  
  public final String zzb()
  {
    return this.zzb;
  }
  
  public final String zzc()
  {
    return this.zzc;
  }
  
  public final String zzd()
  {
    return this.zzd.zzc();
  }
  
  public final ArrayList zze()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.zzf);
    return localArrayList;
  }
  
  public final List zzf()
  {
    return this.zze;
  }
  
  public final boolean zzn()
  {
    return this.zzg;
  }
  
  final boolean zzo()
  {
    return (this.zzb != null) || (this.zzc != null) || (this.zzd.zza() != 0) || (this.zza) || (this.zzg);
  }
  
  public static class Builder
  {
    private String zza;
    private String zzb;
    private List zzc;
    private ArrayList zzd;
    private boolean zze;
    private BillingFlowParams.SubscriptionUpdateParams.Builder zzf;
    
    private Builder()
    {
      BillingFlowParams.SubscriptionUpdateParams.Builder localBuilder = BillingFlowParams.SubscriptionUpdateParams.newBuilder();
      BillingFlowParams.SubscriptionUpdateParams.Builder.zza(localBuilder);
      this.zzf = localBuilder;
    }
    
    public BillingFlowParams build()
    {
      Object localObject1 = this.zzd;
      boolean bool2 = true;
      int i;
      if ((localObject1 != null) && (!((ArrayList)localObject1).isEmpty())) {
        i = 1;
      } else {
        i = 0;
      }
      localObject1 = this.zzc;
      int j;
      if ((localObject1 != null) && (!((List)localObject1).isEmpty())) {
        j = 1;
      } else {
        j = 0;
      }
      if ((i == 0) && (j == 0)) {
        throw new IllegalArgumentException("Details of the products must be provided.");
      }
      if ((i != 0) && (j != 0)) {
        throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
      }
      Object localObject3;
      int k;
      Object localObject4;
      if (i != 0)
      {
        if (!this.zzd.contains(null))
        {
          if (this.zzd.size() > 1)
          {
            localObject3 = (SkuDetails)this.zzd.get(0);
            localObject1 = ((SkuDetails)localObject3).getType();
            localObject2 = this.zzd;
            int m = ((List)localObject2).size();
            for (k = 0; k < m; k++)
            {
              localObject4 = (SkuDetails)((List)localObject2).get(k);
              if ((!((String)localObject1).equals("play_pass_subs")) && (!((SkuDetails)localObject4).getType().equals("play_pass_subs")) && (!((String)localObject1).equals(((SkuDetails)localObject4).getType()))) {
                throw new IllegalArgumentException("SKUs should have the same type.");
              }
            }
            localObject2 = ((SkuDetails)localObject3).zzd();
            localObject3 = this.zzd;
            m = ((List)localObject3).size();
            for (k = 0; k < m; k++)
            {
              localObject4 = (SkuDetails)((List)localObject3).get(k);
              if ((!((String)localObject1).equals("play_pass_subs")) && (!((SkuDetails)localObject4).getType().equals("play_pass_subs")) && (!((String)localObject2).equals(((SkuDetails)localObject4).zzd()))) {
                throw new IllegalArgumentException("All SKUs must have the same package name.");
              }
            }
          }
        }
        else {
          throw new IllegalArgumentException("SKU cannot be null.");
        }
      }
      else
      {
        localObject1 = (BillingFlowParams.ProductDetailsParams)this.zzc.get(0);
        k = 0;
        while (k < this.zzc.size())
        {
          localObject2 = (BillingFlowParams.ProductDetailsParams)this.zzc.get(k);
          if (localObject2 != null)
          {
            if ((k != 0) && (!((BillingFlowParams.ProductDetailsParams)localObject2).zza().getProductType().equals(((BillingFlowParams.ProductDetailsParams)localObject1).zza().getProductType())) && (!((BillingFlowParams.ProductDetailsParams)localObject2).zza().getProductType().equals("play_pass_subs"))) {
              throw new IllegalArgumentException("All products should have same ProductType.");
            }
            k++;
          }
          else
          {
            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
          }
        }
        localObject4 = ((BillingFlowParams.ProductDetailsParams)localObject1).zza().zza();
        localObject3 = this.zzc.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (BillingFlowParams.ProductDetailsParams)((Iterator)localObject3).next();
          if ((!((BillingFlowParams.ProductDetailsParams)localObject1).zza().getProductType().equals("play_pass_subs")) && (!((BillingFlowParams.ProductDetailsParams)localObject2).zza().getProductType().equals("play_pass_subs")) && (!((String)localObject4).equals(((BillingFlowParams.ProductDetailsParams)localObject2).zza().zza()))) {
            throw new IllegalArgumentException("All products must have the same package name.");
          }
        }
      }
      Object localObject2 = new BillingFlowParams(null);
      boolean bool1;
      if (i != 0)
      {
        bool1 = bool2;
        if (!((SkuDetails)this.zzd.get(0)).zzd().isEmpty()) {}
      }
      else if ((j != 0) && (!((BillingFlowParams.ProductDetailsParams)this.zzc.get(0)).zza().zza().isEmpty()))
      {
        bool1 = bool2;
      }
      else
      {
        bool1 = false;
      }
      BillingFlowParams.zzg((BillingFlowParams)localObject2, bool1);
      BillingFlowParams.zzi((BillingFlowParams)localObject2, this.zza);
      BillingFlowParams.zzj((BillingFlowParams)localObject2, this.zzb);
      BillingFlowParams.zzm((BillingFlowParams)localObject2, this.zzf.build());
      localObject1 = this.zzd;
      if (localObject1 != null) {
        localObject1 = new ArrayList((Collection)localObject1);
      } else {
        localObject1 = new ArrayList();
      }
      BillingFlowParams.zzl((BillingFlowParams)localObject2, (ArrayList)localObject1);
      BillingFlowParams.zzh((BillingFlowParams)localObject2, this.zze);
      localObject1 = this.zzc;
      if (localObject1 != null) {
        localObject1 = zzu.zzk((Collection)localObject1);
      } else {
        localObject1 = zzu.zzl();
      }
      BillingFlowParams.zzk((BillingFlowParams)localObject2, (zzu)localObject1);
      return (BillingFlowParams)localObject2;
    }
    
    public Builder setIsOfferPersonalized(boolean paramBoolean)
    {
      this.zze = paramBoolean;
      return this;
    }
    
    public Builder setObfuscatedAccountId(String paramString)
    {
      this.zza = paramString;
      return this;
    }
    
    public Builder setObfuscatedProfileId(String paramString)
    {
      this.zzb = paramString;
      return this;
    }
    
    public Builder setProductDetailsParamsList(List<BillingFlowParams.ProductDetailsParams> paramList)
    {
      this.zzc = new ArrayList(paramList);
      return this;
    }
    
    @Deprecated
    public Builder setSkuDetails(SkuDetails paramSkuDetails)
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramSkuDetails);
      this.zzd = localArrayList;
      return this;
    }
    
    public Builder setSubscriptionUpdateParams(BillingFlowParams.SubscriptionUpdateParams paramSubscriptionUpdateParams)
    {
      this.zzf = BillingFlowParams.SubscriptionUpdateParams.zzb(paramSubscriptionUpdateParams);
      return this;
    }
  }
  
  public static final class ProductDetailsParams
  {
    private final ProductDetails zza;
    private final String zzb;
    
    public static Builder newBuilder()
    {
      return new Builder(null);
    }
    
    public final ProductDetails zza()
    {
      return this.zza;
    }
    
    public final String zzb()
    {
      return this.zzb;
    }
    
    public static class Builder
    {
      private ProductDetails zza;
      private String zzb;
      
      public BillingFlowParams.ProductDetailsParams build()
      {
        zzm.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
        zzm.zzc(this.zzb, "offerToken is required for constructing ProductDetailsParams.");
        return new BillingFlowParams.ProductDetailsParams(this, null);
      }
      
      public Builder setOfferToken(String paramString)
      {
        this.zzb = paramString;
        return this;
      }
      
      public Builder setProductDetails(ProductDetails paramProductDetails)
      {
        this.zza = paramProductDetails;
        if (paramProductDetails.getOneTimePurchaseOfferDetails() != null)
        {
          Objects.requireNonNull(paramProductDetails.getOneTimePurchaseOfferDetails());
          this.zzb = paramProductDetails.getOneTimePurchaseOfferDetails().zza();
        }
        return this;
      }
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ProrationMode
  {
    public static final int DEFERRED = 4;
    public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
    public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
    public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
    public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
    public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
  }
  
  public static class SubscriptionUpdateParams
  {
    private String zza;
    private int zzb = 0;
    
    public static Builder newBuilder()
    {
      return new Builder(null);
    }
    
    final int zza()
    {
      return this.zzb;
    }
    
    final String zzc()
    {
      return this.zza;
    }
    
    public static class Builder
    {
      private String zza;
      private boolean zzb;
      private int zzc = 0;
      
      public BillingFlowParams.SubscriptionUpdateParams build()
      {
        int i;
        if ((TextUtils.isEmpty(this.zza)) && (TextUtils.isEmpty(null))) {
          i = 0;
        } else {
          i = 1;
        }
        boolean bool = true ^ TextUtils.isEmpty(null);
        if ((i != 0) && (bool)) {
          throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if ((!this.zzb) && (i == 0) && (!bool)) {
          throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        BillingFlowParams.SubscriptionUpdateParams localSubscriptionUpdateParams = new BillingFlowParams.SubscriptionUpdateParams(null);
        BillingFlowParams.SubscriptionUpdateParams.zzd(localSubscriptionUpdateParams, this.zza);
        BillingFlowParams.SubscriptionUpdateParams.zze(localSubscriptionUpdateParams, this.zzc);
        return localSubscriptionUpdateParams;
      }
      
      public Builder setOldPurchaseToken(String paramString)
      {
        this.zza = paramString;
        return this;
      }
      
      @Deprecated
      public Builder setOldSkuPurchaseToken(String paramString)
      {
        this.zza = paramString;
        return this;
      }
      
      public Builder setReplaceProrationMode(int paramInt)
      {
        this.zzc = paramInt;
        return this;
      }
      
      @Deprecated
      public Builder setReplaceSkusProrationMode(int paramInt)
      {
        this.zzc = paramInt;
        return this;
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\BillingFlowParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */