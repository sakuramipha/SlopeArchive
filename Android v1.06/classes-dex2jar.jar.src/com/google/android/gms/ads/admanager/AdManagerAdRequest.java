package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import java.util.List;

public final class AdManagerAdRequest
  extends AdRequest
{
  public Bundle getCustomTargeting()
  {
    return this.zza.zze();
  }
  
  public String getPublisherProvidedId()
  {
    return this.zza.zzl();
  }
  
  public static final class Builder
    extends AdRequest.Builder
  {
    public Builder addCategoryExclusion(String paramString)
    {
      this.zza.zzp(paramString);
      return this;
    }
    
    public Builder addCustomTargeting(String paramString1, String paramString2)
    {
      this.zza.zzr(paramString1, paramString2);
      return this;
    }
    
    public Builder addCustomTargeting(String paramString, List<String> paramList)
    {
      if (paramList != null) {
        this.zza.zzr(paramString, TextUtils.join(",", paramList));
      }
      return this;
    }
    
    public AdManagerAdRequest build()
    {
      return new AdManagerAdRequest(this, null);
    }
    
    public Builder setPublisherProvidedId(String paramString)
    {
      this.zza.zzE(paramString);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\admanager\AdManagerAdRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */