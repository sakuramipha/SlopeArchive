package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzyf
{
  private long zza;
  private long zzb;
  private long zzc;
  private long zzd;
  private long zze;
  private long zzf;
  private final boolean[] zzg = new boolean[15];
  private int zzh;
  
  public final long zza()
  {
    long l = this.zze;
    if (l == 0L) {
      return 0L;
    }
    return this.zzf / l;
  }
  
  public final long zzb()
  {
    return this.zzf;
  }
  
  public final void zzc(long paramLong)
  {
    long l3 = this.zzd;
    if (l3 == 0L)
    {
      this.zza = paramLong;
    }
    else
    {
      long l1;
      if (l3 == 1L)
      {
        l1 = paramLong - this.zza;
        this.zzb = l1;
        this.zzf = l1;
        this.zze = 1L;
      }
      else
      {
        l1 = paramLong - this.zzc;
        long l2 = Math.abs(l1 - this.zzb);
        int i = (int)(l3 % 15L);
        boolean[] arrayOfBoolean;
        if (l2 <= 1000000L)
        {
          this.zze += 1L;
          this.zzf += l1;
          arrayOfBoolean = this.zzg;
          if (arrayOfBoolean[i] != 0)
          {
            arrayOfBoolean[i] = false;
            this.zzh -= 1;
          }
        }
        else
        {
          arrayOfBoolean = this.zzg;
          if (arrayOfBoolean[i] == 0)
          {
            arrayOfBoolean[i] = true;
            this.zzh += 1;
          }
        }
      }
    }
    this.zzd += 1L;
    this.zzc = paramLong;
  }
  
  public final void zzd()
  {
    this.zzd = 0L;
    this.zze = 0L;
    this.zzf = 0L;
    this.zzh = 0;
    Arrays.fill(this.zzg, false);
  }
  
  public final boolean zze()
  {
    long l = this.zzd;
    if (l == 0L) {
      return false;
    }
    return this.zzg[((int)((l - 1L) % 15L))];
  }
  
  public final boolean zzf()
  {
    return (this.zzd > 15L) && (this.zzh == 0);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzyf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */