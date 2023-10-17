package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

final class zzky
{
  private static final zztl zzt = new zztl(new Object());
  public final zzcx zza;
  public final zztl zzb;
  public final long zzc;
  public final long zzd;
  public final int zze;
  public final zzia zzf;
  public final boolean zzg;
  public final zzvk zzh;
  public final zzxe zzi;
  public final List zzj;
  public final zztl zzk;
  public final boolean zzl;
  public final int zzm;
  public final zzci zzn;
  public final boolean zzo;
  public volatile long zzp;
  public volatile long zzq;
  public volatile long zzr;
  public volatile long zzs;
  
  public zzky(zzcx paramzzcx, zztl paramzztl1, long paramLong1, long paramLong2, int paramInt1, zzia paramzzia, boolean paramBoolean1, zzvk paramzzvk, zzxe paramzzxe, List paramList, zztl paramzztl2, boolean paramBoolean2, int paramInt2, zzci paramzzci, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean3)
  {
    this.zza = paramzzcx;
    this.zzb = paramzztl1;
    this.zzc = paramLong1;
    this.zzd = paramLong2;
    this.zze = paramInt1;
    this.zzf = paramzzia;
    this.zzg = paramBoolean1;
    this.zzh = paramzzvk;
    this.zzi = paramzzxe;
    this.zzj = paramList;
    this.zzk = paramzztl2;
    this.zzl = paramBoolean2;
    this.zzm = paramInt2;
    this.zzn = paramzzci;
    this.zzp = paramLong3;
    this.zzq = paramLong4;
    this.zzr = paramLong5;
    this.zzs = paramLong6;
    this.zzo = paramBoolean3;
  }
  
  public static zzky zzi(zzxe paramzzxe)
  {
    zzcx localzzcx = zzcx.zza;
    zztl localzztl = zzt;
    return new zzky(localzzcx, localzztl, -9223372036854775807L, 0L, 1, null, false, zzvk.zza, paramzzxe, zzfrr.zzl(), localzztl, false, 0, zzci.zza, 0L, 0L, 0L, 0L, false);
  }
  
  public static zztl zzj()
  {
    return zzt;
  }
  
  public final long zza()
  {
    if (zzk())
    {
      long l2;
      do
      {
        l2 = this.zzs;
        l3 = this.zzr;
      } while (l2 != this.zzs);
      long l1 = SystemClock.elapsedRealtime();
      long l3 = zzfn.zzq(l3);
      float f = this.zzn.zzc;
      return zzfn.zzo(l3 + ((float)(l1 - l2) * f));
    }
    return this.zzr;
  }
  
  public final zzky zzb()
  {
    return new zzky(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, zza(), SystemClock.elapsedRealtime(), this.zzo);
  }
  
  public final zzky zzc(zztl paramzztl)
  {
    return new zzky(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, paramzztl, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
  }
  
  public final zzky zzd(zztl paramzztl, long paramLong1, long paramLong2, long paramLong3, long paramLong4, zzvk paramzzvk, zzxe paramzzxe, List paramList)
  {
    return new zzky(this.zza, paramzztl, paramLong2, paramLong3, this.zze, this.zzf, this.zzg, paramzzvk, paramzzxe, paramList, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, paramLong4, paramLong1, SystemClock.elapsedRealtime(), this.zzo);
  }
  
  public final zzky zze(boolean paramBoolean, int paramInt)
  {
    return new zzky(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, paramBoolean, paramInt, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
  }
  
  public final zzky zzf(zzia paramzzia)
  {
    return new zzky(this.zza, this.zzb, this.zzc, this.zzd, this.zze, paramzzia, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
  }
  
  public final zzky zzg(int paramInt)
  {
    return new zzky(this.zza, this.zzb, this.zzc, this.zzd, paramInt, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
  }
  
  public final zzky zzh(zzcx paramzzcx)
  {
    return new zzky(paramzzcx, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
  }
  
  public final boolean zzk()
  {
    return (this.zze == 3) && (this.zzl) && (this.zzm == 0);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */