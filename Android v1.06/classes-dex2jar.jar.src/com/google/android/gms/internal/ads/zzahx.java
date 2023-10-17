package com.google.android.gms.internal.ads;

public final class zzahx
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
  
  public zzahx()
  {
    this(null);
  }
  
  public zzahx(String paramString)
  {
    zzfc localzzfc = new zzfc(new byte[''], 128);
    this.zza = localzzfc;
    this.zzb = new zzfd(localzzfc.zza);
    this.zzf = 0;
    this.zzl = -9223372036854775807L;
    this.zzc = paramString;
  }
  
  public final void zza(zzfd paramzzfd)
  {
    zzdy.zzb(this.zze);
    label556:
    while (paramzzfd.zza() > 0)
    {
      int i = this.zzf;
      Object localObject1;
      if (i != 0)
      {
        if (i != 1)
        {
          i = Math.min(paramzzfd.zza(), this.zzk - this.zzg);
          this.zze.zzq(paramzzfd, i);
          int j = this.zzg + i;
          this.zzg = j;
          i = this.zzk;
          if (j == i)
          {
            long l = this.zzl;
            if (l != -9223372036854775807L)
            {
              this.zze.zzs(l, 1, i, 0, null);
              this.zzl += this.zzi;
            }
            this.zzf = 0;
          }
        }
        else
        {
          localObject1 = this.zzb.zzH();
          i = Math.min(paramzzfd.zza(), 128 - this.zzg);
          paramzzfd.zzB((byte[])localObject1, this.zzg, i);
          i = this.zzg + i;
          this.zzg = i;
          if (i == 128)
          {
            this.zza.zzj(0);
            localObject1 = zzzp.zze(this.zza);
            Object localObject2 = this.zzj;
            if ((localObject2 == null) || (((zzzo)localObject1).zzc != ((zzam)localObject2).zzz) || (((zzzo)localObject1).zzb != ((zzam)localObject2).zzA) || (!zzfn.zzB(((zzzo)localObject1).zza, ((zzam)localObject2).zzm)))
            {
              localObject2 = new zzak();
              ((zzak)localObject2).zzH(this.zzd);
              ((zzak)localObject2).zzS(((zzzo)localObject1).zza);
              ((zzak)localObject2).zzw(((zzzo)localObject1).zzc);
              ((zzak)localObject2).zzT(((zzzo)localObject1).zzb);
              ((zzak)localObject2).zzK(this.zzc);
              ((zzak)localObject2).zzO(((zzzo)localObject1).zzf);
              if ("audio/ac3".equals(((zzzo)localObject1).zza)) {
                ((zzak)localObject2).zzv(((zzzo)localObject1).zzf);
              }
              localObject2 = ((zzak)localObject2).zzY();
              this.zzj = ((zzam)localObject2);
              this.zze.zzk((zzam)localObject2);
            }
            this.zzk = ((zzzo)localObject1).zzd;
            this.zzi = (((zzzo)localObject1).zze * 1000000L / this.zzj.zzA);
            this.zzb.zzF(0);
            this.zze.zzq(this.zzb, 128);
            this.zzf = 2;
          }
        }
      }
      else {
        for (;;)
        {
          if (paramzzfd.zza() <= 0) {
            break label556;
          }
          boolean bool;
          if (!this.zzh)
          {
            if (paramzzfd.zzk() == 11) {
              bool = true;
            } else {
              bool = false;
            }
            this.zzh = bool;
          }
          else
          {
            i = paramzzfd.zzk();
            if (i == 119)
            {
              this.zzh = false;
              this.zzf = 1;
              localObject1 = this.zzb;
              ((zzfd)localObject1).zzH()[0] = 11;
              ((zzfd)localObject1).zzH()[1] = 119;
              this.zzg = 2;
              break;
            }
            if (i == 11) {
              bool = true;
            } else {
              bool = false;
            }
            this.zzh = bool;
          }
        }
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


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */