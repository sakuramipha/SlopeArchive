package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public final class zzaim
  implements zzaih
{
  private static final float[] zza = { 1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 1.0F };
  private final zzajw zzb;
  private final zzfd zzc;
  private final boolean[] zzd;
  private final zzaik zze;
  private final zzaiw zzf;
  private zzail zzg;
  private long zzh;
  private String zzi;
  private zzabr zzj;
  private boolean zzk;
  private long zzl;
  
  public zzaim()
  {
    this(null);
  }
  
  zzaim(zzajw paramzzajw)
  {
    this.zzb = paramzzajw;
    this.zzd = new boolean[4];
    this.zze = new zzaik(128);
    this.zzl = -9223372036854775807L;
    this.zzf = new zzaiw(178, 128);
    this.zzc = new zzfd();
  }
  
  public final void zza(zzfd paramzzfd)
  {
    zzdy.zzb(this.zzg);
    zzdy.zzb(this.zzj);
    int i = paramzzfd.zzc();
    int i1 = paramzzfd.zzd();
    byte[] arrayOfByte = paramzzfd.zzH();
    this.zzh += paramzzfd.zza();
    this.zzj.zzq(paramzzfd, paramzzfd.zza());
    for (;;)
    {
      int i2 = zzew.zza(arrayOfByte, i, i1, this.zzd);
      if (i2 == i1)
      {
        if (!this.zzk) {
          this.zze.zza(arrayOfByte, i, i1);
        }
        this.zzg.zza(arrayOfByte, i, i1);
        this.zzf.zza(arrayOfByte, i, i1);
        return;
      }
      Object localObject1 = paramzzfd.zzH();
      int m = i2 + 3;
      int n = localObject1[m] & 0xFF;
      int i3 = i2 - i;
      if (!this.zzk)
      {
        if (i3 > 0) {
          this.zze.zza(arrayOfByte, i, i2);
        }
        if (i3 < 0) {
          j = -i3;
        } else {
          j = 0;
        }
        if (this.zze.zzc(n, j))
        {
          localObject1 = this.zzj;
          Object localObject2 = this.zze;
          j = ((zzaik)localObject2).zzb;
          String str = this.zzi;
          Objects.requireNonNull(str);
          localObject2 = Arrays.copyOf(((zzaik)localObject2).zzc, ((zzaik)localObject2).zza);
          Object localObject3 = new zzfc((byte[])localObject2, localObject2.length);
          ((zzfc)localObject3).zzm(j);
          ((zzfc)localObject3).zzm(4);
          ((zzfc)localObject3).zzk();
          ((zzfc)localObject3).zzl(8);
          if (((zzfc)localObject3).zzn())
          {
            ((zzfc)localObject3).zzl(4);
            ((zzfc)localObject3).zzl(3);
          }
          j = ((zzfc)localObject3).zzd(4);
          if (j == 15)
          {
            j = ((zzfc)localObject3).zzd(8);
            k = ((zzfc)localObject3).zzd(8);
            if (k == 0)
            {
              zzer.zze("H263Reader", "Invalid aspect ratio");
              break label397;
            }
            f = j / k;
          }
          else
          {
            if (j >= 7) {
              break label390;
            }
            f = zza[j];
          }
          break label399;
          label390:
          zzer.zze("H263Reader", "Invalid aspect ratio");
          label397:
          float f = 1.0F;
          label399:
          if (((zzfc)localObject3).zzn())
          {
            ((zzfc)localObject3).zzl(2);
            ((zzfc)localObject3).zzl(1);
            if (((zzfc)localObject3).zzn())
            {
              ((zzfc)localObject3).zzl(15);
              ((zzfc)localObject3).zzk();
              ((zzfc)localObject3).zzl(15);
              ((zzfc)localObject3).zzk();
              ((zzfc)localObject3).zzl(15);
              ((zzfc)localObject3).zzk();
              ((zzfc)localObject3).zzl(3);
              ((zzfc)localObject3).zzl(11);
              ((zzfc)localObject3).zzk();
              ((zzfc)localObject3).zzl(15);
              ((zzfc)localObject3).zzk();
            }
          }
          if (((zzfc)localObject3).zzd(2) != 0) {
            zzer.zze("H263Reader", "Unhandled video object layer shape");
          }
          ((zzfc)localObject3).zzk();
          j = ((zzfc)localObject3).zzd(16);
          ((zzfc)localObject3).zzk();
          if (((zzfc)localObject3).zzn()) {
            if (j == 0)
            {
              zzer.zze("H263Reader", "Invalid vop_increment_time_resolution");
            }
            else
            {
              k = j - 1;
              for (j = 0; k > 0; j++) {
                k >>= 1;
              }
              ((zzfc)localObject3).zzl(j);
            }
          }
          ((zzfc)localObject3).zzk();
          int k = ((zzfc)localObject3).zzd(13);
          ((zzfc)localObject3).zzk();
          j = ((zzfc)localObject3).zzd(13);
          ((zzfc)localObject3).zzk();
          ((zzfc)localObject3).zzk();
          localObject3 = new zzak();
          ((zzak)localObject3).zzH(str);
          ((zzak)localObject3).zzS("video/mp4v-es");
          ((zzak)localObject3).zzX(k);
          ((zzak)localObject3).zzF(j);
          ((zzak)localObject3).zzP(f);
          ((zzak)localObject3).zzI(Collections.singletonList(localObject2));
          ((zzabr)localObject1).zzk(((zzak)localObject3).zzY());
          this.zzk = true;
        }
      }
      this.zzg.zza(arrayOfByte, i, i2);
      localObject1 = this.zzf;
      if (i3 > 0)
      {
        ((zzaiw)localObject1).zza(arrayOfByte, i, i2);
        i = 0;
      }
      else
      {
        i = -i3;
      }
      if (this.zzf.zzd(i))
      {
        localObject1 = this.zzf;
        i = zzew.zzb(((zzaiw)localObject1).zza, ((zzaiw)localObject1).zzb);
        localObject1 = this.zzc;
        j = zzfn.zza;
        ((zzfd)localObject1).zzD(this.zzf.zza, i);
        this.zzb.zza(this.zzl, this.zzc);
      }
      i = n;
      if (n == 178)
      {
        if (paramzzfd.zzH()[(i2 + 2)] == 1) {
          this.zzf.zzc(178);
        }
        i = 178;
      }
      int j = i1 - i2;
      long l1 = this.zzh;
      long l2 = j;
      this.zzg.zzb(l1 - l2, j, this.zzk);
      this.zzg.zzc(i, this.zzl);
      i = m;
    }
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    paramzzajt.zzc();
    this.zzi = paramzzajt.zzb();
    zzabr localzzabr = paramzzaar.zzv(paramzzajt.zza(), 2);
    this.zzj = localzzabr;
    this.zzg = new zzail(localzzabr);
    this.zzb.zzb(paramzzaar, paramzzajt);
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
    zzew.zze(this.zzd);
    this.zze.zzb();
    zzail localzzail = this.zzg;
    if (localzzail != null) {
      localzzail.zzd();
    }
    this.zzf.zzb();
    this.zzh = 0L;
    this.zzl = -9223372036854775807L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */