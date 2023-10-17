package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public final class zzacy
  implements zzaao
{
  private final zzfd zza = new zzfd(6);
  private zzaar zzb;
  private int zzc;
  private int zzd;
  private int zze;
  private long zzf = -1L;
  private zzaev zzg;
  private zzaap zzh;
  private zzadb zzi;
  private zzagw zzj;
  
  private final int zze(zzaap paramzzaap)
    throws IOException
  {
    this.zza.zzC(2);
    byte[] arrayOfByte = this.zza.zzH();
    ((zzaae)paramzzaap).zzm(arrayOfByte, 0, 2, false);
    return this.zza.zzo();
  }
  
  private final void zzf()
  {
    zzg(new zzbz[0]);
    zzaar localzzaar = this.zzb;
    Objects.requireNonNull(localzzaar);
    localzzaar.zzC();
    this.zzb.zzN(new zzabm(-9223372036854775807L, 0L));
    this.zzc = 6;
  }
  
  private final void zzg(zzbz... paramVarArgs)
  {
    Object localObject = this.zzb;
    Objects.requireNonNull(localObject);
    localObject = ((zzaar)localObject).zzv(1024, 4);
    zzak localzzak = new zzak();
    localzzak.zzz("image/jpeg");
    localzzak.zzM(new zzca(-9223372036854775807L, paramVarArgs));
    ((zzabr)localObject).zzk(localzzak.zzY());
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    int i = this.zzc;
    if (i != 0)
    {
      if (i != 1)
      {
        long l2;
        long l1;
        if (i != 2)
        {
          if (i != 4)
          {
            if (i != 5)
            {
              if (i == 6) {
                return -1;
              }
              throw new IllegalStateException();
            }
            if ((this.zzi == null) || (paramzzaap != this.zzh))
            {
              this.zzh = paramzzaap;
              this.zzi = new zzadb(paramzzaap, this.zzf);
            }
            paramzzaap = this.zzj;
            Objects.requireNonNull(paramzzaap);
            i = paramzzaap.zza(this.zzi, paramzzabk);
            if (i == 1) {
              paramzzabk.zza += this.zzf;
            }
            return i;
          }
          l2 = paramzzaap.zzf();
          l1 = this.zzf;
          if (l2 == l1)
          {
            if (!paramzzaap.zzm(this.zza.zzH(), 0, 1, true))
            {
              zzf();
            }
            else
            {
              paramzzaap.zzj();
              if (this.zzj == null) {
                this.zzj = new zzagw(0);
              }
              paramzzaap = new zzadb(paramzzaap, this.zzf);
              this.zzi = paramzzaap;
              if (this.zzj.zzd(paramzzaap))
              {
                paramzzaap = this.zzj;
                l1 = this.zzf;
                paramzzabk = this.zzb;
                Objects.requireNonNull(paramzzabk);
                paramzzaap.zzb(new zzadd(l1, paramzzabk));
                paramzzaap = this.zzg;
                Objects.requireNonNull(paramzzaap);
                zzg(new zzbz[] { paramzzaap });
                this.zzc = 5;
              }
              else
              {
                zzf();
              }
            }
            return 0;
          }
          paramzzabk.zza = l1;
          return 1;
        }
        if (this.zzd == 65505)
        {
          zzfd localzzfd = new zzfd(this.zze);
          paramzzabk = localzzfd.zzH();
          i = this.zze;
          ((zzaae)paramzzaap).zzn(paramzzabk, 0, i, false);
          if ((this.zzg == null) && ("http://ns.adobe.com/xap/1.0/".equals(localzzfd.zzv('\000'))))
          {
            paramzzabk = localzzfd.zzv('\000');
            if (paramzzabk != null)
            {
              l2 = paramzzaap.zzd();
              if (l2 == -1L) {}
              long l4;
              long l5;
              long l6;
              long l7;
              do
              {
                do
                {
                  paramzzaap = null;
                  break;
                  paramzzaap = zzade.zza(paramzzabk);
                } while ((paramzzaap == null) || (paramzzaap.zzb.size() < 2));
                int j = paramzzaap.zzb.size() - 1;
                l4 = -1L;
                l5 = -1L;
                l1 = l5;
                l6 = l1;
                i = 0;
                l7 = l1;
                l1 = l2;
                while (j >= 0)
                {
                  paramzzabk = (zzacz)paramzzaap.zzb.get(j);
                  int k = "video/mp4".equals(paramzzabk.zza) | i;
                  if (j == 0)
                  {
                    l2 = l1 - paramzzabk.zzd;
                    l3 = 0L;
                  }
                  else
                  {
                    l3 = l1 - paramzzabk.zzc;
                    l2 = l1;
                  }
                  l1 = l3;
                  i = k;
                  long l8 = l7;
                  long l3 = l6;
                  if (k != 0)
                  {
                    i = k;
                    l8 = l7;
                    l3 = l6;
                    if (l1 != l2)
                    {
                      l3 = l2 - l1;
                      l8 = l1;
                      i = 0;
                    }
                  }
                  if (j == 0) {
                    l5 = l2;
                  }
                  if (j == 0) {
                    l4 = l1;
                  }
                  j--;
                  l7 = l8;
                  l6 = l3;
                }
              } while ((l7 == -1L) || (l6 == -1L) || (l4 == -1L) || (l5 == -1L));
              paramzzaap = new zzaev(l4, l5, paramzzaap.zza, l7, l6);
              this.zzg = paramzzaap;
              if (paramzzaap != null) {
                this.zzf = paramzzaap.zzd;
              }
            }
          }
        }
        else
        {
          i = this.zze;
          ((zzaae)paramzzaap).zzo(i, false);
        }
        this.zzc = 0;
        return 0;
      }
      this.zza.zzC(2);
      paramzzabk = this.zza.zzH();
      ((zzaae)paramzzaap).zzn(paramzzabk, 0, 2, false);
      this.zze = (this.zza.zzo() - 2);
      this.zzc = 2;
      return 0;
    }
    this.zza.zzC(2);
    paramzzabk = this.zza.zzH();
    ((zzaae)paramzzaap).zzn(paramzzabk, 0, 2, false);
    i = this.zza.zzo();
    this.zzd = i;
    if (i == 65498)
    {
      if (this.zzf != -1L) {
        this.zzc = 4;
      } else {
        zzf();
      }
    }
    else if (((i < 65488) || (i > 65497)) && (i != 65281)) {
      this.zzc = 1;
    }
    return 0;
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzb = paramzzaar;
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    if (paramLong1 == 0L)
    {
      this.zzc = 0;
      this.zzj = null;
      return;
    }
    if (this.zzc == 5)
    {
      zzagw localzzagw = this.zzj;
      Objects.requireNonNull(localzzagw);
      localzzagw.zzc(paramLong1, paramLong2);
    }
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    if (zze(paramzzaap) != 65496) {
      return false;
    }
    int j = zze(paramzzaap);
    this.zzd = j;
    int i = j;
    if (j == 65504)
    {
      this.zza.zzC(2);
      byte[] arrayOfByte = this.zza.zzH();
      zzaae localzzaae = (zzaae)paramzzaap;
      localzzaae.zzm(arrayOfByte, 0, 2, false);
      localzzaae.zzl(this.zza.zzo() - 2, false);
      i = zze(paramzzaap);
      this.zzd = i;
    }
    if (i == 65505)
    {
      paramzzaap = (zzaae)paramzzaap;
      paramzzaap.zzl(2, false);
      this.zza.zzC(6);
      paramzzaap.zzm(this.zza.zzH(), 0, 6, false);
      if ((this.zza.zzs() == 1165519206L) && (this.zza.zzo() == 0)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzacy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */