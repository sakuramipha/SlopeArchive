package com.google.android.gms.internal.ads;

final class zzgoh
{
  private final Object zza;
  private final int zzb;
  
  zzgoh(Object paramObject, int paramInt)
  {
    this.zza = paramObject;
    this.zzb = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzgoh)) {
      return false;
    }
    paramObject = (zzgoh)paramObject;
    return (this.zza == ((zzgoh)paramObject).zza) && (this.zzb == ((zzgoh)paramObject).zzb);
  }
  
  public final int hashCode()
  {
    return System.identityHashCode(this.zza) * 65535 + this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgoh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */