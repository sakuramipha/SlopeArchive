package com.google.android.gms.internal.ads;

public final class zzaiv
  implements zzaih
{
  private final zzfd zza;
  private final zzabh zzb;
  private final String zzc;
  private zzabr zzd;
  private String zze;
  private int zzf = 0;
  private int zzg;
  private boolean zzh;
  private boolean zzi;
  private long zzj;
  private int zzk;
  private long zzl;
  
  public zzaiv()
  {
    this(null);
  }
  
  public zzaiv(String paramString)
  {
    zzfd localzzfd = new zzfd(4);
    this.zza = localzzfd;
    localzzfd.zzH()[0] = -1;
    this.zzb = new zzabh();
    this.zzl = -9223372036854775807L;
    this.zzc = paramString;
  }
  
  public final void zza(zzfd paramzzfd)
  {
    zzdy.zzb(this.zzd);
    while (paramzzfd.zza() > 0)
    {
      int i = this.zzf;
      int j;
      Object localObject;
      if (i != 0)
      {
        if (i != 1)
        {
          i = Math.min(paramzzfd.zza(), this.zzk - this.zzg);
          this.zzd.zzq(paramzzfd, i);
          i = this.zzg + i;
          this.zzg = i;
          j = this.zzk;
          if (i >= j)
          {
            long l = this.zzl;
            if (l != -9223372036854775807L)
            {
              this.zzd.zzs(l, 1, j, 0, null);
              this.zzl += this.zzj;
            }
            this.zzg = 0;
            this.zzf = 0;
          }
        }
        else
        {
          i = Math.min(paramzzfd.zza(), 4 - this.zzg);
          paramzzfd.zzB(this.zza.zzH(), this.zzg, i);
          i = this.zzg + i;
          this.zzg = i;
          if (i >= 4)
          {
            this.zza.zzF(0);
            if (!this.zzb.zza(this.zza.zze()))
            {
              this.zzg = 0;
              this.zzf = 1;
            }
            else
            {
              localObject = this.zzb;
              this.zzk = ((zzabh)localObject).zzc;
              if (!this.zzh)
              {
                this.zzj = (((zzabh)localObject).zzg * 1000000L / ((zzabh)localObject).zzd);
                localObject = new zzak();
                ((zzak)localObject).zzH(this.zze);
                ((zzak)localObject).zzS(this.zzb.zzb);
                ((zzak)localObject).zzL(4096);
                ((zzak)localObject).zzw(this.zzb.zze);
                ((zzak)localObject).zzT(this.zzb.zzd);
                ((zzak)localObject).zzK(this.zzc);
                localObject = ((zzak)localObject).zzY();
                this.zzd.zzk((zzam)localObject);
                this.zzh = true;
              }
              this.zza.zzF(0);
              this.zzd.zzq(this.zza, 4);
              this.zzf = 2;
            }
          }
        }
      }
      else
      {
        localObject = paramzzfd.zzH();
        i = paramzzfd.zzc();
        int k = paramzzfd.zzd();
        for (;;)
        {
          if (i >= k) {
            break label520;
          }
          j = localObject[i];
          boolean bool;
          if ((j & 0xFF) == 255) {
            bool = true;
          } else {
            bool = false;
          }
          if ((this.zzi) && ((j & 0xE0) == 224)) {
            j = 1;
          } else {
            j = 0;
          }
          this.zzi = bool;
          if (j != 0)
          {
            paramzzfd.zzF(i + 1);
            this.zzi = false;
            this.zza.zzH()[1] = localObject[i];
            this.zzg = 2;
            this.zzf = 1;
            break;
          }
          i++;
        }
        label520:
        paramzzfd.zzF(k);
      }
    }
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    paramzzajt.zzc();
    this.zze = paramzzajt.zzb();
    this.zzd = paramzzaar.zzv(paramzzajt.zza(), 1);
  }
  
  public final void zzc() {}
  
  public final void zzd(long paramLong, int paramInt)
  {
    if (paramLong != -9223372036854775807L) {
      this.zzl = paramLong;
    }
  }
  
  public final void zze()
  {
    this.zzf = 0;
    this.zzg = 0;
    this.zzi = false;
    this.zzl = -9223372036854775807L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaiv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */