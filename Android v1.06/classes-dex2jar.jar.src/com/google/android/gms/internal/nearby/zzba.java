package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.Objects;

final class zzba
{
  private final String zza;
  private final long zzb;
  
  zzba(String paramString, long paramLong)
  {
    this.zza = paramString;
    this.zzb = paramLong;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zzba))
    {
      paramObject = (zzba)paramObject;
      if ((Objects.equal(this.zza, ((zzba)paramObject).zza)) && (Objects.equal(Long.valueOf(this.zzb), Long.valueOf(((zzba)paramObject).zzb)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Long.valueOf(this.zzb) });
  }
  
  public final String zza()
  {
    return this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */