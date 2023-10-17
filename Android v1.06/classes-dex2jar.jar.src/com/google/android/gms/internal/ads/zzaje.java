package com.google.android.gms.internal.ads;

final class zzaje
{
  private final zzaih zza;
  private final zzfl zzb;
  private final zzfc zzc;
  private boolean zzd;
  private boolean zze;
  private boolean zzf;
  
  public zzaje(zzaih paramzzaih, zzfl paramzzfl)
  {
    this.zza = paramzzaih;
    this.zzb = paramzzfl;
    this.zzc = new zzfc(new byte[64], 64);
  }
  
  public final void zza(zzfd paramzzfd)
    throws zzce
  {
    paramzzfd.zzB(this.zzc.zza, 0, 3);
    this.zzc.zzj(0);
    this.zzc.zzl(8);
    this.zzd = this.zzc.zzn();
    this.zze = this.zzc.zzn();
    this.zzc.zzl(6);
    int i = this.zzc.zzd(8);
    paramzzfd.zzB(this.zzc.zza, 0, i);
    this.zzc.zzj(0);
    long l1;
    if (this.zzd)
    {
      this.zzc.zzl(4);
      long l2 = this.zzc.zzd(3);
      this.zzc.zzl(1);
      i = this.zzc.zzd(15);
      this.zzc.zzl(1);
      l1 = this.zzc.zzd(15);
      this.zzc.zzl(1);
      if ((!this.zzf) && (this.zze))
      {
        this.zzc.zzl(4);
        l3 = this.zzc.zzd(3);
        this.zzc.zzl(1);
        int j = this.zzc.zzd(15);
        this.zzc.zzl(1);
        long l4 = this.zzc.zzd(15);
        this.zzc.zzl(1);
        this.zzb.zzb(j << 15 | l3 << 30 | l4);
        this.zzf = true;
      }
      long l3 = i << 15;
      l1 = this.zzb.zzb(l2 << 30 | l3 | l1);
    }
    else
    {
      l1 = 0L;
    }
    this.zza.zzd(l1, 4);
    this.zza.zza(paramzzfd);
    this.zza.zzc();
  }
  
  public final void zzb()
  {
    this.zzf = false;
    this.zza.zze();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */