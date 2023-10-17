package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public final class zzacq
  implements zzaao
{
  public static final zzaav zza = zzacp.zza;
  private final byte[] zzb = new byte[42];
  private final zzfd zzc = new zzfd(new byte[32768], 0);
  private final zzaaw zzd = new zzaaw();
  private zzaar zze;
  private zzabr zzf;
  private int zzg = 0;
  private zzca zzh;
  private zzabb zzi;
  private int zzj;
  private int zzk;
  private zzaco zzl;
  private int zzm;
  private long zzn;
  
  public zzacq()
  {
    this(0);
  }
  
  public zzacq(int paramInt) {}
  
  private final long zze(zzfd paramzzfd, boolean paramBoolean)
  {
    Objects.requireNonNull(this.zzi);
    for (int i = paramzzfd.zzc(); i <= paramzzfd.zzd() - 16; i++)
    {
      paramzzfd.zzF(i);
      if (zzaax.zzc(paramzzfd, this.zzi, this.zzk, this.zzd))
      {
        paramzzfd.zzF(i);
        return this.zzd.zza;
      }
    }
    if (paramBoolean)
    {
      while (i <= paramzzfd.zzd() - this.zzj)
      {
        paramzzfd.zzF(i);
        try
        {
          paramBoolean = zzaax.zzc(paramzzfd, this.zzi, this.zzk, this.zzd);
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          paramBoolean = false;
        }
        if ((paramzzfd.zzc() <= paramzzfd.zzd()) && (paramBoolean))
        {
          paramzzfd.zzF(i);
          return this.zzd.zza;
        }
        i++;
      }
      paramzzfd.zzF(paramzzfd.zzd());
    }
    else
    {
      paramzzfd.zzF(i);
    }
    return -1L;
  }
  
  private final void zzf()
  {
    long l = this.zzn;
    zzabb localzzabb = this.zzi;
    int i = zzfn.zza;
    l = l * 1000000L / localzzabb.zze;
    this.zzf.zzs(l, 1, this.zzm, 0, null);
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    int j = this.zzg;
    boolean bool = true;
    int i = 0;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2)
        {
          Object localObject2;
          if (j != 3)
          {
            if (j != 4)
            {
              Objects.requireNonNull(this.zzf);
              localObject1 = this.zzi;
              Objects.requireNonNull(localObject1);
              localObject2 = this.zzl;
              if ((localObject2 != null) && (((zzaaa)localObject2).zze()))
              {
                i = ((zzaaa)localObject2).zza(paramzzaap, paramzzabk);
              }
              else if (this.zzn == -1L)
              {
                this.zzn = zzaax.zzb(paramzzaap, (zzabb)localObject1);
              }
              else
              {
                paramzzabk = this.zzc;
                int k = paramzzabk.zzd();
                if (k < 32768)
                {
                  j = paramzzaap.zza(paramzzabk.zzH(), k, 32768 - k);
                  if (j != -1) {
                    bool = false;
                  }
                  if (!bool)
                  {
                    this.zzc.zzE(k + j);
                  }
                  else if (this.zzc.zza() == 0)
                  {
                    zzf();
                    i = -1;
                    break label345;
                  }
                }
                else
                {
                  bool = false;
                }
                paramzzaap = this.zzc;
                j = paramzzaap.zzc();
                k = this.zzm;
                int m = this.zzj;
                if (k < m) {
                  paramzzaap.zzG(Math.min(m - k, paramzzaap.zza()));
                }
                l1 = zze(this.zzc, bool);
                paramzzaap = this.zzc;
                k = paramzzaap.zzc() - j;
                paramzzaap.zzF(j);
                zzabp.zzb(this.zzf, this.zzc, k);
                this.zzm += k;
                if (l1 != -1L)
                {
                  zzf();
                  this.zzm = 0;
                  this.zzn = l1;
                }
                paramzzaap = this.zzc;
                if (paramzzaap.zza() < 16) {
                  break label347;
                }
              }
              label345:
              return i;
              label347:
              i = paramzzaap.zza();
              System.arraycopy(paramzzaap.zzH(), paramzzaap.zzc(), paramzzaap.zzH(), 0, i);
              this.zzc.zzF(0);
              this.zzc.zzE(i);
              return 0;
            }
            paramzzaap.zzj();
            localObject1 = new zzfd(2);
            paramzzabk = ((zzfd)localObject1).zzH();
            ((zzaae)paramzzaap).zzm(paramzzabk, 0, 2, false);
            i = ((zzfd)localObject1).zzo();
            if (i >> 2 == 16382)
            {
              paramzzaap.zzj();
              this.zzk = i;
              paramzzabk = this.zze;
              i = zzfn.zza;
              l1 = paramzzaap.zzf();
              l2 = paramzzaap.zzd();
              paramzzaap = this.zzi;
              Objects.requireNonNull(paramzzaap);
              if (paramzzaap.zzk != null)
              {
                paramzzaap = new zzaaz(paramzzaap, l1);
              }
              else if ((l2 != -1L) && (paramzzaap.zzj > 0L))
              {
                paramzzaap = new zzaco(paramzzaap, this.zzk, l1, l2);
                this.zzl = paramzzaap;
                paramzzaap = paramzzaap.zzb();
              }
              else
              {
                paramzzaap = new zzabm(paramzzaap.zza(), 0L);
              }
              paramzzabk.zzN(paramzzaap);
              this.zzg = 5;
              return 0;
            }
            paramzzaap.zzj();
            throw zzce.zza("First frame does not start with sync code.", null);
          }
          localObject1 = this.zzi;
          do
          {
            paramzzaap.zzj();
            zzfc localzzfc = new zzfc(new byte[4], 4);
            localObject2 = localzzfc.zza;
            paramzzabk = (zzaae)paramzzaap;
            paramzzabk.zzm((byte[])localObject2, 0, 4, false);
            bool = localzzfc.zzn();
            i = localzzfc.zzd(7);
            j = localzzfc.zzd(24) + 4;
            if (i == 0)
            {
              localObject1 = new byte[38];
              paramzzabk.zzn((byte[])localObject1, 0, 38, false);
              paramzzabk = new zzabb((byte[])localObject1, 4);
            }
            else
            {
              if (localObject1 == null) {
                break;
              }
              if (i == 3)
              {
                localObject2 = new zzfd(j);
                paramzzabk.zzn(((zzfd)localObject2).zzH(), 0, j, false);
                paramzzabk = ((zzabb)localObject1).zzf(zzaay.zzb((zzfd)localObject2));
              }
              else if (i == 4)
              {
                localObject2 = new zzfd(j);
                paramzzabk.zzn(((zzfd)localObject2).zzH(), 0, j, false);
                ((zzfd)localObject2).zzG(4);
                paramzzabk = ((zzabb)localObject1).zzg(Arrays.asList(zzabx.zzc((zzfd)localObject2, false, false).zzb));
              }
              else if (i == 6)
              {
                localObject2 = new zzfd(j);
                paramzzabk.zzn(((zzfd)localObject2).zzH(), 0, j, false);
                ((zzfd)localObject2).zzG(4);
                paramzzabk = ((zzabb)localObject1).zze(zzfrr.zzm(zzadk.zzb((zzfd)localObject2)));
              }
              else
              {
                paramzzabk.zzo(j, false);
                paramzzabk = (zzabk)localObject1;
              }
            }
            i = zzfn.zza;
            this.zzi = paramzzabk;
            localObject1 = paramzzabk;
          } while (!bool);
          Objects.requireNonNull(paramzzabk);
          this.zzj = Math.max(paramzzabk.zzc, 6);
          this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
          this.zzg = 4;
          return 0;
          throw new IllegalArgumentException();
        }
        Object localObject1 = new zzfd(4);
        paramzzabk = ((zzfd)localObject1).zzH();
        ((zzaae)paramzzaap).zzn(paramzzabk, 0, 4, false);
        if (((zzfd)localObject1).zzs() == 1716281667L)
        {
          this.zzg = 3;
          return 0;
        }
        throw zzce.zza("Failed to read FLAC stream marker.", null);
      }
      paramzzabk = this.zzb;
      ((zzaae)paramzzaap).zzm(paramzzabk, 0, 42, false);
      paramzzaap.zzj();
      this.zzg = 2;
      return 0;
    }
    paramzzaap.zzj();
    long l1 = paramzzaap.zze();
    paramzzabk = zzaay.zza(paramzzaap, true);
    long l2 = paramzzaap.zze();
    ((zzaae)paramzzaap).zzo((int)(l2 - l1), false);
    this.zzh = paramzzabk;
    this.zzg = 1;
    return 0;
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zze = paramzzaar;
    this.zzf = paramzzaar.zzv(0, 1);
    paramzzaar.zzC();
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    long l = 0L;
    if (paramLong1 == 0L)
    {
      this.zzg = 0;
    }
    else
    {
      zzaco localzzaco = this.zzl;
      if (localzzaco != null) {
        localzzaco.zzd(paramLong2);
      }
    }
    if (paramLong2 == 0L) {
      paramLong1 = l;
    } else {
      paramLong1 = -1L;
    }
    this.zzn = paramLong1;
    this.zzm = 0;
    this.zzc.zzC(0);
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    zzaay.zza(paramzzaap, false);
    zzfd localzzfd = new zzfd(4);
    byte[] arrayOfByte = localzzfd.zzH();
    ((zzaae)paramzzaap).zzm(arrayOfByte, 0, 4, false);
    return localzzfd.zzs() == 1716281667L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzacq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */