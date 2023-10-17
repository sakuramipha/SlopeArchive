package com.google.android.gms.internal.measurement;

final class zzjn
{
  private final Object zza;
  private final int zzb;
  
  zzjn(Object paramObject, int paramInt)
  {
    this.zza = paramObject;
    this.zzb = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzjn)) {
      return false;
    }
    paramObject = (zzjn)paramObject;
    return (this.zza == ((zzjn)paramObject).zza) && (this.zzb == ((zzjn)paramObject).zzb);
  }
  
  public final int hashCode()
  {
    return System.identityHashCode(this.zza) * 65535 + this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */