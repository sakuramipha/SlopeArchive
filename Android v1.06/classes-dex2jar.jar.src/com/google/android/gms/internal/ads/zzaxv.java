package com.google.android.gms.internal.ads;

public enum zzaxv
  implements zzgoy
{
  private static final zzgoz zzl = new zzaxt();
  private static final zzaxv[] zzm;
  private final int zzn;
  
  static
  {
    zzaxv localzzaxv11 = new zzaxv("AD_FORMAT_TYPE_UNSPECIFIED", 0, 0);
    zza = localzzaxv11;
    zzaxv localzzaxv4 = new zzaxv("BANNER", 1, 1);
    zzb = localzzaxv4;
    zzaxv localzzaxv8 = new zzaxv("INTERSTITIAL", 2, 2);
    zzc = localzzaxv8;
    zzaxv localzzaxv1 = new zzaxv("NATIVE_EXPRESS", 3, 3);
    zzd = localzzaxv1;
    zzaxv localzzaxv2 = new zzaxv("NATIVE_CONTENT", 4, 4);
    zze = localzzaxv2;
    zzaxv localzzaxv3 = new zzaxv("NATIVE_APP_INSTALL", 5, 5);
    zzf = localzzaxv3;
    zzaxv localzzaxv6 = new zzaxv("NATIVE_CUSTOM_TEMPLATE", 6, 6);
    zzg = localzzaxv6;
    zzaxv localzzaxv10 = new zzaxv("DFP_BANNER", 7, 7);
    zzh = localzzaxv10;
    zzaxv localzzaxv9 = new zzaxv("DFP_INTERSTITIAL", 8, 8);
    zzi = localzzaxv9;
    zzaxv localzzaxv7 = new zzaxv("REWARD_BASED_VIDEO_AD", 9, 9);
    zzj = localzzaxv7;
    zzaxv localzzaxv5 = new zzaxv("BANNER_SEARCH_ADS", 10, 10);
    zzk = localzzaxv5;
    zzm = new zzaxv[] { localzzaxv11, localzzaxv4, localzzaxv8, localzzaxv1, localzzaxv2, localzzaxv3, localzzaxv6, localzzaxv10, localzzaxv9, localzzaxv7, localzzaxv5 };
  }
  
  private zzaxv(int paramInt1)
  {
    this.zzn = paramInt1;
  }
  
  public static zzaxv zzb(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 10: 
      return zzk;
    case 9: 
      return zzj;
    case 8: 
      return zzi;
    case 7: 
      return zzh;
    case 6: 
      return zzg;
    case 5: 
      return zzf;
    case 4: 
      return zze;
    case 3: 
      return zzd;
    case 2: 
      return zzc;
    case 1: 
      return zzb;
    }
    return zza;
  }
  
  public final String toString()
  {
    return Integer.toString(this.zzn);
  }
  
  public final int zza()
  {
    return this.zzn;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaxv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */