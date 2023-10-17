package com.google.android.gms.internal.ads;

public final class zzaia
  implements zzaih
{
  private final zzfc zza;
  private final zzfd zzb;
  private final String zzc;
  private String zzd;
  private zzabr zze;
  private int zzf;
  private int zzg;
  private boolean zzh;
  private long zzi;
  private zzam zzj;
  private int zzk;
  private long zzl;
  
  public zzaia()
  {
    this(null);
  }
  
  public zzaia(String paramString)
  {
    zzfc localzzfc = new zzfc(new byte[16], 16);
    this.zza = localzzfc;
    this.zzb = new zzfd(localzzfc.zza);
    this.zzf = 0;
    this.zzg = 0;
    this.zzh = false;
    this.zzl = -9223372036854775807L;
    this.zzc = paramString;
  }
  
  public final void zza(zzfd paramzzfd)
  {
    zzdy.zzb(this.zze);
    for (;;)
    {
      if (paramzzfd.zza() <= 0) {
        return;
      }
      int j = this.zzf;
      int k;
      Object localObject1;
      if (j != 0)
      {
        if (j != 1)
        {
          j = Math.min(paramzzfd.zza(), this.zzk - this.zzg);
          this.zze.zzq(paramzzfd, j);
          j = this.zzg + j;
          this.zzg = j;
          k = this.zzk;
          if (j == k)
          {
            long l = this.zzl;
            if (l != -9223372036854775807L)
            {
              this.zze.zzs(l, 1, k, 0, null);
              this.zzl += this.zzi;
            }
            this.zzf = 0;
          }
        }
        else
        {
          localObject1 = this.zzb.zzH();
          j = Math.min(paramzzfd.zza(), 16 - this.zzg);
          paramzzfd.zzB((byte[])localObject1, this.zzg, j);
          j = this.zzg + j;
          this.zzg = j;
          if (j == 16)
          {
            this.zza.zzj(0);
            localObject1 = zzzs.zza(this.zza);
            Object localObject2 = this.zzj;
            if ((localObject2 == null) || (((zzam)localObject2).zzz != 2) || (((zzzr)localObject1).zza != ((zzam)localObject2).zzA) || (!"audio/ac4".equals(((zzam)localObject2).zzm)))
            {
              localObject2 = new zzak();
              ((zzak)localObject2).zzH(this.zzd);
              ((zzak)localObject2).zzS("audio/ac4");
              ((zzak)localObject2).zzw(2);
              ((zzak)localObject2).zzT(((zzzr)localObject1).zza);
              ((zzak)localObject2).zzK(this.zzc);
              localObject2 = ((zzak)localObject2).zzY();
              this.zzj = ((zzam)localObject2);
              this.zze.zzk((zzam)localObject2);
            }
            this.zzk = ((zzzr)localObject1).zzb;
            this.zzi = (((zzzr)localObject1).zzc * 1000000L / this.zzj.zzA);
            this.zzb.zzF(0);
            this.zze.zzq(this.zzb, 16);
            this.zzf = 2;
          }
        }
      }
      else
      {
        boolean bool;
        while (paramzzfd.zza() > 0)
        {
          if (this.zzh) {
            break label433;
          }
          if (paramzzfd.zzk() == 172) {
            bool = true;
          } else {
            bool = false;
          }
          this.zzh = bool;
        }
        continue;
        label433:
        k = paramzzfd.zzk();
        if (k == 172) {
          bool = true;
        } else {
          bool = false;
        }
        this.zzh = bool;
        int i = 64;
        j = k;
        if (k != 64)
        {
          if (k != 65) {
            break;
          }
          j = 65;
        }
        this.zzf = 1;
        localObject1 = this.zzb;
        ((zzfd)localObject1).zzH()[0] = -84;
        localObject1 = ((zzfd)localObject1).zzH();
        if (j == 65) {
          i = 65;
        }
        localObject1[1] = i;
        this.zzg = 2;
      }
    }
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    paramzzajt.zzc();
    this.zzd = paramzzajt.zzb();
    this.zze = paramzzaar.zzv(paramzzajt.zza(), 1);
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
    this.zzh = false;
    this.zzl = -9223372036854775807L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */