package com.google.android.gms.internal.ads;

public enum zzaxh
  implements zzgoy
{
  private static final zzgoz zzm = new zzaxf();
  private static final zzaxh[] zzn;
  private final int zzo;
  
  static
  {
    zzaxh localzzaxh7 = new zzaxh("AD_INITIATER_UNSPECIFIED", 0, 0);
    zza = localzzaxh7;
    zzaxh localzzaxh1 = new zzaxh("BANNER", 1, 1);
    zzb = localzzaxh1;
    zzaxh localzzaxh10 = new zzaxh("DFP_BANNER", 2, 2);
    zzc = localzzaxh10;
    zzaxh localzzaxh8 = new zzaxh("INTERSTITIAL", 3, 3);
    zzd = localzzaxh8;
    zzaxh localzzaxh2 = new zzaxh("DFP_INTERSTITIAL", 4, 4);
    zze = localzzaxh2;
    zzaxh localzzaxh3 = new zzaxh("NATIVE_EXPRESS", 5, 5);
    zzf = localzzaxh3;
    zzaxh localzzaxh4 = new zzaxh("AD_LOADER", 6, 6);
    zzg = localzzaxh4;
    zzaxh localzzaxh11 = new zzaxh("REWARD_BASED_VIDEO_AD", 7, 7);
    zzh = localzzaxh11;
    zzaxh localzzaxh12 = new zzaxh("BANNER_SEARCH_ADS", 8, 8);
    zzi = localzzaxh12;
    zzaxh localzzaxh9 = new zzaxh("GOOGLE_MOBILE_ADS_SDK_ADAPTER", 9, 9);
    zzj = localzzaxh9;
    zzaxh localzzaxh5 = new zzaxh("APP_OPEN", 10, 10);
    zzk = localzzaxh5;
    zzaxh localzzaxh6 = new zzaxh("REWARDED_INTERSTITIAL", 11, 11);
    zzl = localzzaxh6;
    zzn = new zzaxh[] { localzzaxh7, localzzaxh1, localzzaxh10, localzzaxh8, localzzaxh2, localzzaxh3, localzzaxh4, localzzaxh11, localzzaxh12, localzzaxh9, localzzaxh5, localzzaxh6 };
  }
  
  private zzaxh(int paramInt1)
  {
    this.zzo = paramInt1;
  }
  
  public final String toString()
  {
    return Integer.toString(this.zzo);
  }
  
  public final int zza()
  {
    return this.zzo;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaxh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */