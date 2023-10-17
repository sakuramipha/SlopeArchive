package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

final class zzach
{
  protected final zzabr zza;
  private final int zzb;
  private final int zzc;
  private final long zzd;
  private final int zze;
  private int zzf;
  private int zzg;
  private int zzh;
  private int zzi;
  private int zzj;
  private long[] zzk;
  private int[] zzl;
  
  public zzach(int paramInt1, int paramInt2, long paramLong, int paramInt3, zzabr paramzzabr)
  {
    int i = paramInt2;
    if (paramInt2 != 1) {
      i = 2;
    }
    this.zzd = paramLong;
    this.zze = paramInt3;
    this.zza = paramzzabr;
    if (i == 2) {
      paramInt2 = 1667497984;
    } else {
      paramInt2 = 1651965952;
    }
    this.zzb = zzi(paramInt1, paramInt2);
    if (i == 2) {
      paramInt1 = zzi(paramInt1, 1650720768);
    } else {
      paramInt1 = -1;
    }
    this.zzc = paramInt1;
    this.zzk = new long['Ȁ'];
    this.zzl = new int['Ȁ'];
  }
  
  private static int zzi(int paramInt1, int paramInt2)
  {
    return paramInt1 % 10 + 48 << 8 | paramInt1 / 10 + 48 | paramInt2;
  }
  
  private final long zzj(int paramInt)
  {
    return this.zzd * paramInt / this.zze;
  }
  
  private final zzabo zzk(int paramInt)
  {
    return new zzabo(this.zzl[paramInt] * zzj(1), this.zzk[paramInt]);
  }
  
  public final zzabl zza(long paramLong)
  {
    int i = (int)(paramLong / zzj(1));
    int j = zzfn.zzb(this.zzl, i, true, true);
    if (this.zzl[j] == i)
    {
      localzzabo = zzk(j);
      return new zzabl(localzzabo, localzzabo);
    }
    zzabo localzzabo = zzk(j);
    i = j + 1;
    if (i < this.zzk.length) {
      return new zzabl(localzzabo, zzk(i));
    }
    return new zzabl(localzzabo, localzzabo);
  }
  
  public final void zzb(long paramLong)
  {
    if (this.zzj == this.zzl.length)
    {
      localObject = this.zzk;
      this.zzk = Arrays.copyOf((long[])localObject, localObject.length * 3 / 2);
      localObject = this.zzl;
      this.zzl = Arrays.copyOf((int[])localObject, localObject.length * 3 / 2);
    }
    Object localObject = this.zzk;
    int i = this.zzj;
    localObject[i] = paramLong;
    this.zzl[i] = this.zzi;
    this.zzj = (i + 1);
  }
  
  public final void zzc()
  {
    this.zzk = Arrays.copyOf(this.zzk, this.zzj);
    this.zzl = Arrays.copyOf(this.zzl, this.zzj);
  }
  
  public final void zzd()
  {
    this.zzi += 1;
  }
  
  public final void zze(int paramInt)
  {
    this.zzf = paramInt;
    this.zzg = paramInt;
  }
  
  public final void zzf(long paramLong)
  {
    if (this.zzj == 0)
    {
      this.zzh = 0;
      return;
    }
    int i = zzfn.zzc(this.zzk, paramLong, true, true);
    this.zzh = this.zzl[i];
  }
  
  public final boolean zzg(int paramInt)
  {
    return (this.zzb == paramInt) || (this.zzc == paramInt);
  }
  
  public final boolean zzh(zzaap paramzzaap)
    throws IOException
  {
    int i = this.zzg;
    i -= this.zza.zze(paramzzaap, i, false);
    this.zzg = i;
    boolean bool;
    if (i == 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool)
    {
      if (this.zzf > 0)
      {
        paramzzaap = this.zza;
        long l = zzj(this.zzh);
        i = Arrays.binarySearch(this.zzl, this.zzh);
        int j = this.zzf;
        if (i >= 0) {
          i = 1;
        } else {
          i = 0;
        }
        paramzzaap.zzs(l, i, j, 0, null);
      }
      this.zzh += 1;
    }
    return bool;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzach.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */