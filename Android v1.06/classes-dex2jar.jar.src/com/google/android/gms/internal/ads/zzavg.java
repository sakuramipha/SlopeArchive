package com.google.android.gms.internal.ads;

public final class zzavg
{
  final long zza;
  final String zzb;
  final int zzc;
  
  zzavg(long paramLong, String paramString, int paramInt)
  {
    this.zza = paramLong;
    this.zzb = paramString;
    this.zzc = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof zzavg)))
    {
      paramObject = (zzavg)paramObject;
      if ((((zzavg)paramObject).zza == this.zza) && (((zzavg)paramObject).zzc == this.zzc)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (int)this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */