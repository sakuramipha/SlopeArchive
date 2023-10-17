package com.google.android.gms.internal.ads;

public final class zzvp
{
  public final long zza;
  public final long zzb;
  
  public zzvp(long paramLong1, long paramLong2)
  {
    this.zza = paramLong1;
    this.zzb = paramLong2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzvp)) {
      return false;
    }
    paramObject = (zzvp)paramObject;
    return (this.zza == ((zzvp)paramObject).zza) && (this.zzb == ((zzvp)paramObject).zzb);
  }
  
  public final int hashCode()
  {
    return (int)this.zza * 31 + (int)this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzvp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */