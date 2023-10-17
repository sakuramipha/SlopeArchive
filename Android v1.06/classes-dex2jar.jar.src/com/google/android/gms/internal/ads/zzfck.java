package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;

final class zzfck
{
  private final long zza;
  private final zzfcj zzb = new zzfcj();
  private long zzc;
  private int zzd = 0;
  private int zze = 0;
  private int zzf = 0;
  
  public zzfck()
  {
    long l = zzt.zzB().currentTimeMillis();
    this.zza = l;
    this.zzc = l;
  }
  
  public final int zza()
  {
    return this.zzd;
  }
  
  public final long zzb()
  {
    return this.zza;
  }
  
  public final long zzc()
  {
    return this.zzc;
  }
  
  public final zzfcj zzd()
  {
    zzfcj localzzfcj1 = this.zzb.zza();
    zzfcj localzzfcj2 = this.zzb;
    localzzfcj2.zza = false;
    localzzfcj2.zzb = 0;
    return localzzfcj1;
  }
  
  public final String zze()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Created: ");
    localStringBuilder.append(this.zza);
    localStringBuilder.append(" Last accessed: ");
    localStringBuilder.append(this.zzc);
    localStringBuilder.append(" Accesses: ");
    localStringBuilder.append(this.zzd);
    localStringBuilder.append("\nEntries retrieved: Valid: ");
    localStringBuilder.append(this.zze);
    localStringBuilder.append(" Stale: ");
    localStringBuilder.append(this.zzf);
    return localStringBuilder.toString();
  }
  
  public final void zzf()
  {
    this.zzc = zzt.zzB().currentTimeMillis();
    this.zzd += 1;
  }
  
  public final void zzg()
  {
    this.zzf += 1;
    zzfcj localzzfcj = this.zzb;
    localzzfcj.zzb += 1;
  }
  
  public final void zzh()
  {
    this.zze += 1;
    this.zzb.zza = true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */