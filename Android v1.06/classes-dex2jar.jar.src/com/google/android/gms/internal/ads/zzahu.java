package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

final class zzahu
  extends zzahs
{
  private zzaht zza;
  private int zzb;
  private boolean zzc;
  private zzabw zzd;
  private zzabu zze;
  
  protected final long zza(zzfd paramzzfd)
  {
    Object localObject = paramzzfd.zzH();
    int j = 0;
    if ((localObject[0] & 0x1) == 1) {
      return -1L;
    }
    int i = paramzzfd.zzH()[0];
    localObject = this.zza;
    zzdy.zzb(localObject);
    int k = ((zzaht)localObject).zze;
    if (!localObject.zzd[(i >> 1 & 255 >>> 8 - k)].zza) {
      i = ((zzaht)localObject).zza.zze;
    } else {
      i = ((zzaht)localObject).zza.zzf;
    }
    if (this.zzc) {
      j = (this.zzb + i) / 4;
    }
    if (paramzzfd.zzb() < paramzzfd.zzd() + 4)
    {
      localObject = Arrays.copyOf(paramzzfd.zzH(), paramzzfd.zzd() + 4);
      paramzzfd.zzD((byte[])localObject, localObject.length);
    }
    else
    {
      paramzzfd.zzE(paramzzfd.zzd() + 4);
    }
    long l = j;
    localObject = paramzzfd.zzH();
    localObject[(paramzzfd.zzd() - 4)] = ((byte)(int)(l & 0xFF));
    localObject[(paramzzfd.zzd() - 3)] = ((byte)(int)(l >>> 8 & 0xFF));
    localObject[(paramzzfd.zzd() - 2)] = ((byte)(int)(l >>> 16 & 0xFF));
    localObject[(paramzzfd.zzd() - 1)] = ((byte)(int)(l >>> 24 & 0xFF));
    this.zzc = true;
    this.zzb = i;
    return l;
  }
  
  protected final void zzb(boolean paramBoolean)
  {
    super.zzb(paramBoolean);
    if (paramBoolean)
    {
      this.zza = null;
      this.zzd = null;
      this.zze = null;
    }
    this.zzb = 0;
    this.zzc = false;
  }
  
  @EnsuresNonNullIf(expression={"#3.format"}, result=false)
  protected final boolean zzc(zzfd paramzzfd, long paramLong, zzahp paramzzahp)
    throws IOException
  {
    if (this.zza != null)
    {
      Objects.requireNonNull(paramzzahp.zza);
      return false;
    }
    Object localObject1 = this.zzd;
    int i1;
    int n;
    int k;
    int i3;
    boolean bool;
    Object localObject3;
    if (localObject1 == null)
    {
      zzabx.zzd(1, paramzzfd, false);
      m = paramzzfd.zzh();
      i1 = paramzzfd.zzk();
      n = paramzzfd.zzh();
      i = paramzzfd.zzg();
      if (i <= 0) {
        i = -1;
      }
      j = paramzzfd.zzg();
      if (j <= 0) {
        j = -1;
      }
      k = paramzzfd.zzg();
      if (k <= 0) {
        k = -1;
      }
      i3 = paramzzfd.zzk();
      i2 = (int)Math.pow(2.0D, i3 & 0xF);
      i3 = (int)Math.pow(2.0D, (i3 & 0xF0) >> 4);
      if (1 != (paramzzfd.zzk() & 0x1)) {
        bool = false;
      } else {
        bool = true;
      }
      this.zzd = new zzabw(m, i1, n, i, j, k, i2, i3, bool, Arrays.copyOf(paramzzfd.zzH(), paramzzfd.zzd()));
    }
    else
    {
      localObject3 = this.zze;
      if (localObject3 != null) {
        break label232;
      }
      this.zze = zzabx.zzc(paramzzfd, true, true);
    }
    paramzzfd = null;
    break label1626;
    label232:
    Object localObject2 = new byte[paramzzfd.zzd()];
    System.arraycopy(paramzzfd.zzH(), 0, localObject2, 0, paramzzfd.zzd());
    int i2 = ((zzabw)localObject1).zza;
    zzabx.zzd(5, paramzzfd, false);
    int m = paramzzfd.zzk();
    zzabt localzzabt = new zzabt(paramzzfd.zzH());
    localzzabt.zzc(paramzzfd.zzc() * 8);
    int i = 0;
    paramzzfd = (zzfd)localObject1;
    for (;;)
    {
      k = 2;
      if (i >= m + 1) {
        break label647;
      }
      if (localzzabt.zzb(24) != 5653314) {
        break label609;
      }
      i1 = localzzabt.zzb(16);
      n = localzzabt.zzb(24);
      if (!localzzabt.zzd())
      {
        bool = localzzabt.zzd();
        for (j = 0; j < n; j++) {
          if (bool)
          {
            if (localzzabt.zzd()) {
              localzzabt.zzc(5);
            }
          }
          else {
            localzzabt.zzc(5);
          }
        }
      }
      localzzabt.zzc(5);
      j = 0;
      while (j < n) {
        j += localzzabt.zzb(zzabx.zza(n - j));
      }
      j = localzzabt.zzb(4);
      if (j > 2) {
        break;
      }
      if (j != 1) {
        if (j == 2) {
          j = k;
        } else {
          break label572;
        }
      }
      localzzabt.zzc(32);
      localzzabt.zzc(32);
      k = localzzabt.zzb(4);
      localzzabt.zzc(1);
      if (j == 1)
      {
        if (i1 != 0)
        {
          paramLong = n;
          double d = i1;
          paramLong = Math.floor(Math.pow(paramLong, 1.0D / d));
        }
        else
        {
          paramLong = 0L;
        }
      }
      else {
        paramLong = n * i1;
      }
      localzzabt.zzc((int)(paramLong * (k + 1)));
      label572:
      i++;
    }
    paramzzfd = new StringBuilder();
    paramzzfd.append("lookup type greater than 2 not decodable: ");
    paramzzfd.append(j);
    throw zzce.zza(paramzzfd.toString(), null);
    label609:
    i = localzzabt.zza();
    paramzzfd = new StringBuilder();
    paramzzfd.append("expected code book to start with [0x56, 0x43, 0x42] at ");
    paramzzfd.append(i);
    throw zzce.zza(paramzzfd.toString(), null);
    label647:
    int j = localzzabt.zzb(6);
    i = 0;
    while (i < j + 1) {
      if (localzzabt.zzb(16) == 0) {
        i++;
      } else {
        throw zzce.zza("placeholder of time domain transforms not zeroed out", null);
      }
    }
    i = localzzabt.zzb(6) + 1;
    for (j = 0; j < i; j++)
    {
      k = localzzabt.zzb(16);
      if (k != 0)
      {
        if (k == 1)
        {
          i3 = localzzabt.zzb(5);
          localObject1 = new int[i3];
          m = 0;
          for (k = -1; m < i3; k = n)
          {
            i1 = localzzabt.zzb(4);
            localObject1[m] = i1;
            n = k;
            if (i1 > k) {
              n = i1;
            }
            m++;
          }
          n = k + 1;
          int[] arrayOfInt = new int[n];
          for (k = 0; k < n; k++)
          {
            arrayOfInt[k] = (localzzabt.zzb(3) + 1);
            i1 = localzzabt.zzb(2);
            if (i1 > 0) {
              localzzabt.zzc(8);
            }
            for (m = 0; m < 1 << i1; m++) {
              localzzabt.zzc(8);
            }
          }
          k = i;
          localzzabt.zzc(2);
          int i4 = localzzabt.zzb(4);
          m = 0;
          i1 = 0;
          n = 0;
          for (;;)
          {
            i = k;
            if (m >= i3) {
              break;
            }
            i1 += arrayOfInt[localObject1[m]];
            while (n < i1)
            {
              localzzabt.zzc(i4);
              n++;
            }
            m++;
          }
        }
        paramzzfd = new StringBuilder();
        paramzzfd.append("floor type greater than 1 not decodable: ");
        paramzzfd.append(k);
        throw zzce.zza(paramzzfd.toString(), null);
      }
      k = i;
      localzzabt.zzc(8);
      localzzabt.zzc(16);
      localzzabt.zzc(16);
      localzzabt.zzc(6);
      localzzabt.zzc(8);
      n = localzzabt.zzb(4);
      for (m = 0;; m++)
      {
        i = k;
        if (m >= n + 1) {
          break;
        }
        localzzabt.zzc(8);
      }
    }
    m = localzzabt.zzb(6);
    i = 0;
    while (i < m + 1) {
      if (localzzabt.zzb(16) <= 2)
      {
        localzzabt.zzc(24);
        localzzabt.zzc(24);
        localzzabt.zzc(24);
        n = localzzabt.zzb(6) + 1;
        localzzabt.zzc(8);
        localObject1 = new int[n];
        for (j = 0; j < n; j++)
        {
          i1 = localzzabt.zzb(3);
          if (localzzabt.zzd()) {
            k = localzzabt.zzb(5);
          } else {
            k = 0;
          }
          localObject1[j] = (k * 8 + i1);
        }
        for (j = 0; j < n; j++) {
          for (k = 0; k < 8; k++) {
            if ((localObject1[j] & 1 << k) != 0) {
              localzzabt.zzc(8);
            }
          }
        }
        i++;
      }
      else
      {
        throw zzce.zza("residueType greater than 2 is not decodable", null);
      }
    }
    m = localzzabt.zzb(6);
    i = 0;
    while (i < m + 1)
    {
      j = localzzabt.zzb(16);
      if (j != 0)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("mapping type other than 0 not supported: ");
        ((StringBuilder)localObject1).append(j);
        zzer.zzb("VorbisUtil", ((StringBuilder)localObject1).toString());
      }
      else
      {
        if (localzzabt.zzd()) {
          j = localzzabt.zzb(4) + 1;
        } else {
          j = 1;
        }
        if (localzzabt.zzd())
        {
          n = localzzabt.zzb(8);
          for (k = 0; k < n + 1; k++)
          {
            i1 = i2 - 1;
            localzzabt.zzc(zzabx.zza(i1));
            localzzabt.zzc(zzabx.zza(i1));
          }
        }
        if (localzzabt.zzb(2) != 0) {
          break label1517;
        }
        if (j > 1) {
          for (k = 0; k < i2; k++) {
            localzzabt.zzc(4);
          }
        }
        for (k = 0; k < j; k++)
        {
          localzzabt.zzc(8);
          localzzabt.zzc(8);
          localzzabt.zzc(8);
        }
      }
      i++;
      continue;
      label1517:
      throw zzce.zza("to reserved bits must be zero after mapping coupling steps", null);
    }
    j = localzzabt.zzb(6) + 1;
    localObject1 = new zzabv[j];
    for (i = 0; i < j; i++) {
      localObject1[i] = new zzabv(localzzabt.zzd(), localzzabt.zzb(16), localzzabt.zzb(16), localzzabt.zzb(8));
    }
    if (localzzabt.zzd())
    {
      paramzzfd = new zzaht(paramzzfd, (zzabu)localObject3, (byte[])localObject2, (zzabv[])localObject1, zzabx.zza(j - 1));
      label1626:
      this.zza = paramzzfd;
      if (paramzzfd == null) {
        return true;
      }
      localObject2 = paramzzfd.zza;
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(((zzabw)localObject2).zzg);
      ((ArrayList)localObject1).add(paramzzfd.zzc);
      paramzzfd = zzabx.zzb(zzfrr.zzk(paramzzfd.zzb.zzb));
      localObject3 = new zzak();
      ((zzak)localObject3).zzS("audio/vorbis");
      ((zzak)localObject3).zzv(((zzabw)localObject2).zzd);
      ((zzak)localObject3).zzO(((zzabw)localObject2).zzc);
      ((zzak)localObject3).zzw(((zzabw)localObject2).zza);
      ((zzak)localObject3).zzT(((zzabw)localObject2).zzb);
      ((zzak)localObject3).zzI((List)localObject1);
      ((zzak)localObject3).zzM(paramzzfd);
      paramzzahp.zza = ((zzak)localObject3).zzY();
      return true;
    }
    throw zzce.zza("framing bit after modes not set as expected", null);
  }
  
  protected final void zzi(long paramLong)
  {
    super.zzi(paramLong);
    int i = 0;
    boolean bool;
    if (paramLong != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    this.zzc = bool;
    zzabw localzzabw = this.zzd;
    if (localzzabw != null) {
      i = localzzabw.zze;
    }
    this.zzb = i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */