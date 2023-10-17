package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;

public final class zzbc
{
  public final String zza;
  public final double zzb;
  public final double zzc;
  public final double zzd;
  public final int zze;
  
  public zzbc(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
  {
    this.zza = paramString;
    this.zzc = paramDouble1;
    this.zzb = paramDouble2;
    this.zzd = paramDouble3;
    this.zze = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzbc)) {
      return false;
    }
    paramObject = (zzbc)paramObject;
    return (Objects.equal(this.zza, ((zzbc)paramObject).zza)) && (this.zzb == ((zzbc)paramObject).zzb) && (this.zzc == ((zzbc)paramObject).zzc) && (this.zze == ((zzbc)paramObject).zze) && (Double.compare(this.zzd, ((zzbc)paramObject).zzd) == 0);
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze) });
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("name", this.zza).add("minBound", Double.valueOf(this.zzc)).add("maxBound", Double.valueOf(this.zzb)).add("percent", Double.valueOf(this.zzd)).add("count", Integer.valueOf(this.zze)).toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\interna\\util\zzbc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */