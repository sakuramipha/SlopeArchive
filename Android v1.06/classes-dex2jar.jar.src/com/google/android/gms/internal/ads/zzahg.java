package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

final class zzahg
  implements zzahn
{
  private final zzahm zza;
  private final long zzb;
  private final long zzc;
  private final zzahs zzd;
  private int zze;
  private long zzf;
  private long zzg;
  private long zzh;
  private long zzi;
  private long zzj;
  private long zzk;
  private long zzl;
  
  public zzahg(zzahs paramzzahs, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean)
  {
    boolean bool;
    if ((paramLong1 >= 0L) && (paramLong2 > paramLong1)) {
      bool = true;
    } else {
      bool = false;
    }
    zzdy.zzd(bool);
    this.zzd = paramzzahs;
    this.zzb = paramLong1;
    this.zzc = paramLong2;
    if ((paramLong3 != paramLong2 - paramLong1) && (!paramBoolean))
    {
      this.zze = 0;
    }
    else
    {
      this.zzf = paramLong4;
      this.zze = 4;
    }
    this.zza = new zzahm();
  }
  
  public final long zzd(zzaap paramzzaap)
    throws IOException
  {
    int i = this.zze;
    long l2;
    long l1;
    zzahm localzzahm;
    label261:
    int j;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            return -1L;
          }
        }
        else
        {
          l2 = this.zzi;
          l1 = this.zzj;
          if (l2 == l1)
          {
            l1 = -1L;
          }
          else
          {
            l2 = paramzzaap.zzf();
            if (!this.zza.zzc(paramzzaap, l1))
            {
              l1 = this.zzi;
              if (l1 != l2) {}
            }
            else
            {
              long l3;
              boolean bool;
              long l5;
              long l4;
              for (;;)
              {
                throw new IOException("No ogg page can be found.");
                this.zza.zzb(paramzzaap, false);
                paramzzaap.zzj();
                l3 = this.zzh;
                localzzahm = this.zza;
                l1 = localzzahm.zzb;
                l3 -= l1;
                i = localzzahm.zzd + localzzahm.zze;
                bool = l3 < 0L;
                if ((!bool) && (l3 < 72000L)) {
                  break;
                }
                if (bool)
                {
                  this.zzj = l2;
                  this.zzl = l1;
                }
                else
                {
                  this.zzi = (paramzzaap.zzf() + i);
                  this.zzk = l1;
                }
                l5 = this.zzj;
                l2 = this.zzi;
                l4 = l5 - l2;
                if (l4 >= 100000L) {
                  break label261;
                }
                this.zzj = l2;
                l1 = l2;
              }
              long l6 = i;
              if (!bool) {
                l1 = 2L;
              } else {
                l1 = 1L;
              }
              l1 = Math.max(l2, Math.min(paramzzaap.zzf() - l6 * l1 + l3 * l4 / (this.zzl - this.zzk), l5 - 1L));
            }
          }
          if (l1 != -1L) {
            return l1;
          }
          this.zze = 3;
        }
        for (;;)
        {
          this.zza.zzc(paramzzaap, -1L);
          this.zza.zzb(paramzzaap, false);
          localzzahm = this.zza;
          if (localzzahm.zzb > this.zzh)
          {
            paramzzaap.zzj();
            this.zze = 4;
            return -(this.zzk + 2L);
          }
          j = localzzahm.zzd;
          i = localzzahm.zze;
          ((zzaae)paramzzaap).zzo(j + i, false);
          this.zzi = paramzzaap.zzf();
          this.zzk = this.zza.zzb;
        }
      }
    }
    else
    {
      l1 = paramzzaap.zzf();
      this.zzg = l1;
      this.zze = 1;
      l2 = this.zzc - 65307L;
      if (l2 > l1) {
        return l2;
      }
    }
    this.zza.zza();
    if (this.zza.zzc(paramzzaap, -1L))
    {
      this.zza.zzb(paramzzaap, false);
      localzzahm = this.zza;
      j = localzzahm.zzd;
      i = localzzahm.zze;
      ((zzaae)paramzzaap).zzo(j + i, false);
      for (l1 = this.zza.zzb;; l1 = this.zza.zzb)
      {
        localzzahm = this.zza;
        if (((localzzahm.zza & 0x4) == 4) || (!localzzahm.zzc(paramzzaap, -1L)) || (paramzzaap.zzf() >= this.zzc) || (!this.zza.zzb(paramzzaap, true))) {
          break;
        }
        localzzahm = this.zza;
        if (!zzaas.zze(paramzzaap, localzzahm.zzd + localzzahm.zze)) {
          break;
        }
      }
      this.zzf = l1;
      this.zze = 4;
      return this.zzg;
    }
    throw new EOFException();
  }
  
  public final void zzg(long paramLong)
  {
    this.zzh = Math.max(0L, Math.min(paramLong, this.zzf - 1L));
    this.zze = 2;
    this.zzi = this.zzb;
    this.zzj = this.zzc;
    this.zzk = 0L;
    this.zzl = this.zzf;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */