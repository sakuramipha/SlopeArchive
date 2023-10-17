package com.google.android.gms.internal.ads;

final class zzfbp
{
  private final zzfbo zza = new zzfbo();
  private int zzb;
  private int zzc;
  private int zzd;
  private int zze;
  private int zzf;
  
  public final zzfbo zza()
  {
    zzfbo localzzfbo1 = this.zza.zza();
    zzfbo localzzfbo2 = this.zza;
    localzzfbo2.zza = false;
    localzzfbo2.zzb = false;
    return localzzfbo1;
  }
  
  public final String zzb()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\n\tPool does not exist: ");
    localStringBuilder.append(this.zzd);
    localStringBuilder.append("\n\tNew pools created: ");
    localStringBuilder.append(this.zzb);
    localStringBuilder.append("\n\tPools removed: ");
    localStringBuilder.append(this.zzc);
    localStringBuilder.append("\n\tEntries added: ");
    localStringBuilder.append(this.zzf);
    localStringBuilder.append("\n\tNo entries retrieved: ");
    localStringBuilder.append(this.zze);
    localStringBuilder.append("\n");
    return localStringBuilder.toString();
  }
  
  public final void zzc()
  {
    this.zzf += 1;
  }
  
  public final void zzd()
  {
    this.zzb += 1;
    this.zza.zza = true;
  }
  
  public final void zze()
  {
    this.zze += 1;
  }
  
  public final void zzf()
  {
    this.zzd += 1;
  }
  
  public final void zzg()
  {
    this.zzc += 1;
    this.zza.zzb = true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */