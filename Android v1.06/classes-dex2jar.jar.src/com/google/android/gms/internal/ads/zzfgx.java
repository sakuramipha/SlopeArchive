package com.google.android.gms.internal.ads;

public final class zzfgx
{
  private final String zza;
  private final String zzb;
  
  private zzfgx(String paramString1, String paramString2)
  {
    this.zza = paramString1;
    this.zzb = paramString2;
  }
  
  public static zzfgx zza(String paramString1, String paramString2)
  {
    zzfhv.zza(paramString1, "Name is null or empty");
    zzfhv.zza(paramString2, "Version is null or empty");
    return new zzfgx(paramString1, paramString2);
  }
  
  public final String zzb()
  {
    return this.zza;
  }
  
  public final String zzc()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfgx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */