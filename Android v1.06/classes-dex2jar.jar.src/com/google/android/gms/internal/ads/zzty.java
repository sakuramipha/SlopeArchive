package com.google.android.gms.internal.ads;

final class zzty
  implements zzwx
{
  private final zzwx zza;
  private final zzcz zzb;
  
  public zzty(zzwx paramzzwx, zzcz paramzzcz)
  {
    this.zza = paramzzwx;
    this.zzb = paramzzcz;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzty)) {
      return false;
    }
    paramObject = (zzty)paramObject;
    return (this.zza.equals(((zzty)paramObject).zza)) && (this.zzb.equals(((zzty)paramObject).zzb));
  }
  
  public final int hashCode()
  {
    return (this.zzb.hashCode() + 527) * 31 + this.zza.hashCode();
  }
  
  public final int zza(int paramInt)
  {
    return this.zza.zza(0);
  }
  
  public final int zzb(int paramInt)
  {
    return this.zza.zzb(paramInt);
  }
  
  public final int zzc()
  {
    return this.zza.zzc();
  }
  
  public final zzam zzd(int paramInt)
  {
    return this.zza.zzd(paramInt);
  }
  
  public final zzcz zze()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */