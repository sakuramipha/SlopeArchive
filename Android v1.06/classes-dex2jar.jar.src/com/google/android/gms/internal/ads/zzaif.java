package com.google.android.gms.internal.ads;

public final class zzaif
  implements zzaih
{
  private final zzfd zza = new zzfd(new byte[18]);
  private final String zzb;
  private String zzc;
  private zzabr zzd;
  private int zze = 0;
  private int zzf;
  private int zzg;
  private long zzh;
  private zzam zzi;
  private int zzj;
  private long zzk = -9223372036854775807L;
  
  public zzaif(String paramString)
  {
    this.zzb = paramString;
  }
  
  public final void zza(zzfd paramzzfd)
  {
    zzdy.zzb(this.zzd);
    for (;;)
    {
      if (paramzzfd.zza() <= 0) {
        return;
      }
      int i = this.zze;
      int j;
      byte[] arrayOfByte;
      if (i != 0)
      {
        if (i != 1)
        {
          i = Math.min(paramzzfd.zza(), this.zzj - this.zzf);
          this.zzd.zzq(paramzzfd, i);
          i = this.zzf + i;
          this.zzf = i;
          j = this.zzj;
          if (i == j)
          {
            long l = this.zzk;
            if (l != -9223372036854775807L)
            {
              this.zzd.zzs(l, 1, j, 0, null);
              this.zzk += this.zzh;
            }
            this.zze = 0;
          }
        }
        else
        {
          arrayOfByte = this.zza.zzH();
          i = Math.min(paramzzfd.zza(), 18 - this.zzf);
          paramzzfd.zzB(arrayOfByte, this.zzf, i);
          i = this.zzf + i;
          this.zzf = i;
          if (i == 18)
          {
            arrayOfByte = this.zza.zzH();
            if (this.zzi == null)
            {
              zzam localzzam = zzaal.zza(arrayOfByte, this.zzc, this.zzb, null);
              this.zzi = localzzam;
              this.zzd.zzk(localzzam);
            }
            i = zzaal.zza;
            i = arrayOfByte[0];
            if (i != -2)
            {
              if (i != -1)
              {
                if (i != 31)
                {
                  i = (arrayOfByte[5] & 0x3) << 12;
                  j = (arrayOfByte[6] & 0xFF) << 4;
                  k = arrayOfByte[7];
                  break label402;
                }
                i = arrayOfByte[6];
                j = arrayOfByte[7];
                i = (arrayOfByte[8] & 0x3C) >> 2 | (0x3 & i) << 12 | (j & 0xFF) << 4;
              }
              else
              {
                i = (arrayOfByte[7] & 0x3) << 12 | (arrayOfByte[6] & 0xFF) << 4 | (arrayOfByte[9] & 0x3C) >> 2;
              }
              i++;
              j = 1;
              break label419;
            }
            else
            {
              i = (arrayOfByte[4] & 0x3) << 12;
              j = (arrayOfByte[7] & 0xFF) << 4;
              k = arrayOfByte[6];
            }
            label402:
            i = (i | j | (k & 0xF0) >> 4) + 1;
            j = 0;
            label419:
            int k = i;
            if (j != 0) {
              k = i * 16 / 14;
            }
            this.zzj = k;
            i = arrayOfByte[0];
            if (i != -2)
            {
              if (i != -1)
              {
                if (i != 31)
                {
                  i = (arrayOfByte[4] & 0x1) << 6;
                  j = arrayOfByte[5];
                  break label539;
                }
                i = (arrayOfByte[5] & 0x7) << 4;
                j = arrayOfByte[6];
              }
              else
              {
                i = (arrayOfByte[4] & 0x7) << 4;
                j = arrayOfByte[7];
              }
              j &= 0x3C;
              break label545;
            }
            else
            {
              i = (arrayOfByte[5] & 0x1) << 6;
              j = arrayOfByte[4];
            }
            label539:
            j &= 0xFC;
            label545:
            k = this.zzi.zzA;
            this.zzh = ((int)(((j >> 2 | i) + 1) * 32 * 1000000L / k));
            this.zza.zzF(0);
            this.zzd.zzq(this.zza, 18);
            this.zze = 2;
          }
        }
      }
      else if (paramzzfd.zza() > 0)
      {
        i = this.zzg << 8;
        this.zzg = i;
        i |= paramzzfd.zzk();
        this.zzg = i;
        j = zzaal.zza;
        if ((i != 2147385345) && (i != -25230976) && (i != 536864768) && (i != -14745368)) {
          break;
        }
        arrayOfByte = this.zza.zzH();
        i = this.zzg;
        arrayOfByte[0] = ((byte)(i >> 24 & 0xFF));
        arrayOfByte[1] = ((byte)(i >> 16 & 0xFF));
        arrayOfByte[2] = ((byte)(i >> 8 & 0xFF));
        arrayOfByte[3] = ((byte)(i & 0xFF));
        this.zzf = 4;
        this.zzg = 0;
        this.zze = 1;
      }
    }
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    paramzzajt.zzc();
    this.zzc = paramzzajt.zzb();
    this.zzd = paramzzaar.zzv(paramzzajt.zza(), 1);
  }
  
  public final void zzc() {}
  
  public final void zzd(long paramLong, int paramInt)
  {
    if (paramLong != -9223372036854775807L) {
      this.zzk = paramLong;
    }
  }
  
  public final void zze()
  {
    this.zze = 0;
    this.zzf = 0;
    this.zzg = 0;
    this.zzk = -9223372036854775807L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */