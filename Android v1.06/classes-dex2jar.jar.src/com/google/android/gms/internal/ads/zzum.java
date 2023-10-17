package com.google.android.gms.internal.ads;

final class zzum
{
  public final int zza;
  public final boolean zzb;
  
  public zzum(int paramInt, boolean paramBoolean)
  {
    this.zza = paramInt;
    this.zzb = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzum)paramObject;
      if ((this.zza == ((zzum)paramObject).zza) && (this.zzb == ((zzum)paramObject).zzb)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zza * 31 + this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */