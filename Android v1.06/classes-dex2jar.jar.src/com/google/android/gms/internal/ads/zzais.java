package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzais
  implements zzaih
{
  private final zzaji zza;
  private String zzb;
  private zzabr zzc;
  private zzair zzd;
  private boolean zze;
  private final boolean[] zzf;
  private final zzaiw zzg;
  private final zzaiw zzh;
  private final zzaiw zzi;
  private final zzaiw zzj;
  private final zzaiw zzk;
  private long zzl;
  private long zzm;
  private final zzfd zzn;
  
  public zzais(zzaji paramzzaji)
  {
    this.zza = paramzzaji;
    this.zzf = new boolean[3];
    this.zzg = new zzaiw(32, 128);
    this.zzh = new zzaiw(33, 128);
    this.zzi = new zzaiw(34, 128);
    this.zzj = new zzaiw(39, 128);
    this.zzk = new zzaiw(40, 128);
    this.zzm = -9223372036854775807L;
    this.zzn = new zzfd();
  }
  
  @RequiresNonNull({"sampleReader"})
  private final void zzf(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.zzd.zzb(paramArrayOfByte, paramInt1, paramInt2);
    if (!this.zze)
    {
      this.zzg.zza(paramArrayOfByte, paramInt1, paramInt2);
      this.zzh.zza(paramArrayOfByte, paramInt1, paramInt2);
      this.zzi.zza(paramArrayOfByte, paramInt1, paramInt2);
    }
    this.zzj.zza(paramArrayOfByte, paramInt1, paramInt2);
    this.zzk.zza(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void zza(zzfd paramzzfd)
  {
    zzdy.zzb(this.zzc);
    int i = zzfn.zza;
    while (paramzzfd.zza() > 0)
    {
      i = paramzzfd.zzc();
      int n = paramzzfd.zzd();
      byte[] arrayOfByte = paramzzfd.zzH();
      this.zzl += paramzzfd.zza();
      this.zzc.zzq(paramzzfd, paramzzfd.zza());
      while (i < n)
      {
        int m = zzew.zza(arrayOfByte, i, n, this.zzf);
        if (m == n) {
          break label1846;
        }
        int i6 = m + 3;
        int k = arrayOfByte[i6] & 0x7E;
        int j = m - i;
        if (j > 0) {
          zzf(arrayOfByte, i, m);
        }
        int i7 = n - m;
        long l1 = this.zzl - i7;
        int i1;
        if (j < 0) {
          i1 = -j;
        } else {
          i1 = 0;
        }
        long l2 = this.zzm;
        this.zzd.zza(l1, i7, this.zze);
        Object localObject1;
        if (!this.zze)
        {
          this.zzg.zzd(i1);
          this.zzh.zzd(i1);
          this.zzi.zzd(i1);
          Object localObject4 = this.zzg;
          if (((zzaiw)localObject4).zze())
          {
            Object localObject3 = this.zzh;
            if (((zzaiw)localObject3).zze())
            {
              Object localObject2 = this.zzi;
              if (((zzaiw)localObject2).zze())
              {
                zzabr localzzabr = this.zzc;
                String str = this.zzb;
                i = ((zzaiw)localObject4).zzb;
                localObject1 = new byte[((zzaiw)localObject3).zzb + i + ((zzaiw)localObject2).zzb];
                System.arraycopy(((zzaiw)localObject4).zza, 0, localObject1, 0, i);
                System.arraycopy(((zzaiw)localObject3).zza, 0, localObject1, ((zzaiw)localObject4).zzb, ((zzaiw)localObject3).zzb);
                System.arraycopy(((zzaiw)localObject2).zza, 0, localObject1, ((zzaiw)localObject4).zzb + ((zzaiw)localObject3).zzb, ((zzaiw)localObject2).zzb);
                localObject3 = new zzfe(((zzaiw)localObject3).zza, 0, ((zzaiw)localObject3).zzb);
                ((zzfe)localObject3).zze(44);
                int i4 = ((zzfe)localObject3).zza(3);
                ((zzfe)localObject3).zzd();
                int i8 = ((zzfe)localObject3).zza(2);
                boolean bool2 = ((zzfe)localObject3).zzf();
                int i9 = ((zzfe)localObject3).zza(5);
                j = 0;
                for (int i2 = 0; j < 32; i2 = i)
                {
                  i = i2;
                  if (((zzfe)localObject3).zzf()) {
                    i = i2 | 1 << j;
                  }
                  j++;
                }
                localObject2 = new int[6];
                for (i = 0; i < 6; i++) {
                  localObject2[i] = ((zzfe)localObject3).zza(8);
                }
                int i10 = ((zzfe)localObject3).zza(8);
                i = 0;
                for (m = 0; m < i4; m++)
                {
                  j = i;
                  if (((zzfe)localObject3).zzf()) {
                    j = i + 89;
                  }
                  i = j;
                  if (((zzfe)localObject3).zzf()) {
                    i = j + 8;
                  }
                }
                ((zzfe)localObject3).zze(i);
                if (i4 > 0)
                {
                  i = 8 - i4;
                  ((zzfe)localObject3).zze(i + i);
                }
                ((zzfe)localObject3).zzc();
                j = ((zzfe)localObject3).zzc();
                i = j;
                if (j == 3)
                {
                  ((zzfe)localObject3).zzd();
                  i = 3;
                }
                int i5 = ((zzfe)localObject3).zzc();
                m = ((zzfe)localObject3).zzc();
                int i3 = i5;
                j = m;
                int i12;
                if (((zzfe)localObject3).zzf())
                {
                  int i14 = ((zzfe)localObject3).zzc();
                  int i13 = ((zzfe)localObject3).zzc();
                  i12 = ((zzfe)localObject3).zzc();
                  i11 = ((zzfe)localObject3).zzc();
                  j = i;
                  if (i != 1) {
                    if (i == 2)
                    {
                      j = 2;
                    }
                    else
                    {
                      i3 = 1;
                      j = i;
                      i = i3;
                      break label729;
                    }
                  }
                  i = 2;
                  label729:
                  if (j == 1) {
                    j = 2;
                  } else {
                    j = 1;
                  }
                  i3 = i5 - i * (i14 + i13);
                  j = m - j * (i12 + i11);
                }
                ((zzfe)localObject3).zzc();
                ((zzfe)localObject3).zzc();
                int i11 = ((zzfe)localObject3).zzc();
                if (true != ((zzfe)localObject3).zzf()) {
                  i = i4;
                }
                for (i = 0; i <= i4; i++)
                {
                  ((zzfe)localObject3).zzc();
                  ((zzfe)localObject3).zzc();
                  ((zzfe)localObject3).zzc();
                }
                ((zzfe)localObject3).zzc();
                ((zzfe)localObject3).zzc();
                ((zzfe)localObject3).zzc();
                ((zzfe)localObject3).zzc();
                ((zzfe)localObject3).zzc();
                ((zzfe)localObject3).zzc();
                m = k;
                if (((zzfe)localObject3).zzf())
                {
                  m = k;
                  if (((zzfe)localObject3).zzf())
                  {
                    i4 = 0;
                    i = k;
                    for (;;)
                    {
                      m = i;
                      if (i4 >= 4) {
                        break;
                      }
                      k = 0;
                      while (k < 6)
                      {
                        if (!((zzfe)localObject3).zzf()) {
                          ((zzfe)localObject3).zzc();
                        }
                        for (;;)
                        {
                          break;
                          i5 = Math.min(64, 1 << i4 + i4 + 4);
                          if (i4 > 1) {
                            ((zzfe)localObject3).zzb();
                          }
                          for (m = 0; m < i5; m++) {
                            ((zzfe)localObject3).zzb();
                          }
                        }
                        if (i4 == 3) {
                          m = 3;
                        } else {
                          m = 1;
                        }
                        k += m;
                      }
                      i4++;
                    }
                  }
                }
                ((zzfe)localObject3).zze(2);
                if (((zzfe)localObject3).zzf())
                {
                  ((zzfe)localObject3).zze(8);
                  ((zzfe)localObject3).zzc();
                  ((zzfe)localObject3).zzc();
                  ((zzfe)localObject3).zzd();
                }
                i = ((zzfe)localObject3).zzc();
                k = 0;
                boolean bool1 = false;
                i4 = 0;
                while (k < i)
                {
                  if (k != 0) {
                    bool1 = ((zzfe)localObject3).zzf();
                  }
                  if (bool1)
                  {
                    ((zzfe)localObject3).zzd();
                    ((zzfe)localObject3).zzc();
                    for (i5 = 0; i5 <= i4; i5++) {
                      if (((zzfe)localObject3).zzf()) {
                        ((zzfe)localObject3).zzd();
                      }
                    }
                  }
                  else
                  {
                    i5 = ((zzfe)localObject3).zzc();
                    i12 = ((zzfe)localObject3).zzc();
                    for (i4 = 0; i4 < i5; i4++)
                    {
                      ((zzfe)localObject3).zzc();
                      ((zzfe)localObject3).zzd();
                    }
                    for (i4 = 0; i4 < i12; i4++)
                    {
                      ((zzfe)localObject3).zzc();
                      ((zzfe)localObject3).zzd();
                    }
                    i4 = i5 + i12;
                  }
                  k++;
                }
                if (((zzfe)localObject3).zzf()) {
                  for (i = 0; i < ((zzfe)localObject3).zzc(); i++) {
                    ((zzfe)localObject3).zze(i11 + 5);
                  }
                }
                ((zzfe)localObject3).zze(2);
                bool1 = ((zzfe)localObject3).zzf();
                float f3 = 1.0F;
                float f2 = f3;
                i = j;
                if (bool1)
                {
                  float f1 = f3;
                  if (((zzfe)localObject3).zzf())
                  {
                    i = ((zzfe)localObject3).zza(8);
                    if (i == 255)
                    {
                      k = ((zzfe)localObject3).zza(16);
                      i = ((zzfe)localObject3).zza(16);
                      f1 = f3;
                      if (k != 0)
                      {
                        f1 = f3;
                        if (i != 0) {
                          f1 = k / i;
                        }
                      }
                    }
                    else if (i < 17)
                    {
                      f1 = zzew.zzb[i];
                    }
                    else
                    {
                      localObject4 = new StringBuilder();
                      ((StringBuilder)localObject4).append("Unexpected aspect_ratio_idc value: ");
                      ((StringBuilder)localObject4).append(i);
                      zzer.zze("H265Reader", ((StringBuilder)localObject4).toString());
                      f1 = f3;
                    }
                  }
                  if (((zzfe)localObject3).zzf()) {
                    ((zzfe)localObject3).zzd();
                  }
                  if (((zzfe)localObject3).zzf())
                  {
                    ((zzfe)localObject3).zze(4);
                    if (((zzfe)localObject3).zzf()) {
                      ((zzfe)localObject3).zze(24);
                    }
                  }
                  if (((zzfe)localObject3).zzf())
                  {
                    ((zzfe)localObject3).zzc();
                    ((zzfe)localObject3).zzc();
                  }
                  ((zzfe)localObject3).zzd();
                  f2 = f1;
                  i = j;
                  if (((zzfe)localObject3).zzf())
                  {
                    i = j + j;
                    f2 = f1;
                  }
                }
                localObject3 = zzea.zzb(i8, bool2, i9, i2, (int[])localObject2, i10);
                localObject2 = new zzak();
                ((zzak)localObject2).zzH(str);
                ((zzak)localObject2).zzS("video/hevc");
                ((zzak)localObject2).zzx((String)localObject3);
                ((zzak)localObject2).zzX(i3);
                ((zzak)localObject2).zzF(i);
                ((zzak)localObject2).zzP(f2);
                ((zzak)localObject2).zzI(Collections.singletonList(localObject1));
                localzzabr.zzk(((zzak)localObject2).zzY());
                this.zze = true;
                break label1616;
              }
            }
          }
        }
        m = k;
        label1616:
        if (this.zzj.zzd(i1))
        {
          localObject1 = this.zzj;
          i = zzew.zzb(((zzaiw)localObject1).zza, ((zzaiw)localObject1).zzb);
          this.zzn.zzD(this.zzj.zza, i);
          this.zzn.zzG(5);
          this.zza.zza(l2, this.zzn);
        }
        if (this.zzk.zzd(i1))
        {
          localObject1 = this.zzk;
          i = zzew.zzb(((zzaiw)localObject1).zza, ((zzaiw)localObject1).zzb);
          this.zzn.zzD(this.zzk.zza, i);
          this.zzn.zzG(5);
          this.zza.zza(l2, this.zzn);
        }
        i = m >> 1;
        l2 = this.zzm;
        this.zzd.zzd(l1, i7, i, l2, this.zze);
        if (!this.zze)
        {
          this.zzg.zzc(i);
          this.zzh.zzc(i);
          this.zzi.zzc(i);
        }
        this.zzj.zzc(i);
        this.zzk.zzc(i);
        i = i6;
      }
      continue;
      label1846:
      zzf(arrayOfByte, i, n);
    }
  }
  
  public final void zzb(zzaar paramzzaar, zzajt paramzzajt)
  {
    paramzzajt.zzc();
    this.zzb = paramzzajt.zzb();
    zzabr localzzabr = paramzzaar.zzv(paramzzajt.zza(), 2);
    this.zzc = localzzabr;
    this.zzd = new zzair(localzzabr);
    this.zza.zzb(paramzzaar, paramzzajt);
  }
  
  public final void zzc() {}
  
  public final void zzd(long paramLong, int paramInt)
  {
    if (paramLong != -9223372036854775807L) {
      this.zzm = paramLong;
    }
  }
  
  public final void zze()
  {
    this.zzl = 0L;
    this.zzm = -9223372036854775807L;
    zzew.zze(this.zzf);
    this.zzg.zzb();
    this.zzh.zzb();
    this.zzi.zzb();
    this.zzj.zzb();
    this.zzk.zzb();
    zzair localzzair = this.zzd;
    if (localzzair != null) {
      localzzair.zzc();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzais.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */