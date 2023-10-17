package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzaiq
  implements zzaih
{
  private final zzaji zza;
  private final zzaiw zzb;
  private final zzaiw zzc;
  private final zzaiw zzd;
  private long zze;
  private final boolean[] zzf;
  private String zzg;
  private zzabr zzh;
  private zzaip zzi;
  private boolean zzj;
  private long zzk;
  private boolean zzl;
  private final zzfd zzm;
  
  public zzaiq(zzaji paramzzaji, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zza = paramzzaji;
    this.zzf = new boolean[3];
    this.zzb = new zzaiw(7, 128);
    this.zzc = new zzaiw(8, 128);
    this.zzd = new zzaiw(6, 128);
    this.zzk = -9223372036854775807L;
    this.zzm = new zzfd();
  }
  
  @RequiresNonNull({"sampleReader"})
  private final void zzf(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!this.zzj)
    {
      this.zzb.zza(paramArrayOfByte, paramInt1, paramInt2);
      this.zzc.zza(paramArrayOfByte, paramInt1, paramInt2);
    }
    this.zzd.zza(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void zza(zzfd paramzzfd)
  {
    zzdy.zzb(this.zzh);
    int i = zzfn.zza;
    int j = paramzzfd.zzc();
    i = paramzzfd.zzd();
    byte[] arrayOfByte = paramzzfd.zzH();
    this.zze += paramzzfd.zza();
    this.zzh.zzq(paramzzfd, paramzzfd.zza());
    for (;;)
    {
      int n = zzew.zza(arrayOfByte, j, i, this.zzf);
      if (n == i) {
        break;
      }
      int k = n + 3;
      int m = arrayOfByte[k] & 0x1F;
      int i1 = n - j;
      if (i1 > 0) {
        zzf(arrayOfByte, j, n);
      }
      n = i - n;
      long l1 = this.zze - n;
      if (i1 < 0) {
        j = -i1;
      } else {
        j = 0;
      }
      long l2 = this.zzk;
      if (!this.zzj)
      {
        do
        {
          this.zzb.zzd(j);
          this.zzc.zzd(j);
          if (this.zzj) {
            break;
          }
        } while ((!this.zzb.zze()) || (!this.zzc.zze()));
        paramzzfd = new ArrayList();
        Object localObject1 = this.zzb;
        paramzzfd.add(Arrays.copyOf(((zzaiw)localObject1).zza, ((zzaiw)localObject1).zzb));
        localObject1 = this.zzc;
        paramzzfd.add(Arrays.copyOf(((zzaiw)localObject1).zza, ((zzaiw)localObject1).zzb));
        localObject1 = this.zzb;
        localObject1 = zzew.zzd(((zzaiw)localObject1).zza, 4, ((zzaiw)localObject1).zzb);
        Object localObject2 = this.zzc;
        zzeu localzzeu = zzew.zzc(((zzaiw)localObject2).zza, 4, ((zzaiw)localObject2).zzb);
        String str = zzea.zza(((zzev)localObject1).zza, ((zzev)localObject1).zzb, ((zzev)localObject1).zzc);
        zzabr localzzabr = this.zzh;
        localObject2 = new zzak();
        ((zzak)localObject2).zzH(this.zzg);
        ((zzak)localObject2).zzS("video/avc");
        ((zzak)localObject2).zzx(str);
        ((zzak)localObject2).zzX(((zzev)localObject1).zze);
        ((zzak)localObject2).zzF(((zzev)localObject1).zzf);
        ((zzak)localObject2).zzP(((zzev)localObject1).zzg);
        ((zzak)localObject2).zzI(paramzzfd);
        localzzabr.zzk(((zzak)localObject2).zzY());
        this.zzj = true;
        this.zzi.zzb((zzev)localObject1);
        this.zzi.zza(localzzeu);
        this.zzb.zzb();
        this.zzc.zzb();
        break label542;
        paramzzfd = this.zzb;
        if (paramzzfd.zze())
        {
          paramzzfd = zzew.zzd(paramzzfd.zza, 4, paramzzfd.zzb);
          this.zzi.zzb(paramzzfd);
          this.zzb.zzb();
        }
        else
        {
          paramzzfd = this.zzc;
          if (paramzzfd.zze())
          {
            paramzzfd = zzew.zzc(paramzzfd.zza, 4, paramzzfd.zzb);
            this.zzi.zza(paramzzfd);
            this.zzc.zzb();
          }
        }
      }
      label542:
      if (this.zzd.zzd(j))
      {
        paramzzfd = this.zzd;
        j = zzew.zzb(paramzzfd.zza, paramzzfd.zzb);
        this.zzm.zzD(this.zzd.zza, j);
        this.zzm.zzF(4);
        this.zza.zza(l2, this.zzm);
      }
      if (this.zzi.zze(l1, n, this.zzj, this.zzl)) {
        this.zzl = false;
      }
      l2 = this.zzk;
      if (!this.zzj)
      {
        this.zzb.zzc(m);
        this.zzc.zzc(m);
      }
      this.zzd.zzc(m);
      this.zzi.zzd(l1, m, l2);
      j = k;
    }
    zzf(arrayOfByte, j, i);
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    paramzzajt.zzc();
    this.zzg = paramzzajt.zzb();
    zzabr localzzabr = paramzzaar.zzv(paramzzajt.zza(), 2);
    this.zzh = localzzabr;
    this.zzi = new zzaip(localzzabr, false, false);
    this.zza.zzb(paramzzaar, paramzzajt);
  }
  
  public final void zzc() {}
  
  public final void zzd(long paramLong, int paramInt)
  {
    if (paramLong != -9223372036854775807L) {
      this.zzk = paramLong;
    }
    int i = this.zzl;
    if ((paramInt & 0x2) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    this.zzl = (i | paramInt);
  }
  
  public final void zze()
  {
    this.zze = 0L;
    this.zzl = false;
    this.zzk = -9223372036854775807L;
    zzew.zze(this.zzf);
    this.zzb.zzb();
    this.zzc.zzb();
    this.zzd.zzb();
    zzaip localzzaip = this.zzi;
    if (localzzaip != null) {
      localzzaip.zzc();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaiq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */