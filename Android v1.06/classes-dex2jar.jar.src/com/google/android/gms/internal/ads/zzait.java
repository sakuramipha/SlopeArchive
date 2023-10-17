package com.google.android.gms.internal.ads;

public final class zzait
  implements zzaih
{
  private final zzfd zza = new zzfd(10);
  private zzabr zzb;
  private boolean zzc;
  private long zzd = -9223372036854775807L;
  private int zze;
  private int zzf;
  
  public final void zza(zzfd paramzzfd)
  {
    zzdy.zzb(this.zzb);
    if (!this.zzc) {
      return;
    }
    int i = paramzzfd.zza();
    int j = this.zzf;
    if (j < 10)
    {
      j = Math.min(i, 10 - j);
      System.arraycopy(paramzzfd.zzH(), paramzzfd.zzc(), this.zza.zzH(), this.zzf, j);
      if (this.zzf + j == 10)
      {
        this.zza.zzF(0);
        if ((this.zza.zzk() == 73) && (this.zza.zzk() == 68) && (this.zza.zzk() == 51))
        {
          this.zza.zzG(3);
          this.zze = (this.zza.zzj() + 10);
        }
        else
        {
          zzer.zze("Id3Reader", "Discarding invalid ID3 tag");
          this.zzc = false;
          return;
        }
      }
    }
    i = Math.min(i, this.zze - this.zzf);
    this.zzb.zzq(paramzzfd, i);
    this.zzf += i;
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    paramzzajt.zzc();
    zzabr localzzabr = paramzzaar.zzv(paramzzajt.zza(), 5);
    this.zzb = localzzabr;
    paramzzaar = new zzak();
    paramzzaar.zzH(paramzzajt.zzb());
    paramzzaar.zzS("application/id3");
    localzzabr.zzk(paramzzaar.zzY());
  }
  
  public final void zzc()
  {
    zzdy.zzb(this.zzb);
    if (this.zzc)
    {
      int i = this.zze;
      if ((i != 0) && (this.zzf == i))
      {
        long l = this.zzd;
        if (l != -9223372036854775807L) {
          this.zzb.zzs(l, 1, i, 0, null);
        }
        this.zzc = false;
      }
    }
  }
  
  public final void zzd(long paramLong, int paramInt)
  {
    if ((paramInt & 0x4) == 0) {
      return;
    }
    this.zzc = true;
    if (paramLong != -9223372036854775807L) {
      this.zzd = paramLong;
    }
    this.zze = 0;
    this.zzf = 0;
  }
  
  public final void zze()
  {
    this.zzc = false;
    this.zzd = -9223372036854775807L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzait.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */