package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzlt
{
  public final long zza;
  public final zzcx zzb;
  public final int zzc;
  public final zztl zzd;
  public final long zze;
  public final zzcx zzf;
  public final int zzg;
  public final zztl zzh;
  public final long zzi;
  public final long zzj;
  
  public zzlt(long paramLong1, zzcx paramzzcx1, int paramInt1, zztl paramzztl1, long paramLong2, zzcx paramzzcx2, int paramInt2, zztl paramzztl2, long paramLong3, long paramLong4)
  {
    this.zza = paramLong1;
    this.zzb = paramzzcx1;
    this.zzc = paramInt1;
    this.zzd = paramzztl1;
    this.zze = paramLong2;
    this.zzf = paramzzcx2;
    this.zzg = paramInt2;
    this.zzh = paramzztl2;
    this.zzi = paramLong3;
    this.zzj = paramLong4;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzlt)paramObject;
      if ((this.zza == ((zzlt)paramObject).zza) && (this.zzc == ((zzlt)paramObject).zzc) && (this.zze == ((zzlt)paramObject).zze) && (this.zzg == ((zzlt)paramObject).zzg) && (this.zzi == ((zzlt)paramObject).zzi) && (this.zzj == ((zzlt)paramObject).zzj) && (zzfou.zza(this.zzb, ((zzlt)paramObject).zzb)) && (zzfou.zza(this.zzd, ((zzlt)paramObject).zzd)) && (zzfou.zza(this.zzf, ((zzlt)paramObject).zzf)) && (zzfou.zza(this.zzh, ((zzlt)paramObject).zzh))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj) });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzlt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */