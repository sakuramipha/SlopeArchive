package com.google.android.gms.ads;

public final class zzb
{
  public static int zza(AdSize paramAdSize)
  {
    return paramAdSize.zzb();
  }
  
  public static int zzb(AdSize paramAdSize)
  {
    return paramAdSize.zza();
  }
  
  public static AdSize zzc(int paramInt1, int paramInt2, String paramString)
  {
    return new AdSize(paramInt1, paramInt2, paramString);
  }
  
  public static AdSize zzd(int paramInt1, int paramInt2)
  {
    AdSize localAdSize = new AdSize(paramInt1, paramInt2);
    localAdSize.zze(true);
    localAdSize.zzc(paramInt2);
    return localAdSize;
  }
  
  public static AdSize zze(int paramInt1, int paramInt2)
  {
    AdSize localAdSize = new AdSize(paramInt1, paramInt2);
    localAdSize.zzf(true);
    localAdSize.zzd(paramInt2);
    return localAdSize;
  }
  
  public static boolean zzf(AdSize paramAdSize)
  {
    return paramAdSize.zzg();
  }
  
  public static boolean zzg(AdSize paramAdSize)
  {
    return paramAdSize.zzh();
  }
  
  public static boolean zzh(AdSize paramAdSize)
  {
    return paramAdSize.zzi();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\zzb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */