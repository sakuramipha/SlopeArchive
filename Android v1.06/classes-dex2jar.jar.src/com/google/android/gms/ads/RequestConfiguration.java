package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzbzt;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public class RequestConfiguration
{
  public static final String MAX_AD_CONTENT_RATING_G = "G";
  public static final String MAX_AD_CONTENT_RATING_MA = "MA";
  public static final String MAX_AD_CONTENT_RATING_PG = "PG";
  public static final String MAX_AD_CONTENT_RATING_T = "T";
  public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
  public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
  public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
  public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
  public static final List zza = Arrays.asList(new String[] { "MA", "T", "PG", "G" });
  private final int zzb;
  private final int zzc;
  @Nullable
  private final String zzd;
  private final List zze;
  
  public String getMaxAdContentRating()
  {
    String str2 = this.zzd;
    String str1 = str2;
    if (str2 == null) {
      str1 = "";
    }
    return str1;
  }
  
  public int getTagForChildDirectedTreatment()
  {
    return this.zzb;
  }
  
  public int getTagForUnderAgeOfConsent()
  {
    return this.zzc;
  }
  
  public List<String> getTestDeviceIds()
  {
    return new ArrayList(this.zze);
  }
  
  public Builder toBuilder()
  {
    Builder localBuilder = new Builder();
    localBuilder.setTagForChildDirectedTreatment(this.zzb);
    localBuilder.setTagForUnderAgeOfConsent(this.zzc);
    localBuilder.setMaxAdContentRating(this.zzd);
    localBuilder.setTestDeviceIds(this.zze);
    return localBuilder;
  }
  
  public static class Builder
  {
    private int zza = -1;
    private int zzb = -1;
    @Nullable
    private String zzc = null;
    private final List zzd = new ArrayList();
    
    public RequestConfiguration build()
    {
      return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
    
    public Builder setMaxAdContentRating(@Nullable String paramString)
    {
      if ((paramString != null) && (!"".equals(paramString)))
      {
        if ((!"G".equals(paramString)) && (!"PG".equals(paramString)) && (!"T".equals(paramString)) && (!"MA".equals(paramString))) {
          zzbzt.zzj("Invalid value passed to setMaxAdContentRating: ".concat(paramString));
        } else {
          this.zzc = paramString;
        }
      }
      else {
        this.zzc = null;
      }
      return this;
    }
    
    public Builder setTagForChildDirectedTreatment(int paramInt)
    {
      if ((paramInt != -1) && (paramInt != 0) && (paramInt != 1))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid value passed to setTagForChildDirectedTreatment: ");
        localStringBuilder.append(paramInt);
        zzbzt.zzj(localStringBuilder.toString());
      }
      else
      {
        this.zza = paramInt;
      }
      return this;
    }
    
    public Builder setTagForUnderAgeOfConsent(int paramInt)
    {
      if ((paramInt != -1) && (paramInt != 0) && (paramInt != 1))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
        localStringBuilder.append(paramInt);
        zzbzt.zzj(localStringBuilder.toString());
      }
      else
      {
        this.zzb = paramInt;
      }
      return this;
    }
    
    public Builder setTestDeviceIds(@Nullable List<String> paramList)
    {
      this.zzd.clear();
      if (paramList != null) {
        this.zzd.addAll(paramList);
      }
      return this;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface MaxAdContentRating {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface TagForChildDirectedTreatment {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface TagForUnderAgeOfConsent {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\RequestConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */