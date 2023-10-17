package com.google.android.gms.internal.ads;

public final class zzgf
  implements zzfw
{
  private final zzgt zza = new zzgt();
  private zzgz zzb;
  private String zzc;
  private int zzd = 8000;
  private int zze = 8000;
  private boolean zzf;
  
  public final zzgf zzb(boolean paramBoolean)
  {
    this.zzf = true;
    return this;
  }
  
  public final zzgf zzc(int paramInt)
  {
    this.zzd = paramInt;
    return this;
  }
  
  public final zzgf zzd(int paramInt)
  {
    this.zze = paramInt;
    return this;
  }
  
  public final zzgf zze(zzgz paramzzgz)
  {
    this.zzb = paramzzgz;
    return this;
  }
  
  public final zzgf zzf(String paramString)
  {
    this.zzc = paramString;
    return this;
  }
  
  public final zzgk zzg()
  {
    zzgk localzzgk = new zzgk(this.zzc, this.zzd, this.zze, this.zzf, this.zza, null, false, null);
    zzgz localzzgz = this.zzb;
    if (localzzgz != null) {
      localzzgk.zzf(localzzgz);
    }
    return localzzgk;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */