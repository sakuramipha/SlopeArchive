package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzajl
{
  private final zzfl zza = new zzfl(0L);
  private final zzfd zzb = new zzfd();
  private boolean zzc;
  private boolean zzd;
  private boolean zze;
  private long zzf = -9223372036854775807L;
  private long zzg = -9223372036854775807L;
  private long zzh = -9223372036854775807L;
  
  zzajl(int paramInt) {}
  
  private final int zze(zzaap paramzzaap)
  {
    zzfd localzzfd = this.zzb;
    byte[] arrayOfByte = zzfn.zzf;
    int i = arrayOfByte.length;
    localzzfd.zzD(arrayOfByte, 0);
    this.zzc = true;
    paramzzaap.zzj();
    return 0;
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk, int paramInt)
    throws IOException
  {
    int j = 0;
    int m = 0;
    if (paramInt <= 0)
    {
      zze(paramzzaap);
      return 0;
    }
    boolean bool = this.zze;
    long l1 = -9223372036854775807L;
    long l2;
    int i;
    int k;
    if (!bool)
    {
      l2 = paramzzaap.zzd();
      i = (int)Math.min(112800L, l2);
      l2 -= i;
      if (paramzzaap.zzf() != l2)
      {
        paramzzabk.zza = l2;
        paramInt = 1;
      }
      else
      {
        this.zzb.zzC(i);
        paramzzaap.zzj();
        paramzzabk = this.zzb.zzH();
        ((zzaae)paramzzaap).zzm(paramzzabk, 0, i, false);
        paramzzaap = this.zzb;
        int i2 = paramzzaap.zzc();
        int i1 = paramzzaap.zzd();
        for (j = i1 - 188;; j--)
        {
          l2 = l1;
          if (j < i2) {
            break;
          }
          paramzzabk = paramzzaap.zzH();
          k = -4;
          i = 0;
          while (k <= 4)
          {
            int n = k * 188 + j;
            if ((n >= i2) && (n < i1) && (paramzzabk[n] == 71))
            {
              n = i + 1;
              i = n;
              if (n == 5)
              {
                l2 = zzajv.zzb(paramzzaap, j, paramInt);
                if (l2 == -9223372036854775807L) {
                  break;
                }
                break label263;
              }
            }
            else
            {
              i = 0;
            }
            k++;
          }
        }
        label263:
        this.zzg = l2;
        this.zze = true;
        paramInt = m;
      }
      return paramInt;
    }
    if (this.zzg == -9223372036854775807L)
    {
      zze(paramzzaap);
      return 0;
    }
    if (!this.zzd)
    {
      i = (int)Math.min(112800L, paramzzaap.zzd());
      if (paramzzaap.zzf() != 0L)
      {
        paramzzabk.zza = 0L;
        paramInt = 1;
      }
      else
      {
        this.zzb.zzC(i);
        paramzzaap.zzj();
        paramzzabk = this.zzb.zzH();
        ((zzaae)paramzzaap).zzm(paramzzabk, 0, i, false);
        paramzzaap = this.zzb;
        i = paramzzaap.zzc();
        k = paramzzaap.zzd();
        for (;;)
        {
          l2 = l1;
          if (i >= k) {
            break;
          }
          if (paramzzaap.zzH()[i] == 71)
          {
            l2 = zzajv.zzb(paramzzaap, i, paramInt);
            if (l2 != -9223372036854775807L) {
              break;
            }
          }
          i++;
        }
        this.zzf = l2;
        this.zzd = true;
        paramInt = j;
      }
      return paramInt;
    }
    l1 = this.zzf;
    if (l1 == -9223372036854775807L)
    {
      zze(paramzzaap);
      return 0;
    }
    l1 = this.zza.zzb(l1);
    l1 = this.zza.zzb(this.zzg) - l1;
    this.zzh = l1;
    if (l1 < 0L)
    {
      paramzzabk = new StringBuilder();
      paramzzabk.append("Invalid duration: ");
      paramzzabk.append(l1);
      paramzzabk.append(". Using TIME_UNSET instead.");
      zzer.zze("TsDurationReader", paramzzabk.toString());
      this.zzh = -9223372036854775807L;
    }
    zze(paramzzaap);
    return 0;
  }
  
  public final long zzb()
  {
    return this.zzh;
  }
  
  public final zzfl zzc()
  {
    return this.zza;
  }
  
  public final boolean zzd()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */