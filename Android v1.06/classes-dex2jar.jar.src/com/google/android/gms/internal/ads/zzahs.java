package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

abstract class zzahs
{
  private final zzahl zza = new zzahl();
  private zzabr zzb;
  private zzaar zzc;
  private zzahn zzd;
  private long zze;
  private long zzf;
  private long zzg;
  private int zzh;
  private int zzi;
  private zzahp zzj = new zzahp();
  private long zzk;
  private boolean zzl;
  private boolean zzm;
  
  protected abstract long zza(zzfd paramzzfd);
  
  protected void zzb(boolean paramBoolean)
  {
    int i;
    if (paramBoolean)
    {
      this.zzj = new zzahp();
      this.zzf = 0L;
      i = 0;
    }
    else
    {
      i = 1;
    }
    this.zzh = i;
    this.zze = -1L;
    this.zzg = 0L;
  }
  
  @EnsuresNonNullIf(expression={"#3.format"}, result=false)
  protected abstract boolean zzc(zzfd paramzzfd, long paramLong, zzahp paramzzahp)
    throws IOException;
  
  final int zze(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    zzdy.zzb(this.zzb);
    int i = zzfn.zza;
    int j = this.zzh;
    i = -1;
    long l1;
    long l2;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2) {
          return -1;
        }
        l1 = this.zzd.zzd(paramzzaap);
        if (l1 >= 0L)
        {
          paramzzabk.zza = l1;
          i = 1;
        }
        else
        {
          if (l1 < -1L) {
            zzi(-(l1 + 2L));
          }
          if (!this.zzl)
          {
            paramzzabk = this.zzd.zze();
            zzdy.zzb(paramzzabk);
            this.zzc.zzN(paramzzabk);
            this.zzl = true;
          }
          if ((this.zzk <= 0L) && (!this.zza.zze(paramzzaap)))
          {
            this.zzh = 3;
          }
          else
          {
            this.zzk = 0L;
            paramzzaap = this.zza.zza();
            l1 = zza(paramzzaap);
            if (l1 >= 0L)
            {
              l2 = this.zzg;
              if (l2 + l1 >= this.zze)
              {
                l2 = zzf(l2);
                zzabp.zzb(this.zzb, paramzzaap, paramzzaap.zzd());
                this.zzb.zzs(l2, 1, paramzzaap.zzd(), 0, null);
                this.zze = -1L;
              }
            }
            this.zzg += l1;
            i = 0;
          }
        }
        return i;
      }
      i = (int)this.zzf;
      ((zzaae)paramzzaap).zzo(i, false);
      this.zzh = 2;
      return 0;
    }
    for (;;)
    {
      if (!this.zza.zze(paramzzaap))
      {
        this.zzh = 3;
        return i;
      }
      l2 = paramzzaap.zzf();
      l1 = this.zzf;
      this.zzk = (l2 - l1);
      if (!zzc(this.zza.zza(), l1, this.zzj)) {
        break;
      }
      this.zzf = paramzzaap.zzf();
    }
    paramzzabk = this.zzj.zza;
    this.zzi = paramzzabk.zzA;
    if (!this.zzm)
    {
      this.zzb.zzk(paramzzabk);
      this.zzm = true;
    }
    paramzzabk = this.zzj.zzb;
    if (paramzzabk != null)
    {
      this.zzd = paramzzabk;
    }
    else if (paramzzaap.zzd() == -1L)
    {
      this.zzd = new zzahr(null);
    }
    else
    {
      paramzzabk = this.zza.zzb();
      boolean bool;
      if ((paramzzabk.zza & 0x4) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      l1 = this.zzf;
      l2 = paramzzaap.zzd();
      j = paramzzabk.zzd;
      i = paramzzabk.zze;
      long l3 = paramzzabk.zzb;
      this.zzd = new zzahg(this, l1, l2, j + i, l3, bool);
    }
    this.zzh = 2;
    this.zza.zzd();
    i = 0;
    return i;
  }
  
  protected final long zzf(long paramLong)
  {
    return paramLong * 1000000L / this.zzi;
  }
  
  protected final long zzg(long paramLong)
  {
    return this.zzi * paramLong / 1000000L;
  }
  
  final void zzh(zzaar paramzzaar, zzabr paramzzabr)
  {
    this.zzc = paramzzaar;
    this.zzb = paramzzabr;
    zzb(true);
  }
  
  protected void zzi(long paramLong)
  {
    this.zzg = paramLong;
  }
  
  final void zzj(long paramLong1, long paramLong2)
  {
    this.zza.zzc();
    if (paramLong1 == 0L)
    {
      zzb(this.zzl ^ true);
      return;
    }
    if (this.zzh != 0)
    {
      this.zze = zzg(paramLong2);
      zzahn localzzahn = this.zzd;
      int i = zzfn.zza;
      localzzahn.zzg(this.zze);
      this.zzh = 2;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */