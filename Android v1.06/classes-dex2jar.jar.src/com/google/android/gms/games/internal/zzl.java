package com.google.android.gms.games.internal;

public final class zzl
{
  public static final zzl zza = new zzl(new zzj(null));
  private final boolean zzb;
  private final boolean zzc;
  private final boolean zzd;
  
  private zzl(zzj paramzzj)
  {
    this.zzb = zzj.zzf(paramzzj);
    this.zzc = zzj.zzg(paramzzj);
    this.zzd = zzj.zze(paramzzj);
  }
  
  public static zzj zza()
  {
    return new zzj(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzl)paramObject;
      if ((this.zzb == ((zzl)paramObject).zzb) && (this.zzc == ((zzl)paramObject).zzc) && (this.zzd == ((zzl)paramObject).zzd)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (this.zzb * true + this.zzc) * 31 + this.zzd;
  }
  
  public final boolean zzb()
  {
    return this.zzd;
  }
  
  public final boolean zzc()
  {
    return this.zzb;
  }
  
  public final boolean zzd()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */