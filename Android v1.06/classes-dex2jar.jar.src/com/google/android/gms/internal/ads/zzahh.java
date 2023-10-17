package com.google.android.gms.internal.ads;

final class zzahh
  implements zzahn
{
  private final zzabb zza;
  private final zzaba zzb;
  private long zzc;
  private long zzd;
  
  public zzahh(zzabb paramzzabb, zzaba paramzzaba)
  {
    this.zza = paramzzabb;
    this.zzb = paramzzaba;
    this.zzc = -1L;
    this.zzd = -1L;
  }
  
  public final void zza(long paramLong)
  {
    this.zzc = paramLong;
  }
  
  public final long zzd(zzaap paramzzaap)
  {
    long l = this.zzd;
    if (l >= 0L)
    {
      this.zzd = -1L;
      return -(l + 2L);
    }
    return -1L;
  }
  
  public final zzabn zze()
  {
    boolean bool;
    if (this.zzc != -1L) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    return new zzaaz(this.zza, this.zzc);
  }
  
  public final void zzg(long paramLong)
  {
    long[] arrayOfLong = this.zzb.zza;
    this.zzd = arrayOfLong[zzfn.zzc(arrayOfLong, paramLong, true, true)];
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */