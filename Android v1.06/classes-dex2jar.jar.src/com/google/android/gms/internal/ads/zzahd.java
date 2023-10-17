package com.google.android.gms.internal.ads;

final class zzahd
{
  public final zzaha zza;
  public final int zzb;
  public final long[] zzc;
  public final int[] zzd;
  public final int zze;
  public final long[] zzf;
  public final int[] zzg;
  public final long zzh;
  
  public zzahd(zzaha paramzzaha, long[] paramArrayOfLong1, int[] paramArrayOfInt1, int paramInt, long[] paramArrayOfLong2, int[] paramArrayOfInt2, long paramLong)
  {
    int j = paramArrayOfInt1.length;
    int i = paramArrayOfLong2.length;
    boolean bool2 = true;
    boolean bool1;
    if (j == i) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzdy.zzd(bool1);
    int k = paramArrayOfLong1.length;
    if (k == i) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    zzdy.zzd(bool1);
    j = paramArrayOfInt2.length;
    if (j == i) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    zzdy.zzd(bool1);
    this.zza = paramzzaha;
    this.zzc = paramArrayOfLong1;
    this.zzd = paramArrayOfInt1;
    this.zze = paramInt;
    this.zzf = paramArrayOfLong2;
    this.zzg = paramArrayOfInt2;
    this.zzh = paramLong;
    this.zzb = k;
    if (j > 0)
    {
      paramInt = j - 1;
      paramArrayOfInt2[paramInt] |= 0x20000000;
    }
  }
  
  public final int zza(long paramLong)
  {
    for (int i = zzfn.zzc(this.zzf, paramLong, true, false); i >= 0; i--) {
      if ((this.zzg[i] & 0x1) != 0) {
        return i;
      }
    }
    return -1;
  }
  
  public final int zzb(long paramLong)
  {
    for (int i = zzfn.zza(this.zzf, paramLong, true, false); i < this.zzf.length; i++) {
      if ((this.zzg[i] & 0x1) != 0) {
        return i;
      }
    }
    return -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */