package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public final class zzaij
  implements zzaih
{
  private static final double[] zza = { 23.976023976023978D, 24.0D, 25.0D, 29.97002997002997D, 30.0D, 50.0D, 59.94005994005994D, 60.0D };
  private String zzb;
  private zzabr zzc;
  private final zzajw zzd;
  private final zzfd zze;
  private final zzaiw zzf;
  private final boolean[] zzg;
  private final zzaii zzh;
  private long zzi;
  private boolean zzj;
  private boolean zzk;
  private long zzl;
  private long zzm;
  private long zzn;
  private long zzo;
  private boolean zzp;
  private boolean zzq;
  
  public zzaij()
  {
    this(null);
  }
  
  zzaij(zzajw paramzzajw)
  {
    this.zzd = paramzzajw;
    this.zzg = new boolean[4];
    this.zzh = new zzaii(128);
    if (paramzzajw != null)
    {
      this.zzf = new zzaiw(178, 128);
      paramzzajw = new zzfd();
    }
    else
    {
      paramzzajw = null;
      this.zzf = null;
    }
    this.zze = paramzzajw;
    this.zzm = -9223372036854775807L;
    this.zzo = -9223372036854775807L;
  }
  
  public final void zza(zzfd paramzzfd)
  {
    zzdy.zzb(this.zzc);
    int n = paramzzfd.zzc();
    int m = paramzzfd.zzd();
    byte[] arrayOfByte1 = paramzzfd.zzH();
    this.zzi += paramzzfd.zza();
    this.zzc.zzq(paramzzfd, paramzzfd.zza());
    for (;;)
    {
      int i3 = zzew.zza(arrayOfByte1, n, m, this.zzg);
      if (i3 == m)
      {
        if (!this.zzk) {
          this.zzh.zza(arrayOfByte1, n, m);
        }
        paramzzfd = this.zzf;
        if (paramzzfd != null) {
          paramzzfd.zza(arrayOfByte1, n, m);
        }
        return;
      }
      Object localObject1 = paramzzfd.zzH();
      int i1 = i3 + 3;
      int i2 = localObject1[i1] & 0xFF;
      int i4 = i3 - n;
      int j;
      label385:
      long l1;
      if (!this.zzk)
      {
        if (i4 > 0) {
          this.zzh.zza(arrayOfByte1, n, i3);
        }
        if (i4 < 0) {
          i = -i4;
        } else {
          i = 0;
        }
        if (this.zzh.zzc(i2, i))
        {
          localObject1 = this.zzh;
          String str = this.zzb;
          Objects.requireNonNull(str);
          byte[] arrayOfByte2 = Arrays.copyOf(((zzaii)localObject1).zzc, ((zzaii)localObject1).zza);
          int i5 = arrayOfByte2[4];
          j = arrayOfByte2[5] & 0xFF;
          i = arrayOfByte2[6];
          int i6 = arrayOfByte2[7];
          i5 = j >> 4 | (i5 & 0xFF) << 4;
          int i7 = (i6 & 0xF0) >> 4;
          i6 = (j & 0xF) << 8 | i & 0xFF;
          if (i7 != 2)
          {
            if (i7 != 3)
            {
              if (i7 != 4)
              {
                f = 1.0F;
                break label385;
              }
              i = i6 * 121;
              j = i5 * 100;
            }
            else
            {
              i = i6 * 16;
              j = i5 * 9;
            }
          }
          else
          {
            i = i6 * 4;
            j = i5 * 3;
          }
          float f = i / j;
          Object localObject2 = new zzak();
          ((zzak)localObject2).zzH(str);
          ((zzak)localObject2).zzS("video/mpeg2");
          ((zzak)localObject2).zzX(i5);
          ((zzak)localObject2).zzF(i6);
          ((zzak)localObject2).zzP(f);
          ((zzak)localObject2).zzI(Collections.singletonList(arrayOfByte2));
          localObject2 = ((zzak)localObject2).zzY();
          i = (arrayOfByte2[7] & 0xF) - 1;
          long l2 = 0L;
          l1 = l2;
          if (i >= 0)
          {
            l1 = l2;
            if (i < 8)
            {
              double d2 = zza[i];
              j = arrayOfByte2[(localObject1.zzb + 9)];
              i = (j & 0x60) >> 5;
              j &= 0x1F;
              double d1 = d2;
              if (i != j) {
                d1 = d2 * ((i + 1.0D) / (j + 1));
              }
              l1 = (1000000.0D / d1);
            }
          }
          localObject1 = Pair.create(localObject2, Long.valueOf(l1));
          this.zzc.zzk((zzam)((Pair)localObject1).first);
          this.zzl = ((Long)((Pair)localObject1).second).longValue();
          this.zzk = true;
        }
      }
      localObject1 = this.zzf;
      int i = i2;
      if (localObject1 != null)
      {
        if (i4 > 0)
        {
          ((zzaiw)localObject1).zza(arrayOfByte1, n, i3);
          i = 0;
        }
        else
        {
          i = -i4;
        }
        if (this.zzf.zzd(i))
        {
          localObject1 = this.zzf;
          i = zzew.zzb(((zzaiw)localObject1).zza, ((zzaiw)localObject1).zzb);
          localObject1 = this.zze;
          j = zzfn.zza;
          ((zzfd)localObject1).zzD(this.zzf.zza, i);
          this.zzd.zza(this.zzo, this.zze);
        }
        i = i2;
        if (i2 == 178)
        {
          if (paramzzfd.zzH()[(i3 + 2)] == 1) {
            this.zzf.zzc(178);
          }
          i = 178;
        }
      }
      if ((i != 0) && (i != 179))
      {
        if (i == 184) {
          this.zzp = true;
        }
      }
      else
      {
        i2 = m - i3;
        if ((this.zzq) && (this.zzk))
        {
          l1 = this.zzo;
          if (l1 != -9223372036854775807L)
          {
            int k = this.zzp;
            n = (int)(this.zzi - this.zzn);
            this.zzc.zzs(l1, k, n - i2, i2, null);
          }
        }
        if ((this.zzj) && (!this.zzq)) {
          break label976;
        }
        this.zzn = (this.zzi - i2);
        l1 = this.zzm;
        if (l1 == -9223372036854775807L)
        {
          l1 = this.zzo;
          if (l1 != -9223372036854775807L) {
            l1 += this.zzl;
          } else {
            l1 = -9223372036854775807L;
          }
        }
        this.zzo = l1;
        this.zzp = false;
        this.zzm = -9223372036854775807L;
        this.zzj = true;
        label976:
        boolean bool;
        if (i == 0) {
          bool = true;
        } else {
          bool = false;
        }
        this.zzq = bool;
      }
      n = i1;
    }
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    paramzzajt.zzc();
    this.zzb = paramzzajt.zzb();
    this.zzc = paramzzaar.zzv(paramzzajt.zza(), 2);
    zzajw localzzajw = this.zzd;
    if (localzzajw != null) {
      localzzajw.zzb(paramzzaar, paramzzajt);
    }
  }
  
  public final void zzc() {}
  
  public final void zzd(long paramLong, int paramInt)
  {
    this.zzm = paramLong;
  }
  
  public final void zze()
  {
    zzew.zze(this.zzg);
    this.zzh.zzb();
    zzaiw localzzaiw = this.zzf;
    if (localzzaiw != null) {
      localzzaiw.zzb();
    }
    this.zzi = 0L;
    this.zzj = false;
    this.zzm = -9223372036854775807L;
    this.zzo = -9223372036854775807L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */