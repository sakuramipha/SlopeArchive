package com.google.android.gms.ads;

public enum AdFormat
{
  private static final AdFormat[] zza;
  
  static
  {
    AdFormat localAdFormat7 = new AdFormat("BANNER", 0);
    BANNER = localAdFormat7;
    AdFormat localAdFormat6 = new AdFormat("INTERSTITIAL", 1);
    INTERSTITIAL = localAdFormat6;
    AdFormat localAdFormat5 = new AdFormat("REWARDED", 2);
    REWARDED = localAdFormat5;
    AdFormat localAdFormat1 = new AdFormat("REWARDED_INTERSTITIAL", 3);
    REWARDED_INTERSTITIAL = localAdFormat1;
    AdFormat localAdFormat3 = new AdFormat("NATIVE", 4);
    NATIVE = localAdFormat3;
    AdFormat localAdFormat4 = new AdFormat("UNKNOWN", 5);
    UNKNOWN = localAdFormat4;
    AdFormat localAdFormat2 = new AdFormat("APP_OPEN_AD", 6);
    APP_OPEN_AD = localAdFormat2;
    zza = new AdFormat[] { localAdFormat7, localAdFormat6, localAdFormat5, localAdFormat1, localAdFormat3, localAdFormat4, localAdFormat2 };
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\AdFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */