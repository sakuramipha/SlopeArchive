package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.Objects;

public final class zzakb
  implements zzaao
{
  public static final zzaav zza = zzajx.zza;
  private zzaar zzb;
  private zzabr zzc;
  private int zzd = 0;
  private long zze = -1L;
  private zzajz zzf;
  private int zzg = -1;
  private long zzh = -1L;
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    zzdy.zzb(this.zzc);
    int i = zzfn.zza;
    i = this.zzd;
    boolean bool = true;
    long l1;
    long l2;
    if (i != 0)
    {
      l1 = -1L;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (this.zzh == -1L) {
              bool = false;
            }
            zzdy.zzf(bool);
            l2 = this.zzh;
            l1 = paramzzaap.zzf();
            paramzzabk = this.zzf;
            Objects.requireNonNull(paramzzabk);
            if (paramzzabk.zzc(paramzzaap, l2 - l1)) {
              return -1;
            }
            return 0;
          }
          paramzzabk = zzake.zza(paramzzaap);
          this.zzg = ((Long)paramzzabk.first).intValue();
          long l3 = ((Long)paramzzabk.second).longValue();
          l2 = this.zze;
          l1 = l3;
          if (l2 != -1L)
          {
            l1 = l3;
            if (l3 == 4294967295L) {
              l1 = l2;
            }
          }
          l3 = this.zzg + l1;
          this.zzh = l3;
          l2 = paramzzaap.zzd();
          l1 = l3;
          if (l2 != -1L)
          {
            l1 = l3;
            if (l3 > l2)
            {
              paramzzaap = new StringBuilder();
              paramzzaap.append("Data exceeds input length: ");
              paramzzaap.append(l3);
              paramzzaap.append(", ");
              paramzzaap.append(l2);
              zzer.zze("WavExtractor", paramzzaap.toString());
              this.zzh = l2;
              l1 = l2;
            }
          }
          paramzzaap = this.zzf;
          Objects.requireNonNull(paramzzaap);
          paramzzaap.zza(this.zzg, l1);
          this.zzd = 4;
          return 0;
        }
        paramzzaap = zzake.zzb(paramzzaap);
        int j = paramzzaap.zza;
        if (j == 17)
        {
          this.zzf = new zzajy(this.zzb, this.zzc, paramzzaap);
        }
        else if (j == 6)
        {
          this.zzf = new zzaka(this.zzb, this.zzc, paramzzaap, "audio/g711-alaw", -1);
        }
        else if (j == 7)
        {
          this.zzf = new zzaka(this.zzb, this.zzc, paramzzaap, "audio/g711-mlaw", -1);
        }
        else
        {
          i = paramzzaap.zze;
          if (j != 1) {
            if (j != 3)
            {
              if (j == 65534) {}
            }
            else
            {
              while (i != 32)
              {
                i = 0;
                break;
              }
              i = 4;
              break label461;
            }
          }
          i = zzfn.zzj(i);
          label461:
          if (i == 0) {
            break label495;
          }
          this.zzf = new zzaka(this.zzb, this.zzc, paramzzaap, "audio/raw", i);
        }
        this.zzd = 3;
        return 0;
        label495:
        paramzzaap = new StringBuilder();
        paramzzaap.append("Unsupported WAV format type: ");
        paramzzaap.append(j);
        throw zzce.zzc(paramzzaap.toString());
      }
      zzfd localzzfd = new zzfd(8);
      paramzzabk = zzakd.zza(paramzzaap, localzzfd);
      if (paramzzabk.zza != 1685272116)
      {
        paramzzaap.zzj();
      }
      else
      {
        paramzzaap = (zzaae)paramzzaap;
        paramzzaap.zzl(8, false);
        localzzfd.zzF(0);
        paramzzaap.zzm(localzzfd.zzH(), 0, 8, false);
        l1 = localzzfd.zzp();
        paramzzaap.zzo((int)paramzzabk.zzb + 8, false);
      }
      this.zze = l1;
      this.zzd = 2;
      return 0;
    }
    if (paramzzaap.zzf() == 0L) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzf(bool);
    i = this.zzg;
    if (i != -1)
    {
      ((zzaae)paramzzaap).zzo(i, false);
      this.zzd = 4;
    }
    else
    {
      if (!zzake.zzc(paramzzaap)) {
        break label726;
      }
      l2 = paramzzaap.zze();
      l1 = paramzzaap.zzf();
      ((zzaae)paramzzaap).zzo((int)(l2 - l1), false);
      this.zzd = 1;
    }
    return 0;
    label726:
    throw zzce.zza("Unsupported or unrecognized wav file type.", null);
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzb = paramzzaar;
    this.zzc = paramzzaar.zzv(0, 1);
    paramzzaar.zzC();
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    int i;
    if (paramLong1 == 0L) {
      i = 0;
    } else {
      i = 4;
    }
    this.zzd = i;
    zzajz localzzajz = this.zzf;
    if (localzzajz != null) {
      localzzajz.zzb(paramLong2);
    }
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    return zzake.zzc(paramzzaap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzakb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */