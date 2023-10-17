package com.android.billingclient.api;

public final class AccountIdentifiers
{
  private final String zza;
  private final String zzb;
  
  AccountIdentifiers(String paramString1, String paramString2)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
  }
  
  public String getObfuscatedAccountId()
  {
    return this.zza;
  }
  
  public String getObfuscatedProfileId()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\android\billingclient\api\AccountIdentifiers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */