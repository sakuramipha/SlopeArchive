package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zzvg
  extends zzcx
{
  private static final Object zzc = new Object();
  private static final zzbq zzd;
  private final long zze;
  private final long zzf;
  private final boolean zzg;
  private final zzbq zzh;
  private final zzbg zzi;
  
  static
  {
    zzat localzzat = new zzat();
    localzzat.zza("SinglePeriodTimeline");
    localzzat.zzb(Uri.EMPTY);
    zzd = localzzat.zzc();
  }
  
  public zzvg(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject, zzbq paramzzbq, zzbg paramzzbg)
  {
    this.zze = paramLong4;
    this.zzf = paramLong5;
    this.zzg = paramBoolean1;
    this.zzh = paramzzbq;
    this.zzi = paramzzbg;
  }
  
  public final int zza(Object paramObject)
  {
    if (zzc.equals(paramObject)) {
      return 0;
    }
    return -1;
  }
  
  public final int zzb()
  {
    return 1;
  }
  
  public final int zzc()
  {
    return 1;
  }
  
  public final zzcu zzd(int paramInt, zzcu paramzzcu, boolean paramBoolean)
  {
    zzdy.zza(paramInt, 0, 1);
    Object localObject;
    if (paramBoolean) {
      localObject = zzc;
    } else {
      localObject = null;
    }
    paramzzcu.zzl(null, localObject, 0, this.zze, 0L, zzd.zza, false);
    return paramzzcu;
  }
  
  public final zzcw zze(int paramInt, zzcw paramzzcw, long paramLong)
  {
    zzdy.zza(paramInt, 0, 1);
    paramzzcw.zza(zzcw.zza, this.zzh, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, this.zzf, 0, 0, 0L);
    return paramzzcw;
  }
  
  public final Object zzf(int paramInt)
  {
    zzdy.zza(paramInt, 0, 1);
    return zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzvg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */