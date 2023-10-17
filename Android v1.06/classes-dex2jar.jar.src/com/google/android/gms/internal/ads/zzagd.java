package com.google.android.gms.internal.ads;

final class zzagd
{
  public final int zza;
  public int zzb;
  public int zzc;
  public long zzd;
  private final boolean zze;
  private final zzfd zzf;
  private final zzfd zzg;
  private int zzh;
  private int zzi;
  
  public zzagd(zzfd paramzzfd1, zzfd paramzzfd2, boolean paramBoolean)
    throws zzce
  {
    this.zzg = paramzzfd1;
    this.zzf = paramzzfd2;
    this.zze = paramBoolean;
    paramzzfd2.zzF(12);
    this.zza = paramzzfd2.zzn();
    paramzzfd1.zzF(12);
    this.zzi = paramzzfd1.zzn();
    int i = paramzzfd1.zze();
    paramBoolean = true;
    if (i != 1) {
      paramBoolean = false;
    }
    zzaas.zzb(paramBoolean, "first_chunk must be 1");
    this.zzb = -1;
  }
  
  public final boolean zza()
  {
    int i = this.zzb + 1;
    this.zzb = i;
    if (i == this.zza) {
      return false;
    }
    long l;
    if (this.zze) {
      l = this.zzf.zzt();
    } else {
      l = this.zzf.zzs();
    }
    this.zzd = l;
    if (this.zzb == this.zzh)
    {
      this.zzc = this.zzg.zzn();
      this.zzg.zzG(4);
      int j = this.zzi;
      i = -1;
      j--;
      this.zzi = j;
      if (j > 0) {
        i = -1 + this.zzg.zzn();
      }
      this.zzh = i;
    }
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzagd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */