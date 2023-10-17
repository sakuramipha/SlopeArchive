package com.google.android.gms.internal.ads;

public class zzbcp
{
  private final String zza;
  private final Object zzb;
  private final int zzc;
  
  protected zzbcp(String paramString, Object paramObject, int paramInt)
  {
    this.zza = paramString;
    this.zzb = paramObject;
    this.zzc = paramInt;
  }
  
  public static zzbcp zza(String paramString, double paramDouble)
  {
    return new zzbcp(paramString, Double.valueOf(paramDouble), 3);
  }
  
  public static zzbcp zzb(String paramString, long paramLong)
  {
    return new zzbcp(paramString, Long.valueOf(paramLong), 2);
  }
  
  public static zzbcp zzc(String paramString1, String paramString2)
  {
    return new zzbcp(paramString1, paramString2, 4);
  }
  
  public static zzbcp zzd(String paramString, boolean paramBoolean)
  {
    return new zzbcp(paramString, Boolean.valueOf(paramBoolean), 1);
  }
  
  public final Object zze()
  {
    zzbdt localzzbdt = zzbdv.zza();
    if (localzzbdt == null)
    {
      if (zzbdv.zzb() != null) {
        zzbdv.zzb().zza();
      }
      return this.zzb;
    }
    int i = this.zzc - 1;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          return localzzbdt.zzd(this.zza, (String)this.zzb);
        }
        return localzzbdt.zzb(this.zza, ((Double)this.zzb).doubleValue());
      }
      return localzzbdt.zzc(this.zza, ((Long)this.zzb).longValue());
    }
    return localzzbdt.zza(this.zza, ((Boolean)this.zzb).booleanValue());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */