package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzact
  implements zzaao
{
  public static final zzaav zza = zzacs.zza;
  private final zzfd zzb = new zzfd(4);
  private final zzfd zzc = new zzfd(9);
  private final zzfd zzd = new zzfd(11);
  private final zzfd zze = new zzfd();
  private final zzacu zzf = new zzacu();
  private zzaar zzg;
  private int zzh = 1;
  private boolean zzi;
  private long zzj;
  private int zzk;
  private int zzl;
  private int zzm;
  private long zzn;
  private boolean zzo;
  private zzacr zzp;
  private zzacx zzq;
  
  private final zzfd zze(zzaap paramzzaap)
    throws IOException
  {
    if (this.zzm > this.zze.zzb())
    {
      localObject = this.zze;
      i = ((zzfd)localObject).zzb();
      ((zzfd)localObject).zzD(new byte[Math.max(i + i, this.zzm)], 0);
    }
    else
    {
      this.zze.zzF(0);
    }
    this.zze.zzE(this.zzm);
    Object localObject = this.zze.zzH();
    int i = this.zzm;
    ((zzaae)paramzzaap).zzn((byte[])localObject, 0, i, false);
    return this.zze;
  }
  
  @RequiresNonNull({"extractorOutput"})
  private final void zzf()
  {
    if (!this.zzo)
    {
      this.zzg.zzN(new zzabm(-9223372036854775807L, 0L));
      this.zzo = true;
    }
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    zzdy.zzb(this.zzg);
    for (;;)
    {
      int j = this.zzh;
      int i = 8;
      if (j != 1)
      {
        if (j != 2)
        {
          long l;
          if (j != 3)
          {
            if (j == 4)
            {
              if (this.zzi) {
                l = this.zzj + this.zzn;
              } else if (this.zzf.zzc() == -9223372036854775807L) {
                l = 0L;
              } else {
                l = this.zzn;
              }
              j = this.zzl;
              if (j == 8)
              {
                if (this.zzp == null) {
                  break label136;
                }
                zzf();
                bool1 = this.zzp.zzf(zze(paramzzaap), l);
              }
              for (;;)
              {
                i = 1;
                break label283;
                i = j;
                label136:
                if (i == 9)
                {
                  if (this.zzq == null) {
                    break;
                  }
                  zzf();
                  bool1 = this.zzq.zzf(zze(paramzzaap), l);
                }
                else
                {
                  if ((i != 18) || (this.zzo)) {
                    break;
                  }
                  boolean bool2 = this.zzf.zzf(zze(paramzzaap), l);
                  paramzzabk = this.zzf;
                  l = paramzzabk.zzc();
                  bool1 = bool2;
                  if (l != -9223372036854775807L)
                  {
                    this.zzg.zzN(new zzabg(paramzzabk.zzd(), paramzzabk.zze(), l));
                    this.zzo = true;
                    bool1 = bool2;
                  }
                }
              }
              i = this.zzm;
              ((zzaae)paramzzaap).zzo(i, false);
              boolean bool1 = false;
              i = 0;
              label283:
              if ((!this.zzi) && (bool1))
              {
                this.zzi = true;
                if (this.zzf.zzc() == -9223372036854775807L) {
                  l = -this.zzn;
                } else {
                  l = 0L;
                }
                this.zzj = l;
              }
              this.zzk = 4;
              this.zzh = 2;
              if (i != 0) {
                return 0;
              }
            }
            else
            {
              throw new IllegalStateException();
            }
          }
          else
          {
            if (!paramzzaap.zzn(this.zzd.zzH(), 0, 11, true)) {
              return -1;
            }
            this.zzd.zzF(0);
            this.zzl = this.zzd.zzk();
            this.zzm = this.zzd.zzm();
            this.zzn = this.zzd.zzm();
            i = this.zzd.zzk();
            l = this.zzn;
            this.zzn = ((i << 24 | l) * 1000L);
            this.zzd.zzG(3);
            this.zzh = 4;
          }
        }
        else
        {
          i = this.zzk;
          ((zzaae)paramzzaap).zzo(i, false);
          this.zzk = 0;
          this.zzh = 3;
        }
      }
      else
      {
        if (!paramzzaap.zzn(this.zzc.zzH(), 0, 9, true)) {
          return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzG(4);
        i = this.zzc.zzk();
        if (((i & 0x4) != 0) && (this.zzp == null)) {
          this.zzp = new zzacr(this.zzg.zzv(8, 1));
        }
        if (((i & 0x1) != 0) && (this.zzq == null)) {
          this.zzq = new zzacx(this.zzg.zzv(9, 2));
        }
        this.zzg.zzC();
        this.zzk = (this.zzc.zze() - 5);
        this.zzh = 2;
      }
    }
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzg = paramzzaar;
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    if (paramLong1 == 0L)
    {
      this.zzh = 1;
      this.zzi = false;
    }
    else
    {
      this.zzh = 3;
    }
    this.zzk = 0;
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    byte[] arrayOfByte = this.zzb.zzH();
    zzaae localzzaae = (zzaae)paramzzaap;
    localzzaae.zzm(arrayOfByte, 0, 3, false);
    this.zzb.zzF(0);
    if (this.zzb.zzm() != 4607062) {
      return false;
    }
    localzzaae.zzm(this.zzb.zzH(), 0, 2, false);
    this.zzb.zzF(0);
    if ((this.zzb.zzo() & 0xFA) != 0) {
      return false;
    }
    localzzaae.zzm(this.zzb.zzH(), 0, 4, false);
    this.zzb.zzF(0);
    int i = this.zzb.zze();
    paramzzaap.zzj();
    localzzaae.zzl(i, false);
    localzzaae.zzm(this.zzb.zzH(), 0, 4, false);
    this.zzb.zzF(0);
    return this.zzb.zze() == 0;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzact.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */