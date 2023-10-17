package com.google.android.gms.internal.ads;

public class zzhc
{
  private int zza;
  
  public final void zza(int paramInt)
  {
    this.zza = (paramInt | this.zza);
  }
  
  public void zzb()
  {
    this.zza = 0;
  }
  
  public final void zzc(int paramInt)
  {
    this.zza = paramInt;
  }
  
  protected final boolean zzd(int paramInt)
  {
    return (this.zza & paramInt) == paramInt;
  }
  
  public final boolean zze()
  {
    return zzd(268435456);
  }
  
  public final boolean zzf()
  {
    return zzd(Integer.MIN_VALUE);
  }
  
  public final boolean zzg()
  {
    return zzd(4);
  }
  
  public final boolean zzh()
  {
    return zzd(1);
  }
  
  public final boolean zzi()
  {
    return zzd(536870912);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */