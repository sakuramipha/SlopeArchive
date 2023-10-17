package com.google.android.gms.internal.ads;

public class zzbx
{
  public final Object zza;
  public final int zzb;
  public final int zzc;
  public final long zzd;
  public final int zze;
  
  protected zzbx(zzbx paramzzbx)
  {
    this.zza = paramzzbx.zza;
    this.zzb = paramzzbx.zzb;
    this.zzc = paramzzbx.zzc;
    this.zzd = paramzzbx.zzd;
    this.zze = paramzzbx.zze;
  }
  
  public zzbx(Object paramObject, int paramInt1, int paramInt2, long paramLong)
  {
    this(paramObject, paramInt1, paramInt2, paramLong, -1);
  }
  
  private zzbx(Object paramObject, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    this.zza = paramObject;
    this.zzb = paramInt1;
    this.zzc = paramInt2;
    this.zzd = paramLong;
    this.zze = paramInt3;
  }
  
  public zzbx(Object paramObject, long paramLong)
  {
    this(paramObject, -1, -1, paramLong, -1);
  }
  
  public zzbx(Object paramObject, long paramLong, int paramInt)
  {
    this(paramObject, -1, -1, paramLong, paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzbx)) {
      return false;
    }
    paramObject = (zzbx)paramObject;
    return (this.zza.equals(((zzbx)paramObject).zza)) && (this.zzb == ((zzbx)paramObject).zzb) && (this.zzc == ((zzbx)paramObject).zzc) && (this.zzd == ((zzbx)paramObject).zzd) && (this.zze == ((zzbx)paramObject).zze);
  }
  
  public final int hashCode()
  {
    return ((((this.zza.hashCode() + 527) * 31 + this.zzb) * 31 + this.zzc) * 31 + (int)this.zzd) * 31 + this.zze;
  }
  
  public final zzbx zza(Object paramObject)
  {
    if (this.zza.equals(paramObject)) {
      return this;
    }
    return new zzbx(paramObject, this.zzb, this.zzc, this.zzd, this.zze);
  }
  
  public final boolean zzb()
  {
    return this.zzb != -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */