package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PurchaseHistoryRecord
{
  private final String zza;
  private final String zzb;
  private final JSONObject zzc;
  
  public PurchaseHistoryRecord(String paramString1, String paramString2)
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
    if (!(paramObject instanceof PurchaseHistoryRecord)) {
      return false;
    }
    paramObject = (PurchaseHistoryRecord)paramObject;
    return (TextUtils.equals(this.zza, ((PurchaseHistoryRecord)paramObject).getOriginalJson())) && (TextUtils.equals(this.zzb, ((PurchaseHistoryRecord)paramObject).getSignature()));
  }
  
  public String getDeveloperPayload()
  {
    return this.zzc.optString("developerPayload");
  }
  
  public String getOriginalJson()
  {
    return this.zza;
  }
  
  public List<String> getProducts()
  {
    return zza();
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
  
  public String toString()
  {
    return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.zza));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\PurchaseHistoryRecord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */