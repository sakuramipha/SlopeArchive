package com.google.android.gms.ads.rewarded;

public class ServerSideVerificationOptions
{
  private final String zza;
  private final String zzb;
  
  public String getCustomData()
  {
    return this.zzb;
  }
  
  public String getUserId()
  {
    return this.zza;
  }
  
  public static final class Builder
  {
    private String zza = "";
    private String zzb = "";
    
    public ServerSideVerificationOptions build()
    {
      return new ServerSideVerificationOptions(this, null);
    }
    
    public Builder setCustomData(String paramString)
    {
      this.zzb = paramString;
      return this;
    }
    
    public Builder setUserId(String paramString)
    {
      this.zza = paramString;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\rewarded\ServerSideVerificationOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */