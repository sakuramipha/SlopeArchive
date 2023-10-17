package com.google.android.gms.internal.ads;

final class zzkj
{
  public final zztl zza;
  public final long zzb;
  public final long zzc;
  public final long zzd;
  public final long zze;
  public final boolean zzf;
  public final boolean zzg;
  public final boolean zzh;
  public final boolean zzi;
  
  zzkj(zztl paramzztl, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    boolean bool = true;
    if ((paramBoolean4) && (!paramBoolean2)) {
      paramBoolean1 = false;
    } else {
      paramBoolean1 = true;
    }
    zzdy.zzd(paramBoolean1);
    paramBoolean1 = bool;
    if (paramBoolean3) {
      if (paramBoolean2) {
        paramBoolean1 = bool;
      } else {
        paramBoolean1 = false;
      }
    }
    zzdy.zzd(paramBoolean1);
    this.zza = paramzztl;
    this.zzb = paramLong1;
    this.zzc = paramLong2;
    this.zzd = paramLong3;
    this.zze = paramLong4;
    this.zzf = false;
    this.zzg = paramBoolean2;
    this.zzh = paramBoolean3;
    this.zzi = paramBoolean4;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzkj)paramObject;
      if ((this.zzb == ((zzkj)paramObject).zzb) && (this.zzc == ((zzkj)paramObject).zzc) && (this.zzd == ((zzkj)paramObject).zzd) && (this.zze == ((zzkj)paramObject).zze) && (this.zzg == ((zzkj)paramObject).zzg) && (this.zzh == ((zzkj)paramObject).zzh) && (this.zzi == ((zzkj)paramObject).zzi) && (zzfn.zzB(this.zza, ((zzkj)paramObject).zza))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (((((((this.zza.hashCode() + 527) * 31 + (int)this.zzb) * 31 + (int)this.zzc) * 31 + (int)this.zzd) * 31 + (int)this.zze) * 961 + this.zzg) * 31 + this.zzh) * 31 + this.zzi;
  }
  
  public final zzkj zza(long paramLong)
  {
    if (paramLong == this.zzc) {
      return this;
    }
    return new zzkj(this.zza, this.zzb, paramLong, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
  }
  
  public final zzkj zzb(long paramLong)
  {
    if (paramLong == this.zzb) {
      return this;
    }
    return new zzkj(this.zza, paramLong, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzkj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */