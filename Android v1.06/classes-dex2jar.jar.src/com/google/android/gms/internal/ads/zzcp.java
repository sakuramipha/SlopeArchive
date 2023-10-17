package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzcp
{
  public static final zzn zza = zzco.zza;
  private static final String zzk = Integer.toString(0, 36);
  private static final String zzl = Integer.toString(1, 36);
  private static final String zzm = Integer.toString(2, 36);
  private static final String zzn = Integer.toString(3, 36);
  private static final String zzo = Integer.toString(4, 36);
  private static final String zzp = Integer.toString(5, 36);
  private static final String zzq = Integer.toString(6, 36);
  public final Object zzb;
  public final int zzc;
  public final zzbq zzd;
  public final Object zze;
  public final int zzf;
  public final long zzg;
  public final long zzh;
  public final int zzi;
  public final int zzj;
  
  public zzcp(Object paramObject1, int paramInt1, zzbq paramzzbq, Object paramObject2, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4)
  {
    this.zzb = paramObject1;
    this.zzc = paramInt1;
    this.zzd = paramzzbq;
    this.zze = paramObject2;
    this.zzf = paramInt2;
    this.zzg = paramLong1;
    this.zzh = paramLong2;
    this.zzi = paramInt3;
    this.zzj = paramInt4;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzcp)paramObject;
      if ((this.zzc == ((zzcp)paramObject).zzc) && (this.zzf == ((zzcp)paramObject).zzf) && (this.zzg == ((zzcp)paramObject).zzg) && (this.zzh == ((zzcp)paramObject).zzh) && (this.zzi == ((zzcp)paramObject).zzi) && (this.zzj == ((zzcp)paramObject).zzj) && (zzfou.zza(this.zzb, ((zzcp)paramObject).zzb)) && (zzfou.zza(this.zze, ((zzcp)paramObject).zze)) && (zzfou.zza(this.zzd, ((zzcp)paramObject).zzd))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj) });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */