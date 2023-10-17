package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;

public final class DynamicHeightSearchAdRequest
{
  private final SearchAdRequest zza;
  
  public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> paramClass)
  {
    return this.zza.getCustomEventExtrasBundle(paramClass);
  }
  
  public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> paramClass)
  {
    return this.zza.getNetworkExtrasBundle(paramClass);
  }
  
  public String getQuery()
  {
    return this.zza.getQuery();
  }
  
  public boolean isTestDevice(Context paramContext)
  {
    return this.zza.isTestDevice(paramContext);
  }
  
  final zzdx zza()
  {
    return this.zza.zza();
  }
  
  public static final class Builder
  {
    private final zzb zza = new zzb();
    private final Bundle zzb = new Bundle();
    
    public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
    {
      this.zza.zzb(paramClass, paramBundle);
      return this;
    }
    
    public Builder addNetworkExtras(NetworkExtras paramNetworkExtras)
    {
      this.zza.zzc(paramNetworkExtras);
      return this;
    }
    
    public Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> paramClass, Bundle paramBundle)
    {
      this.zza.zzd(paramClass, paramBundle);
      return this;
    }
    
    public DynamicHeightSearchAdRequest build()
    {
      this.zza.zzd(AdMobAdapter.class, this.zzb);
      return new DynamicHeightSearchAdRequest(this, null);
    }
    
    public Builder setAdBorderSelectors(String paramString)
    {
      this.zzb.putString("csa_adBorderSelectors", paramString);
      return this;
    }
    
    public Builder setAdTest(boolean paramBoolean)
    {
      Bundle localBundle = this.zzb;
      String str;
      if (true != paramBoolean) {
        str = "off";
      } else {
        str = "on";
      }
      localBundle.putString("csa_adtest", str);
      return this;
    }
    
    public Builder setAdjustableLineHeight(int paramInt)
    {
      this.zzb.putString("csa_adjustableLineHeight", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setAdvancedOptionValue(String paramString1, String paramString2)
    {
      this.zzb.putString(paramString1, paramString2);
      return this;
    }
    
    public Builder setAttributionSpacingBelow(int paramInt)
    {
      this.zzb.putString("csa_attributionSpacingBelow", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setBorderSelections(String paramString)
    {
      this.zzb.putString("csa_borderSelections", paramString);
      return this;
    }
    
    public Builder setChannel(String paramString)
    {
      this.zzb.putString("csa_channel", paramString);
      return this;
    }
    
    public Builder setColorAdBorder(String paramString)
    {
      this.zzb.putString("csa_colorAdBorder", paramString);
      return this;
    }
    
    public Builder setColorAdSeparator(String paramString)
    {
      this.zzb.putString("csa_colorAdSeparator", paramString);
      return this;
    }
    
    public Builder setColorAnnotation(String paramString)
    {
      this.zzb.putString("csa_colorAnnotation", paramString);
      return this;
    }
    
    public Builder setColorAttribution(String paramString)
    {
      this.zzb.putString("csa_colorAttribution", paramString);
      return this;
    }
    
    public Builder setColorBackground(String paramString)
    {
      this.zzb.putString("csa_colorBackground", paramString);
      return this;
    }
    
    public Builder setColorBorder(String paramString)
    {
      this.zzb.putString("csa_colorBorder", paramString);
      return this;
    }
    
    public Builder setColorDomainLink(String paramString)
    {
      this.zzb.putString("csa_colorDomainLink", paramString);
      return this;
    }
    
    public Builder setColorText(String paramString)
    {
      this.zzb.putString("csa_colorText", paramString);
      return this;
    }
    
    public Builder setColorTitleLink(String paramString)
    {
      this.zzb.putString("csa_colorTitleLink", paramString);
      return this;
    }
    
    public Builder setCssWidth(int paramInt)
    {
      this.zzb.putString("csa_width", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setDetailedAttribution(boolean paramBoolean)
    {
      this.zzb.putString("csa_detailedAttribution", Boolean.toString(paramBoolean));
      return this;
    }
    
    public Builder setFontFamily(String paramString)
    {
      this.zzb.putString("csa_fontFamily", paramString);
      return this;
    }
    
    public Builder setFontFamilyAttribution(String paramString)
    {
      this.zzb.putString("csa_fontFamilyAttribution", paramString);
      return this;
    }
    
    public Builder setFontSizeAnnotation(int paramInt)
    {
      this.zzb.putString("csa_fontSizeAnnotation", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setFontSizeAttribution(int paramInt)
    {
      this.zzb.putString("csa_fontSizeAttribution", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setFontSizeDescription(int paramInt)
    {
      this.zzb.putString("csa_fontSizeDescription", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setFontSizeDomainLink(int paramInt)
    {
      this.zzb.putString("csa_fontSizeDomainLink", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setFontSizeTitle(int paramInt)
    {
      this.zzb.putString("csa_fontSizeTitle", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setHostLanguage(String paramString)
    {
      this.zzb.putString("csa_hl", paramString);
      return this;
    }
    
    public Builder setIsClickToCallEnabled(boolean paramBoolean)
    {
      this.zzb.putString("csa_clickToCall", Boolean.toString(paramBoolean));
      return this;
    }
    
    public Builder setIsLocationEnabled(boolean paramBoolean)
    {
      this.zzb.putString("csa_location", Boolean.toString(paramBoolean));
      return this;
    }
    
    public Builder setIsPlusOnesEnabled(boolean paramBoolean)
    {
      this.zzb.putString("csa_plusOnes", Boolean.toString(paramBoolean));
      return this;
    }
    
    public Builder setIsSellerRatingsEnabled(boolean paramBoolean)
    {
      this.zzb.putString("csa_sellerRatings", Boolean.toString(paramBoolean));
      return this;
    }
    
    public Builder setIsSiteLinksEnabled(boolean paramBoolean)
    {
      this.zzb.putString("csa_siteLinks", Boolean.toString(paramBoolean));
      return this;
    }
    
    public Builder setIsTitleBold(boolean paramBoolean)
    {
      this.zzb.putString("csa_titleBold", Boolean.toString(paramBoolean));
      return this;
    }
    
    public Builder setIsTitleUnderlined(boolean paramBoolean)
    {
      this.zzb.putString("csa_noTitleUnderline", Boolean.toString(paramBoolean ^ true));
      return this;
    }
    
    public Builder setLocationColor(String paramString)
    {
      this.zzb.putString("csa_colorLocation", paramString);
      return this;
    }
    
    public Builder setLocationFontSize(int paramInt)
    {
      this.zzb.putString("csa_fontSizeLocation", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setLongerHeadlines(boolean paramBoolean)
    {
      this.zzb.putString("csa_longerHeadlines", Boolean.toString(paramBoolean));
      return this;
    }
    
    public Builder setNumber(int paramInt)
    {
      this.zzb.putString("csa_number", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setPage(int paramInt)
    {
      this.zzb.putString("csa_adPage", Integer.toString(paramInt));
      return this;
    }
    
    public Builder setQuery(String paramString)
    {
      this.zza.zze(paramString);
      return this;
    }
    
    public Builder setStyleId(String paramString)
    {
      this.zzb.putString("csa_styleId", paramString);
      return this;
    }
    
    public Builder setVerticalSpacing(int paramInt)
    {
      this.zzb.putString("csa_verticalSpacing", Integer.toString(paramInt));
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\search\DynamicHeightSearchAdRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */