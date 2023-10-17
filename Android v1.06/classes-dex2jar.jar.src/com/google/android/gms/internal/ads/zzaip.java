package com.google.android.gms.internal.ads;

import android.util.SparseArray;

final class zzaip
{
  private final zzabr zza;
  private final SparseArray zzb;
  private final SparseArray zzc;
  private final zzfe zzd;
  private final byte[] zze;
  private int zzf;
  private long zzg;
  private long zzh;
  private final zzaio zzi;
  private final zzaio zzj;
  private boolean zzk;
  private long zzl;
  private long zzm;
  private boolean zzn;
  
  public zzaip(zzabr paramzzabr, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.zza = paramzzabr;
    this.zzb = new SparseArray();
    this.zzc = new SparseArray();
    this.zzi = new zzaio(null);
    this.zzj = new zzaio(null);
    paramzzabr = new byte[''];
    this.zze = paramzzabr;
    this.zzd = new zzfe(paramzzabr, 0, 0);
    this.zzk = false;
  }
  
  public final void zza(zzeu paramzzeu)
  {
    this.zzc.append(paramzzeu.zza, paramzzeu);
  }
  
  public final void zzb(zzev paramzzev)
  {
    this.zzb.append(paramzzev.zzd, paramzzev);
  }
  
  public final void zzc()
  {
    this.zzk = false;
  }
  
  public final void zzd(long paramLong1, int paramInt, long paramLong2)
  {
    this.zzf = paramInt;
    this.zzh = paramLong2;
    this.zzg = paramLong1;
  }
  
  public final boolean zze(long paramLong, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = this.zzf;
    int i = 0;
    if (j == 9)
    {
      if ((paramBoolean1) && (this.zzk))
      {
        long l1 = this.zzg;
        j = (int)(paramLong - l1);
        paramLong = this.zzm;
        if (paramLong != -9223372036854775807L)
        {
          int k = this.zzn;
          long l2 = this.zzl;
          this.zza.zzs(paramLong, k, (int)(l1 - l2), paramInt + j, null);
        }
      }
      this.zzl = this.zzg;
      this.zzm = this.zzh;
      this.zzn = false;
      this.zzk = true;
    }
    paramBoolean1 = this.zzn;
    j = this.zzf;
    if (j != 5)
    {
      paramInt = i;
      if (paramBoolean2)
      {
        paramInt = i;
        if (j != 1) {}
      }
    }
    else
    {
      paramInt = 1;
    }
    paramBoolean1 |= paramInt;
    this.zzn = paramBoolean1;
    return paramBoolean1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */