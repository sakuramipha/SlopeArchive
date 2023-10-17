package com.android.billingclient.api;

import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Purchase
{
  private final String zza;
  private final String zzb;
  private final JSONObject zzc;
  
  public Purchase(String paramString1, String paramString2)
    throws JSONException
  {
    this.zza = paramString1;
    this.zzb = paramString2;
    this.zzc = new JSONObject(paramString1);
  }
  
  private final ArrayList zza()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.zzc.has("productIds"))
    {
      JSONArray localJSONArray = this.zzc.optJSONArray("productIds");
      if (localJSONArray != null) {
        for (int i = 0; i < localJSONArray.length(); i++) {
          localArrayList.add(localJSONArray.optString(i));
        }
      }
    }
    else if (this.zzc.has("productId"))
    {
      localArrayList.add(this.zzc.optString("productId"));
    }
    return localArrayList;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Purchase)) {
      return false;
    }
    paramObject = (Purchase)paramObject;
    return (TextUtils.equals(this.zza, ((Purchase)paramObject).getOriginalJson())) && (TextUtils.equals(this.zzb, ((Purchase)paramObject).getSignature()));
  }
  
  public AccountIdentifiers getAccountIdentifiers()
  {
    String str2 = this.zzc.optString("obfuscatedAccountId");
    String str1 = this.zzc.optString("obfuscatedProfileId");
    if ((str2 == null) && (str1 == null)) {
      return null;
    }
    return new AccountIdentifiers(str2, str1);
  }
  
  public String getDeveloperPayload()
  {
    return this.zzc.optString("developerPayload");
  }
  
  public String getOrderId()
  {
    return this.zzc.optString("orderId");
  }
  
  public String getOriginalJson()
  {
    return this.zza;
  }
  
  public String getPackageName()
  {
    return this.zzc.optString("packageName");
  }
  
  public List<String> getProducts()
  {
    return zza();
  }
  
  public int getPurchaseState()
  {
    if (this.zzc.optInt("purchaseState", 1) != 4) {
      return 1;
    }
    return 2;
  }
  
  public long getPurchaseTime()
  {
    return this.zzc.optLong("purchaseTime");
  }
  
  public String getPurchaseToken()
  {
    JSONObject localJSONObject = this.zzc;
    return localJSONObject.optString("token", localJSONObject.optString("purchaseToken"));
  }
  
  public int getQuantity()
  {
    return this.zzc.optInt("quantity", 1);
  }
  
  public String getSignature()
  {
    return this.zzb;
  }
  
  @Deprecated
  public ArrayList<String> getSkus()
  {
    return zza();
  }
  
  public int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public boolean isAcknowledged()
  {
    return this.zzc.optBoolean("acknowledged", true);
  }
  
  public boolean isAutoRenewing()
  {
    return this.zzc.optBoolean("autoRenewing");
  }
  
  public String toString()
  {
    return "Purchase. Json: ".concat(String.valueOf(this.zza));
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface PurchaseState
  {
    public static final int PENDING = 2;
    public static final int PURCHASED = 1;
    public static final int UNSPECIFIED_STATE = 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\Purchase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */