package com.google.android.ump;

public class ConsentRequestParameters
{
  private final boolean zza;
  private final String zzb;
  private final ConsentDebugSettings zzc;
  
  public ConsentDebugSettings getConsentDebugSettings()
  {
    return this.zzc;
  }
  
  public boolean isTagForUnderAgeOfConsent()
  {
    return this.zza;
  }
  
  public final String zza()
  {
    return this.zzb;
  }
  
  public static final class Builder
  {
    private boolean zza;
    private String zzb;
    private ConsentDebugSettings zzc;
    
    public ConsentRequestParameters build()
    {
      return new ConsentRequestParameters(this, null);
    }
    
    public Builder setAdMobAppId(String paramString)
    {
      this.zzb = paramString;
      return this;
    }
    
    public Builder setConsentDebugSettings(ConsentDebugSettings paramConsentDebugSettings)
    {
      this.zzc = paramConsentDebugSettings;
      return this;
    }
    
    public Builder setTagForUnderAgeOfConsent(boolean paramBoolean)
    {
      this.zza = paramBoolean;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\androi\\ump\ConsentRequestParameters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */