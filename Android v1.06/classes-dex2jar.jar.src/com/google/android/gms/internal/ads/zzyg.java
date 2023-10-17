package com.google.android.gms.internal.ads;

final class zzyg
{
  private zzyf zza = new zzyf();
  private zzyf zzb = new zzyf();
  private boolean zzc;
  private long zzd = -9223372036854775807L;
  private int zze;
  
  public final float zza()
  {
    if (this.zza.zzf()) {
      return (float)(1.0E9D / this.zza.zza());
    }
    return -1.0F;
  }
  
  public final int zzb()
  {
    return this.zze;
  }
  
  public final long zzc()
  {
    if (this.zza.zzf()) {
      return this.zza.zza();
    }
    return -9223372036854775807L;
  }
  
  public final long zzd()
  {
    if (this.zza.zzf()) {
      return this.zza.zzb();
    }
    return -9223372036854775807L;
  }
  
  public final void zze(long paramLong)
  {
    this.zza.zzc(paramLong);
    boolean bool = this.zza.zzf();
    int i = 0;
    if (bool)
    {
      this.zzc = false;
    }
    else if (this.zzd != -9223372036854775807L)
    {
      if ((!this.zzc) || (this.zzb.zze()))
      {
        this.zzb.zzd();
        this.zzb.zzc(this.zzd);
      }
      this.zzc = true;
      this.zzb.zzc(paramLong);
    }
    if ((this.zzc) && (this.zzb.zzf()))
    {
      zzyf localzzyf = this.zza;
      this.zza = this.zzb;
      this.zzb = localzzyf;
      this.zzc = false;
    }
    this.zzd = paramLong;
    if (!this.zza.zzf()) {
      i = this.zze + 1;
    }
    this.zze = i;
  }
  
  public final void zzf()
  {
    this.zza.zzd();
    this.zzb.zzd();
    this.zzc = false;
    this.zzd = -9223372036854775807L;
    this.zze = 0;
  }
  
  public final boolean zzg()
  {
    return this.zza.zzf();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */